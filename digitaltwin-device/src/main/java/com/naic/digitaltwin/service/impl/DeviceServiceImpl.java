package com.naic.digitaltwin.service.impl;

import com.naic.digitaltwin.controller.DeviceTypeController;
import com.naic.digitaltwin.entity.po.Device;
import com.naic.digitaltwin.entity.convert.AbstractDeviceCnv;
import com.naic.digitaltwin.entity.vo.DeviceVO;
import com.naic.digitaltwin.mapper.DeviceMapper;
import com.naic.digitaltwin.service.IDeviceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.naic.digitaltwin.service.IDeviceTypeService;
import com.naic.digitaltwin.service.feign.BasicDataFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-29
 */
@Service
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, Device> implements IDeviceService {

    @Resource
    private DeviceMapper deviceMapper;
    @Resource
    private AbstractDeviceCnv cnv;
    @Autowired
    private DeviceTypeController deviceTypeController;
    @Autowired
    private BasicDataFeign basicDataFeign;
    @Override
    public DeviceVO getById(Long id) {
        Device device = deviceMapper.selectById(id);
        DeviceVO deviceVO = cnv.poToVo(device);

        Long deviceTypeId = deviceVO.getDeviceTypeId();
        Long vendorId = deviceVO.getVendorId();
        Long lineId = deviceVO.getLineId();

        Long deviceStatusId = deviceVO.getDeviceStatus();
        String deviceStatusName = "";
        if (deviceStatusId.equals("0"))
        {
            deviceStatusName = "新购买";
        }
        else if (deviceStatusId.equals("1"))
        {
            deviceStatusName = "生产中";
        }
        else if (deviceStatusId.equals("2"))
        {
            deviceStatusName = "待机中";
        }
        else if (deviceStatusId.equals("3"))
        {
            deviceStatusName = "换线中";
        }
        else if (deviceStatusId.equals("4"))
        {
            deviceStatusName = "维修中";
        }
        else if (deviceStatusId.equals("5"))
        {
            deviceStatusName = "已报废";
        }
        else
        {
            deviceStatusName = "故障中";
        }
        deviceVO.setDeviceTypeLabel(deviceTypeController.getDeviceTypeNameById(deviceTypeId));
        deviceVO.setVendorName(basicDataFeign.getVendorNameById(vendorId));
        deviceVO.setLineName(basicDataFeign.getLineNameById(lineId));
        deviceVO.setDeviceStatusName(deviceStatusName);
        return deviceVO;
    }
}

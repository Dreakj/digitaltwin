package com.naic.digitaltwin.service;

import com.naic.digitaltwin.entity.po.Device;
import com.baomidou.mybatisplus.extension.service.IService;
import com.naic.digitaltwin.entity.vo.DeviceVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-29
 */
public interface IDeviceService extends IService<Device> {
    DeviceVO getById(Long id);

}

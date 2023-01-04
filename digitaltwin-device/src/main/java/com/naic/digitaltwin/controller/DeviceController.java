package com.naic.digitaltwin.controller;

import com.naic.digitaltwin.entity.vo.DeviceVO;
import com.naic.digitaltwin.service.IDeviceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 设备 前端控制器
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-29
 */
@Api(tags = "设备管理")
@RestController
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private IDeviceService deviceService;
    @ApiOperation("根据设备ID获取设备信息")
    @GetMapping("{id}")
    public DeviceVO getDeviceInfoById(@PathVariable Long id){
        return deviceService.getById(id);
    }
}

package com.naic.digitaltwin.controller;

import com.naic.digitaltwin.service.IDeviceTypeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 设备类型 前端控制器
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-29
 */
@RestController
@RequestMapping("/deviceType")
public class DeviceTypeController {
    @Autowired
    private IDeviceTypeService deviceTypeService;

    @ApiOperation(value = "通过id获取设备类型名称")
    @PostMapping("{id}")
    public String getDeviceTypeNameById(@PathVariable Long id) {
        return deviceTypeService.getById(id).getDeviceTypeLabel();
    }
}

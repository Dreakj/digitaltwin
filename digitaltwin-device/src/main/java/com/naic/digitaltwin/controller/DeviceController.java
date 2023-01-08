package com.naic.digitaltwin.controller;

import com.naic.commonutils.R;
import com.naic.digitaltwin.entity.vo.DeviceVO;
import com.naic.digitaltwin.service.IDeviceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Line;

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
    public R getDeviceInfoById(@PathVariable Long id){
//        return deviceService.getById(id);
        DeviceVO deviceVOInfo = deviceService.getById(id);
        return R.ok().data("deviceInfo", deviceVOInfo);
    }
    @ApiOperation(value = "修改产线信息")
    @PutMapping("update")
    public R updateById(@RequestBody DeviceVO deviceVO){
        deviceService.updateDeviceInfo(deviceVO);
        return R.ok();
    }
}

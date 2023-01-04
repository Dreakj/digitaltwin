package com.naic.digitaltwin.controller;

import com.naic.digitaltwin.service.IVendorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 供应商 前端控制器
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-29
 */
@RestController
@RequestMapping("/vendor")
public class VendorController {
    @Autowired
    private IVendorService vendorService;

    @ApiOperation(value = "通过id获取供应商名称")
    @GetMapping("{id}")
    public String getVendorNameById(@PathVariable Long id) {
        return vendorService.getById(id).getVendorName();
    }
}

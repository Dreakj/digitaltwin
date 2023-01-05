package com.naic.digitaltwin.controller;

import com.naic.commonutils.R;
import com.naic.digitaltwin.service.ILineService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 产线 前端控制器
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-29
 */
@RestController
@RequestMapping("/line")
public class LineController {
    @Autowired
    private ILineService lineService;

    @ApiOperation(value = "通过id获取产线名称")
    @GetMapping("{id}")
    public String getLineNameById(@PathVariable Long id) {
        String name = lineService.getById(id).getName();
//        return R.ok().data("LineName",name).data();
        return lineService.getById(id).getName();
    }
}

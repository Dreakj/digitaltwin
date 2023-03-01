package com.naic.digitaltwin.controller;

import com.naic.commonutils.Result;
import com.naic.digitaltwin.entity.Line;
import com.naic.digitaltwin.service.ILineService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

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

    @ApiOperation(value = "通过id修改产线名称")
    @PutMapping("updateLineName")
    public Result updateLineName(@RequestParam Long id, @RequestParam String name) {
        Line line = lineService.getById(id);
        line.setName(name);
        line.setUpdateTime(LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.of("UTC+8")));
        lineService.updateById(line);
        return Result.success();
    }

    @ApiOperation(value = "通过id获取产线基本信息")
    @GetMapping("/LineData")
    public Result getLineData() {
        List<Line> lines = lineService.list();
        return Result.success(lines);
    }
}

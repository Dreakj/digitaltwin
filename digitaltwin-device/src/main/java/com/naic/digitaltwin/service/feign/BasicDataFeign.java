package com.naic.digitaltwin.service.feign;

import com.naic.commonutils.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Line;

/**
 * <p>
 * 基础数据 远程访问
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-31
 */
@Component
@FeignClient(value = "digitaltwin-basic-data")
public interface BasicDataFeign {

    @GetMapping("/line/{id}")
    String getLineNameById(@PathVariable("id") Long id);

    @GetMapping("/vendor/{id}")
    String getVendorNameById(@PathVariable("id") Long id);


    @PutMapping("/line/updateLineName")
    public R updateLineName(@RequestParam("id") Long id,@RequestParam("name") String name);

    @PutMapping("/vendor/updateVendorName")
    public R updateVendorNameById(@RequestParam("id") Long id,@RequestParam("name") String name);
}

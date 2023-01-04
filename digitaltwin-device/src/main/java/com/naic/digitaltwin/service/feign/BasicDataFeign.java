package com.naic.digitaltwin.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 基础数据 远程访问
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-31
 */
@FeignClient(value = "digitaltwin-basic-data")
public interface BasicDataFeign {

    @GetMapping("/line/{id}")
    String getLineNameById(@PathVariable Long id);

    @GetMapping("/vendor/{id}")
    String getVendorNameById(@PathVariable Long id);

}

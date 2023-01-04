package com.naic.digitaltwin.entity.convert;

import com.naic.digitaltwin.entity.po.Device;
import com.naic.digitaltwin.entity.vo.DeviceVO;
import org.mapstruct.Mapper;

/**
 * <p>
 * 设备类转换
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-29
 */
@Mapper(componentModel = "spring")
public abstract class AbstractDeviceCnv {
    public abstract DeviceVO poToVo(Device po);
}

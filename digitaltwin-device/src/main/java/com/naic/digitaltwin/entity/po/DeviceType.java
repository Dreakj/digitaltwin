package com.naic.digitaltwin.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 设备类型
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-29
 */
@ApiModel(value = "DeviceType对象", description = "")
@Data
@TableName("device_type")
public class DeviceType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("路径")
    private String path;

    @ApiModelProperty("设备类型名称")
    private String deviceTypeLabel;

    @ApiModelProperty("是否上料")
    private Byte materialFeed;

    @ApiModelProperty("是否备料")
    private Byte materialPreparation;

    @ApiModelProperty("是否扫描站位")
    private Byte scanStation;

    @ApiModelProperty("备注")
    private String remarks;

    @ApiModelProperty("创建人")
    private Long createUser;

    @ApiModelProperty("修改人")
    private Long updateUser;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;
}

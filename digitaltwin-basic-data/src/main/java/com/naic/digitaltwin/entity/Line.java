package com.naic.digitaltwin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 产线
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-29
 */
@ApiModel(value = "Line对象", description = "")
@Data
@TableName("line")
public class Line implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("线别名称")
    private String name;

    @ApiModelProperty("线别设备类型id")
    private Long lineDeviceTypeId;

    @ApiModelProperty("车间id")
    private Long workshopId;

    @ApiModelProperty("上料模式")
    private String materialMode;

    @ApiModelProperty("描述")
    private String comment;

    @ApiModelProperty("创建人")
    private String createUser;

    @ApiModelProperty("开工时刻json")
    private String workingTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;
}

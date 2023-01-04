package com.naic.digitaltwin.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 设备
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-29
 */
@ApiModel(value = "Device对象", description = "")
@Data
@TableName("device")
public class Device implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("序号：自增1，为主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("设备编码")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("设备类型id")
    private Long deviceTypeId;

    @ApiModelProperty("设备型号")
    private String deviceModel;

    @ApiModelProperty("供应商id")
    private Long vendorId;

    @ApiModelProperty("设备存放位置id")
    private Long deviceStorageLocationId;

    @ApiModelProperty("入场日期")
    private LocalDate admissionDate;

    @ApiModelProperty("设备状态：新购买：0；生产中：1；待机中：2；换线：3；维修：4；已报废：5；故障中：6")
    private Long deviceStatus;

    @ApiModelProperty("资产编码")
    private String assetCode;

    @ApiModelProperty("过保日期")
    private LocalDate expiryDate;

    @ApiModelProperty("保修期")
    private String warrantyDate;

    @ApiModelProperty("购置方式")
    private String purchaseMethod;

    @ApiModelProperty("计量单位")
    private String unit;

    @ApiModelProperty("线别id")
    private Long lineId;

    @ApiModelProperty("线别上的数量")
    private String number;

    @ApiModelProperty("部门")
    private String department;

    @ApiModelProperty("保管人")
    private String holdPeople;

    @ApiModelProperty("次数")
    private Long times;

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

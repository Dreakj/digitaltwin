package com.naic.digitaltwin.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * <p>
 * 设备VO
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-31
 */
@ApiModel("设备管理VO")
@Data
public class DeviceVO {
    public static final long serialVersionUID = 1L;
    @ApiModelProperty("自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty("设备编码")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    private String deviceName;
    @ApiModelProperty("设备类型id")
    private Long deviceTypeId;
    @ApiModelProperty(value = "设备类型名称")
    private String deviceTypeLabel;
    @ApiModelProperty("设备型号")
    private String deviceModel;
    @ApiModelProperty("供应商id")
    private Long vendorId;
    @ApiModelProperty("供应商名称")
    private String vendorName;
    @ApiModelProperty("存放位置id")
    private Long deviceStorageLocationId;
    @ApiModelProperty("存放位置")
    private String storageLocation;
    @ApiModelProperty("入场时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date admissionDate;
    @ApiModelProperty("设备状态编号")
    private Long deviceStatus;
    @ApiModelProperty("设备状态名称")
    private String deviceStatusName;
    @ApiModelProperty("资产编码")
    private String assetCode;
    @ApiModelProperty("过保日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expiryDate;
    @ApiModelProperty("保修期")
    private String warrantyDate;
    @ApiModelProperty("购置方式")
    private String purchaseMethod;
    @ApiModelProperty("计量单位")
    private String unit;
    @ApiModelProperty("产线id")
    private Long lineId;
    @ApiModelProperty("产线名称")
    private String lineName;
    @ApiModelProperty("设备在线别中的序号")
    private String number;
    @ApiModelProperty("部门")
    private Long department;
    @ApiModelProperty("保管人")
    private Long holdPeople;
    @ApiModelProperty("使用次数")
    private Long times;
    @ApiModelProperty("备注")
    private String remarks;
    @ApiModelProperty("创建人")
    private String createUser;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("创建时间")
    private Date createTime;
}

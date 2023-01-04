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
 *  供应商
 * </p>
 *
 * @author mengjingyu
 * @since 2022-12-29
 */
@ApiModel(value = "Vendor对象", description = "供应商列表")
@Data
@TableName("vendor")
public class Vendor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("供应商编码")
    private String vendorCode;

    @ApiModelProperty("供应商简称")
    private String vendorShortName;

    @ApiModelProperty("供应商名称")
    private String vendorName;

    @ApiModelProperty("供应商联系人")
    private String vendorContact;

    @ApiModelProperty("供应商电话")
    private String vendorPhone;

    @ApiModelProperty("供应商地址")
    private String vendorAddress;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建人")
    private String createUser;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("mes创建或ERP导入,0表示ERP导入，1表示MES创建")
    private Integer isMesAdd;
}

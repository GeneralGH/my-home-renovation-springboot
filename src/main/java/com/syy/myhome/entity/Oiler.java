package com.syy.myhome.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 油工
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@Getter
@Setter
@ApiModel(value = "Oiler对象", description = "油工")
public class Oiler implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id;id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("项目;项目")
    private String name;

    @ApiModelProperty("描述;描述")
    private String describes;

    @ApiModelProperty("数量;数量")
    private BigDecimal number;

    @ApiModelProperty("计价单位;计价单位")
    private String chargeUnit;

    @ApiModelProperty("材料单价;材料单价")
    private BigDecimal unitPrice;

    @ApiModelProperty("工费;工费")
    private BigDecimal wage;

    @ApiModelProperty("合计;合计")
    private BigDecimal total;

    @ApiModelProperty("备注;备注")
    private String remark;

    @ApiModelProperty("创建时间;创建时间")
    private LocalDateTime createTime;


}

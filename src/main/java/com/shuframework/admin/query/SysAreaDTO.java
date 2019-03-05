package com.shuframework.admin.query;

import java.io.Serializable;
import java.util.Date;

import com.shuframework.commoncore.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 行政区划
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysAreaDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /** 区域编码 */
    private String areaCode;

    /** 父级编号 */
    private String parentCode;

    /** 区域名称(全称) */
    private String areaName;

    /** 区域名称(简称) */
    private String shortName;

    /** 层级  1级 2级 3级 4级 */
    private String levels;

    /** 关联路径(用逗号分隔) */
    private String parentCodePath;

    /** 关联路径名称 */
    private String pathName;

    /** 是否是叶子节点 0 不是 1是 */
    private String isLeaf;

    /** 行政类型 1省 2自治区 3直辖市 4特别行政区 5省会市 6地级市 7区 8县 */
    private String areaType;

    /** 区域类型 1华北 2华东 3东北 4中南 5西南 6西北 7港澳台 */
    private String regionType;

    /** 拼音 */
    private String pinyin;

    /** 简拼 */
    private String jianpin;

    /** 首字母 */
    private String firstChar;

    /** 电话区号 */
    private String phoneAreaCode;

    /** 邮编 */
    private String zipCode;

    /** 经度 */
    private BigDecimal longitude;

    /** 纬度 */
    private BigDecimal latitude;

    /** 排序号 */
    private Integer sortno;

    /** 备注 */
    private String remarks;

    /** 创建人 */
    private String createBy;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    /** 状态, 0禁用 1可用 2删除 */
    private String enabled;


}

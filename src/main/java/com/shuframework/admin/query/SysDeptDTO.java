package com.shuframework.admin.query;

import java.io.Serializable;
import java.util.Date;

import com.shuframework.commoncore.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统表_部门
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysDeptDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 自增长，但不用来关联 */
    private Long id;

    /** 部门编号 */
    private String deptCode;

    /** 部门名称 */
    private String name;

    /** 父编号 */
    private String parentCode;

    /** 层级  1级 2级 3级 4级 */
    private String levels;

    /** 关联路径(用逗号分隔) */
    private String parentCodePath;

    /** 是否是叶子节点 0 不是 1是 */
    private String isLeaf;

    /** 部门类型 */
    private String deptType;

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

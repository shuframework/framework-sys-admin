package com.shuframework.admin.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

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
@TableName("sys_dept")
public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**  自增长，但不用来关联 */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**  部门编号 */
    @TableField("dept_code")
    private String deptCode;

    /**  部门名称 */
    private String name;

    /**  父编号 */
    @TableField("parent_code")
    private String parentCode;

    /**  层级  1级 2级 3级 4级 */
    private String levels;

    /**  关联路径(用逗号分隔) */
    @TableField("parent_code_path")
    private String parentCodePath;

    /**  是否是叶子节点 0 不是 1是 */
    @TableField("is_leaf")
    private String isLeaf;

    /**  部门类型 */
    @TableField("dept_type")
    private String deptType;

    /**  排序号 */
    private Integer sortno;

    /**  备注 */
    private String remarks;

    /**  创建人 */
    @TableField("create_by")
    private String createBy;

    /**  创建时间 */
    @TableField("create_time")
    private Date createTime;

    /**  更新时间 */
    @TableField("update_time")
    private Date updateTime;

    /**  状态, 0禁用 1可用 2删除 */
    private String enabled;



}

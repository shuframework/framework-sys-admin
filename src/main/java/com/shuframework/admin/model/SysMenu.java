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
 * 系统表_菜单
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_menu")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**  菜单名称 */
    private String name;

    /**  父id */
    @TableField("parent_id")
    private Long parentId;

    /**  层级 */
    private String levels;

    /**  请求路径 */
    @TableField("request_url")
    private String requestUrl;

    /**  权限标识 */
    private String permission;

    /**  图标路径 */
    @TableField("icon_url")
    private String iconUrl;

    /**  菜单类型,1模块, 2菜单, 3按钮 */
    @TableField("menu_type")
    private String menuType;

    /**  是否是叶子节点 0 不是 1是 */
    @TableField("is_leaf")
    private String isLeaf;

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

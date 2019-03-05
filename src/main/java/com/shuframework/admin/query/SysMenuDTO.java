package com.shuframework.admin.query;

import java.io.Serializable;
import java.util.Date;

import com.shuframework.commoncore.base.BaseDTO;
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
public class SysMenuDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /** 菜单名称 */
    private String name;

    /** 父id */
    private Long parentId;

    /** 层级 */
    private String levels;

    /** 请求路径 */
    private String requestUrl;

    /** 权限标识 */
    private String permission;

    /** 图标路径 */
    private String iconUrl;

    /** 菜单类型,1模块, 2菜单, 3按钮 */
    private String menuType;

    /** 是否是叶子节点 0 不是 1是 */
    private String isLeaf;

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

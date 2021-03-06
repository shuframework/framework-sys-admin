package com.shuframework.admin.query;

import java.io.Serializable;
import java.util.Date;

import com.shuframework.commoncore.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色_菜单_中间表
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysRoleMenuDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 角色id */
    private Long roleId;

    /** 菜单id */
    private Long menuId;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    /** 状态, 0禁用 1可用 */
    private String enabled;


}

package com.shuframework.admin.query;

import java.io.Serializable;
import java.util.Date;

import com.shuframework.commoncore.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统表_用户
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUserDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /** 登录名 */
    private String loginName;

    /** 名称 */
    private String nickName;

    /** 密码 */
    private String password;

    /** 性别 */
    private String sex;

    /** 头像 */
    private String iconUrl;

    /** 手机号 */
    private String phoneNum;

    /** 备用号 */
    private String phoneNum2;

    /** 电子邮箱 */
    private String email;

    /** 地址 */
    private String address;

    /** 部门id */
    private String deptCode;

    /** 用户类型 */
    private String useType;

    /** 离职时间 */
    private Date leaveTime;

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

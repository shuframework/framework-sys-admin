package com.shuframework.admin.query;

import java.io.Serializable;
import java.util.Date;

import com.shuframework.commoncore.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统表_操作日志表
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysLogDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /** 角色名 */
    private String loginName;

    /** 内容 */
    private String contents;

    /** 客户端ip */
    private String clientIp;

    /** 日志类型 */
    private String logType;

    /** 请求路径 */
    private String requestPath;

    /** 请求参数 */
    private String requestParam;

    /** 操作方式 */
    private String requestMethod;

    /** 是否成功 1 true,  0 false */
    private String flag;

    /** 返回结果 */
    private String responseResult;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;


}

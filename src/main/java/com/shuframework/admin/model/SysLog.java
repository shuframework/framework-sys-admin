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
 * 系统表_操作日志表
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_log")
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**  角色名 */
    @TableField("login_name")
    private String loginName;

    /**  内容 */
    private String contents;

    /**  客户端ip */
    @TableField("client_ip")
    private String clientIp;

    /**  日志类型 */
    @TableField("log_type")
    private String logType;

    /**  请求路径 */
    @TableField("request_path")
    private String requestPath;

    /**  请求参数 */
    @TableField("request_param")
    private String requestParam;

    /**  操作方式 */
    @TableField("request_method")
    private String requestMethod;

    /**  是否成功 1 true,  0 false */
    private String flag;

    /**  返回结果 */
    @TableField("response_result")
    private String responseResult;

    /**  创建时间 */
    @TableField("create_time")
    private Date createTime;

    /**  更新时间 */
    @TableField("update_time")
    private Date updateTime;



}

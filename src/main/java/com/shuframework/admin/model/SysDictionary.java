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
 * 系统表_字典表
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_dictionary")
public class SysDictionary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**  父编码 */
    @TableField("parent_id")
    private Long parentId;

    /**  类型编码 */
    @TableField("type_code")
    private String typeCode;

    /**  显示的文字 */
    @TableField("dict_name")
    private String dictName;

    /**  存的具体值 */
    @TableField("dict_value")
    private String dictValue;

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

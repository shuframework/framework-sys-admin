package com.shuframework.admin.query;

import java.io.Serializable;
import java.util.Date;

import com.shuframework.commoncore.base.BaseDTO;
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
public class SysDictionaryDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /** 父编码 */
    private Long parentId;

    /** 类型编码 */
    private String typeCode;

    /** 显示的文字 */
    private String dictName;

    /** 存的具体值 */
    private String dictValue;

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

package com.lcn.client_two.entity;

/**
 * User
 *
 * @author heng
 * @date 2019/9/7
 **/

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * User
 *
 * @author heng
 * @date 2019/4/11
 **/
@Data
/**
 * @TableName 指定数据库表名
 */
@TableName("User")
public class User {

    /**
     * @TableId 指定主键列名及主键策略方式
     */
    @TableId(value = "id",type = IdType.NONE)
    private Long id;
    /**
     * 姓名
     *@TableField 指定数据库列名
     */
    @TableField
    private String name;

    /**
     * 年龄
     */
    @TableField
    private Integer age;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /** 备注  非数据库字段需要排除
     * 方法一加入transient 不让该变量序列化 不推荐
     *  方法二加入static 但是lombok不会生成get set方法需要自己手动添加 不推荐
     *  方法三  @TableField(exist = false) 默认是true 改为false表示不是数据库字段 推荐
     * */
    @TableField(exist = false)
    private /*static*/  /*transient*/ String remark;
}


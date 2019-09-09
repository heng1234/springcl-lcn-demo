package com.lcn.clientone.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * User
 *
 * @author heng
 * @date 2019/9/7
 **/
@Data
@TableName("t_user")
public class User {

    /** id */
    @TableId(value = "id",type = IdType.NONE)
    private Long id;

    /** email */
    private String email;

    /** password */
    private String password;
}

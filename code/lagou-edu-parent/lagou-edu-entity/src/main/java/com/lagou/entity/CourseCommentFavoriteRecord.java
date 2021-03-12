package com.lagou.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseCommentFavoriteRecord implements Serializable {
    private static final long serialVersionUID = 922554392538715061L;
    /**
    * 主键
    */
    private Object id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
    * 留言id
    */
    private Integer commentId;
    /**
     * 是否删除
     */
    private Object isDel;

    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;



}
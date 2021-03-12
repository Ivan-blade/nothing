package com.lagou.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UploadDTO implements Serializable {

    private boolean success;  // 相应结果
    private int state;  // 操作状态
    private String message;  // 状态描述
}

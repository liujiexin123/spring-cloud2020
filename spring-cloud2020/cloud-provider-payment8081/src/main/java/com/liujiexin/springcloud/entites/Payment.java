package com.liujiexin.springcloud.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName Payment
 *
 * @Description 支付实体类
 * @Author liu jiexin
 * Date 2020/3/17 0017 23:38
 * @Version 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
    private long id;
    private String serial;
}

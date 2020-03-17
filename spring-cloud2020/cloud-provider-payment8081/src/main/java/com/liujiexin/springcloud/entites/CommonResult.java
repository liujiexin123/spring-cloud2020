package com.liujiexin.springcloud.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName CommonResult
 *
 * @Description TODO
 * @Author liu jiexin
 * Date 2020/3/17 0017 23:49
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message)
    {
        this(code, message, null);
    }
}

package com.liujiexin.springcloud.service;

import com.liujiexin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName PaymentService
 *
 * @Description TODO
 * @Author liu jiexin
 * Date 2020/3/23 0023 0:43
 * @Version 1.0
 **/

public interface PaymentService
{
    public int create(Payment payment);

    public  Payment getPaymentById(@Param("id") Long id);

}

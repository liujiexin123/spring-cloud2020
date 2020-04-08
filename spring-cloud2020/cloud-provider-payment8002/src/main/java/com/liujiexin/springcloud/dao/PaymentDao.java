package com.liujiexin.springcloud.dao;

import com.liujiexin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  liujiexin
 * @date 2020-03-23 00:15:00
 */
@Mapper
public interface PaymentDao
{
    public int create(Payment payment);

    public  Payment getPaymentById(@Param("id") Long id);


}

package com.liujiexin.springcloud.service.impl;

import com.liujiexin.springcloud.dao.PaymentDao;
import com.liujiexin.springcloud.entities.Payment;
import com.liujiexin.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName PaymentServiceImpl
 * @Description TODO
 * @Author liu jiexin
 * Date 2020/3/23 0023 0:45
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public  Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }

}

package com.aoppoc.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aoppoc.aop.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         PaymentService paymentService = context.getBean("payment",PaymentService.class);
         paymentService.payment(42700);
    }
}

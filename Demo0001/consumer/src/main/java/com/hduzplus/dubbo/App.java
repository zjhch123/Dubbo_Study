package com.hduzplus.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hduzplus.dubbo.service.OrderService;

public class App {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		OrderService orderService = context.getBean(OrderService.class);
		
		orderService.initOrder();
		System.out.println("Finish");
		System.in.read();
	}
}

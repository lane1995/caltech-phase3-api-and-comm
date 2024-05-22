package com.springaop.DemoApp.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println();
		
		if(method.getName().equals("productPurchase")) {
			System.out.println("[BeforeAdvice] before executed " + method.getName());
			
			
			System.out.println("[BeforeAdvice] - Validating Stock...");
			Product product = (Product) target;
			if(product.getStock() < 0) {
				product.canBuy = false;
				System.out.println("[BeforeAdvice] - We are out of stock for " + product.getName() + "  Please come back later");
			}else {
				product.canBuy = true;
				System.out.println("[BeforeAdvice] - Please initiate a transaction for amount of " + product.getPrice());
			}
			System.out.println();
			
			
		}
		
	}

}

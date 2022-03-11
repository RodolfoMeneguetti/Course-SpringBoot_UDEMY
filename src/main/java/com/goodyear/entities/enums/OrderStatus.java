package com.goodyear.entities.enums;

public enum OrderStatus {
	
	/*  Java por padrão insere valores numericos na posição que é inserido */ 
	
	// sera inserido valores nos enums para que isso ocorra é preciso que seja informado 
	// atraves de um construtor! 

	WAITING_PAYMENT (1),
	PAID (2),
	SHIPPED (3),
	DELIVERED (4),
	CANCELED (5);
	 
	private int code; 
	
	// construtor enum é private 
	private OrderStatus (int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	// para retornar o valor de cada enum
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}

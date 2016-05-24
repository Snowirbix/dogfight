package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {
	
	private int player;
	private Order order;
	
	public void UseOrder(int player, Order order) {
		//	
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	public int getPlayer() {
		return this.player;
	}
}

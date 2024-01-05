package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{

	
	public void up() {
		System.out.println("Pac Jump");
	}
	
	public void down() {
		System.out.println("Pac down");
	}
	
	public void left() {
		System.out.println("Pac Left");
	}
	
	public void right() {
		System.out.println("Pac Right");
	}
}

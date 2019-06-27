package com.SqaureGame.main;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {
	
	
	private static final long serialVersionUID = 6430417874509459483L;

	public static final int WIDTH = 1640, HEIGHT = WIDTH / 12 * 9;
	
	public Game(){
		new Window(WIDTH, HEIGHT, "PatternDoom", this);
	}
	
	
	public synchronized void start(){
		
	}
	
	public void run() {
		
		
	}
	
	public static void main(String[] arg) {
		new Game();
	}


	
	
}

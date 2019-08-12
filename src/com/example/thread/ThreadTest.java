package com.example.thread;


class Apple extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			
			try {
				System.out.println("From Apple :" +i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

class Ornage extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			
			try {
				System.out.println("From Orange :" +i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadTest {
	
	
	public static void main(String[] args) {
		Ornage ornage=new Ornage();
		ornage.start();
		ornage.run();
		Apple apple=new Apple();
		apple.start();
		
		
	}

}

package com.practice;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Thread running");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Question_5 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}

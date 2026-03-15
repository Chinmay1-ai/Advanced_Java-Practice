package com.practice;

class MyTask implements Runnable {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Runnable Thread");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Question_7 {
	public static void main(String[] args) {
		Thread t = new Thread(new MyTask());
		t.start();
	}
}

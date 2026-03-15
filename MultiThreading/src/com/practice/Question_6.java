package com.practice;

class TkaThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class Question_6 {
	public static void main(String[] args) {
		TkaThread t = new TkaThread();
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
	}
} 

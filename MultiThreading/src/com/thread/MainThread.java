package com.thread;

public class MainThread {

	public static void main(String[] args) {

		DemoThread d = new DemoThread();
		d.start();
		d.m1();

	}
}

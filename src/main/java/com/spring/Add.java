package com.spring;

class Add implements Calculator{
	private int age;
	private Sub sub;
	public Add() {
		System.out.println("Constructor of Add class");
	}
	public Add(int n,int m) {
		System.out.println("Constructor of Add class with two parameter");
		System.out.println(n+ " " +m+ " ");
	}
	public void add(int n,int m) {
		System.out.println(n+m);
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void mul(int n, int m ) {
		System.out.println(n*m);
		sub.div(34,2);
	}
	public Sub getSub() {
		return sub;
	}
	public void setSub(Sub sub) {
		this.sub = sub;
	}
	
}

package com.task;
public class ArrayDemo {
	 ClassRoom classRoom[] = new ClassRoom[5];
		public ArrayDemo() {
		for(int i=0; i<classRoom.length;i++)
		{
			classRoom[i] =new ClassRoom("Currently not assigned");
		}
	}
		public static void main(String[] args) {
			ArrayDemo obj = new ArrayDemo();
			System.out.println(obj.classRoom[1].str);
	}
}

class ClassRoom {
	String str;
	public ClassRoom(String str) {
		this.str=str;
	}
}
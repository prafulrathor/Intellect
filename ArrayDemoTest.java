package com.task;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayDemoTest {

	static ArrayDemo obj;
	@Test
	public void test() {
		obj = new ArrayDemo();
		//System.out.println(obj.classRoom[1].str);
		assertEquals(obj.classRoom[1].str,"Currently not assigned");
	}

}

package com.automation.unittesting;

import org.junit.Test;

import com.development.codedevelopment.App;

public class Testing {

	@Test
	public void testing1() {
		App app = new App();
		if(app.test(4, 3)==true)
			System.out.println("its True");
		else
			System.out.println("its False");
	}

}
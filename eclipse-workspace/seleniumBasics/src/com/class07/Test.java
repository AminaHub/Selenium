package com.class07;

import utils.CommonMethods;

public class Test extends CommonMethods{

	public static void main(String[] args) {
	CommonMethods.setUpDriver("firefox", "http://google.com");
	driver.close();

	}

}

package org.test;

import java.util.concurrent.TimeUnit;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		lanchBrowers();
		urlLanuch("https://adactinhotelapp.com/");
		LoginPage l=new LoginPage();
		implicitWait(20, TimeUnit.SECONDS);
		maximize();
	    fillTextBox(l.getTxtusername(),"PavithraPrabhu");
		fillTextBox(l.getTxtpassword(),"prabhu2701");
		jsClick(l.getBtnlogin());
	}

}

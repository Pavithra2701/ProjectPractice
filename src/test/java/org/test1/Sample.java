package org.test1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.test.BaseClass;

public class Sample extends BaseClass{
	public static void main(String[] args) throws IOException {
		lanchBrowers();
		urlLanuch("https://www.flipkart.com/");
		implicitWait(20, TimeUnit.SECONDS);
		LoginFlipkart l=new LoginFlipkart();
		fillTextBox(l.getEmail(),Excel.getData("Sheet1", 4, 2) );
		fillTextBox(l.getPassword(),Excel.getData("Sheet1", 4, 1));
		click(l.getClick());
	}

}

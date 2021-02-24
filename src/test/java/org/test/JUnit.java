package org.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnit extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
    lanchBrowers();
    }
	@AfterClass
	public static void afterlass() {
    quit();
	}
	@Before
	public void before() {
    System.out.println("Test Strat"+new Date());
	}
	@After
	public void after() {
		System.out.println("");
    System.out.println("Test end"+new Date());
	}
	@Test
	public void test() throws InterruptedException {
		urlLanuch("https://adactinhotelapp.com/");
		LoginPage l=new LoginPage();
		implicitWait(20, TimeUnit.SECONDS);
		maximize();
	    fillTextBox(l.getTxtusername(),"PavithraPrabhu");
		fillTextBox(l.getTxtpassword(),"prabhu2701");
		jsClick(l.getBtnlogin());
		selectByVisibeText(l.getDroploc(), "Melbourne");
		ThreadSleep(2000);
		selectByVisibeText(l.getDrophotel(), "Hotel Sunshine");
		selectByVisibeText(l.getDroproomtype(), "Deluxe");
		ThreadSleep(2000);
		selectByVisibeText(l.getDroproomno(),"1 - One");
		fillTextBox(l.getCheckin(), "08/02/2021");
		fillTextBox(l.getCheckout(), "12/02/2021");
		ThreadSleep(2000);
		selectByVisibeText(l.getDroproom(), "1 - One");
		selectByVisibeText(l.getDropcroom(), "0 - None");
		jsClick(l.getSubmit());
		jsClick(l.getClick());
		jsClick(l.getClickcontinue());
		ThreadSleep(2000);
		fillTextBox(l.getFirstname(), "pavithra");
		fillTextBox(l.getLasttname(), "sivakumar");
		fillTextBox(l.getAddress(), "nabsxhgzuyfdhuggfrhxdgysrh");
		fillTextBox(l.getCcnum(), "1234567891234567");
		selectByVisibeText(l.getDropcctype(), "American Express");
		selectByVisibeText(l.getCcmonth(), "April");
		selectByVisibeText(l.getCcyear(), "2021");
		fillTextBox(l.getCcv(), "123");
		jsClick(l.getBooknow());
		String txt = getAttribute(l.getOrder());
		System.out.println(txt);
		
      }

}

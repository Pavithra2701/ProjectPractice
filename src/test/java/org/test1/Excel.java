package org.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.test.BaseClass;

public class Excel {
	public static void main(String[] args) throws IOException {
		String d = getData("Sheet1", 4, 3);
		System.out.println(d);
	}

	public static String getData(String sheetname, int rowno, int cellno) throws IOException {
		FileInputStream ft = new FileInputStream(new File("D:\\Selenium\\A\\src\\test\\resources\\Excel\\Book1.xlsx"));
		Workbook w = new XSSFWorkbook(ft);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		String value = null;
		if (type == 1) {
			value = c.getStringCellValue();
		} else {
			if (DateUtil.isCellDateFormatted(c)) {
				value = new SimpleDateFormat("dd-MMM-yyyy").format(c.getDateCellValue());
			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);
			}
		}
		return value;
	}
}

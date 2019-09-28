package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Com_Utility {
	WebDriver driver;
	
	public Com_Utility(WebDriver driver) {
		this.driver = driver;
	}

	public String ReadExcel(int rownum,int colnum) throws IOException {
		
		FileInputStream fis = new FileInputStream("F:\\EclipsePractice\\PracticeSelenium\\src\\main\\java\\TestData\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sh = workbook.getSheet("Data1");
		Row rw = sh.getRow(rownum);
		Cell cel = rw.getCell(colnum);
		fis.close();
		if(cel.getStringCellValue() != null) {
			return cel.getStringCellValue();
		}else {
			return null;
		}

	}
	
	public void takescrenshot(WebDriver driver,String ScreenshotName) throws IOException {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\EclipsePractice\\PracticeSelenium\\Screenshot\\"+ScreenshotName+".png"));
	}
	
	public void WriteDataInExcel(int rownum, int colnum) throws IOException {
		
		FileInputStream fis = new FileInputStream("F:\\EclipsePractice\\PracticeSelenium\\src\\main\\java\\TestData\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sh = workbook.getSheet("Data1");
		Row rw = sh.getRow(rownum);
		Cell cel = rw.getCell(colnum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		cel.setCellValue("pass");
		FileOutputStream fos = new FileOutputStream("F:\\EclipsePractice\\PracticeSelenium\\src\\main\\java\\TestData\\TestData.xlsx");
		workbook.write(fos);
		fos.close();
		
		
	}
		
}

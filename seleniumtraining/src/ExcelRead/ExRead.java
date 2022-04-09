package ExcelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExRead {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(ExPath.TESTPATH);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		//System.out.println(cell);
		for (Row r : sheet) {
		for (org.apache.poi.ss.usermodel.Cell c : r) {
		System.out.print(c + "       ");
		}
		System.out.println();
		}

		}

		

	
}


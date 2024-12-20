package in.ashokit.beans;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelGeneration {

	public void excelGenerator(List<BookDto> books) throws Exception {

		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();
		XSSFRow headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("bid");
		headerRow.createCell(1).setCellValue("bName");
		headerRow.createCell(2).setCellValue("bPrice");

		int RowIndex = 1;
		for(BookDto b :  books) {
			XSSFRow dataRow = sheet.createRow(RowIndex);
			dataRow.createCell(0).setCellValue(b.getBid());
			dataRow.createCell(1).setCellValue(b.getBName());
			dataRow.createCell(2).setCellValue(b.getBPrice());
			RowIndex++;
		}
		
		File f = new File("Books.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);
		book.close();
		fos.close();
	}

	
	}


package Day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingExcel {

	@Test
	@DataProvider(name="data-provider")
    public Object[][] testData() {
       File src=new File("./Testdata/SapientTestData.xlsx");
       try {
            XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(src));

           int row=wb.getSheet("Sheet1").getPhysicalNumberOfRows();
            int col=wb.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
            
            Object arr[][]=new Object[row][col];
           for(int i=0;i<row;i++) {
                for(int j=0;j<col;j++) {
                    arr[i][j]=wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
                    System.out.println(arr[i][j]);
                }
            }
            return arr;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
        return null;

}
}
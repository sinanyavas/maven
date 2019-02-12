import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class dataDriven {

    public static void main(String[] args) throws IOException {

        // identify "current design" coulumn inside "TEM P01 001 / 00 01" row of "excel" sheet in Temple.xslx file.

        // XSSFWorkbook accepts FileInputStream arguments

        FileInputStream fis = new FileInputStream("/Users/sinanyavas/Desktop/table_sample.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets = workbook.getNumberOfSheets();
        for(int i=0; i<sheets; i++){

            if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")){

                XSSFSheet sheet = workbook.getSheetAt(i);


                Iterator<Row> rows = sheet.iterator();
                Row firstrow = rows.next();


                Iterator<Cell> ce= firstrow.cellIterator();

                int k = 0;
                int column = 0;
                while (ce.hasNext()){
                    Cell value = ce.next();
                    if(value.getStringCellValue().equalsIgnoreCase("Column1"))
                    {
                        column = k;
                    }
                    k++;
                }
                System.out.println(column);

                while (rows.hasNext()){

                    Row r = rows.next();
                    if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Mirza")){
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()){
                            System.out.println(cv.next().getStringCellValue());
                        }

                    }

                }
            }
        }
    }

}

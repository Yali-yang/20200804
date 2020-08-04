package com.example.yali.test;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * @author Yali
 * @date 2020-05-06 21:56:36
 * @description
 **/
@RestController
public class TestController {
    @RequestMapping(value = "test")
    public String test(){
        return "your lie in April";
    }

    @RequestMapping(value = "upload",method = RequestMethod.POST)
    public String testMultiPartFile(@RequestParam(value = "file") MultipartFile file){
        try{
            String originalFilename = file.getOriginalFilename();
            InputStream inputStream = file.getInputStream();
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
//            POIFSFileSystem poifsFileSystem = new POIFSFileSystem(inputStream);
//            HSSFWorkbook workbook = new HSSFWorkbook(poifsFileSystem);
//            HSSFSheet sheet = workbook.getSheetAt(0);
            for (Row cells : sheet) {
                for (Cell cell : cells) {
                    System.out.println(cell.getStringCellValue());
                }
            }
            workbook.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "SUCCESS";
    }


}

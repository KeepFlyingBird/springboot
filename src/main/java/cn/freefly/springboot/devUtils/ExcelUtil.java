package cn.freefly.springboot.devUtils;

import cn.freefly.springboot.entity.BaseRes;
import com.monitorjbl.xlsx.StreamingReader;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassNmae ExcelUtil Excel读取公用方法
 * @Author xiao.yunfei
 * @Date 2020/1/2 13:48
 * @Desc
 */
@Service
public class ExcelUtil {
    /**
     * @Author xiao.yunfei
     * @Date 2020/1/7 20:40
     * @MethodParameters
     *  filePath 文件路径
     *  sheetIdx 第一个sheet
     *  batchNum 批次数
     * @Description
    */
    public BaseRes readExcelFileData(String filePath, int sheetIdx, int batchNum){
        FileInputStream in = null;
        try {
            in = new FileInputStream(filePath);
            Workbook wk = StreamingReader.builder()
                    .rowCacheSize(100)  //缓存到内存中的行数，默认是10
                    .bufferSize(4096)  //读取资源时，缓存到内存的字节大小，默认是1024
                    .open(in);  //打开资源，必须，可以是InputStream或者是File，注意：只能打开XLSX格式的文件
            Sheet sheet = wk.getSheetAt(sheetIdx);
            if(batchNum < 1){
                return BaseRes.fail("批次数不能小于1");
            }
            List<List<Object[]>> list = new ArrayList<>();
            List<Object[]> rowList = new ArrayList<>(batchNum);
            int cellNums = 0 ;
            for (Row row : sheet) {
                if(row.getRowNum() == 0){// 表头
                    cellNums = row.getPhysicalNumberOfCells();
                }
                if(row.getRowNum()>0){
                    Object[] obj = new Object[cellNums];
                    for(int n=0;n<cellNums;n++){
                        Cell cell = row.getCell(n);
                        obj[n] = this.getCellValue(cell);
                    }
                    rowList.add(obj);
                }
                if(row.getRowNum()> 0 && row.getRowNum()%batchNum==0){
                    System.out.println("-------size1="+list.size());
                    list.add(rowList);
                    rowList = new ArrayList<>(batchNum);
                }
            }
            if(rowList.size() > 0){
                list.add(rowList);
            }
            return BaseRes.success(list,"成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return BaseRes.fail("失败");
    }

    public Object getCellValue(Cell cell){
        Object value = new Object();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
        if(cell != null){
            switch (cell.getCellTypeEnum()) {
                case STRING:
                    value = cell.getRichStringCellValue().getString();
                    break;
                case NUMERIC:
                    value = cell.getNumericCellValue();
                    break;
                default:
                    value = cell.toString();
                    break;
            }
        }else{
            value = "";
        }
        return value ;
    }
//    public static void main(String[] args) {
//        String filePath = "E://workSpace//JY//项目//智能决策//智能决策-还款数据1.xlsx";
//        try {
//            readExcelFileData(filePath);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
}

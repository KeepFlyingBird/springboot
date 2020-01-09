package cn.freefly.springboot.controller;

import cn.freefly.springboot.devUtils.ExcelUtil;
import cn.freefly.springboot.entity.BaseRes;
import cn.freefly.springboot.mybatis.entity.TDataZnjcHuanKuan;
import cn.freefly.springboot.mybatis.mapper.TDataZnjcHuanKuanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassNmae ToolTestController
 * @Author xiao.yunfei
 * @Date 2020/1/2 15:42
 * @Desc
 */
@RestController
public class ToolTestController {

    @Autowired
    public TDataZnjcHuanKuanMapper tDataZnjcHuanKuanMapper;
    /**
     * @Author xiao.yunfei
     * @Date 2020/1/7 20:47
     * @MethodParameters
     * @Description 测试Excel
    */
    @RequestMapping("/excelInsert")
    public void excelInsertTest() {
        ExcelUtil excelUtil = new ExcelUtil();
        String filePath = "E://workSpace//JY//项目//智能决策//智能决策-还款数据22.xlsx";
        BaseRes baseRes = excelUtil.readExcelFileData(filePath,0,20000);
        if(baseRes.isFlag()){
            List<List<Object[]>> dataList = (List<List<Object[]>>) baseRes.getResData();
            dataList.forEach(list->{
                List<TDataZnjcHuanKuan> tkList = new ArrayList<>();
                list.forEach(item->{
                    TDataZnjcHuanKuan tk = new TDataZnjcHuanKuan();
                    tk.setProjectId((int) Double.parseDouble(item[1]+""));
                    tk.setPaylistCode(item[2].toString());
                    tk.setBeginningReceiveData(item[3].toString());
                    tk.setRealityTime("".equals(item[4]) ?"":item[4]+"");
                    tk.setBeginningNum((int) Double.parseDouble(item[5]+""));
                    tk.setYhBenjin(Double.parseDouble("".equals(item[6]) ?"0":item[6]+""));
                    tk.setYhLixi(Double.parseDouble("".equals(item[7]) ?"0":item[7]+""));
                    tk.setPenaltyPaid(Double.parseDouble("".equals(item[8]) ?"0":item[8]+""));
                    tk.setYsBenjin(Double.parseDouble("".equals(item[9]) ?"0":item[9]+""));
                    tk.setYsLixi(Double.parseDouble(item[10]+""));
                    tk.setPenaltyRece(Double.parseDouble("".equals(item[11]) ?"0":item[11]+""));
                    System.out.println(tk.getYhBenjin()+","+tk.getYhLixi()+","+tk.getPenaltyPaid()+","+tk.getYsBenjin()+","+tk.getYsLixi()+","+tk.getPenaltyRece());
                    tkList.add(tk);
                });
                System.out.println("----------size="+tkList.size());
                tDataZnjcHuanKuanMapper.insertObjListBatch(tkList);
            });
            System.out.println("-------end---------");
        }
    }

}

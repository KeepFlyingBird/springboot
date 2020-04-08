package cn.freefly.springboot.controller;

import cn.freefly.springboot.async.service.AsyncService;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassNmae AsyncController
 * @Author xiao.yunfei
 * @Date 2019/11/24 16:50
 * @Desc
 */
@RestController
@RequestMapping("/async")
@Slf4j
public class AsyncController {

    // 注入异步服务接口
    @Autowired
    private AsyncService asyncService = null;
    @GetMapping("/test")
    public String asyncTest(){
        log.info("--------异步执行=");
        System.out.println("--Controller请求线程名称："+"【"+Thread.currentThread().getName()+"】");
        // 调用异步服务
        asyncService.testAsync();
        return "--Test--async==";
    }

    public static void main(String[] args) {
        String jsonStr = "{\n" +
                "    \"carBuyer\":{\n" +
                "        \"addressCity\":\"北京市\",\n" +
                "        \"addressCounty\":\"朝阳区\",\n" +
                "        \"addressDetail\":\"桥洞子222122\",\n" +
                "        \"addressProvince\":\"北京市\",\n" +
                "        \"age\":27,\n" +
                "        \"educationCode\":\"10\",\n" +
                "        \"health\":\"1\",\n" +
                "        \"insuredAddress\":\"辽宁\",\n" +
                "        \"isMarry\":\"2\",\n" +
                "        \"liaisons\":[\n" +
                "            {\n" +
                "                \"mobile\":\"18232667760\",\n" +
                "                \"name\":\"阿西吧\",\n" +
                "                \"relation\":\"5\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"liveStatus\":\"2\",\n" +
                "        \"marriage\":\"1\",\n" +
                "        \"nature\":{\n" +
                "            \"appliWorkName\":\"000101\",\n" +
                "            \"entryUnitTime\":\"2017-10-24\",\n" +
                "            \"houseStat\":\"11\",\n" +
                "            \"incomeSource\":\"02\",\n" +
                "            \"industry\":\"A\",\n" +
                "            \"jobRemark\":\"无\",\n" +
                "            \"jobTitle\":\"1\",\n" +
                "            \"position\":\"高级领导\",\n" +
                "            \"proofAssets\":\"1\",\n" +
                "            \"regionalCode\":\"110105\",\n" +
                "            \"selfMonthIncome\":30000,\n" +
                "            \"socialSecurity\":\"1\",\n" +
                "            \"totalWorkYears\":\"2\",\n" +
                "            \"uint\":\"建元资本（中国）融资租赁\",\n" +
                "            \"unitAddress\":\"北京市东直门南大街1号来福士中心办公楼22层\",\n" +
                "            \"unitAddressCity\":\"北京市\",\n" +
                "            \"unitAddressCounty\":\"东城区\",\n" +
                "            \"unitAddressProvince\":\"北京市\",\n" +
                "            \"unitCode\":\"010\",\n" +
                "            \"unitPhoneNumber\":\"010-50867125\",\n" +
                "            \"unitProperty\":\"7\"\n" +
                "        },\n" +
                "        \"phoneNumber\":\"0476-8190123\",\n" +
                "        \"postAddress\":\"桥洞子222122\",\n" +
                "        \"postCode\":\"010262\",\n" +
                "        \"residenceCode\":\"0476\"\n" +
                "    },\n" +
                "    \"main\":{\n" +
                "        \"vehicleType\":\"1\"\n" +
                "    },\n" +
                "    \"orderId\":\"5db1a6fb31fc7b18c95fe105\",\n" +
                "\t\"bbb\":\"\",\n" +
                "\t\"aaa\":\"null\"\n" +
                "}";
        JSONObject jsStr = JSONObject.parseObject(jsonStr);
        jsStr.entrySet().stream().forEach(item->{
            System.out.println(item.getKey()+" : "+item.getValue());

            if(item.getValue() instanceof Map){
                System.out.println("------map");
            }else if(item.getValue() instanceof List){
                System.out.println("------list");
            }else{
                if(Objects.isNull(item.getValue()) || "".equals(item.getValue()) || "null".equals(item.getValue())){

                }else{
                    System.out.println("------not null+"+item.getKey());
                }
            }
        });
        System.out.println("-----------jsStr="+jsStr);
    }
}

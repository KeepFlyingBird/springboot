package cn.freefly.springboot.controller;

import cn.freefly.springboot.async.service.AsyncService;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

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
        String jsonStr = "{\"aaa\":\"null\",\"bbb\":\"\",\"orderId\":\"5db1a6fb31fc7b18c95fe105\",\"main\":{ \"vehicleType\":\"\"},\"carBuyer\":{\"addressProvince\":\"北京市\",\"nature\":{\"unitAddressCity\":\"北京市\",\"proofAssets\":\"1\",\"unitAddressCounty\":\"东城区\",\"unitProperty\":\"7\",\"jobTitle\":\"1\",\"houseStat\":\"11\",\"totalWorkYears\":\"2\",\"industry\":\"A\",\"unitAddressProvince\":\"北京市\",\"uint\":\"建元资本（中国）融资租赁\",\"unitPhoneNumber\":\"010-50867125\",\"unitAddress\":\"北京市东直门南大街1号来福士中心办公楼22层\",\"regionalCode\":\"110105\",\"selfMonthIncome\":30000,\"jobRemark\":\"无\",\"unitCode\":\"010\",\"incomeSource\":\"02\",\"position\":\"高级领导\",\"socialSecurity\":\"1\",\"appliWorkName\":\"000101\",\"entryUnitTime\":\"2017-10-24\"},\"postAddress\":\"桥洞子222122\",\"health\":\"1\",\"educationCode\":\"10\",\"isMarry\":\"2\",\"addressCounty\":\"朝阳区\",\"addressDetail\":\"桥洞子222122\",\"phoneNumber\":\"0476-8190123\",\"liaisons\":[{\n" +
                "\t\t\t   \"mobile\":\"\",\n" +
                "\t\t\t   \"name\":\"\",\n" +
                "\t\t\t   \"relation\":\"\"\n" +
                "\t\t   },{\n" +
                "\t\t\t   \"relation\":\"\"\n" +
                "\t\t   }],\"marriage\":\"1\",\"postCode\":\"010262\",\"residenceCode\":\"0476\",\"insuredAddress\":\"辽宁\",\"age\":27,\"liveStatus\":\"2\",\"addressCity\":\"北京市\"}}";
        JSONObject srcJson = JSONObject.parseObject(jsonStr);
        JSONObject destJson = JSONObject.parseObject(jsonStr);
        System.out.println("-----srcJson="+srcJson);
        jsonStrFilterNullValue(srcJson,destJson);
        System.out.println("-----destJson="+jsonStrFilterNullValue(srcJson,destJson));
    }

    public static JSONObject jsonStrFilterNullValue(JSONObject srcJson,JSONObject destStr ){
        srcJson.entrySet().stream().forEach(item->{
//            System.out.println(item.getKey()+" : "+item.getValue());
            if(item.getValue() instanceof Map){
                Map mapObj = (Map) item.getValue();
                if(Objects.isNull(mapObj) || mapObj.size() == 0){
                    destStr.remove(item.getKey());
                }else{
                    JSONObject jsonObject = jsonStrFilterNullValue(JSONObject.parseObject(mapObj.toString()), JSONObject.parseObject(mapObj.toString()));
                    if(Objects.isNull(jsonObject) || jsonObject.size() == 0){
                        destStr.remove(item.getKey());
                    }else{
                        destStr.put(item.getKey(),jsonObject);
                    }
                }
            }else if(item.getValue() instanceof List){
                List list = (List) item.getValue();
                if(CollectionUtils.isEmpty(list)){
                    destStr.remove(item.getKey());
                }else{
                    List resultList = new ArrayList();
                    for (int i=0;i<list.size();i++){
                        Object itemL = list.get(i);
                        JSONObject jsonL = jsonStrFilterNullValue(JSONObject.parseObject(itemL.toString()),JSONObject.parseObject(itemL.toString()));
                        if(jsonL.size()>0){
                            resultList.add(jsonL);
                        }
                    }
                    if(CollectionUtils.isEmpty(resultList) || resultList.size() == 0){
                        destStr.remove(item.getKey());
                    }else{
                        destStr.put(item.getKey(),resultList);
                    }
                }
            }else{
                if(Objects.isNull(item.getValue()) || "".equals(item.getValue()) || "null".equals(item.getValue())){
                    destStr.remove(item.getKey());
                }
            }
        });
        return destStr;
    }
}

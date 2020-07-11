package cn.freefly.springboot.devUtils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassNmae JsonRemoveNullUtil
 * @Author xiao.yunfei JSON字符串去除"" 或者 null 属性字段
 * @Date 2020/4/9 15:31
 * @Desc
 */
public class JsonRemoveNullUtil {
    public static JSONObject jsonStrFilterNullValue(String jsonStr){
        JSONObject srcJsonObj = JSONObject.parseObject(jsonStr);
        JSONObject destJsonObj = JSONObject.parseObject(jsonStr);
        srcJsonObj.entrySet().stream().forEach(item->{
//            System.out.println(item.getKey()+" : "+item.getValue());
            if(item.getValue() instanceof Map){
                Map mapObj = (Map) item.getValue();
                if(Objects.isNull(mapObj) || mapObj.size() == 0){
                    destJsonObj.remove(item.getKey());
                }else{
                    JSONObject jsonObject = jsonStrFilterNullValue(mapObj.toString());
                    if(Objects.isNull(jsonObject) || jsonObject.size() == 0){
                        destJsonObj.remove(item.getKey());
                    }else{
                        destJsonObj.put(item.getKey(),jsonObject);
                    }
                }
            }else if(item.getValue() instanceof List){
                List list = (List) item.getValue();
                if(CollectionUtils.isEmpty(list)){
                    destJsonObj.remove(item.getKey());
                }else{
                    List resultList = new ArrayList();
                    for (int i=0;i<list.size();i++){
                        Object itemL = list.get(i);
                        JSONObject jsonL = jsonStrFilterNullValue(itemL.toString());
                        if(jsonL.size()>0){
                            resultList.add(jsonL);
                        }
                    }
                    if(CollectionUtils.isEmpty(resultList) || resultList.size() == 0){
                        destJsonObj.remove(item.getKey());
                    }else{
                        destJsonObj.put(item.getKey(),resultList);
                    }
                }
            }else{
                if(Objects.isNull(item.getValue()) || "".equals(item.getValue()) || "null".equals(item.getValue())){
                    destJsonObj.remove(item.getKey());
                }
            }
        });
        return destJsonObj;
    }
}

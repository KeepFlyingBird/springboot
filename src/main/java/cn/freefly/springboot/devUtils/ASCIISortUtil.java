package cn.freefly.springboot.devUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ASCIISortUtil {
    /**
     * @Author: xiao.yunfei
     * @Description: Map对象ASCII排序 由小到大
     * 知识点：1、map遍历；2、Arrays.sort 排序
     * @Date: 18:52 2020/4/6
     * @Param: [map]
     * @Return: java.lang.String
     */
    public String ASCIISortMap(Map<String,Object> map){
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {// map遍历
            if (entry.getValue() != "") {
                if (entry.getValue() instanceof String) {
                    list.add(entry.getKey() + "=" + entry.getValue() + "&");
                } else {
                    list.add(entry.getKey() + "=" + JsonUtil.toJson(entry.getValue()) + "&");
                }
            }
        }
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);//ASCII排序 忽略字符大小写
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        return result;
    }
}

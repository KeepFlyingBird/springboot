package cn.freefly.springboot.httpClientUtil.util;

/**
 * @ClassNmae UniquenessFlagUnits
 * @Description 唯一性标示
 * @Author houjianhui
 * @Date 2020/2/25 14:31
 * @Version 1.0
 **/
public class UniquenessFlagUnits {
    /**
     * @param prifix 前缀
     * @return
     * @Title: generateUniquenessFlag
     * @Description: 根据前缀生成唯一性标示
     * @return: String
     */
    public static String generateUniquenessFlag(String prifix) {
        IdSnowFlake id = new IdSnowFlake();
        return String.valueOf(prifix + id.getId());
    }
}

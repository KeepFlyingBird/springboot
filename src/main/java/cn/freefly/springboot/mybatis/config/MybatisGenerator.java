package cn.freefly.springboot.mybatis.config;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassNmae MybatisGenerator
 * @Author xiao.yunfei
 * @Date 2019/12/25 19:37
 * @Desc
 */
public class MybatisGenerator {
    public static void main(String[] args) throws Exception {
//        File configFile = new File("/Users/hongye/idea/git/jianyuan/paapi/src/main/resources/plugin/generatorConfig.xml");
        File configFile = new File("E:\\workSpace\\IDEA\\workSpace\\springboot\\src\\main\\resources\\plugin\\generatorConfig.xml");
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}


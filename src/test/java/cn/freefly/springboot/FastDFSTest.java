package cn.freefly.springboot;

import cn.freefly.springboot.fastDFS.util.FastDFSClientUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.nio.charset.Charset;

/**
 * @ClassNmae FastDFSTest
 * @Author xiao.yunfei
 * @Date 2020/4/7 11:02
 * @Desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FastDFSTest {
    @Autowired
    public FastDFSClientUtil fastDFSClient;

    @Test
    public void uploadFileTest() {
        String fileKey = fastDFSClient.uploadFile(new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\1465076a76294dd53f8bfd4f821fd5c.jpg"));
        String accessUrl = fastDFSClient.transferToPreviewUrl(fileKey);
        System.out.println("========>file key: " + fileKey);
        System.out.println("========>Access URL: " + accessUrl);
    }

    @Test
    public void downloadFileTest() {

        byte[] content = fastDFSClient.download("g1/M00/00/00/CgABIl0J_IWANAdEAAACVndJc0059.java");
        System.out.println("========>Download Content:\n" + new String(content, Charset.forName("UTF-8")));
        System.out.println("Deleting files:");

    }
}

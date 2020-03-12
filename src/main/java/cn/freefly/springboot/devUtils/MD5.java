package cn.freefly.springboot.devUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	
	//生成文件的MD5
    public static String getFileMD5(File file) throws FileNotFoundException {
        BigInteger bigInt = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] buffer = new byte[1024];
            int length = -1;
            while ((length = fis.read(buffer, 0, 1024)) != -1) {
                md.update(buffer, 0, length);
            }
            fis.close();
            bigInt = new BigInteger(1, md.digest());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bigInt.toString(16);
    }
    
    //生成 字符串（报文内容）的MD5
    public static String getContentMD5(String Content) {
    	StringBuilder sb = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bs = md.digest(Content.getBytes("UTF-8"));
            sb = new StringBuilder(40);
            for (byte x : bs) {
                if ((x & 0xff) >> 4 == 0) {
                    sb.append("0").append(Integer.toHexString(x & 0xff));
                } else {
                    sb.append(Integer.toHexString(x & 0xff));
                }
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
        return sb.toString();
    }
    
    //获取MD5文件的内容
    public static String readToString(File file) {  
		String str =null;
        try {
			BufferedReader bufferedReader =new BufferedReader(new FileReader(file));
			str=bufferedReader.readLine();
		} catch (IOException  e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
        return str;
    }

}

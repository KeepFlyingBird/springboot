package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CacmpGjBusinessInfo implements Serializable {
    private String id;

    private String orderId;

    private String busiPeriods;

    private String luduanbaisFic;

    private String xiaoqunameFic;

    private String biaozjianzhuFic;

    private String danyuanFic;

    private String loucenghaoFic;

    private String huhaoFic;

    private String kaimenzhaoFic;

    private String xieguiFic;

    private String ketingFic;

    private String cufangFic;

    private String bingxiangFic;

    private String fantingFic;

    private String weishengjianFic;

    private String yangtaiFic;

    private String woshiFic;

    private String zhuzhaiOtherFic;

    private String jiafangyuangongzhudairenFic;

    private String dwLuduanbiaosFic;

    private String dwLoupanFic;

    private String dwBiaozhijianzhuFic;

    private String dwDanyuanFic;

    private String dwLoucenghaoFic;

    private String dwHuhaoFic;

    private String dwKaimenzhaoFic;

    private String dwBejingFic;

    private String dwYingyezhihzhaoFic;

    private String dwMenmianFic;

    private String dwOfficeFic;

    private String dwShebeiFic;

    private String dwCangkuFic;

    private String dwOther;

    private String jiafangyuangongzhudairen2Fic;

    private String productSeriesId;

    private Date createTime;

    private String repaymentType;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}
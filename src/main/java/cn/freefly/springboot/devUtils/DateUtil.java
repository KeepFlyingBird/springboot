package cn.freefly.springboot.devUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassNmae DateUtil
 * @Author xiao.yunfei
 * @Date 2020/3/5 21:56
 * @Desc
 */
public class DateUtil {
    public static final String Ymd = "yyyyMMdd";
    public static final String YmdHms = "yyyyMMdd HH:mi:ss";
    public static final String formlessYmdHms = "yyyyMMddHHmiss";
    public static final String SlashYmd = "yyyy/MM/dd";
    public static final String SlashYmdHms = "yyyy/MM/dd HH:mi:ss";
    public static final String horizontalYmd = "yyyy-MM-dd";
    public static final String horizontalYmdHms = "yyyy-MM-dd HH:mi:ss";

    /**
     * 获取SimpleDateFormat
     * @param parttern 日期格式
     * @return SimpleDateFormat对象
     * @throws RuntimeException 异常：非法日期格式
     */
    public static SimpleDateFormat getDateFormat(String parttern) throws RuntimeException {
        return new SimpleDateFormat(parttern);
    }
    /**
     * @Author xiao.yunfei
     * @Date 2020/3/5 22:14
     * @MethodParameters
     * @Description 日期转字符串 格式：yyyyMMdd
     */
    public static String dateToYmdStr(Date date) {
        String dateToYmdStr = null;
        if (date != null) {
            try {
                dateToYmdStr = getDateFormat(Ymd).format(date);
            } catch (Exception e) {
            }
        }
        return dateToYmdStr;
    }
    /**
     * @Author xiao.yunfei
     * @Date 2020/3/5 22:14
     * @MethodParameters
     * @Description 日期转字符串 格式：yyyyMMdd hh:mi:ss
     */
    public static String dateToFormlessYmdHmsStr(Date date) {
        String dateToFormlessYmdHmsStr = null;
        if (date != null) {
            try {
                dateToFormlessYmdHmsStr = getDateFormat(formlessYmdHms).format(date);
            } catch (Exception e) {
            }
        }
        return dateToFormlessYmdHmsStr;
    }
    /**
     * @Author xiao.yunfei
     * @Date 2020/3/5 22:14
     * @MethodParameters
     * @Description 日期转字符串 格式：yyyyMMdd hh:mi:ss
     */
    public static String dateToYmdHmsStr(Date date) {
        String dateToYmdHmsStr = null;
        if (date != null) {
            try {
                dateToYmdHmsStr = getDateFormat(YmdHms).format(date);
            } catch (Exception e) {
            }
        }
        return dateToYmdHmsStr;
    }
    /**
     * @Author xiao.yunfei
     * @Date 2020/3/5 22:14
     * @MethodParameters
     * @Description 日期转字符串 格式：yyyy/MM/dd
     */
    public static String dateToSlashYmdStr(Date date) {
        String dateToSlashYmdStr = null;
        if (date != null) {
            try {
                dateToSlashYmdStr = getDateFormat(SlashYmd).format(date);
            } catch (Exception e) {
            }
        }
        return dateToSlashYmdStr;
    }
    /**
     * @Author xiao.yunfei
     * @Date 2020/3/5 22:14
     * @MethodParameters
     * @Description 日期转字符串 格式：yyyy/MM/dd hh:mi:ss
     */
    public static String dateToSlashYmdHmsStr(Date date) {
        String dateToSlashYmdHmsStr = null;
        if (date != null) {
            try {
                dateToSlashYmdHmsStr = getDateFormat(SlashYmdHms).format(date);
            } catch (Exception e) {
            }
        }
        return dateToSlashYmdHmsStr;
    }

    /**
     * @Author xiao.yunfei
     * @Date 2020/3/5 22:14
     * @MethodParameters
     * @Description 日期转字符串 格式：yyyy-MM-dd
     */
    public static String dateTohorizontalYmdStr(Date date) {
        String dateTohorizontalYmdStr = null;
        if (date != null) {
            try {
                dateTohorizontalYmdStr = getDateFormat(horizontalYmd).format(date);
            } catch (Exception e) {
            }
        }
        return dateTohorizontalYmdStr;
    }
    /**
     * @Author xiao.yunfei
     * @Date 2020/3/5 22:14
     * @MethodParameters
     * @Description 日期转字符串 格式：yyyy-MM-dd hh:mi:ss
     */
    public static String dateTohorizontalYmdHmsStr(Date date) {
        String dateTohorizontalYmdHmsStr = null;
        if (date != null) {
            try {
                dateTohorizontalYmdHmsStr = getDateFormat(horizontalYmdHms).format(date);
            } catch (Exception e) {
            }
        }
        return dateTohorizontalYmdHmsStr;
    }

    /**
     * @Author xiao.yunfei
     * @Date 2020/3/5 22:14
     * @MethodParameters
     * @Description 当前日期转字符串 格式：yyyy/MM/dd hh:mi:ss
     */
    public static Date getCurTimeSlashYmdHms() {
        try {
            return getDateFormat(SlashYmdHms).parse(dateToSlashYmdHmsStr(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @Author xiao.yunfei
     * @Date 2020/3/5 22:14
     * @MethodParameters
     * @Description 当前日期转字符串 格式：yyyy-MM-dd hh:mi:ss
     */
    public static Date getCurTimehorizontalYmdHms() {
        try {
            return getDateFormat(horizontalYmdHms).parse(dateTohorizontalYmdHmsStr(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取昨天yyyy/MM/dd时间格式
     */
    public static String getYesterdaySlashYmd() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        return getDateFormat(SlashYmd).format(calendar.getTime());
    }
}

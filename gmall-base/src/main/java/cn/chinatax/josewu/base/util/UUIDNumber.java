package cn.chinatax.josewu.base.util;


import java.text.SimpleDateFormat;
/**
 * 获取20位随机数
 * 4位年份+13位时间戳+3位随机数
 * @author yuyu
 */
public class UUIDNumber {
    public static void main(String[] args) {
        //调用生成id方法
        //System.out.println(getGuid());
        short  shortId = (short) Integer.parseInt(UUIDNumber.getShortGuid());

        System.out.println(shortId);
    }

    /**
     * 20位末尾的数字id
     */
    public static volatile  int Guid=100;

    public static String getGuid() {

        UUIDNumber.Guid+=1;

        long now = System.currentTimeMillis();
        //获取4位年份数字
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy");
        //获取时间戳
        String time=dateFormat.format(now);
        String info=now+"";
        //获取三位随机数
        //int ran=(int) ((Math.random()*9+1)*100);
        //要是一段时间内的数据连过大会有重复的情况，所以做以下修改
        int ran=0;
        if(UUIDNumber.Guid>999){
            UUIDNumber.Guid=100;
        }
        ran=UUIDNumber.Guid;

        return time+info.substring(2, info.length())+ran;
    }

    public static String getShortGuid() {

        UUIDNumber.Guid+=1;

        long now = System.currentTimeMillis();
        //获取4位年份数字
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy");
        //获取时间戳
        String time=dateFormat.format(now);
        String info=now+"";
        //获取三位随机数
        //int ran=(int) ((Math.random()*9+1)*100);
        //要是一段时间内的数据连过大会有重复的情况，所以做以下修改
        int ran=0;
        if(UUIDNumber.Guid>999){
            UUIDNumber.Guid=100;
        }
        ran=UUIDNumber.Guid;
        /*
        System.out.println(info);
        System.out.println(info.length());


        System.out.println(returnValue);

         */
        String returnValue = info.substring(0, info.length()-11)+ran;
        return returnValue;
    }
}
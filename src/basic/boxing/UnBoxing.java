package advanced.boxing;

/**
 * @author ：caihuaxin
 * @version ：JDK1.8
 * @description：拆箱
 * @date ：2022/12/15 15:32
 * @month_name ：12月
 */
public class UnBoxing {
    public void unBoxingInteger(){
        Integer i = 20;
        int a=i;//自动拆箱
        int b=i.intValue();//手动拆箱
    }
    public void unBoxingLong(){
        Long i = 20L;
        long a=i;//自动拆箱
        long b=i.longValue();//手动拆箱
    }
    public void unBoxingFloat(){
        Float i = 20F;
        float a=i;//自动拆箱
        float b=i.floatValue();//手动拆箱
    }
    public void unBoxingDouble(){
        Double i = 20D;
        double a=i;//自动拆箱
        double b=i.doubleValue();//手动拆箱
    }
    public void unBoxingShort(){
        Short i = 20;
        short a=i;//自动拆箱
        short b=i.shortValue();//手动拆箱
    }

    public void unBoxingByte() {
        Byte i = 20;
        byte a = i;//自动拆箱
        byte b = i.byteValue();//手动拆箱
    }

    public void unBoxingCharacter() {
        Character i = 'a';
        char a = i;//自动拆箱
        char b = i.charValue();//手动拆箱
    }

    public void unBoxingBoolean() {
        Boolean i = true;
        boolean a = i;//自动拆箱
        boolean b = i.booleanValue();//手动拆箱
    }
}

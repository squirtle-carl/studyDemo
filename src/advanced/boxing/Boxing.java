package advanced.boxing;


/**
 * @author ：caihuaxin
 * @version ：JDK1.8
 * @description：装箱
 * @date ：2022/12/15 15:15
 * @month_name ：12月
 */
public class Boxing {
    /**
     * 装箱
     */
    public void boxingInteger() {
        int i=10;
        //装箱
        Integer w=new Integer(i);
        Integer integer = Integer.valueOf(i);
        //自动装箱
        Integer e=i;
    }

    public void boxingLong() {
        long l = 10L;
        //装箱
        Long w = new Long(l);
        Long long_ = Long.valueOf(l);
        //自动装箱
        Long e = l;
    }

    public void boxingFloat() {
        float f = 10.13f;
        //装箱
        Float w = new Float(f);
        Float float_ = Float.valueOf(f);
        //自动装箱
        Float e = f;
    }
    public void boxingDouble() {
        double d = 10.30;
        //装箱
        Double w = new Double(d);
        Double double_ = Double.valueOf(d);
        //自动装箱
        Double e = d;
    }
    public void boxingBoolean() {
        boolean b = true;
        //装箱
        Boolean w = new Boolean(b);
        Boolean boolean_ = Boolean.valueOf(b);
        //自动装箱
        Boolean e = b;
    }
    public void boxingCharacter() {
        char c = 'a';
        //装箱
        Character w = new Character(c);
        Character character = Character.valueOf(c);
        //自动装箱
        Character e = c;
    }
    public void boxingByte() {
        byte b = 10;
        //装箱
        Byte w = new Byte(b);
        Byte byte_ = Byte.valueOf(b);
        //自动装箱
        Byte e = b;
    }
    public void boxingShort() {
        short s = 10;
        //装箱
        Short w = new Short(s);
        Short short_ = Short.valueOf(s);
        //自动装箱
        Short e = s;
    }
}

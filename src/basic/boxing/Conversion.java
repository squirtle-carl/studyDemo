package advanced.boxing;

/**
 * @author ：caihuaxin
 * @version ：JDK1.8
 * @description：包装类涉及到的转换
 * @date ：2022/12/15 15:52
 * @month_name ：12月
 */
public class Conversion {
    public void stringConversionBase(){
        String str="true";
        Character[] c = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i]=str.charAt(i);
            System.out.println(c[i]);
        }
        Integer i=50;
        Integer.toString(i);
    }

    public void test(){
        Integer i = 300;
        Integer j = 300;
        if (i.intValue() == j.intValue()) {
            System.out.println("i==j");
        }
    }
}

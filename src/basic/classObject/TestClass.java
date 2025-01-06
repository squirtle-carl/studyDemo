package basic.classObject;

/**
 * @author ：caihuaxin
 * @version ：JDK1.8
 * @description：Class对象测试类
 * @date ：2022/12/26 14:12
 * @month_name ：12月
 */
public class TestClass {
    private int a;
    private int b;

    /**
     * 有参构造
     * @param a
     * @param b
     */
    public TestClass(int a,int b){
        a=this.a;
        b=this.b;
        System.out.println("--构造函数--");
    }


    /**
     * 无参构造
     */
    public TestClass(){}

    static{
        System.out.println("--静态代码块--");
    }

    {
        System.out.println("--非静态代码块--");
    }
}

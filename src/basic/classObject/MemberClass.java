package basic.classObject;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ：caihuaxin
 * @version ：JDK1.8
 * @description：成员信息获取类
 * @date ：2023/1/6 10:26
 * @month_name ：1月
 */
public class MemberClass extends SuperClass{
    private String name;

    private String sex;

    public String description;

    public MemberClass(String name, String sex){

    }

    public class InnerClass{
        private String inner;
        public InnerClass(String inner){

        }
    }
    public static void sleep(){
        System.out.println("static sleep()");
    }
    public int age;

    public void show(){
        System.out.println("void show()");
    }

    public int show(int age){
        return age;
    }

    private String privateInfo(String name, String sex){
        return name+sex;
    }
}

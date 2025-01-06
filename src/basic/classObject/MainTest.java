package basic.classObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/**
 * @author ：caihuaxin
 * @version ：JDK1.8
 * @description：测试Class类
 * @date ：2023/1/5 15:53
 * @month_name ：1月
 */
@SuppressWarnings("all")
public class MainTest {
    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println(short.class.getName());

        System.out.println(void.class.getName());

        System.out.println(String.class.getName());

        System.out.println("================================================");

        long[][] test = new long[5][5];
        System.out.println(test.getClass().getName());

        int[][] testInt = new int[5][5];
        System.out.println(testInt.getClass().getName());

        byte[] testByte = new byte[5];
        System.out.println(testByte.getClass().getName());

        String[] testString = new String[5];
        System.out.println(testString.getClass().getName());

        Object[][] testObject = new Object[5][5];
        System.out.println(testObject.getClass().getName());

        TypeVariable<Class<ArrayList>>[] typeParameters = ArrayList.class.getTypeParameters();
        System.out.println(typeParameters[0]);
        Type genericSuperclass = String.class.getGenericSuperclass();
        Type[] genericInterfaces = ArrayList.class.getGenericInterfaces();
        System.out.println(genericSuperclass);
        for (Type type : genericInterfaces){
            System.out.println(type);
        }
        System.out.println("================================================");
        Type[] genericInterfaces1 = ArrayList.class.getInterfaces();
        for (Type type : genericInterfaces1){
            System.out.println(type);
        }
        String typeName = testInt.getClass().getTypeName();
        System.out.println(typeName);

        Method[] methods = MemberClass.class.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("================================================");
        Constructor<?>[] constructors = MemberClass.class.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        Method init = MemberClass.class.getMethod("show",int.class);
        System.out.println(init);

        Constructor<MemberClass.InnerClass> constructor = MemberClass.InnerClass.class.getConstructor(MemberClass.class,String.class);
        System.out.println(constructor);
    }

}

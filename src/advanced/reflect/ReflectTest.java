package advanced.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ReflectTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Type type = list.getClass().getGenericSuperclass();
        if (type instanceof ParameterizedType parameterizedType) {
            Type[] typeArguments = parameterizedType.getActualTypeArguments();
            for (Type typeArg : typeArguments) {
                System.out.println("Type Argument: " + typeArg.getTypeName());
            }
        }
    }
}

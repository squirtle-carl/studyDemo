package basic;

import java.lang.reflect.Field;

public final class FinalClass {
    private final int data;

    public FinalClass(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public static void main(String[] args) throws Exception {
        FinalClass obj = new FinalClass(42);

        System.out.println("Final class data: " + obj.getData());

        Field data1 = FinalClass.class.getDeclaredField("data");
        data1.setAccessible(true);

        data1.set(obj, 100);
        System.out.println("Modified final class data: " + obj.getData());
    }
}

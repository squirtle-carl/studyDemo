package advanced.reflect;

import java.io.Serializable;

public record RecordTest(int lo, int hi) implements Serializable {
    public static void main(String[] args) {
        RecordTest recordTest = new RecordTest(1, 2);
        System.out.println(recordTest);
    }
}

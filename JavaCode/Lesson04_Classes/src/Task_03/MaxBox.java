package Task_03;

/**
 * Created by Admin on 5/5/2015.
 */
public class MaxBox {
    final int MAX_VALUE = 1024;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = Math.min(Math.max(this.value, value), MAX_VALUE);
    }
}

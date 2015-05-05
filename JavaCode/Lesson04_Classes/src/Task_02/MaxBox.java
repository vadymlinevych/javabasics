package Task_02;


public class MaxBox {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = Math.max(this.value, value);
    }
}

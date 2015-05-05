package Task_04;

public class MaxBox {
    final int MAX_VALUE = 1024;
    private int value;

    private MaxBox() {
    }

    static public MaxBox newInstance() {
        return new MaxBox();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = Math.min(Math.max(this.value, value), MAX_VALUE);
    }
}

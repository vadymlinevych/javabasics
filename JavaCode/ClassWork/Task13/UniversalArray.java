/**
 * Created by Admin on 4/2/2015.
 */
public class  UniversalArray <T> {

    T[] arr;

    public UniversalArray(T[] arr) {
        this.arr = arr;
    }

    public T getElementOfArr(int index) {
        return this.arr[index];
    }

    public void setElementOfArr(int index, T value) {
        this.arr[index] = value;
    }

    public static void main(String[] args) {

        int index = 0;

        Integer[] arInt = new Integer[2];
        String[] arString = new String[2];

        UniversalArray<Integer> myArrayInt = new UniversalArray<Integer>(arInt);
        myArrayInt.setElementOfArr(index, 11);
        System.out.println(myArrayInt.getElementOfArr(index));

        UniversalArray<String> myArrayString = new UniversalArray<String>(arString);
        myArrayString.setElementOfArr(index, "1F1");
        System.out.println(myArrayString.getElementOfArr(index));

    }



}

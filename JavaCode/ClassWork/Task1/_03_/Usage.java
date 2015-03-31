package _03_;

/**
 * Created by Admin on 3/5/2015.
 */
public class Usage {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(3, 2);

        System.out.println(r.getSquare());
        //------------------
        int n = 10;
        while  (n-- > 0)  {
            new Counter();
        }

        System.out.println(Counter.count);
        //------------------

        Car myCar = new Car();
        myCar.on();
        myCar.go(60);
        myCar.off();

    }
}

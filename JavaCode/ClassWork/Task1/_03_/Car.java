package _03_;

/**
 * Created by Admin on 3/5/2015.
 */
public class Car {
    private int V;

    public void on(){
        System.out.println("Motor on");
    }

    public void go(int V) {
       this.V = V;
        System.out.println("The spead is = " + V);
    }

    public void off(){
        System.out.println("Motor off");
    }

}

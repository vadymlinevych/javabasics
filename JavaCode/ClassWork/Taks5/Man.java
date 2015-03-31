/**
 * Created by Admin on 3/17/2015.
 */
public class Man implements Cloneable{

    private int weigth;
    private int heigth;

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "weigth = " + weigth + ", heigth = " + heigth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Man)) return false;

        Man man = (Man) o;

        if (heigth != man.heigth) return false;
        if (weigth != man.weigth) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = weigth;
        result = 31 * result + heigth;
        return result;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Man man1 = new Man();
        man1.setHeigth(10);
        man1.setWeigth(5);

        System.out.println(man1.toString());

        System.out.println("Man 1 hashCode = " + man1.hashCode());

        Man man2 = (Man)man1.clone();

        System.out.println("Man 2 hashCode = " + man2.hashCode());

        System.out.println("Equal = " + man1.equals(man2));


    }
}

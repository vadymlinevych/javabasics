package Task_01_02_03;

import java.io.Serializable;


/*
    1 .Добавить в класс «человек» константы: пол, темперамент.
    2. Реализовать возможность сериализации для класса «человек».
*/
public class Man implements Serializable {

    private static final long serialVersionUID = 1L;

    private Sex sex;
    private Temperament temperament;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Man)) return false;

        Man man = (Man) o;

        if (sex != man.sex) return false;
        if (temperament != man.temperament) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Man{" +
                "sex=" + sex +
                ", temperament=" + temperament +
                '}';
    }

    @Override
    public int hashCode() {
        int result = sex.hashCode();
        result = 31 * result + temperament.hashCode();
        return result;
    }

    public Sex getSex() {
        return sex;
    }

    public Temperament getTemperament() {
        return temperament;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setTemperament(Temperament temperament) {
        this.temperament = temperament;
    }
}


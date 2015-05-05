package Task_09;

/**
 9. Описать класс «Vector3D» (т.е. он должен описывать вектор в 3-х мерной, декартовой системе координат).
 В качестве свойств этого класса возьмите координаты вектора.
 Для этого класса реализовать методы сложения, и скалярного и векторного произведения векторов.
 Создайте несколько объектов этого класса и протестируйте их.
 */
public class Demo {

    public static void main(String args[]) {

        Vector3D v1 = new Vector3D(10, 20, 30);
        Vector3D v2 = new Vector3D(30, 20, 10);

        System.out.println(Vector3D.sum(v1, v2).toString());

        System.out.println(Vector3D.scalarSum(v1, v2));

        System.out.println(Vector3D.vectorSum(v1, v2).toString());
        
    }
}
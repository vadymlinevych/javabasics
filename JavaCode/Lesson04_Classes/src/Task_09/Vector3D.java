package Task_09;


public class Vector3D {
    int x, y, z;

    @Override
    public String toString() {
        return "Vector3D {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    static Vector3D sum(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    static int scalarSum(Vector3D v1, Vector3D v2) {
       return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    }

    static Vector3D vectorSum(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.y * v2.z - v1.z * v2.y, v1.z * v2.x - v1.x * v2.z, v1.x * v2.y - v1.y * v2.x);
    }
}

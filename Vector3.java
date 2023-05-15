package vector3;

public class Vector3 {
    private int[] vector;

    public Vector3(int x, int y, int z) {
        vector = new int[3];
        vector[0] = x;
        vector[1] = y;
        vector[2] = z;
    }

    public int[] getVector() {
        return vector;
    }

    // Metode perkalian vektor dengan skalar
    public Vector3 scalarMultiplication(int scalar) {
        int x = vector[0] * scalar;
        int y = vector[1] * scalar;
        int z = vector[2] * scalar;
        return new Vector3(x, y, z);
    }

    // Metode perkalian vektor dengan vektor
    public Vector3 vectorMultiplication(Vector3 otherVector) {
        int x = vector[0] * otherVector.vector[0];
        int y = vector[1] * otherVector.vector[1];
        int z = vector[2] * otherVector.vector[2];
        return new Vector3(x, y, z);
    }
    
    // Metode penjumlahan hasil perkalian vektor dengan vektor
    public int tambah(Vector3 otherVector) {
    int tambah = vector[0] * otherVector.vector[0]
                   + vector[1] * otherVector.vector[1]
                   + vector[2] * otherVector.vector[2];
    return tambah;
    }


    public static void main(String[] args) {
        Vector3 vector1 = new Vector3(1, 2, 3);
        Vector3 vector2 = new Vector3(4, 5, 6);

        // Perkalian vektor dengan skalar
        int scalar = 5;
        Vector3 scalarResult = vector1.scalarMultiplication(scalar);
        System.out.println("Perkalian vektor dengan skalar:");
        System.out.println("Vector1: (" + vector1.getVector()[0] + ", " + vector1.getVector()[1] + ", " + vector1.getVector()[2] + ")");
        System.out.println("Scalar: " + scalar);
        System.out.println("Result: (" + scalarResult.getVector()[0] + ", " + scalarResult.getVector()[1] + ", " + scalarResult.getVector()[2] + ")");
        System.out.println();

        // Perkalian vektor dengan vektor
        Vector3 vectorResult = vector1.vectorMultiplication(vector2);
        System.out.println("Perkalian vektor dengan vektor:");
        System.out.println("Vector1: (" + vector1.getVector()[0] + ", " + vector1.getVector()[1] + ", " + vector1.getVector()[2] + ")");
        System.out.println("Vector2: (" + vector2.getVector()[0] + ", " + vector2.getVector()[1] + ", " + vector2.getVector()[2] + ")");
        System.out.println("Result: (" + vectorResult.getVector()[0] + ", " + vectorResult.getVector()[1] + ", " + vectorResult.getVector()[2] + ")");
       
        // Perhitungan penjumlahan
        int tambah = vector1.tambah(vector2);
        System.out.println("Final Result: " + tambah);
    }
}


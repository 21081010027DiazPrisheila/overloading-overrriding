package grandparent;

public class Grandparent {
    public Grandparent() {
        System.out.println("Selamat datang di silsilah Samosir");
    }
    public void EyeColor() {
        System.out.println("Warna Mata : Biru");
    }
    public void Height () {
        System.out.println("Tinggi Badan : Tinggi");
    }
    public void Hair() {
        System.out.println("Rambut : Ikal");
    }

    public static void main(String[] args) {
        Grandparent a = new Grandparent();
        a.EyeColor();
        a.Height();
        a.Hair();
        Parent b = new Parent();
        b.EyeColor();
        b.Height();
        b.Hair();
        b.SkinColor();
        Child c = new Child();
        c.EyeColor();
        c.Height();
        c.Hair();
        c.SkinColor();
        c.Disease();
        Grandchild d = new Grandchild();
        d.EyeColor();
        d.Height();
        d.Hair();
        d.SkinColor();
        d.Disease();
    }
}
class Parent extends Grandparent {
    public Parent() {
        super();
        System.out.println("Saya adalah keturunan keluarga Samosir");
    }
    public void EyeColor() {
        System.out.println("Warna Mata : Coklat");
    }
    public void SkinColor() {
        System.out.println("Warna Kulit : Sawo Matang");
    }
}
class Child extends Parent {
    public void SkinColor() {
        System.out.println("Warna Kulit : Putih Pucat");
    }
    public void Disease() {
        System.out.println("Riwayat Penyakit : Jantung");
    }
}
class Grandchild extends Child {
    public void Hair() {
        System.out.println("Rambut : Keriting");
    }
    public void EyeColor() {
        System.out.println("Warna Mata : Biru");
    }
}
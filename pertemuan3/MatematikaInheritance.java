package pertemuan3;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2();

        System.out.println("Hasil Tambah  = " + mtk.tambah(20, 10));
        System.out.println("Hasil Kurang  = " + mtk.kurang(10, 5));
        System.out.println("Hasil Kali    = " + mtk.kali(10, 3));
        System.out.println("Hasil Bagi    = " + mtk.bagi(21, 2));
        System.out.println("Hasil Modulus = " + mtk.modulus(21, 2));
    }
}


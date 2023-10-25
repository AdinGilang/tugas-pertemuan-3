package Tugas2;

public class MatematikaBeraksi {
    public static void main(String[]args){
        Matematika mtk =  new Matematika();
        mtk.tambah(20, 10);
        mtk.kurang(10, 5);
        mtk.kali(10, 3);
        mtk.bagi(21, 2);
        
   
        System.out.println("pertambahan 20+10 = "+mtk.tambah(20, 10));
        System.out.println("pengurangan 10-5 = "+mtk.kurang (10, 5));
        System.out.println("perkalian 10*3 = "+mtk.kali (10, 3));
        System.out.println("pembagian 21/2 ="+mtk.bagi(21,2));
 
        
    }
    
}

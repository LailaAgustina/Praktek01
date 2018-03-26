/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Laila Agustina
 */
public class TasAksi {
    public static void main(String[] args) {
        Tas A = new Tas();
        Tas B = new Tas();
        Tas C = new Tas();
        
        A.ukuran="36cm x 27cm x 10cm";
        A.merk="zara chain";
        A.model="tas selempang";
        A.bahan="beludru";
        A.warna="hitam";
        
        B.ukuran="30cm x 12cm x 45cm";
        B.merk="jeansport";
        B.model="tas sekolah";
        B.bahan="cordura";
        B.warna="merah";
        
        
        C.ukuran="37cm x 27cm x 14cm";
        C.merk="alexsa";
        C.model="tas selempangh";
        C.bahan="rajut";
        C.warna="coklat bata";
        
        A.cetakInfo();
        System.out.println();
        B.cetakInfo();
        System.out.println();
        C.cetakInfo();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postest_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
        // TODO code application logic here

/**
 *
 * @author Hp
 */

class RSS{
//Tipe Data
   private int Id;
   private int Jumlah;
   private String jenis;
   private String Barang;
   private int harga;
//Nama Variabel
   RSS(int Id,int Jumlah, String jenis, String Barang, int harga){
      this.Id = Id;
      this.Jumlah = Jumlah;
      this.jenis = jenis;
      this.Barang = Barang;
      this.harga = harga;
   }
   public int getId(){
      return Id;
   }
   public int getjumlah(){
      return Jumlah;
   }
   public int getHarga(){
      return harga;
   }
   public String getJenis(){
      return jenis;
   }
   public String getBarang(){
      return Barang;
   }


   public String toString(){
      return Id+" "+Jumlah+" "+jenis+" "+Barang+" "+harga;
   }
}
public class Postest_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List<RSS> prt = new ArrayList<RSS>();
      Scanner Intr = new Scanner(System.in);
      Scanner Str = new Scanner(System.in);
      int pilih;
      do{
         System.out.println("|----- Rextor Speed Shop -----|");
         System.out.println("| [1] Lihat Data              |");
         System.out.println("| [2] Tambah Data             |");
         System.out.println("| [3] Hapus Data              |");
         System.out.println("| [4] Perbarui Data           |");
         System.out.println("| [5] Keluar                  |");
         System.out.println("+-----------------------------+");
         System.out.print("Pilih Menu : ");
         pilih = Intr.nextInt();
         System.out.print("\n");

         switch(pilih){
            case 1:

            //Lihat data
               Iterator<RSS> i = prt.iterator();
               System.out.println("|---------Stok Spare Part--------|");
               for (RSS b : prt) {
                   System.out.println(" ");
                   System.out.println("\tID Bara       : " + b.getId());
                   System.out.println("\tJumlah Barang : " + b.getjumlah());
                   System.out.println("\tNama Barang   : " + b.getBarang());
                   System.out.println("\tMerk Barang   : " + b.getJenis());
                   System.out.println("\tHarga Barang  : " + b.getHarga());
               }
               System.out.println("+--------------------------------+\n");
            break;
            
            case 2:
            //Tambah Data 
               System.out.print("Masukkan ID Barang     : "); int ID = Intr.nextInt();
               System.out.print("Masukkan Jumlah Barang : "); int jumlah = Intr.nextInt();
               System.out.print("Masukkan Nama Barang   : "); String Barang = Str.nextLine();
               System.out.print("Masukkan Merk Barang   : "); String Jenis = Str.nextLine();
               System.out.print("Masukkan harga         : "); int harga = Intr.nextInt();
               prt.add(new RSS(ID,jumlah,Barang,Jenis,harga));
            break;
            
            case 0:
               boolean found = false;
               System.out.print("Masukkan ID :");
               int Id = Intr.nextInt();
               System.out.println("+--------------------------+");
               i = prt.iterator();
               while(i.hasNext()){
                  RSS e = i.next();
                  if(e.getId() == Id)  {
                     System.out.println(e);
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Data tidak ditemukan\n");
               }
               System.out.println("+--------------------------+\n");
            break;

            case 3:
            //Hapus Data 
               found = false;
                    System.out.print("Masukkan ID data yang ingin dihapus :");
               Id = Intr.nextInt();
                    System.out.println("+--------------------------+");
               i = prt.iterator();
               while(i.hasNext()){
                  RSS e = i.next();
                  if(e.getId() == Id)  {
                     i.remove();
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Data tidak ditemukan\n");
               }else{
                  System.out.println("\tData berhasil dihapus...!\n");
               }

               System.out.println("+--------------------------+\n");
            break;
            
            case 4:
            //Update data
               found = false;
                    System.out.print("Masukkan ID data yang akan diperbarui :");
               Id = Intr.nextInt();
               
               ListIterator<RSS>li = prt.listIterator();
               while(li.hasNext()){
                  RSS e = li.next();
                  if(e.getId() == Id)  {
                     System.out.print("Masukkan Nama Barang Baru    : ");
                        Barang = Str.nextLine();
                     System.out.print("Masukkan Merk Baru : ");
                        Jenis = Str.nextLine();
                     System.out.print("Masukkan Jumlah Baru : ");
                        jumlah = Intr.nextInt();
                     System.out.print("Masukkan Harga Baru : ");
                        harga = Intr.nextInt();
                     
                     li.set(new RSS(Id,jumlah,Barang,Jenis,harga));
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Data tidak ditemukan");
               }else{
                  System.out.println("Data berhasil diperbarui...!\n");
               }
               break;
            
            default:
              System.out.println("Terima kasih Telah Berkunjung");
              System.out.println("\tSelamat Beraktivitas");
            break;   
         }
      }while(pilih!=5);
    }
    
}

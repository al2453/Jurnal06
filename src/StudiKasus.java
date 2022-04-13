import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class StudiKasus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        listMahasiswa.add(new Mahasiswa("001", "Thoriq", "D3RPLA 4504"));
        listMahasiswa.add(new Mahasiswa("002", "Hakim", "D3RPLA 4504"));

        cetakList(listMahasiswa);
        System.out.println("Masukkan NIM : ");
        String nim = in.nextLine();
        Mahasiswa hasil = cariMahasiswa(listMahasiswa, nim);
        System.out.println(hasil);
    }
    private static void cetakList(ArrayList<Mahasiswa> arrayList){
        for (Mahasiswa mahasiswa:arrayList) {
            System.out.println(mahasiswa);
        }
        System.out.println();
    }
    private static Mahasiswa cariMahasiswa(ArrayList<Mahasiswa> list, String nim){
        Mahasiswa hasil;
        Collections.sort(list);
        int index = Collections.binarySearch(list,new Mahasiswa(nim,null,null));
        hasil = list.get(index);
        return hasil;
    }
}

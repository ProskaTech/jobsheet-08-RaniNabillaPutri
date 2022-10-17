//created by 21343034_Rani Nabilla Putri
import javax.swing.JOptionPane;

public class Job8Tugas2_NomorTerbesar {
    public static void main (String[]args) {
        int[] a = new int[11];
        String[] n = new String[11];
        int nomorTerbesar = 0;
        for(int i =1; i+1 <= a.length; i++) {
            System.out.println(i);
            n[i] = JOptionPane.showInputDialog("Masukkan Angka ke-"+i+": ");
            a[i] = Integer.parseInt(n[i]);
            if(nomorTerbesar > a[i]) {
                if(nomorTerbesar > a[i]) {
                    nomorTerbesar = nomorTerbesar;
                    System.out.println(nomorTerbesar);
                }
            }
            else {
                if(a[i] > a[i-1]) {
                    nomorTerbesar = a[i];
                }
                else {
                    nomorTerbesar = a[i-1];
                }
                System.out.println(nomorTerbesar);
            }
        }
        String hasil = "Nomor Terbesar adalah "+nomorTerbesar;
        JOptionPane.showMessageDialog(null,hasil);
    }
}
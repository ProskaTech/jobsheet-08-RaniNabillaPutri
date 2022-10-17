//created by 21343034_Rani Nabilla Putri
public class Job8Tugas3_BukuAlamat {
    public static void main(String[] args) {
        String alamat[][] = {{"Florence", "735-1234", "Manila"}, {"Joyce", "983-3333", "Quezon City"}, {"Becca", "456-3322", "Manila"}};
        int i=0;
        do{
            System.out.println("Name    :" + alamat[i][0] );
            System.out.println("Tel. #  :" + alamat[i][1] );
            System.out.println("Address :" + alamat[i][2] );
            System.out.println("");
            i++;
        }
        while (i<3);
    }
}

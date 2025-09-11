
java FormRegistrasi
import java.util.Scanner;
public class FormRegistrasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== FORM REGISTRASI ===");

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Email: ");
        String email = input.nextLine();

        System.out.println("Pilih Status Pekerjaan:");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Karyawan");
        System.out.println("3. Freelancer");
        System.out.print("Pilihan (1/2/3): ");
        int pilihan = input.nextInt();
        input.nextLine(); // membersihkan buffer

        String status;
        switch (pilihan) {
            case 1:
                status = "Mahasiswa";
                break;
            case 2:
                status = "Karyawan";
                break;
            case 3:
                status = "Freelancer";
                break;
            default:
                status = "Tidak diketahui";
        }

        System.out.print("Masukkan Password: ");
        String password = input.nextLine();

        System.out.print("Masukkan Ulang Password: ");
        String repassword = input.nextLine();

        if (!password.equals(repassword)) {
            System.out.println("⚠️ Password tidak cocok! Registrasi gagal.");
        } else {
            System.out.println("\n✅ Data berhasil disimpan!");
            System.out.println("Nama   : " + nama);
            System.out.println("NIM    : " + nim);
            System.out.println("Email  : " + email);
            System.out.println("Status : " + status);
        }

        input.close();
    }
}


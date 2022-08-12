import java.io.IOException;
import java.util.Scanner;

public class KalkulatorLuasDanVolume {
    public static void header(){
        System.out.println("==============================================");
        System.out.println("          KALKULATOR LUAS DAN VOLUME          ");
        System.out.println("==============================================");
        System.out.println("             by M. Fauzan Yasykur             ");
        System.out.println("______________________________________________");
    }

    public static void main(String[] args) throws IOException {
        BangunDatar bangunDatar = new BangunDatar();
        BangunRuang bangunRuang = new BangunRuang();
        Scanner input = new Scanner(System.in);
        char konfirm = ' ';

        MainMenu:
        do {
            header();
            System.out.println(" 1. KALKULATOR LUAS");
            System.out.println(" 2. KALKULATOR VOLUME");
            System.out.println(" 0. KELUAR");
            System.out.println("");
            System.out.print(" Pilih: ");
            int pilih = input.nextInt();
            System.out.println("");

            //1. KALKULATOR LUAS
            if (pilih == 1){
                header();
                System.out.println("== KALKULATOR LUAS ==");
                System.out.println(" 1. Luas BANGUN DATAR");
                System.out.println(" 2. Luas BANGUN RUANG");
                System.out.println(" 3. KE MENU UTAMA");
                System.out.println(" 0. KELUAR");
                System.out.println("");
                System.out.print(" Pilih: ");
                int pilihan = input.nextInt();
                System.out.println("");

                //1. Luas BANGUN DATAR
                if (pilihan == 1){
                    header();
                    System.out.println("== LUAS BANGUN DATAR ==");
                    System.out.println(" 1. PERSEGI");
                    System.out.println(" 2. PERSEGI PANJANG");
                    System.out.println(" 3. SEGITIGA");
                    System.out.println(" 4. TRAPESIUM");
                    System.out.println(" 5. JAJAR GENJANG");
                    System.out.println(" 6. BELAH KETUPAT");
                    System.out.println(" 7. LAYANG-LAYANG");
                    System.out.println(" 8. LINGKARAN");
                    System.out.println(" 9. KE MENU UTAMA");
                    System.out.println(" 0. KELUAR");
                    System.out.println("");
                    System.out.print(" Pilih: ");
                    int opsi = input.nextInt();
                    System.out.println("");

                    switch (opsi){
                        case 1:
                            header();
                            System.out.println("== Luas PERSEGI ==");
                            System.out.print(" Masukkan sisi (s): ");
                            bangunDatar.sisi = input.nextFloat();
                            System.out.println(" Hasil: " + bangunDatar.luasPersegi());
                            break;

                        case 2:
                            header();
                            System.out.println("== Luas PERSEGI PANJANG ==");
                            System.out.print(" Masukkan panjang (p): ");
                            bangunDatar.panjang = input.nextFloat();
                            System.out.print(" Masukkan lebar (l)  : ");
                            bangunDatar.lebar = input.nextFloat();
                            System.out.println(" Hasil: " + bangunDatar.luasPersegiPanjang());
                            break;

                        case 3:
                            header();
                            System.out.println("== Luas SEGITIGA ==");
                            System.out.print(" Masukkan alas (a)  : ");
                            bangunDatar.alas = input.nextFloat();
                            System.out.print(" Masukkan tinggi (t): ");
                            bangunDatar.tinggi = input.nextFloat();
                            System.out.println(" Hasil: " + bangunDatar.luasLingkaran());
                            break;

                        case 4:
                            header();
                            System.out.println("== Luas TRAPESIUM ==");
                            System.out.print(" Masukkan sisi a    : ");
                            bangunDatar.alas = input.nextFloat();
                            System.out.print(" Masukkan sisi b    : ");
                            bangunDatar.sisi = input.nextFloat();
                            System.out.print(" Masukkan tinggi (t): ");
                            bangunDatar.tinggi = input.nextFloat();
                            System.out.println(" Hasil: " + bangunDatar.luasTrapesium());
                            break;

                        case 5:
                            header();
                            System.out.println("== Luas JAJAR GENJANG ==");
                            System.out.print(" Masukkan alas (a)  : ");
                            bangunDatar.alas = input.nextFloat();
                            System.out.print(" Masukkan tinggi (t): ");
                            bangunDatar.tinggi = input.nextFloat();
                            System.out.println(" Hasil: " + bangunDatar.luasJajarGenjang());
                            break;

                        case 6:
                            header();
                            System.out.println("== Luas BELAH KETUPAT ==");
                            System.out.print(" Masukkan diagoanl 1: ");
                            bangunDatar.sisi = input.nextFloat();
                            System.out.print(" Masukkan diagonal 2: ");
                            bangunDatar.alas = input.nextFloat();
                            System.out.println(" Hasil: " + bangunDatar.luasBelahKetupat());
                            break;

                        case 7:
                            header();
                            System.out.println("== Luas LAYANG-LAYANG ==");
                            System.out.print(" Masukkan diagoanl 1: ");
                            bangunDatar.sisi = input.nextFloat();
                            System.out.print(" Masukkan diagonal 2: ");
                            bangunDatar.alas = input.nextFloat();
                            System.out.println(" Hasil: " + bangunDatar.luasLayangLayang());
                            break;

                        case 8:
                            header();
                            System.out.println("== Luas LINGKARAN ==");
                            System.out.print(" Masukkan jari-jari (r): ");
                            bangunDatar.jariJari = input.nextFloat();
                            System.out.println(" Hasil: " + bangunDatar.luasLingkaran());
                            break;

                        case 9:
                            continue MainMenu;

                        case 0:
                            System.out.print("Yakin ingin keluar? (y/n): ");
                            konfirm = input.next().charAt(0);

                        default:
                            System.out.println("Pilihan tidak ada!");
                    }
                }
                //2. Luas BANGUN RUANG
                else if (pilihan == 2){
                    header();
                    System.out.println("== LUAS PERMUKAAN BANGUN RUANG ==");
                    System.out.println(" 1. KUBUS");
                    System.out.println(" 2. BALOK");
                    System.out.println(" 3. PRISMA SEGITIGA");
                    System.out.println(" 4. LIMAS SEGITIGA");
                    System.out.println(" 5. KERUCUT");
                    System.out.println(" 6. TABUNG");
                    System.out.println(" 7. BOLA");
                    System.out.println(" 8. KE MENU UTAMA");
                    System.out.println(" 0. KELUAR");
                    System.out.println("");
                    System.out.print(" Pilih: ");
                    int opsi = input.nextInt();
                    System.out.println("");

                    switch (opsi){
                        case 1:
                            header();
                            System.out.println("== LUAS PERMUKAAN KUBUS ==");
                            System.out.print(" Masukkan panjang sisi (s): ");
                            bangunRuang.sisi = input.nextFloat();
                            System.out.println(" Hasil: " + bangunRuang.luasPermukaanKubus());
                            break;

                        case 2:
                            header();
                            System.out.println("== LUAS PERMUKAAN BALOK ==");
                            System.out.print(" Masukkan panjang (p): ");
                            bangunRuang.panjang = input.nextFloat();
                            System.out.print(" Masukkan lebar (l)  : ");
                            bangunRuang.lebar = input.nextFloat();
                            System.out.print(" Masukkan tinggi (t) : ");
                            bangunRuang.tinggi = input.nextFloat();
                            System.out.println(" Hasil: " + bangunRuang.luasPermukaanBalok());
                            break;

                        case 3:
                            header();
                            System.out.println("== LUAS PERMUKAAN PRISMA SEGITIGA ==");
                            System.out.print(" Masukkan panjang alas 1 (a1): ");
                            bangunRuang.alas = input.nextFloat();
                            System.out.print(" Masukkan panjang alas 2 (a2): ");
                            bangunRuang.sisi = input.nextFloat();
                            System.out.print(" Masukkan panjang alas 3 (a3): ");
                            bangunRuang.tinggi = input.nextFloat();
                            System.out.print(" Masukkan tinggi prisma (t)  : ");
                            bangunRuang.panjang = input.nextFloat();
                            System.out.println(" Hasil: " + bangunRuang.luasPermukaanPrismaSegitiga());
                            break;

                        case 4:
                            header();
                            System.out.println("== LUAS PERMUKAAN LIMAS SEGITIGA ==");
                            System.out.print(" Masukkan panjang alas sisi tegak: ");
                            bangunRuang.alasSisiTegak = input.nextFloat();
                            System.out.print(" Masukkan tinggi limas (t)       : ");
                            bangunRuang.tinggi = input.nextFloat();
                            System.out.println(" Hasil: " + bangunRuang.luasPermukaanLimasSegitiga());
                            break;

                        case 5:
                            header();
                            System.out.println("== LUAS PERMUKAAN KERUCUT ==");
                            System.out.print(" Masukkan jari-jari (r)     : ");
                            bangunRuang.jariJari = input.nextFloat();
                            System.out.print(" Masukkan tinggi kerucut (t): ");
                            bangunRuang.tinggi = input.nextFloat();
                            System.out.println(" Hasil: " + bangunRuang.luasPermukaanKerucut());
                            break;

                        case 6:
                            header();
                            System.out.println("== LUAS PERMUKAAN TABUNG ==");
                            System.out.print(" Masukkan jari-jari (r)    : ");
                            bangunRuang.jariJari = input.nextFloat();
                            System.out.print(" Masukkan tinggi tabung (t): ");
                            bangunRuang.tinggi = input.nextFloat();
                            System.out.println(" Hasil: " + bangunRuang.luasPermukaanTabung());
                            break;

                        case 7:
                            header();
                            System.out.println("== LUAS PERMUKAAN BOLA ==");
                            System.out.print(" Masukkan jari-jari (r): ");
                            bangunRuang.jariJari = input.nextFloat();
                            System.out.println(" Hasil: " + bangunRuang.luasPermukaanBola());
                            break;

                        case 8:
                            continue MainMenu;

                        case 0:
                            System.out.print("Yakin ingin keluar? (y/n): ");
                            konfirm = input.next().charAt(0);

                        default:
                            System.out.println("Pilihan tidak ada!");
                    }
                } else if (pilihan == 3) {
                    continue MainMenu;
                } else if (pilihan == 0){
                    System.out.print("Yakin ingin keluar? (y/n): ");
                    konfirm = input.next().charAt(0);
                }
            }
            //2. KALKULATOR VOLUME
            else if (pilih == 2) {
                header();
                System.out.println("== VOLUME BANGUN RUANG ==");
                System.out.println(" 1. KUBUS");
                System.out.println(" 2. BALOK");
                System.out.println(" 3. PRISMA SEGITIGA");
                System.out.println(" 4. LIMAS SEGITIGA");
                System.out.println(" 5. KERUCUT");
                System.out.println(" 6. TABUNG");
                System.out.println(" 7. BOLA");
                System.out.println(" 8. KE MENU UTAMA");
                System.out.println(" 0. KELUAR");
                System.out.println("");
                System.out.print(" Pilih: ");
                int opsi = input.nextInt();
                System.out.println("");

                switch (opsi){
                    case 1:
                        header();
                        System.out.println("== VOLUME KUBUS ==");
                        System.out.print(" Masukkan panjang sisi (s): ");
                        bangunRuang.sisi = input.nextFloat();
                        System.out.println(" Hasil: " + bangunRuang.volumeKubus());
                        break;

                    case 2:
                        header();
                        System.out.println("== VOLUME BALOK ==");
                        System.out.print(" Masukkan panjang (p): ");
                        bangunRuang.panjang = input.nextFloat();
                        System.out.print(" Masukkan lebar (l)  : ");
                        bangunRuang.lebar = input.nextFloat();
                        System.out.print(" Masukkan tinggi (t) : ");
                        bangunRuang.tinggi = input.nextFloat();
                        System.out.println(" Hasil: " + bangunRuang.volumeBalok());
                        break;

                    case 3:
                        header();
                        System.out.println("== VOLUME PRISMA SEGITIGA ==");
                        System.out.print(" Masukkan panjang alas 1 (a1): ");
                        bangunRuang.alas = input.nextFloat();
                        System.out.print(" Masukkan panjang alas 2 (a2): ");
                        bangunRuang.sisi = input.nextFloat();
                        System.out.print(" Masukkan panjang alas 3 (a3): ");
                        bangunRuang.tinggi = input.nextFloat();
                        System.out.print(" Masukkan tinggi prisma (t)  : ");
                        bangunRuang.panjang = input.nextFloat();
                        System.out.println(" Hasil: " + bangunRuang.volumePrismaSegitiga());
                        break;

                    case 4:
                        header();
                        System.out.println("== VOLUME LIMAS SEGITIGA ==");
                        System.out.print(" Masukkan panjang alas sisi tegak: ");
                        bangunRuang.alasSisiTegak = input.nextFloat();
                        System.out.print(" Masukkan tinggi limas (t)       : ");
                        bangunRuang.tinggi = input.nextFloat();
                        System.out.println(" Hasil: " + bangunRuang.volumeLimasSegitiga());
                        break;

                    case 5:
                        header();
                        System.out.println("== VOLUME KERUCUT ==");
                        System.out.print(" Masukkan jari-jari (r)     : ");
                        bangunRuang.jariJari = input.nextFloat();
                        System.out.print(" Masukkan tinggi kerucut (t): ");
                        bangunRuang.tinggi = input.nextFloat();
                        System.out.println(" Hasil: " + bangunRuang.volumeKerucut());
                        break;

                    case 6:
                        header();
                        System.out.println("== VOLUME TABUNG ==");
                        System.out.print(" Masukkan jari-jari (r)    : ");
                        bangunRuang.jariJari = input.nextFloat();
                        System.out.print(" Masukkan tinggi tabung (t): ");
                        bangunRuang.tinggi = input.nextFloat();
                        System.out.println(" Hasil: " + bangunRuang.volumeTabung());
                        break;

                    case 7:
                        header();
                        System.out.println("== VOLUME BOLA ==");
                        System.out.print(" Masukkan jari-jari (r): ");
                        bangunRuang.jariJari = input.nextFloat();
                        System.out.println(" Hasil: " + bangunRuang.volumeBola());
                        break;

                    case 8:
                        continue MainMenu;

                    case 0:
                        System.out.print("Yakin ingin keluar? (y/n): ");
                        konfirm = input.next().charAt(0);

                    default:
                        System.out.println("Pilihan tidak ada!");
                }
            } else if (pilih == 0) {
                System.out.print("Yakin ingin keluar? (y/n): ");
                konfirm = input.next().charAt(0);
            } else {
                System.out.println("Pilihan tidak ada!");
            }
            enter();
        } while (konfirm != 'y');

    } //End of main

    public static void enter(){
        System.out.print("Tekan ENTER untuk melanjutkan...");
        new Scanner(System.in).nextLine();
    }
} //End of Class

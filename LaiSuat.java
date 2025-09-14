package Sang2132;
import java.util.Scanner;


public class LaiSuat 
{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số tiền gửi (VND): ");
	        double soTienGui = scanner.nextDouble();
	        System.out.print("Nhập lãi suất hàng năm (%): ");
	        double laiSuatNam = scanner.nextDouble();
	        System.out.print("Nhập số tháng gửi: ");
	        int soThang = scanner.nextInt();
	        double tienLai = soTienGui * (laiSuatNam / 100) / 12 * soThang;
	        double tongTien = soTienGui + tienLai;
	        System.out.println("------------------------------");
	        System.out.printf("Tiền lãi: %.2f VND\n", tienLai);
	        System.out.printf("Tổng tiền sau %d tháng: %.2f VND\n", soThang, tongTien);
	        scanner.close();
	}
}

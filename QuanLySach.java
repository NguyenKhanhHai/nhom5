import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySach {
    private final ArrayList<Sach> danhSachSach = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);
    // Thêm sách mới
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Đã thêm sách thành công!");
    }
    // Xóa sách theo mã
    public void xoaSach(String maSach) {
        Sach sach = timKiemTheoMa(maSach);
        if (sach != null) {
            danhSachSach.remove(sach);
            System.out.println("Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println("Không tìm thấy sách có mã: " + maSach);
        }
    }
    // Cập nhật thông tin sách
    public void capNhatSach(String maSach) {
        Sach sach = timKiemTheoMa(maSach);
        if (sach == null) {
            System.out.println("Không tìm thấy sách cần cập nhật!");
            return;
        }
        System.out.println("Nhập tên mới: ");
        sach.setTieuDe(sc.nextLine());
        System.out.println("Nhập tên tác giả mới: ");
        sach.setTacGia(sc.nextLine());
        System.out.println("Nhập mã tên mới");
        sach.setMaSach(sc.nextLine());
        sc.nextLine();
        System.out.println("Cập nhật thành công!");
    }
    // Tìm kiếm theo mã sách
    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }
    // Hiển thị toàn bộ danh sách
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for (Sach s : danhSachSach) {
                System.out.println(s.toString());
                System.out.println("-----------------------------------");
            }
        }
    }
    public void hienThiDanhSachSach() {
    for (Sach s : danhSachSach) {
        System.out.println(s.toString());
        System.out.println("Giá bán ước tính: " + s.tinhGiaBan() + " VNĐ");
        System.out.println("------------------------------------");
    }
}
}

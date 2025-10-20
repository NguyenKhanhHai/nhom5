public class Test {
     public static void main(String[] args) {
        // Tạo đối tượng quản lý
        QuanLySach ql = new QuanLySach();

        // Tạo sách giáo trình
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lập trình Java", "Nguyễn Văn A",
                2024, 10, "Công nghệ thông tin", "Đại học");

        // Tạo sách tiểu thuyết
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Ông Già Và Biển Cả", "Ernest Hemingway",
                1951, 30, "Bi kịch", true);
        // Thêm vào danh sách
        ql.themSach(gt1);
        ql.themSach(tt1);
        //Cập nhật danh sách
        ql.capNhatSach("TT02");
        // Hiển thị toàn bộ
        ql.hienThiDanhSach();
        // Tìm sách
        Sach kq = ql.timKiemTheoMa("GT01");
        if (kq != null) {
            System.out.println("\nTìm thấy sách có mã GT01:");
            System.out.println(kq.toString());
        } else {
            System.out.println("\nKhông tìm thấy sách!");
        }

        // Xóa sách
        ql.xoaSach("TT01");

        // Hiển thị sau khi xóa
        ql.hienThiDanhSach();
        ql.hienThiDanhSachSach();

        // Kiểm tra giao diện IKiemKe
        IKiemKe kiemKe = gt;
        if (kiemKe.kiemTraTonKho(100)) {
            System.out.println("Tồn kho đủ số lượng yêu cầu!");
        } else {
            System.out.println("Tồn kho KHÔNG đủ số lượng!");
        }

        kiemKe.capNhatViTri("Kho A1 - Kệ 5");
    }
    }
}

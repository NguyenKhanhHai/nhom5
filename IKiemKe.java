public interface IKiemKe {
    // Kiểm tra số lượng tồn kho tối thiểu
    boolean kiemTraTonKho(int soLuongToiThieu);

    // Cập nhật vị trí lưu trữ mới
    void capNhatViTri(String viTriMoi);
}

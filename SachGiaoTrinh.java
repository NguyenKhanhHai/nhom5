public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo,double giaCoBan )
{
    super(maSach,tieuDe,tacGia,namXuatBan,soLuong,giaCoBan);
    this.monHoc = monHoc;
    this.capDo = capDo;
}
public String getMonHoc()
{
    return monHoc;
}
public void setMonHoc(String monHoc)
{
    this.monHoc = monHoc;
}
public String getCapDo()
{
    return capDo;
}
public void setCapDo(String capDo)
{
    this.capDo = capDo;
}
@Override
    public String toString() {
        return super.toString() + ", Giá bán: " + tinhGiaBan();
    }
@Override
public double tinhGiaBan(){
    int soNamDaXuatBan = 2025 - getNamXuatBan();
    return getNamXuatBan() + soNamDaXuatBan * 5000;
}
    // ...các thuộc tính và phương thức sẵn có...

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách \"" + this.tieuDe + "\" đến khu vực: " + viTriMoi + ".");
    }
}
}


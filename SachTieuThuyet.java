public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private Boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, Boolean laSachSeries, double giaCoBan)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong,giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
public String getTheLoai(){
    return theLoai;
}
public void setTheLoai(String theLoai)
{
    this.theLoai = theLoai;
}
public Boolean getLaSachSeries()
{
    return laSachSeries;
}
public void setLaSachSeries(Boolean laSachSeries)
{
    this.laSachSeries = laSachSeries;
}
@Override
    public String toString() {
        return super.toString() +
               ", Là sách series: " + laSachSeries +
               ", Giá bán: " + tinhGiaBan();
}
@Override
public double tinhGiaBan(){
    if(laSachSeries)
        return getGiaCoBan() + 15000;
    else
        return getGiaCoBan();
}
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
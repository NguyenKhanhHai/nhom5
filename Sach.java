public abstract class Sach {
    //Thuộc tính (Attributes)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;
    // Constructor không tham số
    public Sach(){   
    }
     // Constructor có tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan)
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }
    public double getGiaCoBan()
    {
        return giaCoBan;
    }
    public void setGiaCoBan(Double giaCoBan)
    {
        this.giaCoBan = giaCoBan;
    }
    // Getter và Setter
    public String getMaSach() 
    {
        return maSach;
    }
    public void setMaSach(String maSach){
        this.maSach = maSach;
    }
    public String getTieuDe()
    {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe)
    {
        this.tieuDe = tieuDe;
    }
    public String getTacGia()
    {
        return tacGia;
    }
    public void setTacGia(String tacGia)
    {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan()
    {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan)
    {
        this.namXuatBan = namXuatBan;
    }
    public int getSoLuong()
    {
        return soLuong;
    }
    public void setSoLuong(int soLuong)
    {
        this.soLuong = soLuong;
    }
    //Phương thức hiển thị thông tin sách
        public void hienThiThongTin()
        {
            System.out.println("Mã sách:" + maSach);
            System.out.println("Tieu de:" + tieuDe);
            System.out.println("Tác Giả:" + tacGia);
            System.out.println("Năm xuất bản:" + namXuatBan);
            System.out.println("Số lượng" + soLuong);
            System.out.println("---------------------------");
        }
    public abstract double tinhGiaBan();
}

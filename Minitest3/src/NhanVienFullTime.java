public class NhanVienFullTime extends Nhanvien{
    int soTienThuong;
    int soTienPhat;
    int luongCung;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String maNhanVien, String hoVaTen, int tuoi, int soDienThoai, String email, int soTienThuong, int soTienPhat, int luongCung) {
        super(maNhanVien, hoVaTen, tuoi, soDienThoai, email);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public int getSoTienThuong() {
        return soTienThuong;
    }

    public void setSoTienThuong(int soTienThuong) {
        this.soTienThuong = soTienThuong;
    }

    public int getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(int soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }
    public  int LuongThucLinhFullTime(){
        return this.luongCung+(this.soTienThuong-this.soTienPhat);
    }
}

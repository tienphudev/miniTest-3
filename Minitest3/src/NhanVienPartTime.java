public class NhanVienPartTime extends Nhanvien{
    int soGioLamViec;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(String maNhanVien, String hoVaTen, int tuoi, int soDienThoai, String email, int soGioLamViec) {
        super(maNhanVien, hoVaTen, tuoi, soDienThoai, email);
        this.soGioLamViec = soGioLamViec;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }
    public  int LuongThucLinhPartTime(){
        return this.soGioLamViec*100000;
    }

}

public abstract class HangHoa {
    // ...
  }
  
  public class HangThucPham extends HangHoa {
    // ...
  }
  
  public class HangDienMay extends HangHoa {
    // ...
  }
  
  public class HangSanhSu extends HangHoa {
    // ...
  }
  // Trong lớp HangHoa
public abstract double tinhVAT();

// Trong lớp HangThucPham
@Override
public double tinhVAT() {
  return this.donGia * this.soLuongTon * 0.05;
}

// Trong lớp HangDienMay
@Override
public double tinhVAT() {
  return this.donG

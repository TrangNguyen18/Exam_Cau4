package intities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ticket {
    String tenChuyen;
    Date ngayBay;
    Double giaVe;

    //constructor
    public Ticket() {
    }

    public Ticket(String tenChuyen, Date ngayBay, Double giaVe) {
        this.tenChuyen = tenChuyen;
        this.ngayBay = ngayBay;
        this.giaVe = giaVe;
    }

    //input ticket infor
    public Ticket inputTicketInfor() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin ve");
        System.out.print("\tTen chuyen: ");
        this.tenChuyen = sc.nextLine();
        System.out.print("\tNgaybay (format dd/MM/yyyy) : ");
        String date = sc.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayBay = format.parse(date);
        System.out.print("\tGia ve: ");
        String price = sc.nextLine();
        this.giaVe = Double.parseDouble(price);
        return this;
    }

    //print ticket info
    public void printTickInfo() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String date = format.format(this.ngayBay);
        System.out.format("Thong tin chuyen bay: %s %s %,f",this.tenChuyen,this.ngayBay,this.giaVe);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("Chuyen bay'").append(tenChuyen).append('\'');
        sb.append(", vao ngay ").append(ngayBay);
        sb.append(", giaVe ").append(giaVe);
        return sb.toString();
    }
}

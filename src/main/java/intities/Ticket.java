package intities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ticket {
    String tenChuyen;
    String ngayBay;
    Double giaVe;

    //constructor
    public Ticket() {
    }

    public Ticket(String tenChuyen, String ngayBay, Double giaVe) {
        this.tenChuyen = tenChuyen;
        this.ngayBay = ngayBay;
        this.giaVe = giaVe;
    }

    //input ticket infor
    public void inputTicketInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tTên Chuyến: ");
        this.tenChuyen = sc.nextLine();
        System.out.print("\tNgày Bay (format dd/MM/yyyy) : ");
        this.ngayBay = sc.nextLine();
        System.out.print("\tGiá vé: ");
        String price = sc.nextLine();
        this.giaVe = Double.parseDouble(price);
    }

    //print ticket info
    public void printTickInfo() {
        System.out.format("%s %s %,f\n",this.tenChuyen,this.ngayBay,this.giaVe);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("Chuyến bay'").append(tenChuyen).append('\'');
        sb.append(", vào ngày ").append(ngayBay);
        sb.append(", Giá vé ").append(giaVe);
        return sb.toString();
    }
    public Double getGiaVe(){
        return this.giaVe;
    }
}

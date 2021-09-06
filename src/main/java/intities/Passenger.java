package intities;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.Scanner;

public class Passenger {
    String hoTen;
    String gioiTinh;
    int tuoi;
    Ticket[] danhSachVe;

    //constructor
    public Passenger() {
    }
    public Passenger(String hoTen, String gioiTinh, int tuoi, Ticket[] danhSachVe) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.danhSachVe = danhSachVe;
    }
    // input data
    public void inputPassengerInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin khách hàng");
        System.out.print("\tHọ tên : ");
        this.hoTen = sc.nextLine();
        System.out.print("\tGiới Tính (format Nam, Nữ, Khác) : ");
        this.gioiTinh = sc.nextLine();
        System.out.print("\tTuổi: ");
        this.tuoi = sc.nextInt();
        System.out.print("\tSố vé hành khách đã mua : ");
        int number = sc.nextInt();
        this.danhSachVe = new Ticket[number];
        System.out.println("\tDanh sách vé: ");
        for (int i = 0; i < number; i++) {
            Ticket tk = new Ticket();
            System.out.format("\tVé %d\n",i+1);
            tk.inputTicketInfor();
            this.danhSachVe[i] = tk;
        }
    }
        // print passenger
    public void printPassengerInfo(){
        System.out.format("\t Họ tên: %s\n",this.hoTen);
        System.out.format("\t Giới tính: %s\n", this.gioiTinh);
        System.out.format("\t Tuổi: %d\n",this.tuoi);
        for (int i = 0; i < this.danhSachVe.length; i++) {
            danhSachVe[i].printTickInfo();
            //System.out.println(danhSachVe[i].toString());
        }
    }
    public double tinhTongTien(){
        double sum = 0.0;
        for (int i = 0; i < this.danhSachVe.length; i++) {
            sum+= this.danhSachVe[i].getGiaVe();
        }
        return sum;
    }
}

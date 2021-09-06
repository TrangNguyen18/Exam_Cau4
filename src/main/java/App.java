import intities.Passenger;
import intities.Ticket;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        // Nhap thong tin hanh khác
        System.out.print("Nhập số hành khách: ");
        int n = sc.nextInt();
        Passenger[] ps_array = new Passenger[n];
        for (int i = 0; i < n; i++) {
            System.out.format("Hành khách %d\n", i + 1);
            Passenger ps = new Passenger();
            ps.inputPassengerInfo();
            ps_array[i] = ps;
        }
        // Hiển thị thông tin hành khách và số tiền phải thanh toán
        System.out.println("Danh sách hành khách:");
        for (int i = 0; i < ps_array.length; i++) {
            System.out.format("Hành khách %d\n", i + 1);
            ps_array[i].printPassengerInfo();
            System.out.format("Tổng tiền: %,.2f\n", ps_array[i].tinhTongTien());
            System.out.println("---------------------------");
        }
        //Sắp xếp
        Passenger tmp = new Passenger();
        for (int i = 0; i < ps_array.length - 1; i++) {
            for (int j = i + 1; j < ps_array.length; j++) {
                if (ps_array[i].tinhTongTien() < ps_array[j].tinhTongTien()) {
                    tmp = ps_array[j];
                    ps_array[j] = ps_array[i];
                    ps_array[i] = tmp;
                }
            }
        }
// In danh sách khách hàng theo tổng số tiền giảm dần
        System.out.println("Sắp xếp hành khách theo tổng tiền giảm dần:");
        for (int i = 0; i < ps_array.length; i++) {
            System.out.format("Hành khách %d\n", i + 1);
            ps_array[i].printPassengerInfo();
            System.out.format("Tổng tiền: %,.2f\n", ps_array[i].tinhTongTien());
            System.out.println("----------------------");
        }
    }
}

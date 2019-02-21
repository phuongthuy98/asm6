import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean fap = true;
        ArrayList<KhuonMau> data = new ArrayList<>();
        PhoneBook phone = new PhoneBook(data);
        Scanner sc = new Scanner(System.in);
        ChucNang();
        Scanner ac = new Scanner(System.in);
        int chon;
        while (fap){
            chon = sc.nextInt();
            switch(chon){
                case 1 : {
                    System.out.println("Nhập tên khách hàng");
                    String name = ac.nextLine();
                    System.out.println("Nhập sdt của khách hàng");
                    String phone1 = ac.nextLine();
                    phone.insertPhone(name,phone1);
                    ChucNang();
                    break;
                }
                case 2 : {
                    System.out.println("Mời nhập tên khách hàng cần xoá");
                    String name=ac.nextLine();
                    phone.removePhone(name);
                    ChucNang();
                    break;
                }
                case 3: {
                    System.out.println("Mời nhập tên khách hàng cần thay đổi");
                    String name=ac.nextLine();
                    String phone1=ac.nextLine();
                    phone.updatePhone(name,phone1);
                    ChucNang();
                    break;
                }
                case 4 : {
                    System.out.println("Mời nhập tên cần tìm kiếm");
                    String name=ac.nextLine();
                    phone.searchPhone(name);
                    ChucNang();
                    break;
                }
                case 5 : {
                    System.out.println("---Danh sách Phone ----");
                    phone.getData();
                    ChucNang();
                    break;
                }
                case 6: {
                    fap = false;
                }
            }

        }
    }

    private static void ChucNang() {
        System.out.println("1;Insert Phone");
        System.out.println("2:Remove Phone");
        System.out.println("3:Updata Phone");
        System.out.println("4:Search Phone");
        System.out.println("5:All Phone");
        System.out.println("6:Exit");
        System.out.println("--- Enter your choice ---");
    }
}
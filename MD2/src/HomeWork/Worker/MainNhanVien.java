package HomeWork.Worker;
import java.util.Scanner;

public class MainNhanVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.Tìm kiếm nhân viên");
            System.out.println("3.Xóa nhân viên");
            System.out.println("4.Sửa nhân viên");
            System.out.println("5.Hiển thị nhân viên");
            System.out.println("6.Sắp xếp nhân viên");
            System.out.println("7.Exit");
            System.out.println("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.println("1. Công nhân");
                    System.out.println("2. Kỹ sư");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1 -> {
                            NhanVien congNhan = ControllerNhanVien.createNhanVien(false);
                            ControllerNhanVien.addNhanVien(congNhan);
                        }
                        case 2 -> {
                            NhanVien kySu = ControllerNhanVien.createNhanVien(true);
                            ControllerNhanVien.addNhanVien(kySu);
                        }
                    }
                }
                case 2 -> ControllerNhanVien.searchNhanvien();
                case 3 -> ControllerNhanVien.deleteNhanvien();
                case 4 -> ControllerNhanVien.editNhanvien();
                case 5 -> {//show
                    System.out.println("1. Công nhân");
                    System.out.println("2. Kỹ sư");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1 -> ControllerNhanVien.showNhanVien(false);
                        case 2 -> ControllerNhanVien.showNhanVien(true);
                    }
                }
                case 6 -> ControllerNhanVien.sortByName();
                case 7 -> System.exit(0);
            }
        }

    }
}

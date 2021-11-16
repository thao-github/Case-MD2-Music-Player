package HomeWork.Worker;

import java.util.Scanner;

public class ControllerNhanVien {
    static NhanVien[] listNV = new NhanVien[0];
    static Scanner scanner = new Scanner(System.in);

    public static NhanVien createNhanVien(boolean isKySu) {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập address");
        String address = scanner.nextLine();
        System.out.println("Nhập age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập workingDay");
        double workingDay = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập salary");
        double salary = Double.parseDouble(scanner.nextLine());

        if (!isKySu) {
            CongNhan congNhan = new CongNhan(id, name, age, address, workingDay, salary);
            return congNhan;
        } else {
            System.out.println("Nhập payRateSalary");
            double payRateSalary = Double.parseDouble(scanner.nextLine());
            KySu kySu = new KySu(id, name, age, address, workingDay, salary, payRateSalary);
            return kySu;
        }
    }
    //1 Add
    public static void addNhanVien(NhanVien nhanVien) {
        NhanVien[] newArrNV = new NhanVien[listNV.length + 1];
        for (int i = 0; i < listNV.length; i++) {
            newArrNV[i] = listNV[i];
        }
        newArrNV[listNV.length] = nhanVien;

        listNV = newArrNV;
    }

    // 2 Search
    public static void searchNhanvien() {
        System.out.println("Nhập tên muốn tìm kiếm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < listNV.length; i++) {
            if (name.equals(listNV[i].getName())) {
                System.out.println(listNV[i]);
                break;
            }
        }
    }

    //3 Delete
    public static NhanVien[] deleteNhanvien() {
        System.out.println("Nhập tên muốn xoá: ");
        String name = scanner.nextLine();
        int index = 0;
        NhanVien[] newListNV = new NhanVien[listNV.length - 1];
        for (int i = 0; i < listNV.length; i++) {
            if (name.equals(listNV[i].getName())) {
                index = i;
            }
        }
        for (int i = 0; i < listNV.length - 1; i++) {
            if (i < index) {
                newListNV[i] = listNV[i];
            } else {
                newListNV[i] = listNV[i + 1];
            }
        }
        return newListNV;
    }

    //4 Edit
    public static NhanVien[] editNhanvien() {
        System.out.println("Nhập tên muốn sửa: ");
        String name = scanner.nextLine();
        System.out.println("Tên mới: ");
        String newName = scanner.nextLine();
        System.out.println("Nhập new address");
        String newAddress = scanner.nextLine();
        System.out.println("Nhập new age");
        int newAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập new workingDay");
        double newWorkingDay = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập new salary");
        double newSalary = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i < listNV.length; i++) {
            if (listNV[i].getName().equals(name)) {
                listNV[i].setName(newName);
                listNV[i].setAddress(newAddress);
                listNV[i].setAge(newAge);
                listNV[i].setWorkingDay(newWorkingDay);
                listNV[i].setSalary(newSalary);
            }
        }
        return listNV;
    }

    // Show1
    public static void showNhanVien(boolean isKysu) {  //In ra đối tượng có kiểu dữ liệu là KySu hoặc CongNhan
        if (isKysu) {
            for (NhanVien nv : listNV) {
                if (nv instanceof KySu) {  //kiểm tra xem nv có phải kiểu dữ liệu là KySu không? ->
                    System.out.println(nv.toString());
                }
            }
        } else {
            for (NhanVien nv : listNV) {
                if (!(nv instanceof KySu)) {
                    System.out.println(nv.toString());
                }
            }

        }
    }

//    5. Show2
//    public static void showAllNhanVien() {
//        for (NhanVien nv : listNV) {
//            if (nv instanceof KySu) {
//                System.out.println(nv.toString());
//            }
//        }
//        for (NhanVien nv : listNV) {
//            if (!(nv instanceof KySu)) {
//                System.out.println(nv.toString());
//            }
//        }
//    }

    //6 sortByName
    public static NhanVien[] sortByName() {
        NhanVien temp;
        for (int i = 0; i < listNV.length - 1; i++) {
            for (int j = i + 1; j < listNV.length; j++) {
                if ((listNV[i].getName()).charAt(0) > (listNV[j].getName()).charAt(0)) {
                    temp = listNV[i];
                    listNV[i] = listNV[j];
                    listNV[j] = temp;
                }
            }
        }
        return listNV;
    }
}


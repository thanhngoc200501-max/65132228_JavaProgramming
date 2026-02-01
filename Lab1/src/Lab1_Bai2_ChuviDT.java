import java.util.Scanner;
public class Lab1_Bai2_ChuviDT {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);
        System.out.println("----- KẾT QUẢ -----");
        System.out.printf("Chu vi: %.1f\n", chuVi);
        System.out.printf("Diện tích: %.1f\n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.1f\n", canhNho);

        scanner.close();
    }
}

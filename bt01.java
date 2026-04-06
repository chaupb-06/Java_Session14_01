import java.util.Scanner;

public class bt01 {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhap vao 1 so nguyen duong: ");
            String strNumber = sc.nextLine();
            if(strNumber.isEmpty()){
                System.out.println("Ban phai nhap vao du lieu");
            }else{
                try {
                    number = Integer.parseInt(strNumber);
                    if(number <= 0){
                        System.out.println("Ban phai nhap vao so duong");
                    }else {
                        break;
                    }
                }catch (Exception e){
                    System.out.println("Phai nhap vao la so");
                }
            }
        }
        if(isPrime(number)){
            System.out.println("La so nguyen to");
        }else {
            System.out.println("Khong phai la so nguyen to");
        }
    }

}

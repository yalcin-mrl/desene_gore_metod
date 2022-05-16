import java.util.Scanner;

public class DeseneGoreMetod {
    static int customMetod(int n,int k,int p){

        if(n<1){
            if(k>p){
                return 1;
            }
            System.out.print(k + " ");
            return customMetod(n,k+5,p);
        }
        System.out.print(n+" ");
        k = n-5;
        return customMetod(n-5,k,p);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = sc.nextInt();
        System.out.println("Çıktısı: ");
        customMetod(n,n,n);
    }
}

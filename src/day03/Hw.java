package day03;

public class Hw {
    public static void main(String[] args) {
        int m=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int i=1;
        int sum=0;
        while(i<=100){
            int n=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    ++n;
            }
            if(n==2) {
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);

    }

}
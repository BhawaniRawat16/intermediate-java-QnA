import java.util.*;

class PrimePattern {
    public static void main(String[] args) {
        int p = 2;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = obj.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                while(true){
                    int k;
                    for(k=2; k<=p; k++){
                        if(p%k==0)
                        break;
                    }
                    if(k==p){
                        System.out.print(p++ +" ");
                        break;
                    }else{
                        p++;
                    }
                }
            }
            System.out.println();
        }
    }
}

public class GCD_of_Two_Numbers {

    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;
        int y = 1;

        for(int i=1;i<Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                y=i;
            }
        }
        System.out.print(y);

    }
}

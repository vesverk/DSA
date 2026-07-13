public class Armstrong {
    public static void main(String[] args){
        int n = 153;
        int orignal = n;
        int count = 0;
        int r = 0;

        while(n!=0){
            n = n/10;
            count++;
        }

        n = orignal;
        while(n!=0){
            int digit = n%10;
            r += (int)Math.pow(digit,count);
            n = n/10;
        }
        // System.out.print(count);
        System.out.print(r);

    }
}

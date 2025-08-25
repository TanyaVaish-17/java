public class sumODD {
    public static void main(String[] args) {
        int sumValues=0;
        int count=0;
        for (int i=2;i<100;i++){
            if ((i & 1)==1){
                count+=1;
                sumValues+=i;
            }
        }
        System.out.println("Total no. of odd no.s between 1-100 : "+count);
        System.out.println("Sum of odd values between 1-100 : "+sumValues);
    }
}

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int sum=0;
        int lastDigit;
        if(number<0)return -1;
        else{
            while(number>0){
                lastDigit=number%10;
                if(lastDigit%2==0)sum+=lastDigit;
                number/=10;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(802));
    }
}

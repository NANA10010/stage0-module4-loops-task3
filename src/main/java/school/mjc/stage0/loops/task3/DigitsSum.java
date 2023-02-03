package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        int firstnum=number;
        int ans=0;
        for (int i=0; i<20; i++){
            ans+=number%10;
            number/=10;
            if(number==0) break;
        }
        if(firstnum<0)System.out.println(ans*-1);
        else System.out.println(ans);
    }
}

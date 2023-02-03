package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String num = String.valueOf(number);
        int ans=0;
        for (int i=0; i<num.length(); i++){
            ans += (int) (num.charAt(i)-48);
        }
        System.out.println(ans);
    }
}

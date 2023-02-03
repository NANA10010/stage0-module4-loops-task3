package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
   long ans = 0;
        for(int i=1; i<=lengthOfLastNumber; i++){
            long number= 9;
            for (int j=1; j<i; j++){
                number=(number*10)+9;
            }
            ans+=number;
        }

        System.out.println(ans);

    }
}

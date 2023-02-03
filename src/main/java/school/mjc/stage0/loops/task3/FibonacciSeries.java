package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
            int ans=0;
        int first = 0;
        int second = 1;
       System.out.println(first);
       System.out.println(second);
        for(int i=0; i<lastFibonacci-2; i++){
            ans=first+second;
            first = second;
            second = ans;
            System.out.println(ans);
        }

    }
}

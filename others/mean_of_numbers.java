import java.io.*;
import java.util.*;

public class mean_of_numbers {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        for(int i=0;i<n;i++){
            List<Integer> numbers= new ArrayList<>();
            numbers.addAll(Arrays.asList(sc.nextInt()));
            double mean=0;
            int j=0;
            mean+=numbers.indexOf(j);
            j++;
            System.out.println(mean);
            sc.close();
        }
        
    }
}

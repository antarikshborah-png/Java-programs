import java.util.*;

public class count {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
      System.out.println("Elements in the array are");

        int count_even = 0;
        int count_odd = 0;
        for(int i=0;i<n;i++){
           if(a[i]% 2== 0)
                 count_even++;
                else
                    count_odd++;    
        }
         System.out.printf("Count >> Even: %d | Odd: %d\n",count_even,count_odd);
    }
}


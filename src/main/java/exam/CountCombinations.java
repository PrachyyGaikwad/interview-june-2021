package exam;

public class CountCombinations {

  static int ways(int n)
{
    // If there is a single number left it will form singleton 

    if (n == 1) 
    {
        return 1;
    }

    // if there are just 2 numbers left, they will form a pair

    if (n == 2) 
    {
        return 2;
    }
    else
    {
        return ways(n-1) + ways(n-2);
    }
}
 
// Driver Code

public static void main (String[] args) 
{
    int n = 5, rev = 0;

    while(number != 0)   
   {       
      int remainder = n % 10;  
      reverse = reverse * 10 + remainder;  
      n = n/10;  
   }  
   System.out.println("Number of ways = "+ ways(n));
}
}

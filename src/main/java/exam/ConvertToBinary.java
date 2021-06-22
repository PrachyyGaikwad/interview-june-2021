package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
  
    int n = s.length();

    for(int i=0;i<n;i++)
    { 
     // conversion of each character to ASCII value
       
        int val = Integer.valueOf(s.charAt(i));
    
    // Conversion of ASCII to binary value

       String bin = " ";
       while(val > 0)
       {
           if (val%2 == 1)
           {
               bin += '1';
           }
       else 
          {
              bin += '0';
              val /= 2;
          }
       bin = reverse(bin);
    
       System.out.println(bin+" ");
       }
     }
     static String reverse (String input)
     { 
         char[] a = input.toCharArray();
         int 1,r=0;
         r= a.length - 1;
        
      for(1=0;1<r;1++,r--)
      { 
      // Swap values of 1 and r
         char temp = a[1];
         a[1] = a[r];
         a[r] = temp;
      }
      return String.valueOf(a);
     }
     // Driver code
     public ststic void main (String [] args)
     {
         String s = "Hello";
         strToBinary(s);
      }
   }
}

package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
     {   
        int n = s.length(); 

 
        for (int i = 0; i < n; i++)  

        { 
            // conversion of each char to to ASCII value  

            int val = Integer.valueOf(s.charAt(i)); 

            // Conversion of ASCII value to binary value

            String bin = ""; 

            while (val > 0)  
            { 
                if (val % 2 == 1) 
                { 
                    bin += '1'; 
                } 
                else
                    bin += '0'; 
                val /= 2; 
            } 
            bin = reverse(bin); 
            System.out.print(bin + " "); 
        } 

    } 
    static String reverse(String input)  

    { 

        char[] a = input.toCharArray(); 
        int l, r = 0; 
        r = a.length - 1; 
        
        for (l = 0; l < r; l++, r--) 

        { 
            // Swap values of l and r  

            char temp = a[l]; 
            a[l] = a[r]; 
            a[r] = temp; 
        } 

        return String.valueOf(a); 

    }
    // Driver code 

    public static void main(String[] args) 
     { 
        String s = "Hello"; 
        strToBinary(s); 
     } 
    if (a < 0)
     {
       System.out.println(" Negative Value ");
     }
}

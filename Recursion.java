import java.io.File;

public class Recursion
{
   // Used in part 1
   public static String[] divideStr(String s)
   {
      String[] strs = new String[2];
      int len = s.length();
      
      strs[0] = s.substring(0, (int) len/2);
      strs[1] = s.substring((int) len/2, len);
      
      return strs;
   }
   
   // 1.
   public static int countStr(String s)
   {
      // base cases
      if ( s.length() <= 1)
         return s.length();
      
      // recursive loop
      else
      {
         String[] subs = divideStr(s);
         return countStr(subs[0]) + countStr(subs[1]);
      }
   }
   
   // 2.
   public static int countNon(String ss)
   {
      String nonVowels = "bcdfghjklmnprstuvyzqwx";
      String s = ss.toLowerCase();;
      
      if (s.length() == 1)
      {
         if (nonVowels.indexOf(s.charAt(0)) == -1)
            return 0;
         else
            return 1;
      }
      
      else
      {
         if (nonVowels.indexOf(s.charAt(0)) != -1)
            return countNon(s.substring(1)) + 1;
         else
            return countNon(s.substring(1));
      }
   }
   
   // 3.
   public static void binStrs(int n)
   {
      binStrs(n, "", 0);
   }
   
   public static void binStrs(int n, String str, int lastDigit)
    {
        // base case
        if (n == 0)
        {
            System.out.println(str);
            return;
        }
 
        // add 0 for all situations
        binStrs(n - 1, str + "0", 0);
 
        // add 1 if last digit isn't 1
        if (lastDigit == 0)
            binStrs(n - 1, str + "1", 1);
    }
   
   // 4.
   public static int countFiles(String path)
   {
      int count = 0;
      File f = new File(path);
      File[] fArr = f.listFiles();
      
      for (File subF : fArr)
      {
         if (subF.isFile())
            count++;
         else if (subF.isDirectory())
            count += countFiles(subF.getPath());
      }
      
      return count;
   }
}
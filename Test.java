public class Test
{
   public static void main(String[] args)
   {
      int a = Recursion.countStr("Burak Ozturk");
      System.out.println(a);
      
      int b = Recursion.countNon("ab DDc  de  65 !' -");
      System.out.println(b);
      
      Recursion.binStrs(3);
      System.out.println();
      Recursion.binStrs(4);
      
      int c = Recursion.countFiles("D:/bilkent/2thYear/CS223");
      System.out.println(c);
   }
}
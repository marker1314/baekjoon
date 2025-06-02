import java.util.*;

public class Main {

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      int loop = s.nextInt();
      Vector<Integer> list = new Vector<Integer>(loop);
      
      for (int i = 0; i < loop; i++) {
         int level = s.nextInt();
         int room = s.nextInt();
         int people = s.nextInt();
         list.add(people%level==0?level*100+people/level:people%level*100+people/level+1);
      }
      
      for (int i = 0; i < loop; i++) {
         System.out.println(list.get(i));
      }
      
      s.close();
   }
   
}

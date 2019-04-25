class Break3 {
 public static void main(String args[]) { 
  for (int i = 0; i<3; i++) {
    System.out.println("Outer loop counts: " + i);
    System.out.println("Inner loop counts: ");
    int t = 0;
    While (t < 100) {
     if (t == 10) break ;
     System.out.print(t + " ");
     t++;
    }
    System.out.println();
   }
   System.out.println("Loops complete");
  }
}

  

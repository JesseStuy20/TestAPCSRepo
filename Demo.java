public class Demo {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]) ;
    for(int i = 1; i <= n; i++){
      for(int j = n;j>=i; j--){
        System.out.print(i) ;
    }
    System.out.println() ;
  }
  }
}

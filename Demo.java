public class Demo {
  
  public static void main(String[] args) {
    int n = 5;
    if (args.length>0){
      n = Integer.parseInt(args[0]);
    }
    // System.out.println(printLoop(n)) ;  to test printLoop
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int[][] arr = create2DArrayRandomized(a,b,c) ;
    System.out.println(arrayDeepToString(arr).replace("},","},\n")) ;
  }

  public static String printLoop(int n) {
    String result = "" ;
    for(int i = 1; i <= n; i++){
      for(int j = n;j >= i; j--){
        result = result + (i+"") ;
    }
    result = result + "\n" ;
  }
  return result ;
  }

  public static String arrToString(int[] arr){
    String result = "{" ;
    for (int i = 0; i < arr.length; i++) {
      if (i != arr.length-1) result = result + arr[i] + ", " ;
      if (i == arr.length-1) result = result + arr[i] ;
    }
    result = result + "}" ;
    return result ;
  }

  public static String arrayDeepToString(int[][] arr) {
    String result = "{" ;
    for (int i = 0; i < arr.length; i++) {
      if (i != arr.length-1) result = result + arrToString(arr[i]) + ", " ;
      if (i == arr.length-1) result = result + arrToString(arr[i]) ;
    }
    result = result + "}" ;
    return result ;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] result = new int[rows][cols] ;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        result[i][j] = (int) (Math.random() * (maxValue+1)) ;
      }
    }
    return result ;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] result = new int[rows][] ;
    for (int i = 0; i < rows; i++) {
      int randCols = (int)(Math.random() * (cols+1)) ;
      result[i] = new int[randCols] ;
      for (int j = 0; j < randCols; j++) {
        result[i][j] = (int) (Math.random() * (maxValue+1)) ;
      }
    }
    return result ;
  }

}


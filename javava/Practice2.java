class Practice2 {
  
  public static void methodB() {
    System.out.println("methodA");
    methodB();
  }
  
  public static void methodA() {
    System.out.println("methodB");
  }
  
  public static void main (String[] args) {
     methodA();
  
    //メソッドの利用
    //・見通しが良くなる・作業効率が上がる
//     System.out.println("メソッド呼び出し開始"); //mainメソッド
//     hello(); //helloメソッドを呼び出す
//     System.out.println("メソッド呼び出し完了");
//   }
// public static void hello() {
//   System.out.println("湊、こんにちは"); //helloメソッド

   
 }
}
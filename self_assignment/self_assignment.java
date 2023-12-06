public class self_assignment {
  public static void main(String[] args) {
    int number = 3;
    System.out.println(number);

    // 変数numberの値に7を足して、変数numberを上書き
    number = number + 7;

    // 変数numberを出力
    System.out.println(number);

  }
}

//記述の省略

// class Main {
//   public static void main(String[] args) {
//     int number = 8;

//     // 変数numberに7をかけて、変数numberを上書き
//     // numberの記述を省略可（=の位置に気を付ける）
//     number *= 7;

//     // 変数numberを出力
//     System.out.println(number);

//     // 変数numberの値に1を足して、変数numberを上書き
//     // 1の時だけは省略可
//     number++;

//     // 変数numberを出力
//     System.out.println(number);

//   }
// }
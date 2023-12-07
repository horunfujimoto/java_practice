public class rectangleArea {
  public static void main(String[] args) {
    int length = 6;
    int height = 8;

    // 変数rectangleAreaに、四角形の面積を代入
    // 掛け算の式をそのまま変数に代入するには、int rectangleArea = length * height;と書く
    int rectangleArea = length * height;

    // 変数rectangleAreaを出力
    System.out.println(rectangleArea);

    // 変数triangleAreaに、三角形の面積を代入
    int triangleArea = length * height / 2;

    // 変数triangleAreaを出力
    System.out.println(triangleArea);

  }
}
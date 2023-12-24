public class Test2 {
	public static void main(String[] args) {
	  // 1〜10までの偶数が何個あるのか、偶数の合計は幾つになるかを表示
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= 10; i += 2 ) {
			sum += i;
			count ++ ;
		}
		System.out.println(sum);
		System.out.println(count);

	}
}
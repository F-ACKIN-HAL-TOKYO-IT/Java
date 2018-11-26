package step02;

/**
 * 問題２
 */
public class Step2 {
	/**
	 * 足し算か２つの値を足した倍の値を返すメソッド。
	 * @param a １つ目の値。
	 * @param b ２つ目の値。
	 * @return 与えられた２つの数値を足した値を返します。
	 * ただし、２つの数値が同じ値だった場合は、
	 * ２つの値を足した、さらに倍の値を返します。
	 */
	public int sumOrDoubleSum(int a, int b) {
		int sum = a + b;

		if(a == b)
		{
			sum += sum;
		}
		return sum;
	}
}

package step07;

/**
 * 問題７
 */
public class Step7 {

	/**
	 * どっちかは10～20の範囲内？
	 * @param a 数値１。
	 * @param b 数値２。
	 * @return 与えられた２つの数値のうち、どちらかが 10～20 の範囲内にあれば true を返します。
	 */
	public boolean between_10_20(int a, int b) {
		return (10 < a && a < 20) || (10 < b && b < 20);
	}
}

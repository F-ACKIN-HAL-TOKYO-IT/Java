package step09;

/**
 * 問題９
 */
public class Step9 {
	/**
	 * 一番大きな値はどれ？
	 * @param a 数値１。
	 * @param b 数値２。
	 * @param c 数値３。
	 * @return 与えられた３つの数値うち、一番大きな値を返します。
	 */
	public int selectMax(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}
}

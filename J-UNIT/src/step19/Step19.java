package step19;

/**
 * 問題１９
 */
public class Step19 {
	/**
	 * 7 が好き！
	 * @param a １つ目の数。
	 * @param b ２つ目の数。
	 * @return １つ目の引数が７の場合はtrue。
	 * ２つ目の引数が７の場合はtrue。
	 * １つ目の引数と２つ目の引数を足して７の場合はtrue。
	 * １つ目の引数と２つ目の引数の差が７の場合はtrue。
	 * それ以外はfalseを返します。
	 */
	public boolean iLove7(int a, int b) {
		return a==7 || b ==7 || a+b == 7 || a-b ==7 || b-a ==7;
	}
}

package step08;

/**
 * 問題８
 */
public class Step8 {
	/**
	 * 【難問】掛ける！ 指定された値を指定された回数だけ掛けあわせた値を返します。 ただし、for, while, do while などのループ構文や、
	 * Math#pow のようなメソッドは使用禁止です。 要するに【再帰処理】で解決してください。 なお両値共に負の値、0 はありえません。
	 *
	 * @param number 掛け合わせる値。
	 * @param times  掛け合わせる回数。
	 * @return 掛け合わせる値を回数分だけ掛けあわせた値を返します。
	 */
	public int multiply(int number, int times) {
		if (times == 0) {
			return 1;
		} else {
			return number * multiply(number, times - 1);
		}
	}
}

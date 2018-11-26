package step05;

/**
 * 問題５
 */
public class Step5 {
	/**
	 * 文字列を文字列ではさむ！
	 * @param word 文字列。
	 * @return 与えられた文字列の先頭２文字で元の文字列をはさんだ文字列を返します。
	 * ただし、与えられた文字列が２文字に満たない場合はその文字列ではさんみます。
	 */
	public String sandwich(String word) {
		if (word.length() < 2)
		{
			return word + word + word;
		}
		else {
			return word.substring(0, 2) + word + word.substring(0,2);
		}
	}
}

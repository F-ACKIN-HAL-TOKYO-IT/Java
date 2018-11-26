package step15;

/**
 * 問題１５
 */
public class Step15 {

	/**
	 * bug を取り除け！
	 * @param word 除去対処文字列。
	 * @return 与えられた文字列から "bug" という文字を取り除いた文字列を返します。
	 */
	public String bugFix(String word) {
		return word.replace("bug", "");
	}
}

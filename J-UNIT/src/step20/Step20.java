package step20;

/**
 * 問題２０
 */
public class Step20 {
	/**
	 * 【難問】与えられた文字列内の "#" を "@" に変換します。 ただし for, while, do while といったループ構文と、
	 * String#replace などのメソッドは使用禁止です。 要するに【再帰処理】で解決してね！ってこと。
	 *
	 * @param word 文字列（null はありえない）。
	 * @return 置換した文字列。
	 */
	public String convertSharpToAt(String word) {
		if (word.length() == 0) {
			return "";
		}
		char c = word.charAt(0);
		if (c == '#') {
			return "@" + convertSharpToAt(word.substring(1));
		}
		return String.valueOf(c) + convertSharpToAt(word.substring(1));
	}
}

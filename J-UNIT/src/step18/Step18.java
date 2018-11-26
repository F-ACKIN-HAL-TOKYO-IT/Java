package step18;

/**
 * 問題１８
 */
public class Step18 {
	/**
	 * 最初の文字と最後の文字をくっつける。
	 * @param a １つ目の文字列。
	 * @param b ２つ目の文字列。
	 * @return 与えられた２つの文字列について、１つ目の引数の１文字目と
	 * ２つ目の引数の最後の１文字をくっつけた文字列を返します。
	 * ただし、文字が空文字 "" だった場合には "@" をくっつけます。
	 */
	public String firstAndLastChars(String a, String b) {
		a = a.isEmpty()? "@":a;
		b = b.isEmpty()? "@":b;

		return a.substring(0,1) + b.substring(b.length()-1);
	}
}

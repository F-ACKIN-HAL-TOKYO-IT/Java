package step03;

/**
 * 問題３
 */
public class Step3 {
	/**
	 * 好き！って文字列を返します。
	 * @param word 対象となる文字列
	 * @return 与えられた文字列(word)の先頭に "like " を付けた文字列を返します。
	 * ただし、与えられた文字列の先頭に "like " が最初から付いている場合は
	 * 何もせずにそのまま返してください
	 */
	public String likeString(String word) {
		if (word.indexOf("like ") != 0)
		{
			word = "like " + word;
		}
		return word;
	}
}

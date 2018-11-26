package step17;

/**
 * 問題１７
 */
public class Step17 {
	/**
	 * 文字列から X を取り除きます  ただし最初の一文字目と最後の文字の X は取り除い
	 * はいけません。
	 * 
	 *
	 * @param word 文字列。
	 * @return X を取り除いた文字列。
	 */
	public String removeX(String word) {
		return word.substring(0, 1) + (word.substring(1, word.length() - 1)).replace("X", "")
				+ word.substring(word.length() - 1, word.length());
	}
}

package step12;

/**
 * 問題１２
 */
public class Step12 {
	/**
	 * 指定された回数繰り返す。
	 * @param word 文字列。
	 * @param times 繰り返す回数。
	 * @return 与えれれた文字列を指定された回数だけ繰り返した文字列を返します。
	 */
	public String jejeje2(String word, int times) {

		if(times == 0)
		{
			return "";
		}
		else
		{
			return word + jejeje2(word, times-1);
		}
	}
}

package step04;

/**
 * 問題４
 */
public class Step4 {
	/**
	 * ３回言う！
	 * @param word 言葉。
	 * @return 与えられた言葉(word)の頭３文字を３回繰り返した文字列を返します。
	 * ただし３文字に満たない文字列が与えられた場合は、
	 * その文字列を３回繰り返します。
	 */
	public String jejeje(String word) {
		String retText = "";
		if(word.length() < 3)
		{
			retText = word + word + word;
		}
		else
		{
			retText = word.substring(0,3) + word.substring(0,3) + word.substring(0,3);
		}
		return retText;
	}
}

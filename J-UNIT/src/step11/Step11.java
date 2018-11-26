package step11;

/**
 * 問題１１
 */
public class Step11 {
	/**
	 * おしり３文字だけ大文字に。
	 * @param word 文字列
	 * @return 与えられた文字列の最後３文字のみ大文字に変換した文字列を返します。
	 */
	public String toUpperEnd3(String word) {

		if(word.length()<3)
		{
			return word.toUpperCase();
		}
		else
		{
			return word.substring(0, word.length()-3) + (word.substring(word.length()-3).toUpperCase());
		}
	}
}

package step16;

/**
 * 問題１６
 */
public class Step16 {

	/**
	 * "ZZ" を数える！
	 *
	 * @param word 検査対象文字列
	 * @return 与えれれた文字列の中に "ZZ" という並びが何回でてくるか数えて返します。
	 */
	public int countZZ(String word) {
		int cnt = 0;
		for(int i = 1; i < word.length(); i++ )
		{
			if(word.charAt(i) == 'Z' && word.charAt(i-1) == word.charAt(i) )
			{
				cnt++;
			}
		}
		return cnt;
	}
}

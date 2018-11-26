package step13;

/**
 * 問題１３
 */
public class Step13 {
	/**
	 * 同じ数値、連続３回入ってないよね？
	 * @param targets 検査配列。
	 * @return 与えられた配列内に同じ数値が連続して格納されていなければ true を返します。
	 */
	public boolean isNotTriples(int[] targets) {
		for(int i = 1; i < targets.length; i++ )
		{
			if(targets[i-1] == targets[i] && targets[i] == targets[i+1])
			{
				return false;
			}
		}
		return true;
	}
}

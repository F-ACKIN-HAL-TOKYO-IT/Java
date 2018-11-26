package step14;

/**
 * 問題１４
 */
public class Step14 {
	/**
	 * 配列内にある 5 の数。
	 * @param target 検査配列。
	 * @return 配列の中に 5 がいくつあるか数えて返します
	 */
	public int count5(int[] target) {
		int cnt = 0;
		for (int n: target)
		{
			if(n == 5)
			{
				cnt++;
			}
		}
		return cnt;
	}
}

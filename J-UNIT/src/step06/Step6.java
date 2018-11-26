package step06;

/**
 * 問題６
 */
public class Step6 {
	/**
	 * 独り言うるさい？独り言を話す人がいます。うるさいかどうかを判定します。
	 * @param talking 独り言を言っているかどうか。
	 * @param hour 今の時間（0～23）
	 * @return 独り言がうるさければ true を、うるさくなければ false を返します。
	 * もちろん、独り言を言っていなければ当然うるさくありません。
	 * ただし、独り言を言っていたとしても 7 時から 20 時まであれば、まあうるさくありません。
	 */
	public boolean isNoisy(boolean talking, int hour) {
		return (hour<7 || 20<hour) && talking;
	}
}

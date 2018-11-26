package step01;

/**
 * 問題１
 */
public class Step1 {
	/**
	 * 寝ていいのかどうかチェック判定をします。
	 * @param weekday 平日かどうか（平日の場合 true）
	 * @param vacation 休暇中かどうか（休暇中の場合 true）
	 * @return 「平日ではない」もしくは「休暇中である」場合、
	 *  true を返します。
	 */
	public boolean canSleep(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		}else {
			return false;
		}
	}
}

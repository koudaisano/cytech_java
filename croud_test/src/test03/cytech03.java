package test03;

import java.time.Instant;

public class cytech03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Instant now = Instant.now();
		System.out.println("経過秒数：" + now.getEpochSecond());
		
		long tng = Instant.now().getEpochSecond();
		
		if(tng % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
	}
}
package test04;

import java.time.Instant;

public class cytech04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long time = Instant.now().getEpochSecond(); //経過秒数を取得
		System.out.println("経過秒数：" + time); //経過秒数を表示
		
		int tng = (int)(time % 2); 
		//swich文ではlongが使用できないため、int型に変換し2で割った余りを"tng"に代入
		switch(tng){
		case 0:
			System.out.println("偶数です");
			break;
		case 1:
			System.out.println("奇数です");
			break;
		}
	}
}
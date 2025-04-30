package test09;

public class cytech09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] member = { 		//行数5列数4
				{20,50,60,70},  //1人目
				{30,50,60,60},	//2人目
				{40,50,60,50},	//3人目
				{50,50,60,40},  //4人目
				{60,50,60,30},  //5人目
		};
		
		String[] subject = {"国語","数学","理科","社会"}; //4科目
		
		for(int i = 0; i < member.length; i++) { //i = 1だとインデックス番号1から始まるので4人しか処理してくれない
			System.out.println("生徒" + (i + 1) + "の点数："); // インデックスiが0から始まるため「+1」して「生徒1, 生徒2, ...」と表示
			for(int j = 0; j < member[i].length; j++) { //jは科目の番号0～3・member[i].lengthは各生徒の点数の個数
				System.out.println(subject[j] + ":" +member[i][j]); //科目名:点数を表示
			}
			System.out.println();
		}
	}
}
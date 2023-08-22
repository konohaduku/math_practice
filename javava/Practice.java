class Practice {
  public static void main (String[] args) {
    // int a = 3;
    // int b = 5;
    // int c = a * b;
    // System.out.println("縦幅3横幅5の長方形の面積は," + c);

    // boolean anser = true;
    // char name = '駆';
    // double pi = 3.14;
    // long water = 314259265853979L;
    // String msg = "ミナトの攻撃！敵に１５ポイントのダメージを与えた！";

    //オペランド
    // System.out.println("トニー・スターク\"私がアイアンマンだ\" ");

    //インクリメント・デクリメント演算子
    // int a;
    // a = 100;
    // a++;
    // System.out.println(a);

    //値より大きな変数に代入
    // float f =3;
    // double d = f;
    // System.out.println(f);
    // System.out.println(d);

    //強制的な型変換
    // int age = (int)3.5;
    // System.out.println(age);

    //異なる型の演算
    // double d = 8.5 / 2;
    // long l = 5 + 2L;
    // System.out.println(d);
    // System.out.println(l);

    //改行しない命令
    // String name = "しがらき";
    // System.out.print("私の苗字は");
    // System.out.print(name);

    //比較と最大数値
    // int a = 5;
    // int b = 2;
    // int c = Math.max(a,b);
    // System.out.println("比較：" + a + "と" + b + "で大きい方は" + c);

    //ランダムな数の生成
    // int r = new java.util.Random().nextInt(90);
    // System.out.println("今回は" + r + "位だった");

    //キーボードから入力を受け付ける
    // System.out.println("プレイヤーネームを入力してください");
    // String name = new java.util.Scanner(System.in).nextLine();
    // System.out.println("プレイヤーの年齢を入力してください");
    // int age = new java.util.Scanner(System.in).nextInt();
    // System.out.println(name + "さんは" + age + "歳で登録されました");

    // int x = 5;
    // int y = 10;
    // String ans = "x+yは" + (x + y);
    // System.out.println(ans);

    // System.out.println("ようこそ占いの館へ");
    // System.out.println("あなたの名前を入力して下さい");
    // String name = new java.util.Scanner(System.in).nextLine();
    // System.out.println("あなたの年齢を入力してください");
    // String age = new java.util.Scanner(System.in).nextLine();
    // int n = Integer.parseInt(age);
    // int fortune = new java.util.Random().nextInt(4);
    // fortune++;
    // System.out.println("占いの結果が出ました！");
    // System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune +"です");
    // System.out.println("1:大吉 2:中吉 3:小吉 4:凶");

    //条件分岐
    // boolean tenki = true;
    // if (tenki == true){
    //   System.out.println("洗濯をします");
    //   System.out.println("散歩に行きます");
    // }else{
    //   System.out.println("DVDを見ます");
    // }

    //波括弧は省略しない（一文だけなら可能だが）

    //文字列は＝＝で比較できない
    // if (str == "夕日")　×
    // if (str.equals("夕日")) ◯

    // System.out.println("あなたの運勢");
    // int fortune = new java.util.Random().nextInt(5) + 1;
    // switch (fortune) {
    //   case 1:
    //   case 2:
    //     System.out.println("いいね！");
    //     break;
    //   case 3:
    //     System.out.println("普通です");
    //     break;
    //   case 4:
    //   case 5:
    //     System.out.println("うーん……");
    // }

    //for文の基本形
    // for(int i = 0; i < 10; i++){……
    // }

    // for(int i = 0; i < 9; i++){
    //   System.out.println("こんにちは");
    // }

    //infinity
    // for (int i = 0; i < 10;){
    //   System.out.println("こんにちは");
    // }

    //制御構造　掛け算の繰り返し
    // for (int i = 1; i < 10; i++){
    //   for (int j = 1; j < 10; j++){
    //     System.out.println(i * j);
    //     System.out.println(" ");
    //   }
    //   System.out.println("");
    // }

    //無限
    // while (true) {処理}
    // for (;;) {処理}

  //   weight == 60　weoghtと60が等しい
  // (age1 + age2)* 2 > 60　合計を二倍したものが60を超えている
  // age % 2 == 1　ageが奇数
  // name.equals("湊")　nameが湊と等しい

  // int isHungry = 1;
  // String food = "ペプシ";
  // System.out.println("こんにちは");
  // System.out.println(isHungry == 0 ? "お腹いっぱいです" : "腹ペコです");
  // if (isHungry == 1){
  //   System.out.println(food + "をいただきます");
  // }
  //   System.out.println("ごちそうさまでした");

  // System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");
  // int selected = new java.util.Scanner(System.in).nextInt();
  // switch (selected){
  //   case 1:
  //     System.out.println("検索します");
  //     break;
  //   case 2:
  //     System.out.println("登録します");
  //     break;
  //   case 3:
  //     System.out.println("削除します");
  //     break;
  //   case 4:
  //     System.out.println("変更します");
  //     break;
  // }
  
  //配列の宣言（intの場合）
  //int[] scores = new int [5];
  
  //配列の長さを調べる
  // int num = scores.length;
  
  //配列の代入
  // int[] scores = new int [5];
  // scores [1] = 30;
  // System.out.println(scores[1]);
  
  // int [] scores = {20, 30, 40, 50, 80};
  // int sum =scores[0] + scores[1] + scores[2] + scores[3] + scores[4]; 
  // int avg = sum / scores.length;
  // System.out.println("合計点:" + sum);
  // System.out.println("平均点:" + avg);
  
  //for文
  // int [] scores = {20, 30, 40, 50};
  // for (int i = 0; i < scores.length; i++) {
  //   System.out.println(scores[i]);
  
  // int [] scores = {20, 30, 40, 50, 80};
  // int sum = 0;
  // for (int i = 0; i < scores.length; i++) {
  // sum += scores[i];
  // }
  // int avg = sum / scores.length;
  // System.out.println("合計点:" + sum);
  // System.out.println("平均点:" + avg);
  
  //特定の要素を調べる
  int [] scores = {20, 30, 40, 50, 80};
  int count = 0;
  for (int i = 0; i < scores.length; i++){
  if (scores[i] >=50){
    count++;
  }
  }
  System.out.println("50点以上の科目の数は:" + count);
  }
}
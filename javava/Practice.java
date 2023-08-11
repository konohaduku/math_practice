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
    
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力して下さい");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    String age = new java.util.Scanner(System.in).nextLine();
    int n = Integer.parseInt(age);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果が出ました！");
    System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune +"です");
    System.out.println("1:大吉 2:中吉 3:小吉 4:凶");
  }
}
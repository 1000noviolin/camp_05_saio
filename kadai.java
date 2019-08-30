import java.util.Scanner;

public class kadai {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("★次の設問に当てはまるものに数字で答えてください★");
            String[] questions;
        questions = new String[5];
        questions[0] ="1.きのこの山よりたけのこの里が好き \n 1.いいえ　2.はい";
        questions[1] ="2.一人で焼肉に行った事がある \n 1.いいえ　2.はい";
        questions[2] ="3.ホラー映画が好き \n 1.いいえ　2.はい";
        questions[3] ="4.朝ごはんは毎日同じものを食べる \n 1.いいえ　2.はい";
        questions[4] ="5.カロリーメイトはフルーツ味が一番 \n 1.いいえ　2.はい";


//設問5つ
        int sum = 0;
        String result = "";
//        int[] answers = new int[5];
            for(int i =0; i < 5; i++){
                System.out.println(questions[i]);
//答え
                int ans = scanner.nextInt();
//                String answer = scanner.next();
                System.out.println(ans);

//                sum = sum + ans;
                sum += ans;
//                answers[i] = ans;
            }

            System.out.println(sum);
//相性
        if(sum <= 5) result = "相性は10%くらいです";
        else if(sum <= 7) result = "相性は50%くらいです";
        else if(sum <= 9) result = "相性は80%くらいです";
        else if(sum <= 10) result = "相性は100%です！";
        System.out.println(result);




    }
}

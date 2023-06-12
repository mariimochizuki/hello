import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        //int secretNumber = (int) (Math.random() * 90) + 10; // 10から99までの乱数を生成
        int secretNumber = 10;
        int attemptsLeft = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("2桁の数を当ててください。");
        System.out.println("数を入力してください（残りの試行回数: " + attemptsLeft + "）:");

        while (attemptsLeft > 0) {
            int guessedNumber = scanner.nextInt();

            if (guessedNumber == secretNumber) {
                System.out.println("当たり！正解は " + secretNumber + " でした。");
                break;
            } else {
                if (Math.abs(guessedNumber - secretNumber) >= 20) {
                    System.out.println("残念！大きすぎるか小さすぎます。");
                } else if (guessedNumber > secretNumber) {
                    System.out.println("残念！20以上小さい数です。");
                } else {
                    System.out.println("残念！20以上大きい数です。");
                }

                attemptsLeft--;
                if (attemptsLeft > 0) {
                    System.out.println("もう一度数を入力してください（残りの試行回数: " + attemptsLeft + "）:");
                }
            }
        }

        if (attemptsLeft == 0) {
            System.out.println("ゲームオーバー！正解は " + secretNumber + " でした。");
        }

        scanner.close();
    }
}

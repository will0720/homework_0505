import java.util.*;

public class A1113302_0505_1 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        int [] lottery = {2, 43, 27, 23, 19, 10};
        int count = 0;
        try {
            int [] tryLottery = new int [6];
            System.out.println("歡迎使用樂透系統，請依序輸入六個1~49的整數");

            for(int i = 0 ; i < tryLottery.length ; i++) {
                System.out.println("請輸入第" + (i + 1) + "個數字:");
                tryLottery[i] = sc.nextInt();

                if(tryLottery[i] < 1 | tryLottery[i] > 49) {
                    throw new RuntimeException();
                }

                if(tryLottery[i] == lottery[i]) {
                    count++;
                }
            }

            if(count == 6) {
                System.out.println("中六個數");
            } else if(count == 5) {
                System.out.println("中五個數");
            } else if(count == 4) {
                System.out.println("中四個數");
            } else if(count == 3) {
                System.out.println("中三個數");
            } else if(count == 2) {
                System.out.println("中二個數");
            } else if(count == 1) {
                System.out.println("中一個數");
            } else if(count == 0) {
                System.out.println("全沒中");
            }
        } catch(RuntimeException e) {
            System.out.println("例外情形:" + e);
            System.out.println("輸入數值有誤，請輸入1~49之間的整數!");
        }
    }
}
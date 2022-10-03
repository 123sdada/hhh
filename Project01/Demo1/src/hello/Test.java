package hello;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int you = 0, liang = 0, zhong = 0, jige = 0, bujige = 0;
        int score[] = new int[10]; //开辟了一个装10个整型数据的数组
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10个整数");
        int i = 0;
        for (; ; ) {
            if (i > 9) {  //设置循环终止条件
                break;
            }
            int temp = sc.nextInt();  //用来输入那10人的成绩
            if (temp >= 0 && temp <= 100) {
                switch (temp / 10) {
                    case 10:
                    case 9:
                        you++;
                        break;
                    case 8:
                        liang++;
                        break;
                    case 7:
                        zhong++;
                        break;
                    case 6:
                        jige++;
                        break;
                    default:
                        bujige++;
                }
                score[i] = temp;
                i++;
            } else {
                System.out.println("输入数据的范围不正确!范围在[0,100]之间\n");
            }
        }
        System.out.println("输入的成绩如下：");
        for (int j : score) {
            System.out.print(j + "      ");
        }
        System.out.println("");
        System.out.println("各分数段的人数比例，分别如下:");
        System.out.println("100~90|89~80|79~70|69~60|0~60");
        System.out.printf("%.1f\t%.1f\t%.1f\t%.1f\t%.1f", you / 10.0, liang / 10.0, zhong / 10.0, jige / 10.0, bujige / 10.0);

    }

}

package hello;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int you = 0, liang = 0, zhong = 0, jige = 0, bujige = 0;
        int score[] = new int[10]; //������һ��װ10���������ݵ�����
        Scanner sc = new Scanner(System.in);
        System.out.println("������10������");
        int i = 0;
        for (; ; ) {
            if (i > 9) {  //����ѭ����ֹ����
                break;
            }
            int temp = sc.nextInt();  //����������10�˵ĳɼ�
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
                System.out.println("�������ݵķ�Χ����ȷ!��Χ��[0,100]֮��\n");
            }
        }
        System.out.println("����ĳɼ����£�");
        for (int j : score) {
            System.out.print(j + "      ");
        }
        System.out.println("");
        System.out.println("�������ε������������ֱ�����:");
        System.out.println("100~90|89~80|79~70|69~60|0~60");
        System.out.printf("%.1f\t%.1f\t%.1f\t%.1f\t%.1f", you / 10.0, liang / 10.0, zhong / 10.0, jige / 10.0, bujige / 10.0);

    }

}

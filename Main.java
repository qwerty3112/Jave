package com.company;

import java.util.Scanner;

public class Main { // Варіант 17
    public static double findDist(int x, int y, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x,2)+Math.pow(y2-y,2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть завдання: 1 - оператора розгалуження if;    2 - Відстань точок;    3 - Місяці;    4 - Рівняння;");
        int quest = scanner.nextInt();
        switch (quest) {
            case 1:
                System.out.println("Оберіть спосіб:\n1 - З використанням скороченої форми;\n2 - З використанням повної форми");
                quest = scanner.nextInt();
                try {
                    System.out.println("Введіть два додатніх числа s та t: ");
                    float s = scanner.nextFloat(), t = scanner.nextFloat();
                    switch (quest) {
                        case 1:
                            if (s == -7)
                                System.out.println("k = " + ((s/t)+(2*s*t)));
                            if (s == 7)
                                System.out.println("k = " + (float)Math.sqrt((s/t)+(2*s*t)));
                            if (s == 14)
                                System.out.println("k = " + (Math.pow(s,2)+(2*t)));
                            if (s!=7 && s!=-7 && s!=14){
                                throw new Exception();
                            }
                            break;
                        case 2:
                            if (s == -7)
                                System.out.println("k = " + ((s/t)+(2*s*t)));
                            else if (s == 7)
                                System.out.println("k = " + (float)Math.sqrt((s/t)+(2*s*t)));
                            else if (s == 14)
                                System.out.println("k = " + (Math.pow(s,2)+(2*t)));
                            else
                                throw new Exception();
                            break;
                    }
                } catch (Exception ex) {
                    System.out.println("Розв'язків нема");
                }
                break;
            case 2:
                System.out.println("Введіть координати точки A(x,y)");
                int x1=scanner.nextInt(),y1=scanner.nextInt();
                System.out.println("Введіть координати точки B(x,y)");
                int x2=scanner.nextInt(),y2=scanner.nextInt();
                System.out.println("Введіть координати точки C(x,y)");
                int x3=scanner.nextInt(),y3=scanner.nextInt();

                if (!(x1==x2&&x2==x3&&y1==y2&&y2==y3)){
                    if (findDist(x1,y1,x2,y2)==findDist(x1,y1,x3,y3))
                    {
                        System.out.println("Точки мають однакову дистанцію: "+(float)findDist(x1,y1,x2,y2));
                    }
                    else if (findDist(x1,y1,x2,y2)>findDist(x1,y1,x3,y3)){
                        System.out.println("Навіддленіше точка до А - В("+x2+","+y2+")\tДистанція: "+(float)findDist(x1,y1,x2,y2));
                    }
                    else
                        System.out.println("Навіддленіше точка до А - С("+x2+","+y2+")\tДистанція: "+(float)findDist(x1,y1,x3,y3));
                } else{
                    System.out.println("Точки мають однакові кординати.");
                }
                break;
            case 3:
                System.out.println("Введіть порядковий номер місяця:");
                quest = scanner.nextInt();
                switch (quest){
                    case 1:
                        System.out.println("Січень");
                        break;
                    case 2:
                        System.out.println("Лютий");
                        break;
                    case 3:
                        System.out.println("Березень");
                        break;
                    case 4:
                        System.out.println("Квітень");
                        break;
                    case 5:
                        System.out.println("Травень");
                        break;
                    case 6:
                        System.out.println("Червень");
                        break;
                    case 7:
                        System.out.println("Липень");
                        break;
                    case 8:
                        System.out.println("Сервень");
                        break;
                    case 9:
                        System.out.println("Вересень");
                        break;
                    case 10:
                        System.out.println("Жовтень");
                        break;
                    case 11:
                        System.out.println("Листопад");
                        break;
                    case 12:
                        System.out.println("Грудень");
                        break;
                    default:
                        System.out.println("Помилка значення");
                }
                break;
            case 4:
                try {
                    System.out.println("Введіть 2 додатніх числа x та у:");
                    float x = scanner.nextFloat(), y = scanner.nextFloat();
                    if (x>0&&y>0){
                        System.out.println("Введіть 1 ціле число z:");
                        float z = scanner.nextFloat();
                        double res = (Math.pow(x,2)+(2*x*z)-Math.pow(y,2))/(Math.sqrt(2*x)-Math.pow(x,2)*y);
                        System.out.println("a = " + (float)res);
                    }else{
                        throw new Exception();
                    }
                    break;
                } catch (Exception ex) {
                    System.out.println("Невірне число.");
                }
                break;
        }
    }
}
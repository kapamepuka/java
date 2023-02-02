package java_homework_4;

import java.util.Scanner;
import java.util.Stack;
import java.util.Objects;

public class task_3 {
    public static void main(String[] args) {
        int a; // если заменить на doble бедет считать точнее ;)
        int b;
        int res = 0;
        String op;
        Scanner sc = new Scanner(System.in);
        a = inputNum("Введите 1е число: ");
        b = inputNum("Введите 2е число: ");
        op = inputStr("\nВведите оператор (+, -, *, /): ");
        Stack<Integer> stack = new Stack<>();
        if (Objects.equals(op, "+"))     {res = a + b;}
        else if(Objects.equals(op, "-")) {res = a - b;}
        else if(Objects.equals(op, "*")) {res = a * b;}
        else if(Objects.equals(op, "/")) {res = a / b;}
        else System.out.printf("Неверный ввод !");
        
        System.out.println("ответ:" + res);

        stack.push(res);
        while (true)
        {
            op = inputStr("\n> Введите оператор (+, -, *, /), " + 
            "\n> Либо ведите \"no\" для" +
            "удаление последнего результата(oper или no) ");
            if (Objects.equals(op, "no"))
            {
                System.out.println("удаленное значение: " + stack.pop());
                res = stack.peek(); 
                System.out.println("Текущее значение: " + res);              
            }
            else
            {
                b = inputNum("Введите число: ");
                if (Objects.equals(op, "+"))     {res = res + b;}
                else if(Objects.equals(op, "-")) {res = res - b;}
                else if(Objects.equals(op, "*")) {res = res * b;}
                else if(Objects.equals(op, "/")) {res = res / b;}
                else System.out.printf("Неверный ввод !");
                stack.push(res);
                System.out.println("ответ = " + res);
                
                


            }    
                    
  
        }
    }
    public static int inputNum(String text)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        int num = scan.nextInt();
        //scan.close(); //не могу закрыть прга крашится !!!
        return num;
    }
    public static String inputStr(String text)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        String str = scan.nextLine();
        return str;
    }
    }
    


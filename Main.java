import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в текствовый квест про космос. Перед началом игры введите информацию про своего персонажа.");
        System.out.println("Введите имя");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Введите пол");
        String gender = new Scanner(System.in).nextLine();
        System.out.println("Введите возраст");
        String age = new Scanner(System.in).nextLine();
        System.out.println("Сейчас начнёться игра. ");
        System.out.println("Внимание, это лишь демо версия простых наработок человека изучающего Java основаная на вымышленных событиях, фантазии и преднях автора.");
        System.out.println("Так же в игре возможны орфографические и пунктуционные ошибки. Для выполнения действия введите цифру от 1 до 2, цифра действия указана рядом с действием.");
        System.out.println("   ");
        System.out.println("   ");
        System.out.println("Вы просыпаетесь в скафандре в открытом космосе. Вокруг вас лишь бесконечный космос, звёзды и непонятная планета.");
        System.out.println("Вы замечаете трос обхватывающий ваш скафандр и идущий в противоположную сторону от планеты, конец троса невидно ведь его скрывает темнота.");
        System.out.println("Вы не помните кто вы и как здесь оказались, на скафандре вы видите следующую информацию. Имя:" + name +"." + "Возраст:" + "." + age + "Пол:" + gender + ".");
        System.out.println("Вдруг раздаётся неприятный, роботизированый голос: Внимание запас кислорода критически мал, по предварительным рассчётам его хватит на 5 минут.");
        System.out.println("Вы замечаете кнопку с надписью: Активировать реактивный ранец");
        System.out.println("Что сделать?");
        System.out.println("1 - Ипользуя трос добраться до его конца в темноте");
        System.out.println("2 - Отвязать трос и используя ранец добраться до планеты");
        int action = new Scanner(System.in).nextInt();
        if (action == 1) {
            Story_1 story1 = new Story_1();
            story1.Story();
        }
        if (action == 2){
            Story_2 story2 = new Story_2();
            story2.Story();
        }
    }
}

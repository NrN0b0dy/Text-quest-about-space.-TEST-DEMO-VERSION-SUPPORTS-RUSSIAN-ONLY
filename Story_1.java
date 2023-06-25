import java.util.Scanner;

public class Story_1 {
    public void Start (){
        System.out.println("Вы начинаете тянуть трос на себя понемного двигаясь в бескрайнею пустоту.");
        System.out.println("Спустя минуту вы начинаете видеть чёрное очертание неизвестного объекта к которому идёт трос");
        System.out.println("Объект похож на каку-ето станцию. Спустя минуту вы отчётливо видите объект, это космическая станция, но кака-ето не обычная, как будто из бужущего.");
        System.out.println("А сам трос идёд к открытому люку станции");
        System.out.println("Спустя ещё минуту передвижения вы уже перед люком.");
        System.out.println("Снаружи как и внутри станция выглядит повреждённой и давно заброшеной");
        System.out.println("Что сделать дальше?");
        System.out.println("1 - Остаться снаружи");
        System.out.println("2 - Зайти внутрь");
        int action = new Scanner(System.in).nextInt();
        if (action == 1){
            System.out.println("Вы приняли решение не идти к неизвестному и остаться здесь. Пугливый поступок учитывая вашу ситуацию");
            System.out.println("Спустя время вы чуствуете слабость, у вас начинат темнеть в лазах.");
            System.out.println("И вот вы закрыли глаза уже в последний раз. Последнее, что вы слышали тот самый голос:");
            System.out.println("Внимание, запас кислорода смертельно мал.");
        } else if (action == 2) {
            Continuation();
        }
    }
    public void Continuation (){
        System.out.println("Вы зашли в шлюз станции, внутри вы увидели два трупа в скафандрах, рабросаный детали обшивки и электроники и закрытую дверь во внутренею часть станции");
        System.out.println("Как вруг что-то или кто-то ударило вас по голове и вы упали без сознания");
        System.out.println("Спустя время вы пришили в себя но уже без шлема и троса, но не смотря на это вы могли дышать.");
        System.out.println("Шлюз через который вы зашли был закрыт, но зато был открыт внутрений. Так же не пойми от куда на полу появился фонарик.");
        System.out.println("Вооружившись им вы пошли вперёд иследовать станцию.");
        System.out.println("Пройдя немного вперёд вы оказались в вертикалном коридоре с лестницей. У вас есть выбор.");
        System.out.println("1 - Отправиться вниз");
        System.out.println("2 - Отправиться в верх");
        int action = new Scanner(System.in).nextInt();
        if (action == 1){
            Continuation1();
        } else if (action == 2) {
            Continuation2();
        }
    }
    public void Continuation1 (){
        System.out.println("Спустя минуту спуска вы оказались перед открытой дверью с надписью: Серверная и другие технические помещения.");
        System.out.println("Зайдя в дверь вы оказались в комнате с огромным количеством серверов, а также терминалом и дверью в конце комнаты с надписью: Реакторная.");
        System.out.println("1 - Подойти к терминалу");
        System.out.println("2 - Покинуть комнату через дверь");
        int action = new Scanner(System.in).nextInt();
        if (action == 1) {
            System.out.println("Вы подошли к терминалу, это был обычный архивный терминал, на нём был открыт файл под названием: Информация об экспедиции.txt ");
            System.out.println("Как только вы подошли на экране терминалу на нём показалась надпись: Внимание заряда хватит ещё на пять мунт работы");
            System.out.println("По этому вы решили прочитать лишь открытй файл. В нём было написано:");
            System.out.println("Название экспедиции: Красный орёл" + System.lineSeparator() + "Точка отправления: Фазовый врата №86 сектора LPC13" + System.lineSeparator() + "Точка прибытия: Сектор ZGP12, планета RTP56");
            System.out.println("Дата отправления: 19.06.2100" + System.lineSeparator() + "Примерная дата прибытия: 19.06.2101" + System.lineSeparator() + "Цель экспедиции: Изучения планеты, взятие различных образцов и развёртывание фазовых врат");
            System.out.println("Модель и тип станции: TPG134 HPT20" + System.lineSeparator() + "Экипаж экспедиции:..." );
            System.out.println("И тут неожидано терминал выключился. Поняв, что больше ничего найти вы здесь не сможете и по этому покинули комнату через дверь, которую видели раньше");
            Continuation1_1
        }
        if (action == 2){
            Continuation1_1
        }
    }
    public void Continuation1_1 {
        System.out.println("Войдя в комнату вы увидели в центре колонну с огромным количеством мониторов, датчиков, кнопок, отверстий и надписей.");
        System.out.println("Центр колонны выглядел как какой-то стеклянный резевруар с непонятной слизкой жидкостью, в которой находиться непонятный синий куб испускающий свет");
        System.out.println("По бокам комнаты есть три закрытые двери с надписьями. Надпись над первой: двигательная, над второй: склад, над третьей: центр технического контроля");
        System.out.println("Вдруг корабль содрогнула тряска, раздался роботизированый голос: Внимание, произошло несанкционированное включение двигателей, так же открылась дверь с надписью: Центр технического контроля и от потолка отвалилась панель, из нового прохода появилась лестница ведущая в него.");
        System.out.println("Что сделать?");
        System.out.println("1 - Зайти в открывшуюся дверь");
        System.out.println("2 - Подняться по лестнице");
        int action = new Scanner(System.in).nextInt();
        if (action==1){
            System.out.println("В комнате в которую вы вошли стоит шесть больших компьютеров, монитор одного из них горит на нём написано: Приложите палец к панели для индефикации по отпечатку");
            System.out.println("Вы подошли к нему и приложили палец, на экране появилась надпись: Добро пожаловать сотрудник службы технического обслуживания. Внимание недавно произошло несанкционированное включение двигателей");
            System.out.println("Предпалагаемая причина: проникновение на судно неопознанного существа или побег одного из объектов содержания из хранилища. Вывод сделан на основе авариного запуска системы безопасности");
            System.out.println("Вдруг экран погас. Поняв, что ничего больше вы найти сдесь не сможете вы покинули комнату и поднялись по лестнице.");
            Continuation1_2
        }
        if (action==2){
            Continuation1_2
        }
    }
    public void Continuation1_2 {
        System.out.println("Спустя минуту подъёма по лестнице вы оказались в коридоре с открытой дверью и надписью: Комната управления полётом");
        System.out.println("Войдя в неё вы увидели 6 различных пультов управления и стулья рядом с ними. Каждый из них был подписан. Противоположная стена комнаты была стеклянной");
        System.out.println("Вдруг раздался роботизированый голос: Просьба вошедшего сотрудника службы тезнического обслуживания потвердить заданые параметры полёта, для отправления корабля по причине исчезновения большей части экипажа, серьёзного повреждения корабля, а так же нахождения на корабле неизвестого существа");
        System.out.println("Вдруг на терминале в центре загарается большая красная кнопа с надпись: Запуск. Подойдя к терминалу вы нажимаете на кнопку и вдруг корабь взрываеться вместе с вами.");
        System.out.println("Последнее, что вы слышали тот самый голос корабля: Внимание критическое повреждение двигателя корабля. До взрыва осталось 10 секунд");
        System.out.println("Конец первой вариации сюжета. Спасибо за игру.");
    }
    public void Continuation2 (){
        System.out.println("Спустя минуту вы оказались перед четырмя закрытыми дверьми, не успели вы прочитать надписи, как вдруг проход под вами закрылся");
        System.out.println("И вдруг что-то пронзило вас, последнее что вы слышали: Объект устранён, перевод станции в обычный режим работы.");
    }
}

package homeworks.homework_4.task_3.application;

import homeworks.homework_4.task_3.workers.ServiceDesk;

public class Application {
    public static void main(String[] args) {
        ServiceDesk serviceDesk = new ServiceDesk();
        serviceDesk.createTicket("Прошу предоставить справку 2-ндфл за текущий год");
        System.out.println();
        serviceDesk.createTicket("Прошу предоставить курьера 2 сентября 2020 года");
        System.out.println();
        serviceDesk.createTicket("Необходимо починить принтер в комнате 207");
        System.out.println();
        serviceDesk.createTicket("Прошу произвести внеплановую уборку в переговорной №1");
        System.out.println();
        serviceDesk.createTicket("Прошу выдать канцелярские принадлежности сотруднику Баранову А.С.");
    }
}

package homeworks.homework_8.task_3;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Terminal> terminals = Arrays.asList(
                new QiwiTerminal("г. Владимир, ул. Растопчина, д.37"),
                new EleksnetTerminal("г. Ярославль, Ростовский пр-т, 56а"),
                new EleksnetTerminal("г. Иваново, ул. Куконковых, д.111"),
                new EleksnetTerminal("г. Туапсе, ул. Красноармейская, д. 2"),
                new TinkoffTerminal("г. Москва, Кутузовский пр-т, д. 5")
        );

        for (Terminal terminal : terminals) {
            terminal.pay("+7(910)183-0150", 50);
            terminal.pay("+7(910)272-0150", 150);
            terminal.pay("+7(910)361-0300", 300);
            terminal.pay("+7(910)458-0450", 450);
            terminal.pay("+7(910)547-0600", 600);
            terminal.pay("+7(910)636-0800", 800);
            terminal.pay("+7(910)725-1000", 1000);
            terminal.pay("+7(910)814-1500", 1500);
        }

    }
}
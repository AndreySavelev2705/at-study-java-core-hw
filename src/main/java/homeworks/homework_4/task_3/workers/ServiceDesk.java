package homeworks.homework_4.task_3.workers;

public class ServiceDesk {
    private int number = 1;

    public void createTicket(String description) {
        System.out.printf("Заявка %d была создана: %s", number, description);

        if (description.matches("^(.*)((справк[уаиой]|отчет[уаы]|бюджет[уа]))(.*)$")) {
            number++;
            Accountant.takeTicket(number);
            return;
        }
        if (description.matches("^(.*)((достав[куаиойть]|курь[еромаы]))(.*)$")) {
            number++;
            Logistician.takeTicket(number);
            return;
        }
        if (description.matches("^(.*)((компьют[еруаиой]|принт[еруаы]|серв[ерыуа]))(.*)$")) {
            number++;
            SysAdmin.takeTicket(number);
            return;
        }
        if (description.matches("^(.*)((уб[оркатьуиой]))(.*)$")) {
            number++;
            Cleaner.takeTicket(number);
            return;
        } else System.out.printf("%nСпециалист по выполнению заявки %d не найден", number);

    }
}

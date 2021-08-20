package homeworks.homework_10.task_4;

import homeworks.homework_10.task_4.model.CashDocument;
import homeworks.homework_10.task_4.model.SalaryDocument;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        new SalaryDocument().generate().save();
        new CashDocument().generate().save();
    }

}

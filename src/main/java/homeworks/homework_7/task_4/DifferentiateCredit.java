package homeworks.homework_7.task_4;

import java.util.ArrayList;

public class DifferentiateCredit extends BaseCredit{
    public DifferentiateCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public ArrayList<Double> getMonthPayments() {
        return super.getMonthPayments();
    }
}

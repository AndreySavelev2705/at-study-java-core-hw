package homeworks.homework_8.task_3;

public class EleksnetTerminal extends Terminal {

    public EleksnetTerminal(String address) {
        super(address);
        owner = Owner.ELEKSNET;
        tax = 11;
        noTaxLimit = 300;
    }
}

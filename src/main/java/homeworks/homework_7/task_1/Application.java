package homeworks.homework_7.task_1;

public class Application {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList();

        myArrayList.size();
        myArrayList.add("Москвич");
        myArrayList.contains("Жигули");
        myArrayList.contains("Москвич");
        myArrayList.get(0);
        System.out.println(myArrayList.get(100));
        myArrayList.add(1,"Запорожец");
        myArrayList.add(100,"Волга");
        myArrayList.get(0);
    }
}

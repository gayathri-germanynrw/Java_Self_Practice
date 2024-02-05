package day04_practice_tasks;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 3;
        switch(selection){
            case 1:
                System.out.println("Hello, thank you for your call");
                break;
            case 2:
                System.out.println("Hola,gracias por IIamar:\n");
                break;
            case 3:
                System.out.println("Merhaba, aradinginiz icin esekkurrior");
                break;
            case 4:
                System.out.println("hallo , vielen dank fur Ihre Anruf");
                break;
            case 5:
                System.out.println("vanga , vanakkam :\n");
                break;
            default:
                System.out.println(" please select the language :\n");
                break;
        }


    }
}

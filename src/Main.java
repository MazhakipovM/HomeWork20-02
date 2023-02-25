public class Main {
    public static void main(String[] args) {

        ///zadacha 1
        int age = 19;
        if (age >= 18) {
            System.out.println("Он совершеннолетний.");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }


        //zadacha 2
        int temperature = 20;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов,можно идти без шапки");
        }


        //zadacha 3
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф ");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }


//        ///zadacha 4
        int chelovek = 45;
        if (chelovek <= 6 && chelovek >= 2) {
            System.out.println("Если возраст человека равен " + chelovek + ", то ему нужно ходить в детский сад.");
        }
         else if (chelovek <= 18 && chelovek > 6) {
            System.out.println("Если возраст человека равен " + chelovek + ", то ему нужно ходить в школу.");
        }
        else if (chelovek <= 24 && chelovek > 18) {
            System.out.println("Если возраст человека равен " + chelovek + ", то ему нужно ходить в университет.");
        }
        else  {
            System.out.println("Если возраст человека равен " + chelovek + ", то ему нужно ходить на работу.");
        }


        //zadacha 5

        int kid = 15;
        if(kid <= 5){
            System.out.println("Если возраст ребенка равен " +kid + ", то ему нельзя кататься на аттракционе");
        } else if ( kid <5 && kid < 14) {
            System.out.println("Если возраст ребенка равен " +kid + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " +kid + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }


        //zadacha 6

        int mesto = 1;
        int sidyachee = 60;
        int stoyachie = 42;
        if (sidyachee + mesto <= 60 || stoyachie + mesto <= 42 ){
            System.out.println("Место есть");
        }else {
            System.out.println("Мест нет");
        }


        ///zadacha 7
        int one = 1;
        int three = 3;
        int two = 2;
        if (one > two && one > three){
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        }else {
            System.out.println(three);
        }



    }
    }
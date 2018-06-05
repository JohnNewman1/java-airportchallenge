import java.util.Random;

class Weather {


    boolean get(int num){

        Random rand = new Random(num);
        int n = rand.nextInt(10) + 1;

        return (n >= 5);

    }


}


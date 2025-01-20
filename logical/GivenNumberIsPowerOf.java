package logical;

public class GivenNumberIsPowerOf {


    public static boolean isPower(int powerOf, int givenNumber) {
        if (givenNumber == 0)
            return false;

        while (givenNumber!= 1) {
            if (givenNumber % powerOf != 0)
                return false;
            givenNumber = givenNumber / powerOf;
        }
        return true;
    }



    public static void main(String[] args) {
        //2*2*2*2=16
        //8 pwoerOf 2
        System.out.println(isPower(8,64));
    }
}

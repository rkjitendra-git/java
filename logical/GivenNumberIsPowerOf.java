package logical;

public class GivenNumberIsPowerOf {

    //2,4
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
        int number=32;
        System.out.println(isPower(4,number));
    }
}

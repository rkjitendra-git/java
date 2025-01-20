package logical;

public class PowerOfGivenNumber
{
    public static int powerOf(int base, int exponent){
      if (exponent==0)
          return 1;
      return base*powerOf(base,exponent-1);

    }

    public static void main(String[] args) {
        System.out.println(powerOf(2,3));
    }
}

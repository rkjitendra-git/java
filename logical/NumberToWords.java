package logical;

public class NumberToWords {
    private static final String[] singleDigits = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        int number = 123456789;
        System.out.println(convertToWords(number));
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }
        return convert(number).trim();
    }

    private static String convert(int number) {
        if (number < 10) {
            return singleDigits[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " + convert(number % 10) : "");
        } else if (number < 1000) {
            return singleDigits[number / 100] + " Hundred" + ((number % 100 != 0) ? " and " + convert(number % 100) : "");
        } else if (number < 100000) { // up to 99,999
            return convert(number / 1000) + " Thousand" + ((number % 1000 != 0) ? " " + convert(number % 1000) : "");
        } else if (number < 10000000) { // up to 99,99,999
            return convert(number / 100000) + " Lakh" + ((number % 100000 != 0) ? " " + convert(number % 100000) : "");
        } else { // up to 99,99,99,999
            return convert(number / 10000000) + " Crore" + ((number % 10000000 != 0) ? " " + convert(number % 10000000) : "");
        }
    }
}

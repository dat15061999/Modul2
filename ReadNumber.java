import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        numberToText();
    }

    private  static void numberToText() {
        System.out.println("Nhap so can doc");
        int number = new Scanner(System.in).nextInt();
        String numberTxt = "";
        if (0 <= number && number < 10) {
            numberTxt += getUnitsTxt(Integer.toString(number),true);
        } else if (number >= 10 && number < 20) {
            switch (number) {
                case 10:
                    numberTxt = "ten";
                    break;
                case 11:
                    numberTxt="eleven";
                    break;
                case 12:
                    numberTxt="twelve";
                    break;
                case 13:
                    numberTxt="thirteen";
                    break;
                case 14:
                    numberTxt="fourteen";
                    break;
                case 15:
                    numberTxt="fifteen";
                    break;
                case 16:
                    numberTxt="sixteen";
                    break;
                case 17:
                    numberTxt="seventeen";
                    break;
                case 18:
                    numberTxt="eighteen";
                    break;
                case 19:
                    numberTxt="nineteen";
                    break;
            }
        } else if (number >= 20 && number < 100) {
            String units = Integer.toString(number).substring(1);
            String tens = Integer.toString(number).substring(0, 1);
            switch (Integer.parseInt(tens)) {
                case 2:
                    numberTxt = "twenty";
                    break;
                case 3:
                    numberTxt = "thirty";
                    break;
                case 4:
                    numberTxt = "fourty";
                    break;
                case 5:
                    numberTxt = "fifty";
                    break;
                case 6:
                    numberTxt = "sixty";
                    break;
                case 7:
                    numberTxt = "seventy";
                    break;
                case 8:
                    numberTxt = "eighty";
                    break;
                case 9:
                    numberTxt = "ninety";
                    break;
            }

            numberTxt += getUnitsTxt(units,false);

        } else if (number < 1000) {
            String units = Integer.toString(number).substring(2);
            String tens = Integer.toString(number).substring(1, 2);
            String hundreds = Integer.toString(number).substring(0, 1);
            switch (Integer.parseInt(hundreds)) {
                case 1:
                    numberTxt = "one hundred";
                    break;
                case 2:
                    numberTxt = "two hundred";
                    break;
                case 3:
                    numberTxt = "three hundred";
                    break;
                case 4:
                    numberTxt = "four hundred";
                    break;
                case 5:
                    numberTxt = "fine hundred";
                    break;
                case 6:
                    numberTxt = "six hundred";
                    break;
                case 7:
                    numberTxt = "seven hundred";
                    break;
                case 8:
                    numberTxt = "eight hundred";
                    break;
                case 9:
                    numberTxt = "ninet hundred";
                    break;
            }
            numberTxt += " and ";

            switch (Integer.parseInt(tens)) {
                case 2:
                    numberTxt += "twenty";
                    break;
                case 3:
                    numberTxt += "thirty";
                    break;
                case 4:
                    numberTxt += "fourty";
                    break;
                case 5:
                    numberTxt += "fifty";
                    break;
                case 6:
                    numberTxt += "sixty";
                    break;
                case 7:
                    numberTxt += "seventy";
                    break;
                case 8:
                    numberTxt += "eighty";
                    break;
                case 9:
                    numberTxt += "ninety";
                    break;
            }

            numberTxt += getUnitsTxt(units,false);
        }
        System.out.print(numberTxt);
        numberToText();
    }

    private static String getUnitsTxt(String units,Boolean isUnits ) {
        String numberTxt = "";
        switch (Integer.parseInt(units)) {
            case 0:
                if (isUnits) {
                    numberTxt = "zero";
                }
                break;
            case 1:
                numberTxt = " one";
                break;
            case 2:
                numberTxt = " two";
                break;
            case 3:
                numberTxt = " three";
                break;
            case 4:
                numberTxt = " four";
                break;
            case 5:
                numberTxt = " fine";
                break;
            case 6:
                numberTxt = " six";
                break;
            case 7:
                numberTxt = " seven";
                break;
            case 8:
                numberTxt = " eight";
                break;
            case 9:
                numberTxt = " nine";
                break;
        }

        return numberTxt;
    }


}

// 1-> 10
// 11-> 20
// 20 -> 99

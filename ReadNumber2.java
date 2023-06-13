import java.util.Scanner;


public class ReadNumber2 {
    public static void main(String[] args) {
        System.out.println("Nhap so can doc");
        int number = new Scanner(System.in).nextInt();
        if (0 <= number && number < 10) {
            switch (number) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("fine");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else if (number >= 10 && number < 20) {
            switch (number) {
                case 10:
                    System.out.print("ten");
                    break;
                case 11:
                    System.out.print("eleven");
                    break;
                case 12:
                    System.out.print("twelve");
                    break;
                case 13:
                    System.out.print("thirteen");
                    break;
                case 14:
                    System.out.print("fourteen");
                    break;
                case 15:
                    System.out.print("fifteen");
                    break;
                case 16:
                    System.out.print("sixteen");
                    break;
                case 17:
                    System.out.print("seventeen");
                    break;
                case 18:
                    System.out.print("eighteen");
                    break;
                case 19:
                    System.out.print("nineteen");
                    break;
            }
        } else if (number >= 20 && number < 100) {
            String units = Integer.toString(number).substring(1);
            String tens = Integer.toString(number).substring(0, 1);
            String numberTxt = "";
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

            switch (Integer.parseInt(units)) {
                case 0:
                    break;
                case 1:
                    numberTxt += " one";
                    break;
                case 2:
                    numberTxt += " two";
                    break;
                case 3:
                    numberTxt += " three";
                    break;
                case 4:
                    numberTxt += " four";
                    break;
                case 5:
                    numberTxt += " fine";
                    break;
                case 6:
                    numberTxt += " six";
                    break;
                case 7:
                    numberTxt += " seven";
                    break;
                case 8:
                    numberTxt += " eight";
                    break;
                case 9:
                    numberTxt += " nine";
                    break;
            }

            System.out.print(numberTxt);
        } else if (number<1000 ){
            String units = Integer.toString(number).substring(2);
            String tens = Integer.toString(number).substring(1, 2);
            String hundreds = Integer.toString(number).substring(0,1);
            String numberTxt = "";
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
            numberTxt+=" and ";

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

            switch (Integer.parseInt(units)) {
                case 0:
                    break;
                case 1:
                    numberTxt += " one";
                    break;
                case 2:
                    numberTxt += " two";
                    break;
                case 3:
                    numberTxt += " three";
                    break;
                case 4:
                    numberTxt += " four";
                    break;
                case 5:
                    numberTxt += " fine";
                    break;
                case 6:
                    numberTxt += " six";
                    break;
                case 7:
                    numberTxt += " seven";
                    break;
                case 8:
                    numberTxt += " eight";
                    break;
                case 9:
                    numberTxt += " nine";
                    break;
            }
            System.out.print(numberTxt);

        }
    }
}


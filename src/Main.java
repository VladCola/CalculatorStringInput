// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main
{
    public static void main (String[]args)
    {

        Scanner in_string_user = new Scanner (System.in);
        String Simbols = in_string_user.nextLine ();
        String[] parts = new String[2];

        Simbols = Simbols.replaceAll (" ", "");
        int R2 = 0;
        int m = 0;
        int[] Num = new int[2];
        int R = 0;
        int R1 = 0;
        int z = 0;
        char[] Znaki = { '+', '-', '*', '/' };
        int sum = 0;

        for (int i = 0; i < 4; i++)
        {
            if ((Simbols.indexOf (Znaki[i]) + 1) == 0)
            {
            }
            else
            {
                z = i + 1;
                R = R + 1;
                R1 = Simbols.indexOf (Znaki[i]);
                if ((Simbols.indexOf (Znaki[i], Simbols.indexOf (Znaki[i]) + 1) +
                        1) == 0)
                {
                }
                else
                {
                    R = R + 1;
                }
            }
        }
        switch (z)
        {
            case 1:
                parts = Simbols.split ("\\+");
                break;
            case 2:
                parts = Simbols.split ("-");
                break;
            case 3:
                parts = Simbols.split ("\\*");
                break;
            case 4:
                parts = Simbols.split ("/");
                break;

        }



        if (R == 1)
        {
            for (int i = 0; i < 2; i++)
            {
                switch (parts[i])
                {
                    case "X":
                        Num[i] = 10;
                        R2 = R2 + 1;
                        break;
                    case "IX":
                        Num[i] = 9;
                        R2 = R2 + 1;
                        break;
                    case "VIII":
                        Num[i] = 8;
                        R2 = R2 + 1;
                        break;
                    case "VII":
                        Num[i] = 7;
                        R2 = R2 + 1;
                        break;
                    case "VI":
                        Num[i] = 6;
                        R2 = R2 + 1;
                        break;
                    case "V":
                        Num[i] = 5;
                        R2 = R2 + 1;
                        break;
                    case "IV":
                        Num[i] = 4;
                        R2 = R2 + 1;
                        break;
                    case "III":
                        Num[i] = 3;
                        R2 = R2 + 1;
                        break;
                    case "II":
                        Num[i] = 2;
                        R2 = R2 + 1;
                        break;
                    case "I":
                        Num[i] = 1;
                        R2 = R2 + 1;
                        break;
                }
            }
            if (R2 == 1)
            {
                System.out.println ("1throws Exception");
            }
            else
            {
                if (R2 == 0)
                {
                    for (int i = 0; i < 2; i++)
                    {
                        Num[i] = Integer.parseInt (parts[i]);
                    }
                    switch (z)
                    {
                        case 1:
                            sum = Num[0] + Num[1];
                            break;
                        case 2:
                            sum = Num[0] - Num[1];
                            break;
                        case 3:
                            sum = Num[0] * Num[1];
                            break;
                        case 4:
                            sum = Num[0] / Num[1];
                            break;

                    }
                    if ((Num[0] < 11) && (Num[0] > 0) && (Num[1] < 11)
                            && (Num[1] > 0))
                    {
                        System.out.println (sum);
                    }
                    else
                    {
                        System.out.println ("2throws Exception");
                    }
                }
                else
                {
                    if (R2 == 2)
                    {
                        switch (z)
                        {
                            case 1:
                                sum = Num[0] + Num[1];
                                break;
                            case 2:
                                sum = Num[0] - Num[1];
                                break;
                            case 3:
                                sum = Num[0] * Num[1];
                                break;
                            case 4:
                                sum = Num[0] / Num[1];
                                break;

                        }

                        if (sum > 0)
                        {
                            switch (sum)
                            {
                                case 1:
                                    System.out.println ("I");
                                    break;
                                case 2:
                                    System.out.println ("II");
                                    break;
                                case 3:
                                    System.out.println ("III");
                                    break;
                                case 4:
                                    System.out.println ("IV");
                                    break;
                                case 5:
                                    System.out.println ("V");
                                    break;
                                case 6:
                                    System.out.println ("VI");
                                    break;
                                case 7:
                                    System.out.println ("VII");
                                    break;
                                case 8:
                                    System.out.println ("VIII");
                                    break;
                                case 9:
                                    System.out.println ("IX");
                                    break;
                                case 10:
                                    System.out.println ("X");
                                    break;
                                case 11:
                                    System.out.println ("XI");
                                    break;
                                case 12:
                                    System.out.println ("XII");
                                    break;
                                case 13:
                                    System.out.println ("XIII");
                                    break;
                                case 14:
                                    System.out.println ("XIV");
                                    break;
                                case 15:
                                    System.out.println ("XV");
                                    break;
                                case 16:
                                    System.out.println ("XVI");
                                    break;
                                case 17:
                                    System.out.println ("XVII");
                                    break;
                                case 18:
                                    System.out.println ("XVIII");
                                    break;
                                case 19:
                                    System.out.println ("XIX");
                                    break;
                                case 20:
                                    System.out.println ("XX");
                                    break;
                                case 21:
                                    System.out.println ("XXI");
                                    break;
                                case 22:
                                    System.out.println ("XXII");
                                    break;
                                case 23:
                                    System.out.println ("XXIII");
                                    break;
                                case 24:
                                    System.out.println ("XXIV");
                                    break;
                                case 25:
                                    System.out.println ("XXV");
                                    break;
                                case 26:
                                    System.out.println ("XXVI");
                                    break;
                                case 27:
                                    System.out.println ("XXVII");
                                    break;
                                case 28:
                                    System.out.println ("XXVIII");
                                    break;
                                case 29:
                                    System.out.println ("XXIX");
                                    break;
                                case 30:
                                    System.out.println ("XXX");
                                    break;
                                case 31:
                                    System.out.println ("XXXI");
                                    break;
                                case 32:
                                    System.out.println ("XXXII");
                                    break;
                                case 33:
                                    System.out.println ("XXXIII");
                                    break;
                                case 34:
                                    System.out.println ("XXXIV");
                                    break;
                                case 35:
                                    System.out.println ("XXXV");
                                    break;
                                case 36:
                                    System.out.println ("XXXVI");
                                    break;
                                case 37:
                                    System.out.println ("XXXVII");
                                    break;
                                case 38:
                                    System.out.println ("XXXVIII");
                                    break;
                                case 39:
                                    System.out.println ("XXXIX");
                                    break;
                                case 40:
                                    System.out.println ("XL");
                                    break;
                                case 41:
                                    System.out.println ("XLI");
                                    break;
                                case 42:
                                    System.out.println ("XLII");
                                    break;
                                case 43:
                                    System.out.println ("XLIII");
                                    break;
                                case 44:
                                    System.out.println ("XLIV");
                                    break;
                                case 45:
                                    System.out.println ("XLV");
                                    break;
                                case 46:
                                    System.out.println ("XLVI");
                                    break;
                                case 47:
                                    System.out.println ("XLVII");
                                    break;
                                case 48:
                                    System.out.println ("XLVIII");
                                    break;
                                case 49:
                                    System.out.println ("XLIX");
                                    break;
                                case 50:
                                    System.out.println ("L");
                                    break;
                                case 51:
                                    System.out.println ("LI");
                                    break;
                                case 52:
                                    System.out.println ("LII");
                                    break;
                                case 53:
                                    System.out.println ("LIII");
                                    break;
                                case 54:
                                    System.out.println ("LIV");
                                    break;
                                case 55:
                                    System.out.println ("LV");
                                    break;
                                case 56:
                                    System.out.println ("LVI");
                                    break;
                                case 57:
                                    System.out.println ("LVII");
                                    break;
                                case 58:
                                    System.out.println ("LVIII");
                                    break;
                                case 59:
                                    System.out.println ("LIX");
                                    break;
                                case 60:
                                    System.out.println ("LX");
                                    break;
                                case 61:
                                    System.out.println ("LXI");
                                    break;
                                case 62:
                                    System.out.println ("LXII");
                                    break;
                                case 63:
                                    System.out.println ("LXIII");
                                    break;
                                case 64:
                                    System.out.println ("LXIV");
                                    break;
                                case 65:
                                    System.out.println ("LXV");
                                    break;
                                case 66:
                                    System.out.println ("LXVI");
                                    break;
                                case 67:
                                    System.out.println ("LXVII");
                                    break;
                                case 68:
                                    System.out.println ("LXVIII");
                                    break;
                                case 69:
                                    System.out.println ("LXIX");
                                    break;
                                case 70:
                                    System.out.println ("LXX");
                                    break;
                                case 71:
                                    System.out.println ("LXXI");
                                    break;
                                case 72:
                                    System.out.println ("LXXII");
                                    break;
                                case 73:
                                    System.out.println ("LXXIII");
                                    break;
                                case 74:
                                    System.out.println ("LXXIV");
                                    break;
                                case 75:
                                    System.out.println ("LXXV");
                                    break;
                                case 76:
                                    System.out.println ("LXXVI");
                                    break;
                                case 77:
                                    System.out.println ("LXXVII");
                                    break;
                                case 78:
                                    System.out.println ("LXXVIII");
                                    break;
                                case 79:
                                    System.out.println ("LXXIX");
                                    break;
                                case 80:
                                    System.out.println ("LXXX");
                                    break;
                                case 81:
                                    System.out.println ("LXXXI");
                                    break;
                                case 82:
                                    System.out.println ("LXXXII");
                                    break;
                                case 83:
                                    System.out.println ("LXXXIII");
                                    break;
                                case 84:
                                    System.out.println ("LXXXIV");
                                    break;
                                case 85:
                                    System.out.println ("LXXXV");
                                    break;
                                case 86:
                                    System.out.println ("LXXXVI");
                                    break;
                                case 87:
                                    System.out.println ("LXXXVII");
                                    break;
                                case 88:
                                    System.out.println ("LXXXVIII");
                                    break;
                                case 89:
                                    System.out.println ("LXXXIX");
                                    break;
                                case 90:
                                    System.out.println ("XC");
                                    break;
                                case 91:
                                    System.out.println ("XCI");
                                    break;
                                case 92:
                                    System.out.println ("XCII");
                                    break;
                                case 93:
                                    System.out.println ("XCIII");
                                    break;
                                case 94:
                                    System.out.println ("XCIV");
                                    break;
                                case 95:
                                    System.out.println ("XCV");
                                    break;
                                case 96:
                                    System.out.println ("XCVI");
                                    break;
                                case 97:
                                    System.out.println ("XCVII");
                                    break;
                                case 98:
                                    System.out.println ("XCVIII");
                                    break;
                                case 99:
                                    System.out.println ("XCIX");
                                    break;
                                case 100:
                                    System.out.println ("C");
                                    break;
                            }

                        }
                        else
                        {
                            System.out.println ("3throws Exception");
                        }
                    }
                    else
                    {
                        System.out.println ("4throws Exception");
                    }
                }
            }
        }
        else
        {
            System.out.println ("5throws Exception");
        }




    }
}

import javax.swing.*;
import java.util.Arrays;

public class updated {
    static ImageIcon image1 = new ImageIcon("image/calculator (1).png");
 static  String  options5 [] = {" SPEED ", " WEIGHT "," TEMPERATURE "," DATA "," VOLUME " };
   /* String [] options5 = new  String[5];
    options5[0] = " SPEED ";
    options5[1] = " WEIGHT ";
    options5[2] = " TEMPERATURE ";
    options5[3] = " DATA ";
    options5[4] = " VOLUME ";*/

    static String response = String.valueOf(JOptionPane.showOptionDialog(null, "   choose one these    " ,
            "scienece " + "caculater ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, image1, options5, options5[0]));

    public static void main(String[] args) {

        boolean repeat = true;

        while (repeat) {

            if(response.equals(null)){
                break;
            }
            int ParResponse = Integer.parseInt(response);
            try {  if ( ParResponse == -1){
                break;
            }
               else if (ParResponse == 0) {
                    SPEED();
                } else if (ParResponse == 1) {
                    weight();
                } else if (ParResponse == 2) {
                    Temperature();
                } else if (ParResponse == 3) {
                    Data();
                } else if (ParResponse == 4) {
                    Volume();

                }

            } catch (NumberFormatException barham) {
                JOptionPane.showMessageDialog(null, "invailed value ");
                System.out.println();
                continue;


            }

            int Continue = JOptionPane.showConfirmDialog(null, " Do you want to Exit ?", "scienece " + "caculater ",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            repeat = Continue==1;

        }
//        if (ParResponse == Integer.parseInt(null)) {
//            Object o = null;
//
//        }
    }


    public static void SPEED() {

        Object[] options = {"KiloMetter Per Houre ", "Miles Per Houre", "feet Per Second ", "Mach" };
        String name = (String) JOptionPane.showInputDialog(null, "Chose one of these s", "science caculate", 1, null, options, options[0]);
                /*   for (int  i = 0; i < options.length; i++) {
                      options[1] = Integer.toString(i);
                  }
       String x = String.valueOf(JOptionPane.showInputDialog(frame, "which one you wanna to convert", "Input",
                JOptionPane.QUESTION_MESSAGE,
                null, options, "Speed converter "));
*/


        Object[] options1 = new Object[options.length - 1];
        int k = 0;
        for (int i = 0; i <= options1.length; i++) {
            if (Arrays.asList(options).indexOf(name) != i) {
                options1[k++] = options[i];
            }
        }

        String message = " you want to  convert " + " [" + name.toUpperCase() + "]" + "  to  ";

        String name1 = (String) JOptionPane.showInputDialog(null, message, "science caculater ", 1, null, options1, options1[0]);
        // KM to 1 ,2 ,3
        if (Arrays.asList(options).indexOf(name) == 0 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  KM/H  " + "\u27F6" + " Mile/H");
            double input1 = (Double.parseDouble(input) / 1.60934);
            String input2 = input1 + " Mile /h ";
            // String.format( "%3.f"),input1,
            String message1 = input + " Km/h " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }


        }
        if (Arrays.asList(options).indexOf(name) == 0 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  Km/h  " + "\u27F6" + " Ft/s");
            double input1 = (Double.parseDouble(input) * 1.09728);
            String input2 = input1 + " Feet  /h ";
            // String.format( "%3.f"),input1,
            String message1 = input + " Km/h " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }


        }
        if (Arrays.asList(options).indexOf(name) == 0 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog("  KM/H  " + "\u27F6" + " mach ");
            double input1 = (Double.parseDouble(input) * 0.000809848);
            String input2 = input1 + "  Mach   (speed of sound ) ";
            // String.format( "%3.f"),input1,
            String message1 = input + " Km/h " + "\u2242";

            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }


        //mile to 1,2,3
        if (Arrays.asList(options).indexOf(name) == 1 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog(" Mile / h  " + "\u27F6" + " Km/h ");
            double input1 = (Double.parseDouble(input) * 1.60934);
            String input2 = input1 + " Km/h  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " Mile /m  " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }



}






        if (Arrays.asList(options).indexOf(name) == 1 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog(" Mile / h  " + "\u27F6" + " ft/h ");
            double input1 = (Double.parseDouble(input) * 0.681818);
            String input2 = input1 + " ft/h  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " Mile /m  " + "\u2242";

            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            }
            if (input == null){
                System.out.println("break");

            }
            else{
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 1 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog(" Mile / h  " + "\u27F6" + " Mach  ");
            double input1 = (Double.parseDouble(input) * 0.00130332);
            String input2 = input1 + "mach ( speed of sound  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " Mile /m  " + "\u2242";

            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }


        //feet to 1 ,2 ,3
        if (Arrays.asList(options).indexOf(name) == 2 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog(" ft/s  " + "\u27F6" + "Km/h  ");
            double input1 = (Double.parseDouble(input) / 1.09728);
            String input2 = input1 + "Km/h  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " ft/s  " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 2 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog(" ft/s  " + "\u27F6" + "Mile/h  ");
            double input1 = (Double.parseDouble(input) / 0.681818);
            String input2 = input1 + "Mile/h  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " ft/s  " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 2 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog(" ft/s   " + "\u27F6" + "mach   ");
            double input1 = (Double.parseDouble(input) * 0.000889);
            String input2 = input1 + "mach (sound of speed  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " ft/s  " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 3 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog(" mach   " + "\u27F6" + "Km   ");
            double input1 = (Double.parseDouble(input) *1225.044);
            String input2 = input1 + "Km ";
            // String.format( "%3.f"),input1,
            String message1 = input + "Mach  " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 3 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog(" mach   " + "\u27F6" + "Mile   ");
            double input1 = (Double.parseDouble(input) *767.269148);
            String input2 = input1 + "Mile ";
            // String.format( "%3.f"),input1,
            String message1 = input + "Mach  " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 3 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog(" mach   " + "\u27F6" + "ft/h   ");
            double input1 = (Double.parseDouble(input) *4019173.22835);
            String input2 = input1 + "ft/h ";
            // String.format( "%3.f"),input1,
            String message1 = input + "Mach  " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }


    }


    public static void weight() {
        Object[] options1 = {" metric tonns ", "Kilograme ", "Grame ", "pounds ", " ounces "};
        String nameOfWeights = (String) JOptionPane.showInputDialog(null, "Chose one of these s", "science caculate", 1, null,
                options1, options1[0]);


        Object[] SecondOptions = new Object[options1.length - 1];
        int k = 0;
        for (int i = 0; i <= SecondOptions.length; i++) {
            if (Arrays.asList(options1).indexOf(nameOfWeights) != i) {
                SecondOptions[k++] = options1[i];
            }
        }

        String message = " you wanna convert " + " [" + nameOfWeights.toUpperCase() + " ]" + " to ";
        String name1 = (String) JOptionPane.showInputDialog(null, message, "science caculate", 1, null, SecondOptions, SecondOptions[0]);


        //MT  to 1,2,3,4
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 0 && Arrays.asList(SecondOptions).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  MT  " + "\u27F6" + " Kg ");
            double input1 = (Double.parseDouble(input) * 1000);
            String input2 = input1 + " Kg";
            // String.format( "%3.f"),input1,
            String message1 = input + " MT  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 0 && Arrays.asList(SecondOptions).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  MT  " + "\u27F6" + " g ");
            double input1 = (Double.parseDouble(input) * 1000000);
            String input2 = input1 + " g";
            // String.format( "%3.f"),input1,
            String message1 = input + " MT  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 0 && Arrays.asList(SecondOptions).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog("  MT  " + "\u27F6" + " lb ");
            double input1 = (Double.parseDouble(input) * 2204.622622);
            String input2 = input1 + " lb";
            // String.format( "%3.f"),input1,
            String message1 = input + " MT  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 0 && Arrays.asList(SecondOptions).indexOf(name1) == 3) {
            String input = JOptionPane.showInputDialog("  MT  " + "\u27F6" + " oz ");
            double input1 = (Double.parseDouble(input) * 35273.96195);
            String input2 = input1 + " oz";
            // String.format( "%3.f"),input1,
            String message1 = input + " MT  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }

        //Kg to 1,2,3,4
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 1 && Arrays.asList(SecondOptions).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  kg  " + "\u27F6" + " MT ");
            double input1 = (Double.parseDouble(input) / 1000);
            String input2 = input1 + " MT";
            // String.format( "%3.f"),input1,
            String message1 = input + " Kg  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 1 && Arrays.asList(SecondOptions).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  kg  " + "\u27F6" + " g ");
            double input1 = (Double.parseDouble(input) * 1000);
            String input2 = input1 + " g";
            // String.format( "%3.f"),input1,
            String message1 = input + " Kg  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 1 && Arrays.asList(SecondOptions).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog("  kg  " + "\u27F6" + " lb ");
            double input1 = (Double.parseDouble(input) * 2.204623);
            String input2 = input1 + " lb";
            // String.format( "%3.f"),input1,
            String message1 = input + " Kg  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 1 && Arrays.asList(SecondOptions).indexOf(name1) == 3) {
            String input = JOptionPane.showInputDialog("  kg  " + "\u27F6" + " oz ");
            double input1 = (Double.parseDouble(input) * 35.273962);
            String input2 = input1 + " oz";
            // String.format( "%3.f"),input1,
            String message1 = input + " Kg  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }


        // Grame to 1,2,3,4

        if (Arrays.asList(options1).indexOf(nameOfWeights) == 2 && Arrays.asList(SecondOptions).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  g  " + "\u27F6" + " MT ");
            double input1 = (Double.parseDouble(input) / 1000000);
            String input2 = input1 + " MT";
            // String.format( "%3.f"),input1,
            String message1 = input + " g  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 2 && Arrays.asList(SecondOptions).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  g  " + "\u27F6" + " Kg ");
            double input1 = (Double.parseDouble(input) / 1000);
            String input2 = input1 + " Kg";
            // String.format( "%3.f"),input1,
            String message1 = input + " g  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 2 && Arrays.asList(SecondOptions).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog("  g  " + "\u27F6" + " lb ");
            double input1 = (Double.parseDouble(input) * 0.002205);
            String input2 = input1 + " lb";
            // String.format( "%3.f"),input1,
            String message1 = input + " g  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 2 && Arrays.asList(SecondOptions).indexOf(name1) == 3) {
            String input = JOptionPane.showInputDialog("  g  " + "\u27F6" + " oz ");
            double input1 = (Double.parseDouble(input) * 0.035274);
            String input2 = input1 + " oz";
            // String.format( "%3.f"),input1,
            String message1 = input + " g  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }


        //pounds to 1,2,3,4
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 3 && Arrays.asList(SecondOptions).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  lb  " + "\u27F6" + " MT ");
            double input1 = (Double.parseDouble(input) * 0.000454);
            String input2 = input1 + " MT";
            // String.format( "%3.f"),input1,
            String message1 = input + " lb  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 3 && Arrays.asList(SecondOptions).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  lb  " + "\u27F6" + " Kg ");
            double input1 = (Double.parseDouble(input) * 0.45359237);
            String input2 = input1 + " Kg";
            // String.format( "%3.f"),input1,
            String message1 = input + " lb  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 3 && Arrays.asList(SecondOptions).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog("  lb  " + "\u27F6" + " g ");
            double input1 = (Double.parseDouble(input) * 453.59237);
            String input2 = input1 + " g";
            // String.format( "%3.f"),input1,
            String message1 = input + " lb  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 3 && Arrays.asList(SecondOptions).indexOf(name1) == 3) {
            String input = JOptionPane.showInputDialog("  lb  " + "\u27F6" + " oz ");
            double input1 = (Double.parseDouble(input) * 16);
            String input2 = input1 + " oz";
            // String.format( "%3.f"),input1,
            String message1 = input + " lb  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }

        //ounces to 1,2,3,4,

        if (Arrays.asList(options1).indexOf(nameOfWeights) == 4 && Arrays.asList(SecondOptions).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  oz  " + "\u27F6" + " MT ");
            double input1 = (Double.parseDouble(input) * 0.00002835);
            String input2 = input1 + " MT";
            // String.format( "%3.f"),input1,
            String message1 = input + " oz  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 4 && Arrays.asList(SecondOptions).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  oz  " + "\u27F6" + " Kg ");
            double input1 = (Double.parseDouble(input) * 0.02835);
            String input2 = input1 + " Kg";
            // String.format( "%3.f"),input1,
            String message1 = input + " oz  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 4 && Arrays.asList(SecondOptions).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog("  oz  " + "\u27F6" + " g ");
            double input1 = (Double.parseDouble(input) * 28.349523);
            String input2 = input1 + " g";
            // String.format( "%3.f"),input1,
            String message1 = input + " oz  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options1).indexOf(nameOfWeights) == 4 && Arrays.asList(SecondOptions).indexOf(name1) == 3) {
            String input = JOptionPane.showInputDialog("  oz  " + "\u27F6" + " lb ");
            double input1 = (Double.parseDouble(input) / 16);
            String input2 = input1 + " lb";
            // String.format( "%3.f"),input1,
            String message1 = input + " oz  " + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }


    }

    public static void Temperature() {
        Object[] options = {"Kelvin", "Fahrenheit", "" + "Celsuis"};
        String name = (String) JOptionPane.showInputDialog(null, "Chose one of these s", "science caculate", 1, null, options, options[0]);


        Object[] options1 = new Object[options.length - 1];
        int k = 0;
        for (int i = 0; i <= options1.length; i++) {
            if (Arrays.asList(options).indexOf(name) != i) {
                options1[k++] = options[i];
            }
        }
        String message = " you want to  convert " + " [" + name.toUpperCase() + "]" + "  to  ";

        String name1 = (String) JOptionPane.showInputDialog(null, message, "science caculater ", 1, null, options1, options1[0]);

        // kelvin to 1,2
        if (Arrays.asList(options).indexOf(name) == 0 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  °K " + "\u27F6" + " °F");
            double input1 = (1.8 * (Double.parseDouble(input) - 273.15) + 32);
            String input2 = input1 + "°F ";
            // String.format( "%3.f"),input1,
            String message1 = input + "°K " + "\u2242";

            JOptionPane.showMessageDialog(null, message1 + input2);
        }
        if (Arrays.asList(options).indexOf(name) == 0 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  °K " + "\u27F6" + " °C");
            double input1 = (Double.parseDouble(input) - 273.15);
            String input2 = input1 + "°C ";
            // String.format( "%3.f"),input1,
            String message1 = input + "°K " + "\u2242";

            JOptionPane.showMessageDialog(null, message1 + input2);
        }


        //Fahranite to 1,2
        if (Arrays.asList(options).indexOf(name) == 1 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  °F " + "\u27F6" + " °K");
            double input1 = ((Double.parseDouble(input) + 459.67) * 0.5555555555555556);
            String input2 = input1 + "°K ";
            // String.format( "%3.f"),input1,
            String message1 = input + "°F " + "\u2242";

            JOptionPane.showMessageDialog(null, message1 + input2);
        }
        if (Arrays.asList(options).indexOf(name) == 1 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  °F " + "\u27F6" + " °C");
            double input1 = ((Double.parseDouble(input) - 32) * 0.5555555555555556);
            String input2 = input1 + "°C ";
            // String.format( "%3.f"),input1,
            String message1 = input + "°F " + "\u2242";

            JOptionPane.showMessageDialog(null, message1 + input2);

        }


        // celusuis to 1,2
        if (Arrays.asList(options).indexOf(name) == 2 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  °C " + "\u27F6" + " °K");
            double input1 = ((Double.parseDouble(input) + 273.15));
            String input2 = input1 + "°K ";
            // String.format( "%3.f"),input1,
            String message1 = input + "°C " + "\u2242";

            JOptionPane.showMessageDialog(null, message1 + input2);

        }
        if (Arrays.asList(options).indexOf(name) == 2 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  °C " + "\u27F6" + " °F");
            double input1 = ((Double.parseDouble(input) * 1.8) + 32);
            String input2 = input1 + "°F ";
            // String.format( "%3.f"),input1,
            String message1 = input + "°C " + "\u2242";

            JOptionPane.showMessageDialog(null, message1 + input2);

        }

    }

    public static void Data() {

        Object[] options = {"Bytes  ", "KiloBytes  ", "MegaBytes    ", "GigaBytes"};
        String name = (String) JOptionPane.showInputDialog(null, "Chose one of these s", "science caculate", 1, null, options, options[0]);


        Object[] options1 = new Object[options.length - 1];
        int k = 0;
        for (int i = 0; i <= options1.length; i++) {
            if (Arrays.asList(options).indexOf(name) != i) {
                options1[k++] = options[i];
            }
        }

        String message = " you want to  convert " + " [" + name.toUpperCase() + "]" + "  to  ";

        String name1 = (String) JOptionPane.showInputDialog(null, message, "science caculater ", 1, null, options1, options1[0]);

        if (Arrays.asList(options).indexOf(name) == 0 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  Bytes  " + "\u27F6" + " KB ");
            double input1 = (Double.parseDouble(input) / 1024);
            String input2 = input1 + "KB ";
            // String.format( "%3.f"),input1,
            String message1 = input + " bytes  " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }


        }
        if (Arrays.asList(options).indexOf(name) == 0 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  Bytes  " + "\u27F6" + " MB ");
            double input1 = (Double.parseDouble(input) / 1048576);
            String input2 = input1 + "MB ";
            // String.format( "%3.f"),input1,
            String message1 = input + " bytes  " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }


        }
        if (Arrays.asList(options).indexOf(name) == 0 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog("  Bytes  " + "\u27F6" + " GB ");
            double input1 = (Double.parseDouble(input) / 1073741824);
            String input2 = input1 + "GB";
            // String.format( "%3.f"),input1,
            String message1 = input + " bytes  " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }


        }


        if (Arrays.asList(options).indexOf(name) == 1 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  KB " + "\u27F6" + " Bytes  ");
            double input1 = (Double.parseDouble(input) * 1024);
            String input2 = input1 + "Bytes  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " KB  " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }


        }
        if (Arrays.asList(options).indexOf(name) == 1 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  KB  " + "\u27F6" + " MB  ");
            double input1 = (Double.parseDouble(input) / 1024);
            String input2 = input1 + "MbB ";
            // String.format( "%3.f"),input1,
            String message1 = input + " KB   " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 1 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog("  KB  " + "\u27F6" + "GB");
            double input1 = (Double.parseDouble(input) / 1048576);
            String input2 = input1 + "GB";
            // String.format( "%3.f"),input1,
            String message1 = input + " KB " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }


        if (Arrays.asList(options).indexOf(name) == 2 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  MB   " + "\u27F6" + " Bytes   ");
            double input1 = (Double.parseDouble(input) * 1048576);
            String input2 = input1 + "Bytes   ";
            // String.format( "%3.f"),input1,
            String message1 = input + " MB   " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 2 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  MB   " + "\u27F6" + " KB    ");
            double input1 = (Double.parseDouble(input) * 1024);
            String input2 = input1 + "KB";
            // String.format( "%3.f"),input1,
            String message1 = input + " MB   " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 2 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog("  MB   " + "\u27F6" + " GB   ");
            double input1 = (Double.parseDouble(input) / 1024);
            String input2 = input1 + "GB";
            // String.format( "%3.f"),input1,
            String message1 = input + " MB   " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }


        if (Arrays.asList(options).indexOf(name) == 3 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog("  GB   " + "\u27F6" + " Bytes    ");
            double input1 = (Double.parseDouble(input) * 1073741824);
            String input2 = input1 + "Bytes ";
            // String.format( "%3.f"),input1,
            String message1 = input + " GB   " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 3 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog("  GB   " + "\u27F6" + "KB    ");
            double input1 = (Double.parseDouble(input) * 1048576);
            String input2 = input1 + "KB ";
            // String.format( "%3.f"),input1,
            String message1 = input + " GB   " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 3 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog("  GB   " + "\u27F6" + "MB    ");
            double input1 = (Double.parseDouble(input) * 1024);
            String input2 = input1 + "MB ";
            // String.format( "%3.f"),input1,
            String message1 = input + " GB   " + "\u2242";
            if (input1 >= 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }


    }

    public static void Volume() {
        Object[] options = {"milliliter  ", "liter ", "cubicMeter", " Gallom "};
        String name = (String) JOptionPane.showInputDialog(null, "Chose one of these s", "science caculate", 1, null, options, options[0]);

        Object[] options1 = new Object[options.length - 1];
        int k = 0;
        for (int i = 0; i <= options1.length; i++) {
            if (Arrays.asList(options).indexOf(name) != i) {
                options1[k++] = options[i];
            }
        }

        String message = " you want to  convert " + " [" + name.toUpperCase() + "]" + "  to  ";

        String name1 = (String) JOptionPane.showInputDialog(null, message, "science caculater ", 1, null, options1, options1[0]);

        if (Arrays.asList(options).indexOf(name) == 0 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog(" ml " + "\u27F6" + "L");

            double input1 = (Double.parseDouble(input) / 1000);
            String input2 = input1 + " L";
            // String.format( "%3.f"),input1,
            String message1 = input + " ml" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }

        }
        if (Arrays.asList(options).indexOf(name) == 0 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog(" ml " + "\u27F6" + "m³");

            double input1 = (Double.parseDouble(input) / 1000000);
            String input2 = input1 + " m³";
            // String.format( "%3.f"),input1,
            String message1 = input + " ml" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }

        }
        if (Arrays.asList(options).indexOf(name) == 0 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog(" ml " + "\u27F6" + "gal");

            double input1 = (Double.parseDouble(input) * 0.000264);
            String input2 = input1 + " gal ";
            // String.format( "%3.f"),input1,
            String message1 = input + " ml" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }

        }

        if (Arrays.asList(options).indexOf(name) == 1 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog(" L " + "\u27F6" + "ml");

            double input1 = (Double.parseDouble(input) * 1000);
            String input2 = input1 + " ml ";
            // String.format( "%3.f"),input1,
            String message1 = input + " L" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }

        }
        if (Arrays.asList(options).indexOf(name) == 1 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog(" L " + "\u27F6" + "m³");

            double input1 = (Double.parseDouble(input) / 1000);
            String input2 = input1 + " m³ ";
            // String.format( "%3.f"),input1,
            String message1 = input + " L" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }

        }
        if (Arrays.asList(options).indexOf(name) == 1 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog(" L " + "\u27F6" + "gal");

            double input1 = (Double.parseDouble(input) * 0.264172);
            String input2 = input1 + " gal  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " L" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }

        }


        if (Arrays.asList(options).indexOf(name) == 2 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog(" m³ " + "\u27F6" + "ml");

            double input1 = (Double.parseDouble(input) * 1000000);
            String input2 = input1 + " ml  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " m³" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }

        }
        if (Arrays.asList(options).indexOf(name) == 2 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog(" m³ " + "\u27F6" + "L");

            double input1 = (Double.parseDouble(input) * 1000);
            String input2 = input1 + " L  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " m³" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 2 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog(" m³ " + "\u27F6" + "gal");

            double input1 = (Double.parseDouble(input) * 264.172052);
            String input2 = input1 + " gal  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " m³" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }


        if (Arrays.asList(options).indexOf(name) == 3 && Arrays.asList(options1).indexOf(name1) == 0) {
            String input = JOptionPane.showInputDialog(" gal " + "\u27F6" + "ml");

            double input1 = (Double.parseDouble(input) * 3785.411784);
            String input2 = input1 + " ml  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " gal" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 3 && Arrays.asList(options1).indexOf(name1) == 1) {
            String input = JOptionPane.showInputDialog(" gal " + "\u27F6" + "L");

            double input1 = (Double.parseDouble(input) / 0.264172);
            String input2 = input1 + " L  ";
            // String.format( "%3.f"),input1,
            String message1 = input + " gal" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
        if (Arrays.asList(options).indexOf(name) == 3 && Arrays.asList(options1).indexOf(name1) == 2) {
            String input = JOptionPane.showInputDialog(" gal " + "\u27F6" + "m³ ");

            double input1 = (Double.parseDouble(input) / 264.172052);
            String input2 = input1 + " m³   ";
            // String.format( "%3.f"),input1,
            String message1 = input + " gal" + "\u2242";
            if (input1 > 0) {
                JOptionPane.showMessageDialog(null, message1 + input2);
            } else {
                JOptionPane.showMessageDialog(null, "invailed value ");
            }
        }
    }
}






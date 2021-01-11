import java.util.Scanner;
public class kate {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in); // создание сканнера для считывания
        int number = scan.nextInt(); //считывание числа
        String number_string = Integer.toString(number); //преобразование числа в строку
        String new_number_string ="";
        for(int i = 0 ; i< number_string.length() ; i++){
            if((int) number_string.charAt(i) % 2 != 0 ){
                new_number_string += number_string.charAt(i);
            }
        }
        int new_number = Integer.parseInt(new_number_string);
        System.out.println(new_number);
    }
}



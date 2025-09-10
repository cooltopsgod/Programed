import java.util.Scanner;
public class Html {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String palw = input.nextLine();
        String htmlx = "<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "    <title>Document</title>\n" + "</head>\n" + "<body>\n" + "    <h1>" + palw + "</h2>\n" + "    <h2>" + palw + "</h2>\n" + "    <h3>" + palw + "</h3>\n" + "    <h4>" + palw + "</h4>\n" + "</body>\n" + "</html>";
        System.out.print(htmlx);
        input.close();
    }
}
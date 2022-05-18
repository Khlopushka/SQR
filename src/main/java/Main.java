import ru.netology.qa.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int res = service.squareRoot(150, 350);

        System.out.println(res);
    }
}

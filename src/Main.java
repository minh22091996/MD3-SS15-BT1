public class Main {
    public static void main(String[] args) {
        CheckTriangle check = new CheckTriangle();
        try {
            System.out.println("Nhap 3 canh cua tam giac : ");
            System.out.println("Nhap canh a : ");
            int a = Config.sc().nextInt();
            System.out.println("Nhap canh b : ");
            int b = Config.sc().nextInt();
            System.out.println("Nhap canh c : ");
            int c = Config.sc().nextInt();
            check.IllegalTriangleExceptioncheck(a, b, c);
        }
            catch (IllegalTriangleException e) {
//                System.out.println("err"+ e.getMessage());
                e.printStackTrace();
            }
//        Config.sc().close();
    }
}

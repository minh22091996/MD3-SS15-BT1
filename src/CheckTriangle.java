public class CheckTriangle {
   public  void IllegalTriangleExceptioncheck (int a,int b, int c) throws IllegalTriangleException{
       if(a+b <= c || a+c<=b||b+c<=a){
           throw new IllegalTriangleException("sai roi ");
       }else {
           System.out.println("tam giac ok day");
       }
   }
}

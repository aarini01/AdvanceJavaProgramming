
// @FunctionalInterface
// interface Calc{
//     void calculate();
    
// }

    
// public class MainFunctionalInterface {
//     public static void main(String[] args) {
        
//         //     public int calculate(int n1, int n2) {
//         //               return(n1+n2);
//         //     }
            
//         // };
        
        
//         // System.out.println("Sum="+a.calculate(23,34));
//         // Add a1 =(int n1, int n2)-> (n1+n2);
//         // System.out.println("Sum="+a1.calculate(23,24))dd a = new Add() {
//         //     @Over
//         Calc a1 = ()-> {
//             int num1=10, num2=30;
//             System.out.println("Sum="+(num1+num2));
//         };
//         a1.calculate();
        
//     }
    
// }
@FunctionalInterface
interface Calc{
    void calculate(int n1,int n2);
}

public class MainFunctionalInterface {
    public static void main(String[] args) {
        // Add a=new Add() {

        //     @Override
        //     public int calculate(int n1, int n2) {
        //         // TODO Auto-generated method stub
        //         return (n1+n2);
        //     }
            
        // };
        // System.out.println("Sum="+a.calculate(23,34));
        // Add a1=(int n1,int n2)->{
        //     return (n1+n2);
        // };  //lambda expression
        // System.out.println("Sum="+a1.calculate(23, 34));
        int num1=10,num2=30;
        Calc a1=(int n1,int n2 )->{
            
            System.out.println("calculate func using lambda function");
            System.out.println("Sum="+(n1+n2));
        };
        a1.calculate(23,56);
    }
}
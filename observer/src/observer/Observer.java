/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;
import java.util.Scanner;
/**
 *
 * @author KTMAIT
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        observer1 obj1 = new observer1();
        observer2 obj2 = new observer2();
        Headquarter obj = new Headquarter();
        obj.register(obj1);
        obj.register(obj2);
        
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter Score ");
            String type = input.nextLine();
            if(type.isEmpty()){
                break;
            }
            obj.setSomeData(type);
        
        }   
    }

}

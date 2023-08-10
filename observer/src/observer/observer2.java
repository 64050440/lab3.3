/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

/**
 *
 * @author KTMAIT
 */
public class observer2 implements MyObserver{
    @Override
    public void update(Source o){
    System.out.println("live result: " + ((Headquarter)o).getSomeData());
    //System.out.println("Hello");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;
import java.util.ArrayList;
/**
 *
 * @author KTMAIT
 */
public class Headquarter implements Source{
    private final ArrayList<MyObserver> list;
    private String someData;

    public Headquarter(){
        this.list = new ArrayList<MyObserver>();
    }
    public void setSomeData(String aData){
        someData = aData;
        notifyObservers();
    }
    public String getSomeData(){
    return someData;
    }
    @Override
    public void register(MyObserver observer){
        list.add(observer);
    }
    @Override
    public void notifyObservers(){
        for(int i =0; i<list.size();i++){
            list.get(i).update(this);
        }
    }
}

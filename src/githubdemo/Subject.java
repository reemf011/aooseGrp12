/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phase3;

/**
 *
 * @author DeS
 */
public interface Subject {
    public void addObserver(observer x);
    public void removeObserver(observer y);
    public void NotifyObserver(String z);
}

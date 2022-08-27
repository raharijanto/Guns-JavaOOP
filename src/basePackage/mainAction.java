/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basePackage;

/**
 *
 * @author Asus
 */
public class mainAction {
    public static void main(String[] args) {
        rifle ak = new rifle(10);
        handgun fiveseven = new handgun(5);
        
        ak.shoot();
        ak.reload();
        
        fiveseven.shoot();
        fiveseven.reload();
    }
}

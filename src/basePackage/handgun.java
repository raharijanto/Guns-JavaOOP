/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basePackage;

/**
 *
 * @author Asus
 */
public class handgun implements gunsInterface {
    // Attribute
    private final int handgunDamage;
    private int handgunAmmo = 12;
    private int damageGiven;
    int tapping;
    
    // Constructor
    public handgun(int tapping) {
        this.handgunDamage = 15;
        this.tapping = tapping;
    }
    
    // Method
    @Override
    public int shoot() {
        System.out.println("Shooting with handgun");
        for (int i = tapping; i > 0; i--){
            damageGiven += handgunDamage;
            handgunAmmo--;
        }
        System.out.println("Total damage = " +damageGiven);
        return damageGiven;
    }
    
    @Override
    public int reload() {
        if (handgunAmmo != 30) {
            System.out.println("Current ammo = " +handgunAmmo);
            handgunAmmo = 30;
        }
        System.out.println("Reloading");
        return handgunAmmo;
    }
}

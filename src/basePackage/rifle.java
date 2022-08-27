/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basePackage;

/**
 *
 * @author Asus
 */
public class rifle implements gunsInterface {
    // Attribute
    private final int rifleDamage;
    private int rifleAmmo = 30;
    private int damageGiven;
    int triggerTapping;
    
    // Constructor
    public rifle(int triggerTapping) {
        this.rifleDamage = 30;
        this.triggerTapping = triggerTapping;
    }
    
    // Method
    @Override
    public int shoot() {
        System.out.println("Shooting with rifle");
        for (int i = triggerTapping; i > 0; i--){
            damageGiven += rifleDamage;
            rifleAmmo--;
        }
        System.out.println("Total damage = " +damageGiven);
        return damageGiven;
    }
    
    @Override
    public int reload() {
        if (rifleAmmo != 30) {
            System.out.println("Current ammo = " +rifleAmmo);
            rifleAmmo = 30;
        }
        System.out.println("Reloading");
        return rifleAmmo;
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(700, 70);
        boss.setDamage(70);
        boss.setHealth(700);
        boss.weapon.setTypeOfWeapon(WeaponType.FIREARMS);
        boss.weapon.setNameOfWeapon("AWP");
        System.out.println(boss.info());
    }
}
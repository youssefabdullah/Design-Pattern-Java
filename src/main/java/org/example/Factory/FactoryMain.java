package org.example.Factory;

public class FactoryMain {
    public static void main(String[] args) {

        int loop = 2;
        while (loop>0){
            Enemy enemy = EnemyFactory.createEnemy(loop);
            enemy.showUp();
            loop--;
        }
    }
}

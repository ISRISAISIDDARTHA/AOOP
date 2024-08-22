abstract class Enemy {
    public abstract void attack();
}

class EasyEnemy extends Enemy {
    @Override
    public void attack() {
        System.out.println("Easy enemy is attacking!");
    }
}

class HardEnemy extends Enemy {
    @Override
    public void attack() {
        System.out.println("Hard enemy is attacking!");
    }
}

abstract class EnemyFactory {
    public abstract Enemy createEnemy();
}

class EasyEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new EasyEnemy();
    }
}

class HardEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new HardEnemy();
    }
}

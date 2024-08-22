abstract class Weapon {
    public abstract void use();
}
abstract class PowerUp {
    public abstract void activate();
}
class EasyWeapon extends Weapon {
    @Override
    public void use() {
        System.out.println("Using easy weapon!");
    }
}
class HardWeapon extends Weapon {
    @Override
    public void use() {
        System.out.println("Using hard weapon!");
    }
}
class EasyPowerUp extends PowerUp {
    @Override
    public void activate() {
        System.out.println("Activating easy power-up!");
    }
}
class HardPowerUp extends PowerUp {
    @Override
    public void activate() {
        System.out.println("Activating hard power-up!");
    }
}
abstract class GameFactory {
    public abstract Weapon createWeapon();
    public abstract PowerUp createPowerUp();
}
class EasyGameFactory extends GameFactory {
    @Override
    public Weapon createWeapon() {
        return new EasyWeapon();
    }
    @Override
    public PowerUp createPowerUp() {
        return new EasyPowerUp();
    }
}
class HardGameFactory extends GameFactory {
    @Override
    public Weapon createWeapon() {
        return new HardWeapon();
    }
    @Override
    public PowerUp createPowerUp() {
        return new HardPowerUp();
    }
}

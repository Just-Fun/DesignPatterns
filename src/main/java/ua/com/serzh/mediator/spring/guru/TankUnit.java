package ua.com.serzh.mediator.spring.guru;

/**
 * @author sergii.zagryvyi on 12.10.2017
 */
public class TankUnit implements ArmedUnit {

    private Commander commander;

    public TankUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if (commander.canAttack()) {
            System.out.println("TankUnit: Attacking.....");
            commander.setAttackStatus(false);
        } else {
            System.out.println("TankUnit: Cannot attack now. Other units attacking....");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("TankUnit: Stopped attacking.....");
        commander.setAttackStatus(true);
    }
}

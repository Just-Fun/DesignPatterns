package ua.com.serzh.mediator.spring.guru;

/**
 * @author sergii.zagryvyi on 12.10.2017
 */
public interface Commander {

    void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);

    void setAttackStatus(boolean attackStatus);

    boolean canAttack();

    void startAttack(ArmedUnit armedUnit);

    void ceaseAttack(ArmedUnit armedUnit);
}

package ua.com.serzh.mediator.spring.guru;

import org.junit.Test;

/**
 * @author sergii.zagryvyi on 12.10.2017
 */
public class CommanderImplTest {

    @Test
    public void testMediator() throws Exception {
        Commander commander = new CommanderImpl();
        ArmedUnit soldierUnit = new SoldierUnit(commander);
        ArmedUnit tankUnit = new TankUnit(commander);
        commander.registerArmedUnits(soldierUnit, tankUnit);
        commander.startAttack(soldierUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soldierUnit);
        commander.startAttack(tankUnit);
    }
}

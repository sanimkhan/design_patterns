package com.designPatterns.behavioral.mediator;

import com.designPatterns.behavioral.mediator.commander.Commander;
import com.designPatterns.behavioral.mediator.commander.CommanderImpl;
import com.designPatterns.behavioral.mediator.unit.ArmedUnit;
import com.designPatterns.behavioral.mediator.unit.SoldierUnit;
import com.designPatterns.behavioral.mediator.unit.TankUnit;

public class Main {

    public static void main(String[] args) {
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

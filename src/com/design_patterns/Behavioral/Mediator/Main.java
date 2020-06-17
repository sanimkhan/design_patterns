package com.design_patterns.Behavioral.Mediator;

import com.design_patterns.Behavioral.Mediator.Commander.Commander;
import com.design_patterns.Behavioral.Mediator.Commander.CommanderImpl;
import com.design_patterns.Behavioral.Mediator.Unit.ArmedUnit;
import com.design_patterns.Behavioral.Mediator.Unit.SoldierUnit;
import com.design_patterns.Behavioral.Mediator.Unit.TankUnit;

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

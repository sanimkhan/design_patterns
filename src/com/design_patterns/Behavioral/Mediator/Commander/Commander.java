package com.design_patterns.Behavioral.Mediator.Commander;

import com.design_patterns.Behavioral.Mediator.Unit.ArmedUnit;

public interface Commander {
    void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);

    void setAttackStatus(boolean attackStatus);

    boolean canAttack();

    void startAttack(ArmedUnit armedUnit);

    void ceaseAttack(ArmedUnit armedUnit);
}

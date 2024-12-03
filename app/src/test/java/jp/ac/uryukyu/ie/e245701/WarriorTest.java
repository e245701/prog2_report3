package jp.ac.uryukyu.ie.e245701;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int defaultWarriorHp = 100;
        Warrior demoWarrior = new Warrior("デモ勇者", defaultWarriorHp, 10);
        Enemy slime = new Enemy("スライムもどき", 100, 100);
        for (int i = 0; i < 3; i++) {
            int slimeHpBefore = slime.getHitpoint();
            demoWarrior.attackWithWeponSkill(slime);
            int slimeHpAfter = slime.getHitpoint();
            assertEquals(demoWarrior.getAttack() * 1.5, slimeHpBefore - slimeHpAfter);
        }
    }
}

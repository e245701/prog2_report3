package jp.ac.uryukyu.ie.e245701;

public class Warrior extends Hero{

    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if( !isDead() ) {
            int damage = (int)(1.5 * super.getAttack());
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}

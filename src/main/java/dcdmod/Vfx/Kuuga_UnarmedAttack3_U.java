package dcdmod.Vfx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.vfx.AbstractGameEffect;
import dcdmod.Characters.Decade;

public class Kuuga_UnarmedAttack3_U extends AbstractGameEffect {

	private boolean start = true;

	public Kuuga_UnarmedAttack3_U() {
		this.duration = 0.63F;//倒数时间
		this.startingDuration = 0.63F;//持续时间
	}

	public void update() {
		if(this.duration == this.startingDuration){
			AbstractDungeon.effectsQueue.add(new Kuuga_AllMonsterAttacked());
		}

		this.duration -= Gdx.graphics.getDeltaTime();

		if(this.duration < this.startingDuration && start) {
			final Decade Decade = (Decade)AbstractDungeon.player;
			Decade.Trickster(91);//切换模型
			start = false;
		}

		if (this.duration < 0.0F) {
			this.isDone = true;
			final Decade Decade = (Decade)AbstractDungeon.player;
			Decade.Trickster(4);//时间结束后切换回原本模型
		}
	}

	public void render(SpriteBatch sb) { }

	public void dispose() { }
}
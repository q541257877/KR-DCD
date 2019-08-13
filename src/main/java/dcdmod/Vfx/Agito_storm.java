package dcdmod.Vfx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.vfx.AbstractGameEffect;
import dcdmod.Characters.Decade;

public class Agito_storm extends AbstractGameEffect {

	private boolean start = true;

	public Agito_storm() {

		this.duration = 0.75F;//倒数时间
		this.startingDuration = 0.75F;//持续时间

	}

	public void update() {
		this.duration -= Gdx.graphics.getDeltaTime();
		if (this.duration < 0.0F) {
			this.isDone = true;
			if(AbstractDungeon.player.hasPower("AgitoPowerPower")){
				final Decade Decade = (Decade)AbstractDungeon.player;
				Decade.Trickster(16);//时间结束后切换回原本模型
			}
			else {
				final Decade Decade = (Decade)AbstractDungeon.player;
				Decade.Trickster(14);//时间结束后切换回原本模型
			}
		}
	}

	public void render(SpriteBatch sb) {
		if(start) {
			final Decade Decade = (Decade)AbstractDungeon.player;
			Decade.Trickster(15);//切换模型
			start = false;
		}
	}

	public void dispose() {
	}
}
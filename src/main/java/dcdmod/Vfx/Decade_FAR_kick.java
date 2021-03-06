package dcdmod.Vfx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.DamageAction;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.vfx.AbstractGameEffect;
import dcdmod.Characters.Decade;
import dcdmod.Patches.AbstractAnimation;

/**
 * @author hoykj
 */
public class Decade_FAR_kick extends AbstractGameEffect {
    private final int damage;
    private int stage;
    private AbstractCreature source, target;
    private Vector2 start, current;
    private boolean attack = true;
    private AbstractAnimation decade_far_kick = null;

    public Decade_FAR_kick(AbstractCreature source, AbstractCreature target,int x) {
        this.duration = 3.2F;
        this.startingDuration = this.duration;
        this.stage = 0;
        this.source = source;
        this.target = target;
        this.start = new Vector2(source.drawX, source.drawY);
        this.current = new Vector2(source.hb.cX, source.hb.cY - source.hb.height / 2 + target.hb.height / 2);
        this.damage = x;
    }

    public void update() {
        if(this.duration == this.startingDuration){
            AbstractDungeon.effectsQueue.add(new Decade_FAR_Card(this.source, this.target , this.damage));
        }

        this.duration -= Gdx.graphics.getDeltaTime();
        if(this.duration <= 1.3F && attack){
            AbstractDungeon.actionManager.addToBottom(new DamageAction(this.target,new DamageInfo(this.source, this.damage, DamageInfo.DamageType.NORMAL), AbstractGameAction.AttackEffect.BLUNT_HEAVY));
            attack = false;
        }

        if((this.duration < this.startingDuration - 1.2F) && (this.stage == 0)){
            if(this.target.isDead || this.target.isDying){
                this.isDone = true;
            }
            else{
                final Decade Decade = (Decade) AbstractDungeon.player;
                Decade.Trickster(71);//中途切换模型
                this.stage ++;
            }
        }

        if((this.duration < this.startingDuration - 1.2F) && (this.duration > this.startingDuration - 1.5F)){
            if(this.target.isDead || this.target.isDying){
                this.isDone = true;
            }
            else{
                this.source.drawY += 1000 * Settings.scale * Gdx.graphics.getDeltaTime();
                this.current.y += 1000 * Settings.scale * Gdx.graphics.getDeltaTime();
            }

        }
        else if((this.duration < this.startingDuration - 1.5F) && (this.duration > this.startingDuration - 1.87F)){
            if(this.stage == 1) {
                final Decade Decade = (Decade) AbstractDungeon.player;
                Decade.Trickster(72);//中途切换模型
                this.stage++;
            }
        }
        else if((this.duration < this.startingDuration - 1.87F) && (this.duration > 0.55F)){
            if(this.stage == 2) {
                final Decade Decade = (Decade) AbstractDungeon.player;
                Decade.Trickster(74);//中途切换模型
                String DECADE_KICK_ATLAS = "img/char/DCD_Animation/decade/FAR/Decade_FAR_kick.atlas";
                String DECADE_KICK_JSON = "img/char/DCD_Animation/decade/FAR/Decade_FAR_kick.json";
                new AbstractAnimation("decade_far_kick", DECADE_KICK_ATLAS, DECADE_KICK_JSON, 0.8f, this.source.drawX, this.source.drawY, this.source.hb_w, this.source.hb_h, 1.0f);
                decade_far_kick = AbstractAnimation.getAnimation("decade_far_kick");
                decade_far_kick.setMovable(false);
                decade_far_kick.state.setAnimation(0, "kick", true);
                this.stage++;
            }
            if(this.source.drawX < this.target.drawX){
                decade_far_kick.drawX += (this.target.hb.cX - this.current.x) / 0.2 * Gdx.graphics.getDeltaTime();
                this.source.drawX += (this.target.hb.cX - this.current.x) / 0.2 * Gdx.graphics.getDeltaTime();
            }
            if(this.source.drawY > this.target.drawY){
                decade_far_kick.drawY += (this.target.hb.cY - this.current.y) / 0.2 * Gdx.graphics.getDeltaTime();
                this.source.drawY += (this.target.hb.cY - this.current.y) / 0.2 * Gdx.graphics.getDeltaTime();
            }
        }
        else if((this.duration <= 0.55F) && (this.stage == 3)){
            final Decade Decade = (Decade) AbstractDungeon.player;
            Decade.Trickster(73);//中途切换模型
            AbstractAnimation.clear("decade_far_kick");
            String DECADE_KICK_ATLAS = "img/char/DCD_Animation/decade/FAR/Decade_FAR3.atlas";
            String DECADE_KICK_JSON = "img/char/DCD_Animation/decade/FAR/Decade_FAR3.json";
            new AbstractAnimation("decade_far3", DECADE_KICK_ATLAS, DECADE_KICK_JSON, 0.8f, this.source.drawX, this.source.drawY, this.source.hb_w, this.source.hb_h, 1.0f);
            decade_far_kick = AbstractAnimation.getAnimation("decade_far3");
            decade_far_kick.setMovable(false);
            decade_far_kick.state.setAnimation(0, "FAR3", false);
            this.stage ++;
        }

        if(this.duration <= 0.55F && this.duration > 0.45F){
            this.source.drawX += (this.target.hb.cX - this.current.x) / 1 * Gdx.graphics.getDeltaTime();
            decade_far_kick.drawX += (this.target.hb.cX - this.current.x) / 1 * Gdx.graphics.getDeltaTime();
            this.source.drawY += (this.target.hb.cY - this.current.y) / 1.5 * Gdx.graphics.getDeltaTime();
            decade_far_kick.drawY += (this.target.hb.cY - this.current.y) / 1.5 * Gdx.graphics.getDeltaTime();
        }

        if (this.duration <= 0.0F) {
            this.isDone = true;
            AbstractAnimation.clear("decade_far3");
            final Decade Decade = (Decade)AbstractDungeon.player;
            Decade.Trickster(1);//时间结束后切换回原本模型
            this.source.drawX = this.start.x;
            this.source.drawY = this.start.y;
        }
    }

    public void render(SpriteBatch sb) {
    }

    public void dispose() {
    }
}
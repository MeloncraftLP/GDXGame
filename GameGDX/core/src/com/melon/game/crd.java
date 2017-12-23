package com.melon.game;

//250, 600

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class crd
{

    public static void rCreate()
    {
        Var.AnimationBatch = new SpriteBatch();

        //Animationen
        CreateClass.CreateAnimationRun();
        CreateClass.CreateAnimationJump();
        CreateClass.CreateAnimationIdle();
        CreateClass.CreateTree();
        CreateClass.GameOverCreate();
        CreateClass.CreateBackground();
        CreateClass.CreateHitBox();
        //CreateClass.CreateAnimationGeschenke();

    }

    public static void rRender()
    {

        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        Var.AnimationBatch.begin();//projector

        Var.BackgorundSprite.draw(Var.AnimationBatch);
        Var.TreeSprite.draw(Var.AnimationBatch);

        Var.Overlap = Var.HitBoxPlayer.overlaps(Var.HitBoxBaum);

        KeyHandler.KeyHandlerMeth();

        if(Var.Overlap == true)
        {

            Var.White.draw(Var.AnimationBatch);
            Var.LogoSprite.draw(Var.AnimationBatch);

            Var.GameOver.draw(Var.AnimationBatch, "GAME OVER!", 250,955/2+100);
            Var.GameOver.getData().setScale(10);
            Var.GameOver.setColor(0,0,0,1);

        }

        Var.HitBoxPlayer.setPosition(Var.RunSprite.getX() + 200, Var.RunSprite.getY() + 25);

        Var.RunAnimationBool = false; //Booleans
        Var.JumpAnimationBool = false;
        Var.RunterfallenBool = false;
        // GeschenkeAnimationBool = false;
        Var.IdleAnimationBool = false;

        Var.AnimationBatch.end();

        /*
                Diese Booleans sind Vetreter für die Animationen.
                Wenn eine Animation läuft werden diese Booleans auf true gesetzt.
                Jetzt werden sie wieder alle für den nächsten Run vorbereitet.
                Alle werden auf false gesetzt
            */

    }

    public static void rDispose()
    {

        //beenden
        Var.AnimationBatch.dispose();

        Var.Logo.dispose();
        Var.BackgroundTexture.dispose();
        Var.DeadTexture.dispose();
        Var.TreeTexture.dispose();
        Var.WhiteTex.dispose();
        Var.RunTexture.dispose();
        Var.IdleTexture.dispose();
        Var.JumpTexture.dispose();
        //GeschenkeTexture.dispose();

    }


}

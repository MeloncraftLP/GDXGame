package com.melon.game;

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
        //CreateClass.CreateAnimationGeschenke();

    }

    public static void rRender()
    {

        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        Var.AnimationBatch.begin();//projector

        KeyHandler.KeyHandlerMeth();
        Var.TreeSprite.draw(Var.AnimationBatch);
        //Var.TreeSprite.draw(Var.AnimationBatch);
        Var.HitBoxPlayer.set((int)Var.RunSprite.getX(), (int)Var.RunSprite.getY(), (int)Var.RunSprite.getWidth(),  (int)Var.RunSprite.getHeight());
        Var.HitBoxBaum.set((int)Var.TreeSprite.getX(), (int)Var.TreeSprite.getY(), (int) Var.TreeSprite.getWidth(), (int)Var.TreeSprite.getHeight());

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

        Var.RunTexture.dispose();
        Var.IdleTexture.dispose();
        Var.JumpTexture.dispose();
        //GeschenkeTexture.dispose();

        Var.Logo.dispose();

    }


}

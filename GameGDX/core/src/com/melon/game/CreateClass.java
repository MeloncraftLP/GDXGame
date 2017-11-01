package com.melon.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Timer;

public class CreateClass
{

    public static void CreateAnimationJump()
    {

        Main.JumpTexture = new Texture("Sprites/Jump.png");
        Main.JumpRegion = TextureRegion.split(Main.JumpTexture, 934, 641);
        Main.JumpSprite = new Sprite(Main.JumpRegion[0][0]);

        Timer.schedule(new Timer.Task()
        {

            @Override
            public void run()
            {

                Main.JumpZeile++;

                if(Main.JumpZeile > 15)
                {

                    Main.JumpZeile = 0;

                }

                Main.JumpSprite.setRegion(Main.JumpRegion[Main.JumpZeile][0]);

            }

        },0, 1/32f);

    }


    public static void CreateAnimationRun()
    {

        Main.RunTexture = new Texture("Sprites/Run.png");
        Main.RunRegion = TextureRegion.split(Main.RunTexture, 934, 641);
        Main.RunSprite = new Sprite(Main.RunRegion[0][0]);

        Timer.schedule(new Timer.Task()
        {

            @Override
            public void run()
            {

                Main.RunZeile++;

                if(Main.RunZeile > 10)
                {

                    Main.RunZeile = 0;

                }

                Main.RunSprite.setRegion(Main.RunRegion[Main.RunZeile][0]);

            }

        },0, 1/20f);

    }

    public static void CreateAnimationIdle()
    {

        Main.IdleTexture = new Texture("Sprites/Idle.png");
        Main.IdleRegion = TextureRegion.split(Main.IdleTexture, 934, 641);
        Main.IdleSprite = new Sprite(Main.IdleRegion[0][0]);

        Timer.schedule(new Timer.Task()
        {

            @Override
            public void run()
            {

                Main.IdleZeile++;

                if(Main.IdleZeile > 7)
                {

                    Main.IdleZeile = 0;

                }

                Main.IdleSprite.setRegion(Main.IdleRegion[Main.IdleZeile][0]);

            }

        },0, 1/23f);


    }

    /*

    public static void CreateAnimationGeschenke()
    {

        Main.GeschenkeTexture = new Texture("Sprites/Geschenke.png");
        Main.GeschenkeRegion = TextureRegion.split(Main.GeschenkeTexture, 934, 641);
        Main.GeschenkeSprite = new Sprite(Main.GeschenkeRegion[0][0]);

        Timer.schedule(new Timer.Task()
        {

            @Override
            public void run()
            {

                Main.GeschenkeFrame++;

                if(Main.GeschenkeFrame > 10)
                {

                    Main.GeschenkeFrame = 0;

                }

                Main.GeschenkeSprite.setRegion(Main.GeschenkeRegion[Main.GeschenkeFrame][0]);

            }

        },0, 1/23f);

    }

        */

}
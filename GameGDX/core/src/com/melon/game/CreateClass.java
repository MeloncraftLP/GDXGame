package com.melon.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Timer;

public class CreateClass
{

    public static void CreateAnimationJump()
    {

        Main.JumpTexture = new Texture("Sprites/Jump.png"); //Spritesheet
        Main.JumpRegion = TextureRegion.split(Main.JumpTexture, 934, 641); //Einzelne Größe Bild
        Main.JumpSprite = new Sprite(Main.JumpRegion[0][0]); //Array [yCord][xCord]

        Timer.schedule(new Timer.Task() //23fps
        {

            @Override
            public void run()
            {

                Main.JumpZeile++;

                if(Main.JumpZeile > 15) //nach 16tes Bild...
                {

                    Main.JumpZeile = 0; //...reset (0)

                }

                Main.JumpSprite.setRegion(Main.JumpRegion[Main.JumpZeile][0]); //Festlegen welches Bild kommt

            }

        },0, 1/32f);

    }


    public static void CreateAnimationRun()
    {

        Main.RunTexture = new Texture("Sprites/Run.png"); //Spritesheet
        Main.RunRegion = TextureRegion.split(Main.RunTexture, 934, 641); //Bildgröße
        Main.RunSprite = new Sprite(Main.RunRegion[0][0]); //Array [yCord][xCord]

        Timer.schedule(new Timer.Task() //Timer 20fps
        {

            @Override
            public void run()
            {

                Main.RunZeile++;

                if(Main.RunZeile > 10) //nach 11tes Bild...
                {

                    Main.RunZeile = 0; //reset (0)

                }

                Main.RunSprite.setRegion(Main.RunRegion[Main.RunZeile][0]); //Bild ändern

            }

        },0, 1/20f);

    }

    public static void CreateAnimationIdle()
    {

        Main.IdleTexture = new Texture("Sprites/Idle.png"); //Spritesheet
        Main.IdleRegion = TextureRegion.split(Main.IdleTexture, 934, 641); //Bildgröße
        Main.IdleSprite = new Sprite(Main.IdleRegion[0][0]); //Array [yCord][xCord]

        Timer.schedule(new Timer.Task() //Timer 20fps
        {

            @Override
            public void run()
            {

                Main.IdleZeile++;

                if(Main.IdleZeile > 7) //nach 8tes Bild reset (0)
                {

                    Main.IdleZeile = 0;

                }

                Main.IdleSprite.setRegion(Main.IdleRegion[Main.IdleZeile][0]); //Bild ändern

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
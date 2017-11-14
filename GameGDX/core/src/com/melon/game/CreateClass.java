package com.melon.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Timer;

public class CreateClass
{

    public static void CreateAnimationJump()
    {

        Var.JumpTexture = new Texture("Sprites/Jump.png"); //Spritesheet
        Var.JumpRegion = TextureRegion.split(Var.JumpTexture, 934, 641); //Einzelne Größe Bild
        Var.JumpSprite = new Sprite(Var.JumpRegion[0][0]); //Array [yCord][xCord]

        Timer.schedule(new Timer.Task() //23fps
        {

            @Override
            public void run()
            {

                Var.JumpZeile++;

                if(Var.JumpZeile > 15) //nach 16tes Bild...
                {

                    Var.JumpZeile = 0; //...reset (0)

                }

                Var.JumpSprite.setRegion(Var.JumpRegion[Var.JumpZeile][0]); //Festlegen welches Bild kommt

            }

        },0, 1/32f);

    }


    public static void CreateAnimationRun()
    {

        Var.RunTexture = new Texture("Sprites/Run.png"); //Spritesheet
        Var.RunRegion = TextureRegion.split(Var.RunTexture, 934, 641); //Bildgröße
        Var.RunSprite = new Sprite(Var.RunRegion[0][0]); //Array [yCord][xCord]

        Timer.schedule(new Timer.Task() //Timer 20fps
        {

            @Override
            public void run()
            {

                Var.RunZeile++;

                if(Var.RunZeile > 10) //nach 11tes Bild...
                {

                    Var.RunZeile = 0; //reset (0)

                }

                Var.RunSprite.setRegion(Var.RunRegion[Var.RunZeile][0]); //Bild ändern

            }

        },0, 1/20f);

    }

    public static void CreateAnimationIdle()
    {

        Var.IdleTexture = new Texture("Sprites/Idle.png"); //Spritesheet
        Var.IdleRegion = TextureRegion.split(Var.IdleTexture, 934, 641); //Bildgröße
        Var.IdleSprite = new Sprite(Var.IdleRegion[0][0]); //Array [yCord][xCord]

        Timer.schedule(new Timer.Task() //Timer 20fps
        {

            @Override
            public void run()
            {

                Var.IdleZeile++;

                if(Var.IdleZeile > 7) //nach 8tes Bild reset (0)
                {

                    Var.IdleZeile = 0;

                }

                Var.IdleSprite.setRegion(Var.IdleRegion[Var.IdleZeile][0]); //Bild ändern

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

    public static void CreateTree()
    {

        Var.TreeTexture = new Texture("Sprites/Idle.png"); //Bild von Baum
        Var.TreeSprite = new Sprite(Var.TreeTexture); //Sprite = Texture
        Var.TreeSprite.setPosition(0,0);

    }

}
package com.melon.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;


public class KeyHandler
{

    public static void KeyHandlerMeth()
    {

        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT) && Var.RunAnimationBool == false) //Pfeil-Rechts und nicht rennen
        {

            Var.RunAnimationBool = true; //Rennen = true

            //Alle Sprites um +12(x) bewegen
            Var.RunSprite.translateX(+24f);
            Var.JumpSprite.translateX(+24f);
//            Main.GeschenkeSprite.translateX(+24f);
            Var.IdleSprite.translateX(+24f);

            Var.RunSprite.draw(Var.AnimationBatch); //Laufanimation projezieren

        }

        if(Gdx.input.isKeyPressed(Input.Keys.LEFT) && Var.RunAnimationBool == false) //Pfeil-Links und nicht rennen
        {

            Var.RunAnimationBool = true; //Rennen = true

            //Alle Sprites um -12(x) bewegen
            Var.RunSprite.translateX(-24f);
            Var.JumpSprite.translateX(-24f);
//            Main.GeschenkeSprite.translateX(-24f);
            Var.IdleSprite.translateX(-24f);

            if(Var.RunSprite.isFlipX() == false) //wenn Spieler nach rechts guckt
            {

                Var.RunSprite.flip(true, false); //Spieler drehen

            }

            Var.RunSprite.draw(Var.AnimationBatch); //Laufanimation projezieren

        }

        if(Gdx.input.isKeyPressed(Input.Keys.UP) && Var.JumpAnimationBool == false) //Wenn Pfeil-Hochh und nicht springen
        {

            Var.JumpAnimationBool = true; //Springen = true

            if(Var.JumpTime < 520) //Wenn yCord(Kopie) < 460 und nicht Runterfallen:
            {

                Var.JumpTime += 50; //yCord(Kopie) +20

                //Alle Sprites +20(y) bewegen
                Var.RunSprite.translateY(+50f);
                Var.JumpSprite.translateY(+50f);
//               Main.GeschenkeSprite.translateY(+50f);4
                Var.IdleSprite.translateY(+50f);

            }

            else // yCord(Kopie) > 460
            {

                KeyHandler.RunterFallen(); //Runterfallen einleiten

            }

            if(Var.RunAnimationBool == false) //Schließlich wenn man nicht rennt:
            {

                Var.JumpSprite.draw(Var.AnimationBatch); //Sprunganimation projezieren

            }

        }

        else //Wenn man nicht die Sprungstaste drückt
        {

            KeyHandler.RunterFallen(); //Runterfallen

        }

/*
        if(keycode == Input.Keys.DOWN && Main.GeschenkeAnimationBool == false)
        {

            Main.GeschenkeAnimationBool = true;

         //   Main.GeschenkeSprite.translateX(-1f);
            Main.RunSprite.translateX(-1f);
            Main.JumpSprite.translateX(-1f);
            Main.IdleSprite.translateX(-1f);

//            Main.GeschenkeSprite.draw(Main.AnimationBatch);

        }

        */

        if(Gdx.input.isKeyPressed(Input.Keys.ANY_KEY))
        {

        }
        else
        {

            Var.IdleSprite.draw(Var.AnimationBatch); //Idleanimation projezieren

        }


    }

    static void RunterFallen() //Runterfallen-Methode
    {

        Var.RunterfallenBool = true; //Runterfallen(Kopie) true

        if(Var.JumpTime > 0) //Wenn in der Luft
        {

            Var.JumpTime -= 40; //yCord(Kopie) -40(y)

            //Alle Sprites -40(y) bewegen
            Var.RunSprite.translateY(-40f);
            Var.JumpSprite.translateY(-40f);
//                    Main.GeschenkeSprite.translateY(-40f);
            Var.IdleSprite.translateY(-40f);

        }

    }

}
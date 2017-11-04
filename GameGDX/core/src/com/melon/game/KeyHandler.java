package com.melon.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;


public class KeyHandler
{

    public static void KeyHandlerMeth()
    {

        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT) && Main.RunAnimationBool == false) //Pfeil-Rechts und nicht rennen
        {

            Main.RunAnimationBool = true; //Rennen = true

            //Alle Sprites um +12(x) bewegen
            Main.RunSprite.translateX(+12f);
            Main.JumpSprite.translateX(+12f);
//            Main.GeschenkeSprite.translateX(+12f);
            Main.IdleSprite.translateX(+12f);

            Main.RunSprite.draw(Main.batch); //Laufanimation projezieren

        }

        if(Gdx.input.isKeyPressed(Input.Keys.LEFT) && Main.RunAnimationBool == false) //Pfeil-Links und nicht rennen
        {

            Main.RunAnimationBool = true; //Rennen = true

            //Alle Sprites um -12(x) bewegen
            Main.RunSprite.translateX(-12f);
            Main.JumpSprite.translateX(-12f);
//            Main.GeschenkeSprite.translateX(-12f);
            Main.IdleSprite.translateX(-12f);

            if(Main.RunSprite.isFlipX() == false) //wenn Spieler nach rechts guckt
            {

                Main.RunSprite.flip(true, false); //Spieler drehen

            }

            Main.RunSprite.draw(Main.batch); //Laufanimation projezieren

        }

        if(Gdx.input.isKeyPressed(Input.Keys.UP) && Main.JumpAnimationBool == false) //Wenn Pfeil-Hochh und nicht springen
        {

            Main.JumpAnimationBool = true; //Springen = true

            if(Main.JumpTime < 460) //Wenn yCord(Kopie) < 460 und nicht Runterfallen:
            {

                Main.JumpTime += 20; //yCord(Kopie) +20

                //Alle Sprites +20(y) bewegen
                Main.RunSprite.translateY(+20f);
                Main.JumpSprite.translateY(+20f);
//               Main.GeschenkeSprite.translateY(+20f);4
                Main.IdleSprite.translateY(+20f);

            }

            else // yCord(Kopie) > 460
            {

                KeyHandler.RunterFallen(); //Runterfallen einleiten

            }

            if(Main.RunAnimationBool == false) //Schließlich wenn man nicht rennt:
            {

                Main.JumpSprite.draw(Main.batch); //Sprunganimation projezieren

            }

        }

        else //Wenn man nicht die Sprungstaste drückt
        {

            KeyHandler.RunterFallen(); //Runterfallen

        }

/*
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN) && Main.GeschenkeAnimationBool == false)
        {

            Main.GeschenkeAnimationBool = true;

         //   Main.GeschenkeSprite.translateX(-1f);
            Main.RunSprite.translateX(-1f);
            Main.JumpSprite.translateX(-1f);
            Main.IdleSprite.translateX(-1f);

//            Main.GeschenkeSprite.draw(Main.batch);

        }

        */

        if(Gdx.input.isKeyPressed(Input.Keys.ANY_KEY))
        {

        }

        else //wenn keine Taste gedrückt wird:
        {

            Main.IdleSprite.draw(Main.batch); //Idleanimation projezieren

        }

    }

    static void RunterFallen() //Runterfallen-Methode
    {

        Main.RunterfallenBool = true; //Runterfallen(Kopie) true

        if(Main.JumpTime > 0) //Wenn in der Luft
        {

            Main.JumpTime -= 40; //yCord(Kopie) -40(y)

            //Alle Sprites -40(y) bewegen
            Main.RunSprite.translateY(-40f);
            Main.JumpSprite.translateY(-40f);
//                    Main.GeschenkeSprite.translateY(-40f);
            Main.IdleSprite.translateY(-40f);

        }

    }

}
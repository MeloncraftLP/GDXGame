package com.melon.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;


public class KeyHandler
{

    public static void KeyHandlerMeth()
    {

        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
        {

            Main.RunSprite.translateX(+12f);
            Main.JumpSprite.translateX(+12f);
//            Main.GeschenkeSprite.translateX(+12f);
            Main.IdleSprite.translateX(+12f);

            Main.RunSprite.draw(Main.batch);

        }

        if(Gdx.input.isKeyPressed(Input.Keys.UP))
        {

            if(Main.JumpTime < 510)
            {

                Main.JumpTime += 30;

                Main.RunSprite.translateY(+30f);
                Main.JumpSprite.translateY(+30f);
//               Main.GeschenkeSprite.translateY(+30f);
                Main.IdleSprite.translateY(+30f);

            }

            else
            {

                KeyHandler.RunterFallen();

            }

            Main.JumpSprite.draw(Main.batch);

        }

        else
        {

            KeyHandler.RunterFallen();

        }


        if(Gdx.input.isKeyPressed(Input.Keys.DOWN))
        {

         //   Main.GeschenkeSprite.translateX(-1f);
            Main.RunSprite.translateX(-1f);
            Main.JumpSprite.translateX(-1f);
            Main.IdleSprite.translateX(-1f);

//            Main.GeschenkeSprite.draw(Main.batch);

        }

        if(Gdx.input.isKeyPressed(Input.Keys.ANY_KEY))
        {

        }

        else
        {

            Main.IdleSprite.draw(Main.batch);

        }

    }

    static void RunterFallen()
    {

        while(Main.JumpTime > 0)
        {

            Main.JumpTime -= 30;

            Main.RunSprite.translateY(-30f);
            Main.JumpSprite.translateY(-30f);
//                    Main.GeschenkeSprite.translateY(-30f);
            Main.IdleSprite.translateY(-30f);

        }


    }

}
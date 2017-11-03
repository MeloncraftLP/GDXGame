package com.melon.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;


public class KeyHandler
{

    public static void KeyHandlerMeth()
    {

        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT) && Main.RunAnimationBool == false)
        {

            Main.RunAnimationBool = true;

            Main.RunSprite.translateX(+12f);
            Main.JumpSprite.translateX(+12f);
//            Main.GeschenkeSprite.translateX(+12f);
            Main.IdleSprite.translateX(+12f);

            Main.RunSprite.draw(Main.batch);

        }

        if(Gdx.input.isKeyPressed(Input.Keys.LEFT) && Main.RunAnimationBool == false)
        {

            Main.RunAnimationBool = true;

            Main.RunSprite.translateX(-12f);
            Main.JumpSprite.translateX(-12f);
//            Main.GeschenkeSprite.translateX(-12f);
            Main.IdleSprite.translateX(-12f);

            if(Main.RunSprite.isFlipX() == false)
            {

                Main.RunSprite.flip(true, false);

            }

            Main.RunSprite.draw(Main.batch);

        }

        if(Gdx.input.isKeyPressed(Input.Keys.UP) && Main.JumpAnimationBool == false)
        {

            Main.JumpAnimationBool = true;

            if(Main.JumpTime < 340)
            {

                Main.JumpTime += 20;

                Main.RunSprite.translateY(+20f);
                Main.JumpSprite.translateY(+20f);
//               Main.GeschenkeSprite.translateY(+20f);
                Main.IdleSprite.translateY(+20f);

            }

            else
            {

                KeyHandler.RunterFallen();

            }

            if(Main.RunAnimationBool == false)
            {

                Main.JumpSprite.draw(Main.batch);

            }

        }

        else
        {

            KeyHandler.RunterFallen();

        }


        if(Gdx.input.isKeyPressed(Input.Keys.DOWN) && Main.GeschenkeAnimationBool == false)
        {

            Main.GeschenkeAnimationBool = true;

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

        if(Main.JumpTime > 0)
        {

            Main.JumpTime -= 40;

            Main.RunSprite.translateY(-40f);
            Main.JumpSprite.translateY(-40f);
//                    Main.GeschenkeSprite.translateY(-40f);
            Main.IdleSprite.translateY(-40f);

        }

    }

}
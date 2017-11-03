package com.melon.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


public class Main extends ApplicationAdapter
{

    static int JumpTime = 0;

    static int RunZeile = 0;
    static int IdleZeile = 0;
    static int IdleSpalte = 0;
    static int GeschenkeFrame = 0;
    static int JumpZeile = 0;

    static boolean RunAnimationBool = false;
    static boolean IdleAnimationBool = false;
    static boolean JumpAnimationBool = false;
    static boolean GeschenkeAnimationBool = false;

    static SpriteBatch batch;

    static Texture RunTexture;
    static Texture IdleTexture;
    static Texture GeschenkeTexture;
    static Texture JumpTexture;

    static TextureRegion [][] RunRegion;
    static TextureRegion [][] IdleRegion;
    static TextureRegion [][] GeschenkeRegion;
    static TextureRegion [][] JumpRegion;

    static Sprite RunSprite;
    static Sprite IdleSprite;
    static Sprite GeschenkeSprite;
    static Sprite JumpSprite;

    @Override
    public void create()
    {

        batch = new SpriteBatch();

        CreateClass.CreateAnimationRun();
        CreateClass.CreateAnimationJump();
        CreateClass.CreateAnimationIdle();
        //CreateClass.CreateAnimationGeschenke();

    }

    @Override
    public void render()
    {

        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        KeyHandler.KeyHandlerMeth();
        RunAnimationBool = false;
        JumpAnimationBool = false;
        GeschenkeAnimationBool = false;
        IdleAnimationBool = false;

        batch.end();

    }

    @Override
    public void dispose()
    {

        batch.dispose();

        RunTexture.dispose();
        IdleTexture.dispose();
        JumpTexture.dispose();
        GeschenkeTexture.dispose();

    }

}


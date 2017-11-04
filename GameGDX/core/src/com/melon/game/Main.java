package com.melon.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


public class Main extends ApplicationAdapter
{

    //Var:
    static int JumpTime = 0;

    static int RunZeile = 0;
    static int IdleZeile = 0;
    static int IdleSpalte = 0;
   // static int GeschenkeFrame = 0;
    static int JumpZeile = 0;

    static boolean RunAnimationBool = false;
    static boolean IdleAnimationBool = false;
    static boolean JumpAnimationBool = false;
    static boolean RunterfallenBool = false;
    //static boolean GeschenkeAnimationBool = false;

    //libGDX:
    static SpriteBatch AnimationBatch;
//    static SpriteBatch TreeBatch;

    static Texture RunTexture;
    static Texture TreeTexture;
    static Texture IdleTexture;
    //static Texture GeschenkeTexture;
    static Texture JumpTexture;

    static TextureRegion [][] RunRegion;
    static TextureRegion [][] IdleRegion;
    //static TextureRegion [][] GeschenkeRegion;
    static TextureRegion [][] JumpRegion;

    static Sprite RunSprite;
    static Sprite TreeSprite;
    static Sprite IdleSprite;
    //static Sprite GeschenkeSprite;
    static Sprite JumpSprite;

    @Override
    public void create()
    {

        AnimationBatch = new SpriteBatch();

        //Animationen
        CreateClass.CreateAnimationRun();
        CreateClass.CreateAnimationJump();
        CreateClass.CreateAnimationIdle();
        CreateClass.CreateTree();
        //CreateClass.CreateAnimationGeschenke();

        Gdx.input.setInputProcessor();

    }

    @Override
    public void render() //60fps
    {

        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        AnimationBatch.begin();//projector

        RunAnimationBool = false; //Booleans
        JumpAnimationBool = false;
        RunterfallenBool = false;
       // GeschenkeAnimationBool = false;
        IdleAnimationBool = false;

        AnimationBatch.end();

        /*
                Diese Booleans sind Vetreter für die Animationen.
                Wenn eine Animation läuft werden diese Booleans auf true gesetzt.
                Jetzt werden sie wieder alle für den nächsten Run vorbereitet.
                Alle werden auf false gesetzt
            */

    }

    @Override
    public void dispose()
    {

        //beenden
        AnimationBatch.dispose();

        RunTexture.dispose();
        IdleTexture.dispose();
        JumpTexture.dispose();
        //GeschenkeTexture.dispose();

    }

}

//TODO Sprung-BUG fix
//TODO Bäume implementieren
//TODO Geschenke-Mechanik

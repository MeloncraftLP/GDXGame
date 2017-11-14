package com.melon.game;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Var
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

    static TextureRegion[][] RunRegion;
    static TextureRegion [][] IdleRegion;
    //static TextureRegion [][] GeschenkeRegion;
    static TextureRegion [][] JumpRegion;

    static Sprite RunSprite;
    static Sprite TreeSprite;
    static Sprite IdleSprite;
    //static Sprite GeschenkeSprite;
    static Sprite JumpSprite;


}

package com.melon.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Var
{

    static com.badlogic.gdx.math.Rectangle HitBoxPlayer = new com.badlogic.gdx.math.Rectangle();
    static com.badlogic.gdx.math.Rectangle HitBoxBaum = new com.badlogic.gdx.math.Rectangle();

    static boolean Overlap;

    //Var:
    static int JumpTime = 0;

    static Sprite LogoSprite;
    static Texture LogoTexture;
    static Texture WhiteTex;
    static Sprite White;

    static int RunZeile = 0;
    static int IdleZeile = 0;
    static int IdleSpalte = 0;
    // static int GeschenkeFrame = 0;
    static int JumpZeile = 0;

    static Texture Logo = new Texture("Logo.png");

    static boolean RunAnimationBool = false;
    static boolean IdleAnimationBool = false;
    static boolean JumpAnimationBool = false;
    static boolean RunterfallenBool = false;
    //static boolean GeschenkeAnimationBool = false;

    //libGDX:
    static SpriteBatch AnimationBatch;

    static TextureRegion [][] TreeRegion;

    static BitmapFont GameOver = new BitmapFont();

    static Texture RunTexture;
    static Texture TreeTexture;
    static Texture IdleTexture;
    //static Texture GeschenkeTexture;
    static Texture JumpTexture;
    static Texture BackgroundTexture;
    static Texture DeadTexture;

    static TextureRegion[][] RunRegion;
    static TextureRegion [][] IdleRegion;
    //static TextureRegion [][] GeschenkeRegion;
    static TextureRegion [][] JumpRegion;
static TextureRegion [][] DeadRegion;

    static Sprite RunSprite;
    static Sprite TreeSprite;
    static Sprite IdleSprite;
    //static Sprite GeschenkeSprite;
    static Sprite JumpSprite;
    static Sprite BackgorundSprite;
    static Sprite DeadSprite;

}

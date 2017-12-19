package com.melon.game;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;

import java.awt.*;
import java.awt.Rectangle;

public class Var
{

    static com.badlogic.gdx.math.Rectangle HitBoxPlayer = new com.badlogic.gdx.math.Rectangle();
    static com.badlogic.gdx.math.Rectangle HitBoxBaum = new com.badlogic.gdx.math.Rectangle();

    //Var:
    static int JumpTime = 0;

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

    static Sprite HintergrundSprite;
    static Texture HintergrundTexture;

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

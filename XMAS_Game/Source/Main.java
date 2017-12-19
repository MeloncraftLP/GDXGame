package com.melon.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.Screen;


public class Main extends ApplicationAdapter
{

    @Override
    public void create()
    {

        crd.rCreate();

    }

    @Override
    public void render() //60fps
    {

        crd.rRender();

    }

    @Override
    public void dispose()
    {

        crd.rDispose();

    }

    public void show()
    {



    }



}


//TODO Bäume implementieren
//TODO Geschenke-Mechanik

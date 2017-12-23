package com.melon.game;

import com.badlogic.gdx.ApplicationAdapter;


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

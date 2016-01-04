/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rts.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

/**
 *
 * @author lamonta
 */
public class AssetManager {
    
    private static TextureAtlas atlas;
    public static TextureRegion block;
    public static TextureRegion marioStand;
    public static TextureRegion marioStandL;
    public static TextureRegion marioJump;
    public static TextureRegion marioJumpL;
    public static Animation marioRun;
    public static Animation marioRunL;
    
    public static Texture grass = new Texture("grass.png");
    public static Texture skrillex = new Texture("skrillex.png");
    
    
    public static void load(){
        atlas = new TextureAtlas("mario.pack");
        block = atlas.findRegion("stoneBlock");
        marioJump = atlas.findRegion("jump");
        marioJumpL = new TextureRegion(marioJump);
        marioJumpL.flip(true, false);
        marioStand = atlas.findRegion("stand");
        marioStandL = new TextureRegion(marioStand);
        marioStandL.flip(true, false);
        
        
        Array<AtlasRegion> run = atlas.findRegions("run");
        marioRun = new Animation(0.1f, run);
        
        run = atlas.findRegions("run");
        marioRunL = new Animation(0.1f, run);
        for(TextureRegion r: marioRunL.getKeyFrames()){
            r.flip(true,false);
        }
    }
}
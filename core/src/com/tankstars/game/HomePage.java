package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class HomePage implements Screen {
    private final TankStars GAME;
    private OrthographicCamera cam;
    private Texture hp;
    private Sprite sprite;
    ShapeRenderer shape;
    public HomePage(TankStars a) {
        this.GAME = a;
        hp = new Texture(Gdx.files.internal("HomePage (2).png"));
        sprite = new Sprite(hp);
        sprite.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        cam.setToOrtho(false);
        //cam.
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 1);
        cam.update();
        GAME.batch.setProjectionMatrix(cam.combined);
        GAME.batch.begin();
//        shape.begin(ShapeRenderer.ShapeType.Line);
//        shape.setColor(Color.RED);
//        shape.rect(0,0,10,10);
//        shape.end();

        //GAME.batch.draw(hp,0,0);
        sprite.draw(GAME.batch);
        GAME.batch.end();
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            GAME.goToMainPage();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}

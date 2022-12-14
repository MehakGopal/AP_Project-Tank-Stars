package com.tankstars.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TankStars extends Game {
	SpriteBatch batch;
	Texture img;
	Player info;
	@Override
	public void create () {
		info = new Player();
		batch = new SpriteBatch();
		this.setScreen(new HomePage(this));
	}
	public void goToMainPage(){
		MainPage mp = new MainPage(this);
		setScreen(mp);
	}public void goToHomePage(){
		this.setScreen(new HomePage(this));
	}
	public void goToSettings(Screen m){
		this.setScreen(new Settings(this,m));
	}
	public void ret(Screen m){

		this.setScreen(m);
	}
	public void goToChangetanks1(){
		Changetanks1 ct1= new Changetanks1(this);
		setScreen(ct1);
	}
	public void goToChangetanks2(){
		Changetanks2 ct2= new Changetanks2(this);
		setScreen(ct2);
	}
	public void goToChangetanks3(){
		Changetanks3 ct3= new Changetanks3(this);
		setScreen(ct3);
	}

	public void goToResumePage(){
		SavedGames rp= new SavedGames(this);
		setScreen(rp);
	}
	public void goToGamePage(){
		GamePage gp = new GamePage(this);
		setScreen(gp);
	}
	public void goToPlayers(){
		players pl = new players(this);
		setScreen(pl);
	}

	public void goToInGameMenu(){
		InGameMenu igm = new InGameMenu(this);
		setScreen(igm);
	}


	@Override
	public void render () {
		 super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		//img.dispose();
	}

}

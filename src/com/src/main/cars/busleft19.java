package com.src.main.cars;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;

import com.src.main.clas.entity19;
import com.src.main.traffic.Animation;
import com.src.main.traffic.controller;
import com.src.main.traffic.explosion;
import com.src.main.traffic.tecture;
import com.src.main.traffic.trafficc;

public class busleft19 implements entity19{

	private double x;
	private double y;
	private double velx;
	private double vely;
	trafficc t;
	private controller cc;
	explosion ex;
	Random r=new Random();
	private tecture tex;
	Animation anim;
	BufferedImage bx;

	
	public busleft19(double x, double y, tecture tex,controller c, trafficc t){
		this.x=x;
		this.y=y;
		this.tex=tex;
		this.t=t;
		this.cc=c;
		
		//anim=new Animation(1,tex.car3[0],tex.car3[1]);
		
		
		
	}

	public void tick(){
		
		x-=5;
	/*if(x==0)
	{
		x=(t.wid*t.scale);
		y=r.nextInt(t.hei*t.scale);
	}
		if(physics.collision(this, t.ea)){
			
		cc.removentity3(this);
		//	t.setCarblast(t.getCarblast()+1);
			
			
			
		}*/
	}

	public void render(Graphics g) {
		g.drawImage(tex.busleft19,(int) x,(int)y,null);
		//anim.drawAnimation(g, x,y,0);
	}

	public Rectangle getbound(){
		return new Rectangle((int)x,(int)y ,32,32);
	}
	@Override
	public double getx() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double gety() {
		// TODO Auto-generated method stub
		return y;
	}
	public void setx(double x){
		this.x= x;
		
	}
	
	public void sety(double y){
		this.y= y;
		
	}
	public void setvelx(double velx){
		this.velx= velx;
		
	}
	
	public void setvely(double vely){
		this.vely= vely;
		
	}
	}





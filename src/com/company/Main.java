package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SolarSystem andromeda =new SolarSystem();
        andromeda.Sun=1;
        andromeda.planet=2;
        andromeda.moon=4;


        FeatureSun mikeSun=new FeatureSun();
        mikeSun.color="blue";
        mikeSun.heat="60000343434kj";
        mikeSun.temp="celsiuus";
        mikeSun.radius="0.009";
        mikeSun.martialStatus="single";
    }
}

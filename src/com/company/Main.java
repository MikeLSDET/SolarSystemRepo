package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SolarSystem andromeda =new SolarSystem();
        andromeda.Sun=1;
        andromeda.planet=2;
        andromeda.moon=4;


        FeatureSun mikeSun=new FeatureSun();
        mikeSun.color="Red";
        mikeSun.heat="6000038282828223434kj";
        mikeSun.temp="6000000kelvin";
        mikeSun.radius="9000000km";
        mikeSun.martialStatus="in love with Asghar";



        //Planet 2 features
        Planet2 bastronaut=new Planet2();
        bastronaut.color="pink";
        bastronaut.size="2132312321km";
        bastronaut.status="same as Mike's";

        //adding planet 1 features
        planet1 astronaut=new planet1();
        astronaut.color="grey";
        astronaut.relationshipStatus="single";
        astronaut.size="9989989989898km";

    }
}

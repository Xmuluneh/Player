package com.company;

public class Main {

    public static void main(String[] args) {
	ISaveable iSaveable=new Monster("Mark",123,456);
	ISaveable iSaveable1=new Player("Jone",123,234);
        System.out.println(iSaveable);
        System.out.println(iSaveable.write());
        System.out.println(iSaveable1);
        System.out.println(iSaveable1.write());
        System.out.println("The name of the  Monster is:"+((Monster)iSaveable).getName());
        System.out.println("The name of the player is:"+((Player)iSaveable1).getName());
        if(iSaveable1 instanceof ISaveable){
            System.out.println("yes the solution is correct");
        }else{
            System.out.println("Repeat again");
        }
        int var=1;
        int var2=~var;
        System.out.println(var+""+var2);
    }
}

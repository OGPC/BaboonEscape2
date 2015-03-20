import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lever here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lever extends Actor
{
    GreenfootImage L2 = new GreenfootImage("L2.png");
   
    public void act() 
    {
        checkCharacter();
    }    

    public void checkCharacter()
    {
        if(canSeeLeft(Character.class) ||canSeeRight(Character.class) ||canSeeUp(Character.class) ||canSeeDown(Character.class))
        {

            setImage(L2);
        }
    }

    public boolean canSeeLeft(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-25, 0, clss); 
        return actor != null; 
    }

    public boolean canSeeUp(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, -25, clss); 
        return actor != null; 
    }

    public boolean canSeeDown(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, 25, clss); 
        return actor != null; 
    }

    public boolean canSeeRight(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(25, 0, clss); 
        return actor != null; 
    }

}

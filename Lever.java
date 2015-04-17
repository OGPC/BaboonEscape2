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
        if(canSeeCharacter(Character1.class)||canSeeCharacter(Character2.class)||canSeeCharacter(Character3.class)||canSeeCharacter(Character4.class)||canSeeCharacter(Character5.class)||canSeeCharacter(Character6.class)||canSeeCharacter(Character7.class)||canSeeCharacter(Character8.class)||canSeeCharacter(Character9.class)||canSeeCharacter(Character10.class))
        {
            // make sure to include for all characters

            setImage(L2);
        }
    }

    public boolean canSeeLeft(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-20, 0, clss); 
        return actor != null; 
    }

    public boolean canSeeUp(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, -20, clss); 
        return actor != null; 
    }

    public boolean canSeeDown(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, 20, clss); 
        return actor != null; 
    }

    public boolean canSeeRight(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(20, 0, clss); 
        return actor != null; 
    }

    public boolean canSeeCharacter(Class clss)
    {
        if (canSeeDown(clss)||canSeeLeft(clss)||canSeeRight(clss)||canSeeDown(clss))
        {
            return true;
        }
        else {
            return false;
        }
    }


}

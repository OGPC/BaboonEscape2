import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endgate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endgate extends Actor
{
    //do the same animation for all characters like lever

    int animation=1;
    int animationDelay=0;
    
    int level;
    
    GreenfootImage D1 = new GreenfootImage("Door1.png");
    GreenfootImage D2 = new GreenfootImage("Door2.png");
    GreenfootImage D3 = new GreenfootImage("Door3.png");
    GreenfootImage D4 = new GreenfootImage("Door4.png");
    GreenfootImage D5 = new GreenfootImage("Door5.png");
    
    /**
     * Act - do whatever the Endgate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkLock();
    }  
    
    public Endgate()
    {
        
    }
    
    public void checkLock()
    {
        if(canSeeCharacterAndCheckLockStatus(Character1.class)||canSeeCharacterAndCheckLockStatus(Character2.class)||canSeeCharacterAndCheckLockStatus(Character3.class)||canSeeCharacterAndCheckLockStatus(Character4.class)||canSeeCharacterAndCheckLockStatus(Character5.class)||canSeeCharacterAndCheckLockStatus(Character6.class)||canSeeCharacterAndCheckLockStatus(Character7.class)||canSeeCharacterAndCheckLockStatus(Character8.class)||canSeeCharacterAndCheckLockStatus(Character9.class)||canSeeCharacterAndCheckLockStatus(Character10.class))
        {
           // Greenfoot.playSound("explosion.wav");
            //remember to make this work for all characters
            //level++;
            animationDelay++;
            if( animationDelay%4 ==0)
            {
                if(animation==1)
                {
                    setImage(D1);

                }

                if(animation==2)
                {
                    setImage(D2);

                }

                if(animation==3)
                {
                    setImage(D3);

                }

                if(animation==4)
                {
                    setImage(D4);
                    
                }
                if(animation==5)
                {
                    setImage(D5);
                    WorldTutorial.animStatus=2;
                }
                
               
                animation++;
                animationDelay=0;
            }
            
            

        }
    }
    
    public  boolean checkLockStatus()
    {
       if(WorldTutorial.lockStatus==1||WORLDTWO.lockStatus==1||WORLDTHREE.lockStatus==1||WORLDFOUR.lockStatus==1||WORLDFIVE.lockStatus==1||WORLDSIX.lockStatus==1||WORLDSEVEN.lockStatus==1||WORLDEIGHT.lockStatus==1||WORLDNINE.lockStatus==1||WORLDTEN.lockStatus==1)
       {
           return true;
           
        }
        else
        {
            return false;
        }
       //FIX
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
    
     public boolean canSeeCharacterAndCheckLockStatus(Class clss)
    {
        if (canSeeDown(clss)&& !checkLockStatus()||canSeeLeft(clss)&& !checkLockStatus()||canSeeRight(clss)&& !checkLockStatus()||canSeeDown(clss)&& !checkLockStatus())
        {
            return true;
        }
        else {
            return false;
        }
    }
}

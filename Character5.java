import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character5 extends Actor
{
    int level;
    int animation=1;
    int animationDelay;
    int animationDelay2=0;
    //note second one is for endgate animation
    GreenfootImage left1 = new GreenfootImage("MONKEYL1.png");
    GreenfootImage left2 = new GreenfootImage("MONKEYL2.png");
    GreenfootImage left3 = new GreenfootImage("MONKEYL3.png");

    GreenfootImage right1 = new GreenfootImage("MONKEYR1.png");
    GreenfootImage right2 = new GreenfootImage("MONKEYR2.png");
    GreenfootImage right3 = new GreenfootImage("MONKEYR3.png");

    GreenfootImage down1 = new GreenfootImage("MONKEYD1.png");
    GreenfootImage down2 = new GreenfootImage("MONKEYD2.png");
    GreenfootImage down3 = new GreenfootImage("MONKEYD3.png");

    GreenfootImage up1 = new GreenfootImage("MONKEYU1.png");
    GreenfootImage up2 = new GreenfootImage("MONKEYU2.png");
    GreenfootImage up3 = new GreenfootImage("MONKEYU3.png");

    public Character5()
    {

        level=5;
        //change for other worlds
    }

    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveLeft();
        moveRight();
        moveUp();
        moveDown();
        checkZooKeeper();
        checkLever();
        checkTrap();
        checkEndgate();

    }

    public void checkEndgate()
    {
        if(canSeeLeft(Endgate.class)&& !checkLockStatus()||canSeeRight(Endgate.class)&& !checkLockStatus()||canSeeUp(Endgate.class)&& !checkLockStatus()||canSeeDown(Endgate.class)&& !checkLockStatus())
        {
            animationDelay2++;
            if(animationDelay2==50)
            {
                Greenfoot.playSound("DoorOpen.wav");
                Greenfoot.delay(50);
                Greenfoot.playSound("LevelComplete.wav");

                getWorld().removeObject(this);
                Greenfoot.setWorld(new TransitionWorld(5));
                //change this for other worlds

                WORLDSIX.lockStatus=1;

            }
        }
    }

    public void checkTrap()
    {
        if(canSeeLeft2(Trap.class)||canSeeRight2(Trap.class)||canSeeUp2(Trap.class)||canSeeDown2(Trap.class))
        {
           Greenfoot.playSound("TrapClick.wav");
            //display lose

            WORLDTWO.gameStatus=2;
            WORLDTHREE.gameStatus=2;
            WORLDFOUR.gameStatus=2;
            WORLDFIVE.gameStatus=2;
            WORLDSIX.gameStatus=2;
            WORLDSEVEN.gameStatus=2;
            WORLDEIGHT.gameStatus=2;
            WORLDNINE.gameStatus=2;
            WORLDTEN.gameStatus=2;

            WorldTutorial.gameStatus=2;
            Greenfoot.delay(90);

        }
    }

    private void checkLever()
    {
        if(canSeeLeft(Lever.class)&& checkLockStatus()||canSeeRight(Lever.class)&& checkLockStatus()||canSeeUp(Lever.class)&& checkLockStatus()||canSeeDown(Lever.class)&& checkLockStatus())
        {

            WORLDTWO.lockStatus=2;
            WORLDTHREE.lockStatus=2;
            WORLDFOUR.lockStatus=2;
            WORLDFIVE.lockStatus=2;
            WORLDSIX.lockStatus=2;
            WORLDSEVEN.lockStatus=2;
            WORLDEIGHT.lockStatus=2;
            WORLDNINE.lockStatus=2;
            WORLDTEN.lockStatus=2;
            WorldTutorial.lockStatus=2;

            Greenfoot.playSound("LeverClick.wav");
        }
    }

    // public void checkWorld()
    // {
    //     if (getWorld() instanceof WorldTutorial)
    //     {
    //        level=1;
    //     }

    //    if (getWorld() instanceof WORLDTWO)
    //   {
    //        level=2;
    //    }

    //  }

    private  boolean checkLockStatus()
    {
       
        
            if(WORLDFIVE.lockStatus==1)
            {
                return true;
            }
            else
            {
                return false;
            }

        
       
    }
    public void checkZooKeeper()
    {
        if(canSeeLeft2(Zookeeper.class)||canSeeRight2(Zookeeper.class)||canSeeUp2(Zookeeper.class)||canSeeDown2(Zookeeper.class)||canSeeLeft2(Zookeeper2.class)||canSeeRight2(Zookeeper2.class)||canSeeUp2(Zookeeper2.class)||canSeeDown2(Zookeeper2.class)||canSeeLeft2(Zookeeper3.class)||canSeeRight2(Zookeeper3.class)||canSeeUp2(Zookeeper3.class)||canSeeDown2(Zookeeper3.class))
        {
            //do this for all the other worlds too

            WORLDTWO.gameStatus=2;
            WORLDTHREE.gameStatus=2;
            WORLDFOUR.gameStatus=2;
            WORLDFIVE.gameStatus=2;
            WORLDSIX.gameStatus=2;
            WORLDSEVEN.gameStatus=2;
            WORLDEIGHT.gameStatus=2;
            WORLDNINE.gameStatus=2;
            WorldTutorial.gameStatus=2;
        }
    }

    public void moveLeft()
    {
        if(Greenfoot.isKeyDown("left")&& !canSeeLeft(Wall.class) && !canSeeLeftUp2(Wall.class) && !canSeeLeftDown2(Wall.class) )
        {
            setLocation (getX()-2,getY());
            animationDelay++;

            if( animationDelay%4 ==0)
            {
                if(animation==1)
                {
                    setImage(left1);

                }

                if(animation==2)
                {
                    setImage(left2);

                }

                if(animation==3)
                {
                    setImage(left1);

                }

                if(animation==4)
                {
                    setImage(left3);
                    animation=0;
                }
                animation++;
                animationDelay=0;
            }
        }

    }

    public void moveRight()
    {
        if(Greenfoot.isKeyDown("right")&& !canSeeRight(Wall.class) && !canSeeRightUp2(Wall.class) && !canSeeRightDown2(Wall.class) )
        {
            setLocation (getX()+2,getY());
            animationDelay++;

            if( animationDelay%4 ==0)
            {
                if(animation==1)
                {
                    setImage(right1);

                }

                if(animation==2)
                {
                    setImage(right2);

                }

                if(animation==3)
                {
                    setImage(right1);

                }

                if(animation==4)
                {
                    setImage(right3);
                    animation=0;
                }
                animation++;
                animationDelay=0;
            }
        }

    }

    public void moveUp()
    {
        if(Greenfoot.isKeyDown("up")&& !canSeeUp(Wall.class)&&!canSeeRightUp2(Wall.class)&&!canSeeLeftUp2(Wall.class))
        {
            setLocation (getX(),getY()-2);
            animationDelay++;

            if( animationDelay%4 ==0)
            {
                if(animation==1)
                {
                    setImage(up1);

                }

                if(animation==2)
                {
                    setImage(up2);

                }

                if(animation==3)
                {
                    setImage(up1);

                }

                if(animation==4)
                {
                    setImage(up3);
                    animation=0;
                }
                animation++;
                animationDelay=0;
            }
        }

    }

    public void moveDown()
    {
        if(Greenfoot.isKeyDown("down")&& !canSeeDown(Wall.class)&& !canSeeRightDown2(Wall.class) && !canSeeLeftDown2(Wall.class))
        {
            setLocation (getX(),getY()+2);
            animationDelay++;

            if( animationDelay%4 ==0)
            {
                if(animation==1)
                {
                    setImage(down1);

                }

                if(animation==2)
                {
                    setImage(down2);

                }

                if(animation==3)
                {
                    setImage(down1);

                }

                if(animation==4)
                {
                    setImage(down3);
                    animation=0;
                }
                animation++;
                animationDelay=0;
            }
        }

    }

    public boolean canSeeLeft(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-25, 0, clss); 
        return actor != null; 
    }

    public boolean canSeeLeftDown(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-25, 25, clss); 
        return actor != null; 
    }

    public boolean canSeeLeftUp(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-25, -25, clss); 
        return actor != null; 
    }

    public boolean canSeeRight(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(25, 0, clss); 
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

    public boolean canSeeLeft2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-20, 0, clss); 
        return actor != null; 
    }

    public boolean canSeeLeftDown2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-15, 15, clss); 
        return actor != null; 
    }

    public boolean canSeeLeftUp2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-15, -15, clss); 
        return actor != null; 
    }

    public boolean canSeeRight2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(20, 0, clss); 
        return actor != null; 
    }

    public boolean canSeeRightUp2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(15, -15, clss); 
        return actor != null; 
    }

    public boolean canSeeRightDown2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(15, 15, clss); 
        return actor != null; 
    }

    public boolean canSeeUp2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, -20, clss); 
        return actor != null; 
    }

    public boolean canSeeDown2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, 20, clss); 
        return actor != null; 
    }

    public boolean canSeeRightUp(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(25, -25, clss); 
        return actor != null; 
    }

    public boolean canSeeRightDown(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(25, 25, clss); 
        return actor != null; 
    }

}

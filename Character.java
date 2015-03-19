import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List.*;
/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    int level;
    int animation=1;
    int animationDelay;
    GreenfootImage left1 = new GreenfootImage("left1.png");
    GreenfootImage left2 = new GreenfootImage("left2.png");
    GreenfootImage left3 = new GreenfootImage("left3.png");

    GreenfootImage right1 = new GreenfootImage("right1.png");
    GreenfootImage right2 = new GreenfootImage("right2.png");
    GreenfootImage right3 = new GreenfootImage("right3.png");

    GreenfootImage down1 = new GreenfootImage("down1.png");
    GreenfootImage down2 = new GreenfootImage("down2.png");
    GreenfootImage down3 = new GreenfootImage("down3.png");

    GreenfootImage up1 = new GreenfootImage("up1.png");
    GreenfootImage up2 = new GreenfootImage("up2.png");
    GreenfootImage up3 = new GreenfootImage("up3.png");

    public Character()
    {
        checkWorld();
        level=1;

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
            Greenfoot.playSound("explosion.wav");
            //display win
            //WorldTutorial.gameStatus =3 ;
            level++;
            if(level==2)
            {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new WORLDTWO());

                WORLDTWO.lockStatus=1;
            }
            if(level==3)
            {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new WORLDTHREE());
                level++;

                //WORLDTWO.gameStatus=2;
            }

        }
    }

    public void checkTrap()
    {
        if(canSeeLeft(Trap.class)||canSeeRight(Trap.class)||canSeeUp(Trap.class)||canSeeDown(Trap.class))
        {
            Greenfoot.playSound("explosion.wav");
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

            Greenfoot.playSound("buzz.wav");
        }
    }

    public void checkWorld()
    {
        if (getWorld() instanceof WorldTutorial)
        {
            level=1;
        }

        if (getWorld() instanceof WORLDTWO)
        {
            level=2;
        }

    }

    private  boolean checkLockStatus()
    {
        if (level==1)
        {
            if(WorldTutorial.lockStatus==1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        if(level==2)
        {
            if(WORLDTWO.lockStatus==1)
            {
                return true;
            }
            else
            {
                return false;
            }

        }
        else
        {

            return false;
        }
    }

    public void checkZooKeeper()
    {
        if(canSeeLeft(Zookeeper.class)||canSeeRight(Zookeeper.class)||canSeeUp(Zookeeper.class)||canSeeDown(Zookeeper.class)||canSeeLeft(Zookeeper2.class)||canSeeRight(Zookeeper2.class)||canSeeUp(Zookeeper2.class)||canSeeDown(Zookeeper2.class)||canSeeLeft(Zookeeper3.class)||canSeeRight(Zookeeper3.class)||canSeeUp(Zookeeper3.class)||canSeeDown(Zookeeper3.class))
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
        Actor actor = getOneObjectAtOffset(-23, 0, clss); 
        return actor != null; 
    }

    public boolean canSeeLeftDown2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-23, 24, clss); 
        return actor != null; 
    }

    public boolean canSeeLeftUp2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-23, -23, clss); 
        return actor != null; 
    }

    public boolean canSeeRight2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(24, 0, clss); 
        return actor != null; 
    }

    public boolean canSeeRightUp2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(24, -23, clss); 
        return actor != null; 
    }

    public boolean canSeeRightDown2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(24, 24, clss); 
        return actor != null; 
    }

    public boolean canSeeUp2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, -23, clss); 
        return actor != null; 
    }

    public boolean canSeeDown2(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, 24, clss); 
        return actor != null; 
    }

}


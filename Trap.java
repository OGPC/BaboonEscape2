import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trap extends Actor

{
    int status=1; 
    int animation=1;
    int animationDelay;
    
    
    GreenfootImage UNO = new GreenfootImage("T1.png");
    GreenfootImage DOS = new GreenfootImage("T2.png");
    GreenfootImage TRES = new GreenfootImage("T3.png");
    GreenfootImage CUATRO = new GreenfootImage("T4.png");
    GreenfootImage CINCO = new GreenfootImage("T5.png");
    GreenfootImage SEIS = new GreenfootImage("T6.png");
    GreenfootImage SIETE = new GreenfootImage("T7.png");

    
    /**
     * Act - do whatever the Trap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animationDelay++;
            if( animationDelay%4 ==0)
            {
                if(animation==1)
                {
                    setImage(UNO);

                }

                if(animation==2)
                {
                    setImage(DOS);

                }

                if(animation==3)
                {
                    setImage(TRES);

                }

                if(animation==4)
                {
                    setImage(CUATRO);
                    
                }
                if(animation==5)
                {
                    setImage(CINCO);

                }
                if(animation==6)
                {
                    setImage(SEIS);

                }
                if(animation==7)
                {
                    setImage(SIETE);
                   animation=0;
                }
                animation++;
                animationDelay=0;
            }
            
        }
       
    }    

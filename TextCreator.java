import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class TextCreater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextCreator extends Actor
{
    int textNum;
    public TextCreator(int inputText)
    {
        textNum=inputText;
        
        if (textNum==0)
        {
           setImage("InstructDiagram.png");
        }
        
        if (textNum==1)
        {
            setImage(new GreenfootImage("Press Space to move on", 25, Color.WHITE, Color.BLACK));
        }
        
         if (textNum==2)
        {
            setImage(new GreenfootImage("Instructions", 50, Color.WHITE, Color.BLACK));
        }
        
        if (textNum==3)
        {
            setImage(new GreenfootImage("lethal", 25, Color.WHITE, Color.BLACK));
        }
        
        if(textNum==4)
        {
            setImage(new GreenfootImage("Use Arrow Keys to move", 25, Color.BLACK, Color.WHITE));
        }
        
        if(textNum==5)
        {
            setImage(new GreenfootImage("Hit lever to unlock EndGate", 25, Color.BLACK, Color.WHITE));
        }
        
         if(textNum==6)
        {
            setImage(new GreenfootImage("Note: In some of the levels", 25, Color.BLACK, Color.WHITE));
           
        }
        
         if(textNum==7)
        {
           
            setImage(new GreenfootImage("your baboon can hit space ", 25, Color.BLACK, Color.WHITE));
          
        }
        
         if(textNum==8)
        {
          
            setImage(new GreenfootImage("to activate an ability ", 25, Color.BLACK, Color.WHITE));
        }
        
        if(textNum==9)
        {
            setImage(new GreenfootImage("Reach Endgate to ", 25, Color.BLACK, Color.WHITE));
        }
        
        if(textNum==10)
        {
            setImage(new GreenfootImage(" get to next level", 25, Color.BLACK, Color.WHITE));
        }
    }
    /**
     * Act - do whatever the TextCreater wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

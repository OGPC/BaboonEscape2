import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionWorld extends World
{
    int nextWorld=1;

    /**
     * Constructor for objects of class InstructionWorld.
     * 
     */
    public InstructionWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        TextCreator textCreator=new TextCreator(0,0);
        addObject(textCreator,600,300);
        TextCreator textCreator2=new TextCreator(1,0);
        addObject(textCreator2,150,500);
        TextCreator textCreator3=new TextCreator(2,0);
        addObject(textCreator3,150,100);
        TextCreator textCreator4=new TextCreator(3,0);
        addObject(textCreator4,120,200);
        TextCreator textCreator5=new TextCreator(3,0);
        addObject(textCreator5,1100,175);
    }
    public void act()
    {
        
    }
}

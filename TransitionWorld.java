import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PREWORLDTWO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransitionWorld extends World
{
    public int level;

    /**
     * Constructor for objects of class PREWORLDTWO.
     * 
     */
    public TransitionWorld(int inputLevel)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1); 
        level=inputLevel;
        if (level==10)
        {
            setBackground("GameCompletion.jpg");
            TextCreator textcreator6 = new TextCreator(34,0);
            addObject(textcreator6, 300, 100);
            
            TextCreator textcreator7 = new TextCreator(33,0);
            addObject(textcreator7, 300, 350);

        }
        if (level!=10)
        {
            prepare();
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        TextCreator textcreator2 = new TextCreator(16,level);
        addObject(textcreator2, 300, 75);

        TextCreator textcreator3 = new TextCreator(17,level);
        addObject(textcreator3, 300, 150);
        TextCreator textcreator4 = new TextCreator(18,level);
        addObject(textcreator4, 300, 225);
        TextCreator textcreator5 = new TextCreator(19,level);
        addObject(textcreator5, 300, 300);

    }
}


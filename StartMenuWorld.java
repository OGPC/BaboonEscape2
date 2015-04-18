import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenuWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenuWorld extends World
{
    public static int musicStatus=0;
    public static int storyStatus=0;
    public static int tutorialStatus=0;
    //note 1 would be disabled while 0 is functional
    public static int menuStatus=0;
    public static int permaMenuStatus=0;

    /**
     * Constructor for objects of class StartMenuWorld.
     * 
     */
    public StartMenuWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        TextCreator textCreator1= new TextCreator(11,0);
        addObject(textCreator1,400,50);

        TextCreator textCreator2= new TextCreator(12,0);
        addObject(textCreator2,400,200);

        TextCreator textCreator3= new TextCreator(13,0);
        addObject(textCreator3,400,300);

        TextCreator textCreator4= new TextCreator(14,0);
        addObject(textCreator4,400,400);

    }

    public void act()
    {

        if(permaMenuStatus==2&&musicStatus==1)
        {
            TextCreator textCreator5= new TextCreator(41,0);
            addObject(textCreator5,300,200);
        }
        if(permaMenuStatus==2&&storyStatus==1)
        {
            TextCreator textCreator5= new TextCreator(40,0);
            addObject(textCreator5,300,100);
        }
        if(permaMenuStatus==2&&tutorialStatus==1)
        {
            TextCreator textCreator1= new TextCreator(42,0);
            addObject(textCreator1,300,300);
        }
        
        

        if(menuStatus==1&&storyStatus!=1)
        {

            removeObjects(getObjects(TextCreator.class));

            menuStatus=0;
            TextCreator textCreator5= new TextCreator(21,0);
            addObject(textCreator5,185,125);

            TextCreator textCreator6= new TextCreator(22,0);
            addObject(textCreator6,185,140);

            TextCreator textCreator7= new TextCreator(23,0);
            addObject(textCreator7,185,155);

            TextCreator textCreator8= new TextCreator(24,0);
            addObject(textCreator8,185,170);

            TextCreator textCreator9= new TextCreator(25,0);
            addObject(textCreator9,185,185);

            TextCreator textCreator10= new TextCreator(26,0);
            addObject(textCreator10,185,200);

            TextCreator textCreator11= new TextCreator(27,0);
            addObject(textCreator11,185,215);

            TextCreator textCreator12= new TextCreator(28,0);
            addObject(textCreator12,185,230);

            TextCreator textCreator13= new TextCreator(29,0);
            addObject(textCreator13,185,245);

            TextCreator textCreator14= new TextCreator(30,0);
            addObject(textCreator14,185,260);

            TextCreator textCreator15= new TextCreator(31,0);
            addObject(textCreator15,185,275);

            TextCreator textCreator16= new TextCreator(20,0);
            addObject(textCreator16,475,275);

            TextCreator textCreator17= new TextCreator(32,0);
            addObject(textCreator17,455,370);

        }
        else if(menuStatus==1&&tutorialStatus==1)
        {
            
        
           Greenfoot.setWorld(new WORLDTWO());
        
        }
        else if(menuStatus==1)
        {
            Greenfoot.setWorld(new InstructionWorld());
        }
        if(menuStatus==2)
        {
            //settings
            permaMenuStatus=2;

            removeObjects(getObjects(TextCreator.class));

            menuStatus=0;
            

            TextCreator textCreator4= new TextCreator(35,0);
            addObject(textCreator4,400,450);
            //back button

            TextCreator textCreator1= new TextCreator(37,0);
            addObject(textCreator1,400,100);

            //skip story

            TextCreator textCreator2= new TextCreator(38,0);
            addObject(textCreator2,400,200);

            //disable music

            TextCreator textCreator3= new TextCreator(39,0);
            addObject(textCreator3,400,300);

            //disable tutorial

        }
        if(menuStatus==3)
        {
            //credits
            removeObjects(getObjects(TextCreator.class));

            menuStatus=0;
            TextCreator textCreator1=new TextCreator (36,0);
            addObject(textCreator1,400,250);
            TextCreator textCreator17= new TextCreator(35,0);
            addObject(textCreator17,400,450);

        }
    }
}

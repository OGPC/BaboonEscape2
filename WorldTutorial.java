import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * The code in the box tells the code if the lever has been hit
 * 
 * The second part of the code defines all the walls in the world
 * 
 * 
 */
public class WorldTutorial extends World
{
    // 1 is top row
    // 2 is bottom row

    //3 is left column
    public static int lockStatus=1;
    public static int gameStatus=1;
    public static int animStatus=1;
   

    int wallNum1=0;
    int wallX1=25;
    int wallY1=25;

    int wallX2=25;
    int wallY2=725;
    int wallNum2=0;

    int wallNum3=0;
    int wallX3=25;
    int wallY3 = 75;

    int wallNum4=0;
    int wallX4=725;
    int wallY4 = 75;

    int wallNum5=0;
    int wallX5=175;
    int wallY5=325;

    int wallNum6=0;
    int wallX6=525;
    int wallY6=325;

    int wallNum7=0;
    int wallX7=175;
    int wallY7=175;

    // r stands for row
    // c stand for column
    // number represents the specific object
    int wallR1X= 275;
    int wallR1Y= 175;
    int wallNumR1=0;

    int trap1X=625;
    int trap1Y=175;

    int trap2X=675;
    int trap2Y=175;

    int endX=675;
    int endY=675;
    
    GreenfootSound backgroundMusic = new GreenfootSound("Track1.mp3");

    /**
     * Define world size
     * 
     * Constructor
     * 
     * Background Music
     * 
     */
    public WorldTutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        
        if(StartMenuWorld.musicStatus==0)
        {
            backgroundMusic.playLoop();
        }
        
        

        prepare();
    }

    
    /**
     * Act Metod includes skepping world tutorial if skipped in menu
     */
    public void act()
    {
        gameOver();
        if(StartMenuWorld.tutorialStatus==1)
        {
           Greenfoot.setWorld(new WORLDTWO());
        }
        //gameOver2();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        
        Trap trap1=new Trap();
        addObject(trap1,trap1X,trap1Y);

        Trap trap2=new Trap();
        addObject(trap2,trap2X,trap2Y);
        
        TextCreator textCreator1=new TextCreator(4,0);
        addObject(textCreator1,275,75);
        
        TextCreator textCreator2=new TextCreator(5,0);
        addObject(textCreator2,575,125);
        
        
        
        TextCreator textCreator6=new TextCreator(9,0);
        addObject(textCreator6,627,600);
        
        TextCreator textCreator7=new TextCreator(10,0);
        addObject(textCreator7,620,625);

        Endgate endgate=new Endgate(1);
        addObject(endgate,endX,endY);

        Lever lever=new Lever();
        addObject(lever,675, 75);

        Character1 character = new Character1();
        addObject(character, 75, 75);

        Zookeeper zookeeper= new Zookeeper();
        addObject(zookeeper,75,225);
        //Wall wall1=new Wall();
        //addObject(wall1,25,25);
        while( wallNum1<15)
        {
            Wall wall=new Wall();
            addObject(wall,wallX1,wallY1);
            wallX1= wallX1+50;
            wallNum1=wallNum1 + 1;
        }

        while( wallNum2<15)
        {
            Wall wall=new Wall();
            addObject(wall,wallX2,wallY2);
            wallX2= wallX2+50;
            wallNum2=wallNum2 + 1;
        }

        while( wallNum3<13)
        {
            Wall wall=new Wall();
            addObject(wall,wallX3,wallY3);
            wallY3= wallY3+50;
            wallNum3=wallNum3 + 1;
        }

        while( wallNum4<13)
        {
            Wall wall=new Wall();
            addObject(wall,wallX4,wallY4);
            wallY4= wallY4+50;
            wallNum4=wallNum4 + 1;
        }

        while( wallNumR1<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallR1X,wallR1Y);
            wallR1X= wallR1X+50;
            wallNumR1=wallNumR1 + 1;
        }
        while( wallNum5<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX5,wallY5);
            wallY5= wallY5+50;
            wallNum5=wallNum5 + 1;
        }

        while( wallNum6<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallY6= wallY6+50;
            wallNum6=wallNum6 + 1;
        }

        while( wallNum7<9)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallX7= wallX7+50;
            wallNum7=wallNum7 + 1;
        }
    }

    /**
     * Method for losing the game
     * 
     * Removes all objects and creates try again button
     */
    public void gameOver()
    {
        if(gameStatus == 2)
        {
            Greenfoot.playSound("DeathSound.mp3");
            gameStatus=1;

            removeObjects(getObjects(Zookeeper.class));
            removeObjects(getObjects(Zookeeper2.class));
            removeObjects(getObjects(Zookeeper3.class));
            removeObjects(getObjects(Trap.class));
            removeObjects(getObjects(TextCreator.class));
            removeObjects(getObjects(Lever.class));
            removeObjects(getObjects(Wall.class));
            removeObjects(getObjects(Character1.class));
            //make sure to add in all the characters so that they are all removed
            removeObjects(getObjects(Endgate.class));
            GameOver gameover= new GameOver();
            addObject(gameover,375,375);
            gameStatus=1;
            TextCreator textCreator1=new TextCreator(6,1);
            addObject(textCreator1,375,550);
            TextCreator textCreator2=new TextCreator(33,1);
            addObject(textCreator2,375,625);

            //loserino level

            //WORLDTWO worldtwo=new WORLDTWO();
            //gameStatus=1;
            // Greenfoot.setWorld(worldtwo);
            //Greenfoot.stop();

        }

    }
    

 
    
}


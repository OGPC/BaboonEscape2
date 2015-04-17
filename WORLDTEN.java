import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WORLDNINE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WORLDTEN extends World
{
    public static int lockStatus=1;
    public static int gameStatus=1;

    int wallNum1=0;
    int wallX1=25;
    int wallY1=25;

    int wallX2=25;
    int wallY2=1075;
    int wallNum2=0;

    int wallNum3=0;
    int wallX3=25;
    int wallY3 = 75;

    int wallNum4=0;
    int wallX4=1075;
    int wallY4 = 75;

    int wallNum5=0;
    int wallX5 = 175;
    int wallY5 = 175;

    int wallNum6=0;
    int wallX6 = 175;
    int wallY6 = 525;

    int wallNum7=0;
    int wallX7 = 175;
    int wallY7 = 875;

    int wallNum8=0;
    int wallX8 = 275;
    int wallY8 = 425;

    int wallNum9=0;
    int wallX9 = 375;
    int wallY9 = 325;

    int wallNum10=0;
    int wallX10 = 225;
    int wallY10 = 725;

    int wallNum11=0;
    int wallX11 = 375;
    int wallY11 = 775;

    int wallNum12=0;
    int wallX12 = 475;
    int wallY12 = 875;

    int wallNum14=0;
    int wallX14 = 475;
    int wallY14 = 175;

    int wallNum15=0;
    int wallX15 = 875;
    int wallY15 = 275;

    int wallNum16=0;
    int wallX16 = 500;
    int wallY16 = 600;
    /**
     * Constructor for objects of class WORLD9.
     * 
     */
    public WORLDTEN()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 1100, 1); 

        prepare();
    }

    public void act()
    {
        gameOver();
    }

    private void prepare()
    {
        Character10 character = new Character10();
        addObject(character, 75, 75);
        Zookeeper zookeeper = new Zookeeper();
        addObject(zookeeper, 175, 125);
        Zookeeper2 zookeeper2 = new Zookeeper2();
        addObject(zookeeper2, 325, 125);
        Zookeeper2 zookeeper22 = new Zookeeper2();
        addObject(zookeeper22, 975, 100);
        zookeeper22.setLocation(975, 75);
        Zookeeper zookeeper3 = new Zookeeper();
        addObject(zookeeper3, 600, 675);
        zookeeper3.setLocation(600, 650);
        Zookeeper2 zookeeper23 = new Zookeeper2();
        addObject(zookeeper23, 75, 475);
        zookeeper23.setLocation(75, 475);
        Zookeeper3 zookeeper32 = new Zookeeper3();
        addObject(zookeeper32, 525, 1025);
        removeObject(zookeeper32);
        Zookeeper2 zookeeper24 = new Zookeeper2();
        addObject(zookeeper24, 325, 800);
        Lever lever = new Lever();
        addObject(lever, 125, 1025);
        lever.setLocation(125, 1025);
        Trap trap = new Trap();
        addObject(trap, 75, 775);
        Endgate endgate = new Endgate(10);
        addObject(endgate, 975, 975);
        endgate.setLocation(1000, 1000);
        Zookeeper2 zookeeper25 = new Zookeeper2();
        addObject(zookeeper25, 625, 250);
        zookeeper25.setLocation(625, 250);
        Zookeeper zookeeper4 = new Zookeeper();
        addObject(zookeeper4, 450, 375);
        Trap trap2 = new Trap();
        addObject(trap2, 650, 400);
        Trap trap3 = new Trap();
        addObject(trap3, 925, 725);
        Zookeeper zookeeper5 = new Zookeeper();
        addObject(zookeeper5, 525, 925);
        Trap trap4 = new Trap();
        addObject(trap4, 800, 975);
        Trap trap5 = new Trap();
        addObject(trap5, 675, 825);
        Trap trap6 = new Trap();
        addObject(trap6, 1025, 400);
        Zookeeper zookeeper6 = new Zookeeper();
        addObject(zookeeper6, 550, 550);
        zookeeper6.setLocation(550, 550);
        while( wallNum1<22)
        {
            Wall wall=new Wall();
            addObject(wall,wallX1,wallY1);
            wallX1= wallX1+50;
            wallNum1=wallNum1 + 1;
        }

        while( wallNum2<22)
        {
            Wall wall=new Wall();
            addObject(wall,wallX2,wallY2);
            wallX2= wallX2+50;
            wallNum2=wallNum2 + 1;
        }

        while( wallNum3<20)
        {
            Wall wall=new Wall();
            addObject(wall,wallX3,wallY3);
            wallY3= wallY3+50;
            wallNum3=wallNum3 + 1;
        }

        while( wallNum4<20)
        {
            Wall wall=new Wall();
            addObject(wall,wallX4,wallY4);
            wallY4= wallY4+50;
            wallNum4=wallNum4 + 1;
        }

        while( wallNum5<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX5,wallY5);
            wallY5= wallY5+50;
            wallNum5=wallNum5 + 1;
        }

        while( wallNum6<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallY6= wallY6+50;
            wallNum6=wallNum6 + 1;
        }

        while( wallNum7<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallY7= wallY7+50;
            wallNum7=wallNum7 + 1;
        }

        while( wallNum8<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX8,wallY8);
            wallY8= wallY8+50;
            wallNum8=wallNum8 + 1;
        }

        while( wallNum9<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX9,wallY9);
            wallY9= wallY9+50;
            wallNum9=wallNum9 + 1;
        }

        while( wallNum10<7)
        {
            Wall wall=new Wall();
            addObject(wall,wallX10,wallY10);
            wallX10= wallX10+50;
            wallNum10=wallNum10 + 1;
        }

        while( wallNum11<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX11,wallY11);
            wallY11= wallY11+50;
            wallNum11=wallNum11 + 1;
        }

        while( wallNum12<7)
        {
            Wall wall=new Wall();
            addObject(wall,wallX12,wallY12);
            wallX12= wallX12+50;
            wallNum12=wallNum12 + 1;
        }

        
        while( wallNum14<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX14,wallY14);
            wallX14= wallX14+50;
            wallNum14=wallNum14 + 1;
        }

        while( wallNum15<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX15,wallY15);
            wallY15= wallY15+50;
            wallNum15=wallNum15 + 1;
        }

        while( wallNum16<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX16,wallY16);
            wallX16= wallX16+50;
            wallNum16=wallNum16 + 1;
        }
    }

    private void gameOver()
    {
        if(gameStatus == 2)
        {
            Greenfoot.playSound("DeathSound.mp3");

            removeObjects(getObjects(Zookeeper.class));
            removeObjects(getObjects(Zookeeper2.class));
            removeObjects(getObjects(Zookeeper3.class));
            removeObjects(getObjects(Trap.class));
            removeObjects(getObjects(Lever.class));
            removeObjects(getObjects(Wall.class));
            removeObjects(getObjects(Character10.class));
            removeObjects(getObjects(Endgate.class));
            GameOver gameover= new GameOver();
            addObject(gameover,550,550);
            gameStatus=1;
            TextCreator textCreator1=new TextCreator(6,10);
            addObject(textCreator1,550,725);
            TextCreator textCreator2=new TextCreator(33,0);
            addObject(textCreator2,550,775);
        }
    }
}

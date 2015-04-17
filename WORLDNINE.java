import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WORLDNINE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WORLDNINE extends World
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
    int wallX5=375;
    int wallY5 =75;

    int wallNum6=0;
    int wallX6=375;
    int wallY6 =75;

    int wallNum7=0;
    int wallX7=75;
    int wallY7 =225;

    int wallNum8=0;
    int wallX8=275;
    int wallY8 =275;

    int wallNum9=0;
    int wallX9=175;
    int wallY9 =325;

    int wallNum10=0;
    int wallX10=225;
    int wallY10=525;

    int wallNum11=0;
    int wallX11=375;
    int wallY11=325;

    int wallNum12=0;
    int wallX12=425;
    int wallY12=225;

    int wallNum13=0;
    int wallX13=425;
    int wallY13=325;

    int wallNum14=0;
    int wallX14=75;
    int wallY14=625;

    int wallNum15=0;
    int wallX15=475;
    int wallY15=475;

    int wallNum16=0;
    int wallX16=525;
    int wallY16=475;

    int wallNum17=0;
    int wallX17=925;
    int wallY17=525;

    int wallNum18=0;
    int wallX18=575;
    int wallY18=625;

    int wallNum19=0;
    int wallX19=725;
    int wallY19=825;

    int wallNum20=0;
    int wallX20=625;
    int wallY20=725;

    int wallNum21=0;
    int wallX21=475;
    int wallY21=725;

    int wallNum22=0;
    int wallX22=125;
    int wallY22=725;

    int wallNum23=0;
    int wallX23=175;
    int wallY23=725;

    int wallNum24=0;
    int wallX24=125;
    int wallY24=725;

    int wallNum25=0;
    int wallX25=225;
    int wallY25=725;

    int wallNum26=0;
    int wallX26=275;
    int wallY26=725;

    int wallNum27=0;
    int wallX27=275;
    int wallY27=725;
    /**
     * Constructor for objects of class WORLD8.
     * 
     */
    public WORLDNINE()
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
         Character9 character = new Character9();
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
        zookeeper3.setLocation(600, 675);
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
        Endgate endgate = new Endgate(9);
        addObject(endgate, 975, 975);
        endgate.setLocation(1000, 1000);
        Zookeeper zookeeper25 = new Zookeeper();
        addObject(zookeeper25, 625, 250);
        zookeeper25.setLocation(625, 275);
        Zookeeper zookeeper4 = new Zookeeper();
        addObject(zookeeper4, 450, 375);
        Trap trap2 = new Trap();
        addObject(trap2, 675, 425);
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
        while(wallNum1<22)
        {
            Wall wall=new Wall();
            addObject(wall,wallX1,wallY1);
            wallX1= wallX1+50;
            wallNum1=wallNum1 + 1;
        }

        while(wallNum2<22)
        {
            Wall wall=new Wall();
            addObject(wall,wallX2,wallY2);
            wallX2= wallX2+50;
            wallNum2=wallNum2 + 1;
        }

        while(wallNum3<20)
        {
            Wall wall=new Wall();
            addObject(wall,wallX3,wallY3);
            wallY3= wallY3+50;
            wallNum3=wallNum3 + 1;
        }

        while(wallNum4<20)
        {
            Wall wall=new Wall();
            addObject(wall,wallX4,wallY4);
            wallY4= wallY4+50;
            wallNum4=wallNum4 + 1;
        }

        while(wallNum5<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX5,wallY5);
            wallY5= wallY5+50;
            wallNum5=wallNum5 + 1;
        }

        while(wallNum6<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallY6= wallY6+50;
            wallNum6=wallNum6 + 1;
        }

        while(wallNum7<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallX7= wallX7+50;
            wallNum7=wallNum7 + 1;
        }

        while(wallNum8<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX8,wallY8);
            wallY8= wallY8+50;
            wallNum8=wallNum8 + 1;
        }

        while(wallNum9<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX9,wallY9);
            wallY9= wallY9+50;
            wallNum9=wallNum9 + 1;
        }

        while(wallNum10<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX10,wallY10);
            wallX10= wallX10+50;
            wallNum10=wallNum10 + 1;
        }

        while(wallNum11<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX11,wallY11);
            wallY11= wallY11+50;
            wallNum11=wallNum11 + 1;
        }

        while(wallNum12<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX12,wallY12);
            wallX12= wallX12+50;
            wallNum12=wallNum12 + 1;
        }

        while(wallNum13<13)
        {
            Wall wall=new Wall();
            addObject(wall,wallX13,wallY13);
            wallX13= wallX13+50;
            wallNum13=wallNum13 + 1;
        }

        while(wallNum14<9)
        {
            Wall wall=new Wall();
            addObject(wall,wallX14,wallY14);
            wallX14= wallX14+50;
            wallNum14=wallNum14 + 1;
        }

        while(wallNum15<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX15,wallY15);
            wallY15= wallY15+50;
            wallNum15=wallNum15 + 1;
        }

        while(wallNum16<9)
        {
            Wall wall=new Wall();
            addObject(wall,wallX16,wallY16);
            wallX16= wallX16+50;
            wallNum16=wallNum16 + 1;
        }

        while(wallNum17<9)
        {
            Wall wall=new Wall();
            addObject(wall,wallX17,wallY17);
            wallY17= wallY17+50;
            wallNum17=wallNum17 + 1;
        }

        while(wallNum18<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX18,wallY18);
            wallX18= wallX18+50;
            wallNum18=wallNum18 + 1;
        }

        while(wallNum19<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX19,wallY19);
            wallY19= wallY19+50;
            wallNum19=wallNum19 + 1;
        }

        while(wallNum20<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX20,wallY20);
            wallY20= wallY20+50;
            wallNum20=wallNum20 + 1;
        }

        while(wallNum21<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX21,wallY21);
            wallY21= wallY21+50;
            wallNum21=wallNum21 + 1;
        }

        while(wallNum22<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX22,wallY22);
            wallY22= wallY22+50;
            wallNum22=wallNum22 + 1;
        }

        while(wallNum23<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX23,wallY23);
            wallY23= wallY23+50;
            wallNum23=wallNum23 + 1;
        }

        while(wallNum2<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX24,wallY24);
            wallY24= wallY24+50;
            wallNum24=wallNum24 + 1;
        }

        while(wallNum25<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX25,wallY25);
            wallY25= wallY25+50;
            wallNum25=wallNum25 + 1;
        }

        while(wallNum26<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX26,wallY26);
            wallY26= wallY26+50;
            wallNum26=wallNum26 + 1;
        }

        while(wallNum27<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX27,wallY27);
            wallY27= wallY27+50;
            wallNum27=wallNum27 + 1;
        }
    }

    public void gameOver()
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
            removeObjects(getObjects(Character9.class));
            removeObjects(getObjects(Endgate.class));
            GameOver gameover= new GameOver();
            addObject(gameover,550,550);
            gameStatus=1;
            TextCreator textCreator1=new TextCreator(6,9);
            addObject(textCreator1,550,725);
            TextCreator textCreator2=new TextCreator(33,0);
            addObject(textCreator2,550,775);

            //loserino level

            //WORLDTWO worldtwo=new WORLDTWO();
            //gameStatus=1;
            // Greenfoot.setWorld(worldtwo);
            //Greenfoot.stop();

        }
    }
}

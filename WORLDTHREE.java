import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WORLDTHREE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WORLDTHREE extends World
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
    int wallX5=175;
    int wallY5=125;

    int wallNum6=0;
    int wallX6=525;
    int wallY6=125;

    int wallNum7=0;
    int wallX7=75;
    int wallY7=275;

    int wallNum8=0;
    int wallX8=525;
    int wallY8=325;

    int wallNum9=0;
    int wallX9=225;
    int wallY9=375;

    int wallNum10=0;
    int wallX10=175;
    int wallY10=425;

    int wallNum11=0;
    int wallX11=175;
    int wallY11=475;

    int wallNum12=0;
    int wallX12=275;
    int wallY12=525;

    int wallNum13=0;
    int wallX13=375;
    int wallY13=575;

    int wallNum14=0;
    int wallX14=575;
    int wallY14=475;

    /**
     * Constructor for objects of class WORLDTHREE.
     * 
     */
    public WORLDTHREE()
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
        Character3 character = new Character3();
        addObject(character, 75, 75);
        Trap trap12 = new Trap();
        addObject(trap12, 71, 134);
        trap12.setLocation(75, 125);
        Zookeeper2 zookeeper28 = new Zookeeper2();
        addObject(zookeeper28, 125, 75);
        zookeeper28.setLocation(125, 75);
        Zookeeper zookeeper9 = new Zookeeper();
        addObject(zookeeper9, 137, 226);
        zookeeper9.setLocation(126, 221);
        Zookeeper2 zookeeper29 = new Zookeeper2();
        addObject(zookeeper29, 1027, 79);
        zookeeper29.setLocation(1025, 75);
        Wall wall107 = new Wall();
        addObject(wall107, 1036, 279);
        wall107.setLocation(1027, 277);
        Trap trap2 = new Trap();
        addObject(trap2, 583, 330);
        trap2.setLocation(577, 326);
        Trap trap3 = new Trap();
        addObject(trap3, 286, 376);
        trap3.setLocation(277, 373);
        Zookeeper2 zookeeper23 = new Zookeeper2();
        addObject(zookeeper23, 234, 497);
        zookeeper23.setLocation(222, 475);
        Zookeeper2 zookeeper24 = new Zookeeper2();
        addObject(zookeeper24, 330, 1028);
        zookeeper24.setLocation(327, 1022);
        Zookeeper zookeeper4 = new Zookeeper();
        addObject(zookeeper4, 523, 484);
        zookeeper4.setLocation(528, 475);
        Zookeeper zookeeper5 = new Zookeeper();
        addObject(zookeeper5, 629, 528);
        zookeeper5.setLocation(623, 526);
        Zookeeper zookeeper6 = new Zookeeper();
        addObject(zookeeper6, 628, 586);
        zookeeper6.setLocation(625, 580);
        zookeeper5.setLocation(623, 523);
        zookeeper6.setLocation(625, 574);
        Zookeeper zookeeper7 = new Zookeeper();
        addObject(zookeeper7, 637, 635);
        zookeeper7.setLocation(626, 625);
        Zookeeper zookeeper8 = new Zookeeper();
        addObject(zookeeper8, 628, 684);
        zookeeper8.setLocation(626, 674);
        zookeeper6.setLocation(625, 573);
        zookeeper7.setLocation(626, 623);
        Zookeeper zookeeper10 = new Zookeeper();
        addObject(zookeeper10, 625, 829);
        zookeeper10.setLocation(627, 824);
        Zookeeper zookeeper11 = new Zookeeper();
        addObject(zookeeper11, 634, 882);
        zookeeper11.setLocation(629, 872);
        Zookeeper zookeeper12 = new Zookeeper();
        addObject(zookeeper12, 639, 929);
        zookeeper12.setLocation(630, 921);
        Zookeeper zookeeper13 = new Zookeeper();
        addObject(zookeeper13, 627, 985);
        zookeeper13.setLocation(630, 970);
        Trap trap4 = new Trap();
        addObject(trap4, 914, 919);
        trap4.setLocation(897, 926);
        Trap trap5 = new Trap();
        addObject(trap5, 957, 876);
        trap5.setLocation(952, 872);
        Trap trap6 = new Trap();
        addObject(trap6, 826, 639);
        trap6.setLocation(822, 627);
        Trap trap7 = new Trap();
        addObject(trap7, 719, 684);
        trap7.setLocation(713, 676);
        zookeeper5.setLocation(676, 571);
        zookeeper6.setLocation(726, 619);
        zookeeper7.setLocation(777, 669);
        zookeeper8.setLocation(880, 821);
        zookeeper9.setLocation(1012, 871);
        zookeeper10.setLocation(958, 951);
        removeObject(trap5);
        zookeeper9.setLocation(942, 872);
        zookeeper10.setLocation(996, 925);
        zookeeper11.setLocation(1000, 987);
        Lever lever = new Lever();
        addObject(lever, 83, 1030);
        lever.setLocation(74, 1024);
        Endgate endgate = new Endgate(3);
        addObject(endgate, 969, 813);
        removeObject(endgate);
        Endgate endgate2 = new Endgate(3);
        addObject(endgate2, 1031, 234);
        endgate2.setLocation(1026, 227);
        //Wall wall1=new Wall();
        //addObject(wall1,25,25);
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

        while( wallNum5<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX5,wallY5);
            wallX5= wallX5+50;
            wallNum5=wallNum5 + 1;
        }

        while( wallNum6<10)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallX6= wallX6+50;
            wallNum6=wallNum6 + 1;
        }

        while( wallNum7<17)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallX7= wallX7+50;
            wallNum7=wallNum7 + 1;
        }

        while( wallNum8<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX8,wallY8);
            wallX8= wallX8+50;
            wallNum8=wallNum8 + 1;
        }

        while( wallNum9<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX9,wallY9);
            wallX9= wallX9+50;
            wallNum9=wallNum9 + 1;
        }

        while( wallNum10<16)
        {
            Wall wall=new Wall();
            addObject(wall,wallX10,wallY10);
            wallX10= wallX10+50;
            wallNum10=wallNum10 + 1;
        }

        while( wallNum11<9)
        {
            Wall wall=new Wall();
            addObject(wall,wallX11,wallY11);
            wallY11= wallY11+50;
            wallNum11=wallNum11 + 1;
        }

        while( wallNum12<9)
        {
            Wall wall=new Wall();
            addObject(wall,wallX12,wallY12);
            wallY12= wallY12+50;
            wallNum12=wallNum12 + 1;
        }

        while( wallNum13<10)
        {
            Wall wall=new Wall();
            addObject(wall,wallX13,wallY13);
            wallY13= wallY13+50;
            wallNum13=wallNum13 + 1;
        }

        while( wallNum14<11)
        {
            Wall wall=new Wall();
            addObject(wall,wallX14,wallY14);
            wallY14= wallY14+50;
            wallNum14=wallNum14 + 1;
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
            removeObjects(getObjects(Character3.class));
            removeObjects(getObjects(Endgate.class));
            GameOver gameover= new GameOver();
            addObject(gameover,550,550);
            gameStatus=1;
            TextCreator textCreator1=new TextCreator(6,3);
            addObject(textCreator1,550,725);
            TextCreator textCreator2=new TextCreator(33,0);
            addObject(textCreator2,550,775);
        }
    }

    
}

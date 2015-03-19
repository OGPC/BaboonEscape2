import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WORLDFIVE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WORLDFIVE extends World
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
    int wallX5 =75;
    int wallY5 =25;
    
    int wallNum6=0;
    int wallX6 = 225;
    int wallY6 = 75;
    
    int wallNum7=0;
    int wallX7 = 275;
    int wallY7 = 425;
    
    int wallNum8=0;
    int wallX8 = 325;
    int wallY8 = 125;
    
    int wallNum9=0;
    int wallX9 = 425;
    int wallY9 = 125;
    
    int wallNum10=0;
    int wallX10 = 425;
    int wallY10 = 225;
    
    int wallNum11=0;
    int wallX11 = 75;
    int wallY11 = 525;
    
    int wallNum12=0;
    int wallX12 = 475;
    int wallY12 = 225;
    
    int wallNum13=0;
    int wallX13 = 625;
    int wallY13 = 225;
    
    int wallNum14=0;
    int wallX14 = 525;
    int wallY14 = 275;
    
    int wallNum15=0;
    int wallX15 = 675;
    int wallY15 = 325;
       
    int wallNum16=0;
    int wallX16 = 525;
    int wallY16 = 425;
    
    int wallNum17=0;
    int wallX17 = 475;
    int wallY17 = 975;
    
    int wallNum18=0;
    int wallX18 = 675;
    int wallY18 = 425;
    
    int wallNum19=0;
    int wallX19 = 775;
    int wallY19 = 425;
    
    int wallNum20=0;
    int wallX20 = 925;
    int wallY20 = 425;
       
    int wallNum21=0;
    int wallX21 = 675;
    int wallY21 = 975;
    
    int wallNum22=0;
    int wallX22 = 825;
    int wallY22 = 975;
    
    int wallNum23=0;
    int wallX23 = 975;
    int wallY23 = 975;
    
    int wallNum24=0;
    int wallX24 = 575;
    int wallY24 = 925;
    
    int wallNum25=0;
    int wallX25 = 125;
    int wallY25 = 825;
    
    int wallNum26=0;
    int wallX26 = 125;
    int wallY26 = 625;
       
       
    /**
     * Constructor for objects of class WORLD5.
     * 
     */
    public WORLDFIVE()
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
        Character character2 = new Character();
        addObject(character2, 75, 75);
        character2.setLocation(75, 75);
        Zookeeper zookeeper = new Zookeeper();
        addObject(zookeeper, 75, 125);
        zookeeper.setLocation(75, 125);
        Zookeeper zookeeper2 = new Zookeeper();
        addObject(zookeeper2, 75, 375);
        Zookeeper zookeeper3 = new Zookeeper();
        addObject(zookeeper3, 75, 475);
        zookeeper3.setLocation(75, 472);
        Trap trap = new Trap();
        addObject(trap, 121, 230);
        trap.setLocation(122, 227);
        Trap trap2 = new Trap();
        addObject(trap2, 133, 282);
        trap2.setLocation(121, 279);
        Trap trap3 = new Trap();
        addObject(trap3, 179, 282);
        trap2.setLocation(112, 279);
        trap3.setLocation(168, 277);
        trap.setLocation(174, 225);
        trap3.setLocation(174, 278);
        trap2.setLocation(119, 279);
        trap2.setLocation(122, 281);
        Trap trap4 = new Trap();
        addObject(trap4, 282, 277);
        trap4.setLocation(275, 274);
        Trap trap5 = new Trap();
        addObject(trap5, 326, 74);
        trap5.setLocation(323, 74);
        Trap trap6 = new Trap();
        addObject(trap6, 430, 78);
        trap6.setLocation(422, 74);
        Lever lever = new Lever();
        addObject(lever, 1026, 77);
        lever.setLocation(1025, 75);
        Trap trap7 = new Trap();
        addObject(trap7, 979, 83);
        trap7.setLocation(974, 73);
        Zookeeper2 zookeeper22 = new Zookeeper2();
        addObject(zookeeper22, 730, 90);
        zookeeper22.setLocation(730, 90);
        zookeeper22.setLocation(730, 90);
        zookeeper22.setLocation(727, 80);
        Zookeeper zookeeper4 = new Zookeeper();
        addObject(zookeeper4, 684, 230);
        zookeeper4.setLocation(679, 223);
        Zookeeper zookeeper5 = new Zookeeper();
        addObject(zookeeper5, 81, 582);
        zookeeper5.setLocation(75, 575);
        Trap trap8 = new Trap();
        addObject(trap8, 183, 629);
        trap8.setLocation(182, 629);
        trap8.setLocation(176, 625);
        Trap trap9 = new Trap();
        addObject(trap9, 238, 631);
        trap9.setLocation(228, 624);
        Trap trap10 = new Trap();
        addObject(trap10, 287, 631);
        trap10.setLocation(281, 624);
        Zookeeper zookeeper6 = new Zookeeper();
        addObject(zookeeper6, 186, 780);
        zookeeper6.setLocation(180, 775);
        Trap trap11 = new Trap();
        addObject(trap11, 130, 783);
        trap11.setLocation(126, 776);
        Zookeeper zookeeper7 = new Zookeeper();
        addObject(zookeeper7, 185, 883);
        zookeeper7.setLocation(180, 875);
        Zookeeper zookeeper8 = new Zookeeper();
        addObject(zookeeper8, 179, 1023);
        zookeeper8.setLocation(175, 1019);
        Endgate endgate = new Endgate();
        addObject(endgate, 78, 1029);
        endgate.setLocation(75, 1024);
        Zookeeper2 zookeeper23 = new Zookeeper2();
        addObject(zookeeper23, 482, 922);
        zookeeper23.setLocation(476, 921);
        Zookeeper2 zookeeper24 = new Zookeeper2();
        addObject(zookeeper24, 577, 876);
        zookeeper24.setLocation(574, 871);
        Zookeeper2 zookeeper25 = new Zookeeper2();
        addObject(zookeeper25, 731, 926);
        zookeeper25.setLocation(726, 920);
        Zookeeper2 zookeeper26 = new Zookeeper2();
        addObject(zookeeper26, 835, 927);
        zookeeper26.setLocation(824, 920);
        Zookeeper2 zookeeper27 = new Zookeeper2();
        addObject(zookeeper27, 985, 937);
        zookeeper27.setLocation(974, 923);
        removeObject(zookeeper25);
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
        
        while( wallNum5<21)
        {
            Wall wall=new Wall();
            addObject(wall,wallX5,wallY5);
            wallX5= wallX5+50;
            wallNum5=wallNum5 + 1;
        }
        
         while( wallNum6<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallY6= wallY6+50;
            wallNum6=wallNum6 + 1;
        }
        
         while( wallNum7<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallX7= wallX7+50;
            wallNum7=wallNum7 + 1;
        }
        
        while( wallNum8<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX8,wallY8);
            wallY8= wallY8+50;
            wallNum8=wallNum8 + 1;
        }
        
        while( wallNum9<5)
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
            wallY10= wallY10+50;
            wallNum10=wallNum10 + 1;
        }
        
        while( wallNum11<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX11,wallY11);
            wallX11= wallX11+50;
            wallNum11=wallNum11 + 1;
        }
        
        while( wallNum12<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX12,wallY12);
            wallX12= wallX12+50;
            wallNum12=wallNum12 + 1;
        }
        
        while( wallNum13<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX13,wallY13);
            wallY13= wallY13+50;
            wallNum13=wallNum13 + 1;
        }
        
        while( wallNum14<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX14,wallY14);
            wallY14= wallY14+50;
            wallNum14=wallNum14 + 1;
        }
        
        while( wallNum15<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX15,wallY15);
            wallX15= wallX15+50;
            wallNum15=wallNum15 + 1;
        }
        
        while( wallNum16<12)
        {
            Wall wall=new Wall();
            addObject(wall,wallX16,wallY16);
            wallY16= wallY16+50;
            wallNum16=wallNum16 + 1;
        }
        
        while( wallNum17<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX17,wallY17);
            wallX17= wallX17+50;
            wallNum17=wallNum17 + 1;
        }
        
        while( wallNum18<12)
        {
            Wall wall=new Wall();
            addObject(wall,wallX18,wallY18);
            wallY18= wallY18+50;
            wallNum18=wallNum18 + 1;
        }
        
        while( wallNum19<12)
        {
            Wall wall=new Wall();
            addObject(wall,wallX19,wallY19);
            wallY19= wallY19+50;
            wallNum19=wallNum19 + 1;
        }
        
        while( wallNum20<12)
        {
            Wall wall=new Wall();
            addObject(wall,wallX20,wallY20);
            wallY20= wallY20+50;
            wallNum20=wallNum20 + 1;
        }
        
        while( wallNum21<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX21,wallY21);
            wallX21= wallX21+50;
            wallNum21=wallNum21 + 1;
        }
        
        while( wallNum22<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX22,wallY22);
            wallX22= wallX22+50;
            wallNum22=wallNum22 + 1;
        }
        
        while( wallNum23<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX23,wallY23);
            wallX23= wallX23+50;
            wallNum23=wallNum23 + 1;
        }
        
        while( wallNum24<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX24,wallY24);
            wallX24= wallX24+50;
            wallNum24=wallNum24 + 1;
        }
        
        while( wallNum25<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX25,wallY25);
            wallY25= wallY25+50;
            wallNum25=wallNum25 + 1;
        }
        
        while( wallNum26<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX26,wallY26);
            wallY26= wallY26+50;
            wallNum26=wallNum26 + 1;
        }
    }
    
    private void gameOver()
    {
        if(gameStatus == 2)
        {
            Greenfoot.playSound("buzz.wav");

            removeObjects(getObjects(Zookeeper.class));
            removeObjects(getObjects(Zookeeper2.class));
            removeObjects(getObjects(Zookeeper3.class));
            removeObjects(getObjects(Trap.class));
            removeObjects(getObjects(Lever.class));
            removeObjects(getObjects(Wall.class));
            removeObjects(getObjects(Character.class));
            removeObjects(getObjects(Endgate.class));
            GameOver gameover= new GameOver();
            addObject(gameover,375,375);
            Greenfoot.delay(1000);
            Greenfoot.stop();
        }
    }
}

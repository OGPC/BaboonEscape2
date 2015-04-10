import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WORLDFOUR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WORLDFOUR extends World
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
    int wallX6 = 75;
    int wallY6 = 175;
    
    int wallNum7=0;
    int wallX7 = 925;
    int wallY7 = 225;
    
    int wallNum8=0;
    int wallX8 = 75;
    int wallY8 = 575;
    
    int wallNum9=0;
    int wallX9 = 125;
    int wallY9 = 675;
    
    int wallNum10=0;
    int wallX10 = 775;
    int wallY10 = 625;
    
    int wallNum11=0;
    int wallX11 = 775;
    int wallY11 = 275;
    
    int wallNum12=0;
    int wallX12 = 625;
    int wallY12 = 225;
    
    int wallNum13=0;
    int wallX13 = 475;
    int wallY13 = 275;
    
    int wallNum14=0;
    int wallX14 = 325;
    int wallY14 = 225;
    
    
    public WORLDFOUR()
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
         Character4 character2 = new Character4();
        addObject(character2, 75, 75);
        character2.setLocation(75, 75);
        character2.setLocation(75, 75);   
        Zookeeper zookeeper3 = new Zookeeper();
        addObject(zookeeper3, 975, 225);
        zookeeper3.setLocation(975, 225);
        Zookeeper zookeeper4 = new Zookeeper();
        addObject(zookeeper4, 975, 275);
        zookeeper4.setLocation(975, 275);
        zookeeper4.setLocation(975, 275);
        //Zookeeper zookeeper5 = new Zookeeper();
        // addObject(zookeeper5, 975, 325);
        //zookeeper5.setLocation(975, 325);
        //Zookeeper zookeeper6 = new Zookeeper();
        //addObject(zookeeper6, 975, 425);
        //zookeeper6.setLocation(975, 425);
        Zookeeper2 zookeeper22 = new Zookeeper2();
        addObject(zookeeper22, 885, 235);
        zookeeper22.setLocation(875, 225);
        Zookeeper2 zookeeper23 = new Zookeeper2();
        addObject(zookeeper23, 835, 235);
        zookeeper23.setLocation(825, 225);
        Zookeeper2 zookeeper24 = new Zookeeper2();
        addObject(zookeeper24, 725, 235);
        zookeeper24.setLocation(725, 225);
        Zookeeper2 zookeeper25 = new Zookeeper2();
        addObject(zookeeper25, 685, 235);
        zookeeper25.setLocation(675, 225);
        zookeeper24.setLocation(725, 225);
        Zookeeper2 zookeeper26 = new Zookeeper2();
        addObject(zookeeper26, 575, 235);
        zookeeper26.setLocation(575, 225);
        Zookeeper2 zookeeper27 = new Zookeeper2();
        addObject(zookeeper27, 530, 225);
        zookeeper27.setLocation(525, 225);
        zookeeper27.setLocation(525, 225);
        Zookeeper2 zookeeper28 = new Zookeeper2();
        addObject(zookeeper28, 425, 225);
        zookeeper28.setLocation(425, 225);
        Zookeeper2 zookeeper29 = new Zookeeper2();
        addObject(zookeeper29, 375, 225);
        zookeeper29.setLocation(375, 225);
        Lever lever = new Lever();
        addObject(lever, 75, 225);
        lever.setLocation(75, 225);
        Zookeeper zookeeper7 = new Zookeeper();
        addObject(zookeeper7, 75, 275);
        zookeeper7.setLocation(75, 275);
        Zookeeper zookeeper8 = new Zookeeper();
        addObject(zookeeper8, 100, 375);
        zookeeper8.setLocation(100, 375);
        Zookeeper zookeeper9 = new Zookeeper();
        addObject(zookeeper9, 75, 475);
        zookeeper9.setLocation(75, 475);
        Trap trap = new Trap();
        addObject(trap, 725, 625);
        trap.setLocation(725, 625);
        Trap trap2 = new Trap();
        addObject(trap2, 735, 815);
        trap2.setLocation(725, 815);
        trap2.setLocation(725, 825);
        Trap trap3 = new Trap();
        addObject(trap3, 495, 935);
        trap3.setLocation(485, 925);
        Trap trap4 = new Trap();
        addObject(trap4, 475, 735);
        trap4.setLocation(475, 735);
        trap4.setLocation(475, 725);
        Trap trap5 = new Trap();
        addObject(trap5, 350, 675);
        trap5.setLocation(325, 675);
        Trap trap6 = new Trap();
        addObject(trap6, 325, 875);
        trap6.setLocation(325, 875);
        Zookeeper zookeeper10 = new Zookeeper();
        addObject(zookeeper10, 1025, 825);
        zookeeper10.setLocation(1025, 825);
        Zookeeper zookeeper11 = new Zookeeper();
        addObject(zookeeper11, 1036, 738);
        zookeeper11.setLocation(1025, 726);
        Zookeeper zookeeper12 = new Zookeeper();
        addObject(zookeeper12, 1034, 931);
        zookeeper12.setLocation(1024, 923);
        Zookeeper zookeeper13 = new Zookeeper();
        addObject(zookeeper13, 1033, 1023);
        zookeeper13.setLocation(1025, 1021);
        Trap trap7 = new Trap();
        addObject(trap7, 328, 1025);
        trap7.setLocation(317, 1021);

        removeObject(zookeeper3);
        removeObject(zookeeper4);
        removeObject(zookeeper22);
        removeObject(zookeeper24);
        removeObject(zookeeper26);
        removeObject(zookeeper28);
        Trap trap8 = new Trap();
        addObject(trap8, 1025, 300);
        trap8.setLocation(1025, 275);
        Trap trap9 = new Trap();
        addObject(trap9, 975, 400);
        trap9.setLocation(975, 400);
        Trap trap10 = new Trap();
        addObject(trap10, 1025, 500);
        trap10.setLocation(1025, 475);
        Trap trap11 = new Trap();
        addObject(trap11, 1025, 575);
        trap11.setLocation(1025, 575);
        trap10.setLocation(1025, 525);
        Endgate endgate = new Endgate(4);
        addObject(endgate, 75, 1022);
        endgate.setLocation(75, 1025);
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

        while( wallNum6<19)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallX6= wallX6+50; 
            wallNum6=wallNum6 + 1;
        }

        while( wallNum7<7)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallY7= wallY7+50;
            wallNum7=wallNum7 + 1;
        }

        while( wallNum8<15)
        {
            Wall wall=new Wall();
            addObject(wall,wallX8,wallY8);
            wallX8= wallX8+50; 
            wallNum8=wallNum8 + 1;
        }

        while( wallNum9<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX9,wallY9);
            wallY9= wallY9+50;
            wallNum9=wallNum9 + 1;
        }

        while( wallNum10<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX10,wallY10);
            wallX10= wallX10+50; 
            wallNum10=wallNum10 + 1;
        }

        while( wallNum11<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX11,wallY11);
            wallY11= wallY11+50;
            wallNum11=wallNum11 + 1;
        }

        while( wallNum12<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX12,wallY12);
            wallY12= wallY12+50;
            wallNum12=wallNum12 + 1;
        }

        while( wallNum13<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX13,wallY13);
            wallY13= wallY13+50;
            wallNum13=wallNum13 + 1;
        }

        while( wallNum14<6)
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
            Greenfoot.playSound("buzz.wav");

            removeObjects(getObjects(Zookeeper.class));
            removeObjects(getObjects(Zookeeper2.class));
            removeObjects(getObjects(Zookeeper3.class));
            removeObjects(getObjects(Trap.class));
            removeObjects(getObjects(Lever.class));
            removeObjects(getObjects(Wall.class));
            removeObjects(getObjects(Character4.class));
            removeObjects(getObjects(Endgate.class));
            GameOver gameover= new GameOver();
            addObject(gameover,550,550);
            Greenfoot.delay(1000);
            Greenfoot.stop();
        }
    }
}

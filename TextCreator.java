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
    public int textNum;
    public int level;
    public TextCreator(int inputText, int inputLevel)
    {
        textNum=inputText;
        level=inputLevel;
        if (textNum==0)
        {
            setImage("InstructDiagram.png");
        }

        if (textNum==1)
        {
            setImage(new GreenfootImage("Press here to move on", 25, Color.WHITE, Color.BLACK));
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
            setImage("TryAgain.png");
        }

        if(textNum==9)
        {
            setImage(new GreenfootImage("Reach Endgate to ", 25, Color.BLACK, Color.WHITE));
        }

        if(textNum==10)
        {
            setImage(new GreenfootImage(" get to next level", 25, Color.BLACK, Color.WHITE));
        }

        if(textNum==11)
        {
            setImage("BaboonLogo.png");
        }
        if(textNum==12)
        {
            setImage("Start.png");
        }

        if(textNum==13)
        {
            setImage("Settings.png");
        }
        if(textNum==14)
        {
            setImage("Credits.png");
        }
        if(textNum==15)
        {
            setImage("escapedBaboon.gif");
        }
        if(textNum==16)
        {
            setImage("LevelComplete.png");
        }
        if(textNum==17)
        {
            setImage("Redo.png");
        }
        if(textNum==18)
        {
            setImage("Quit.png");
        }
        if(textNum==19)
        {
            setImage("Continue.png");
        }
        if(textNum==20)
        {
            setImage("MONKEYU2.png");
        }
         if(textNum==21)
        {
            setImage("storyline1.png");
        }
         if(textNum==22)
        {
            setImage("storyline2.png");
        }
        /*
        if(textNum==21)
        {
            setImage(new GreenfootImage("After numerous years of mistreatment,the baboons", 20, Color.GREEN, Color.BLACK));

        } 
        if(textNum==22)
        {
            setImage(new GreenfootImage("have finally had enough of their zookeepers.", 20, Color.GREEN, Color.BLACK));

        }
        if(textNum==23)
        {
            setImage(new GreenfootImage("After waiting for the zookeepers to feed them,", 20, Color.GREEN, Color.BLACK));

        }
        if(textNum==24)
        {
            setImage(new GreenfootImage("the moment the cage is opened, the baboons dash out", 20, Color.GREEN, Color.BLACK));

        }
        if(textNum==25)
        {
            setImage(new GreenfootImage("of their prisons and into the wild", 20, Color.GREEN, Color.BLACK));

        }
        if(textNum==26)
        {
            setImage(new GreenfootImage("with the zookeepers in hot pursuit.", 20, Color.GREEN,Color.BLACK));

        }
        if(textNum==27)
        {
            setImage(new GreenfootImage("But unbeknownst to the baboons, the", 20, Color.GREEN,Color.BLACK));

        }
        if(textNum==28)
        {
            setImage(new GreenfootImage("zookeepers have planted numerous obstacles", 20, Color.GREEN, Color.BLACK));

        }
        if(textNum==29)
        {
            setImage(new GreenfootImage("in the baboons' path, and will do anything", 20, Color.GREEN, Color.BLACK));

        }
        if(textNum==30)
        {
            setImage(new GreenfootImage("to prevent them from escaping. At the end", 20, Color.GREEN, Color.BLACK));

        }
        if(textNum==31)
        {
            setImage(new GreenfootImage("of their path lies the Head Zookeeper, B-Rad", 20, Color.GREEN, Color.BLACK));

        }*/
        if(textNum==32)
        {
            setImage("Continue.png");
        }
        if(textNum==33)
        {
            setImage("Quit.png");
        }
        if(textNum==34)
        {
            setImage("YouWon.png");
        }
        if(textNum==35)
        {
            setImage("Back.png");
        }
        if(textNum==36)
        {
            setImage("Creditsactual.png");
        }
        if(textNum==37)
        {
            setImage("SkipStory.png");
        }
        if(textNum==38)
        {
            setImage("DisableMusic.png");
        }
        if(textNum==39)
        {
            setImage("DisableTutorial.png");
        }
        if(textNum==40)
        {
            setImage("Check.png");
            //remember to program the animation between check and box
        }
        if(textNum==41)
        {
            setImage("Check.png");
            //remember to program the animation between check and box
        }
        if(textNum==42)
        {
            setImage("Check.png");
            //remember to program the animation between check and box
        }

    }

    /**
     * Act - do whatever the TextCreater wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor textCreator;
        textCreator=getOneObjectAtOffset(0,0,TextCreator.class);
        World world;
        world=getWorld();
        if(StartMenuWorld.storyStatus==0)
        {
            if(StartMenuWorld.permaMenuStatus==2&&textNum==40)
            {
                
                world.removeObject(this);
            }
        }
        if(StartMenuWorld.tutorialStatus==0)
        {
            if(StartMenuWorld.permaMenuStatus==2&&textNum==42)
            {
                
                world.removeObject(this);
            }
        }
        if(StartMenuWorld.musicStatus==0)
        {
            if(StartMenuWorld.permaMenuStatus==2&&textNum==41)
            {
                
                world.removeObject(this);
            }
        }

        // Add your action code here.

        //disabling functionality
        if( Greenfoot.mouseClicked(this)&&textNum==37 )
        {
            if ( StartMenuWorld.storyStatus==0 )
            {
                Greenfoot.playSound("MenuClick.wav");
                StartMenuWorld.storyStatus=1;
                Greenfoot.delay(1);
            }
            else if (Greenfoot.mouseClicked(this)&&textNum==37&&StartMenuWorld.storyStatus==1)
            {
                Greenfoot.playSound("MenuClick.wav");
                StartMenuWorld.storyStatus=0;
                Greenfoot.delay(1);
            }

        }

        if( Greenfoot.mouseClicked(this)&&textNum==38 )
        {
            if ( StartMenuWorld.musicStatus==0 )
            {
                Greenfoot.playSound("MenuClick.wav");
                StartMenuWorld.musicStatus=1;
                Greenfoot.delay(1);
            }
            else if (Greenfoot.mouseClicked(this)&&textNum==38&&StartMenuWorld.musicStatus==1)
            {
                Greenfoot.playSound("MenuClick.wav");
                StartMenuWorld.musicStatus=0;
                Greenfoot.delay(1);
            }

        }

        if( Greenfoot.mouseClicked(this)&&textNum==39 )
        {
            if ( StartMenuWorld.tutorialStatus==0 )
            {
                Greenfoot.playSound("MenuClick.wav");
                StartMenuWorld.tutorialStatus=1;
                Greenfoot.delay(1);
            }
            else if (Greenfoot.mouseClicked(this)&&textNum==39&&StartMenuWorld.tutorialStatus==1)
            {
                Greenfoot.playSound("MenuClick.wav");
                StartMenuWorld.tutorialStatus=0;
                Greenfoot.delay(1);
            }

        }



        if(Greenfoot.mouseClicked(this)&&textNum==35)
        {
            Greenfoot.playSound("MenuClick.wav");
            Greenfoot.setWorld(new StartMenuWorld());
            StartMenuWorld.permaMenuStatus=0;

        }
        if(Greenfoot.mouseClicked(this)&&textNum==32)
        {
            Greenfoot.playSound("MenuClick.wav");
            Greenfoot.setWorld(new InstructionWorld());

        }
        if(Greenfoot.mouseClicked(this)&&textNum==1)
        {
            Greenfoot.playSound("MenuClick.wav");
            Greenfoot.setWorld(new WorldTutorial());

        }
        if(Greenfoot.mouseClicked(this)&&textNum==12)
        {
            Greenfoot.playSound("MenuClick.wav");
            StartMenuWorld.menuStatus=1;

            //start game
        }
        if(Greenfoot.mouseClicked(this)&&textNum==13)
        {
            Greenfoot.playSound("MenuClick.wav");
            StartMenuWorld.menuStatus=2;
            //settings
        }
        if(Greenfoot.mouseClicked(this)&&textNum==14)
        {
            Greenfoot.playSound("MenuClick.wav");
            StartMenuWorld.menuStatus=3;
            //credits
        }

        transitionWorld(level);
    }

    public void transitionWorld (int inputLevel2)
    {
        level=inputLevel2;
        if(Greenfoot.mouseClicked(this)&&textNum==33)
        {
            WorldTutorial.lockStatus=1;
            WORLDTWO.lockStatus=1;
            WORLDTHREE.lockStatus=1;
            WORLDFOUR.lockStatus=1;
            WORLDFIVE.lockStatus=1;
            WORLDSIX.lockStatus=1;
            WORLDSEVEN.lockStatus=1;
            WORLDEIGHT.lockStatus=1;
            WORLDNINE.lockStatus=1;
            WORLDTEN.lockStatus=1;
            WorldTutorial.gameStatus=1;
            WORLDTWO.gameStatus=1;
            WORLDTHREE.gameStatus=1;
            WORLDFOUR.gameStatus=1;
            WORLDFIVE.gameStatus=1;
            WORLDSIX.gameStatus=1;
            WORLDSEVEN.gameStatus=1;
            WORLDEIGHT.gameStatus=1;
            WORLDNINE.gameStatus=1;
            WORLDTEN.gameStatus=1;
            Greenfoot.setWorld(new StartMenuWorld());
            Greenfoot.playSound("MenuClick.wav");

            //Quiting game
        }

        //this is for completing tutorial level
        if(level==1&&Greenfoot.mouseClicked(this)&&textNum==17)
        {
            WorldTutorial.lockStatus=1;
            Greenfoot.setWorld(new WorldTutorial());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==1&&Greenfoot.mouseClicked(this)&&textNum==18)
        {
            WorldTutorial.lockStatus=1;
            Greenfoot.setWorld(new StartMenuWorld());
            Greenfoot.playSound("MenuClick.wav");
            //Quiting game
        }
        if(level==1&&Greenfoot.mouseClicked(this)&&textNum==19)
        {
            WORLDTWO.gameStatus=1;
            Greenfoot.setWorld(new WORLDTWO());
            Greenfoot.playSound("MenuClick.wav");
            //continuing game
        }

        //worldtwo
        if(level==2&&Greenfoot.mouseClicked(this)&&textNum==17)
        {
            WORLDTWO.lockStatus=1;
            Greenfoot.setWorld(new WORLDTWO());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==2&&Greenfoot.mouseClicked(this)&&textNum==18)
        {
            WORLDTWO.lockStatus=1;
            Greenfoot.setWorld(new StartMenuWorld());
            Greenfoot.playSound("MenuClick.wav");

            //Quiting game
        }
        if(level==2&&Greenfoot.mouseClicked(this)&&textNum==19)
        {
            WORLDTHREE.gameStatus=1;
            Greenfoot.setWorld(new WORLDTHREE());
            Greenfoot.playSound("MenuClick.wav");
            //continuing game
        }

        //worldthree

        if(level==3&&Greenfoot.mouseClicked(this)&&textNum==17)
        {
            WORLDTHREE.lockStatus=1;
            Greenfoot.setWorld(new WORLDTHREE());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==3&&Greenfoot.mouseClicked(this)&&textNum==18)
        {
            WORLDTHREE.lockStatus=1;
            Greenfoot.setWorld(new StartMenuWorld());
            Greenfoot.playSound("MenuClick.wav");

            //Quiting game
        }
        if(level==3&&Greenfoot.mouseClicked(this)&&textNum==19)
        {
            WORLDFOUR.gameStatus=1;
            Greenfoot.setWorld(new WORLDFOUR());
            Greenfoot.playSound("MenuClick.wav");
            //continuing game
        }

        //worldfour
        if(level==4&&Greenfoot.mouseClicked(this)&&textNum==17)
        {
            WORLDFOUR.lockStatus=1;
            Greenfoot.setWorld(new WORLDFOUR());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==4&&Greenfoot.mouseClicked(this)&&textNum==18)
        {
            WORLDFOUR.lockStatus=1;
            Greenfoot.setWorld(new StartMenuWorld());
            Greenfoot.playSound("MenuClick.wav");

            //Quiting game
        }
        if(level==4&&Greenfoot.mouseClicked(this)&&textNum==19)
        {
            WORLDFIVE.gameStatus=1;
            Greenfoot.setWorld(new WORLDFIVE());
            Greenfoot.playSound("MenuClick.wav");
            //continuing game
        }

        //worldfive
        if(level==5&&Greenfoot.mouseClicked(this)&&textNum==17)
        {
            WORLDFIVE.lockStatus=1;
            Greenfoot.setWorld(new WORLDFIVE());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==5&&Greenfoot.mouseClicked(this)&&textNum==18)
        {
            WORLDFIVE.lockStatus=1;
            Greenfoot.setWorld(new StartMenuWorld());
            Greenfoot.playSound("MenuClick.wav");

            //Quiting game
        }
        if(level==5&&Greenfoot.mouseClicked(this)&&textNum==19)
        {
            WORLDSIX.gameStatus=1;
            Greenfoot.setWorld(new WORLDSIX());
            Greenfoot.playSound("MenuClick.wav");
            //continuing game
        }

        //worldsix
        if(level==6&&Greenfoot.mouseClicked(this)&&textNum==17)
        {
            WORLDSIX.lockStatus=1;
            Greenfoot.setWorld(new WORLDSIX());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==6&&Greenfoot.mouseClicked(this)&&textNum==18)
        {
            WORLDSIX.lockStatus=1;
            Greenfoot.setWorld(new StartMenuWorld());
            Greenfoot.playSound("MenuClick.wav");

            //Quiting game
        }
        if(level==6&&Greenfoot.mouseClicked(this)&&textNum==19)
        {
            WORLDSEVEN.gameStatus=1;
            Greenfoot.setWorld(new WORLDSEVEN());
            Greenfoot.playSound("MenuClick.wav");
            //continuing game
        }

        //worldseven
        if(level==7&&Greenfoot.mouseClicked(this)&&textNum==17)
        {
            WORLDSEVEN.lockStatus=1;
            Greenfoot.setWorld(new WORLDSEVEN());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==7&&Greenfoot.mouseClicked(this)&&textNum==18)
        {
            WORLDSEVEN.lockStatus=1;
            Greenfoot.setWorld(new StartMenuWorld());
            Greenfoot.playSound("MenuClick.wav");

            //Quiting game
        }
        if(level==7&&Greenfoot.mouseClicked(this)&&textNum==19)
        {
            WORLDEIGHT.gameStatus=1;
            Greenfoot.setWorld(new WORLDEIGHT());
            Greenfoot.playSound("MenuClick.wav");
            //continuing game
        }

        //worldeight
        if(level==8&&Greenfoot.mouseClicked(this)&&textNum==17)
        {
            WORLDEIGHT.lockStatus=1;
            Greenfoot.setWorld(new WORLDEIGHT());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==8&&Greenfoot.mouseClicked(this)&&textNum==18)
        {
            WORLDEIGHT.lockStatus=1;
            Greenfoot.setWorld(new StartMenuWorld());
            Greenfoot.playSound("MenuClick.wav");

            //Quiting game
        }
        if(level==8&&Greenfoot.mouseClicked(this)&&textNum==19)
        {
            WORLDNINE.gameStatus=1;
            Greenfoot.setWorld(new WORLDNINE());
            Greenfoot.playSound("MenuClick.wav");
            //continuing game
        }

        //worldnine
        if(level==9&&Greenfoot.mouseClicked(this)&&textNum==17)
        {
            WORLDNINE.lockStatus=1;
            Greenfoot.setWorld(new WORLDNINE());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==9&&Greenfoot.mouseClicked(this)&&textNum==18)
        {
            WORLDNINE.lockStatus=1;
            Greenfoot.setWorld(new StartMenuWorld());
            Greenfoot.playSound("MenuClick.wav");

            //Quiting game
        }
        if(level==9&&Greenfoot.mouseClicked(this)&&textNum==19)
        {
            WORLDTEN.gameStatus=1;
            Greenfoot.setWorld(new WORLDTEN());
            Greenfoot.playSound("MenuClick.wav");
            //continuing game
        }

        //worldnine
        if(level==10&&Greenfoot.mouseClicked(this)&&textNum==17)
        {
            WORLDTEN.lockStatus=1;
            Greenfoot.setWorld(new WORLDTEN());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==10&&Greenfoot.mouseClicked(this)&&textNum==18)
        {
            WORLDTEN.lockStatus=1;
            Greenfoot.setWorld(new StartMenuWorld());
            Greenfoot.playSound("MenuClick.wav");

            //Quiting game
        }
        if(level==10&&Greenfoot.mouseClicked(this)&&textNum==19)
        {
            WORLDTEN.gameStatus=1;
            Greenfoot.setWorld(new WORLDTEN());
            Greenfoot.playSound("MenuClick.wav");
            //change this to game complete world
            //continuing game
        }

        //If you die, this is try again
        if(level==1&&Greenfoot.mouseClicked(this)&&textNum==6)
        {
            WorldTutorial.lockStatus=1;
            Greenfoot.setWorld(new WorldTutorial());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==2&&Greenfoot.mouseClicked(this)&&textNum==6)
        {
            WORLDTWO.lockStatus=1;
            Greenfoot.setWorld(new WORLDTWO());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==3&&Greenfoot.mouseClicked(this)&&textNum==6)
        {
            WORLDTHREE.lockStatus=1;
            Greenfoot.setWorld(new WORLDTHREE());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==4&&Greenfoot.mouseClicked(this)&&textNum==6)
        {
            WORLDFOUR.lockStatus=1;
            Greenfoot.setWorld(new WORLDFOUR());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==5&&Greenfoot.mouseClicked(this)&&textNum==6)
        {
            WORLDFIVE.lockStatus=1;
            Greenfoot.setWorld(new WORLDFIVE());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==6&&Greenfoot.mouseClicked(this)&&textNum==6)
        {
            WORLDSIX.lockStatus=1;
            Greenfoot.setWorld(new WORLDSIX());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==7&&Greenfoot.mouseClicked(this)&&textNum==6)
        {
            WORLDSEVEN.lockStatus=1;
            Greenfoot.setWorld(new WORLDSEVEN());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==8&&Greenfoot.mouseClicked(this)&&textNum==6)
        {
            WORLDEIGHT.lockStatus=1;
            Greenfoot.setWorld(new WORLDEIGHT());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==9&&Greenfoot.mouseClicked(this)&&textNum==6)
        {
            WORLDNINE.lockStatus=1;
            Greenfoot.setWorld(new WORLDNINE());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }
        if(level==10&&Greenfoot.mouseClicked(this)&&textNum==6)
        {
            WorldTutorial.lockStatus=1;
            Greenfoot.setWorld(new WORLDTEN());
            Greenfoot.playSound("MenuClick.wav");
            //redoing level
        }

    }
}

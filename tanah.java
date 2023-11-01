import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tanah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tanah extends World
{

    /**
     * Constructor for objects of class tanah.
     * 
     */
    public tanah()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        snake snake = new snake();
        addObject(snake,42,174);
        apel apel = new apel();
        addObject(apel,218,94);
        apel apel2 = new apel();
        addObject(apel2,310,139);
        apel apel3 = new apel();
        addObject(apel3,367,266);
        apel apel4 = new apel();
        addObject(apel4,468,86);
        apel apel5 = new apel();
        addObject(apel5,130,301);
        apel apel6 = new apel();
        addObject(apel6,482,209);
    }
}

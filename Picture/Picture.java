
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square door;
    private Square grass;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        grass = new Square();
        grass.moveVertical(190);
        grass.moveHorizontal(-60);
        grass.changeSize(150);
        grass.changeColor("green");
        grass.makeVisible();
        
        grass = new Square();
        grass.moveVertical(190);
        grass.moveHorizontal(60);
        grass.changeSize(150);
        grass.changeColor("green");
        grass.makeVisible();
        
        grass = new Square();
        grass.moveVertical(190);
        grass.moveHorizontal(90);
        grass.changeSize(150);
        grass.changeColor("green");
        grass.makeVisible();
        
        
        
        wall = new Square();
        wall.moveVertical(50);
        wall.changeSize(180);
        wall.changeColor("magenta");
        wall.makeVisible();
        
        
        

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(70);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(115);
        window.makeVisible();
        
        
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(130);
        window.moveVertical(70);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(130);
        window.moveVertical(115);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(130);
        window.moveVertical(155);
        window.makeVisible();
        
        door=new Square();
        door.changeColor("black");
        door.moveHorizontal(75);
        door.moveVertical(90);
        door.makeVisible();
        
        door=new Square();
        door.changeColor("black");
        door.moveHorizontal(20);
        door.moveVertical(155);
        door.makeVisible();
        
        door=new Square();
        door.changeColor("red");
        door.moveHorizontal(75);
        door.moveVertical(200);
        door.makeVisible();
        
        door=new Square();
        door.changeColor("red");
        door.moveHorizontal(75);
        door.moveVertical(170);
        door.makeVisible();

        roof = new Triangle();
        roof.changeSize(100, 180);
        roof.moveHorizontal(100);
        roof.moveVertical(-15);
        roof.changeColor("blue");
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(195);
        sun.moveVertical(-55);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}

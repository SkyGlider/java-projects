package Drawing;

import java.awt.*;

public class Rectangle {



    //INSTANCE VARIABLES ========================
    private double CentreX;
    private double CentreY;
    private double Width;
    private double Height;
    private Color Colour;
    private double BorderWidth;


    //CONSTRUCTORS
    public Rectangle(){
        setCentreX(0.5);
        setCentreY(0.5);
        setWidth(0.3);
        setHeight(0.2);
        setColour(Color.red);
        setBorderWidth(0.002);
    }

    public Rectangle(double CentreX,double CentreY, double Width, double Height, Color Colour, double BorderWidth){
        setCentreX(CentreX);
        setCentreY(CentreY);
        setWidth(Width);
        setHeight(Height);
        setColour(Colour);
        setBorderWidth(BorderWidth);
    }



    //ACCESSORS =================================
    public double getCentreX() {
        return CentreX;
    }

    public double getCentreY() {
        return CentreY;
    }

    public double getWidth() {
        return Width;
    }

    public double getHeight() {
        return Height;
    }

    public Color getColour() {
        return Colour;
    }

    public double getBorderWidth() {
        return BorderWidth;
    }


    //MUTATORS ==================================

    public void setCentreX(double CentreX) {
        if (CentreX <= 1.0 && CentreX >= 0) {
            this.CentreX = CentreX;
        }
    }

    public void setCentreY(double CentreY) {
        if (CentreY <= 1.0 && CentreY >= 0) {
            this.CentreY = CentreY;
        }
    }

    public void setWidth(double Width) {
        if(Width <= 0.5 && Width >= 0){
            this.Width = Width;
        }

    }

    public void setHeight(double Height) {
        if(Height <= 0.5 && Height >= 0){
            this.Height = Height;
        }
    }

    public void setColour(Color Colour) {
        this.Colour = Colour;
    }

    public void setColour(int r,int g, int b, int a) {
        Color rgbColor = new Color(r,g,b,a);
        this.Colour = rgbColor;
    }

    public void setBorderWidth(double BorderWidth) {
        if(BorderWidth >= 0 && BorderWidth <=0.5) {
            this.BorderWidth = BorderWidth;
        }
    }


    //OTHER METHODS

    public double calculateArea (){
        return Height*Width;
    }

    public double calculatePerimeter (){
        return 2*Height + 2*Width;
    }

    public String toString(){
        return " Height: " + Height + " Width: " + Width + " Coordinates: ("+CentreX + "," + CentreY + ") Border Width: " + BorderWidth + " Color RGB: " + Colour.getRGB();
    }






}


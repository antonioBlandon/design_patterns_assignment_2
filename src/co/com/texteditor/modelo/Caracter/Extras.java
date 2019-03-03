package co.com.texteditor.modelo.Caracter;

import java.awt.Color;

public class Extras {
    public String font;
    public Color color;
    public int size;

    public Extras(String font, Color color, int size) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

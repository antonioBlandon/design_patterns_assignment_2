package co.com.texteditor.modelo.Caracter1;

public class MyCharacter {
    public char representation;
    public Extras extras;

    public MyCharacter(char representation, Extras extras) {
        this.extras = extras;
        this.representation = representation;
    }

    public Extras getExtras() {
        return extras;
    }

    public void setExtras(Extras extras) {
        this.extras = extras;
    }

    public char getRepresentation() {
        return representation;
    }

    public void setRepresentation(char representation) {
        this.representation = representation;
    }
}

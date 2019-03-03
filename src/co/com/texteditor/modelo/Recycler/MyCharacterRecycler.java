package co.com.texteditor.modelo.Recycler;

import co.com.texteditor.modelo.Caracter.MyCharacter;

public class MyCharacterRecycler extends PartRecycler<MyCharacter> {

    private ExtrasRecycler extrasRecycler;

    public MyCharacterRecycler(ExtrasRecycler extrasRecycler) {
        this.extrasRecycler = extrasRecycler;
    }

    @Override
    public MyCharacter lookFor(MyCharacter entry) {
        for(MyCharacter myCharacter : entries) {
            if( (myCharacter.getRepresentation() == entry.getRepresentation())
                    && (myCharacter.getExtras().getSize() == entry.getExtras().getSize())
                    && (myCharacter.getExtras().getFont().equals(entry.getExtras().getFont()))
                    && (myCharacter.getExtras().getColor().equals(entry.getExtras().getColor()))) {
                return myCharacter;
            }
        }
        return addNew(new MyCharacter(entry.getRepresentation(),extrasRecycler.lookFor(entry.getExtras())));
    }
}

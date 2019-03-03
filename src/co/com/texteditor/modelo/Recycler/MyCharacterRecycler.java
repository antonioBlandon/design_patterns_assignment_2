package co.com.texteditor.modelo.Recycler;

import co.com.texteditor.modelo.Caracter1.MyCharacter;

public class MyCharacterRecycler extends PartRecycler<MyCharacter> {

    @Override
    public MyCharacter lookFor(MyCharacter entry) {
        for(MyCharacter myCharacter : entries) {
            if(myCharacter.equals(entry)) {
                return myCharacter;
            }
        }
        return addNew(entry);
    }
}

package co.com.texteditor.modelo.Recycler;

import co.com.texteditor.modelo.Caracter.MyCharacter;

public class Recycler implements IPartRecyclerAdd<MyCharacter> {

    private MyCharacterRecycler myCharacterRecycler;

    public Recycler() {
        myCharacterRecycler = new MyCharacterRecycler(new ExtrasRecycler(new FontRecycler()));
    }

    @Override
    public MyCharacter addNew(MyCharacter entry) {
        return myCharacterRecycler.lookFor(entry);
    }

}

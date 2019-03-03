package co.com.texteditor.modelo.Recycler;

import co.com.texteditor.modelo.Caracter1.MyCharacter;

public class Recycler implements IPartRecyclerAdd<MyCharacter> {
    public FontRecycler fontRecycler;
    public ExtrasRecycler extrasRecycler;
    public MyCharacterRecycler myCharacterRecycler;

    public Recycler() {
        fontRecycler = new FontRecycler();
        myCharacterRecycler = new MyCharacterRecycler();
        extrasRecycler = new ExtrasRecycler();
    }

    @Override
    public MyCharacter addNew(MyCharacter entry) {
        entry = myCharacterRecycler.lookFor(entry);
        entry.getExtras().setFont(fontRecycler.lookFor(entry.getExtras().getFont()));
        entry.setExtras(extrasRecycler.lookFor(entry.getExtras()));
        return entry;
    }
}

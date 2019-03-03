package co.com.texteditor.modelo.Recycler;

import co.com.texteditor.modelo.Caracter.Extras;

public class ExtrasRecycler extends PartRecycler<Extras> {

    private FontRecycler fontRecycler;

    public ExtrasRecycler(FontRecycler fontRecycler) {
        this.fontRecycler = fontRecycler;
    }

    @Override
    public Extras lookFor(Extras entry) {
        for(Extras extras : entries) {
            if( (extras.getSize() == entry.getSize())
                    && (extras.getFont().equals(entry.getFont()))
                    && (extras.getColor().equals(entry.getColor()))) {
                return extras;
            }
        }
        return addNew(new Extras(fontRecycler.lookFor(entry.getFont()),entry.getColor(),entry.getSize()));
    }
}

package co.com.texteditor.modelo.Recycler;

import co.com.texteditor.modelo.Caracter1.Extras;

public class ExtrasRecycler extends PartRecycler<Extras> {
    @Override
    public Extras lookFor(Extras entry) {
        for(Extras extras : entries) {
            if(extras.equals(entry)) {
                return extras;
            }
        }
        entries.add(entry);
        return entry;
    }
}

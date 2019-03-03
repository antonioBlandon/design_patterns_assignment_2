package co.com.texteditor.modelo.Recycler;

import java.util.ArrayList;
import java.util.List;

public abstract class PartRecycler<T> implements IPartRecyclerAdd<T>, IPartRecyclerLook<T>{
    public List<T> entries;

    public PartRecycler() {
        entries = new ArrayList<>();
    }

    @Override
    public T addNew(T entry) {
        entries.add(entry);
        return entry;
    }
}

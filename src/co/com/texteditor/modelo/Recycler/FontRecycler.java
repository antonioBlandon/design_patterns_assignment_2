package co.com.texteditor.modelo.Recycler;

public class FontRecycler extends PartRecycler<String> {
    @Override
    public String lookFor(String entry) {
        for(String fonts : entries) {
            if(fonts.equals(entry)) {
                return fonts;
            }
        }
        entries.add(entry);
        return entry;
    }
}

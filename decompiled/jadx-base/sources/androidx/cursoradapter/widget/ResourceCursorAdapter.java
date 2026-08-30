package androidx.cursoradapter.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResourceCursorAdapter extends androidx.cursoradapter.widget.CursorAdapter {
    private int mDropDownLayout;
    private android.view.LayoutInflater mInflater;
    private int mLayout;

    @java.lang.Deprecated
    public ResourceCursorAdapter(android.content.Context context, int i, android.database.Cursor cursor) {
        super(context, cursor);
        this.mDropDownLayout = i;
        this.mLayout = i;
        this.mInflater = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
    }

    @java.lang.Deprecated
    public ResourceCursorAdapter(android.content.Context context, int i, android.database.Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.mDropDownLayout = i;
        this.mLayout = i;
        this.mInflater = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
    }

    public ResourceCursorAdapter(android.content.Context context, int i, android.database.Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.mDropDownLayout = i;
        this.mLayout = i;
        this.mInflater = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
        return this.mInflater.inflate(this.mLayout, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public android.view.View newDropDownView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
        return this.mInflater.inflate(this.mDropDownLayout, viewGroup, false);
    }

    public void setViewResource(int i) {
        this.mLayout = i;
    }

    public void setDropDownViewResource(int i) {
        this.mDropDownLayout = i;
    }
}

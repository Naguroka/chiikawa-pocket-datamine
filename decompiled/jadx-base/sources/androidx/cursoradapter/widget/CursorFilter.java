package androidx.cursoradapter.widget;

/* JADX INFO: loaded from: classes.dex */
class CursorFilter extends android.widget.Filter {
    androidx.cursoradapter.widget.CursorFilter.CursorFilterClient mClient;

    interface CursorFilterClient {
        void changeCursor(android.database.Cursor cursor);

        java.lang.CharSequence convertToString(android.database.Cursor cursor);

        android.database.Cursor getCursor();

        android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence charSequence);
    }

    CursorFilter(androidx.cursoradapter.widget.CursorFilter.CursorFilterClient cursorFilterClient) {
        this.mClient = cursorFilterClient;
    }

    @Override // android.widget.Filter
    public java.lang.CharSequence convertResultToString(java.lang.Object obj) {
        return this.mClient.convertToString((android.database.Cursor) obj);
    }

    @Override // android.widget.Filter
    protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        android.database.Cursor cursorRunQueryOnBackgroundThread = this.mClient.runQueryOnBackgroundThread(charSequence);
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        if (cursorRunQueryOnBackgroundThread != null) {
            filterResults.count = cursorRunQueryOnBackgroundThread.getCount();
            filterResults.values = cursorRunQueryOnBackgroundThread;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        android.database.Cursor cursor = this.mClient.getCursor();
        if (filterResults.values == null || filterResults.values == cursor) {
            return;
        }
        this.mClient.changeCursor((android.database.Cursor) filterResults.values);
    }
}

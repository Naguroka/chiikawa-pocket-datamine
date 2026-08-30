package com.google.android.gms.common.sqlite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class CursorWrapper extends android.database.CursorWrapper implements android.database.CrossProcessCursor {
    private android.database.AbstractWindowedCursor zza;

    public CursorWrapper(android.database.Cursor cursor) {
        super(cursor);
        for (int i = 0; i < 10 && (cursor instanceof android.database.CursorWrapper); i++) {
            cursor = ((android.database.CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof android.database.AbstractWindowedCursor)) {
            throw new java.lang.IllegalArgumentException("Unknown type: ".concat(java.lang.String.valueOf(cursor.getClass().getName())));
        }
        this.zza = (android.database.AbstractWindowedCursor) cursor;
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        this.zza.fillWindow(i, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    public android.database.CursorWindow getWindow() {
        return this.zza.getWindow();
    }

    @Override // android.database.CursorWrapper
    public final /* synthetic */ android.database.Cursor getWrappedCursor() {
        return this.zza;
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i, int i2) {
        return this.zza.onMove(i, i2);
    }

    public void setWindow(android.database.CursorWindow cursorWindow) {
        this.zza.setWindow(cursorWindow);
    }
}

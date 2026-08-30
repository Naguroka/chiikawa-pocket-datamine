package com.bytedance.sdk.openadsdk.multipro.aidl;

/* JADX INFO: loaded from: classes4.dex */
public class bX implements android.database.Cursor {
    java.lang.String[] IL;
    int bX = 0;
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> bg;

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i, android.database.CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) throws java.lang.IllegalArgumentException {
        return 0;
    }

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getType(int i) {
        return 0;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    public bX(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        if (map == null || map.keySet() == null) {
            this.bg = new java.util.HashMap();
            return;
        }
        this.bg = map;
        try {
            this.IL = (java.lang.String[]) map.keySet().toArray(new java.lang.String[map.keySet().size()]);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.database.Cursor
    public int getCount() {
        try {
            java.lang.String[] strArr = this.IL;
            if (strArr != null && strArr.length != 0) {
                return this.bg.get(strArr[0]).size();
            }
            return 0;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.bX;
    }

    @Override // android.database.Cursor
    public boolean move(int i) {
        if (this.bX + i >= getCount()) {
            return false;
        }
        this.bX += i;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i) {
        if (i >= getCount()) {
            return false;
        }
        this.bX = i;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.bX = 0;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.bX = this.bg.get(this.IL[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        if (this.bX + 1 >= getCount()) {
            return false;
        }
        this.bX++;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i = this.bX;
        if (i - 1 < 0) {
            return false;
        }
        this.bX = i - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.bX == 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.bX == getCount() - 1;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        java.lang.String[] strArr = this.IL;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int i = 0;
        while (true) {
            java.lang.String[] strArr2 = this.IL;
            if (i >= strArr2.length) {
                return 0;
            }
            if (str.equals(strArr2[i])) {
                return i;
            }
            i++;
        }
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int i) {
        if (i < 0) {
            return "";
        }
        java.lang.String[] strArr = this.IL;
        return i < strArr.length ? strArr[i] : "";
    }

    @Override // android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.IL;
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        java.lang.String[] strArr = this.IL;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public java.lang.String getString(int i) {
        return (i < 0 || i >= getColumnCount()) ? "" : this.bg.get(this.IL[i]).get(getPosition());
    }

    @Override // android.database.Cursor
    public short getShort(int i) {
        try {
            return java.lang.Short.parseShort(getString(i));
        } catch (java.lang.Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public int getInt(int i) {
        try {
            return java.lang.Integer.parseInt(getString(i));
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public long getLong(int i) {
        try {
            return java.lang.Long.parseLong(getString(i));
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public float getFloat(int i) {
        try {
            return java.lang.Float.parseFloat(getString(i));
        } catch (java.lang.Exception unused) {
            return 0.0f;
        }
    }

    @Override // android.database.Cursor
    public double getDouble(int i) {
        try {
            return java.lang.Double.parseDouble(getString(i));
        } catch (java.lang.Exception unused) {
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public boolean isNull(int i) {
        return getString(i) == null;
    }
}

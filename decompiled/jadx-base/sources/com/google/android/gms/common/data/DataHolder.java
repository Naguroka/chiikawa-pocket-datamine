package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class DataHolder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.io.Closeable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.data.DataHolder> CREATOR = new com.google.android.gms.common.data.zae();
    private static final com.google.android.gms.common.data.DataHolder.Builder zaf = new com.google.android.gms.common.data.zab(new java.lang.String[0], null);
    final int zaa;
    android.os.Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    private final java.lang.String[] zag;
    private final android.database.CursorWindow[] zah;
    private final int zai;
    private final android.os.Bundle zaj;
    private boolean zak;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static class Builder {
        private final java.lang.String[] zaa;
        private final java.util.ArrayList zab = new java.util.ArrayList();
        private final java.util.HashMap zac = new java.util.HashMap();

        /* synthetic */ Builder(java.lang.String[] strArr, java.lang.String str, com.google.android.gms.common.data.zad zadVar) {
            this.zaa = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public com.google.android.gms.common.data.DataHolder build(int i) {
            return new com.google.android.gms.common.data.DataHolder(this, i);
        }

        public com.google.android.gms.common.data.DataHolder.Builder withRow(android.content.ContentValues contentValues) {
            com.google.android.gms.common.internal.Asserts.checkNotNull(contentValues);
            java.util.HashMap map = new java.util.HashMap(contentValues.size());
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        public com.google.android.gms.common.data.DataHolder.Builder zaa(java.util.HashMap map) {
            com.google.android.gms.common.internal.Asserts.checkNotNull(map);
            this.zab.add(map);
            return this;
        }

        public com.google.android.gms.common.data.DataHolder build(int i, android.os.Bundle bundle) {
            return new com.google.android.gms.common.data.DataHolder(this, i, bundle);
        }
    }

    DataHolder(int i, java.lang.String[] strArr, android.database.CursorWindow[] cursorWindowArr, int i2, android.os.Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i2;
        this.zaj = bundle;
    }

    public DataHolder(java.lang.String[] strArr, android.database.CursorWindow[] cursorWindowArr, int i, android.os.Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        this.zah = (android.database.CursorWindow[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i;
        this.zaj = bundle;
        zad();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.android.gms.common.data.DataHolder.Builder builder(java.lang.String[] strArr) {
        return new com.google.android.gms.common.data.DataHolder.Builder(strArr, null, 0 == true ? 1 : 0);
    }

    public static com.google.android.gms.common.data.DataHolder empty(int i) {
        return new com.google.android.gms.common.data.DataHolder(zaf, i, (android.os.Bundle) null);
    }

    private final void zae(java.lang.String str, int i) {
        android.os.Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new java.lang.IllegalArgumentException("No such column: ".concat(java.lang.String.valueOf(str)));
        }
        if (isClosed()) {
            throw new java.lang.IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.zad) {
            throw new android.database.CursorIndexOutOfBoundsException(i, this.zad);
        }
    }

    private static android.database.CursorWindow[] zaf(com.google.android.gms.common.data.DataHolder.Builder builder, int i) {
        if (builder.zaa.length == 0) {
            return new android.database.CursorWindow[0];
        }
        java.util.ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        android.database.CursorWindow cursorWindow = new android.database.CursorWindow(false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    android.util.Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i2 + ")");
                    cursorWindow = new android.database.CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        android.util.Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (android.database.CursorWindow[]) arrayList2.toArray(new android.database.CursorWindow[arrayList2.size()]);
                    }
                }
                java.util.Map map = (java.util.Map) arrayList.get(i2);
                int i3 = 0;
                boolean zPutDouble = true;
                while (true) {
                    if (i3 >= builder.zaa.length) {
                        z = zPutDouble ? false : true;
                        i2++;
                    } else if (zPutDouble) {
                        java.lang.String str = builder.zaa[i3];
                        java.lang.Object obj = map.get(str);
                        if (obj == null) {
                            zPutDouble = cursorWindow.putNull(i2, i3);
                        } else if (obj instanceof java.lang.String) {
                            zPutDouble = cursorWindow.putString((java.lang.String) obj, i2, i3);
                        } else if (obj instanceof java.lang.Long) {
                            zPutDouble = cursorWindow.putLong(((java.lang.Long) obj).longValue(), i2, i3);
                        } else if (obj instanceof java.lang.Integer) {
                            zPutDouble = cursorWindow.putLong(((java.lang.Integer) obj).intValue(), i2, i3);
                        } else if (obj instanceof java.lang.Boolean) {
                            zPutDouble = cursorWindow.putLong(true != ((java.lang.Boolean) obj).booleanValue() ? 0L : 1L, i2, i3);
                        } else if (obj instanceof byte[]) {
                            zPutDouble = cursorWindow.putBlob((byte[]) obj, i2, i3);
                        } else if (obj instanceof java.lang.Double) {
                            zPutDouble = cursorWindow.putDouble(((java.lang.Double) obj).doubleValue(), i2, i3);
                        } else {
                            if (!(obj instanceof java.lang.Float)) {
                                throw new java.lang.IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                            }
                            zPutDouble = cursorWindow.putDouble(((java.lang.Float) obj).floatValue(), i2, i3);
                        }
                        i3++;
                    }
                    if (z) {
                        throw new com.google.android.gms.common.data.zac("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    android.util.Log.d("DataHolder", "Couldn't populate window data for row " + i2 + " - allocating new window.");
                    cursorWindow.freeLastRow();
                    cursorWindow = new android.database.CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    i2--;
                    i2++;
                }
            } catch (java.lang.RuntimeException e) {
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((android.database.CursorWindow) arrayList2.get(i4)).close();
                }
                throw e;
            }
        }
        return (android.database.CursorWindow[]) arrayList2.toArray(new android.database.CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.zae) {
                this.zae = true;
                int i = 0;
                while (true) {
                    android.database.CursorWindow[] cursorWindowArr = this.zah;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                android.util.Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public boolean getBoolean(java.lang.String str, int i, int i2) {
        zae(str, i);
        return java.lang.Long.valueOf(this.zah[i2].getLong(i, this.zab.getInt(str))).longValue() == 1;
    }

    public byte[] getByteArray(java.lang.String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getBlob(i, this.zab.getInt(str));
    }

    public int getCount() {
        return this.zad;
    }

    public int getInteger(java.lang.String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getInt(i, this.zab.getInt(str));
    }

    public long getLong(java.lang.String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getLong(i, this.zab.getInt(str));
    }

    public android.os.Bundle getMetadata() {
        return this.zaj;
    }

    public int getStatusCode() {
        return this.zai;
    }

    public java.lang.String getString(java.lang.String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getString(i, this.zab.getInt(str));
    }

    public int getWindowIndex(int i) {
        int length;
        int i2 = 0;
        com.google.android.gms.common.internal.Preconditions.checkState(i >= 0 && i < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public boolean hasColumn(java.lang.String str) {
        return this.zab.containsKey(str);
    }

    public boolean hasNull(java.lang.String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].isNull(i, this.zab.getInt(str));
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.zae;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String[] strArr = this.zag;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final double zaa(java.lang.String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getDouble(i, this.zab.getInt(str));
    }

    public final float zab(java.lang.String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getFloat(i, this.zab.getInt(str));
    }

    public final void zac(java.lang.String str, int i, int i2, android.database.CharArrayBuffer charArrayBuffer) {
        zae(str, i);
        this.zah[i2].copyStringToBuffer(i, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new android.os.Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            java.lang.String[] strArr = this.zag;
            if (i2 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i2], i2);
            i2++;
        }
        this.zac = new int[this.zah.length];
        int numRows = 0;
        while (true) {
            android.database.CursorWindow[] cursorWindowArr = this.zah;
            if (i >= cursorWindowArr.length) {
                this.zad = numRows;
                return;
            }
            this.zac[i] = numRows;
            numRows += this.zah[i].getNumRows() - (numRows - cursorWindowArr[i].getStartPosition());
            i++;
        }
    }

    public DataHolder(android.database.Cursor cursor, int i, android.os.Bundle bundle) {
        int startPosition;
        com.google.android.gms.common.sqlite.CursorWrapper cursorWrapper = new com.google.android.gms.common.sqlite.CursorWrapper(cursor);
        java.lang.String[] columnNames = cursorWrapper.getColumnNames();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            int count = cursorWrapper.getCount();
            android.database.CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count && cursorWrapper.moveToPosition(startPosition)) {
                android.database.CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new android.database.CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            this(columnNames, (android.database.CursorWindow[]) arrayList.toArray(new android.database.CursorWindow[arrayList.size()]), i, bundle);
        } catch (java.lang.Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private DataHolder(com.google.android.gms.common.data.DataHolder.Builder builder, int i, android.os.Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i, (android.os.Bundle) null);
    }
}

package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DataBufferRef {
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;
    protected int mDataRow;
    private int zaa;

    public DataBufferRef(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        this.mDataHolder = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataHolder);
        zaa(i);
    }

    protected void copyToBuffer(java.lang.String str, android.database.CharArrayBuffer charArrayBuffer) {
        this.mDataHolder.zac(str, this.mDataRow, this.zaa, charArrayBuffer);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.common.data.DataBufferRef) {
            com.google.android.gms.common.data.DataBufferRef dataBufferRef = (com.google.android.gms.common.data.DataBufferRef) obj;
            if (com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(dataBufferRef.mDataRow), java.lang.Integer.valueOf(this.mDataRow)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(dataBufferRef.zaa), java.lang.Integer.valueOf(this.zaa)) && dataBufferRef.mDataHolder == this.mDataHolder) {
                return true;
            }
        }
        return false;
    }

    protected boolean getBoolean(java.lang.String str) {
        return this.mDataHolder.getBoolean(str, this.mDataRow, this.zaa);
    }

    protected byte[] getByteArray(java.lang.String str) {
        return this.mDataHolder.getByteArray(str, this.mDataRow, this.zaa);
    }

    protected int getDataRow() {
        return this.mDataRow;
    }

    protected double getDouble(java.lang.String str) {
        return this.mDataHolder.zaa(str, this.mDataRow, this.zaa);
    }

    protected float getFloat(java.lang.String str) {
        return this.mDataHolder.zab(str, this.mDataRow, this.zaa);
    }

    protected int getInteger(java.lang.String str) {
        return this.mDataHolder.getInteger(str, this.mDataRow, this.zaa);
    }

    protected long getLong(java.lang.String str) {
        return this.mDataHolder.getLong(str, this.mDataRow, this.zaa);
    }

    protected java.lang.String getString(java.lang.String str) {
        return this.mDataHolder.getString(str, this.mDataRow, this.zaa);
    }

    public boolean hasColumn(java.lang.String str) {
        return this.mDataHolder.hasColumn(str);
    }

    protected boolean hasNull(java.lang.String str) {
        return this.mDataHolder.hasNull(str, this.mDataRow, this.zaa);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.mDataRow), java.lang.Integer.valueOf(this.zaa), this.mDataHolder);
    }

    public boolean isDataValid() {
        return !this.mDataHolder.isClosed();
    }

    protected android.net.Uri parseUri(java.lang.String str) {
        java.lang.String string = this.mDataHolder.getString(str, this.mDataRow, this.zaa);
        if (string == null) {
            return null;
        }
        return android.net.Uri.parse(string);
    }

    protected final void zaa(int i) {
        boolean z = false;
        if (i >= 0 && i < this.mDataHolder.getCount()) {
            z = true;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(z);
        this.mDataRow = i;
        this.zaa = this.mDataHolder.getWindowIndex(i);
    }
}

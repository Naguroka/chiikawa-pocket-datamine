package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EntityBuffer<T> extends com.google.android.gms.common.data.AbstractDataBuffer<T> {
    private boolean zaa;
    private java.util.ArrayList zab;

    protected EntityBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            if (!this.zaa) {
                int count = ((com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder)).getCount();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.zab = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    java.lang.String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    java.lang.String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    for (int i = 1; i < count; i++) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i);
                        java.lang.String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i, windowIndex);
                        if (string2 == null) {
                            throw new java.lang.NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i + ", for window: " + windowIndex);
                        }
                        if (!string2.equals(string)) {
                            this.zab.add(java.lang.Integer.valueOf(i));
                            string = string2;
                        }
                    }
                }
                this.zaa = true;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final T get(int i) {
        int iIntValue;
        int iIntValue2;
        zab();
        int iZaa = zaa(i);
        int i2 = 0;
        if (i >= 0 && i != this.zab.size()) {
            if (i == this.zab.size() - 1) {
                iIntValue = ((com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder)).getCount();
                iIntValue2 = ((java.lang.Integer) this.zab.get(i)).intValue();
            } else {
                iIntValue = ((java.lang.Integer) this.zab.get(i + 1)).intValue();
                iIntValue2 = ((java.lang.Integer) this.zab.get(i)).intValue();
            }
            int i3 = iIntValue - iIntValue2;
            if (i3 == 1) {
                int iZaa2 = zaa(i);
                int windowIndex = ((com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(iZaa2);
                java.lang.String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, iZaa2, windowIndex) != null) {
                    i2 = 1;
                }
            } else {
                i2 = i3;
            }
        }
        return getEntry(iZaa, i2);
    }

    protected java.lang.String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        zab();
        return this.zab.size();
    }

    protected abstract T getEntry(int i, int i2);

    protected abstract java.lang.String getPrimaryDataMarkerColumn();

    final int zaa(int i) {
        if (i >= 0 && i < this.zab.size()) {
            return ((java.lang.Integer) this.zab.get(i)).intValue();
        }
        throw new java.lang.IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }
}

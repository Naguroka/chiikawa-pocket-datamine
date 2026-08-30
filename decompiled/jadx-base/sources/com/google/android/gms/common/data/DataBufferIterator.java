package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class DataBufferIterator<T> implements java.util.Iterator<T> {
    protected final com.google.android.gms.common.data.DataBuffer zaa;
    protected int zab = -1;

    public DataBufferIterator(com.google.android.gms.common.data.DataBuffer dataBuffer) {
        this.zaa = (com.google.android.gms.common.data.DataBuffer) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zab < this.zaa.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (hasNext()) {
            com.google.android.gms.common.data.DataBuffer dataBuffer = this.zaa;
            int i = this.zab + 1;
            this.zab = i;
            return dataBuffer.get(i);
        }
        throw new java.util.NoSuchElementException("Cannot advance the iterator beyond " + this.zab);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

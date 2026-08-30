package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class SingleRefDataBufferIterator<T> extends com.google.android.gms.common.data.DataBufferIterator<T> {
    private java.lang.Object zac;

    public SingleRefDataBufferIterator(com.google.android.gms.common.data.DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("Cannot advance the iterator beyond " + this.zab);
        }
        int i = this.zab + 1;
        this.zab = i;
        if (i == 0) {
            java.lang.Object objCheckNotNull = com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = objCheckNotNull;
            if (!(objCheckNotNull instanceof com.google.android.gms.common.data.DataBufferRef)) {
                throw new java.lang.IllegalStateException("DataBuffer reference of type " + java.lang.String.valueOf(objCheckNotNull.getClass()) + " is not movable");
            }
        } else {
            ((com.google.android.gms.common.data.DataBufferRef) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}

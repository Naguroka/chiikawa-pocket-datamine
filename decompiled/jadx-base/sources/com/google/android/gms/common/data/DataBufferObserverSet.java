package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class DataBufferObserverSet implements com.google.android.gms.common.data.DataBufferObserver, com.google.android.gms.common.data.DataBufferObserver.Observable {
    private final java.util.HashSet zaa = new java.util.HashSet();

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void addObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver) {
        this.zaa.add(dataBufferObserver);
    }

    public void clear() {
        this.zaa.clear();
    }

    public boolean hasObservers() {
        return !this.zaa.isEmpty();
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataChanged() {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataChanged();
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeChanged(int i, int i2) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeChanged(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeInserted(int i, int i2) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeInserted(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeMoved(int i, int i2, int i3) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeMoved(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeRemoved(int i, int i2) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeRemoved(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void removeObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver) {
        this.zaa.remove(dataBufferObserver);
    }
}

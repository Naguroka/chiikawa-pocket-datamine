package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface DataBufferObserver {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public interface Observable {
        void addObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver);

        void removeObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i, int i2);

    void onDataRangeInserted(int i, int i2);

    void onDataRangeMoved(int i, int i2, int i3);

    void onDataRangeRemoved(int i, int i2);
}

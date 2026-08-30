package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzo extends com.google.android.gms.common.data.DataBufferRef {
    public zzo(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    protected final int zzp(java.lang.String str, int i) {
        return (!hasColumn(str) || hasNull(str)) ? i : getInteger(str);
    }

    protected final java.lang.String zzq(java.lang.String str, java.lang.String str2) {
        if (!hasColumn(str) || hasNull(str)) {
            return null;
        }
        return getString(str);
    }
}

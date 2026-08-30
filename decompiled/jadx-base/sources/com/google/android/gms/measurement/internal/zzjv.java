package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public enum zzjv {
    STORAGE(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE, com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE),
    DMA(com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA);

    private final com.google.android.gms.measurement.internal.zzjw[] zzd;

    zzjv(com.google.android.gms.measurement.internal.zzjw... zzjwVarArr) {
        this.zzd = zzjwVarArr;
    }

    public final com.google.android.gms.measurement.internal.zzjw[] zzb() {
        return this.zzd;
    }
}

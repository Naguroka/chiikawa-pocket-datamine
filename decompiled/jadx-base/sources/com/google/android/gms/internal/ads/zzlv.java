package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzlv {
    private final com.google.android.gms.internal.ads.zzx zza;
    private final android.util.SparseArray zzb;

    public zzlv(com.google.android.gms.internal.ads.zzx zzxVar, android.util.SparseArray sparseArray) {
        this.zza = zzxVar;
        android.util.SparseArray sparseArray2 = new android.util.SparseArray(zzxVar.zzb());
        for (int i = 0; i < zzxVar.zzb(); i++) {
            int iZza = zzxVar.zza(i);
            com.google.android.gms.internal.ads.zzlu zzluVar = (com.google.android.gms.internal.ads.zzlu) sparseArray.get(iZza);
            zzluVar.getClass();
            sparseArray2.append(iZza, zzluVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final com.google.android.gms.internal.ads.zzlu zzc(int i) {
        com.google.android.gms.internal.ads.zzlu zzluVar = (com.google.android.gms.internal.ads.zzlu) this.zzb.get(i);
        zzluVar.getClass();
        return zzluVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}

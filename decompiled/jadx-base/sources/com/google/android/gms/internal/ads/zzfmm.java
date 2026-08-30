package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfmm {
    private final com.google.android.gms.internal.ads.zzfln zza;
    private final java.util.ArrayList zzb;

    public zzfmm(com.google.android.gms.internal.ads.zzfln zzflnVar, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.zzb = arrayList;
        this.zza = zzflnVar;
        arrayList.add(str);
    }

    public final com.google.android.gms.internal.ads.zzfln zza() {
        return this.zza;
    }

    public final java.util.ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(java.lang.String str) {
        this.zzb.add(str);
    }
}

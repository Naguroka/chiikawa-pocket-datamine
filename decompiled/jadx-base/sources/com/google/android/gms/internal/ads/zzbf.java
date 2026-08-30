package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbf {
    private final com.google.android.gms.internal.ads.zzv zza = new com.google.android.gms.internal.ads.zzv();

    public final com.google.android.gms.internal.ads.zzbf zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzbf zzb(com.google.android.gms.internal.ads.zzbg zzbgVar) {
        com.google.android.gms.internal.ads.zzx zzxVar = zzbgVar.zza;
        for (int i = 0; i < zzxVar.zzb(); i++) {
            this.zza.zza(zzxVar.zza(i));
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzbf zzc(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.zza.zza(iArr[i]);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzbf zzd(int i, boolean z) {
        if (z) {
            this.zza.zza(i);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzbg zze() {
        return new com.google.android.gms.internal.ads.zzbg(this.zza.zzb(), null);
    }
}

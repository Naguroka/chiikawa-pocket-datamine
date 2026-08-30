package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzxf implements java.lang.Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxf(com.google.android.gms.internal.ads.zzab zzabVar, int i) {
        this.zza = 1 == (zzabVar.zze & 1);
        this.zzb = com.google.android.gms.internal.ads.zzlk.zza(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.internal.ads.zzxf zzxfVar) {
        return com.google.android.gms.internal.ads.zzfxc.zzj().zzd(this.zzb, zzxfVar.zzb).zzd(this.zza, zzxfVar.zza).zza();
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbia {
    private final com.google.android.gms.ads.formats.zzg zza;
    private final com.google.android.gms.ads.formats.zzf zzb;
    private com.google.android.gms.internal.ads.zzbgr zzc;

    public zzbia(com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized com.google.android.gms.internal.ads.zzbgr zzf(com.google.android.gms.internal.ads.zzbgq zzbgqVar) {
        com.google.android.gms.internal.ads.zzbgr zzbgrVar = this.zzc;
        if (zzbgrVar != null) {
            return zzbgrVar;
        }
        com.google.android.gms.internal.ads.zzbgr zzbgrVar2 = new com.google.android.gms.internal.ads.zzbgr(zzbgqVar);
        this.zzc = zzbgrVar2;
        return zzbgrVar2;
    }

    public final com.google.android.gms.internal.ads.zzbha zzc() {
        com.google.android.gms.internal.ads.zzbhz zzbhzVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzbhx(this, zzbhzVar);
    }

    public final com.google.android.gms.internal.ads.zzbhd zzd() {
        return new com.google.android.gms.internal.ads.zzbhy(this, null);
    }
}

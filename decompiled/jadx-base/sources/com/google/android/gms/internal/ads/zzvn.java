package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzvn implements com.google.android.gms.internal.ads.zzuf {
    private final com.google.android.gms.internal.ads.zzfx zza;
    private int zzb;
    private final com.google.android.gms.internal.ads.zzvm zzc;
    private final com.google.android.gms.internal.ads.zzyo zzd;

    public zzvn(com.google.android.gms.internal.ads.zzfx zzfxVar, com.google.android.gms.internal.ads.zzvm zzvmVar) {
        com.google.android.gms.internal.ads.zzyo zzyoVar = new com.google.android.gms.internal.ads.zzyo(-1);
        this.zza = zzfxVar;
        this.zzc = zzvmVar;
        this.zzd = zzyoVar;
        this.zzb = 1048576;
    }

    public final com.google.android.gms.internal.ads.zzvn zza(int i) {
        this.zzb = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzvp zzb(com.google.android.gms.internal.ads.zzar zzarVar) {
        zzarVar.zzb.getClass();
        return new com.google.android.gms.internal.ads.zzvp(zzarVar, this.zza, this.zzc, com.google.android.gms.internal.ads.zzrf.zza, this.zzd, this.zzb, false, null, null);
    }
}

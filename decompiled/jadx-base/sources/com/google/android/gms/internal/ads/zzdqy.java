package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdqy implements com.google.android.gms.internal.ads.zzfgo {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzbbj zzb;

    zzdqy(com.google.android.gms.internal.ads.zzbbj zzbbjVar, java.util.Map map) {
        this.zza = map;
        this.zzb = zzbbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
        if (this.zza.containsKey(zzfghVar)) {
            this.zzb.zzc(((com.google.android.gms.internal.ads.zzdqx) this.zza.get(zzfghVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str, java.lang.Throwable th) {
        if (this.zza.containsKey(zzfghVar)) {
            this.zzb.zzc(((com.google.android.gms.internal.ads.zzdqx) this.zza.get(zzfghVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
        if (this.zza.containsKey(zzfghVar)) {
            this.zzb.zzc(((com.google.android.gms.internal.ads.zzdqx) this.zza.get(zzfghVar)).zza);
        }
    }
}

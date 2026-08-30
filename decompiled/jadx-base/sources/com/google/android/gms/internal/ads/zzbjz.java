package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbjz implements com.google.android.gms.ads.internal.overlay.zzaa {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    final /* synthetic */ java.util.Map zzd;
    final /* synthetic */ java.util.Map zze;

    zzbjz(com.google.android.gms.internal.ads.zzbkb zzbkbVar, boolean z, com.google.android.gms.ads.internal.client.zza zzaVar, java.util.Map map, java.util.Map map2) {
        this.zzb = z;
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z) {
        if (this.zza) {
            return;
        }
        if (z && this.zzb) {
            ((com.google.android.gms.internal.ads.zzdds) this.zzc).zzdd();
        }
        this.zza = true;
        this.zzd.put((java.lang.String) this.zze.get("event_id"), java.lang.Boolean.valueOf(z));
        ((com.google.android.gms.internal.ads.zzbmk) this.zzc).zzd("openIntentAsync", this.zzd);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i) {
    }
}

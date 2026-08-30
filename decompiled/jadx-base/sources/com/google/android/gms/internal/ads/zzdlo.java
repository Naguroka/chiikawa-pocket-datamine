package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdlo implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zza;

    zzdlo(com.google.android.gms.internal.ads.zzdlp zzdlpVar, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zza = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        if (zzcexVar == null) {
            this.zza.zzd(new com.google.android.gms.internal.ads.zzegu(1, "Missing webview from video view future."));
            return;
        }
        final com.google.android.gms.internal.ads.zzcab zzcabVar = this.zza;
        zzcexVar.zzag("/video", new com.google.android.gms.internal.ads.zzccq(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj2) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("mediaUrl", (java.lang.String) obj2);
                zzcabVar.zzc(bundle);
            }
        }));
        zzcexVar.zzaa();
    }
}

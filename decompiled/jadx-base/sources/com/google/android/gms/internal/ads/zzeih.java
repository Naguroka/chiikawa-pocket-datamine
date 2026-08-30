package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeih implements com.google.android.gms.internal.ads.zzcxc {
    boolean zza = false;
    final /* synthetic */ com.google.android.gms.internal.ads.zzecz zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zzc;

    zzeih(com.google.android.gms.internal.ads.zzeii zzeiiVar, com.google.android.gms.internal.ads.zzecz zzeczVar, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zzb = zzeczVar;
        this.zzc = zzcabVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfu)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new com.google.android.gms.internal.ads.zzeda(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, com.google.android.gms.internal.ads.zzeii.zze(this.zzb.zza, i), com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzc(int i, java.lang.String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = com.google.android.gms.internal.ads.zzeii.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}

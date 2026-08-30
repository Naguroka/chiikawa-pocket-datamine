package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdkf implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdkg zza;

    zzdkf(com.google.android.gms.internal.ads.zzdkg zzdkgVar) {
        this.zza = zzdkgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(java.util.List list) {
        try {
            com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) list.get(0);
            if (zzcexVar != null) {
                this.zza.zzb(zzcexVar);
            }
        } catch (java.lang.ClassCastException | java.lang.IndexOutOfBoundsException e) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfm)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "omid native display exp");
            }
        }
    }
}

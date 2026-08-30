package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdhz implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ android.view.View zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdia zzb;

    zzdhz(com.google.android.gms.internal.ads.zzdia zzdiaVar, android.view.View view) {
        this.zza = view;
        this.zzb = zzdiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        this.zzb.zzad(this.zza, (com.google.android.gms.internal.ads.zzecr) obj);
    }
}

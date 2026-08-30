package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdhy implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ java.lang.String zza = "Google";
    final /* synthetic */ com.google.android.gms.internal.ads.zzdia zzb;

    zzdhy(com.google.android.gms.internal.ads.zzdia zzdiaVar, java.lang.String str, boolean z) {
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
        this.zzb.zze.zzT((com.google.android.gms.internal.ads.zzcex) obj);
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzb;
        com.google.android.gms.internal.ads.zzcab zzcabVarZzp = zzdiaVar.zze.zzp();
        com.google.android.gms.internal.ads.zzecr zzecrVarZzf = zzdiaVar.zzf(this.zza, true);
        if (zzecrVarZzf != null && zzcabVarZzp != null) {
            zzcabVarZzp.zzc(zzecrVarZzf);
        } else if (zzcabVarZzp != null) {
            zzcabVarZzp.cancel(false);
        }
    }
}

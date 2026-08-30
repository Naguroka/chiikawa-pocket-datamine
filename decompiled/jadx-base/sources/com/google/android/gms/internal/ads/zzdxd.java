package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdxd implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdxe zza;

    zzdxd(com.google.android.gms.internal.ads.zzdxe zzdxeVar) {
        this.zza = zzdxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgb)).booleanValue()) {
            java.util.regex.Matcher matcher = com.google.android.gms.internal.ads.zzdxe.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(java.lang.Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfca zzfcaVar = (com.google.android.gms.internal.ads.zzfca) obj;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgb)).booleanValue()) {
            this.zza.zzf.zzi(zzfcaVar.zzb.zzb.zzf);
            this.zza.zzf.zzj(zzfcaVar.zzb.zzb.zzg);
        }
    }
}

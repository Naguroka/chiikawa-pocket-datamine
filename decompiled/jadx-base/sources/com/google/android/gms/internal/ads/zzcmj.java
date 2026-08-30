package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcmj implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfja zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcmk zzd;

    zzcmj(com.google.android.gms.internal.ads.zzcmk zzcmkVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, java.lang.String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfjaVar;
        this.zzb = str;
        this.zzc = zzvVar;
        this.zzd = zzcmkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(final java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzgcs zzgcsVar = this.zzd.zzg;
        final com.google.android.gms.internal.ads.zzfja zzfjaVar = this.zza;
        final java.lang.String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        zzgcsVar.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcmh
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkh)).booleanValue();
                com.google.android.gms.internal.ads.zzcmj zzcmjVar = this.zza;
                java.lang.Throwable th2 = th;
                if (zBooleanValue) {
                    com.google.android.gms.internal.ads.zzcmk zzcmkVar = zzcmjVar.zzd;
                    zzcmkVar.zzb = com.google.android.gms.internal.ads.zzbuh.zzc(zzcmkVar.zzc);
                    zzcmjVar.zzd.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    com.google.android.gms.internal.ads.zzcmk zzcmkVar2 = zzcmjVar.zzd;
                    zzcmkVar2.zza = com.google.android.gms.internal.ads.zzbuh.zza(zzcmkVar2.zzc);
                    zzcmjVar.zzd.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfjaVar.zzd(str, zzvVar2, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        final com.google.android.gms.internal.ads.zzfja zzfjaVar = this.zza;
        final java.lang.String str = (java.lang.String) obj;
        com.google.android.gms.internal.ads.zzgcs zzgcsVar = this.zzd.zzg;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        zzgcsVar.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcmi
            @Override // java.lang.Runnable
            public final void run() {
                zzfjaVar.zzd(str, zzvVar, null);
            }
        });
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfja {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzgct zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final com.google.android.gms.internal.ads.zzfir zze;
    private final com.google.android.gms.internal.ads.zzfhk zzf;

    zzfja(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzgct zzgctVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, com.google.android.gms.internal.ads.zzfir zzfirVar, com.google.android.gms.internal.ads.zzfhk zzfhkVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgctVar;
        this.zzd = zzuVar;
        this.zze = zzfirVar;
        this.zzf = zzfhkVar;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String str) throws java.lang.Exception {
        return this.zzd.zza(str);
    }

    public final void zzd(final java.lang.String str, final com.google.android.gms.ads.internal.util.client.zzv zzvVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar) {
        if (!com.google.android.gms.internal.ads.zzfhk.zza() || !((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzd.zze()).booleanValue()) {
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfiy
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc(str, zzvVar);
                }
            });
            return;
        }
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = com.google.android.gms.internal.ads.zzfgv.zza(this.zza, 14);
        zzfgwVarZza.zzi();
        com.google.android.gms.internal.ads.zzgch.zzr(zzc(str, zzvVar), new com.google.android.gms.internal.ads.zzfiz(this, zzfgwVarZza, zzfhhVar), this.zzb);
    }

    public final void zze(java.util.List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zzd((java.lang.String) it.next(), zzvVar, null);
        }
    }

    final com.google.common.util.concurrent.ListenableFuture zzc(final java.lang.String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (zzvVar == null) {
            return this.zzc.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfix
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.zza.zza(str);
                }
            });
        }
        return new com.google.android.gms.internal.ads.zzfiq(zzvVar.zzb(), this.zzd, this.zzc, this.zze).zzd(str);
    }
}

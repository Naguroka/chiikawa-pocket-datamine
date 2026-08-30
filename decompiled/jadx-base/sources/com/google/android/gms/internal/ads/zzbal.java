package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbal {
    private com.google.android.gms.ads.internal.client.zzby zza;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.ads.internal.client.zzei zzd;
    private final int zze;
    private final com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback zzf;
    private final com.google.android.gms.internal.ads.zzbpa zzg = new com.google.android.gms.internal.ads.zzbpa();
    private final com.google.android.gms.ads.internal.client.zzr zzh = com.google.android.gms.ads.internal.client.zzr.zza;

    public zzbal(android.content.Context context, java.lang.String str, com.google.android.gms.ads.internal.client.zzei zzeiVar, int i, com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzeiVar;
        this.zze = i;
        this.zzf = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzby zzbyVarZze = com.google.android.gms.ads.internal.client.zzbc.zza().zze(this.zzb, com.google.android.gms.ads.internal.client.zzs.zzb(), this.zzc, this.zzg);
            this.zza = zzbyVarZze;
            if (zzbyVarZze != null) {
                if (this.zze != 3) {
                    this.zza.zzI(new com.google.android.gms.ads.internal.client.zzy(this.zze));
                }
                this.zzd.zzq(jCurrentTimeMillis);
                this.zza.zzH(new com.google.android.gms.internal.ads.zzazy(this.zzf, this.zzc));
                this.zza.zzab(this.zzh.zza(this.zzb, this.zzd));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}

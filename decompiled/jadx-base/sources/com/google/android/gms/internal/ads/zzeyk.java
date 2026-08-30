package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeyk implements com.google.android.gms.internal.ads.zzfer {
    public final com.google.android.gms.internal.ads.zzeze zza;
    public final com.google.android.gms.internal.ads.zzezg zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final java.lang.String zzd;
    public final java.util.concurrent.Executor zze;
    public final com.google.android.gms.ads.internal.client.zzy zzf;
    public final com.google.android.gms.internal.ads.zzfeg zzg;

    public zzeyk(com.google.android.gms.internal.ads.zzeze zzezeVar, com.google.android.gms.internal.ads.zzezg zzezgVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.util.concurrent.Executor executor, com.google.android.gms.ads.internal.client.zzy zzyVar, com.google.android.gms.internal.ads.zzfeg zzfegVar) {
        this.zza = zzezeVar;
        this.zzb = zzezgVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzyVar;
        this.zzg = zzfegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final com.google.android.gms.internal.ads.zzfeg zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final java.util.concurrent.Executor zzb() {
        return this.zze;
    }
}

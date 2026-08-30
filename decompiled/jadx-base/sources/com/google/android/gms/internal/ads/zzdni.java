package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdni implements java.util.concurrent.Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzdrw zzc;
    private final com.google.android.gms.internal.ads.zzebk zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.internal.ads.zzava zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;
    private final com.google.android.gms.internal.ads.zzfja zzh;
    private final com.google.android.gms.internal.ads.zzebv zzi;
    private final com.google.android.gms.internal.ads.zzfcn zzj;

    public zzdni(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, com.google.android.gms.internal.ads.zzcfk zzcfkVar, com.google.android.gms.internal.ads.zzebk zzebkVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzebv zzebvVar, com.google.android.gms.internal.ads.zzfcn zzfcnVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzavaVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzebkVar;
        this.zzh = zzfjaVar;
        this.zzc = zzdrwVar;
        this.zzi = zzebvVar;
        this.zzj = zzfcnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzdnl zzdnlVar = new com.google.android.gms.internal.ads.zzdnl(this);
        zzdnlVar.zzk();
        return zzdnlVar;
    }
}

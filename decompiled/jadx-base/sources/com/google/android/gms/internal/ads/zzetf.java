package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzetf implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc;
    private final java.lang.String zzd;

    zzetf(com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str) {
        this.zza = zzgcsVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzete
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzetg zzc() throws java.lang.Exception {
        boolean zIsCallerInstantApp = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zZzF = com.google.android.gms.ads.internal.util.zzs.zzF(this.zzb);
        java.lang.String str = this.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zZzG = com.google.android.gms.ads.internal.util.zzs.zzG();
        com.google.android.gms.ads.internal.zzv.zzq();
        android.content.pm.ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        int i = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        android.content.Context context = this.zzb;
        return new com.google.android.gms.internal.ads.zzetg(zIsCallerInstantApp, zZzF, str, zZzG, i, com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID), com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID), this.zzd);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcuw {
    private final com.google.android.gms.internal.ads.zzfgn zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final android.content.pm.ApplicationInfo zzc;
    private final java.lang.String zzd;
    private final java.util.List zze;
    private final android.content.pm.PackageInfo zzf;
    private final com.google.android.gms.internal.ads.zzhel zzg;
    private final java.lang.String zzh;
    private final com.google.android.gms.internal.ads.zzetu zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final com.google.android.gms.internal.ads.zzfcj zzk;
    private final int zzl;
    private final com.google.android.gms.internal.ads.zzdbe zzm;

    zzcuw(com.google.android.gms.internal.ads.zzfgn zzfgnVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, android.content.pm.ApplicationInfo applicationInfo, java.lang.String str, java.util.List list, android.content.pm.PackageInfo packageInfo, com.google.android.gms.internal.ads.zzhel zzhelVar, com.google.android.gms.ads.internal.util.zzg zzgVar, java.lang.String str2, com.google.android.gms.internal.ads.zzetu zzetuVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzdbe zzdbeVar, int i) {
        this.zza = zzfgnVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhelVar;
        this.zzh = str2;
        this.zzi = zzetuVar;
        this.zzj = zzgVar;
        this.zzk = zzfcjVar;
        this.zzm = zzdbeVar;
        this.zzl = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvk zza(com.google.common.util.concurrent.ListenableFuture listenableFuture, android.os.Bundle bundle) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) listenableFuture.get();
        android.os.Bundle bundle2 = zzcuvVar.zza;
        java.lang.String str = (java.lang.String) ((com.google.common.util.concurrent.ListenableFuture) this.zzg.zzb()).get();
        boolean z = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgQ)).booleanValue() && this.zzj.zzN();
        java.lang.String str2 = this.zzh;
        android.content.pm.PackageInfo packageInfo = this.zzf;
        java.util.List list = this.zze;
        return new com.google.android.gms.internal.ads.zzbvk(bundle2, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, null, null, z, this.zzk.zzb(), bundle, zzcuvVar.zzb);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(android.os.Bundle bundle) {
        this.zzm.zza();
        return com.google.android.gms.internal.ads.zzffx.zzc(this.zzi.zza(new com.google.android.gms.internal.ads.zzcuv(new android.os.Bundle(), new android.os.Bundle()), bundle, this.zzl == 2), com.google.android.gms.internal.ads.zzfgh.SIGNALS, this.zza).zza();
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc() {
        final android.os.Bundle bundle = new android.os.Bundle();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue()) {
            android.os.Bundle bundle2 = this.zzk.zzs;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = zzb(bundle);
        return this.zza.zza(com.google.android.gms.internal.ads.zzfgh.REQUEST_PARCEL, listenableFutureZzb, (com.google.common.util.concurrent.ListenableFuture) this.zzg.zzb()).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzcuu
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zza(listenableFutureZzb, bundle);
            }
        }).zza();
    }
}

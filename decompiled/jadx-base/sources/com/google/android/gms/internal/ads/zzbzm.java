package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbzm {
    private final java.lang.Object zza = new java.lang.Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final com.google.android.gms.internal.ads.zzbzq zzc;
    private boolean zzd;
    private android.content.Context zze;
    private com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private java.lang.String zzg;
    private com.google.android.gms.internal.ads.zzbcq zzh;
    private java.lang.Boolean zzi;
    private final java.util.concurrent.atomic.AtomicInteger zzj;
    private final java.util.concurrent.atomic.AtomicInteger zzk;
    private final com.google.android.gms.internal.ads.zzbzk zzl;
    private final java.lang.Object zzm;
    private com.google.common.util.concurrent.ListenableFuture zzn;
    private final java.util.concurrent.atomic.AtomicBoolean zzo;

    public zzbzm() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new com.google.android.gms.internal.ads.zzbzq(com.google.android.gms.ads.internal.client.zzbc.zzd(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new java.util.concurrent.atomic.AtomicInteger(0);
        this.zzk = new java.util.concurrent.atomic.AtomicInteger(0);
        this.zzl = new com.google.android.gms.internal.ads.zzbzk(null);
        this.zzm = new java.lang.Object();
        this.zzo = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public final boolean zzA(android.content.Context context) {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzim)).booleanValue()) {
                return this.zzo.get();
            }
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    public final android.content.Context zzd() {
        return this.zze;
    }

    public final android.content.res.Resources zze() {
        if (this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkL)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzs.zza(this.zze).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zza(this.zze).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final com.google.android.gms.internal.ads.zzbcq zzg() {
        com.google.android.gms.internal.ads.zzbcq zzbcqVar;
        synchronized (this.zza) {
            zzbcqVar = this.zzh;
        }
        return zzbcqVar;
    }

    public final com.google.android.gms.internal.ads.zzbzq zzh() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzi() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzk() {
        if (this.zze != null) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcW)).booleanValue()) {
                synchronized (this.zzm) {
                    com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzn;
                    if (listenableFuture != null) {
                        return listenableFuture;
                    }
                    com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = com.google.android.gms.internal.ads.zzbzw.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzbzh
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return this.zza.zzo();
                        }
                    });
                    this.zzn = listenableFutureZzb;
                    return listenableFutureZzb;
                }
            }
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(new java.util.ArrayList());
    }

    public final java.lang.Boolean zzl() {
        java.lang.Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final java.lang.String zzn() {
        return this.zzg;
    }

    final /* synthetic */ java.util.ArrayList zzo() throws java.lang.Exception {
        android.content.Context contextZza = com.google.android.gms.internal.ads.zzbvu.zza(this.zze);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(contextZza).getPackageInfo(contextZza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    public final void zzu(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        com.google.android.gms.internal.ads.zzbcq zzbcqVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = versionInfoParcel;
                com.google.android.gms.ads.internal.zzv.zzb().zzc(this.zzc);
                this.zzb.zzp(this.zze);
                com.google.android.gms.internal.ads.zzbuh.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzv.zze();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcf)).booleanValue()) {
                    zzbcqVar = new com.google.android.gms.internal.ads.zzbcq();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbcqVar = null;
                }
                this.zzh = zzbcqVar;
                if (zzbcqVar != null) {
                    com.google.android.gms.internal.ads.zzbzz.zza(new com.google.android.gms.internal.ads.zzbzi(this).zzb(), "AppState.registerCsiReporter");
                }
                android.content.Context context2 = this.zze;
                if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzim)).booleanValue()) {
                        try {
                            ((android.net.ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new com.google.android.gms.internal.ads.zzbzj(this));
                        } catch (java.lang.RuntimeException e) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to register network callback", e);
                            this.zzo.set(true);
                        }
                    }
                }
                this.zzd = true;
                zzk();
            }
        }
        com.google.android.gms.ads.internal.zzv.zzq().zzc(context, versionInfoParcel.afmaVersion);
    }

    public final void zzv(java.lang.Throwable th, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbuh.zzb(this.zze, this.zzf).zzi(th, str, ((java.lang.Double) com.google.android.gms.internal.ads.zzbeu.zzg.zze()).floatValue());
    }

    public final void zzw(java.lang.Throwable th, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbuh.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzx(java.lang.Throwable th, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbuh.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzy(java.lang.Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzz(java.lang.String str) {
        this.zzg = str;
    }
}

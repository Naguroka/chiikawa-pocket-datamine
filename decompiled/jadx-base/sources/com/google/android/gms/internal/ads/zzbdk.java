package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbdk extends androidx.browser.customtabs.CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);
    private android.content.Context zzc;
    private com.google.android.gms.internal.ads.zzdrw zzd;
    private androidx.browser.customtabs.CustomTabsSession zze;
    private androidx.browser.customtabs.CustomTabsClient zzf;

    private final void zzf(android.content.Context context) {
        java.lang.String packageName;
        if (this.zzf != null || context == null || (packageName = androidx.browser.customtabs.CustomTabsClient.getPackageName(context, null)) == null) {
            return;
        }
        androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(context, packageName, this);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(android.content.ComponentName componentName, androidx.browser.customtabs.CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.warmup(0L);
        this.zze = customTabsClient.newSession(new com.google.android.gms.internal.ads.zzbdj(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final androidx.browser.customtabs.CustomTabsSession zza() {
        if (this.zze == null) {
            com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbdi
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            });
        }
        return this.zze;
    }

    public final void zzb(android.content.Context context, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdrwVar;
        zzf(context);
    }

    final /* synthetic */ void zzc() {
        zzf(this.zzc);
    }

    final /* synthetic */ void zzd(int i) {
        com.google.android.gms.internal.ads.zzdrw zzdrwVar = this.zzd;
        if (zzdrwVar != null) {
            com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = zzdrwVar.zza();
            zzdrvVarZza.zzb("action", "cct_nav");
            zzdrvVarZza.zzb("cct_navs", java.lang.String.valueOf(i));
            zzdrvVarZza.zzg();
        }
    }

    public final void zze(final int i) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeF)).booleanValue() || this.zzd == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbdh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(i);
            }
        });
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbdm {
    private androidx.browser.customtabs.CustomTabsSession zza;
    private androidx.browser.customtabs.CustomTabsClient zzb;
    private androidx.browser.customtabs.CustomTabsServiceConnection zzc;
    private com.google.android.gms.internal.ads.zzbdl zzd;

    public static boolean zzg(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.example.com"));
            android.content.pm.ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(com.google.android.gms.internal.ads.zzhfk.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final androidx.browser.customtabs.CustomTabsSession zza() {
        androidx.browser.customtabs.CustomTabsClient customTabsClient = this.zzb;
        if (customTabsClient == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = customTabsClient.newSession(null);
        }
        return this.zza;
    }

    public final void zzb(android.app.Activity activity) {
        java.lang.String strZza;
        if (this.zzb == null && (strZza = com.google.android.gms.internal.ads.zzhfk.zza(activity)) != null) {
            com.google.android.gms.internal.ads.zzhfl zzhflVar = new com.google.android.gms.internal.ads.zzhfl(this);
            this.zzc = zzhflVar;
            androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(activity, strZza, zzhflVar);
        }
    }

    public final void zzc(androidx.browser.customtabs.CustomTabsClient customTabsClient) {
        this.zzb = customTabsClient;
        customTabsClient.warmup(0L);
        com.google.android.gms.internal.ads.zzbdl zzbdlVar = this.zzd;
        if (zzbdlVar != null) {
            zzbdlVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(com.google.android.gms.internal.ads.zzbdl zzbdlVar) {
        this.zzd = zzbdlVar;
    }

    public final void zzf(android.app.Activity activity) {
        androidx.browser.customtabs.CustomTabsServiceConnection customTabsServiceConnection = this.zzc;
        if (customTabsServiceConnection == null) {
            return;
        }
        activity.unbindService(customTabsServiceConnection);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzese implements com.google.android.gms.internal.ads.zzetr {
    private final android.content.pm.ApplicationInfo zza;
    private final android.content.pm.PackageInfo zzb;
    private final android.content.Context zzc;

    zzese(android.content.pm.ApplicationInfo applicationInfo, android.content.pm.PackageInfo packageInfo, android.content.Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 29;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        java.lang.String strValueOf;
        java.lang.String installingPackageName;
        java.lang.String str;
        android.content.pm.PackageManager.NameNotFoundException e;
        java.lang.String initiatingPackageName;
        java.lang.String str2 = this.zza.packageName;
        android.content.pm.PackageInfo packageInfo = this.zzb;
        java.lang.Integer numValueOf = packageInfo == null ? null : java.lang.Integer.valueOf(packageInfo.versionCode);
        android.content.pm.PackageInfo packageInfo2 = this.zzb;
        java.lang.String str3 = packageInfo2 == null ? null : packageInfo2.versionName;
        try {
            android.content.Context context = this.zzc;
            com.google.android.gms.internal.ads.zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
            strValueOf = java.lang.String.valueOf(com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationLabel(str2));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmD)).booleanValue()) {
                try {
                    android.content.pm.InstallSourceInfo installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str2);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        try {
                            if (android.text.TextUtils.isEmpty(installingPackageName)) {
                                com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                                installingPackageName = null;
                            }
                            initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                            try {
                                if (android.text.TextUtils.isEmpty(initiatingPackageName)) {
                                    com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                                    str = null;
                                } else {
                                    str = initiatingPackageName;
                                }
                            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                                e = e2;
                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "PackageInfoSignalSource.getInstallSourceInfo");
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                            e = e3;
                            initiatingPackageName = null;
                        }
                    } else {
                        installingPackageName = null;
                        str = null;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException e4) {
                    installingPackageName = null;
                    e = e4;
                    initiatingPackageName = null;
                }
            } else {
                installingPackageName = null;
                str = null;
            }
        } else {
            installingPackageName = null;
            str = null;
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzesf(str2, numValueOf, str3, strValueOf, installingPackageName, str));
    }
}

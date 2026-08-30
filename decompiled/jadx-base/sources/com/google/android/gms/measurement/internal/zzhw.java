package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhw {
    final com.google.android.gms.measurement.internal.zzio zza;

    zzhw(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        this.zza = zzpvVar.zzt();
    }

    final boolean zza() {
        try {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zza;
            com.google.android.gms.common.wrappers.PackageManagerWrapper packageManagerWrapperPackageManager = com.google.android.gms.common.wrappers.Wrappers.packageManager(zzioVar.zzaT());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            zzioVar.zzaW().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (java.lang.Exception e) {
            this.zza.zzaW().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}

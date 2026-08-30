package com.google.android.gms.ads.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzs {
    private final android.content.Context zza;
    private final java.lang.String zzb;
    private final java.util.Map zzc = new java.util.TreeMap();
    private java.lang.String zzd;
    private java.lang.String zze;
    private final java.lang.String zzf;

    public zzs(android.content.Context context, java.lang.String str) {
        java.lang.String strConcat;
        this.zza = context.getApplicationContext();
        this.zzb = str;
        java.lang.String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get package version name for reporting", e);
            strConcat = java.lang.String.valueOf(packageName).concat("-missing");
        }
        this.zzf = strConcat;
    }

    public final java.lang.String zza() {
        return this.zzf;
    }

    public final java.lang.String zzb() {
        return this.zze;
    }

    public final java.lang.String zzc() {
        return this.zzb;
    }

    public final java.lang.String zzd() {
        return this.zzd;
    }

    public final java.util.Map zze() {
        return this.zzc;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zzd = zzmVar.zzj.zza;
        android.os.Bundle bundle = zzmVar.zzm;
        android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(com.google.ads.mediation.admob.AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        java.lang.String str = (java.lang.String) com.google.android.gms.internal.ads.zzbdx.zzc.zze();
        for (java.lang.String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.zze = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.zzc.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.zzc.put(com.ironsource.y8.i.q, versionInfoParcel.afmaVersion);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbdx.zza.zze()).booleanValue()) {
            android.os.Bundle bundleZzb = com.google.android.gms.ads.internal.util.zzad.zzb(this.zza, (java.lang.String) com.google.android.gms.internal.ads.zzbdx.zzb.zze());
            for (java.lang.String str3 : bundleZzb.keySet()) {
                this.zzc.put(str3, bundleZzb.get(str3).toString());
            }
        }
    }
}

package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzf {
    private final android.content.Context zza;
    private final android.content.pm.ApplicationInfo zzb;
    private final java.util.List zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final org.json.JSONObject zze = new org.json.JSONObject();
    private final java.util.concurrent.atomic.AtomicBoolean zzf = new java.util.concurrent.atomic.AtomicBoolean(false);

    zzf(android.content.Context context, com.google.android.gms.internal.ads.zzbbu zzbbuVar, java.util.List list, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        this.zzc = list;
        this.zzd = versionInfoParcel;
    }

    public final org.json.JSONObject zza() {
        if (!this.zzf.get()) {
            zzb();
        }
        return this.zze;
    }

    public final void zzb() {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        android.content.pm.PackageInfo packageInfo = null;
        try {
            if (this.zzb != null) {
                packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zza).getPackageInfo(this.zzb.packageName, 0);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo != null) {
            try {
                this.zze.put("vc", packageInfo.versionCode);
                this.zze.put("vnm", packageInfo.versionName);
            } catch (org.json.JSONException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "PawAppSignalGenerator.initialize");
                return;
            }
        }
        android.content.pm.ApplicationInfo applicationInfo = this.zzb;
        if (applicationInfo != null) {
            this.zze.put("pn", applicationInfo.packageName);
        }
        org.json.JSONObject jSONObject = this.zze;
        java.util.List list = this.zzc;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : ((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjG)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        this.zze.put("js", this.zzd.afmaVersion);
        java.util.Iterator<java.lang.String> itKeys = this.zze.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object obj = this.zze.get(next);
            if (obj != null) {
                this.zze.put(next, android.util.Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
    }
}

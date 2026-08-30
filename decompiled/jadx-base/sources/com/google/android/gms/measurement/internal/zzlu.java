package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlu implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ android.net.Uri zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ java.lang.String zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlv zze;

    zzlu(com.google.android.gms.measurement.internal.zzlv zzlvVar, boolean z, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzlvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzlv zzlvVar;
        android.os.Bundle bundleZzu;
        android.os.Bundle bundleZzu2;
        com.google.android.gms.measurement.internal.zzlv zzlvVar2 = this.zze;
        com.google.android.gms.measurement.internal.zzlw zzlwVar = zzlvVar2.zza;
        zzlwVar.zzg();
        java.lang.String str = this.zzd;
        android.net.Uri uri = this.zzb;
        try {
            com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVar.zzu;
            com.google.android.gms.measurement.internal.zzqf zzqfVarZzw = zzioVar.zzw();
            if (android.text.TextUtils.isEmpty(str)) {
                bundleZzu = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleZzu = zzqfVarZzw.zzu(android.net.Uri.parse("https://google.com/search?".concat(java.lang.String.valueOf(str))));
                if (bundleZzu != null) {
                    bundleZzu.putString("_cis", com.adjust.sdk.Constants.REFERRER);
                }
            } else {
                zzqfVarZzw.zzu.zzaW().zzd().zza("Activity created with data 'referrer' without required params");
                bundleZzu = null;
            }
            java.lang.String str2 = this.zzc;
            if (this.zza && (bundleZzu2 = zzioVar.zzw().zzu(uri)) != null) {
                bundleZzu2.putString("_cis", "intent");
                if (!bundleZzu2.containsKey("gclid") && bundleZzu != null && bundleZzu.containsKey("gclid")) {
                    try {
                        bundleZzu2.putString("_cer", java.lang.String.format("gclid=%s", bundleZzu.getString("gclid")));
                    } catch (java.lang.RuntimeException e) {
                        e = e;
                        zzlvVar = zzlvVar2;
                        zzlvVar.zza.zzu.zzaW().zze().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
                        return;
                    }
                }
                zzlwVar.zzR(str2, com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleZzu2);
                zzlwVar.zzb.zza(str2, bundleZzu2);
            }
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            zzioVar.zzaW().zzd().zzb("Activity created with referrer", str);
            if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaF)) {
                if (bundleZzu != null) {
                    zzlwVar.zzR(str2, com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleZzu);
                    zzlwVar.zzb.zza(str2, bundleZzu);
                } else {
                    zzioVar.zzaW().zzd().zzb("Referrer does not contain valid parameters", str);
                }
                zzlwVar.zzal("auto", "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                zzioVar.zzaW().zzd().zza("Activity created with data 'referrer' without required params");
            } else {
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                zzlwVar.zzal("auto", "_ldl", str, true);
            }
        } catch (java.lang.RuntimeException e2) {
            e = e2;
            zzlvVar = zzlvVar2;
        }
    }
}

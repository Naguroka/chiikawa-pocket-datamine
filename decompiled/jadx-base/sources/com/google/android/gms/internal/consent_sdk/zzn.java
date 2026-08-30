package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzn {
    private final com.google.android.gms.internal.consent_sdk.zzl zza;
    private final android.app.Activity zzb;
    private final com.google.android.ump.ConsentDebugSettings zzc;
    private final com.google.android.ump.ConsentRequestParameters zzd;

    /* synthetic */ zzn(com.google.android.gms.internal.consent_sdk.zzl zzlVar, android.app.Activity activity, com.google.android.ump.ConsentDebugSettings consentDebugSettings, com.google.android.ump.ConsentRequestParameters consentRequestParameters, com.google.android.gms.internal.consent_sdk.zzm zzmVar) {
        this.zza = zzlVar;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.consent_sdk.zzcf zza(com.google.android.gms.internal.consent_sdk.zzn zznVar) throws com.google.android.gms.internal.consent_sdk.zzg {
        android.os.Bundle bundle;
        java.util.List arrayList;
        java.util.List listEmptyList;
        android.content.pm.PackageInfo packageInfo;
        com.google.android.gms.internal.consent_sdk.zzcf zzcfVar = new com.google.android.gms.internal.consent_sdk.zzcf();
        java.lang.String strZza = zznVar.zzd.zza();
        if (android.text.TextUtils.isEmpty(strZza)) {
            try {
                bundle = zznVar.zza.zza.getPackageManager().getApplicationInfo(zznVar.zza.zza.getPackageName(), 128).metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strZza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (android.text.TextUtils.isEmpty(strZza)) {
                throw new com.google.android.gms.internal.consent_sdk.zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzcfVar.zza = strZza;
        if (zznVar.zzc.isTestDevice()) {
            arrayList = new java.util.ArrayList();
            int debugGeography = zznVar.zzc.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(com.google.android.gms.internal.consent_sdk.zzca.GEO_OVERRIDE_EEA);
            } else if (debugGeography == 2) {
                arrayList.add(com.google.android.gms.internal.consent_sdk.zzca.GEO_OVERRIDE_NON_EEA);
            } else if (debugGeography == 3) {
                arrayList.add(com.google.android.gms.internal.consent_sdk.zzca.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (debugGeography == 4) {
                arrayList.add(com.google.android.gms.internal.consent_sdk.zzca.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(com.google.android.gms.internal.consent_sdk.zzca.PREVIEWING_DEBUG_MESSAGES);
        } else {
            arrayList = java.util.Collections.emptyList();
        }
        zzcfVar.zzi = arrayList;
        zzcfVar.zze = zznVar.zza.zzb.zzc();
        zzcfVar.zzd = java.lang.Boolean.valueOf(zznVar.zzd.isTagForUnderAgeOfConsent());
        zzcfVar.zzc = java.util.Locale.getDefault().toLanguageTag();
        com.google.android.gms.internal.consent_sdk.zzcb zzcbVar = new com.google.android.gms.internal.consent_sdk.zzcb();
        zzcbVar.zzb = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
        zzcbVar.zza = android.os.Build.MODEL;
        zzcbVar.zzc = 2;
        zzcfVar.zzb = zzcbVar;
        android.content.res.Configuration configuration = zznVar.zza.zza.getResources().getConfiguration();
        zznVar.zza.zza.getResources().getConfiguration();
        com.google.android.gms.internal.consent_sdk.zzcd zzcdVar = new com.google.android.gms.internal.consent_sdk.zzcd();
        zzcdVar.zza = java.lang.Integer.valueOf(configuration.screenWidthDp);
        zzcdVar.zzb = java.lang.Integer.valueOf(configuration.screenHeightDp);
        zzcdVar.zzc = java.lang.Double.valueOf(zznVar.zza.zza.getResources().getDisplayMetrics().density);
        if (android.os.Build.VERSION.SDK_INT < 28) {
            listEmptyList = java.util.Collections.emptyList();
        } else {
            android.app.Activity activity = zznVar.zzb;
            android.view.Window window = activity == null ? null : activity.getWindow();
            android.view.View decorView = window == null ? null : window.getDecorView();
            android.view.WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            android.view.DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                listEmptyList = java.util.Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (android.graphics.Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        com.google.android.gms.internal.consent_sdk.zzcc zzccVar = new com.google.android.gms.internal.consent_sdk.zzcc();
                        zzccVar.zzb = java.lang.Integer.valueOf(rect.left);
                        zzccVar.zzc = java.lang.Integer.valueOf(rect.right);
                        zzccVar.zza = java.lang.Integer.valueOf(rect.top);
                        zzccVar.zzd = java.lang.Integer.valueOf(rect.bottom);
                        arrayList2.add(zzccVar);
                    }
                }
                listEmptyList = arrayList2;
            }
        }
        zzcdVar.zzd = listEmptyList;
        zzcfVar.zzf = zzcdVar;
        com.google.android.gms.internal.consent_sdk.zzl zzlVar = zznVar.zza;
        android.app.Application application = zzlVar.zza;
        try {
            packageInfo = zzlVar.zza.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        com.google.android.gms.internal.consent_sdk.zzbz zzbzVar = new com.google.android.gms.internal.consent_sdk.zzbz();
        zzbzVar.zza = application.getPackageName();
        java.lang.CharSequence applicationLabel = zznVar.zza.zza.getPackageManager().getApplicationLabel(zznVar.zza.zza.getApplicationInfo());
        zzbzVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzbzVar.zzc = java.lang.Long.toString(android.os.Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzcfVar.zzg = zzbzVar;
        com.google.android.gms.internal.consent_sdk.zzce zzceVar = new com.google.android.gms.internal.consent_sdk.zzce();
        zzceVar.zza = "3.1.0";
        zzcfVar.zzh = zzceVar;
        return zzcfVar;
    }
}

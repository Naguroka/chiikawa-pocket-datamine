package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeuc implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final android.content.Context zzb;

    public zzeuc(com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    private static android.content.pm.ResolveInfo zzd(android.content.pm.PackageManager packageManager, java.lang.String str) {
        return packageManager.resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeub
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0134  */
    /* JADX WARN: Code duplicated, block: B:40:0x013f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0141  */
    /* JADX WARN: Code duplicated, block: B:44:0x0154  */
    /* JADX WARN: Code duplicated, block: B:51:0x0173  */
    /* JADX WARN: Code duplicated, block: B:52:0x0175  */
    /* JADX WARN: Code duplicated, block: B:54:0x0179  */
    /* JADX WARN: Code duplicated, block: B:55:0x017b  */
    /* JADX WARN: Code duplicated, block: B:57:0x017e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0180  */
    /* JADX WARN: Code duplicated, block: B:8:0x0061  */
    final /* synthetic */ com.google.android.gms.internal.ads.zzeua zzc() throws java.lang.Exception {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean zEquals;
        boolean z;
        java.lang.String string;
        boolean z2;
        boolean z3;
        android.os.Bundle bundle;
        android.content.pm.PackageManager packageManager = this.zzb.getPackageManager();
        java.util.Locale locale = java.util.Locale.getDefault();
        android.content.pm.ResolveInfo resolveInfoZzd = zzd(packageManager, "geo:0,0?q=donuts");
        android.content.pm.ResolveInfo resolveInfoZzd2 = zzd(packageManager, "http://www.google.com");
        java.lang.String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        boolean zZzr = com.google.android.gms.ads.internal.util.client.zzf.zzr();
        android.content.Context context = this.zzb;
        boolean zIsLatchsky = com.google.android.gms.common.util.DeviceProperties.isLatchsky(context);
        boolean zIsSidewinder = com.google.android.gms.common.util.DeviceProperties.isSidewinder(context);
        java.lang.String language = locale.getLanguage();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(localeList.get(i).getLanguage());
        }
        android.content.Context context2 = this.zzb;
        android.content.pm.ResolveInfo resolveInfoZzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoZzd3 == null || (activityInfo = resolveInfoZzd3.activityInfo) == null) {
            str = null;
        } else {
            try {
                android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context2).getPackageInfo(activityInfo.packageName, 0);
                if (packageInfo != null) {
                    str = packageInfo.versionCode + "." + activityInfo.packageName;
                } else {
                    str = null;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        try {
            android.content.pm.PackageInfo packageInfo2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
            str2 = packageInfo2 != null ? packageInfo2.versionCode + "." + packageInfo2.packageName : null;
        } catch (java.lang.Exception unused2) {
        }
        android.content.Context context3 = this.zzb;
        java.lang.String str4 = android.os.Build.FINGERPRINT;
        if (packageManager != null) {
            str3 = str2;
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.example.com"));
            android.content.pm.ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i2 = 0;
                while (true) {
                    if (i2 < listQueryIntentActivities.size()) {
                        java.util.List<android.content.pm.ResolveInfo> list = listQueryIntentActivities;
                        if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                            zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(com.google.android.gms.internal.ads.zzhfk.zza(context3));
                            break;
                        }
                        i2++;
                        listQueryIntentActivities = list;
                    }
                }
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            long availableBytes = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlj)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzq();
                if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzb)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzln)).booleanValue()) {
                android.content.Context context4 = this.zzb;
                try {
                    bundle = com.google.android.gms.common.wrappers.Wrappers.packageManager(context4).getApplicationInfo(context4.getPackageName(), 128).metaData;
                    if (bundle == null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                        string = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                    } else {
                        string = null;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                }
            } else {
                string = "";
            }
            if (resolveInfoZzd2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (resolveInfoZzd != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new com.google.android.gms.internal.ads.zzeua(z3, z2, country, zZzr, zIsLatchsky, zIsSidewinder, language, arrayList, str, str3, str4, zEquals, android.os.Build.MODEL, availableBytes, z, string, android.os.Build.VERSION.SDK_INT);
        }
        str3 = str2;
        zEquals = false;
        com.google.android.gms.ads.internal.zzv.zzq();
        long availableBytes2 = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlj)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzb)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzln)).booleanValue()) {
            android.content.Context context5 = this.zzb;
            bundle = com.google.android.gms.common.wrappers.Wrappers.packageManager(context5).getApplicationInfo(context5.getPackageName(), 128).metaData;
            if (bundle == null) {
                string = null;
            } else {
                string = null;
            }
        } else {
            string = "";
        }
        if (resolveInfoZzd2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (resolveInfoZzd != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new com.google.android.gms.internal.ads.zzeua(z3, z2, country, zZzr, zIsLatchsky, zIsSidewinder, language, arrayList, str, str3, str4, zEquals, android.os.Build.MODEL, availableBytes2, z, string, android.os.Build.VERSION.SDK_INT);
    }
}

package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzey extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        android.os.Bundle bundle = null;
        try {
            bundle = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to load metadata: Package name not found.", e);
        } catch (java.lang.NullPointerException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to load metadata: Null pointer exception.", e2);
        }
        com.google.android.gms.internal.ads.zzbow zzbowVarZza = com.google.android.gms.internal.ads.zzbow.zza();
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Metadata was null.");
        } else {
            try {
                java.lang.String str = (java.lang.String) bundle.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    java.lang.Boolean bool = (java.lang.Boolean) bundle.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                    try {
                        java.lang.String str2 = (java.lang.String) bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                        if (str != null) {
                            if (!str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                                throw new java.lang.IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Publisher provided Google AdMob App ID in manifest: ".concat(str));
                            if (bool == null || !bool.booleanValue()) {
                                zzbowVarZza.zzb(context, str);
                            }
                        } else {
                            if (android.text.TextUtils.isEmpty(str2)) {
                                throw new java.lang.IllegalStateException("\n\n******************************************************************************\n* Missing application ID. AdMob publishers should follow the instructions    *\n* here:                                                                      *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                            com.google.android.gms.ads.internal.util.client.zzo.zze("The Google Mobile Ads SDK is integrated by ".concat(java.lang.String.valueOf(str2)));
                        }
                    } catch (java.lang.ClassCastException e3) {
                        throw new java.lang.IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e3);
                    }
                } catch (java.lang.ClassCastException e4) {
                    throw new java.lang.IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e4);
                }
            } catch (java.lang.ClassCastException e5) {
                throw new java.lang.IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e5);
            }
        }
        if (bundle != null) {
            boolean z = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION", false);
            boolean z2 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING", false);
            if (z) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled");
            }
            if (z2) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}

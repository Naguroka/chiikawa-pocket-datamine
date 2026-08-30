package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzag {
    private static final java.lang.Object zza = new java.lang.Object();
    private static boolean zzb;
    private static java.lang.String zzc;
    private static int zzd;

    public static int zza(android.content.Context context) {
        zzc(context);
        return zzd;
    }

    public static java.lang.String zzb(android.content.Context context) {
        zzc(context);
        return zzc;
    }

    private static void zzc(android.content.Context context) {
        synchronized (zza) {
            if (zzb) {
                return;
            }
            zzb = true;
            try {
                android.os.Bundle bundle = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                zzc = bundle.getString("com.google.app.id");
                zzd = bundle.getInt("com.google.android.gms.version");
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
        }
    }
}

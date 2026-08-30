package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjw {
    static volatile com.google.common.base.Optional zza = com.google.common.base.Optional.absent();
    private static final java.lang.Object zzb = new java.lang.Object();

    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {, blocks: (B:12:0x0035, B:14:0x003d, B:15:0x0049, B:17:0x004b, B:19:0x0057, B:23:0x0067, B:25:0x006d, B:32:0x0088, B:33:0x0092, B:27:0x0077, B:28:0x007b, B:29:0x0081), top: B:40:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    public static boolean zza(android.content.Context context, android.net.Uri uri) {
        java.lang.String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            android.util.Log.e("PhenotypeClientHelper", java.lang.String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (zza.isPresent()) {
            return ((java.lang.Boolean) zza.get()).booleanValue();
        }
        synchronized (zzb) {
            if (zza.isPresent()) {
                return ((java.lang.Boolean) zza.get()).booleanValue();
            }
            if (!"com.google.android.gms".equals(context.getPackageName())) {
                android.content.pm.ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", android.os.Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                            z = true;
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    }
                }
            } else if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                z = true;
            }
            zza = com.google.common.base.Optional.of(java.lang.Boolean.valueOf(z));
            return ((java.lang.Boolean) zza.get()).booleanValue();
        }
    }
}

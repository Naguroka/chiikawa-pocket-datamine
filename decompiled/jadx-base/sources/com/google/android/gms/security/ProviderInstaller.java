package com.google.android.gms.security;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes5.dex */
public class ProviderInstaller {
    public static final java.lang.String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
    private static final java.lang.Object zzb = new java.lang.Object();
    private static java.lang.reflect.Method zzc = null;
    private static boolean zzd = false;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, android.content.Intent intent);

        void onProviderInstalled();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x0019, B:12:0x003d, B:13:0x0042, B:15:0x0044, B:26:0x008f, B:27:0x0094, B:29:0x0096, B:30:0x00a4, B:18:0x004f, B:20:0x0053, B:23:0x007d, B:10:0x0027), top: B:36:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x008f A[Catch: all -> 0x00a5, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x0019, B:12:0x003d, B:13:0x0042, B:15:0x0044, B:26:0x008f, B:27:0x0094, B:29:0x0096, B:30:0x00a4, B:18:0x004f, B:20:0x0053, B:23:0x007d, B:10:0x0027), top: B:36:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0096 A[Catch: all -> 0x00a5, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x0019, B:12:0x003d, B:13:0x0042, B:15:0x0044, B:26:0x008f, B:27:0x0094, B:29:0x0096, B:30:0x00a4, B:18:0x004f, B:20:0x0053, B:23:0x007d, B:10:0x0027), top: B:36:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void installIfNeeded(android.content.Context context) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        android.content.Context moduleContext;
        boolean z;
        android.content.Context remoteContext;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        zza.verifyGooglePlayServicesIsAvailable(context, 11925000);
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        synchronized (zzb) {
            android.content.Context context2 = null;
            if (zzd) {
                z = !zzd;
                remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
                if (remoteContext == null) {
                    zzd = true;
                    if (z) {
                        com.google.android.gms.internal.common.zzl.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", remoteContext.getClassLoader(), com.google.android.gms.internal.common.zzj.zzb(android.content.Context.class, context), com.google.android.gms.internal.common.zzi.zza(jUptimeMillis), com.google.android.gms.internal.common.zzi.zza(android.os.SystemClock.uptimeMillis()));
                    }
                    context2 = remoteContext;
                }
                if (context2 != null) {
                    zzb(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    android.util.Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
                }
            }
            try {
                moduleContext = com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").getModuleContext();
            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
                android.util.Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(java.lang.String.valueOf(e.getMessage())));
                moduleContext = null;
            }
            if (moduleContext != null) {
                zzb(moduleContext, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z = !zzd;
            remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                zzd = true;
                if (z) {
                    try {
                        com.google.android.gms.internal.common.zzl.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", remoteContext.getClassLoader(), com.google.android.gms.internal.common.zzj.zzb(android.content.Context.class, context), com.google.android.gms.internal.common.zzi.zza(jUptimeMillis), com.google.android.gms.internal.common.zzi.zza(android.os.SystemClock.uptimeMillis()));
                    } catch (java.lang.Exception e2) {
                        android.util.Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                    }
                }
                context2 = remoteContext;
            }
            if (context2 != null) {
                zzb(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                android.util.Log.e("ProviderInstaller", "Failed to get remote context");
                throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
            }
            throw th;
        }
    }

    public static void installIfNeededAsync(android.content.Context context, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener providerInstallListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the UI thread");
        new com.google.android.gms.security.zza(context, providerInstallListener).execute(new java.lang.Void[0]);
    }

    private static void zzb(android.content.Context context, android.content.Context context2, java.lang.String str) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        try {
            if (zzc == null) {
                zzc = context.getClassLoader().loadClass(str).getMethod("insertProvider", android.content.Context.class);
            }
            zzc.invoke(null, context);
        } catch (java.lang.Exception e) {
            java.lang.Throwable cause = e.getCause();
            if (android.util.Log.isLoggable("ProviderInstaller", 6)) {
                android.util.Log.e("ProviderInstaller", "Failed to install provider: ".concat(java.lang.String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
        }
    }
}

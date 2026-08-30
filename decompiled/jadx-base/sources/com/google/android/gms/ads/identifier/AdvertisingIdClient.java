package com.google.android.gms.ads.identifier;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public class AdvertisingIdClient {
    com.google.android.gms.common.BlockingServiceConnection zza;
    com.google.android.gms.internal.ads_identifier.zzf zzb;
    boolean zzc;
    final java.lang.Object zzd;
    com.google.android.gms.ads.identifier.zzb zze;
    final long zzf;
    private final android.content.Context zzg;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    public static final class Info {
        private final java.lang.String zza;
        private final boolean zzb;

        @java.lang.Deprecated
        public Info(java.lang.String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        public java.lang.String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public java.lang.String toString() {
            java.lang.String str = this.zza;
            boolean z = this.zzb;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(android.content.Context context) {
        this(context, 30000L, false, false);
    }

    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdvertisingIdInfo(android.content.Context context) throws com.google.android.gms.common.GooglePlayServicesRepairableException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, java.io.IOException {
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = new com.google.android.gms.ads.identifier.AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info infoZzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(infoZzd, true, 0.0f, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            advertisingIdClient.zza();
            return infoZzd;
        } catch (java.lang.Throwable th) {
            try {
                advertisingIdClient.zzc(null, true, 0.0f, -1L, "", th);
                throw th;
            } catch (java.lang.Throwable th2) {
                advertisingIdClient.zza();
                throw th2;
            }
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(android.content.Context context) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, java.io.IOException {
        boolean zZzd;
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = new com.google.android.gms.ads.identifier.AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (advertisingIdClient.zzc) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(advertisingIdClient.zza);
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(advertisingIdClient.zzb);
                    zZzd = advertisingIdClient.zzb.zzd();
                } else {
                    synchronized (advertisingIdClient.zzd) {
                        com.google.android.gms.ads.identifier.zzb zzbVar = advertisingIdClient.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new java.io.IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.zzb(false);
                        if (!advertisingIdClient.zzc) {
                            throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                        }
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(advertisingIdClient.zza);
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(advertisingIdClient.zzb);
                        try {
                            zZzd = advertisingIdClient.zzb.zzd();
                        } catch (android.os.RemoteException e) {
                            android.util.Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                            throw new java.io.IOException("Remote exception");
                        }
                    } catch (java.lang.Exception e2) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                throw th;
            }
            advertisingIdClient.zze();
            advertisingIdClient.zza();
            return zZzd;
        } catch (java.lang.Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzd(int i) throws java.io.IOException {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb);
                info = new com.google.android.gms.ads.identifier.AdvertisingIdClient.Info(this.zzb.zzc(), this.zzb.zze(true));
            } else {
                synchronized (this.zzd) {
                    com.google.android.gms.ads.identifier.zzb zzbVar = this.zze;
                    if (zzbVar == null || !zzbVar.zzb) {
                        throw new java.io.IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zzb(false);
                    if (!this.zzc) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza);
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb);
                    try {
                        info = new com.google.android.gms.ads.identifier.AdvertisingIdClient.Info(this.zzb.zzc(), this.zzb.zze(true));
                    } catch (android.os.RemoteException e) {
                        android.util.Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new java.io.IOException("Remote exception");
                    }
                } catch (java.lang.Exception e2) {
                    throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            throw th;
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            com.google.android.gms.ads.identifier.zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new com.google.android.gms.ads.identifier.zzb(this, j);
            }
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        zza();
        super.finalize();
    }

    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getInfo() throws java.io.IOException {
        return zzd(-1);
    }

    public void start() throws com.google.android.gms.common.GooglePlayServicesRepairableException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, java.io.IOException {
        zzb(true);
    }

    public final void zza() {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg == null || this.zza == null) {
                return;
            }
            try {
                if (this.zzc) {
                    com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zzg, this.zza);
                }
            } catch (java.lang.Throwable th) {
                android.util.Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.zzc = false;
            this.zzb = null;
            this.zza = null;
        }
    }

    protected final void zzb(boolean z) throws com.google.android.gms.common.GooglePlayServicesRepairableException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                zza();
            }
            android.content.Context context = this.zzg;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int iIsGooglePlayServicesAvailable = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
                if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                    throw new java.io.IOException("Google Play services not available");
                }
                com.google.android.gms.common.BlockingServiceConnection blockingServiceConnection = new com.google.android.gms.common.BlockingServiceConnection();
                android.content.Intent intent = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                        throw new java.io.IOException("Connection failure");
                    }
                    this.zza = blockingServiceConnection;
                    try {
                        this.zzb = com.google.android.gms.internal.ads_identifier.zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, java.util.concurrent.TimeUnit.MILLISECONDS));
                        this.zzc = true;
                        if (z) {
                            zze();
                        }
                    } catch (java.lang.InterruptedException unused) {
                        throw new java.io.IOException("Interrupted exception");
                    } catch (java.lang.Throwable th) {
                        throw new java.io.IOException(th);
                    }
                } catch (java.lang.Throwable th2) {
                    throw new java.io.IOException(th2);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    final boolean zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info, boolean z, float f, long j, java.lang.String str, java.lang.Throwable th) {
        if (java.lang.Math.random() > 0.0d) {
            return false;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.ironsource.y8.h.L0, "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            java.lang.String id = info.getId();
            if (id != null) {
                map.put("ad_id_size", java.lang.Integer.toString(id.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", java.lang.Long.toString(j));
        new com.google.android.gms.ads.identifier.zza(this, map).start();
        return true;
    }

    public AdvertisingIdClient(android.content.Context context, long j, boolean z, boolean z2) {
        android.content.Context applicationContext;
        this.zzd = new java.lang.Object();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j;
    }
}

package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RootTelemetryConfigManager {
    private static com.google.android.gms.common.internal.RootTelemetryConfigManager zza;
    private static final com.google.android.gms.common.internal.RootTelemetryConfiguration zzb = new com.google.android.gms.common.internal.RootTelemetryConfiguration(0, false, false, 0, 0);
    private com.google.android.gms.common.internal.RootTelemetryConfiguration zzc;

    private RootTelemetryConfigManager() {
    }

    public static synchronized com.google.android.gms.common.internal.RootTelemetryConfigManager getInstance() {
        if (zza == null) {
            zza = new com.google.android.gms.common.internal.RootTelemetryConfigManager();
        }
        return zza;
    }

    public com.google.android.gms.common.internal.RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }

    public final synchronized void zza(com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration) {
        try {
            if (rootTelemetryConfiguration == null) {
                this.zzc = zzb;
                return;
            }
            com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration2 = this.zzc;
            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
                this.zzc = rootTelemetryConfiguration;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}

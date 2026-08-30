package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzha {
    private static com.google.android.gms.measurement.internal.zzha zza;
    private final com.google.android.gms.measurement.internal.zzio zzb;
    private final com.google.android.gms.common.internal.TelemetryLoggingClient zzc;
    private final java.util.concurrent.atomic.AtomicLong zzd = new java.util.concurrent.atomic.AtomicLong(-1);

    private zzha(android.content.Context context, com.google.android.gms.measurement.internal.zzio zzioVar) {
        this.zzc = com.google.android.gms.common.internal.TelemetryLogging.getClient(context, com.google.android.gms.common.internal.TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.zzb = zzioVar;
    }

    static com.google.android.gms.measurement.internal.zzha zza(com.google.android.gms.measurement.internal.zzio zzioVar) {
        if (zza == null) {
            zza = new com.google.android.gms.measurement.internal.zzha(zzioVar.zzaT(), zzioVar);
        }
        return zza;
    }

    public final synchronized void zzc(int i, int i2, long j, long j2, int i3) {
        final long jElapsedRealtime = this.zzb.zzaU().elapsedRealtime();
        java.util.concurrent.atomic.AtomicLong atomicLong = this.zzd;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        this.zzc.log(new com.google.android.gms.common.internal.TelemetryData(0, java.util.Arrays.asList(new com.google.android.gms.common.internal.MethodInvocation(36301, i2, 0, j, j2, null, null, 0, i3)))).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.android.gms.measurement.internal.zzgz
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                this.zza.zzd.set(jElapsedRealtime);
            }
        });
    }
}

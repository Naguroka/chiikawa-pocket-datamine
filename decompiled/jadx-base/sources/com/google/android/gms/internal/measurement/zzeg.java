package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzeg implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.ThreadFactory zza = java.util.concurrent.Executors.defaultThreadFactory();

    zzeg(com.google.android.gms.internal.measurement.zzff zzffVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = this.zza.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}

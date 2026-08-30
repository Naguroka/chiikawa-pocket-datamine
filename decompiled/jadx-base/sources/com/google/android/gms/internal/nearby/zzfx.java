package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfx {
    private final java.util.concurrent.ExecutorService zza;
    private volatile java.io.InputStream zzb;
    private volatile boolean zzc;
    private final androidx.collection.SimpleArrayMap<java.lang.Long, java.io.OutputStream> zzd;
    private final androidx.collection.SimpleArrayMap<java.lang.Long, com.google.android.gms.internal.nearby.zzgd> zze;

    public zzfx() {
        com.google.android.gms.internal.nearby.zzg.zza();
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), java.util.concurrent.Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zza = java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zzb = null;
        this.zzc = false;
        this.zzd = new androidx.collection.SimpleArrayMap<>();
        this.zze = new androidx.collection.SimpleArrayMap<>();
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.nearby.zzfx zzfxVar, java.io.OutputStream outputStream, boolean z, long j) {
        try {
            outputStream.write(z ? 1 : 0);
        } catch (java.io.IOException e) {
            android.util.Log.w("NearbyConnections", java.lang.String.format("Unable to deliver status for Payload %d", java.lang.Long.valueOf(j)), e);
        } finally {
            com.google.android.gms.common.util.IOUtils.closeQuietly(outputStream);
        }
    }

    final synchronized void zza(java.io.InputStream inputStream, java.io.OutputStream outputStream, java.io.OutputStream outputStream2, com.google.android.gms.internal.nearby.zzgd zzgdVar, long j) {
        androidx.collection.SimpleArrayMap<java.lang.Long, java.io.OutputStream> simpleArrayMap = this.zzd;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        simpleArrayMap.put(lValueOf, outputStream);
        this.zze.put(lValueOf, zzgdVar);
        this.zza.execute(new com.google.android.gms.internal.nearby.zzfw(this, inputStream, outputStream, j, outputStream2));
    }

    final synchronized void zzb(long j) {
        androidx.collection.SimpleArrayMap<java.lang.Long, java.io.OutputStream> simpleArrayMap = this.zzd;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        com.google.android.gms.common.util.IOUtils.closeQuietly(simpleArrayMap.get(lValueOf));
        this.zzd.remove(lValueOf);
        com.google.android.gms.internal.nearby.zzgd zzgdVarRemove = this.zze.remove(lValueOf);
        if (zzgdVarRemove != null) {
            com.google.android.gms.common.util.IOUtils.closeQuietly(zzgdVarRemove.zzd());
            com.google.android.gms.common.util.IOUtils.closeQuietly(zzgdVarRemove.zzg());
        }
    }

    final synchronized void zzc() {
        this.zzc = true;
        this.zza.shutdownNow();
        com.google.android.gms.common.util.IOUtils.closeQuietly(this.zzb);
        for (int i = 0; i < this.zzd.size(); i++) {
            com.google.android.gms.common.util.IOUtils.closeQuietly(this.zzd.valueAt(i));
        }
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zze.size(); i2++) {
            com.google.android.gms.internal.nearby.zzgd zzgdVarValueAt = this.zze.valueAt(i2);
            com.google.android.gms.common.util.IOUtils.closeQuietly(zzgdVarValueAt.zzd());
            com.google.android.gms.common.util.IOUtils.closeQuietly(zzgdVarValueAt.zzg());
        }
        this.zze.clear();
    }
}

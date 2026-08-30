package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfw implements java.lang.Runnable {
    final /* synthetic */ java.io.InputStream zza;
    final /* synthetic */ java.io.OutputStream zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ java.io.OutputStream zzd;
    final /* synthetic */ com.google.android.gms.internal.nearby.zzfx zze;

    zzfw(com.google.android.gms.internal.nearby.zzfx zzfxVar, java.io.InputStream inputStream, java.io.OutputStream outputStream, long j, java.io.OutputStream outputStream2) {
        this.zze = zzfxVar;
        this.zza = inputStream;
        this.zzb = outputStream;
        this.zzc = j;
        this.zzd = outputStream2;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        this.zze.zzb = this.zza;
        boolean z = false;
        try {
            com.google.android.gms.common.util.IOUtils.copyStream(this.zza, this.zzb, false, 65536);
            com.google.android.gms.common.util.IOUtils.closeQuietly(this.zza);
            com.google.android.gms.internal.nearby.zzfx.zzf(this.zze, this.zzd, false, this.zzc);
        } catch (java.io.IOException e) {
            try {
                if (this.zze.zzc) {
                    android.util.Log.d("NearbyConnections", java.lang.String.format("Terminating copying stream for Payload %d due to shutdown of OutgoingPayloadStreamer.", java.lang.Long.valueOf(this.zzc)));
                } else {
                    android.util.Log.w("NearbyConnections", java.lang.String.format("Exception copying stream for Payload %d", java.lang.Long.valueOf(this.zzc)), e);
                }
                com.google.android.gms.common.util.IOUtils.closeQuietly(this.zza);
                com.google.android.gms.internal.nearby.zzfx.zzf(this.zze, this.zzd, true, this.zzc);
            } catch (java.lang.Throwable th) {
                th = th;
                z = true;
                com.google.android.gms.common.util.IOUtils.closeQuietly(this.zza);
                com.google.android.gms.internal.nearby.zzfx.zzf(this.zze, this.zzd, z, this.zzc);
                com.google.android.gms.common.util.IOUtils.closeQuietly(this.zzb);
                this.zze.zzb = null;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            com.google.android.gms.common.util.IOUtils.closeQuietly(this.zza);
            com.google.android.gms.internal.nearby.zzfx.zzf(this.zze, this.zzd, z, this.zzc);
            com.google.android.gms.common.util.IOUtils.closeQuietly(this.zzb);
            this.zze.zzb = null;
            throw th;
        }
        com.google.android.gms.common.util.IOUtils.closeQuietly(this.zzb);
        this.zze.zzb = null;
    }
}

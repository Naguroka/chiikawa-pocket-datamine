package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzzs extends android.view.Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final com.google.android.gms.internal.ads.zzzq zzd;
    private boolean zze;

    /* synthetic */ zzzs(com.google.android.gms.internal.ads.zzzq zzzqVar, android.graphics.SurfaceTexture surfaceTexture, boolean z, com.google.android.gms.internal.ads.zzzr zzzrVar) {
        super(surfaceTexture);
        this.zzd = zzzqVar;
        this.zza = z;
    }

    public static com.google.android.gms.internal.ads.zzzs zza(android.content.Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        com.google.android.gms.internal.ads.zzcw.zzf(z2);
        return new com.google.android.gms.internal.ads.zzzq().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(android.content.Context context) {
        int i;
        if (!zzc) {
            if (com.google.android.gms.internal.ads.zzdf.zzb(context)) {
                i = com.google.android.gms.internal.ads.zzdf.zzc() ? 1 : 2;
            } else {
                i = 0;
            }
            zzb = i;
            zzc = true;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}

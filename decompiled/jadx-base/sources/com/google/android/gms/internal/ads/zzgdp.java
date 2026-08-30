package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgdp {
    private final java.io.OutputStream zza;

    private zzgdp(java.io.OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static com.google.android.gms.internal.ads.zzgdp zzb(java.io.OutputStream outputStream) {
        return new com.google.android.gms.internal.ads.zzgdp(outputStream);
    }

    public final void zza(com.google.android.gms.internal.ads.zzgsx zzgsxVar) throws java.io.IOException {
        try {
            zzgsxVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcco {
    private long zza;

    public final long zza(java.nio.ByteBuffer byteBuffer) {
        com.google.android.gms.internal.ads.zzarc zzarcVar;
        com.google.android.gms.internal.ads.zzarb zzarbVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            java.util.Iterator it = new com.google.android.gms.internal.ads.zzaqx(new com.google.android.gms.internal.ads.zzccn(byteBufferDuplicate), com.google.android.gms.internal.ads.zzccr.zzb).zzd().iterator();
            while (true) {
                zzarcVar = null;
                if (!it.hasNext()) {
                    zzarbVar = null;
                    break;
                }
                com.google.android.gms.internal.ads.zzaqz zzaqzVar = (com.google.android.gms.internal.ads.zzaqz) it.next();
                if (zzaqzVar instanceof com.google.android.gms.internal.ads.zzarb) {
                    zzarbVar = (com.google.android.gms.internal.ads.zzarb) zzaqzVar;
                    break;
                }
            }
            for (com.google.android.gms.internal.ads.zzaqz zzaqzVar2 : zzarbVar.zzd()) {
                if (zzaqzVar2 instanceof com.google.android.gms.internal.ads.zzarc) {
                    zzarcVar = (com.google.android.gms.internal.ads.zzarc) zzaqzVar2;
                    break;
                }
            }
            long jZzc = (zzarcVar.zzc() * 1000) / zzarcVar.zzd();
            this.zza = jZzc;
            return jZzc;
        } catch (java.io.IOException | java.lang.RuntimeException unused) {
            return 0L;
        }
    }
}

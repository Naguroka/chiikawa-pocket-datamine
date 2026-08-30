package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzyh {
    private final java.util.concurrent.CopyOnWriteArrayList zza = new java.util.concurrent.CopyOnWriteArrayList();

    public final void zza(android.os.Handler handler, com.google.android.gms.internal.ads.zzyi zzyiVar) {
        zzc(zzyiVar);
        this.zza.add(new com.google.android.gms.internal.ads.zzyg(handler, zzyiVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        for (final com.google.android.gms.internal.ads.zzyg zzygVar : this.zza) {
            if (!zzygVar.zzc) {
                zzygVar.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzyf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzygVar.zzb.zzY(i, j, j2);
                    }
                });
            }
        }
    }

    public final void zzc(com.google.android.gms.internal.ads.zzyi zzyiVar) {
        for (com.google.android.gms.internal.ads.zzyg zzygVar : this.zza) {
            if (zzygVar.zzb == zzyiVar) {
                zzygVar.zzc();
                this.zza.remove(zzygVar);
            }
        }
    }
}

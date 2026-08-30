package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzapx {
    public static final boolean zza = com.google.android.gms.internal.ads.zzapy.zzb;
    private final java.util.List zzb = new java.util.ArrayList();
    private boolean zzc = false;

    zzapx() {
    }

    protected final void finalize() throws java.lang.Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        com.google.android.gms.internal.ads.zzapy.zzb("Marker log finalized without finish() - uncaught exit point for request", new java.lang.Object[0]);
    }

    public final synchronized void zza(java.lang.String str, long j) {
        if (this.zzc) {
            throw new java.lang.IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new com.google.android.gms.internal.ads.zzapw(str, j, android.os.SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(java.lang.String str) {
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            long j2 = ((com.google.android.gms.internal.ads.zzapw) this.zzb.get(0)).zzc;
            java.util.List list = this.zzb;
            j = ((com.google.android.gms.internal.ads.zzapw) list.get(list.size() - 1)).zzc - j2;
        }
        if (j > 0) {
            long j3 = ((com.google.android.gms.internal.ads.zzapw) this.zzb.get(0)).zzc;
            com.google.android.gms.internal.ads.zzapy.zza("(%-4d ms) %s", java.lang.Long.valueOf(j), str);
            for (com.google.android.gms.internal.ads.zzapw zzapwVar : this.zzb) {
                long j4 = zzapwVar.zzc;
                com.google.android.gms.internal.ads.zzapy.zza("(+%-4d) [%2d] %s", java.lang.Long.valueOf(j4 - j3), java.lang.Long.valueOf(zzapwVar.zzb), zzapwVar.zza);
                j3 = j4;
            }
        }
    }
}

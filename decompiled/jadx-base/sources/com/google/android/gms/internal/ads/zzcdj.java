package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcdj {
    private final java.util.ArrayList zza = new java.util.ArrayList();
    private long zzb;

    zzcdj() {
    }

    final long zza() {
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry entry : ((com.google.android.gms.internal.ads.zzgl) it.next()).zze().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((java.lang.String) entry.getKey())) {
                        this.zzb = java.lang.Math.max(this.zzb, java.lang.Long.parseLong((java.lang.String) ((java.util.List) entry.getValue()).get(0)));
                    }
                } catch (java.lang.RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.zzb;
    }

    final void zzb(com.google.android.gms.internal.ads.zzgl zzglVar) {
        this.zza.add(zzglVar);
    }
}

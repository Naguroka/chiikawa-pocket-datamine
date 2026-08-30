package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzctc {
    private final java.lang.Object zza = new java.lang.Object();
    private final java.util.concurrent.ConcurrentHashMap zzb = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.ConcurrentHashMap zzc = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.ConcurrentHashMap zzd = new java.util.concurrent.ConcurrentHashMap();

    public final int zza(java.lang.String str) {
        java.lang.Integer num = (java.lang.Integer) this.zzb.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzb(java.lang.String str) {
        java.lang.Long l = (java.lang.Long) this.zzd.get(str);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public final void zzc(java.lang.String str) {
        synchronized (this.zza) {
            java.lang.Integer num = (java.lang.Integer) this.zzb.get(str);
            this.zzb.put(str, num == null ? 1 : java.lang.Integer.valueOf(num.intValue() + 1));
        }
    }

    public final void zzd(java.lang.String str, java.lang.String str2, long j) {
        java.lang.Long l = (java.lang.Long) this.zzc.get(str2);
        if (l == null) {
            return;
        }
        this.zzc.remove(str2);
        this.zzd.put(str, java.lang.Long.valueOf(j - l.longValue()));
    }

    public final void zze(java.lang.String str, long j) {
        this.zzc.put(str, java.lang.Long.valueOf(j));
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawy extends com.google.android.gms.internal.ads.zzaxr {
    private final java.util.Map zzh;
    private final android.view.View zzi;
    private final android.content.Context zzj;

    public zzawy(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2, java.util.Map map, android.view.View view, android.content.Context context) {
        super(zzawdVar, "SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", zzascVar, i, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzc(int i) {
        java.util.Map map = this.zzh;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return ((java.lang.Long) this.zzh.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        long[] jArr = {zzc(1), zzc(2)};
        android.content.Context contextZzb = this.zzj;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke(null, jArr, contextZzb, this.zzi);
        long j = jArr2[0];
        this.zzh.put(1, java.lang.Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        this.zzh.put(2, java.lang.Long.valueOf(jArr2[3]));
        synchronized (this.zzd) {
            this.zzd.zzv(j);
            this.zzd.zzu(j2);
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxi extends com.google.android.gms.internal.ads.zzaxr {
    private final boolean zzh;

    public zzaxi(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", zzascVar, i, 61);
        this.zzh = zzawdVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        long jLongValue = ((java.lang.Long) this.zze.invoke(null, this.zza.zzb(), java.lang.Boolean.valueOf(this.zzh))).longValue();
        synchronized (this.zzd) {
            this.zzd.zzE(jLongValue);
        }
    }
}

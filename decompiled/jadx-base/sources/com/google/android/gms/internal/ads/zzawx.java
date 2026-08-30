package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawx extends com.google.android.gms.internal.ads.zzaxr {
    private final com.google.android.gms.internal.ads.zzawe zzh;

    public zzawx(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2, com.google.android.gms.internal.ads.zzawe zzaweVar) {
        super(zzawdVar, "e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", zzascVar, i, 85);
        this.zzh = zzaweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        long[] jArr = (long[]) this.zze.invoke(null, java.lang.Long.valueOf(this.zzh.zzd()), java.lang.Long.valueOf(this.zzh.zzh()), java.lang.Long.valueOf(this.zzh.zzb()), java.lang.Long.valueOf(this.zzh.zzf()));
        synchronized (this.zzd) {
            this.zzd.zzv(jArr[0]);
            this.zzd.zzu(jArr[1]);
        }
    }
}

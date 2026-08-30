package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzaxr implements java.util.concurrent.Callable {
    protected final com.google.android.gms.internal.ads.zzawd zza;
    protected final java.lang.String zzb;
    protected final java.lang.String zzc;
    protected final com.google.android.gms.internal.ads.zzasc zzd;
    protected java.lang.reflect.Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaxr(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2) {
        getClass().getSimpleName();
        this.zza = zzawdVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzascVar;
        this.zzf = i;
        this.zzg = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        zzk();
        return null;
    }

    protected abstract void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException;

    public java.lang.Void zzk() throws java.lang.Exception {
        int i;
        try {
            long jNanoTime = java.lang.System.nanoTime();
            java.lang.reflect.Method methodZzj = this.zza.zzj(this.zzb, this.zzc);
            this.zze = methodZzj;
            if (methodZzj == null) {
                return null;
            }
            zza();
            com.google.android.gms.internal.ads.zzauu zzauuVarZzd = this.zza.zzd();
            if (zzauuVarZzd == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzauuVarZzd.zzc(this.zzg, i, (java.lang.System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }
}

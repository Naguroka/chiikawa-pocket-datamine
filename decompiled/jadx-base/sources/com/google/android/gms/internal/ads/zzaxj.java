package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxj extends com.google.android.gms.internal.ads.zzaxr {
    private final java.lang.StackTraceElement[] zzh;

    public zzaxj(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2, java.lang.StackTraceElement[] stackTraceElementArr) {
        super(zzawdVar, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", zzascVar, i, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            com.google.android.gms.internal.ads.zzavu zzavuVar = new com.google.android.gms.internal.ads.zzavu((java.lang.String) this.zze.invoke(null, stackTraceElementArr));
            synchronized (this.zzd) {
                this.zzd.zzF(zzavuVar.zza.longValue());
                if (zzavuVar.zzb.booleanValue()) {
                    this.zzd.zzac(true != zzavuVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    this.zzd.zzac(3);
                }
            }
        }
    }
}

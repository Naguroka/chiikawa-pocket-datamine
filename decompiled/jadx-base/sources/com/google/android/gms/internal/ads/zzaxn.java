package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxn extends com.google.android.gms.internal.ads.zzaxr {
    public zzaxn(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", zzascVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        this.zzd.zzag(3);
        boolean zBooleanValue = ((java.lang.Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (this.zzd) {
            try {
                if (zBooleanValue) {
                    this.zzd.zzag(2);
                } else {
                    this.zzd.zzag(1);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}

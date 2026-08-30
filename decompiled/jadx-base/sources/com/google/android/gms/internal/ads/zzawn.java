package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawn extends com.google.android.gms.internal.ads.zzaxr {
    private final android.app.Activity zzh;
    private final android.view.View zzi;

    public zzawn(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2, android.view.View view, android.app.Activity activity) {
        super(zzawdVar, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", zzascVar, i, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (this.zzi == null) {
            return;
        }
        boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcJ)).booleanValue();
        java.lang.Object[] objArr = (java.lang.Object[]) this.zze.invoke(null, this.zzi, this.zzh, java.lang.Boolean.valueOf(zBooleanValue));
        synchronized (this.zzd) {
            this.zzd.zzc(((java.lang.Long) objArr[0]).longValue());
            this.zzd.zze(((java.lang.Long) objArr[1]).longValue());
            if (zBooleanValue) {
                this.zzd.zzd((java.lang.String) objArr[2]);
            }
        }
    }
}

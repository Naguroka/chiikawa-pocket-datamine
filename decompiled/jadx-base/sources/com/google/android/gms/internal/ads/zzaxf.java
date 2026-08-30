package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxf extends com.google.android.gms.internal.ads.zzaxr {
    public zzaxf(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", zzascVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        com.google.android.gms.internal.ads.zzavj zzavjVar = new com.google.android.gms.internal.ads.zzavj((java.lang.String) this.zze.invoke(null, this.zza.zzb(), java.lang.Boolean.valueOf(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcV)).booleanValue())));
        synchronized (this.zzd) {
            this.zzd.zzj(zzavjVar.zza);
            this.zzd.zzC(zzavjVar.zzb);
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxb extends com.google.android.gms.internal.ads.zzaxr {
    private final com.google.android.gms.internal.ads.zzavv zzh;

    public zzaxb(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2, com.google.android.gms.internal.ads.zzavv zzavvVar) {
        super(zzawdVar, "nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", zzascVar, i, 94);
        this.zzh = zzavvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        int iIntValue = ((java.lang.Integer) this.zze.invoke(null, this.zzh.zza())).intValue();
        synchronized (this.zzd) {
            this.zzd.zzae(com.google.android.gms.internal.ads.zzasp.zza(iIntValue));
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxl extends com.google.android.gms.internal.ads.zzaxr {
    private final com.google.android.gms.internal.ads.zzawk zzh;
    private long zzi;

    public zzaxl(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2, com.google.android.gms.internal.ads.zzawk zzawkVar) {
        super(zzawdVar, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", zzascVar, i, 53);
        this.zzh = zzawkVar;
        if (zzawkVar != null) {
            this.zzi = zzawkVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzP(((java.lang.Long) this.zze.invoke(null, java.lang.Long.valueOf(this.zzi))).longValue());
        }
    }
}

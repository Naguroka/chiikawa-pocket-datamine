package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxh extends com.google.android.gms.internal.ads.zzaxr {
    private java.util.List zzh;
    private final android.content.Context zzi;

    public zzaxh(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2, android.content.Context context) {
        super(zzawdVar, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", zzascVar, i, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        this.zzd.zzW(-1L);
        this.zzd.zzS(-1L);
        android.content.Context contextZzb = this.zzi;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (java.util.List) this.zze.invoke(null, contextZzb);
        }
        java.util.List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zzd) {
            this.zzd.zzW(((java.lang.Long) this.zzh.get(0)).longValue());
            this.zzd.zzS(((java.lang.Long) this.zzh.get(1)).longValue());
        }
    }
}

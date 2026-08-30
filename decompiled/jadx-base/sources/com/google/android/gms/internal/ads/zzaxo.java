package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxo extends com.google.android.gms.internal.ads.zzaxr {
    private final android.view.View zzh;

    public zzaxo(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2, android.view.View view) {
        super(zzawdVar, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", zzascVar, i, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (this.zzh != null) {
            java.lang.Boolean bool = (java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdy);
            java.lang.Boolean bool2 = (java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkP);
            com.google.android.gms.internal.ads.zzawh zzawhVar = new com.google.android.gms.internal.ads.zzawh((java.lang.String) this.zze.invoke(null, this.zzh, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            com.google.android.gms.internal.ads.zzasw zzaswVarZza = com.google.android.gms.internal.ads.zzasx.zza();
            zzaswVarZza.zzb(zzawhVar.zza.longValue());
            zzaswVarZza.zzd(zzawhVar.zzb.longValue());
            zzaswVarZza.zze(zzawhVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzaswVarZza.zzc(zzawhVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzaswVarZza.zza(zzawhVar.zzd.longValue());
            }
            this.zzd.zzY((com.google.android.gms.internal.ads.zzasx) zzaswVarZza.zzbr());
        }
    }
}

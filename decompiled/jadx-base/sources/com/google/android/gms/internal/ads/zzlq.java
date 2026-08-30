package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class zzlq {
    private final com.google.android.gms.internal.ads.zzik zza;

    @java.lang.Deprecated
    public zzlq(android.content.Context context, com.google.android.gms.internal.ads.zzced zzcedVar) {
        this.zza = new com.google.android.gms.internal.ads.zzik(context, zzcedVar);
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzlq zza(final com.google.android.gms.internal.ads.zzkg zzkgVar) {
        com.google.android.gms.internal.ads.zzik zzikVar = this.zza;
        com.google.android.gms.internal.ads.zzcw.zzf(!zzikVar.zzr);
        zzkgVar.getClass();
        zzikVar.zzf = new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzic
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return zzkgVar;
            }
        };
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzlq zzb(final com.google.android.gms.internal.ads.zzyb zzybVar) {
        com.google.android.gms.internal.ads.zzik zzikVar = this.zza;
        com.google.android.gms.internal.ads.zzcw.zzf(!zzikVar.zzr);
        zzybVar.getClass();
        zzikVar.zze = new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzij
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return zzybVar;
            }
        };
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzlr zzc() {
        com.google.android.gms.internal.ads.zzik zzikVar = this.zza;
        com.google.android.gms.internal.ads.zzcw.zzf(!zzikVar.zzr);
        zzikVar.zzr = true;
        return new com.google.android.gms.internal.ads.zzlr(zzikVar);
    }
}

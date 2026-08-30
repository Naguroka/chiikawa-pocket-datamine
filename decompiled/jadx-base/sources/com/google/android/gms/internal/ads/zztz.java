package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zztz extends com.google.android.gms.internal.ads.zztu {
    public static final java.lang.Object zzc = new java.lang.Object();
    private final java.lang.Object zzd;
    private final java.lang.Object zze;

    private zztz(com.google.android.gms.internal.ads.zzbq zzbqVar, java.lang.Object obj, java.lang.Object obj2) {
        super(zzbqVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static com.google.android.gms.internal.ads.zztz zzq(com.google.android.gms.internal.ads.zzar zzarVar) {
        return new com.google.android.gms.internal.ads.zztz(new com.google.android.gms.internal.ads.zzua(zzarVar), com.google.android.gms.internal.ads.zzbp.zza, zzc);
    }

    public static com.google.android.gms.internal.ads.zztz zzr(com.google.android.gms.internal.ads.zzbq zzbqVar, java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.zztz(zzbqVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final int zza(java.lang.Object obj) {
        java.lang.Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final com.google.android.gms.internal.ads.zzbo zzd(int i, com.google.android.gms.internal.ads.zzbo zzboVar, boolean z) {
        this.zzb.zzd(i, zzboVar, z);
        if (java.util.Objects.equals(zzboVar.zzb, this.zze) && z) {
            zzboVar.zzb = zzc;
        }
        return zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final com.google.android.gms.internal.ads.zzbp zze(int i, com.google.android.gms.internal.ads.zzbp zzbpVar, long j) {
        this.zzb.zze(i, zzbpVar, j);
        if (java.util.Objects.equals(zzbpVar.zzb, this.zzd)) {
            zzbpVar.zzb = com.google.android.gms.internal.ads.zzbp.zza;
        }
        return zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final java.lang.Object zzf(int i) {
        java.lang.Object objZzf = this.zzb.zzf(i);
        return java.util.Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    public final com.google.android.gms.internal.ads.zztz zzp(com.google.android.gms.internal.ads.zzbq zzbqVar) {
        return new com.google.android.gms.internal.ads.zztz(zzbqVar, this.zzd, this.zze);
    }
}

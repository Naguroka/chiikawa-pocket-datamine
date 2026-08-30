package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaaf implements com.google.android.gms.internal.ads.zzbl {
    private final com.google.android.gms.internal.ads.zzca zza;

    public zzaaf(com.google.android.gms.internal.ads.zzca zzcaVar) {
        this.zza = zzcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final com.google.android.gms.internal.ads.zzbm zza(android.content.Context context, com.google.android.gms.internal.ads.zzk zzkVar, com.google.android.gms.internal.ads.zzn zznVar, com.google.android.gms.internal.ads.zzcc zzccVar, java.util.concurrent.Executor executor, java.util.List list, long j) throws com.google.android.gms.internal.ads.zzbz {
        try {
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(com.google.android.gms.internal.ads.zzca.class);
            java.lang.Object[] objArr = new java.lang.Object[1];
            try {
                objArr[0] = this.zza;
                return ((com.google.android.gms.internal.ads.zzbl) constructor.newInstance(objArr)).zza(context, zzkVar, zznVar, zzccVar, executor, list, 0L);
            } catch (java.lang.Exception e) {
                e = e;
                if (e instanceof com.google.android.gms.internal.ads.zzbz) {
                    throw ((com.google.android.gms.internal.ads.zzbz) e);
                }
                throw new com.google.android.gms.internal.ads.zzbz(e, androidx.media3.common.C.TIME_UNSET);
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }
}

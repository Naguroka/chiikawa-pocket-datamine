package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaae implements com.google.android.gms.internal.ads.zzca {
    public static final /* synthetic */ int zza = 0;

    static {
        com.google.android.gms.internal.ads.zzfvj.zza(new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzaad
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                int i = com.google.android.gms.internal.ads.zzaae.zza;
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    java.lang.Object objInvoke = cls.getMethod("build", new java.lang.Class[0]).invoke(cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]), new java.lang.Object[0]);
                    objInvoke.getClass();
                    return (com.google.android.gms.internal.ads.zzca) objInvoke;
                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalStateException(e);
                }
            }
        });
    }

    private zzaae() {
        throw null;
    }

    /* synthetic */ zzaae(com.google.android.gms.internal.ads.zzaag zzaagVar) {
    }
}

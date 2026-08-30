package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfqf implements java.io.Closeable {
    public static com.google.android.gms.internal.ads.zzfqr zza() {
        return new com.google.android.gms.internal.ads.zzfqr();
    }

    public static com.google.android.gms.internal.ads.zzfqr zzb(final int i, com.google.android.gms.internal.ads.zzfqq zzfqqVar) {
        return new com.google.android.gms.internal.ads.zzfqr(new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqd
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return java.lang.Integer.valueOf(i);
            }
        }, new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqe
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return com.google.android.gms.internal.ads.zzfqf.zze();
            }
        }, zzfqqVar);
    }

    public static com.google.android.gms.internal.ads.zzfqr zzc(com.google.android.gms.internal.ads.zzfvf<java.lang.Integer> zzfvfVar, com.google.android.gms.internal.ads.zzfvf<java.lang.Integer> zzfvfVar2, com.google.android.gms.internal.ads.zzfqq zzfqqVar) {
        return new com.google.android.gms.internal.ads.zzfqr(zzfvfVar, zzfvfVar2, zzfqqVar);
    }

    static /* synthetic */ java.lang.Integer zze() {
        return -1;
    }
}

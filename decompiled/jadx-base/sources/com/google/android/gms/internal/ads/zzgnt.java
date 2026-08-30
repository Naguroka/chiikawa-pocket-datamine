package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgnt extends java.lang.RuntimeException {
    public zzgnt(java.lang.String str) {
        super(str);
    }

    public static java.lang.Object zza(com.google.android.gms.internal.ads.zzgns zzgnsVar) {
        try {
            return zzgnsVar.zza();
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.internal.ads.zzgnt(e);
        }
    }

    public zzgnt(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public zzgnt(java.lang.Throwable th) {
        super(th);
    }
}

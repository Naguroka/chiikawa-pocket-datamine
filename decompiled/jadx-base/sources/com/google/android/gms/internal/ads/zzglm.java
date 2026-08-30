package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzglm {
    private java.util.HashMap zza = new java.util.HashMap();

    public final com.google.android.gms.internal.ads.zzglo zza() {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("cannot call build() twice");
        }
        com.google.android.gms.internal.ads.zzglo zzgloVar = new com.google.android.gms.internal.ads.zzglo(java.util.Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgloVar;
    }
}

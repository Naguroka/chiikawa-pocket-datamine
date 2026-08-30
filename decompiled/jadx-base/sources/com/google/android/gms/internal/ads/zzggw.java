package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzggw extends com.google.android.gms.internal.ads.zzgeu {
    private final com.google.android.gms.internal.ads.zzggv zza;

    private zzggw(com.google.android.gms.internal.ads.zzggv zzggvVar) {
        this.zza = zzggvVar;
    }

    public static com.google.android.gms.internal.ads.zzggw zzc(com.google.android.gms.internal.ads.zzggv zzggvVar) {
        return new com.google.android.gms.internal.ads.zzggw(zzggvVar);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.internal.ads.zzggw) && ((com.google.android.gms.internal.ads.zzggw) obj).zza == this.zza;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzggw.class, this.zza);
    }

    public final java.lang.String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza != com.google.android.gms.internal.ads.zzggv.zzc;
    }

    public final com.google.android.gms.internal.ads.zzggv zzb() {
        return this.zza;
    }
}

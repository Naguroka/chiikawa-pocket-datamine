package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgir extends com.google.android.gms.internal.ads.zzgeu {
    private final com.google.android.gms.internal.ads.zzgiq zza;

    private zzgir(com.google.android.gms.internal.ads.zzgiq zzgiqVar) {
        this.zza = zzgiqVar;
    }

    public static com.google.android.gms.internal.ads.zzgir zzc(com.google.android.gms.internal.ads.zzgiq zzgiqVar) {
        return new com.google.android.gms.internal.ads.zzgir(zzgiqVar);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.internal.ads.zzgir) && ((com.google.android.gms.internal.ads.zzgir) obj).zza == this.zza;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzgir.class, this.zza);
    }

    public final java.lang.String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza != com.google.android.gms.internal.ads.zzgiq.zzc;
    }

    public final com.google.android.gms.internal.ads.zzgiq zzb() {
        return this.zza;
    }
}

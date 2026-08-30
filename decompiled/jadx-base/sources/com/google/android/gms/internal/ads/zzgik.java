package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgik extends com.google.android.gms.internal.ads.zzgeu {
    private final com.google.android.gms.internal.ads.zzgij zza;
    private final int zzb;

    private zzgik(com.google.android.gms.internal.ads.zzgij zzgijVar, int i) {
        this.zza = zzgijVar;
        this.zzb = i;
    }

    public static com.google.android.gms.internal.ads.zzgik zzd(com.google.android.gms.internal.ads.zzgij zzgijVar, int i) throws java.security.GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new java.security.GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new com.google.android.gms.internal.ads.zzgik(zzgijVar, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgik)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgik zzgikVar = (com.google.android.gms.internal.ads.zzgik) obj;
        return zzgikVar.zza == this.zza && zzgikVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzgik.class, this.zza, java.lang.Integer.valueOf(this.zzb));
    }

    public final java.lang.String toString() {
        return "X-AES-GCM Parameters (variant: " + this.zza.toString() + "salt_size_bytes: " + this.zzb + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza != com.google.android.gms.internal.ads.zzgij.zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzgij zzc() {
        return this.zza;
    }
}

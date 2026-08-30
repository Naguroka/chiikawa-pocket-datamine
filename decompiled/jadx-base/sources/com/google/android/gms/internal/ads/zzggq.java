package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzggq extends com.google.android.gms.internal.ads.zzgeu {
    private final int zza;
    private final com.google.android.gms.internal.ads.zzggo zzb;

    /* synthetic */ zzggq(int i, com.google.android.gms.internal.ads.zzggo zzggoVar, com.google.android.gms.internal.ads.zzggp zzggpVar) {
        this.zza = i;
        this.zzb = zzggoVar;
    }

    public static com.google.android.gms.internal.ads.zzggn zzc() {
        return new com.google.android.gms.internal.ads.zzggn(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzggq)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzggq zzggqVar = (com.google.android.gms.internal.ads.zzggq) obj;
        return zzggqVar.zza == this.zza && zzggqVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzggq.class, java.lang.Integer.valueOf(this.zza), this.zzb);
    }

    public final java.lang.String toString() {
        return "AesGcmSiv Parameters (variant: " + java.lang.String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzb != com.google.android.gms.internal.ads.zzggo.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzggo zzd() {
        return this.zzb;
    }
}

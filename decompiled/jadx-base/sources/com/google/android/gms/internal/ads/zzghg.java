package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzghg extends com.google.android.gms.internal.ads.zzgeu {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzghf zzb;

    private zzghg(java.lang.String str, com.google.android.gms.internal.ads.zzghf zzghfVar) {
        this.zza = str;
        this.zzb = zzghfVar;
    }

    public static com.google.android.gms.internal.ads.zzghg zzc(java.lang.String str, com.google.android.gms.internal.ads.zzghf zzghfVar) {
        return new com.google.android.gms.internal.ads.zzghg(str, zzghfVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzghg)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzghg zzghgVar = (com.google.android.gms.internal.ads.zzghg) obj;
        return zzghgVar.zza.equals(this.zza) && zzghgVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzghg.class, this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + this.zzb.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzb != com.google.android.gms.internal.ads.zzghf.zzb;
    }

    public final com.google.android.gms.internal.ads.zzghf zzb() {
        return this.zzb;
    }

    public final java.lang.String zzd() {
        return this.zza;
    }
}

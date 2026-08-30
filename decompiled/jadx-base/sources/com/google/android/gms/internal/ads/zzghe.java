package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzghe extends com.google.android.gms.internal.ads.zzget {
    private final com.google.android.gms.internal.ads.zzghg zza;
    private final com.google.android.gms.internal.ads.zzgvo zzb;

    @javax.annotation.Nullable
    private final java.lang.Integer zzc;

    private zzghe(com.google.android.gms.internal.ads.zzghg zzghgVar, com.google.android.gms.internal.ads.zzgvo zzgvoVar, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = zzghgVar;
        this.zzb = zzgvoVar;
        this.zzc = num;
    }

    public static com.google.android.gms.internal.ads.zzghe zza(com.google.android.gms.internal.ads.zzghg zzghgVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb;
        if (zzghgVar.zzb() == com.google.android.gms.internal.ads.zzghf.zza) {
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgvo.zzb(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzghgVar.zzb() != com.google.android.gms.internal.ads.zzghf.zzb) {
                throw new java.security.GeneralSecurityException("Unknown Variant: ".concat(zzghgVar.zzb().toString()));
            }
            if (num != null) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgvo.zzb(new byte[0]);
        }
        return new com.google.android.gms.internal.ads.zzghe(zzghgVar, zzgvoVarZzb, num);
    }

    public final com.google.android.gms.internal.ads.zzghg zzb() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzgvo zzc() {
        return this.zzb;
    }

    public final java.lang.Integer zzd() {
        return this.zzc;
    }
}

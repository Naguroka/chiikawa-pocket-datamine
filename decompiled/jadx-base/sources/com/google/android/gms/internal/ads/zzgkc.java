package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgkc implements com.google.android.gms.internal.ads.zzgdn {
    private final com.google.android.gms.internal.ads.zzgdn zza;
    private final byte[] zzb;

    private zzgkc(com.google.android.gms.internal.ads.zzgdn zzgdnVar, byte[] bArr) {
        this.zza = zzgdnVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new java.lang.IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static com.google.android.gms.internal.ads.zzgdn zzb(com.google.android.gms.internal.ads.zzglk zzglkVar) throws java.security.GeneralSecurityException {
        byte[] bArrZzc;
        com.google.android.gms.internal.ads.zzgnh zzgnhVarZza = zzglkVar.zza(com.google.android.gms.internal.ads.zzgdw.zza());
        com.google.android.gms.internal.ads.zzgsi zzgsiVarZza = com.google.android.gms.internal.ads.zzgsl.zza();
        zzgsiVarZza.zzb(zzgnhVarZza.zzg());
        zzgsiVarZza.zzc(zzgnhVarZza.zze());
        zzgsiVarZza.zza(zzgnhVarZza.zzb());
        com.google.android.gms.internal.ads.zzgdn zzgdnVar = (com.google.android.gms.internal.ads.zzgdn) com.google.android.gms.internal.ads.zzgen.zzb((com.google.android.gms.internal.ads.zzgsl) zzgsiVarZza.zzbr(), com.google.android.gms.internal.ads.zzgdn.class);
        com.google.android.gms.internal.ads.zzgtp zzgtpVarZzc = zzgnhVarZza.zzc();
        int iOrdinal = zzgtpVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = com.google.android.gms.internal.ads.zzgml.zzb(zzglkVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = com.google.android.gms.internal.ads.zzgml.zza(zzglkVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("unknown output prefix type ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzgtpVarZzc))));
            }
            bArrZzc = com.google.android.gms.internal.ads.zzgml.zza(zzglkVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = com.google.android.gms.internal.ads.zzgml.zza.zzc();
        }
        return new com.google.android.gms.internal.ads.zzgkc(zzgdnVar, bArrZzc);
    }

    public static com.google.android.gms.internal.ads.zzgdn zzc(com.google.android.gms.internal.ads.zzgdn zzgdnVar, com.google.android.gms.internal.ads.zzgvo zzgvoVar) {
        return new com.google.android.gms.internal.ads.zzgkc(zzgdnVar, zzgvoVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (com.google.android.gms.internal.ads.zzgnu.zzc(bArr3, bArr)) {
            return this.zza.zza(java.util.Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new java.security.GeneralSecurityException("wrong prefix");
    }
}

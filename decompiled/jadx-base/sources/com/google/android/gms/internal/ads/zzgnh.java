package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgnh implements com.google.android.gms.internal.ads.zzgnm {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzgvo zzb;
    private final com.google.android.gms.internal.ads.zzgwj zzc;
    private final com.google.android.gms.internal.ads.zzgsj zzd;
    private final com.google.android.gms.internal.ads.zzgtp zze;

    @javax.annotation.Nullable
    private final java.lang.Integer zzf;

    private zzgnh(java.lang.String str, com.google.android.gms.internal.ads.zzgvo zzgvoVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgsj zzgsjVar, com.google.android.gms.internal.ads.zzgtp zzgtpVar, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = str;
        this.zzb = zzgvoVar;
        this.zzc = zzgwjVar;
        this.zzd = zzgsjVar;
        this.zze = zzgtpVar;
        this.zzf = num;
    }

    public static com.google.android.gms.internal.ads.zzgnh zza(java.lang.String str, com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgsj zzgsjVar, com.google.android.gms.internal.ads.zzgtp zzgtpVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (zzgtpVar == com.google.android.gms.internal.ads.zzgtp.RAW) {
            if (num != null) {
                throw new java.security.GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new java.security.GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new com.google.android.gms.internal.ads.zzgnh(str, com.google.android.gms.internal.ads.zzgnu.zza(str), zzgwjVar, zzgsjVar, zzgtpVar, num);
    }

    public final com.google.android.gms.internal.ads.zzgsj zzb() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzgtp zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final com.google.android.gms.internal.ads.zzgvo zzd() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzgwj zze() {
        return this.zzc;
    }

    @javax.annotation.Nullable
    public final java.lang.Integer zzf() {
        return this.zzf;
    }

    public final java.lang.String zzg() {
        return this.zza;
    }
}

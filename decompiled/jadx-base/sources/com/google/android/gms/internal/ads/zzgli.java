package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgli implements com.google.android.gms.internal.ads.zzgdy {
    final java.lang.String zza;
    final java.lang.Class zzb;
    final com.google.android.gms.internal.ads.zzgsj zzc;

    zzgli(java.lang.String str, java.lang.Class cls, com.google.android.gms.internal.ads.zzgsj zzgsjVar, com.google.android.gms.internal.ads.zzgzk zzgzkVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgsjVar;
    }

    public static com.google.android.gms.internal.ads.zzgdy zzd(java.lang.String str, java.lang.Class cls, com.google.android.gms.internal.ads.zzgsj zzgsjVar, com.google.android.gms.internal.ads.zzgzk zzgzkVar) {
        return new com.google.android.gms.internal.ads.zzgli(str, cls, zzgsjVar, zzgzkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdy
    public final com.google.android.gms.internal.ads.zzgsl zza(com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZza = com.google.android.gms.internal.ads.zzgsp.zza();
        zzgsnVarZza.zzb(this.zza);
        zzgsnVarZza.zzc(zzgwjVar);
        zzgsnVarZza.zza(com.google.android.gms.internal.ads.zzgtp.RAW);
        com.google.android.gms.internal.ads.zzgnh zzgnhVar = (com.google.android.gms.internal.ads.zzgnh) com.google.android.gms.internal.ads.zzgmk.zzc().zzd(com.google.android.gms.internal.ads.zzgma.zzb().zza(com.google.android.gms.internal.ads.zzgmk.zzc().zzb(com.google.android.gms.internal.ads.zzgni.zza((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZza.zzbr())), null), com.google.android.gms.internal.ads.zzgnh.class, com.google.android.gms.internal.ads.zzgdw.zza());
        com.google.android.gms.internal.ads.zzgsi zzgsiVarZza = com.google.android.gms.internal.ads.zzgsl.zza();
        zzgsiVarZza.zzb(zzgnhVar.zzg());
        zzgsiVarZza.zzc(zzgnhVar.zze());
        zzgsiVarZza.zza(zzgnhVar.zzb());
        return (com.google.android.gms.internal.ads.zzgsl) zzgsiVarZza.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzgdy
    public final java.lang.Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgdy
    public final java.lang.Object zzc(com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws java.security.GeneralSecurityException {
        return com.google.android.gms.internal.ads.zzgmh.zza().zzc(com.google.android.gms.internal.ads.zzgmk.zzc().zza(com.google.android.gms.internal.ads.zzgnh.zza(this.zza, zzgwjVar, this.zzc, com.google.android.gms.internal.ads.zzgtp.RAW, null), com.google.android.gms.internal.ads.zzgdw.zza()), this.zzb);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzghn {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzghp zza;

    @javax.annotation.Nullable
    private java.lang.String zzb;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgho zzc;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgeu zzd;

    private zzghn() {
        throw null;
    }

    /* synthetic */ zzghn(com.google.android.gms.internal.ads.zzghq zzghqVar) {
    }

    public final com.google.android.gms.internal.ads.zzghn zza(com.google.android.gms.internal.ads.zzgeu zzgeuVar) {
        this.zzd = zzgeuVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzghn zzb(com.google.android.gms.internal.ads.zzgho zzghoVar) {
        this.zzc = zzghoVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzghn zzc(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzghn zzd(com.google.android.gms.internal.ads.zzghp zzghpVar) {
        this.zza = zzghpVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzghr zze() throws java.security.GeneralSecurityException {
        if (this.zza == null) {
            this.zza = com.google.android.gms.internal.ads.zzghp.zzb;
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("kekUri must be set");
        }
        com.google.android.gms.internal.ads.zzgho zzghoVar = this.zzc;
        if (zzghoVar == null) {
            throw new java.security.GeneralSecurityException("dekParsingStrategy must be set");
        }
        com.google.android.gms.internal.ads.zzgeu zzgeuVar = this.zzd;
        if (zzgeuVar == null) {
            throw new java.security.GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzgeuVar.zza()) {
            throw new java.security.GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzghoVar.equals(com.google.android.gms.internal.ads.zzgho.zza) && (zzgeuVar instanceof com.google.android.gms.internal.ads.zzggf)) || ((zzghoVar.equals(com.google.android.gms.internal.ads.zzgho.zzc) && (zzgeuVar instanceof com.google.android.gms.internal.ads.zzggw)) || ((zzghoVar.equals(com.google.android.gms.internal.ads.zzgho.zzb) && (zzgeuVar instanceof com.google.android.gms.internal.ads.zzgir)) || ((zzghoVar.equals(com.google.android.gms.internal.ads.zzgho.zzd) && (zzgeuVar instanceof com.google.android.gms.internal.ads.zzgfk)) || ((zzghoVar.equals(com.google.android.gms.internal.ads.zzgho.zze) && (zzgeuVar instanceof com.google.android.gms.internal.ads.zzgfu)) || (zzghoVar.equals(com.google.android.gms.internal.ads.zzgho.zzf) && (zzgeuVar instanceof com.google.android.gms.internal.ads.zzggq))))))) {
            return new com.google.android.gms.internal.ads.zzghr(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        throw new java.security.GeneralSecurityException("Cannot use parsing strategy " + this.zzc.toString() + " when new keys are picked according to " + java.lang.String.valueOf(this.zzd) + ".");
    }
}

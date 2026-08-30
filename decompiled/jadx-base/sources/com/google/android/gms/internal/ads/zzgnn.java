package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgnn {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;

    public zzgnn() {
        this.zza = new java.util.HashMap();
        this.zzb = new java.util.HashMap();
        this.zzc = new java.util.HashMap();
        this.zzd = new java.util.HashMap();
    }

    public final com.google.android.gms.internal.ads.zzgnn zza(com.google.android.gms.internal.ads.zzgld zzgldVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgno zzgnoVar = new com.google.android.gms.internal.ads.zzgno(zzgldVar.zzd(), zzgldVar.zzc(), null);
        if (this.zzb.containsKey(zzgnoVar)) {
            com.google.android.gms.internal.ads.zzgld zzgldVar2 = (com.google.android.gms.internal.ads.zzgld) this.zzb.get(zzgnoVar);
            if (!zzgldVar2.equals(zzgldVar) || !zzgldVar.equals(zzgldVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgnoVar.toString()));
            }
        } else {
            this.zzb.put(zzgnoVar, zzgldVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgnn zzb(com.google.android.gms.internal.ads.zzglh zzglhVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgnp zzgnpVar = new com.google.android.gms.internal.ads.zzgnp(zzglhVar.zzc(), zzglhVar.zzd(), null);
        if (this.zza.containsKey(zzgnpVar)) {
            com.google.android.gms.internal.ads.zzglh zzglhVar2 = (com.google.android.gms.internal.ads.zzglh) this.zza.get(zzgnpVar);
            if (!zzglhVar2.equals(zzglhVar) || !zzglhVar.equals(zzglhVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgnpVar.toString()));
            }
        } else {
            this.zza.put(zzgnpVar, zzglhVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgnn zzc(com.google.android.gms.internal.ads.zzgmp zzgmpVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgno zzgnoVar = new com.google.android.gms.internal.ads.zzgno(zzgmpVar.zzd(), zzgmpVar.zzc(), null);
        if (this.zzd.containsKey(zzgnoVar)) {
            com.google.android.gms.internal.ads.zzgmp zzgmpVar2 = (com.google.android.gms.internal.ads.zzgmp) this.zzd.get(zzgnoVar);
            if (!zzgmpVar2.equals(zzgmpVar) || !zzgmpVar.equals(zzgmpVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgnoVar.toString()));
            }
        } else {
            this.zzd.put(zzgnoVar, zzgmpVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgnn zzd(com.google.android.gms.internal.ads.zzgmt zzgmtVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgnp zzgnpVar = new com.google.android.gms.internal.ads.zzgnp(zzgmtVar.zzc(), zzgmtVar.zzd(), null);
        if (this.zzc.containsKey(zzgnpVar)) {
            com.google.android.gms.internal.ads.zzgmt zzgmtVar2 = (com.google.android.gms.internal.ads.zzgmt) this.zzc.get(zzgnpVar);
            if (!zzgmtVar2.equals(zzgmtVar) || !zzgmtVar.equals(zzgmtVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgnpVar.toString()));
            }
        } else {
            this.zzc.put(zzgnpVar, zzgmtVar);
        }
        return this;
    }

    public zzgnn(com.google.android.gms.internal.ads.zzgnr zzgnrVar) {
        this.zza = new java.util.HashMap(zzgnrVar.zza);
        this.zzb = new java.util.HashMap(zzgnrVar.zzb);
        this.zzc = new java.util.HashMap(zzgnrVar.zzc);
        this.zzd = new java.util.HashMap(zzgnrVar.zzd);
    }
}

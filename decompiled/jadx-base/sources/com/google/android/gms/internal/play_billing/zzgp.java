package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgp implements com.google.android.gms.internal.play_billing.zzgv {
    private final com.google.android.gms.internal.play_billing.zzgl zza;
    private final com.google.android.gms.internal.play_billing.zzhh zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.play_billing.zzev zzd;

    private zzgp(com.google.android.gms.internal.play_billing.zzhh zzhhVar, com.google.android.gms.internal.play_billing.zzev zzevVar, com.google.android.gms.internal.play_billing.zzgl zzglVar) {
        this.zzb = zzhhVar;
        this.zzc = zzglVar instanceof com.google.android.gms.internal.play_billing.zzff;
        this.zzd = zzevVar;
        this.zza = zzglVar;
    }

    static com.google.android.gms.internal.play_billing.zzgp zzc(com.google.android.gms.internal.play_billing.zzhh zzhhVar, com.google.android.gms.internal.play_billing.zzev zzevVar, com.google.android.gms.internal.play_billing.zzgl zzglVar) {
        return new com.google.android.gms.internal.play_billing.zzgp(zzhhVar, zzevVar, zzglVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zza(java.lang.Object obj) {
        int iZzb = ((com.google.android.gms.internal.play_billing.zzfi) obj).zzc.zzb();
        return this.zzc ? iZzb + ((com.google.android.gms.internal.play_billing.zzff) obj).zzb.zzd() : iZzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zzb(java.lang.Object obj) {
        int iHashCode = ((com.google.android.gms.internal.play_billing.zzfi) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((com.google.android.gms.internal.play_billing.zzff) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final java.lang.Object zze() {
        com.google.android.gms.internal.play_billing.zzgl zzglVar = this.zza;
        return zzglVar instanceof com.google.android.gms.internal.play_billing.zzfi ? ((com.google.android.gms.internal.play_billing.zzfi) zzglVar).zzo() : zzglVar.zzK().zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzf(java.lang.Object obj) {
        this.zzb.zzb(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzg(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.zzgx.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            com.google.android.gms.internal.play_billing.zzgx.zzo(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzh(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.play_billing.zzdw zzdwVar) throws java.io.IOException {
        com.google.android.gms.internal.play_billing.zzfi zzfiVar = (com.google.android.gms.internal.play_billing.zzfi) obj;
        if (zzfiVar.zzc == com.google.android.gms.internal.play_billing.zzhi.zzc()) {
            zzfiVar.zzc = com.google.android.gms.internal.play_billing.zzhi.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzi(java.lang.Object obj, com.google.android.gms.internal.play_billing.zzhu zzhuVar) throws java.io.IOException {
        java.util.Iterator itZzf = ((com.google.android.gms.internal.play_billing.zzff) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) itZzf.next();
            com.google.android.gms.internal.play_billing.zzey zzeyVar = (com.google.android.gms.internal.play_billing.zzey) entry.getKey();
            if (zzeyVar.zzc() != com.google.android.gms.internal.play_billing.zzht.MESSAGE || zzeyVar.zze() || zzeyVar.zzd()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof com.google.android.gms.internal.play_billing.zzfs) {
                zzhuVar.zzw(zzeyVar.zza(), ((com.google.android.gms.internal.play_billing.zzfs) entry).zza().zzb());
            } else {
                zzhuVar.zzw(zzeyVar.zza(), entry.getValue());
            }
        }
        ((com.google.android.gms.internal.play_billing.zzfi) obj).zzc.zzk(zzhuVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzj(java.lang.Object obj, java.lang.Object obj2) {
        if (!((com.google.android.gms.internal.play_billing.zzfi) obj).zzc.equals(((com.google.android.gms.internal.play_billing.zzfi) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((com.google.android.gms.internal.play_billing.zzff) obj).zzb.equals(((com.google.android.gms.internal.play_billing.zzff) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzk(java.lang.Object obj) {
        return ((com.google.android.gms.internal.play_billing.zzff) obj).zzb.zzi();
    }
}

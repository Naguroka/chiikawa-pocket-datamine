package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zznl implements com.google.android.gms.internal.measurement.zzns {
    private final com.google.android.gms.internal.measurement.zznh zza;
    private final com.google.android.gms.internal.measurement.zzoe zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.measurement.zzlq zzd;

    private zznl(com.google.android.gms.internal.measurement.zzoe zzoeVar, com.google.android.gms.internal.measurement.zzlq zzlqVar, com.google.android.gms.internal.measurement.zznh zznhVar) {
        this.zzb = zzoeVar;
        this.zzc = zznhVar instanceof com.google.android.gms.internal.measurement.zzma;
        this.zzd = zzlqVar;
        this.zza = zznhVar;
    }

    static com.google.android.gms.internal.measurement.zznl zzc(com.google.android.gms.internal.measurement.zzoe zzoeVar, com.google.android.gms.internal.measurement.zzlq zzlqVar, com.google.android.gms.internal.measurement.zznh zznhVar) {
        return new com.google.android.gms.internal.measurement.zznl(zzoeVar, zzlqVar, zznhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zza(java.lang.Object obj) {
        int iZzb = ((com.google.android.gms.internal.measurement.zzmd) obj).zzc.zzb();
        return this.zzc ? iZzb + ((com.google.android.gms.internal.measurement.zzma) obj).zzb.zzc() : iZzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zzb(java.lang.Object obj) {
        int iHashCode = ((com.google.android.gms.internal.measurement.zzmd) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((com.google.android.gms.internal.measurement.zzma) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final java.lang.Object zze() {
        com.google.android.gms.internal.measurement.zznh zznhVar = this.zza;
        return zznhVar instanceof com.google.android.gms.internal.measurement.zzmd ? ((com.google.android.gms.internal.measurement.zzmd) zznhVar).zzcj() : zznhVar.zzcA().zzbc();
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzf(java.lang.Object obj) {
        this.zzb.zza(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzg(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.zznu.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            com.google.android.gms.internal.measurement.zznu.zzo(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzh(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzks zzksVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzmd zzmdVar = (com.google.android.gms.internal.measurement.zzmd) obj;
        if (zzmdVar.zzc == com.google.android.gms.internal.measurement.zzof.zzc()) {
            zzmdVar.zzc = com.google.android.gms.internal.measurement.zzof.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzi(java.lang.Object obj, com.google.android.gms.internal.measurement.zzor zzorVar) throws java.io.IOException {
        java.util.Iterator itZze = ((com.google.android.gms.internal.measurement.zzma) obj).zzb.zze();
        while (itZze.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) itZze.next();
            com.google.android.gms.internal.measurement.zzlt zzltVar = (com.google.android.gms.internal.measurement.zzlt) entry.getKey();
            if (zzltVar.zzc() != com.google.android.gms.internal.measurement.zzoq.MESSAGE || zzltVar.zze() || zzltVar.zzd()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof com.google.android.gms.internal.measurement.zzmo) {
                zzorVar.zzw(zzltVar.zza(), ((com.google.android.gms.internal.measurement.zzmo) entry).zza().zzb());
            } else {
                zzorVar.zzw(zzltVar.zza(), entry.getValue());
            }
        }
        ((com.google.android.gms.internal.measurement.zzmd) obj).zzc.zzk(zzorVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzj(java.lang.Object obj, java.lang.Object obj2) {
        if (!((com.google.android.gms.internal.measurement.zzmd) obj).zzc.equals(((com.google.android.gms.internal.measurement.zzmd) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((com.google.android.gms.internal.measurement.zzma) obj).zzb.equals(((com.google.android.gms.internal.measurement.zzma) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzk(java.lang.Object obj) {
        return ((com.google.android.gms.internal.measurement.zzma) obj).zzb.zzh();
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgzg implements com.google.android.gms.internal.ads.zzgzv {
    private final com.google.android.gms.internal.ads.zzgzc zza;
    private final com.google.android.gms.internal.ads.zzhah zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.ads.zzgxc zzd;

    private zzgzg(com.google.android.gms.internal.ads.zzhah zzhahVar, com.google.android.gms.internal.ads.zzgxc zzgxcVar, com.google.android.gms.internal.ads.zzgzc zzgzcVar) {
        this.zzb = zzhahVar;
        this.zzc = zzgzcVar instanceof com.google.android.gms.internal.ads.zzgxn;
        this.zzd = zzgxcVar;
        this.zza = zzgzcVar;
    }

    static com.google.android.gms.internal.ads.zzgzg zzc(com.google.android.gms.internal.ads.zzhah zzhahVar, com.google.android.gms.internal.ads.zzgxc zzgxcVar, com.google.android.gms.internal.ads.zzgzc zzgzcVar) {
        return new com.google.android.gms.internal.ads.zzgzg(zzhahVar, zzgxcVar, zzgzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final int zza(java.lang.Object obj) {
        int iZzb = ((com.google.android.gms.internal.ads.zzgxr) obj).zzt.zzb();
        return this.zzc ? iZzb + ((com.google.android.gms.internal.ads.zzgxn) obj).zza.zzd() : iZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final int zzb(java.lang.Object obj) {
        int iHashCode = ((com.google.android.gms.internal.ads.zzgxr) obj).zzt.hashCode();
        return this.zzc ? (iHashCode * 53) + ((com.google.android.gms.internal.ads.zzgxn) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final java.lang.Object zze() {
        com.google.android.gms.internal.ads.zzgzc zzgzcVar = this.zza;
        return zzgzcVar instanceof com.google.android.gms.internal.ads.zzgxr ? ((com.google.android.gms.internal.ads.zzgxr) zzgzcVar).zzbj() : zzgzcVar.zzcX().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzf(java.lang.Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzg(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzgzx.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            com.google.android.gms.internal.ads.zzgzx.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzh(java.lang.Object obj, com.google.android.gms.internal.ads.zzgzp zzgzpVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        this.zzb.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzi(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzgvx zzgvxVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgxr zzgxrVar = (com.google.android.gms.internal.ads.zzgxr) obj;
        if (zzgxrVar.zzt == com.google.android.gms.internal.ads.zzhai.zzc()) {
            zzgxrVar.zzt = com.google.android.gms.internal.ads.zzhai.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzj(java.lang.Object obj, com.google.android.gms.internal.ads.zzhaw zzhawVar) throws java.io.IOException {
        java.util.Iterator itZzf = ((com.google.android.gms.internal.ads.zzgxn) obj).zza.zzf();
        while (itZzf.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) itZzf.next();
            com.google.android.gms.internal.ads.zzgxf zzgxfVar = (com.google.android.gms.internal.ads.zzgxf) entry.getKey();
            if (zzgxfVar.zzc() != com.google.android.gms.internal.ads.zzhav.MESSAGE || zzgxfVar.zze() || zzgxfVar.zzd()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof com.google.android.gms.internal.ads.zzgyj) {
                zzhawVar.zzw(zzgxfVar.zza(), ((com.google.android.gms.internal.ads.zzgyj) entry).zza().zzb());
            } else {
                zzhawVar.zzw(zzgxfVar.zza(), entry.getValue());
            }
        }
        ((com.google.android.gms.internal.ads.zzgxr) obj).zzt.zzk(zzhawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzk(java.lang.Object obj, java.lang.Object obj2) {
        if (!((com.google.android.gms.internal.ads.zzgxr) obj).zzt.equals(((com.google.android.gms.internal.ads.zzgxr) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((com.google.android.gms.internal.ads.zzgxn) obj).zza.equals(((com.google.android.gms.internal.ads.zzgxn) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzl(java.lang.Object obj) {
        return ((com.google.android.gms.internal.ads.zzgxn) obj).zza.zzi();
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zznw {
    private final com.google.android.gms.internal.ads.zzbo zza;
    private com.google.android.gms.internal.ads.zzfxn zzb = com.google.android.gms.internal.ads.zzfxn.zzn();
    private com.google.android.gms.internal.ads.zzfxq zzc = com.google.android.gms.internal.ads.zzfxq.zzd();
    private com.google.android.gms.internal.ads.zzug zzd;
    private com.google.android.gms.internal.ads.zzug zze;
    private com.google.android.gms.internal.ads.zzug zzf;

    public zznw(com.google.android.gms.internal.ads.zzbo zzboVar) {
        this.zza = zzboVar;
    }

    private static com.google.android.gms.internal.ads.zzug zzj(com.google.android.gms.internal.ads.zzbk zzbkVar, com.google.android.gms.internal.ads.zzfxn zzfxnVar, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzbo zzboVar) {
        com.google.android.gms.internal.ads.zzbq zzbqVarZzn = zzbkVar.zzn();
        int iZze = zzbkVar.zze();
        java.lang.Object objZzf = zzbqVarZzn.zzo() ? null : zzbqVarZzn.zzf(iZze);
        int iZzc = (zzbkVar.zzw() || zzbqVarZzn.zzo()) ? -1 : zzbqVarZzn.zzd(iZze, zzboVar, false).zzc(com.google.android.gms.internal.ads.zzei.zzs(zzbkVar.zzk()));
        for (int i = 0; i < zzfxnVar.size(); i++) {
            com.google.android.gms.internal.ads.zzug zzugVar2 = (com.google.android.gms.internal.ads.zzug) zzfxnVar.get(i);
            if (zzm(zzugVar2, objZzf, zzbkVar.zzw(), zzbkVar.zzb(), zzbkVar.zzc(), iZzc)) {
                return zzugVar2;
            }
        }
        if (zzfxnVar.isEmpty() && zzugVar != null) {
            if (zzm(zzugVar, objZzf, zzbkVar.zzw(), zzbkVar.zzb(), zzbkVar.zzc(), iZzc)) {
                return zzugVar;
            }
        }
        return null;
    }

    private final void zzk(com.google.android.gms.internal.ads.zzfxp zzfxpVar, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzbq zzbqVar) {
        if (zzugVar == null) {
            return;
        }
        if (zzbqVar.zza(zzugVar.zza) != -1) {
            zzfxpVar.zza(zzugVar, zzbqVar);
            return;
        }
        com.google.android.gms.internal.ads.zzbq zzbqVar2 = (com.google.android.gms.internal.ads.zzbq) this.zzc.get(zzugVar);
        if (zzbqVar2 != null) {
            zzfxpVar.zza(zzugVar, zzbqVar2);
        }
    }

    private final void zzl(com.google.android.gms.internal.ads.zzbq zzbqVar) {
        com.google.android.gms.internal.ads.zzfxp zzfxpVar = new com.google.android.gms.internal.ads.zzfxp();
        if (this.zzb.isEmpty()) {
            zzk(zzfxpVar, this.zze, zzbqVar);
            if (!com.google.android.gms.internal.ads.zzfuk.zza(this.zzf, this.zze)) {
                zzk(zzfxpVar, this.zzf, zzbqVar);
            }
            if (!com.google.android.gms.internal.ads.zzfuk.zza(this.zzd, this.zze) && !com.google.android.gms.internal.ads.zzfuk.zza(this.zzd, this.zzf)) {
                zzk(zzfxpVar, this.zzd, zzbqVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfxpVar, (com.google.android.gms.internal.ads.zzug) this.zzb.get(i), zzbqVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfxpVar, this.zzd, zzbqVar);
            }
        }
        this.zzc = zzfxpVar.zzc();
    }

    private static boolean zzm(com.google.android.gms.internal.ads.zzug zzugVar, java.lang.Object obj, boolean z, int i, int i2, int i3) {
        if (!zzugVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzugVar.zzb != i || zzugVar.zzc != i2) {
                return false;
            }
        } else if (zzugVar.zzb != -1 || zzugVar.zze != i3) {
            return false;
        }
        return true;
    }

    public final com.google.android.gms.internal.ads.zzbq zza(com.google.android.gms.internal.ads.zzug zzugVar) {
        return (com.google.android.gms.internal.ads.zzbq) this.zzc.get(zzugVar);
    }

    public final com.google.android.gms.internal.ads.zzug zzb() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzug zzc() {
        java.lang.Object next;
        java.lang.Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        com.google.android.gms.internal.ads.zzfxn zzfxnVar = this.zzb;
        if (zzfxnVar instanceof java.util.List) {
            com.google.android.gms.internal.ads.zzfxn zzfxnVar2 = zzfxnVar;
            if (zzfxnVar2.isEmpty()) {
                throw new java.util.NoSuchElementException();
            }
            obj = zzfxnVar2.get(zzfxnVar2.size() - 1);
        } else {
            java.util.Iterator<E> it = zzfxnVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (com.google.android.gms.internal.ads.zzug) obj;
    }

    public final com.google.android.gms.internal.ads.zzug zzd() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzug zze() {
        return this.zzf;
    }

    public final void zzg(com.google.android.gms.internal.ads.zzbk zzbkVar) {
        this.zzd = zzj(zzbkVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(java.util.List list, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzbk zzbkVar) {
        this.zzb = com.google.android.gms.internal.ads.zzfxn.zzl(list);
        if (!list.isEmpty()) {
            this.zze = (com.google.android.gms.internal.ads.zzug) list.get(0);
            zzugVar.getClass();
            this.zzf = zzugVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzbkVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzbkVar.zzn());
    }

    public final void zzi(com.google.android.gms.internal.ads.zzbk zzbkVar) {
        this.zzd = zzj(zzbkVar, this.zzb, this.zze, this.zza);
        zzl(zzbkVar.zzn());
    }
}

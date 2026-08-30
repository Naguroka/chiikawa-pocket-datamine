package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzab {
    public static final /* synthetic */ int zzL = 0;
    public final byte[] zzA;
    public final int zzB;
    public final com.google.android.gms.internal.ads.zzk zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    private int zzM;
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.util.List zzc;
    public final java.lang.String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final java.lang.String zzk;
    public final com.google.android.gms.internal.ads.zzay zzl;
    public final java.lang.Object zzm;
    public final java.lang.String zzn;
    public final java.lang.String zzo;
    public final int zzp;
    public final int zzq;
    public final java.util.List zzr;
    public final com.google.android.gms.internal.ads.zzu zzs;
    public final long zzt;
    public final boolean zzu;
    public final int zzv;
    public final int zzw;
    public final float zzx;
    public final int zzy;
    public final float zzz;

    static {
        new com.google.android.gms.internal.ads.zzab(new com.google.android.gms.internal.ads.zzz());
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
        java.lang.Integer.toString(7, 36);
        java.lang.Integer.toString(8, 36);
        java.lang.Integer.toString(9, 36);
        java.lang.Integer.toString(10, 36);
        java.lang.Integer.toString(11, 36);
        java.lang.Integer.toString(12, 36);
        java.lang.Integer.toString(13, 36);
        java.lang.Integer.toString(14, 36);
        java.lang.Integer.toString(15, 36);
        java.lang.Integer.toString(16, 36);
        java.lang.Integer.toString(17, 36);
        java.lang.Integer.toString(18, 36);
        java.lang.Integer.toString(19, 36);
        java.lang.Integer.toString(20, 36);
        java.lang.Integer.toString(21, 36);
        java.lang.Integer.toString(22, 36);
        java.lang.Integer.toString(23, 36);
        java.lang.Integer.toString(24, 36);
        java.lang.Integer.toString(25, 36);
        java.lang.Integer.toString(26, 36);
        java.lang.Integer.toString(27, 36);
        java.lang.Integer.toString(28, 36);
        java.lang.Integer.toString(29, 36);
        java.lang.Integer.toString(30, 36);
        java.lang.Integer.toString(31, 36);
        java.lang.Integer.toString(32, 36);
        java.lang.Integer.toString(33, 36);
    }

    private zzab(com.google.android.gms.internal.ads.zzz zzzVar) {
        boolean z;
        java.lang.String str;
        this.zza = zzzVar.zza;
        java.lang.String strZzE = com.google.android.gms.internal.ads.zzei.zzE(zzzVar.zzd);
        this.zzd = strZzE;
        if (zzzVar.zzc.isEmpty() && zzzVar.zzb != null) {
            this.zzc = com.google.android.gms.internal.ads.zzfxn.zzo(new com.google.android.gms.internal.ads.zzad(strZzE, zzzVar.zzb));
            this.zzb = zzzVar.zzb;
        } else if (zzzVar.zzc.isEmpty() || zzzVar.zzb != null) {
            if (!zzzVar.zzc.isEmpty() || zzzVar.zzb != null) {
                int i = 0;
                while (true) {
                    if (i >= zzzVar.zzc.size()) {
                        z = false;
                        break;
                    } else {
                        if (((com.google.android.gms.internal.ads.zzad) zzzVar.zzc.get(i)).zzb.equals(zzzVar.zzb)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            com.google.android.gms.internal.ads.zzcw.zzf(z);
            this.zzc = zzzVar.zzc;
            this.zzb = zzzVar.zzb;
        } else {
            this.zzc = zzzVar.zzc;
            java.util.List list = zzzVar.zzc;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((com.google.android.gms.internal.ads.zzad) list.get(0)).zzb;
                    break;
                }
                com.google.android.gms.internal.ads.zzad zzadVar = (com.google.android.gms.internal.ads.zzad) it.next();
                if (android.text.TextUtils.equals(zzadVar.zza, strZzE)) {
                    str = zzadVar.zzb;
                    break;
                }
            }
            this.zzb = str;
        }
        this.zze = zzzVar.zze;
        com.google.android.gms.internal.ads.zzcw.zzg(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zzzVar.zzf;
        this.zzg = 0;
        int i2 = zzzVar.zzh;
        this.zzh = i2;
        int i3 = zzzVar.zzi;
        this.zzi = i3;
        this.zzj = i3 != -1 ? i3 : i2;
        this.zzk = zzzVar.zzj;
        this.zzl = zzzVar.zzk;
        this.zzm = null;
        this.zzn = zzzVar.zzl;
        this.zzo = zzzVar.zzm;
        this.zzp = zzzVar.zzn;
        this.zzq = zzzVar.zzo;
        this.zzr = zzzVar.zzp == null ? java.util.Collections.emptyList() : zzzVar.zzp;
        com.google.android.gms.internal.ads.zzu zzuVar = zzzVar.zzq;
        this.zzs = zzuVar;
        this.zzt = zzzVar.zzr;
        this.zzu = zzzVar.zzs;
        this.zzv = zzzVar.zzt;
        this.zzw = zzzVar.zzu;
        this.zzx = zzzVar.zzv;
        this.zzy = zzzVar.zzw == -1 ? 0 : zzzVar.zzw;
        this.zzz = zzzVar.zzx == -1.0f ? 1.0f : zzzVar.zzx;
        this.zzA = zzzVar.zzy;
        this.zzB = zzzVar.zzz;
        this.zzC = zzzVar.zzA;
        this.zzD = zzzVar.zzB;
        this.zzE = zzzVar.zzC;
        this.zzF = zzzVar.zzD;
        this.zzG = zzzVar.zzE == -1 ? 0 : zzzVar.zzE;
        this.zzH = zzzVar.zzF != -1 ? zzzVar.zzF : 0;
        this.zzI = zzzVar.zzG;
        this.zzJ = zzzVar.zzH;
        if (zzzVar.zzI != 0 || zzuVar == null) {
            this.zzK = zzzVar.zzI;
        } else {
            this.zzK = 1;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzab zzabVar = (com.google.android.gms.internal.ads.zzab) obj;
            int i2 = this.zzM;
            if ((i2 == 0 || (i = zzabVar.zzM) == 0 || i2 == i) && this.zze == zzabVar.zze && this.zzf == zzabVar.zzf && this.zzh == zzabVar.zzh && this.zzi == zzabVar.zzi && this.zzp == zzabVar.zzp && this.zzt == zzabVar.zzt && this.zzv == zzabVar.zzv && this.zzw == zzabVar.zzw && this.zzy == zzabVar.zzy && this.zzB == zzabVar.zzB && this.zzD == zzabVar.zzD && this.zzE == zzabVar.zzE && this.zzF == zzabVar.zzF && this.zzG == zzabVar.zzG && this.zzH == zzabVar.zzH && this.zzI == zzabVar.zzI && this.zzK == zzabVar.zzK && java.lang.Float.compare(this.zzx, zzabVar.zzx) == 0 && java.lang.Float.compare(this.zzz, zzabVar.zzz) == 0 && java.util.Objects.equals(this.zza, zzabVar.zza) && java.util.Objects.equals(this.zzb, zzabVar.zzb) && this.zzc.equals(zzabVar.zzc) && java.util.Objects.equals(this.zzk, zzabVar.zzk) && java.util.Objects.equals(this.zzn, zzabVar.zzn) && java.util.Objects.equals(this.zzo, zzabVar.zzo) && java.util.Objects.equals(this.zzd, zzabVar.zzd) && java.util.Arrays.equals(this.zzA, zzabVar.zzA) && java.util.Objects.equals(this.zzl, zzabVar.zzl) && java.util.Objects.equals(this.zzC, zzabVar.zzC) && java.util.Objects.equals(this.zzs, zzabVar.zzs) && zzd(zzabVar) && java.util.Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        return "Format(" + this.zza + ", " + this.zzb + ", " + this.zzn + ", " + this.zzo + ", " + this.zzk + ", " + this.zzj + ", " + this.zzd + ", [" + this.zzv + ", " + this.zzw + ", " + this.zzx + ", " + java.lang.String.valueOf(this.zzC) + "], [" + this.zzD + ", " + this.zzE + "])";
    }

    public final int zza() {
        int i;
        int i2 = this.zzv;
        if (i2 == -1 || (i = this.zzw) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final com.google.android.gms.internal.ads.zzz zzb() {
        return new com.google.android.gms.internal.ads.zzz(this, null);
    }

    public final com.google.android.gms.internal.ads.zzab zzc(int i) {
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz(this, null);
        zzzVar.zzD(i);
        return new com.google.android.gms.internal.ads.zzab(zzzVar);
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zzab zzabVar) {
        if (this.zzr.size() != zzabVar.zzr.size()) {
            return false;
        }
        for (int i = 0; i < this.zzr.size(); i++) {
            if (!java.util.Arrays.equals((byte[]) this.zzr.get(i), (byte[]) zzabVar.zzr.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.zzM;
        if (i != 0) {
            return i;
        }
        java.lang.String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzb;
        int iHashCode2 = ((((iHashCode + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.zzc.hashCode();
        java.lang.String str3 = this.zzd;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 31) + this.zzf) * 961) + this.zzh) * 31) + this.zzi) * 31;
        java.lang.String str4 = this.zzk;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        com.google.android.gms.internal.ads.zzay zzayVar = this.zzl;
        int iHashCode5 = (iHashCode4 + (zzayVar == null ? 0 : zzayVar.hashCode())) * 961;
        java.lang.String str5 = this.zzn;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.zzo;
        int iHashCode7 = ((((((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.zzp) * 31) + ((int) this.zzt)) * 31) + this.zzv) * 31) + this.zzw) * 31) + java.lang.Float.floatToIntBits(this.zzx)) * 31) + this.zzy) * 31) + java.lang.Float.floatToIntBits(this.zzz)) * 31) + this.zzB) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH) * 31) + this.zzI) * 31) - 1) * 31) - 1) * 31) + this.zzK;
        this.zzM = iHashCode7;
        return iHashCode7;
    }
}

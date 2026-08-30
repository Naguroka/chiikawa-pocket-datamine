package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzabr {
    public final java.util.List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final java.lang.String zzl;

    private zzabr(java.util.List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, java.lang.String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = i9;
        this.zzk = f;
        this.zzl = str;
    }

    public static com.google.android.gms.internal.ads.zzabr zza(com.google.android.gms.internal.ads.zzdy zzdyVar) throws com.google.android.gms.internal.ads.zzbc {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.String strZzc;
        float f;
        try {
            zzdyVar.zzM(4);
            int iZzm = (zzdyVar.zzm() & 3) + 1;
            if (iZzm == 3) {
                throw new java.lang.IllegalStateException();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int iZzm2 = zzdyVar.zzm() & 31;
            for (int i9 = 0; i9 < iZzm2; i9++) {
                arrayList.add(zzb(zzdyVar));
            }
            int iZzm3 = zzdyVar.zzm();
            for (int i10 = 0; i10 < iZzm3; i10++) {
                arrayList.add(zzb(zzdyVar));
            }
            if (iZzm2 > 0) {
                com.google.android.gms.internal.ads.zzfj zzfjVarZzf = com.google.android.gms.internal.ads.zzfk.zzf((byte[]) arrayList.get(0), iZzm + 1, ((byte[]) arrayList.get(0)).length);
                int i11 = zzfjVarZzf.zze;
                int i12 = zzfjVarZzf.zzf;
                int i13 = zzfjVarZzf.zzh + 8;
                int i14 = zzfjVarZzf.zzi + 8;
                int i15 = zzfjVarZzf.zzj;
                int i16 = zzfjVarZzf.zzk;
                int i17 = zzfjVarZzf.zzl;
                int i18 = zzfjVarZzf.zzm;
                float f2 = zzfjVarZzf.zzg;
                strZzc = com.google.android.gms.internal.ads.zzcy.zzc(zzfjVarZzf.zza, zzfjVarZzf.zzb, zzfjVarZzf.zzc);
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                strZzc = null;
                f = 1.0f;
            }
            return new com.google.android.gms.internal.ads.zzabr(arrayList, iZzm, i, i2, i3, i4, i5, i6, i7, i8, f, strZzc);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw com.google.android.gms.internal.ads.zzbc.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzq = zzdyVar.zzq();
        int iZzd = zzdyVar.zzd();
        zzdyVar.zzM(iZzq);
        return com.google.android.gms.internal.ads.zzcy.zze(zzdyVar.zzN(), iZzd, iZzq);
    }
}

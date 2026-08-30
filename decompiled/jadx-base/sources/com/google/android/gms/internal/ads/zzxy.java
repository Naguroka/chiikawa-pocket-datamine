package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzxy extends com.google.android.gms.internal.ads.zzyb {
    protected abstract android.util.Pair zzd(com.google.android.gms.internal.ads.zzxx zzxxVar, int[][][] iArr, int[] iArr2, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzbq zzbqVar) throws com.google.android.gms.internal.ads.zzib;

    @Override // com.google.android.gms.internal.ads.zzyb
    public final com.google.android.gms.internal.ads.zzyc zzo(com.google.android.gms.internal.ads.zzlm[] zzlmVarArr, com.google.android.gms.internal.ads.zzwj zzwjVar, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzbq zzbqVar) throws com.google.android.gms.internal.ads.zzib {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        com.google.android.gms.internal.ads.zzbr[][] zzbrVarArr = new com.google.android.gms.internal.ads.zzbr[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzwjVar.zzb;
            zzbrVarArr[i] = new com.google.android.gms.internal.ads.zzbr[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzlmVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzwjVar.zzb) {
            com.google.android.gms.internal.ads.zzbr zzbrVarZzb = zzwjVar.zzb(i5);
            int i6 = zzbrVarZzb.zzc;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                com.google.android.gms.internal.ads.zzlm zzlmVar = zzlmVarArr[i8];
                int iMax = 0;
                for (int i10 = 0; i10 < zzbrVarZzb.zza; i10++) {
                    iMax = java.lang.Math.max(iMax, zzlmVar.zzY(zzbrVarZzb.zzb(i10)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (iMax > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = iMax;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zzbrVarZzb.zza];
            } else {
                com.google.android.gms.internal.ads.zzlm zzlmVar2 = zzlmVarArr[i7];
                int[] iArr5 = new int[zzbrVarZzb.zza];
                for (int i11 = 0; i11 < zzbrVarZzb.zza; i11++) {
                    iArr5[i11] = zzlmVar2.zzY(zzbrVarZzb.zzb(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i7];
            zzbrVarArr[i7][i12] = zzbrVarZzb;
            iArr3[i7][i12] = iArr;
            iArr2[i7] = i12 + 1;
            i5++;
            i3 = 2;
        }
        int i13 = i3;
        boolean z4 = true;
        com.google.android.gms.internal.ads.zzwj[] zzwjVarArr = new com.google.android.gms.internal.ads.zzwj[i13];
        java.lang.String[] strArr = new java.lang.String[i13];
        int[] iArr6 = new int[i13];
        int i14 = 0;
        while (i14 < i13) {
            int i15 = iArr2[i14];
            zzwjVarArr[i14] = new com.google.android.gms.internal.ads.zzwj((com.google.android.gms.internal.ads.zzbr[]) com.google.android.gms.internal.ads.zzei.zzN(zzbrVarArr[i14], i15));
            iArr3[i14] = (int[][]) com.google.android.gms.internal.ads.zzei.zzN(iArr3[i14], i15);
            strArr[i14] = zzlmVarArr[i14].zzU();
            iArr6[i14] = zzlmVarArr[i14].zzb();
            i14++;
            i13 = 2;
        }
        int i16 = i13;
        com.google.android.gms.internal.ads.zzxx zzxxVar = new com.google.android.gms.internal.ads.zzxx(strArr, iArr6, zzwjVarArr, iArr4, iArr3, new com.google.android.gms.internal.ads.zzwj((com.google.android.gms.internal.ads.zzbr[]) com.google.android.gms.internal.ads.zzei.zzN(zzbrVarArr[i16], iArr2[i16])));
        android.util.Pair pairZzd = zzd(zzxxVar, iArr3, iArr4, zzugVar, zzbqVar);
        com.google.android.gms.internal.ads.zzxz[] zzxzVarArr = (com.google.android.gms.internal.ads.zzxz[]) pairZzd.second;
        java.util.List[] listArr = new java.util.List[zzxzVarArr.length];
        for (int i17 = 0; i17 < zzxzVarArr.length; i17++) {
            com.google.android.gms.internal.ads.zzxz zzxzVar = zzxzVarArr[i17];
            listArr[i17] = zzxzVar != null ? com.google.android.gms.internal.ads.zzfxn.zzo(zzxzVar) : com.google.android.gms.internal.ads.zzfxn.zzn();
        }
        com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
        int i18 = 0;
        while (i18 < 2) {
            com.google.android.gms.internal.ads.zzwj zzwjVarZzd = zzxxVar.zzd(i18);
            java.util.List list = listArr[i18];
            int i19 = 0;
            while (i19 < zzwjVarZzd.zzb) {
                com.google.android.gms.internal.ads.zzbr zzbrVarZzb2 = zzwjVarZzd.zzb(i19);
                boolean z5 = zzxxVar.zza(i18, i19, false) != 0 ? z4 : false;
                int i20 = zzbrVarZzb2.zza;
                int[] iArr7 = new int[i20];
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 < zzbrVarZzb2.zza; i21++) {
                    iArr7[i21] = zzxxVar.zzb(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        com.google.android.gms.internal.ads.zzxz zzxzVar2 = (com.google.android.gms.internal.ads.zzxz) list.get(i22);
                        if (zzxzVar2.zzg().equals(zzbrVarZzb2) && zzxzVar2.zzc(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzbx(zzbrVarZzb2, z5, iArr7, zArr));
                i19++;
                z4 = true;
            }
            i18++;
            z4 = true;
        }
        com.google.android.gms.internal.ads.zzwj zzwjVarZze = zzxxVar.zze();
        for (int i23 = 0; i23 < zzwjVarZze.zzb; i23++) {
            com.google.android.gms.internal.ads.zzbr zzbrVarZzb3 = zzwjVarZze.zzb(i23);
            int[] iArr8 = new int[zzbrVarZzb3.zza];
            java.util.Arrays.fill(iArr8, 0);
            zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzbx(zzbrVarZzb3, false, iArr8, new boolean[zzbrVarZzb3.zza]));
        }
        return new com.google.android.gms.internal.ads.zzyc((com.google.android.gms.internal.ads.zzln[]) pairZzd.first, (com.google.android.gms.internal.ads.zzxv[]) pairZzd.second, new com.google.android.gms.internal.ads.zzby(zzfxkVar.zzi()), zzxxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final void zzp(java.lang.Object obj) {
    }
}

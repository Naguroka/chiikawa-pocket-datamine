package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzalk implements com.google.android.gms.internal.ads.zzakf {
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final java.lang.String zze;
    private final float zzf;
    private final int zzg;

    public zzalk(java.util.List list) {
        int size = list.size();
        java.lang.String str = androidx.media3.common.C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = androidx.media3.common.C.SANS_SERIF_NAME;
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(com.google.android.gms.internal.ads.zzei.zzC(bArr, 43, bArr.length + (-43))) ? androidx.media3.common.C.SERIF_NAME : str;
        int i = bArr[25] * 20;
        this.zzg = i;
        boolean z = (bArr[0] & 32) != 0;
        this.zzb = z;
        if (z) {
            this.zzf = java.lang.Math.max(0.0f, java.lang.Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void zzc(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzake zzakeVar, com.google.android.gms.internal.ads.zzdb zzdbVar) {
        java.lang.String strZzB;
        int i3;
        int length;
        this.zza.zzJ(bArr, i + i2);
        this.zza.zzL(i);
        com.google.android.gms.internal.ads.zzdy zzdyVar = this.zza;
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        com.google.android.gms.internal.ads.zzcw.zzd(zzdyVar.zzb() >= 2);
        int iZzq = zzdyVar.zzq();
        if (iZzq == 0) {
            strZzB = "";
        } else {
            int iZzd = zzdyVar.zzd();
            java.nio.charset.Charset charsetZzC = zzdyVar.zzC();
            int iZzd2 = zzdyVar.zzd() - iZzd;
            if (charsetZzC == null) {
                charsetZzC = java.nio.charset.StandardCharsets.UTF_8;
            }
            strZzB = zzdyVar.zzB(iZzq - iZzd2, charsetZzC);
        }
        if (strZzB.isEmpty()) {
            zzdbVar.zza(new com.google.android.gms.internal.ads.zzajx(com.google.android.gms.internal.ads.zzfxn.zzn(), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET));
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strZzB);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        java.lang.String str = this.zze;
        int length2 = spannableStringBuilder.length();
        if (str != androidx.media3.common.C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(str), 0, length2, 16711713);
        }
        float fMax = this.zzf;
        while (true) {
            com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zza;
            if (zzdyVar2.zzb() < 8) {
                com.google.android.gms.internal.ads.zzcm zzcmVar = new com.google.android.gms.internal.ads.zzcm();
                zzcmVar.zzl(spannableStringBuilder);
                zzcmVar.zze(fMax, 0);
                zzcmVar.zzf(0);
                zzdbVar.zza(new com.google.android.gms.internal.ads.zzajx(com.google.android.gms.internal.ads.zzfxn.zzo(zzcmVar.zzp()), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET));
                return;
            }
            int iZzd3 = zzdyVar2.zzd();
            int iZzg = zzdyVar2.zzg();
            int iZzg2 = this.zza.zzg();
            if (iZzg2 == 1937013100) {
                com.google.android.gms.internal.ads.zzcw.zzd(this.zza.zzb() >= i6 ? i4 : i5);
                int iZzq2 = this.zza.zzq();
                int i7 = i5;
                while (i7 < iZzq2) {
                    com.google.android.gms.internal.ads.zzdy zzdyVar3 = this.zza;
                    com.google.android.gms.internal.ads.zzcw.zzd(zzdyVar3.zzb() >= 12 ? i4 : i5);
                    int iZzq3 = zzdyVar3.zzq();
                    int iZzq4 = zzdyVar3.zzq();
                    zzdyVar3.zzM(i6);
                    int iZzm = zzdyVar3.zzm();
                    zzdyVar3.zzM(i4);
                    int iZzg3 = zzdyVar3.zzg();
                    if (iZzq4 > spannableStringBuilder.length()) {
                        com.google.android.gms.internal.ads.zzdo.zzf("Tx3gParser", "Truncating styl end (" + iZzq4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        length = spannableStringBuilder.length();
                    } else {
                        length = iZzq4;
                    }
                    if (iZzq3 >= length) {
                        com.google.android.gms.internal.ads.zzdo.zzf("Tx3gParser", "Ignoring styl with start (" + iZzq3 + ") >= end (" + length + ").");
                    } else {
                        int i8 = length;
                        zzc(spannableStringBuilder, iZzm, this.zzc, iZzq3, i8, 0);
                        zzb(spannableStringBuilder, iZzg3, this.zzd, iZzq3, i8, 0);
                    }
                    i7++;
                    iZzq2 = iZzq2;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iZzg2 == 1952608120 && this.zzb) {
                i3 = 2;
                com.google.android.gms.internal.ads.zzcw.zzd(this.zza.zzb() >= 2);
                fMax = java.lang.Math.max(0.0f, java.lang.Math.min(this.zza.zzq() / this.zzg, 0.95f));
            } else {
                i3 = 2;
            }
            this.zza.zzL(iZzd3 + iZzg);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
    }
}

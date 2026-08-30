package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzxd extends com.google.android.gms.internal.ads.zzxo implements java.lang.Comparable {
    private final int zze;
    private final boolean zzf;
    private final java.lang.String zzg;
    private final com.google.android.gms.internal.ads.zzxh zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    public zzxd(int i, com.google.android.gms.internal.ads.zzbr zzbrVar, int i2, com.google.android.gms.internal.ads.zzxh zzxhVar, int i3, boolean z, com.google.android.gms.internal.ads.zzfuo zzfuoVar, int i4) {
        int i5;
        int iZzc;
        byte b;
        boolean z2;
        int iZzc2;
        boolean z3;
        super(i, zzbrVar, i2);
        this.zzh = zzxhVar;
        int i6 = 1;
        int i7 = true != zzxhVar.zzM ? 16 : 24;
        boolean z4 = zzxhVar.zzI;
        this.zzg = com.google.android.gms.internal.ads.zzxt.zzh(this.zzd.zzd);
        this.zzi = com.google.android.gms.internal.ads.zzlk.zza(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= zzxhVar.zzo.size()) {
                iZzc = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc = com.google.android.gms.internal.ads.zzxt.zzc(this.zzd, (java.lang.String) zzxhVar.zzo.get(i8), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.zzk = i8;
        this.zzj = iZzc;
        int i9 = this.zzd.zzf;
        int i10 = zzxhVar.zzp;
        this.zzl = com.google.android.gms.internal.ads.zzxt.zzb(i9, 0);
        com.google.android.gms.internal.ads.zzab zzabVar = this.zzd;
        int i11 = zzabVar.zzf;
        this.zzm = i11 == 0 || (i11 & 1) != 0;
        this.zzp = 1 == (zzabVar.zze & 1);
        java.lang.String str = zzabVar.zzo;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2123537834) {
                if (iHashCode != 187078297) {
                    if (iHashCode == 1504698186 && str.equals("audio/iamf")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(androidx.media3.common.MimeTypes.AUDIO_AC4)) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals(androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC)) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0 || b == 1 || b == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.zzw = z2;
        this.zzq = zzabVar.zzD;
        this.zzr = zzabVar.zzE;
        this.zzs = zzabVar.zzj;
        if (zzabVar.zzj != -1) {
            int i12 = zzxhVar.zzr;
        }
        if (zzabVar.zzD != -1) {
            int i13 = zzxhVar.zzq;
        }
        this.zzf = zzfuoVar.zza(zzabVar);
        android.content.res.Configuration configuration = android.content.res.Resources.getSystem().getConfiguration();
        java.lang.String[] strArrSplit = com.google.android.gms.internal.ads.zzei.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new java.lang.String[]{configuration.locale.toLanguageTag()};
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            strArrSplit[i14] = com.google.android.gms.internal.ads.zzei.zzE(strArrSplit[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= strArrSplit.length) {
                iZzc2 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc2 = com.google.android.gms.internal.ads.zzxt.zzc(this.zzd, strArrSplit[i15], false);
                if (iZzc2 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.zzn = i15;
        this.zzo = iZzc2;
        for (int i16 = 0; i16 < zzxhVar.zzs.size(); i16++) {
            java.lang.String str2 = this.zzd.zzo;
            if (str2 != null && str2.equals(zzxhVar.zzs.get(i16))) {
                i5 = i16;
                break;
            }
        }
        this.zzt = i5;
        this.zzu = (i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 128;
        this.zzv = (i3 & 64) == 64;
        com.google.android.gms.internal.ads.zzxh zzxhVar2 = this.zzh;
        if (com.google.android.gms.internal.ads.zzlk.zza(i3, zzxhVar2.zzO) && ((z3 = this.zzf) || zzxhVar2.zzH)) {
            com.google.android.gms.internal.ads.zzbu zzbuVar = zzxhVar2.zzt;
            if (com.google.android.gms.internal.ads.zzlk.zza(i3, false) && z3 && this.zzd.zzj != -1) {
                boolean z5 = zzxhVar2.zzA;
                boolean z6 = zzxhVar2.zzz;
                if ((zzxhVar2.zzQ || !z) && (i7 & i3) != 0) {
                    i6 = 2;
                }
            }
        } else {
            i6 = 0;
        }
        this.zze = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.internal.ads.zzxo zzxoVar) {
        java.lang.String str;
        com.google.android.gms.internal.ads.zzxd zzxdVar = (com.google.android.gms.internal.ads.zzxd) zzxoVar;
        boolean z = this.zzh.zzK;
        com.google.android.gms.internal.ads.zzab zzabVar = this.zzd;
        int i = zzabVar.zzD;
        if (i == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.zzab zzabVar2 = zzxdVar.zzd;
        if (i != zzabVar2.zzD || (str = zzabVar.zzo) == null || !android.text.TextUtils.equals(str, zzabVar2.zzo)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzh;
        boolean z2 = zzxhVar.zzJ;
        int i2 = this.zzd.zzE;
        if (i2 == -1 || i2 != zzxdVar.zzd.zzE) {
            return false;
        }
        boolean z3 = zzxhVar.zzL;
        return this.zzu == zzxdVar.zzu && this.zzv == zzxdVar.zzv;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.internal.ads.zzxd zzxdVar) {
        com.google.android.gms.internal.ads.zzfyy zzfyyVarZza = (this.zzf && this.zzi) ? com.google.android.gms.internal.ads.zzxt.zzc : com.google.android.gms.internal.ads.zzxt.zzc.zza();
        com.google.android.gms.internal.ads.zzfxc zzfxcVarZzc = com.google.android.gms.internal.ads.zzfxc.zzj().zzd(this.zzi, zzxdVar.zzi).zzc(java.lang.Integer.valueOf(this.zzk), java.lang.Integer.valueOf(zzxdVar.zzk), com.google.android.gms.internal.ads.zzfyy.zzc().zza()).zzb(this.zzj, zzxdVar.zzj).zzb(this.zzl, zzxdVar.zzl).zzd(this.zzp, zzxdVar.zzp).zzd(this.zzm, zzxdVar.zzm).zzc(java.lang.Integer.valueOf(this.zzn), java.lang.Integer.valueOf(zzxdVar.zzn), com.google.android.gms.internal.ads.zzfyy.zzc().zza()).zzb(this.zzo, zzxdVar.zzo).zzd(this.zzf, zzxdVar.zzf).zzc(java.lang.Integer.valueOf(this.zzt), java.lang.Integer.valueOf(zzxdVar.zzt), com.google.android.gms.internal.ads.zzfyy.zzc().zza());
        boolean z = this.zzh.zzz;
        com.google.android.gms.internal.ads.zzfxc zzfxcVarZzc2 = zzfxcVarZzc.zzd(this.zzu, zzxdVar.zzu).zzd(this.zzv, zzxdVar.zzv).zzd(this.zzw, zzxdVar.zzw).zzc(java.lang.Integer.valueOf(this.zzq), java.lang.Integer.valueOf(zzxdVar.zzq), zzfyyVarZza).zzc(java.lang.Integer.valueOf(this.zzr), java.lang.Integer.valueOf(zzxdVar.zzr), zzfyyVarZza);
        if (java.util.Objects.equals(this.zzg, zzxdVar.zzg)) {
            zzfxcVarZzc2 = zzfxcVarZzc2.zzc(java.lang.Integer.valueOf(this.zzs), java.lang.Integer.valueOf(zzxdVar.zzs), zzfyyVarZza);
        }
        return zzfxcVarZzc2.zza();
    }
}

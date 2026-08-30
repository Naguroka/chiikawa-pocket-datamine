package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzxr extends com.google.android.gms.internal.ads.zzxo {
    private final boolean zze;
    private final com.google.android.gms.internal.ads.zzxh zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final int zzu;

    /* JADX WARN: Code duplicated, block: B:119:0x017a  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:42:0x0069  */
    /* JADX WARN: Code duplicated, block: B:87:0x0120  */
    public zzxr(int i, com.google.android.gms.internal.ads.zzbr zzbrVar, int i2, com.google.android.gms.internal.ads.zzxh zzxhVar, int i3, java.lang.String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iZzc;
        int i6;
        byte b;
        boolean z4;
        int i7;
        float f;
        int i8;
        super(i, zzbrVar, i2);
        this.zzf = zzxhVar;
        int i9 = 1;
        int i10 = true != zzxhVar.zzF ? 16 : 24;
        boolean z5 = zzxhVar.zzE;
        if (z) {
            com.google.android.gms.internal.ads.zzab zzabVar = this.zzd;
            if (zzabVar.zzv != -1) {
                int i11 = zzxhVar.zza;
            }
            if (zzabVar.zzw != -1) {
                int i12 = zzxhVar.zzb;
            }
            float f2 = zzabVar.zzx;
            if (f2 != -1.0f) {
                int i13 = zzxhVar.zzc;
                if (f2 > 2.1474836E9f) {
                    z2 = false;
                }
            }
            if (zzabVar.zzj != -1) {
                int i14 = zzxhVar.zzd;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.zze = z2;
        if (z) {
            com.google.android.gms.internal.ads.zzab zzabVar2 = this.zzd;
            int i15 = zzabVar2.zzv;
            if (i15 != -1) {
                int i16 = zzxhVar.zze;
                if (i15 >= 0) {
                    i7 = zzabVar2.zzw;
                    if (i7 != -1) {
                        int i17 = zzxhVar.zzf;
                        if (i7 >= 0) {
                            f = zzabVar2.zzx;
                            if (f != -1.0f) {
                                int i18 = zzxhVar.zzg;
                                if (f >= 0.0f) {
                                    i8 = zzabVar2.zzj;
                                    if (i8 != -1) {
                                        int i19 = zzxhVar.zzh;
                                        if (i8 >= 0) {
                                            z3 = false;
                                        }
                                    }
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                i8 = zzabVar2.zzj;
                                if (i8 != -1) {
                                    int i110 = zzxhVar.zzh;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                    } else {
                        f = zzabVar2.zzx;
                        if (f != -1.0f) {
                            int i111 = zzxhVar.zzg;
                            if (f >= 0.0f) {
                                i8 = zzabVar2.zzj;
                                if (i8 != -1) {
                                    int i112 = zzxhVar.zzh;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i8 = zzabVar2.zzj;
                            if (i8 != -1) {
                                int i113 = zzxhVar.zzh;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    }
                } else {
                    z3 = false;
                }
            } else {
                i7 = zzabVar2.zzw;
                if (i7 != -1) {
                    int i114 = zzxhVar.zzf;
                    if (i7 >= 0) {
                        f = zzabVar2.zzx;
                        if (f != -1.0f) {
                            int i115 = zzxhVar.zzg;
                            if (f >= 0.0f) {
                                i8 = zzabVar2.zzj;
                                if (i8 != -1) {
                                    int i116 = zzxhVar.zzh;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i8 = zzabVar2.zzj;
                            if (i8 != -1) {
                                int i117 = zzxhVar.zzh;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    f = zzabVar2.zzx;
                    if (f != -1.0f) {
                        int i118 = zzxhVar.zzg;
                        if (f >= 0.0f) {
                            i8 = zzabVar2.zzj;
                            if (i8 != -1) {
                                int i119 = zzxhVar.zzh;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i8 = zzabVar2.zzj;
                        if (i8 != -1) {
                            int i1110 = zzxhVar.zzh;
                            if (i8 >= 0) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    }
                }
            }
        } else {
            z3 = false;
        }
        this.zzg = z3;
        this.zzh = com.google.android.gms.internal.ads.zzlk.zza(i3, false);
        com.google.android.gms.internal.ads.zzab zzabVar3 = this.zzd;
        float f3 = zzabVar3.zzx;
        this.zzi = f3 != -1.0f && f3 >= 10.0f;
        this.zzj = zzabVar3.zzj;
        this.zzk = zzabVar3.zza();
        int i20 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i20 >= zzxhVar.zzm.size()) {
                iZzc = 0;
                i20 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc = com.google.android.gms.internal.ads.zzxt.zzc(this.zzd, (java.lang.String) zzxhVar.zzm.get(i20), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.zzm = i20;
        this.zzn = iZzc;
        int i21 = this.zzd.zzf;
        int i22 = zzxhVar.zzn;
        this.zzo = com.google.android.gms.internal.ads.zzxt.zzb(i21, 0);
        int i23 = this.zzd.zzf;
        this.zzp = i23 == 0 || (i23 & 1) != 0;
        this.zzq = com.google.android.gms.internal.ads.zzxt.zzc(this.zzd, str, com.google.android.gms.internal.ads.zzxt.zzh(str) == null);
        for (int i24 = 0; i24 < zzxhVar.zzl.size(); i24++) {
            java.lang.String str2 = this.zzd.zzo;
            if (str2 != null && str2.equals(zzxhVar.zzl.get(i24))) {
                i5 = i24;
                break;
            }
        }
        this.zzl = i5;
        this.zzs = (i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 128;
        this.zzt = (i3 & 64) == 64;
        com.google.android.gms.internal.ads.zzab zzabVar4 = this.zzd;
        java.lang.String str3 = zzabVar4.zzo;
        if (str3 == null) {
            i6 = 0;
        } else {
            i6 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    b = 0;
                    break;
                case "video/av01":
                    b = 1;
                    break;
                case "video/hevc":
                    b = 2;
                    break;
                case "video/avc":
                    b = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i6 = 5;
            } else if (b != 1) {
                if (b == 2) {
                    i6 = 3;
                } else if (b == 3) {
                    i6 = 2;
                } else if (b != 4) {
                    i6 = 0;
                } else {
                    i6 = 1;
                }
            }
        }
        this.zzu = i6;
        if ((zzabVar4.zzf & 16384) != 0) {
            i9 = 0;
        } else {
            com.google.android.gms.internal.ads.zzxh zzxhVar2 = this.zzf;
            if (!com.google.android.gms.internal.ads.zzlk.zza(i3, zzxhVar2.zzO) || (!(z4 = this.zze) && !zzxhVar2.zzD)) {
                i9 = 0;
            } else if (com.google.android.gms.internal.ads.zzlk.zza(i3, false) && this.zzg && z4 && zzabVar4.zzj != -1) {
                boolean z6 = zzxhVar2.zzA;
                boolean z7 = zzxhVar2.zzz;
                if ((i10 & i3) != 0) {
                    i9 = 2;
                }
            }
        }
        this.zzr = i9;
    }

    public static /* synthetic */ int zza(com.google.android.gms.internal.ads.zzxr zzxrVar, com.google.android.gms.internal.ads.zzxr zzxrVar2) {
        com.google.android.gms.internal.ads.zzfyy zzfyyVarZza = (zzxrVar.zze && zzxrVar.zzh) ? com.google.android.gms.internal.ads.zzxt.zzc : com.google.android.gms.internal.ads.zzxt.zzc.zza();
        com.google.android.gms.internal.ads.zzfxc zzfxcVarZzj = com.google.android.gms.internal.ads.zzfxc.zzj();
        boolean z = zzxrVar.zzf.zzz;
        return zzfxcVarZzj.zzc(java.lang.Integer.valueOf(zzxrVar.zzk), java.lang.Integer.valueOf(zzxrVar2.zzk), zzfyyVarZza).zzc(java.lang.Integer.valueOf(zzxrVar.zzj), java.lang.Integer.valueOf(zzxrVar2.zzj), zzfyyVarZza).zza();
    }

    public static /* synthetic */ int zzd(com.google.android.gms.internal.ads.zzxr zzxrVar, com.google.android.gms.internal.ads.zzxr zzxrVar2) {
        com.google.android.gms.internal.ads.zzfxc zzfxcVarZzd = com.google.android.gms.internal.ads.zzfxc.zzj().zzd(zzxrVar.zzh, zzxrVar2.zzh).zzc(java.lang.Integer.valueOf(zzxrVar.zzm), java.lang.Integer.valueOf(zzxrVar2.zzm), com.google.android.gms.internal.ads.zzfyy.zzc().zza()).zzb(zzxrVar.zzn, zzxrVar2.zzn).zzb(zzxrVar.zzo, zzxrVar2.zzo).zzd(zzxrVar.zzp, zzxrVar2.zzp).zzb(zzxrVar.zzq, zzxrVar2.zzq).zzd(zzxrVar.zzi, zzxrVar2.zzi).zzd(zzxrVar.zze, zzxrVar2.zze).zzd(zzxrVar.zzg, zzxrVar2.zzg).zzc(java.lang.Integer.valueOf(zzxrVar.zzl), java.lang.Integer.valueOf(zzxrVar2.zzl), com.google.android.gms.internal.ads.zzfyy.zzc().zza()).zzd(zzxrVar.zzs, zzxrVar2.zzs).zzd(zzxrVar.zzt, zzxrVar2.zzt);
        if (zzxrVar.zzs && zzxrVar.zzt) {
            zzfxcVarZzd = zzfxcVarZzd.zzb(zzxrVar.zzu, zzxrVar2.zzu);
        }
        return zzfxcVarZzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.internal.ads.zzxo zzxoVar) {
        com.google.android.gms.internal.ads.zzxr zzxrVar = (com.google.android.gms.internal.ads.zzxr) zzxoVar;
        if (!java.util.Objects.equals(this.zzd.zzo, zzxrVar.zzd.zzo)) {
            return false;
        }
        boolean z = this.zzf.zzG;
        return this.zzs == zzxrVar.zzs && this.zzt == zzxrVar.zzt;
    }
}

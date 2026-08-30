package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzakr implements com.google.android.gms.internal.ads.zzakf {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final android.graphics.Paint zzd;
    private final android.graphics.Paint zze;
    private final android.graphics.Canvas zzf;
    private final com.google.android.gms.internal.ads.zzakk zzg;
    private final com.google.android.gms.internal.ads.zzakj zzh;
    private final com.google.android.gms.internal.ads.zzakq zzi;
    private android.graphics.Bitmap zzj;

    public zzakr(java.util.List list) {
        com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy((byte[]) list.get(0));
        int iZzq = zzdyVar.zzq();
        int iZzq2 = zzdyVar.zzq();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.zzd = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.zze = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new android.graphics.Canvas();
        this.zzg = new com.google.android.gms.internal.ads.zzakk(androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.zzh = new com.google.android.gms.internal.ads.zzakj(0, zzg(), zzh(), zzi());
        this.zzi = new com.google.android.gms.internal.ads.zzakq(iZzq, iZzq2);
    }

    private static int zzb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static com.google.android.gms.internal.ads.zzakj zzc(com.google.android.gms.internal.ads.zzdx zzdxVar, int i) {
        int[] iArr;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i2 = 8;
        int iZzd5 = zzdxVar.zzd(8);
        zzdxVar.zzn(8);
        int[] iArrZzg = zzg();
        int[] iArrZzh = zzh();
        int[] iArrZzi = zzi();
        int i3 = i - 2;
        while (i3 > 0) {
            int iZzd6 = zzdxVar.zzd(i2);
            int iZzd7 = zzdxVar.zzd(i2);
            int i4 = i3 - 2;
            if ((iZzd7 & 128) != 0) {
                iArr = iArrZzg;
            } else {
                iArr = (iZzd7 & 64) != 0 ? iArrZzh : iArrZzi;
            }
            if ((iZzd7 & 1) != 0) {
                iZzd3 = zzdxVar.zzd(i2);
                iZzd4 = zzdxVar.zzd(i2);
                iZzd = zzdxVar.zzd(i2);
                iZzd2 = zzdxVar.zzd(i2);
                i3 = i4 - 4;
            } else {
                int iZzd8 = zzdxVar.zzd(6) << 2;
                int iZzd9 = zzdxVar.zzd(4) << 4;
                i3 = i4 - 2;
                iZzd = zzdxVar.zzd(4) << 4;
                iZzd2 = zzdxVar.zzd(2) << 6;
                iZzd3 = iZzd8;
                iZzd4 = iZzd9;
            }
            if (iZzd3 == 0) {
                iZzd2 = 255;
            }
            if (iZzd3 == 0) {
                iZzd = 0;
            }
            if (iZzd3 == 0) {
                iZzd4 = 0;
            }
            double d = iZzd3;
            double d2 = iZzd4 - 128;
            double d3 = iZzd - 128;
            iArr[iZzd6] = zzb((byte) (255 - (iZzd2 & 255)), java.lang.Math.max(0, java.lang.Math.min((int) (d + (1.402d * d2)), 255)), java.lang.Math.max(0, java.lang.Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), java.lang.Math.max(0, java.lang.Math.min((int) (d + (d3 * 1.772d)), 255)));
            iZzd5 = iZzd5;
            i2 = 8;
        }
        return new com.google.android.gms.internal.ads.zzakj(iZzd5, iArrZzg, iArrZzh, iArrZzi);
    }

    private static com.google.android.gms.internal.ads.zzakl zzd(com.google.android.gms.internal.ads.zzdx zzdxVar) {
        int iZzd = zzdxVar.zzd(16);
        zzdxVar.zzn(4);
        int iZzd2 = zzdxVar.zzd(2);
        boolean zZzp = zzdxVar.zzp();
        zzdxVar.zzn(1);
        byte[] bArr = com.google.android.gms.internal.ads.zzei.zzf;
        byte[] bArr2 = com.google.android.gms.internal.ads.zzei.zzf;
        if (iZzd2 == 1) {
            zzdxVar.zzn(zzdxVar.zzd(8) * 16);
        } else if (iZzd2 == 0) {
            int iZzd3 = zzdxVar.zzd(16);
            int iZzd4 = zzdxVar.zzd(16);
            if (iZzd3 > 0) {
                bArr = new byte[iZzd3];
                zzdxVar.zzi(bArr, 0, iZzd3);
            }
            if (iZzd4 > 0) {
                bArr2 = new byte[iZzd4];
                zzdxVar.zzi(bArr2, 0, iZzd4);
            } else {
                bArr2 = bArr;
            }
        }
        return new com.google.android.gms.internal.ads.zzakl(iZzd, zZzp, bArr, bArr2);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0219  */
    /* JADX WARN: Code duplicated, block: B:119:0x0228 A[LOOP:3: B:88:0x0172->B:119:0x0228, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0222 A[SYNTHETIC] */
    private static void zze(byte[] bArr, int[] iArr, int i, int i2, int i3, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c;
        char c2;
        int iZzd;
        int i4;
        int iZzd2;
        int iZzd3;
        int i5;
        int i6;
        int iZzd4;
        com.google.android.gms.internal.ads.zzdx zzdxVar = new com.google.android.gms.internal.ads.zzdx(bArr, bArr.length);
        int i7 = i2;
        int i8 = i3;
        byte[] bArrZzf = null;
        byte[] bArrZzf2 = null;
        byte[] bArrZzf3 = null;
        while (zzdxVar.zza() != 0) {
            int i9 = 8;
            int iZzd5 = zzdxVar.zzd(8);
            if (iZzd5 != 240) {
                int i10 = 4;
                int i11 = 1;
                int i12 = 2;
                switch (iZzd5) {
                    case 16:
                        int i13 = 1;
                        if (i == 3) {
                            if (bArrZzf == null) {
                                bArr3 = zzb;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrZzf;
                            }
                        } else if (i != 2) {
                            bArr2 = null;
                        } else if (bArrZzf3 == null) {
                            bArr3 = zza;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrZzf3;
                        }
                        int i14 = i7;
                        int i15 = 0;
                        while (true) {
                            int iZzd6 = zzdxVar.zzd(2);
                            if (iZzd6 != 0) {
                                iZzd = i13;
                            } else {
                                if (zzdxVar.zzp()) {
                                    iZzd = zzdxVar.zzd(3) + 3;
                                    iZzd6 = zzdxVar.zzd(2);
                                } else {
                                    if (zzdxVar.zzp()) {
                                        iZzd = i13;
                                        iZzd6 = 0;
                                    } else {
                                        int iZzd7 = zzdxVar.zzd(2);
                                        if (iZzd7 == 0) {
                                            c = 4;
                                            c2 = '\b';
                                            i15 = i13;
                                            iZzd6 = 0;
                                            iZzd = 0;
                                        } else if (iZzd7 == i13) {
                                            c = 4;
                                            c2 = '\b';
                                            i15 = i15;
                                            iZzd = 2;
                                            iZzd6 = 0;
                                        } else if (iZzd7 == 2) {
                                            c = 4;
                                            c2 = '\b';
                                            iZzd = zzdxVar.zzd(4) + 12;
                                            iZzd6 = zzdxVar.zzd(2);
                                            i15 = i15;
                                        } else if (iZzd7 != 3) {
                                            iZzd6 = 0;
                                            iZzd = 0;
                                        } else {
                                            c2 = '\b';
                                            iZzd = zzdxVar.zzd(8) + 29;
                                            iZzd6 = zzdxVar.zzd(2);
                                            i15 = i15;
                                            c = 4;
                                        }
                                    }
                                    c = 4;
                                    c2 = '\b';
                                }
                                if (iZzd == 0 && paint != null) {
                                    int i16 = i8 + 1;
                                    float f = i8;
                                    if (bArr2 != 0) {
                                        iZzd6 = bArr2[iZzd6];
                                    }
                                    paint.setColor(iArr[iZzd6]);
                                    canvas.drawRect(i14, f, i14 + iZzd, i16, paint);
                                }
                                i14 += iZzd;
                                if (i15 != 0) {
                                    zzdxVar.zzf();
                                    i7 = i14;
                                } else {
                                    i15 = i15;
                                    i13 = 1;
                                }
                            }
                            c = 4;
                            c2 = '\b';
                            if (iZzd == 0) {
                            }
                            i14 += iZzd;
                            if (i15 != 0) {
                                zzdxVar.zzf();
                                i7 = i14;
                            } else {
                                i15 = i15;
                                i13 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrZzf2 == null ? zzc : bArrZzf2 : null;
                        int i17 = i7;
                        boolean z = false;
                        while (true) {
                            int iZzd8 = zzdxVar.zzd(i10);
                            if (iZzd8 != 0) {
                                i4 = 1;
                                z = z;
                            } else if (zzdxVar.zzp()) {
                                if (zzdxVar.zzp()) {
                                    int iZzd9 = zzdxVar.zzd(i12);
                                    if (iZzd9 == 0) {
                                        i4 = 1;
                                    } else if (iZzd9 == 1) {
                                        i4 = i12;
                                    } else if (iZzd9 == i12) {
                                        iZzd2 = zzdxVar.zzd(i10) + 9;
                                        iZzd3 = zzdxVar.zzd(i10);
                                    } else if (iZzd9 != 3) {
                                        z = z;
                                        iZzd8 = 0;
                                        i4 = 0;
                                    } else {
                                        iZzd2 = zzdxVar.zzd(i9) + 25;
                                        iZzd3 = zzdxVar.zzd(i10);
                                    }
                                    iZzd8 = 0;
                                } else {
                                    iZzd2 = zzdxVar.zzd(i12) + i10;
                                    iZzd3 = zzdxVar.zzd(i10);
                                }
                                z = z;
                                i4 = iZzd2;
                                iZzd8 = iZzd3;
                            } else {
                                int iZzd10 = zzdxVar.zzd(3);
                                if (iZzd10 != 0) {
                                    i4 = iZzd10 + 2;
                                    iZzd8 = 0;
                                } else {
                                    z = true;
                                    iZzd8 = 0;
                                    i4 = 0;
                                }
                            }
                            if (i4 == 0 || paint == null) {
                                i5 = i12;
                            } else {
                                int i18 = i8 + 1;
                                float f2 = i8;
                                if (bArr4 != 0) {
                                    iZzd8 = bArr4[iZzd8];
                                }
                                paint.setColor(iArr[iZzd8]);
                                i5 = 2;
                                canvas.drawRect(i17, f2, i17 + i4, i18, paint);
                            }
                            i17 += i4;
                            if (z) {
                                zzdxVar.zzf();
                                i7 = i17;
                            } else {
                                i12 = i5;
                                z = z;
                                i10 = 4;
                                i9 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i19 = i7;
                        int i20 = 0;
                        while (true) {
                            int iZzd11 = zzdxVar.zzd(8);
                            if (iZzd11 != 0) {
                                i6 = i20;
                                iZzd4 = i11;
                            } else if (zzdxVar.zzp()) {
                                i6 = i20;
                                iZzd4 = zzdxVar.zzd(7);
                                iZzd11 = zzdxVar.zzd(8);
                            } else {
                                int iZzd12 = zzdxVar.zzd(7);
                                if (iZzd12 != 0) {
                                    i6 = i20;
                                    iZzd4 = iZzd12;
                                    iZzd11 = 0;
                                } else {
                                    i6 = i11;
                                    iZzd11 = 0;
                                    iZzd4 = 0;
                                }
                            }
                            if (iZzd4 != 0 && paint != null) {
                                paint.setColor(iArr[iZzd11]);
                                canvas.drawRect(i19, i8, i19 + iZzd4, i8 + 1, paint);
                            }
                            i19 += iZzd4;
                            if (i6 != 0) {
                                i7 = i19;
                            } else {
                                i11 = i11;
                                i20 = i6;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iZzd5) {
                            case 32:
                                bArrZzf3 = zzf(4, 4, zzdxVar);
                                break;
                            case 33:
                                bArrZzf = zzf(4, 8, zzdxVar);
                                break;
                            case 34:
                                bArrZzf2 = zzf(16, 8, zzdxVar);
                                break;
                        }
                        break;
                }
            } else {
                i8 += 2;
                i7 = i2;
            }
        }
    }

    private static byte[] zzf(int i, int i2, com.google.android.gms.internal.ads.zzdx zzdxVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzdxVar.zzd(i2);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzb(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = zzb(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = zzb(63, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                int i4 = org.objectweb.asm.Opcodes.TABLESWITCH;
                if (i3 == 0) {
                    int i5 = i2 & 16;
                    int i6 = i2 & 32;
                    int i7 = i2 & 2;
                    int i8 = i2 & 64;
                    int i9 = i2 & 4;
                    int i10 = 1 != (i2 & 1) ? 0 : 85;
                    int i11 = i5 != 0 ? 170 : 0;
                    int i12 = i7 != 0 ? 85 : 0;
                    int i13 = i6 != 0 ? 170 : 0;
                    i = i9 == 0 ? 0 : 85;
                    if (i8 == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = zzb(255, i10 + i11, i12 + i13, i + i4);
                } else if (i3 == 8) {
                    int i14 = i2 & 16;
                    int i15 = i2 & 32;
                    int i16 = i2 & 2;
                    int i17 = i2 & 64;
                    int i18 = i2 & 4;
                    int i19 = 1 != (i2 & 1) ? 0 : 85;
                    int i20 = i14 != 0 ? 170 : 0;
                    int i21 = i16 != 0 ? 85 : 0;
                    int i22 = i15 != 0 ? 170 : 0;
                    i = i18 == 0 ? 0 : 85;
                    if (i17 == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = zzb(127, i19 + i20, i21 + i22, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = zzb(255, (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = zzb(255, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzake zzakeVar, com.google.android.gms.internal.ads.zzdb zzdbVar) {
        com.google.android.gms.internal.ads.zzajx zzajxVar;
        char c;
        char c2;
        int i3;
        com.google.android.gms.internal.ads.zzako zzakoVar;
        int i4;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i5;
        int iZzd5;
        com.google.android.gms.internal.ads.zzdx zzdxVar = new com.google.android.gms.internal.ads.zzdx(bArr, i + i2);
        zzdxVar.zzl(i);
        while (zzdxVar.zza() >= 48 && zzdxVar.zzd(8) == 15) {
            com.google.android.gms.internal.ads.zzakq zzakqVar = this.zzi;
            int iZzd6 = zzdxVar.zzd(8);
            int iZzd7 = zzdxVar.zzd(16);
            int iZzd8 = zzdxVar.zzd(16);
            int iZzb = zzdxVar.zzb() + iZzd8;
            if (iZzd8 * 8 > zzdxVar.zza()) {
                com.google.android.gms.internal.ads.zzdo.zzf("DvbParser", "Data field length exceeds limit");
                zzdxVar.zzn(zzdxVar.zza());
            } else {
                switch (iZzd6) {
                    case 16:
                        if (iZzd7 == zzakqVar.zza) {
                            com.google.android.gms.internal.ads.zzakm zzakmVar = zzakqVar.zzi;
                            int iZzd9 = zzdxVar.zzd(8);
                            int iZzd10 = zzdxVar.zzd(4);
                            int iZzd11 = zzdxVar.zzd(2);
                            zzdxVar.zzn(2);
                            android.util.SparseArray sparseArray = new android.util.SparseArray();
                            for (int i6 = iZzd8 - 2; i6 > 0; i6 -= 6) {
                                int iZzd12 = zzdxVar.zzd(8);
                                zzdxVar.zzn(8);
                                sparseArray.put(iZzd12, new com.google.android.gms.internal.ads.zzakn(zzdxVar.zzd(16), zzdxVar.zzd(16)));
                            }
                            com.google.android.gms.internal.ads.zzakm zzakmVar2 = new com.google.android.gms.internal.ads.zzakm(iZzd9, iZzd10, iZzd11, sparseArray);
                            if (zzakmVar2.zzb != 0) {
                                zzakqVar.zzi = zzakmVar2;
                                zzakqVar.zzc.clear();
                                zzakqVar.zzd.clear();
                                zzakqVar.zze.clear();
                            } else if (zzakmVar != null) {
                                if (zzakmVar.zza != zzakmVar2.zza) {
                                    zzakqVar.zzi = zzakmVar2;
                                }
                            }
                        }
                        break;
                    case 17:
                        com.google.android.gms.internal.ads.zzakm zzakmVar3 = zzakqVar.zzi;
                        if (iZzd7 == zzakqVar.zza && zzakmVar3 != null) {
                            int iZzd13 = zzdxVar.zzd(8);
                            zzdxVar.zzn(4);
                            boolean zZzp = zzdxVar.zzp();
                            zzdxVar.zzn(3);
                            int iZzd14 = zzdxVar.zzd(16);
                            int iZzd15 = zzdxVar.zzd(16);
                            int iZzd16 = zzdxVar.zzd(3);
                            int iZzd17 = zzdxVar.zzd(3);
                            zzdxVar.zzn(2);
                            int iZzd18 = zzdxVar.zzd(8);
                            int iZzd19 = zzdxVar.zzd(8);
                            int iZzd20 = zzdxVar.zzd(4);
                            int iZzd21 = zzdxVar.zzd(2);
                            zzdxVar.zzn(2);
                            int i7 = iZzd8 - 10;
                            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                            while (i7 > 0) {
                                int iZzd22 = zzdxVar.zzd(16);
                                int iZzd23 = zzdxVar.zzd(2);
                                int iZzd24 = zzdxVar.zzd(2);
                                int iZzd25 = zzdxVar.zzd(12);
                                zzdxVar.zzn(4);
                                int iZzd26 = zzdxVar.zzd(12);
                                i7 -= 6;
                                if (iZzd23 == 1) {
                                    i7 -= 2;
                                    i4 = iZzd23;
                                    iZzd = zzdxVar.zzd(8);
                                    iZzd2 = zzdxVar.zzd(8);
                                } else if (iZzd23 == 2) {
                                    iZzd23 = 2;
                                    i7 -= 2;
                                    i4 = iZzd23;
                                    iZzd = zzdxVar.zzd(8);
                                    iZzd2 = zzdxVar.zzd(8);
                                } else {
                                    i4 = iZzd23;
                                    iZzd = 0;
                                    iZzd2 = 0;
                                }
                                sparseArray2.put(iZzd22, new com.google.android.gms.internal.ads.zzakp(i4, iZzd24, iZzd25, iZzd26, iZzd, iZzd2));
                            }
                            com.google.android.gms.internal.ads.zzako zzakoVar2 = new com.google.android.gms.internal.ads.zzako(iZzd13, zZzp, iZzd14, iZzd15, iZzd16, iZzd17, iZzd18, iZzd19, iZzd20, iZzd21, sparseArray2);
                            if (zzakmVar3.zzb == 0 && (zzakoVar = (com.google.android.gms.internal.ads.zzako) zzakqVar.zzc.get(zzakoVar2.zza)) != null) {
                                int i8 = 0;
                                while (true) {
                                    android.util.SparseArray sparseArray3 = zzakoVar.zzj;
                                    if (i8 < sparseArray3.size()) {
                                        zzakoVar2.zzj.put(sparseArray3.keyAt(i8), (com.google.android.gms.internal.ads.zzakp) sparseArray3.valueAt(i8));
                                        i8++;
                                    }
                                }
                            }
                            zzakqVar.zzc.put(zzakoVar2.zza, zzakoVar2);
                        }
                        break;
                    case 18:
                        if (iZzd7 == zzakqVar.zza) {
                            com.google.android.gms.internal.ads.zzakj zzakjVarZzc = zzc(zzdxVar, iZzd8);
                            zzakqVar.zzd.put(zzakjVarZzc.zza, zzakjVarZzc);
                        } else if (iZzd7 == zzakqVar.zzb) {
                            com.google.android.gms.internal.ads.zzakj zzakjVarZzc2 = zzc(zzdxVar, iZzd8);
                            zzakqVar.zzf.put(zzakjVarZzc2.zza, zzakjVarZzc2);
                        }
                        break;
                    case 19:
                        if (iZzd7 == zzakqVar.zza) {
                            com.google.android.gms.internal.ads.zzakl zzaklVarZzd = zzd(zzdxVar);
                            zzakqVar.zze.put(zzaklVarZzd.zza, zzaklVarZzd);
                        } else if (iZzd7 == zzakqVar.zzb) {
                            com.google.android.gms.internal.ads.zzakl zzaklVarZzd2 = zzd(zzdxVar);
                            zzakqVar.zzg.put(zzaklVarZzd2.zza, zzaklVarZzd2);
                        }
                        break;
                    case 20:
                        if (iZzd7 == zzakqVar.zza) {
                            zzdxVar.zzn(4);
                            boolean zZzp2 = zzdxVar.zzp();
                            zzdxVar.zzn(3);
                            int iZzd27 = zzdxVar.zzd(16);
                            int iZzd28 = zzdxVar.zzd(16);
                            if (zZzp2) {
                                int iZzd29 = zzdxVar.zzd(16);
                                iZzd3 = zzdxVar.zzd(16);
                                iZzd5 = zzdxVar.zzd(16);
                                iZzd4 = zzdxVar.zzd(16);
                                i5 = iZzd29;
                            } else {
                                iZzd3 = iZzd27;
                                iZzd4 = iZzd28;
                                i5 = 0;
                                iZzd5 = 0;
                            }
                            zzakqVar.zzh = new com.google.android.gms.internal.ads.zzakk(iZzd27, iZzd28, i5, iZzd3, iZzd5, iZzd4);
                        }
                        break;
                }
                zzdxVar.zzo(iZzb - zzdxVar.zzb());
            }
        }
        com.google.android.gms.internal.ads.zzakq zzakqVar2 = this.zzi;
        com.google.android.gms.internal.ads.zzakm zzakmVar4 = zzakqVar2.zzi;
        if (zzakmVar4 == null) {
            zzajxVar = new com.google.android.gms.internal.ads.zzajx(com.google.android.gms.internal.ads.zzfxn.zzn(), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        } else {
            com.google.android.gms.internal.ads.zzakk zzakkVar = zzakqVar2.zzh;
            if (zzakkVar == null) {
                zzakkVar = this.zzg;
            }
            android.graphics.Bitmap bitmap = this.zzj;
            if (bitmap == null || zzakkVar.zza + 1 != bitmap.getWidth() || zzakkVar.zzb + 1 != this.zzj.getHeight()) {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(zzakkVar.zza + 1, zzakkVar.zzb + 1, android.graphics.Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.util.SparseArray sparseArray4 = zzakmVar4.zzc;
            int i9 = 0;
            while (i9 < sparseArray4.size()) {
                this.zzf.save();
                com.google.android.gms.internal.ads.zzakn zzaknVar = (com.google.android.gms.internal.ads.zzakn) sparseArray4.valueAt(i9);
                com.google.android.gms.internal.ads.zzako zzakoVar3 = (com.google.android.gms.internal.ads.zzako) this.zzi.zzc.get(sparseArray4.keyAt(i9));
                int i10 = zzaknVar.zza + zzakkVar.zzc;
                int i11 = zzaknVar.zzb + zzakkVar.zze;
                this.zzf.clipRect(i10, i11, java.lang.Math.min(zzakoVar3.zzc + i10, zzakkVar.zzd), java.lang.Math.min(zzakoVar3.zzd + i11, zzakkVar.zzf));
                com.google.android.gms.internal.ads.zzakj zzakjVar = (com.google.android.gms.internal.ads.zzakj) this.zzi.zzd.get(zzakoVar3.zzf);
                if (zzakjVar == null) {
                    zzakjVar = (com.google.android.gms.internal.ads.zzakj) this.zzi.zzf.get(zzakoVar3.zzf);
                    if (zzakjVar == null) {
                        zzakjVar = this.zzh;
                    }
                }
                android.util.SparseArray sparseArray5 = zzakoVar3.zzj;
                int i12 = 0;
                while (i12 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i12);
                    com.google.android.gms.internal.ads.zzakp zzakpVar = (com.google.android.gms.internal.ads.zzakp) sparseArray5.valueAt(i12);
                    com.google.android.gms.internal.ads.zzakl zzaklVar = (com.google.android.gms.internal.ads.zzakl) this.zzi.zze.get(iKeyAt);
                    if (zzaklVar == null) {
                        zzaklVar = (com.google.android.gms.internal.ads.zzakl) this.zzi.zzg.get(iKeyAt);
                    }
                    if (zzaklVar != null) {
                        android.graphics.Paint paint = zzaklVar.zzb ? null : this.zzd;
                        int i13 = zzakoVar3.zze;
                        int i14 = zzakpVar.zza + i10;
                        int i15 = zzakpVar.zzb + i11;
                        android.graphics.Canvas canvas = this.zzf;
                        int[] iArr = i13 == 3 ? zzakjVar.zzd : i13 == 2 ? zzakjVar.zzc : zzakjVar.zzb;
                        android.graphics.Paint paint2 = paint;
                        zze(zzaklVar.zzc, iArr, i13, i14, i15, paint2, canvas);
                        zze(zzaklVar.zzd, iArr, i13, i14, i15 + 1, paint2, canvas);
                    }
                    i12++;
                    sparseArray4 = sparseArray4;
                    sparseArray5 = sparseArray5;
                    i9 = i9;
                }
                android.util.SparseArray sparseArray6 = sparseArray4;
                int i16 = i9;
                float f = i11;
                float f2 = i10;
                if (zzakoVar3.zzb) {
                    int i17 = zzakoVar3.zze;
                    c = 3;
                    if (i17 == 3) {
                        i3 = zzakjVar.zzd[zzakoVar3.zzg];
                        c2 = 2;
                    } else {
                        c2 = 2;
                        i3 = i17 == 2 ? zzakjVar.zzc[zzakoVar3.zzh] : zzakjVar.zzb[zzakoVar3.zzi];
                    }
                    this.zze.setColor(i3);
                    this.zzf.drawRect(f2, f, zzakoVar3.zzc + i10, zzakoVar3.zzd + i11, this.zze);
                } else {
                    c = 3;
                    c2 = 2;
                }
                com.google.android.gms.internal.ads.zzcm zzcmVar = new com.google.android.gms.internal.ads.zzcm();
                zzcmVar.zzc(android.graphics.Bitmap.createBitmap(this.zzj, i10, i11, zzakoVar3.zzc, zzakoVar3.zzd));
                zzcmVar.zzh(f2 / zzakkVar.zza);
                zzcmVar.zzi(0);
                zzcmVar.zze(f / zzakkVar.zzb, 0);
                zzcmVar.zzf(0);
                zzcmVar.zzk(zzakoVar3.zzc / zzakkVar.zza);
                zzcmVar.zzd(zzakoVar3.zzd / zzakkVar.zzb);
                arrayList.add(zzcmVar.zzp());
                this.zzf.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i9 = i16 + 1;
                sparseArray4 = sparseArray6;
            }
            zzajxVar = new com.google.android.gms.internal.ads.zzajx(arrayList, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        }
        zzdbVar.zza(zzajxVar);
    }
}

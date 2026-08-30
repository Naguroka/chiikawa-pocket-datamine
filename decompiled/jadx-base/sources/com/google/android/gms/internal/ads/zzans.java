package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzans implements com.google.android.gms.internal.ads.zzank {
    final /* synthetic */ com.google.android.gms.internal.ads.zzant zza;
    private final com.google.android.gms.internal.ads.zzdx zzb = new com.google.android.gms.internal.ads.zzdx(new byte[5], 5);
    private final android.util.SparseArray zzc = new android.util.SparseArray();
    private final android.util.SparseIntArray zzd = new android.util.SparseIntArray();
    private final int zze;

    public zzans(com.google.android.gms.internal.ads.zzant zzantVar, int i) {
        this.zza = zzantVar;
        this.zze = i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00da  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
    @Override // com.google.android.gms.internal.ads.zzank
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        com.google.android.gms.internal.ads.zzef zzefVar;
        com.google.android.gms.internal.ads.zzef zzefVar2;
        int i;
        if (zzdyVar.zzm() != 2) {
            return;
        }
        com.google.android.gms.internal.ads.zzef zzefVar3 = (com.google.android.gms.internal.ads.zzef) this.zza.zzb.get(0);
        if ((zzdyVar.zzm() & 128) != 0) {
            zzdyVar.zzM(1);
            int iZzq = zzdyVar.zzq();
            int i2 = 3;
            zzdyVar.zzM(3);
            zzdyVar.zzG(this.zzb, 2);
            this.zzb.zzn(3);
            int i3 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzdyVar.zzG(this.zzb, 2);
            int i4 = 4;
            this.zzb.zzn(4);
            int i5 = 12;
            zzdyVar.zzM(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int iZzb = zzdyVar.zzb();
            while (iZzb > 0) {
                int i6 = 5;
                zzdyVar.zzG(this.zzb, 5);
                com.google.android.gms.internal.ads.zzdx zzdxVar = this.zzb;
                int iZzd = zzdxVar.zzd(8);
                zzdxVar.zzn(i2);
                int iZzd2 = this.zzb.zzd(i3);
                this.zzb.zzn(i4);
                int iZzd3 = this.zzb.zzd(i5);
                int iZzd4 = zzdyVar.zzd();
                int i7 = iZzd4 + iZzd3;
                int iZzm = 0;
                java.lang.String str = null;
                java.util.ArrayList arrayList = null;
                int i8 = -1;
                while (zzdyVar.zzd() < i7) {
                    int iZzm2 = zzdyVar.zzm();
                    int iZzd5 = zzdyVar.zzd() + zzdyVar.zzm();
                    if (iZzd5 > i7) {
                        break;
                    }
                    if (iZzm2 == i6) {
                        long jZzu = zzdyVar.zzu();
                        if (jZzu == 1094921523) {
                            zzefVar2 = zzefVar3;
                            i8 = 129;
                        } else if (jZzu == 1161904947) {
                            zzefVar2 = zzefVar3;
                            i8 = 135;
                        } else if (jZzu == 1094921524) {
                            zzefVar2 = zzefVar3;
                            i8 = 172;
                        } else if (jZzu == 1212503619) {
                            i = 36;
                            zzefVar2 = zzefVar3;
                            i8 = i;
                        } else {
                            zzefVar2 = zzefVar3;
                        }
                    } else if (iZzm2 == 106) {
                        zzefVar2 = zzefVar3;
                        i8 = 129;
                    } else if (iZzm2 == 122) {
                        zzefVar2 = zzefVar3;
                        i8 = 135;
                    } else {
                        if (iZzm2 == 127) {
                            int iZzm3 = zzdyVar.zzm();
                            if (iZzm3 == 21) {
                                zzefVar2 = zzefVar3;
                                i8 = 172;
                            } else if (iZzm3 == 14) {
                                i = 136;
                            } else if (iZzm3 == 33) {
                                i = 139;
                            } else {
                                zzefVar2 = zzefVar3;
                            }
                        } else if (iZzm2 == 123) {
                            i = 138;
                        } else if (iZzm2 == 10) {
                            java.lang.String strTrim = zzdyVar.zzB(i2, java.nio.charset.StandardCharsets.UTF_8).trim();
                            iZzm = zzdyVar.zzm();
                            zzefVar2 = zzefVar3;
                            str = strTrim;
                        } else if (iZzm2 == 89) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            while (zzdyVar.zzd() < iZzd5) {
                                java.lang.String strTrim2 = zzdyVar.zzB(i2, java.nio.charset.StandardCharsets.UTF_8).trim();
                                int iZzm4 = zzdyVar.zzm();
                                com.google.android.gms.internal.ads.zzef zzefVar4 = zzefVar3;
                                byte[] bArr = new byte[i4];
                                zzdyVar.zzH(bArr, 0, i4);
                                arrayList2.add(new com.google.android.gms.internal.ads.zzanu(strTrim2, iZzm4, bArr));
                                zzefVar3 = zzefVar4;
                                i2 = 3;
                                i4 = 4;
                            }
                            zzefVar2 = zzefVar3;
                            arrayList = arrayList2;
                            i8 = 89;
                        } else {
                            zzefVar2 = zzefVar3;
                            if (iZzm2 == 111) {
                                i8 = 257;
                            }
                        }
                        zzefVar2 = zzefVar3;
                        i8 = i;
                    }
                    zzdyVar.zzM(iZzd5 - zzdyVar.zzd());
                    zzefVar3 = zzefVar2;
                    i2 = 3;
                    i4 = 4;
                    i6 = 5;
                }
                com.google.android.gms.internal.ads.zzef zzefVar5 = zzefVar3;
                zzdyVar.zzL(i7);
                com.google.android.gms.internal.ads.zzanv zzanvVar = new com.google.android.gms.internal.ads.zzanv(i8, str, iZzm, arrayList, java.util.Arrays.copyOfRange(zzdyVar.zzN(), iZzd4, i7));
                if (iZzd == 6 || iZzd == 5) {
                    iZzd = zzanvVar.zza;
                }
                iZzb -= iZzd3 + 5;
                if (!this.zza.zzh.get(iZzd2)) {
                    com.google.android.gms.internal.ads.zzany zzanyVarZzb = this.zza.zze.zzb(iZzd, zzanvVar);
                    this.zzd.put(iZzd2, iZzd2);
                    this.zzc.put(iZzd2, zzanyVarZzb);
                }
                zzefVar3 = zzefVar5;
                i2 = 3;
                i4 = 4;
                i5 = 12;
                i3 = 13;
            }
            com.google.android.gms.internal.ads.zzef zzefVar6 = zzefVar3;
            int size = this.zzd.size();
            int i9 = 0;
            while (i9 < size) {
                android.util.SparseIntArray sparseIntArray = this.zzd;
                com.google.android.gms.internal.ads.zzant zzantVar = this.zza;
                int iKeyAt = sparseIntArray.keyAt(i9);
                int iValueAt = sparseIntArray.valueAt(i9);
                zzantVar.zzh.put(iKeyAt, true);
                this.zza.zzi.put(iValueAt, true);
                com.google.android.gms.internal.ads.zzany zzanyVar = (com.google.android.gms.internal.ads.zzany) this.zzc.valueAt(i9);
                if (zzanyVar != null) {
                    com.google.android.gms.internal.ads.zzacq zzacqVar = this.zza.zzl;
                    com.google.android.gms.internal.ads.zzanx zzanxVar = new com.google.android.gms.internal.ads.zzanx(iZzq, iKeyAt, 8192);
                    zzefVar = zzefVar6;
                    zzanyVar.zzb(zzefVar, zzacqVar, zzanxVar);
                    this.zza.zzg.put(iValueAt, zzanyVar);
                } else {
                    zzefVar = zzefVar6;
                }
                i9++;
                zzefVar6 = zzefVar;
            }
            this.zza.zzg.remove(this.zze);
            this.zza.zzm = 0;
            com.google.android.gms.internal.ads.zzant zzantVar2 = this.zza;
            if (zzantVar2.zzm == 0) {
                zzantVar2.zzl.zzD();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzank
    public final void zzb(com.google.android.gms.internal.ads.zzef zzefVar, com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzamg implements com.google.android.gms.internal.ads.zzanw {
    private final java.util.List zza;

    public zzamg() {
        this(0);
    }

    public zzamg(int i, java.util.List list) {
        this.zza = list;
    }

    private final com.google.android.gms.internal.ads.zzann zzc(com.google.android.gms.internal.ads.zzanv zzanvVar) {
        return new com.google.android.gms.internal.ads.zzann(zze(zzanvVar));
    }

    private final com.google.android.gms.internal.ads.zzaoa zzd(com.google.android.gms.internal.ads.zzanv zzanvVar) {
        return new com.google.android.gms.internal.ads.zzaoa(zze(zzanvVar));
    }

    private final java.util.List zze(com.google.android.gms.internal.ads.zzanv zzanvVar) {
        java.lang.String str;
        int i;
        java.util.List listSingletonList;
        com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(zzanvVar.zze);
        java.util.List arrayList = this.zza;
        while (zzdyVar.zzb() > 0) {
            int iZzm = zzdyVar.zzm();
            int iZzd = zzdyVar.zzd() + zzdyVar.zzm();
            if (iZzm == 134) {
                arrayList = new java.util.ArrayList();
                int iZzm2 = zzdyVar.zzm() & 31;
                for (int i2 = 0; i2 < iZzm2; i2++) {
                    java.lang.String strZzB = zzdyVar.zzB(3, java.nio.charset.StandardCharsets.UTF_8);
                    int iZzm3 = zzdyVar.zzm();
                    boolean z = (iZzm3 & 128) != 0;
                    if (z) {
                        i = iZzm3 & 63;
                        str = androidx.media3.common.MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = androidx.media3.common.MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte bZzm = (byte) zzdyVar.zzm();
                    zzdyVar.zzM(1);
                    if (z) {
                        int i3 = bZzm & 64;
                        int i4 = com.google.android.gms.internal.ads.zzcy.zza;
                        listSingletonList = java.util.Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                    zzzVar.zzaa(str);
                    zzzVar.zzQ(strZzB);
                    zzzVar.zzx(i);
                    zzzVar.zzN(listSingletonList);
                    arrayList.add(zzzVar.zzag());
                }
            }
            zzdyVar.zzL(iZzd);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanw
    public final android.util.SparseArray zza() {
        return new android.util.SparseArray();
    }

    public zzamg(int i) {
        this.zza = com.google.android.gms.internal.ads.zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzanw
    public final com.google.android.gms.internal.ads.zzany zzb(int i, com.google.android.gms.internal.ads.zzanv zzanvVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzamv(zzanvVar.zzb, zzanvVar.zza()));
            }
            if (i == 21) {
                return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzamt());
            }
            if (i == 27) {
                return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzamq(zzc(zzanvVar), false, false));
            }
            if (i == 36) {
                return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzams(zzc(zzanvVar)));
            }
            if (i == 45) {
                return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzamw());
            }
            if (i == 89) {
                return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzami(zzanvVar.zzd));
            }
            if (i == 172) {
                return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzamd(zzanvVar.zzb, zzanvVar.zza()));
            }
            if (i == 257) {
                return new com.google.android.gms.internal.ads.zzanl(new com.google.android.gms.internal.ads.zzanc(androidx.media3.common.MimeTypes.APPLICATION_AIT));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzamh(zzanvVar.zzb, zzanvVar.zza(), 5408));
                        }
                        switch (i) {
                            case 15:
                                return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzamf(false, zzanvVar.zzb, zzanvVar.zza()));
                            case 16:
                                return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzamo(zzd(zzanvVar)));
                            case 17:
                                return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzamu(zzanvVar.zzb, zzanvVar.zza()));
                            default:
                                switch (i) {
                                    case 134:
                                        return new com.google.android.gms.internal.ads.zzanl(new com.google.android.gms.internal.ads.zzanc(androidx.media3.common.MimeTypes.APPLICATION_SCTE35));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                    }
                    return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzamh(zzanvVar.zzb, zzanvVar.zza(), 4096));
                }
                return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzamb(zzanvVar.zzb, zzanvVar.zza()));
            }
        }
        return new com.google.android.gms.internal.ads.zzand(new com.google.android.gms.internal.ads.zzaml(zzd(zzanvVar)));
    }
}

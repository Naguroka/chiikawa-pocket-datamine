package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaiz {
    private static final com.google.android.gms.internal.ads.zzfvc zza = com.google.android.gms.internal.ads.zzfvc.zzb(com.google.android.gms.internal.ads.zzfty.zzc(':'));
    private static final com.google.android.gms.internal.ads.zzfvc zzb = com.google.android.gms.internal.ads.zzfvc.zzb(com.google.android.gms.internal.ads.zzfty.zzc('*'));
    private final java.util.List zzc = new java.util.ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }

    public final int zza(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar, java.util.List list) throws java.io.IOException {
        byte b;
        char c;
        int i = this.zzd;
        if (i == 0) {
            long jZzd = zzacoVar.zzd();
            zzadjVar.zza = (jZzd == -1 || jZzd < 8) ? 0L : jZzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            char c2 = 2819;
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i != 2) {
                long jZzf = zzacoVar.zzf();
                int iZzd = (int) ((zzacoVar.zzd() - zzacoVar.zzf()) - ((long) this.zze));
                com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(iZzd);
                zzacoVar.zzi(zzdyVar.zzN(), 0, iZzd);
                int i3 = 0;
                while (i3 < this.zzc.size()) {
                    com.google.android.gms.internal.ads.zzaiy zzaiyVar = (com.google.android.gms.internal.ads.zzaiy) this.zzc.get(i3);
                    zzdyVar.zzL((int) (zzaiyVar.zza - jZzf));
                    zzdyVar.zzM(4);
                    int iZzi = zzdyVar.zzi();
                    switch (zzdyVar.zzB(iZzi, java.nio.charset.StandardCharsets.UTF_8)) {
                        case "SlowMotion_Data":
                            b = 0;
                            break;
                        case "Super_SlowMotion_Edit_Data":
                            b = 3;
                            break;
                        case "Super_SlowMotion_Data":
                            b = 1;
                            break;
                        case "Super_SlowMotion_Deflickering_On":
                            b = 4;
                            break;
                        case "Super_SlowMotion_BGM":
                            b = 2;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        c = 2192;
                    } else if (b == 1) {
                        c = 2816;
                    } else if (b == 2) {
                        c = 2817;
                    } else if (b == 3) {
                        c = c2;
                    } else {
                        if (b != 4) {
                            throw com.google.android.gms.internal.ads.zzbc.zza("Invalid SEF name", null);
                        }
                        c = 2820;
                    }
                    int i4 = zzaiyVar.zzb - (iZzi + 8);
                    if (c == 2192) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.List listZzf = zzb.zzf(zzdyVar.zzB(i4, java.nio.charset.StandardCharsets.UTF_8));
                        for (int i5 = 0; i5 < listZzf.size(); i5++) {
                            java.util.List listZzf2 = zza.zzf((java.lang.CharSequence) listZzf.get(i5));
                            if (listZzf2.size() != 3) {
                                throw com.google.android.gms.internal.ads.zzbc.zza(null, null);
                            }
                            try {
                                arrayList.add(new com.google.android.gms.internal.ads.zzagy(java.lang.Long.parseLong((java.lang.String) listZzf2.get(0)), java.lang.Long.parseLong((java.lang.String) listZzf2.get(1)), 1 << (java.lang.Integer.parseInt((java.lang.String) listZzf2.get(2)) - 1)));
                            } catch (java.lang.NumberFormatException e) {
                                throw com.google.android.gms.internal.ads.zzbc.zza(null, e);
                            }
                        }
                        list.add(new com.google.android.gms.internal.ads.zzagz(arrayList));
                    } else if (c != 2816 && c != 2817 && c != c2 && c != 2820) {
                        throw new java.lang.IllegalStateException();
                    }
                    i3++;
                    c2 = 2819;
                }
                zzadjVar.zza = 0L;
                return 1;
            }
            long jZzd2 = zzacoVar.zzd();
            int i6 = this.zze - 20;
            com.google.android.gms.internal.ads.zzdy zzdyVar2 = new com.google.android.gms.internal.ads.zzdy(i6);
            zzacoVar.zzi(zzdyVar2.zzN(), 0, i6);
            int i7 = 0;
            while (i7 < i6 / 12) {
                zzdyVar2.zzM(i2);
                short sZzD = zzdyVar2.zzD();
                if (sZzD == s3 || sZzD == s2 || sZzD == s || sZzD == 2819 || sZzD == 2820) {
                    this.zzc.add(new com.google.android.gms.internal.ads.zzaiy(sZzD, (jZzd2 - ((long) this.zze)) - ((long) zzdyVar2.zzi()), zzdyVar2.zzi()));
                } else {
                    zzdyVar2.zzM(8);
                }
                i7++;
                i6 = i6;
                i2 = 2;
                s = 2817;
                s2 = 2816;
                s3 = 2192;
            }
            if (this.zzc.isEmpty()) {
                zzadjVar.zza = 0L;
            } else {
                this.zzd = 3;
                zzadjVar.zza = ((com.google.android.gms.internal.ads.zzaiy) this.zzc.get(0)).zza;
            }
        } else {
            com.google.android.gms.internal.ads.zzdy zzdyVar3 = new com.google.android.gms.internal.ads.zzdy(8);
            zzacoVar.zzi(zzdyVar3.zzN(), 0, 8);
            this.zze = zzdyVar3.zzi() + 8;
            if (zzdyVar3.zzg() != 1397048916) {
                zzadjVar.zza = 0L;
            } else {
                zzadjVar.zza = zzacoVar.zzf() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }
}

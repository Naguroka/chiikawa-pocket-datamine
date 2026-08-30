package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzadz {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static com.google.android.gms.internal.ads.zzay zzb(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = (java.lang.String) list.get(i);
            int i2 = com.google.android.gms.internal.ads.zzei.zza;
            java.lang.String[] strArrSplit = str.split(com.ironsource.y8.i.b, 2);
            if (strArrSplit.length != 2) {
                com.google.android.gms.internal.ads.zzdo.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(java.lang.String.valueOf(str)));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(com.google.android.gms.internal.ads.zzafn.zzb(new com.google.android.gms.internal.ads.zzdy(android.util.Base64.decode(strArrSplit[1], 0))));
                } catch (java.lang.RuntimeException e) {
                    com.google.android.gms.internal.ads.zzdo.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new com.google.android.gms.internal.ads.zzahe(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzay(arrayList);
    }

    public static com.google.android.gms.internal.ads.zzadw zzc(com.google.android.gms.internal.ads.zzdy zzdyVar, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzbc {
        if (z) {
            zzd(3, zzdyVar, false);
        }
        java.lang.String strZzB = zzdyVar.zzB((int) zzdyVar.zzs(), java.nio.charset.StandardCharsets.UTF_8);
        int length = strZzB.length();
        long jZzs = zzdyVar.zzs();
        java.lang.String[] strArr = new java.lang.String[(int) jZzs];
        int length2 = length + 15;
        for (int i = 0; i < jZzs; i++) {
            java.lang.String strZzB2 = zzdyVar.zzB((int) zzdyVar.zzs(), java.nio.charset.StandardCharsets.UTF_8);
            strArr[i] = strZzB2;
            length2 = length2 + 4 + strZzB2.length();
        }
        if (z2 && (zzdyVar.zzm() & 1) == 0) {
            throw com.google.android.gms.internal.ads.zzbc.zza("framing bit expected to be set", null);
        }
        return new com.google.android.gms.internal.ads.zzadw(strZzB, strArr, length2 + 1);
    }

    public static boolean zzd(int i, com.google.android.gms.internal.ads.zzdy zzdyVar, boolean z) throws com.google.android.gms.internal.ads.zzbc {
        if (zzdyVar.zzb() < 7) {
            if (z) {
                return false;
            }
            throw com.google.android.gms.internal.ads.zzbc.zza("too short header: " + zzdyVar.zzb(), null);
        }
        if (zzdyVar.zzm() != i) {
            if (z) {
                return false;
            }
            throw com.google.android.gms.internal.ads.zzbc.zza("expected header type ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i))), null);
        }
        if (zzdyVar.zzm() == 118 && zzdyVar.zzm() == 111 && zzdyVar.zzm() == 114 && zzdyVar.zzm() == 98 && zzdyVar.zzm() == 105 && zzdyVar.zzm() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw com.google.android.gms.internal.ads.zzbc.zza("expected characters 'vorbis'", null);
    }
}

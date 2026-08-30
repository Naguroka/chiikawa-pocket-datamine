package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaqf {
    long zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final java.util.List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzaqf(java.lang.String str, com.google.android.gms.internal.ads.zzaov zzaovVar) {
        java.lang.String str2 = zzaovVar.zzb;
        long j = zzaovVar.zzc;
        long j2 = zzaovVar.zzd;
        long j3 = zzaovVar.zze;
        long j4 = zzaovVar.zzf;
        java.util.List arrayList = zzaovVar.zzh;
        if (arrayList == null) {
            java.util.Map map = zzaovVar.zzg;
            arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                arrayList.add(new com.google.android.gms.internal.ads.zzape((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    static com.google.android.gms.internal.ads.zzaqf zza(com.google.android.gms.internal.ads.zzaqg zzaqgVar) throws java.io.IOException {
        if (com.google.android.gms.internal.ads.zzaqi.zze(zzaqgVar) != 538247942) {
            throw new java.io.IOException();
        }
        java.lang.String strZzh = com.google.android.gms.internal.ads.zzaqi.zzh(zzaqgVar);
        java.lang.String strZzh2 = com.google.android.gms.internal.ads.zzaqi.zzh(zzaqgVar);
        long jZzf = com.google.android.gms.internal.ads.zzaqi.zzf(zzaqgVar);
        long jZzf2 = com.google.android.gms.internal.ads.zzaqi.zzf(zzaqgVar);
        long jZzf3 = com.google.android.gms.internal.ads.zzaqi.zzf(zzaqgVar);
        long jZzf4 = com.google.android.gms.internal.ads.zzaqi.zzf(zzaqgVar);
        int iZze = com.google.android.gms.internal.ads.zzaqi.zze(zzaqgVar);
        if (iZze < 0) {
            throw new java.io.IOException("readHeaderList size=" + iZze);
        }
        java.util.List listEmptyList = iZze == 0 ? java.util.Collections.emptyList() : new java.util.ArrayList();
        for (int i = 0; i < iZze; i++) {
            listEmptyList.add(new com.google.android.gms.internal.ads.zzape(com.google.android.gms.internal.ads.zzaqi.zzh(zzaqgVar).intern(), com.google.android.gms.internal.ads.zzaqi.zzh(zzaqgVar).intern()));
        }
        return new com.google.android.gms.internal.ads.zzaqf(strZzh, strZzh2, jZzf, jZzf2, jZzf3, jZzf4, listEmptyList);
    }

    private zzaqf(java.lang.String str, java.lang.String str2, long j, long j2, long j3, long j4, java.util.List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}

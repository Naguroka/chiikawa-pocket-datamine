package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzazv implements java.util.Comparator {
    public zzazv(com.google.android.gms.internal.ads.zzazw zzazwVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzazk zzazkVar = (com.google.android.gms.internal.ads.zzazk) obj;
        com.google.android.gms.internal.ads.zzazk zzazkVar2 = (com.google.android.gms.internal.ads.zzazk) obj2;
        if (zzazkVar.zzd() < zzazkVar2.zzd()) {
            return -1;
        }
        if (zzazkVar.zzd() <= zzazkVar2.zzd()) {
            if (zzazkVar.zzb() < zzazkVar2.zzb()) {
                return -1;
            }
            if (zzazkVar.zzb() <= zzazkVar2.zzb()) {
                float fZza = (zzazkVar.zza() - zzazkVar.zzd()) * (zzazkVar.zzc() - zzazkVar.zzb());
                float fZza2 = (zzazkVar2.zza() - zzazkVar2.zzd()) * (zzazkVar2.zzc() - zzazkVar2.zzb());
                if (fZza > fZza2) {
                    return -1;
                }
                if (fZza >= fZza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}

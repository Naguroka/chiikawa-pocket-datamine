package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzazm implements java.util.Comparator {
    zzazm(com.google.android.gms.internal.ads.zzazo zzazoVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzazs zzazsVar = (com.google.android.gms.internal.ads.zzazs) obj;
        com.google.android.gms.internal.ads.zzazs zzazsVar2 = (com.google.android.gms.internal.ads.zzazs) obj2;
        int i = zzazsVar.zzc - zzazsVar2.zzc;
        return i != 0 ? i : java.lang.Long.compare(zzazsVar.zza, zzazsVar2.zza);
    }
}

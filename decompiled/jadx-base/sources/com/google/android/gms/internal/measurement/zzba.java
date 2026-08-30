package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzba implements java.util.Comparator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzai zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzg zzb;

    zzba(com.google.android.gms.internal.measurement.zzai zzaiVar, com.google.android.gms.internal.measurement.zzg zzgVar) {
        this.zza = zzaiVar;
        this.zzb = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.zzap zzapVar = (com.google.android.gms.internal.measurement.zzap) obj;
        com.google.android.gms.internal.measurement.zzap zzapVar2 = (com.google.android.gms.internal.measurement.zzap) obj2;
        if (zzapVar instanceof com.google.android.gms.internal.measurement.zzau) {
            return !(zzapVar2 instanceof com.google.android.gms.internal.measurement.zzau) ? 1 : 0;
        }
        if (zzapVar2 instanceof com.google.android.gms.internal.measurement.zzau) {
            return -1;
        }
        com.google.android.gms.internal.measurement.zzai zzaiVar = this.zza;
        return zzaiVar == null ? zzapVar.zzi().compareTo(zzapVar2.zzi()) : (int) com.google.android.gms.internal.measurement.zzh.zza(zzaiVar.zza(this.zzb, java.util.Arrays.asList(zzapVar, zzapVar2)).zzh().doubleValue());
    }
}

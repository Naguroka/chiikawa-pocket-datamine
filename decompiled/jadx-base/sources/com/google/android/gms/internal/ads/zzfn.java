package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfn implements java.lang.Comparable {
    private long zzc;
    private long zzb = androidx.media3.common.C.TIME_UNSET;
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfn zzfnVar = (com.google.android.gms.internal.ads.zzfn) obj;
        int iCompare = java.lang.Long.compare(this.zzb, zzfnVar.zzb);
        return iCompare != 0 ? iCompare : java.lang.Long.compare(this.zzc, zzfnVar.zzc);
    }

    public final void zzc(long j, long j2, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        com.google.android.gms.internal.ads.zzcw.zzf(j != androidx.media3.common.C.TIME_UNSET);
        this.zzb = j;
        this.zzc = j2;
        this.zza.zzI(zzdyVar.zzb());
        java.lang.System.arraycopy(zzdyVar.zzN(), zzdyVar.zzd(), this.zza.zzN(), 0, zzdyVar.zzb());
    }
}

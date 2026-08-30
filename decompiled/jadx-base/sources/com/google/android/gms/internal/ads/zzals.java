package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzals implements java.lang.Comparable {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzaln zzb;

    public zzals(int i, com.google.android.gms.internal.ads.zzaln zzalnVar) {
        this.zza = i;
        this.zzb = zzalnVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Integer.compare(this.zza, ((com.google.android.gms.internal.ads.zzals) obj).zza);
    }
}

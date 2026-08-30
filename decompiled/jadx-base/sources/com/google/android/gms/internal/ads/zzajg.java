package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzajg implements com.google.android.gms.internal.ads.zzadm {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaji zza;

    /* synthetic */ zzajg(com.google.android.gms.internal.ads.zzaji zzajiVar, com.google.android.gms.internal.ads.zzajh zzajhVar) {
        this.zza = zzajiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        com.google.android.gms.internal.ads.zzaji zzajiVar = this.zza;
        return zzajiVar.zzd.zzf(zzajiVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        com.google.android.gms.internal.ads.zzaji zzajiVar = this.zza;
        long jZzg = zzajiVar.zzd.zzg(j);
        long j2 = zzajiVar.zzb;
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(jZzg);
        com.google.android.gms.internal.ads.zzaji zzajiVar2 = this.zza;
        long jLongValue = j2 + bigIntegerValueOf.multiply(java.math.BigInteger.valueOf(zzajiVar2.zzc - zzajiVar2.zzb)).divide(java.math.BigInteger.valueOf(this.zza.zzf)).longValue();
        com.google.android.gms.internal.ads.zzaji zzajiVar3 = this.zza;
        com.google.android.gms.internal.ads.zzadn zzadnVar = new com.google.android.gms.internal.ads.zzadn(j, java.lang.Math.max(zzajiVar3.zzb, java.lang.Math.min(jLongValue - 30000, zzajiVar3.zzc - 1)));
        return new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}

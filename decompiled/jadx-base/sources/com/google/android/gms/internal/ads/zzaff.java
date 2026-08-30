package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaff extends com.google.android.gms.internal.ads.zzada {
    final /* synthetic */ com.google.android.gms.internal.ads.zzadm zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzafg zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaff(com.google.android.gms.internal.ads.zzafg zzafgVar, com.google.android.gms.internal.ads.zzadm zzadmVar, com.google.android.gms.internal.ads.zzadm zzadmVar2) {
        super(zzadmVar);
        this.zza = zzadmVar2;
        this.zzb = zzafgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzada, com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        com.google.android.gms.internal.ads.zzadk zzadkVarZzg = this.zza.zzg(j);
        com.google.android.gms.internal.ads.zzadn zzadnVar = zzadkVarZzg.zza;
        com.google.android.gms.internal.ads.zzadn zzadnVar2 = new com.google.android.gms.internal.ads.zzadn(zzadnVar.zzb, zzadnVar.zzc + this.zzb.zzb);
        com.google.android.gms.internal.ads.zzadn zzadnVar3 = zzadkVarZzg.zzb;
        return new com.google.android.gms.internal.ads.zzadk(zzadnVar2, new com.google.android.gms.internal.ads.zzadn(zzadnVar3.zzb, zzadnVar3.zzc + this.zzb.zzb));
    }
}

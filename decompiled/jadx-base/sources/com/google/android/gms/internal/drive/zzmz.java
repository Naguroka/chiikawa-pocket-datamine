package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzmz extends com.google.android.gms.internal.drive.zzmx<com.google.android.gms.internal.drive.zzmy, com.google.android.gms.internal.drive.zzmy> {
    zzmz() {
    }

    private static void zza(java.lang.Object obj, com.google.android.gms.internal.drive.zzmy zzmyVar) {
        ((com.google.android.gms.internal.drive.zzkk) obj).zzrq = zzmyVar;
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final void zzd(java.lang.Object obj) {
        ((com.google.android.gms.internal.drive.zzkk) obj).zzrq.zzbp();
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final /* synthetic */ int zzn(com.google.android.gms.internal.drive.zzmy zzmyVar) {
        return zzmyVar.zzcx();
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final /* synthetic */ int zzs(com.google.android.gms.internal.drive.zzmy zzmyVar) {
        return zzmyVar.zzfc();
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final /* synthetic */ com.google.android.gms.internal.drive.zzmy zzg(com.google.android.gms.internal.drive.zzmy zzmyVar, com.google.android.gms.internal.drive.zzmy zzmyVar2) {
        com.google.android.gms.internal.drive.zzmy zzmyVar3 = zzmyVar;
        com.google.android.gms.internal.drive.zzmy zzmyVar4 = zzmyVar2;
        return zzmyVar4.equals(com.google.android.gms.internal.drive.zzmy.zzfa()) ? zzmyVar3 : com.google.android.gms.internal.drive.zzmy.zza(zzmyVar3, zzmyVar4);
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final /* synthetic */ void zzc(com.google.android.gms.internal.drive.zzmy zzmyVar, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        zzmyVar.zza(zznsVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final /* synthetic */ void zza(com.google.android.gms.internal.drive.zzmy zzmyVar, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        zzmyVar.zzb(zznsVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final /* synthetic */ void zzf(java.lang.Object obj, com.google.android.gms.internal.drive.zzmy zzmyVar) {
        zza(obj, zzmyVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final /* synthetic */ com.google.android.gms.internal.drive.zzmy zzr(java.lang.Object obj) {
        return ((com.google.android.gms.internal.drive.zzkk) obj).zzrq;
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final /* synthetic */ void zze(java.lang.Object obj, com.google.android.gms.internal.drive.zzmy zzmyVar) {
        zza(obj, zzmyVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final /* synthetic */ com.google.android.gms.internal.drive.zzmy zzez() {
        return com.google.android.gms.internal.drive.zzmy.zzfb();
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final /* synthetic */ void zza(com.google.android.gms.internal.drive.zzmy zzmyVar, int i, com.google.android.gms.internal.drive.zzjc zzjcVar) {
        zzmyVar.zzb((i << 3) | 2, zzjcVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmx
    final /* synthetic */ void zza(com.google.android.gms.internal.drive.zzmy zzmyVar, int i, long j) {
        zzmyVar.zzb(i << 3, java.lang.Long.valueOf(j));
    }
}

package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzjz extends com.google.android.gms.internal.drive.zzjy<java.lang.Object> {
    zzjz() {
    }

    @Override // com.google.android.gms.internal.drive.zzjy
    final boolean zze(com.google.android.gms.internal.drive.zzlq zzlqVar) {
        return zzlqVar instanceof com.google.android.gms.internal.drive.zzkk.zzc;
    }

    @Override // com.google.android.gms.internal.drive.zzjy
    final com.google.android.gms.internal.drive.zzkb<java.lang.Object> zzb(java.lang.Object obj) {
        return ((com.google.android.gms.internal.drive.zzkk.zzc) obj).zzrw;
    }

    @Override // com.google.android.gms.internal.drive.zzjy
    final com.google.android.gms.internal.drive.zzkb<java.lang.Object> zzc(java.lang.Object obj) {
        return ((com.google.android.gms.internal.drive.zzkk.zzc) obj).zzdg();
    }

    @Override // com.google.android.gms.internal.drive.zzjy
    final void zzd(java.lang.Object obj) {
        zzb(obj).zzbp();
    }

    @Override // com.google.android.gms.internal.drive.zzjy
    final int zza(java.util.Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new java.lang.NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.drive.zzjy
    final void zza(com.google.android.gms.internal.drive.zzns zznsVar, java.util.Map.Entry<?, ?> entry) throws java.io.IOException {
        entry.getKey();
        throw new java.lang.NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.drive.zzjy
    final java.lang.Object zza(com.google.android.gms.internal.drive.zzjx zzjxVar, com.google.android.gms.internal.drive.zzlq zzlqVar, int i) {
        return zzjxVar.zza(zzlqVar, i);
    }
}

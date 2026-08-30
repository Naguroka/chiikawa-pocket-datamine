package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzld extends com.google.android.gms.internal.drive.zzla {
    private zzld() {
        super();
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final void zza(java.lang.Object obj, long j) {
        zzc(obj, j).zzbp();
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final <E> void zza(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.drive.zzkp zzkpVarZzc = zzc(obj, j);
        com.google.android.gms.internal.drive.zzkp zzkpVarZzc2 = zzc(obj2, j);
        int size = zzkpVarZzc.size();
        int size2 = zzkpVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkpVarZzc.zzbo()) {
                zzkpVarZzc = zzkpVarZzc.zzr(size2 + size);
            }
            zzkpVarZzc.addAll(zzkpVarZzc2);
        }
        if (size > 0) {
            zzkpVarZzc2 = zzkpVarZzc;
        }
        com.google.android.gms.internal.drive.zznd.zza(obj, j, zzkpVarZzc2);
    }

    private static <E> com.google.android.gms.internal.drive.zzkp<E> zzc(java.lang.Object obj, long j) {
        return (com.google.android.gms.internal.drive.zzkp) com.google.android.gms.internal.drive.zznd.zzo(obj, j);
    }
}

package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzlm implements com.google.android.gms.internal.drive.zzll {
    zzlm() {
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final java.util.Map<?, ?> zzh(java.lang.Object obj) {
        return (com.google.android.gms.internal.drive.zzlk) obj;
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final com.google.android.gms.internal.drive.zzlj<?, ?> zzm(java.lang.Object obj) {
        throw new java.lang.NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final java.util.Map<?, ?> zzi(java.lang.Object obj) {
        return (com.google.android.gms.internal.drive.zzlk) obj;
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final boolean zzj(java.lang.Object obj) {
        return !((com.google.android.gms.internal.drive.zzlk) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final java.lang.Object zzk(java.lang.Object obj) {
        ((com.google.android.gms.internal.drive.zzlk) obj).zzbp();
        return obj;
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final java.lang.Object zzl(java.lang.Object obj) {
        return com.google.android.gms.internal.drive.zzlk.zzdw().zzdx();
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final java.lang.Object zzb(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.drive.zzlk zzlkVarZzdx = (com.google.android.gms.internal.drive.zzlk) obj;
        com.google.android.gms.internal.drive.zzlk zzlkVar = (com.google.android.gms.internal.drive.zzlk) obj2;
        if (!zzlkVar.isEmpty()) {
            if (!zzlkVarZzdx.isMutable()) {
                zzlkVarZzdx = zzlkVarZzdx.zzdx();
            }
            zzlkVarZzdx.zza(zzlkVar);
        }
        return zzlkVarZzdx;
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final int zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.drive.zzlk zzlkVar = (com.google.android.gms.internal.drive.zzlk) obj;
        if (zzlkVar.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = zzlkVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new java.lang.NoSuchMethodError();
    }
}

package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzlh implements com.google.android.gms.internal.drive.zzlp {
    private com.google.android.gms.internal.drive.zzlp[] zztt;

    zzlh(com.google.android.gms.internal.drive.zzlp... zzlpVarArr) {
        this.zztt = zzlpVarArr;
    }

    @Override // com.google.android.gms.internal.drive.zzlp
    public final boolean zzb(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.drive.zzlp zzlpVar : this.zztt) {
            if (zzlpVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.drive.zzlp
    public final com.google.android.gms.internal.drive.zzlo zzc(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.drive.zzlp zzlpVar : this.zztt) {
            if (zzlpVar.zzb(cls)) {
                return zzlpVar.zzc(cls);
            }
        }
        java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
        throw new java.lang.UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new java.lang.String("No factory is available for message type: "));
    }
}

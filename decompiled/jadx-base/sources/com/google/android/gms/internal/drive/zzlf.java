package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzlf implements com.google.android.gms.internal.drive.zzmg {
    private static final com.google.android.gms.internal.drive.zzlp zzts = new com.google.android.gms.internal.drive.zzlg();
    private final com.google.android.gms.internal.drive.zzlp zztr;

    public zzlf() {
        this(new com.google.android.gms.internal.drive.zzlh(com.google.android.gms.internal.drive.zzkj.zzcv(), zzdv()));
    }

    private zzlf(com.google.android.gms.internal.drive.zzlp zzlpVar) {
        this.zztr = (com.google.android.gms.internal.drive.zzlp) com.google.android.gms.internal.drive.zzkm.zza(zzlpVar, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.drive.zzmg
    public final <T> com.google.android.gms.internal.drive.zzmf<T> zze(java.lang.Class<T> cls) {
        com.google.android.gms.internal.drive.zzmh.zzg((java.lang.Class<?>) cls);
        com.google.android.gms.internal.drive.zzlo zzloVarZzc = this.zztr.zzc(cls);
        if (zzloVarZzc.zzed()) {
            if (com.google.android.gms.internal.drive.zzkk.class.isAssignableFrom(cls)) {
                return com.google.android.gms.internal.drive.zzlw.zza(com.google.android.gms.internal.drive.zzmh.zzeo(), com.google.android.gms.internal.drive.zzka.zzcl(), zzloVarZzc.zzee());
            }
            return com.google.android.gms.internal.drive.zzlw.zza(com.google.android.gms.internal.drive.zzmh.zzem(), com.google.android.gms.internal.drive.zzka.zzcm(), zzloVarZzc.zzee());
        }
        if (com.google.android.gms.internal.drive.zzkk.class.isAssignableFrom(cls)) {
            if (zza(zzloVarZzc)) {
                return com.google.android.gms.internal.drive.zzlu.zza(cls, zzloVarZzc, com.google.android.gms.internal.drive.zzma.zzeh(), com.google.android.gms.internal.drive.zzla.zzdu(), com.google.android.gms.internal.drive.zzmh.zzeo(), com.google.android.gms.internal.drive.zzka.zzcl(), com.google.android.gms.internal.drive.zzln.zzea());
            }
            return com.google.android.gms.internal.drive.zzlu.zza(cls, zzloVarZzc, com.google.android.gms.internal.drive.zzma.zzeh(), com.google.android.gms.internal.drive.zzla.zzdu(), com.google.android.gms.internal.drive.zzmh.zzeo(), (com.google.android.gms.internal.drive.zzjy<?>) null, com.google.android.gms.internal.drive.zzln.zzea());
        }
        if (zza(zzloVarZzc)) {
            return com.google.android.gms.internal.drive.zzlu.zza(cls, zzloVarZzc, com.google.android.gms.internal.drive.zzma.zzeg(), com.google.android.gms.internal.drive.zzla.zzdt(), com.google.android.gms.internal.drive.zzmh.zzem(), com.google.android.gms.internal.drive.zzka.zzcm(), com.google.android.gms.internal.drive.zzln.zzdz());
        }
        return com.google.android.gms.internal.drive.zzlu.zza(cls, zzloVarZzc, com.google.android.gms.internal.drive.zzma.zzeg(), com.google.android.gms.internal.drive.zzla.zzdt(), com.google.android.gms.internal.drive.zzmh.zzen(), (com.google.android.gms.internal.drive.zzjy<?>) null, com.google.android.gms.internal.drive.zzln.zzdz());
    }

    private static boolean zza(com.google.android.gms.internal.drive.zzlo zzloVar) {
        return zzloVar.zzec() == com.google.android.gms.internal.drive.zzkk.zze.zzsf;
    }

    private static com.google.android.gms.internal.drive.zzlp zzdv() {
        try {
            return (com.google.android.gms.internal.drive.zzlp) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return zzts;
        }
    }
}

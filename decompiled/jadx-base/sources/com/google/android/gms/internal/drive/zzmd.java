package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzmd {
    private static final com.google.android.gms.internal.drive.zzmd zzuw = new com.google.android.gms.internal.drive.zzmd();
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.drive.zzmf<?>> zzuy = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.drive.zzmg zzux = new com.google.android.gms.internal.drive.zzlf();

    public static com.google.android.gms.internal.drive.zzmd zzej() {
        return zzuw;
    }

    public final <T> com.google.android.gms.internal.drive.zzmf<T> zzf(java.lang.Class<T> cls) {
        com.google.android.gms.internal.drive.zzkm.zza(cls, "messageType");
        com.google.android.gms.internal.drive.zzmf<T> zzmfVar = (com.google.android.gms.internal.drive.zzmf) this.zzuy.get(cls);
        if (zzmfVar != null) {
            return zzmfVar;
        }
        com.google.android.gms.internal.drive.zzmf<T> zzmfVarZze = this.zzux.zze(cls);
        com.google.android.gms.internal.drive.zzkm.zza(cls, "messageType");
        com.google.android.gms.internal.drive.zzkm.zza(zzmfVarZze, "schema");
        com.google.android.gms.internal.drive.zzmf<T> zzmfVar2 = (com.google.android.gms.internal.drive.zzmf) this.zzuy.putIfAbsent(cls, zzmfVarZze);
        return zzmfVar2 != null ? zzmfVar2 : zzmfVarZze;
    }

    public final <T> com.google.android.gms.internal.drive.zzmf<T> zzq(T t) {
        return zzf(t.getClass());
    }

    private zzmd() {
    }
}

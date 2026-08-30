package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhy<T> implements java.io.Serializable {
    zzhy() {
    }

    public static <T> com.google.android.gms.internal.nearby.zzhy<T> zzc() {
        return com.google.android.gms.internal.nearby.zzhx.zza;
    }

    public abstract boolean zza();

    public abstract T zzb();

    public static <T> com.google.android.gms.internal.nearby.zzhy<T> zzd(T t) {
        t.getClass();
        return new com.google.android.gms.internal.nearby.zzia(t);
    }
}

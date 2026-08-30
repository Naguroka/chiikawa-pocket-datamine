package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcw {
    @org.checkerframework.dataflow.qual.Pure
    public static int zza(int i, int i2, int i3) {
        if (i < 0 || i >= i3) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return i;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.Object zzb(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.IllegalStateException();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String zzc(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        return str;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzd(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zze(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzf(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzg(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}

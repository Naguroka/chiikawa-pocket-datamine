package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzix {
    private static final java.lang.Class<?> zzni = zzj("libcore.io.Memory");
    private static final boolean zznj;

    static boolean zzbr() {
        return (zzni == null || zznj) ? false : true;
    }

    static java.lang.Class<?> zzbs() {
        return zzni;
    }

    private static <T> java.lang.Class<T> zzj(java.lang.String str) {
        try {
            return (java.lang.Class<T>) java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static {
        zznj = zzj("org.robolectric.Robolectric") != null;
    }
}

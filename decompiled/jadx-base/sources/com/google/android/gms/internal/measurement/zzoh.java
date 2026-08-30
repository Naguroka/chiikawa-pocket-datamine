package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzoh implements java.security.PrivilegedExceptionAction {
    zzoh() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ java.lang.Object run() throws java.lang.Exception {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}

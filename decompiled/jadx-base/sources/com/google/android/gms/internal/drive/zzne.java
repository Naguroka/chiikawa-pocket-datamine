package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzne implements java.security.PrivilegedExceptionAction<sun.misc.Unsafe> {
    zzne() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ sun.misc.Unsafe run() throws java.lang.Exception {
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

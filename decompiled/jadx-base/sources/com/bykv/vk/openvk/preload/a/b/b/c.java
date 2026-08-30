package com.bykv.vk.openvk.preload.a.b.b;

/* JADX INFO: compiled from: UnsafeReflectionAccessor.java */
/* JADX INFO: loaded from: classes3.dex */
final class c extends com.bykv.vk.openvk.preload.a.b.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.Class f1663a;
    private final java.lang.Object b = b();
    private final java.lang.reflect.Field c = c();

    c() {
    }

    @Override // com.bykv.vk.openvk.preload.a.b.b.b
    public final void a(java.lang.reflect.AccessibleObject accessibleObject) {
        if (b(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (java.lang.SecurityException e) {
            throw new com.bykv.vk.openvk.preload.a.i("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
        }
    }

    private boolean b(java.lang.reflect.AccessibleObject accessibleObject) {
        if (this.b != null && this.c != null) {
            try {
                f1663a.getMethod("putBoolean", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE).invoke(this.b, accessibleObject, java.lang.Long.valueOf(((java.lang.Long) f1663a.getMethod("objectFieldOffset", java.lang.reflect.Field.class).invoke(this.b, this.c)).longValue()), java.lang.Boolean.TRUE);
                return true;
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    private static java.lang.Object b() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("sun.misc.Unsafe");
            f1663a = cls;
            java.lang.reflect.Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static java.lang.reflect.Field c() {
        try {
            return java.lang.reflect.AccessibleObject.class.getDeclaredField("override");
        } catch (java.lang.NoSuchFieldException unused) {
            return null;
        }
    }
}

package com.bykv.vk.openvk.preload.a.b;

/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public abstract <T> T a(java.lang.Class<T> cls) throws java.lang.Exception;

    public static com.bykv.vk.openvk.preload.a.b.i a() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("sun.misc.Unsafe");
            java.lang.reflect.Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final java.lang.Object obj = declaredField.get(null);
            final java.lang.reflect.Method method = cls.getMethod("allocateInstance", java.lang.Class.class);
            return new com.bykv.vk.openvk.preload.a.b.i() { // from class: com.bykv.vk.openvk.preload.a.b.i.1
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final <T> T a(java.lang.Class<T> cls2) throws java.lang.Exception {
                    b(cls2);
                    return (T) method.invoke(obj, cls2);
                }
            };
        } catch (java.lang.Exception unused) {
            try {
                try {
                    java.lang.reflect.Method declaredMethod = java.io.ObjectStreamClass.class.getDeclaredMethod("getConstructorId", java.lang.Class.class);
                    declaredMethod.setAccessible(true);
                    final int iIntValue = ((java.lang.Integer) declaredMethod.invoke(null, java.lang.Object.class)).intValue();
                    final java.lang.reflect.Method declaredMethod2 = java.io.ObjectStreamClass.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new com.bykv.vk.openvk.preload.a.b.i() { // from class: com.bykv.vk.openvk.preload.a.b.i.2
                        @Override // com.bykv.vk.openvk.preload.a.b.i
                        public final <T> T a(java.lang.Class<T> cls2) throws java.lang.Exception {
                            b(cls2);
                            return (T) declaredMethod2.invoke(null, cls2, java.lang.Integer.valueOf(iIntValue));
                        }
                    };
                } catch (java.lang.Exception unused2) {
                    return new com.bykv.vk.openvk.preload.a.b.i() { // from class: com.bykv.vk.openvk.preload.a.b.i.4
                        @Override // com.bykv.vk.openvk.preload.a.b.i
                        public final <T> T a(java.lang.Class<T> cls2) {
                            throw new java.lang.UnsupportedOperationException("Cannot allocate ".concat(java.lang.String.valueOf(cls2)));
                        }
                    };
                }
            } catch (java.lang.Exception unused3) {
                final java.lang.reflect.Method declaredMethod3 = java.io.ObjectInputStream.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Class.class);
                declaredMethod3.setAccessible(true);
                return new com.bykv.vk.openvk.preload.a.b.i() { // from class: com.bykv.vk.openvk.preload.a.b.i.3
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final <T> T a(java.lang.Class<T> cls2) throws java.lang.Exception {
                        b(cls2);
                        return (T) declaredMethod3.invoke(null, cls2, java.lang.Object.class);
                    }
                };
            }
        }
    }

    static void b(java.lang.Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (java.lang.reflect.Modifier.isInterface(modifiers)) {
            throw new java.lang.UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (java.lang.reflect.Modifier.isAbstract(modifiers)) {
            throw new java.lang.UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }
}

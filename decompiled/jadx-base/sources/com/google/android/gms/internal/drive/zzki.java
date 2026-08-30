package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzki<T extends com.google.android.gms.internal.drive.zzjx> {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.drive.zzjr.class.getName());
    private static java.lang.String zzro = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    zzki() {
    }

    protected abstract T zzcu();

    static <T extends com.google.android.gms.internal.drive.zzjx> T zza(java.lang.Class<T> cls) {
        java.lang.String str;
        java.lang.ClassLoader classLoader = com.google.android.gms.internal.drive.zzki.class.getClassLoader();
        if (cls.equals(com.google.android.gms.internal.drive.zzjx.class)) {
            str = zzro;
        } else {
            if (!cls.getPackage().equals(com.google.android.gms.internal.drive.zzki.class.getPackage())) {
                throw new java.lang.IllegalArgumentException(cls.getName());
            }
            str = java.lang.String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((com.google.android.gms.internal.drive.zzki) java.lang.Class.forName(str, true, classLoader).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0])).zzcu());
                    } catch (java.lang.IllegalAccessException e) {
                        throw new java.lang.IllegalStateException(e);
                    }
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    throw new java.lang.IllegalStateException(e2);
                }
            } catch (java.lang.InstantiationException e3) {
                throw new java.lang.IllegalStateException(e3);
            } catch (java.lang.NoSuchMethodException e4) {
                throw new java.lang.IllegalStateException(e4);
            }
        } catch (java.lang.ClassNotFoundException unused) {
            java.util.Iterator it = java.util.ServiceLoader.load(com.google.android.gms.internal.drive.zzki.class, classLoader).iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((com.google.android.gms.internal.drive.zzki) it.next()).zzcu()));
                } catch (java.util.ServiceConfigurationError e5) {
                    java.util.logging.Logger logger2 = logger;
                    java.util.logging.Level level = java.util.logging.Level.SEVERE;
                    java.lang.String strValueOf = java.lang.String.valueOf(cls.getSimpleName());
                    logger2.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", strValueOf.length() != 0 ? "Unable to load ".concat(strValueOf) : new java.lang.String("Unable to load "), (java.lang.Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", java.util.Collection.class).invoke(null, arrayList);
            } catch (java.lang.IllegalAccessException e6) {
                throw new java.lang.IllegalStateException(e6);
            } catch (java.lang.NoSuchMethodException e7) {
                throw new java.lang.IllegalStateException(e7);
            } catch (java.lang.reflect.InvocationTargetException e8) {
                throw new java.lang.IllegalStateException(e8);
            }
        }
    }
}

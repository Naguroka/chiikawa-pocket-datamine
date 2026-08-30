package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgxj {
    static com.google.android.gms.internal.ads.zzgxb zzb(java.lang.Class cls) {
        java.lang.String str;
        java.lang.ClassLoader classLoader = com.google.android.gms.internal.ads.zzgxj.class.getClassLoader();
        if (cls.equals(com.google.android.gms.internal.ads.zzgxb.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(com.google.android.gms.internal.ads.zzgxj.class.getPackage())) {
                throw new java.lang.IllegalArgumentException(cls.getName());
            }
            str = java.lang.String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return (com.google.android.gms.internal.ads.zzgxb) cls.cast(((com.google.android.gms.internal.ads.zzgxj) java.lang.Class.forName(str, true, classLoader).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0])).zza());
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
            java.util.Iterator it = java.util.ServiceLoader.load(com.google.android.gms.internal.ads.zzgxj.class, classLoader).iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((com.google.android.gms.internal.ads.zzgxb) cls.cast(((com.google.android.gms.internal.ads.zzgxj) it.next()).zza()));
                } catch (java.util.ServiceConfigurationError e5) {
                    java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzgww.class.getName()).logp(java.util.logging.Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(java.lang.String.valueOf(cls.getSimpleName())), (java.lang.Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (com.google.android.gms.internal.ads.zzgxb) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (com.google.android.gms.internal.ads.zzgxb) cls.getMethod("combine", java.util.Collection.class).invoke(null, arrayList);
            } catch (java.lang.IllegalAccessException e6) {
                throw new java.lang.IllegalStateException(e6);
            } catch (java.lang.NoSuchMethodException e7) {
                throw new java.lang.IllegalStateException(e7);
            } catch (java.lang.reflect.InvocationTargetException e8) {
                throw new java.lang.IllegalStateException(e8);
            }
        }
    }

    protected abstract com.google.android.gms.internal.ads.zzgxb zza();
}

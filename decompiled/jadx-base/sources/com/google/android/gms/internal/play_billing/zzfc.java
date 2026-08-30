package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfc {
    static com.google.android.gms.internal.play_billing.zzeu zzb(java.lang.Class cls) {
        java.lang.String str;
        java.lang.ClassLoader classLoader = com.google.android.gms.internal.play_billing.zzfc.class.getClassLoader();
        if (cls.equals(com.google.android.gms.internal.play_billing.zzeu.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(com.google.android.gms.internal.play_billing.zzfc.class.getPackage())) {
                throw new java.lang.IllegalArgumentException(cls.getName());
            }
            str = java.lang.String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return (com.google.android.gms.internal.play_billing.zzeu) cls.cast(((com.google.android.gms.internal.play_billing.zzfc) java.lang.Class.forName(str, true, classLoader).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0])).zza());
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
            java.util.Iterator it = java.util.ServiceLoader.load(com.google.android.gms.internal.play_billing.zzfc.class, classLoader).iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((com.google.android.gms.internal.play_billing.zzeu) cls.cast(((com.google.android.gms.internal.play_billing.zzfc) it.next()).zza()));
                } catch (java.util.ServiceConfigurationError e5) {
                    java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.zzep.class.getName()).logp(java.util.logging.Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(java.lang.String.valueOf(cls.getSimpleName())), (java.lang.Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (com.google.android.gms.internal.play_billing.zzeu) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (com.google.android.gms.internal.play_billing.zzeu) cls.getMethod("combine", java.util.Collection.class).invoke(null, arrayList);
            } catch (java.lang.IllegalAccessException e6) {
                throw new java.lang.IllegalStateException(e6);
            } catch (java.lang.NoSuchMethodException e7) {
                throw new java.lang.IllegalStateException(e7);
            } catch (java.lang.reflect.InvocationTargetException e8) {
                throw new java.lang.IllegalStateException(e8);
            }
        }
    }

    protected abstract com.google.android.gms.internal.play_billing.zzeu zza();
}

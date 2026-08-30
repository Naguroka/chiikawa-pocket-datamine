package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfvk {

    @javax.annotation.CheckForNull
    private static final java.lang.Object zza;

    static {
        java.lang.Object objZza = zza();
        zza = objZza;
        if (objZza != null) {
            zzb("getStackTraceElement", java.lang.Throwable.class, java.lang.Integer.TYPE);
        }
        if (objZza == null) {
            return;
        }
        zzc(objZza);
    }

    @javax.annotation.CheckForNull
    private static java.lang.Object zza() {
        try {
            return java.lang.Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @javax.annotation.CheckForNull
    private static java.lang.reflect.Method zzb(java.lang.String str, java.lang.Class... clsArr) throws java.lang.ThreadDeath {
        try {
            return java.lang.Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @javax.annotation.CheckForNull
    private static java.lang.reflect.Method zzc(java.lang.Object obj) {
        try {
            java.lang.reflect.Method methodZzb = zzb("getStackTraceDepth", java.lang.Throwable.class);
            if (methodZzb == null) {
                return null;
            }
            methodZzb.invoke(obj, new java.lang.Throwable());
            return methodZzb;
        } catch (java.lang.IllegalAccessException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }
}

package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class WorkSourceUtil {
    private static final int zza = android.os.Process.myUid();
    private static final java.lang.reflect.Method zzb;
    private static final java.lang.reflect.Method zzc;
    private static final java.lang.reflect.Method zzd;
    private static final java.lang.reflect.Method zze;
    private static final java.lang.reflect.Method zzf;
    private static final java.lang.reflect.Method zzg;
    private static final java.lang.reflect.Method zzh;
    private static final java.lang.reflect.Method zzi;
    private static java.lang.Boolean zzj;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.reflect.Method method5;
        java.lang.reflect.Method method6;
        java.lang.reflect.Method method7;
        java.lang.reflect.Method method8;
        try {
            method = android.os.WorkSource.class.getMethod("add", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused) {
            method = null;
        }
        zzb = method;
        try {
            method2 = android.os.WorkSource.class.getMethod("add", java.lang.Integer.TYPE, java.lang.String.class);
        } catch (java.lang.Exception unused2) {
            method2 = null;
        }
        zzc = method2;
        try {
            method3 = android.os.WorkSource.class.getMethod("size", new java.lang.Class[0]);
        } catch (java.lang.Exception unused3) {
            method3 = null;
        }
        zzd = method3;
        try {
            method4 = android.os.WorkSource.class.getMethod("get", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused4) {
            method4 = null;
        }
        zze = method4;
        try {
            method5 = android.os.WorkSource.class.getMethod("getName", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused5) {
            method5 = null;
        }
        zzf = method5;
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastP()) {
            try {
                method6 = android.os.WorkSource.class.getMethod("createWorkChain", new java.lang.Class[0]);
            } catch (java.lang.Exception e) {
                android.util.Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        zzg = method6;
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastP()) {
            try {
                method7 = java.lang.Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", java.lang.Integer.TYPE, java.lang.String.class);
            } catch (java.lang.Exception e2) {
                android.util.Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        zzh = method7;
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastP()) {
            try {
                method8 = android.os.WorkSource.class.getMethod("isEmpty", new java.lang.Class[0]);
                try {
                    method8.setAccessible(true);
                } catch (java.lang.Exception unused6) {
                }
            } catch (java.lang.Exception unused7) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        zzi = method8;
        zzj = null;
    }

    private WorkSourceUtil() {
    }

    public static void add(android.os.WorkSource workSource, int i, java.lang.String str) {
        java.lang.reflect.Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, java.lang.Integer.valueOf(i), str);
                return;
            } catch (java.lang.Exception e) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        java.lang.reflect.Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception e2) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    public static android.os.WorkSource fromPackage(android.content.Context context, java.lang.String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                android.content.pm.ApplicationInfo applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    android.util.Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i = applicationInfo.uid;
                android.os.WorkSource workSource = new android.os.WorkSource();
                add(workSource, i, str);
                return workSource;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                android.util.Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.reflect.Method method;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            android.util.Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        int i = -1;
        try {
            android.content.pm.ApplicationInfo applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                android.util.Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
            } else {
                i = applicationInfo.uid;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
        }
        if (i < 0) {
            return null;
        }
        android.os.WorkSource workSource = new android.os.WorkSource();
        java.lang.reflect.Method method2 = zzg;
        if (method2 == null || (method = zzh) == null) {
            add(workSource, i, str);
        } else {
            try {
                java.lang.Object objInvoke = method2.invoke(workSource, new java.lang.Object[0]);
                int i2 = zza;
                if (i != i2) {
                    method.invoke(objInvoke, java.lang.Integer.valueOf(i), str);
                }
                method.invoke(objInvoke, java.lang.Integer.valueOf(i2), str2);
            } catch (java.lang.Exception e) {
                android.util.Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e);
            }
        }
        return workSource;
    }

    public static int get(android.os.WorkSource workSource, int i) {
        java.lang.reflect.Method method = zze;
        if (method != null) {
            try {
                java.lang.Object objInvoke = method.invoke(workSource, java.lang.Integer.valueOf(i));
                com.google.android.gms.common.internal.Preconditions.checkNotNull(objInvoke);
                return ((java.lang.Integer) objInvoke).intValue();
            } catch (java.lang.Exception e) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    public static java.lang.String getName(android.os.WorkSource workSource, int i) {
        java.lang.reflect.Method method = zzf;
        if (method == null) {
            return null;
        }
        try {
            return (java.lang.String) method.invoke(workSource, java.lang.Integer.valueOf(i));
        } catch (java.lang.Exception e) {
            android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    public static java.util.List<java.lang.String> getNames(android.os.WorkSource workSource) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                java.lang.String name = getName(workSource, i);
                if (!com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(name)) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    public static synchronized boolean hasWorkSourcePermission(android.content.Context context) {
        java.lang.Boolean bool = zzj;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
        zzj = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static boolean isEmpty(android.os.WorkSource workSource) {
        java.lang.reflect.Method method = zzi;
        if (method != null) {
            try {
                java.lang.Object objInvoke = method.invoke(workSource, new java.lang.Object[0]);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(objInvoke);
                return ((java.lang.Boolean) objInvoke).booleanValue();
            } catch (java.lang.Exception e) {
                android.util.Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        return size(workSource) == 0;
    }

    public static int size(android.os.WorkSource workSource) {
        java.lang.reflect.Method method = zzd;
        if (method != null) {
            try {
                java.lang.Object objInvoke = method.invoke(workSource, new java.lang.Object[0]);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(objInvoke);
                return ((java.lang.Integer) objInvoke).intValue();
            } catch (java.lang.Exception e) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}

package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzl {
    public static java.lang.Object zza(java.lang.Class cls, java.lang.String str, com.google.android.gms.internal.common.zzj... zzjVarArr) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        return zzc(cls, "isIsolated", null, false, zzjVarArr);
    }

    public static java.lang.Object zzb(java.lang.String str, java.lang.String str2, java.lang.ClassLoader classLoader, com.google.android.gms.internal.common.zzj... zzjVarArr) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zzjVarArr);
    }

    private static java.lang.Object zzc(java.lang.Class cls, java.lang.String str, java.lang.Object obj, boolean z, com.google.android.gms.internal.common.zzj... zzjVarArr) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        int length = zzjVarArr.length;
        java.lang.Class<?>[] clsArr = new java.lang.Class[length];
        java.lang.Object[] objArr = new java.lang.Object[length];
        for (int i = 0; i < zzjVarArr.length; i++) {
            com.google.android.gms.internal.common.zzj zzjVar = zzjVarArr[i];
            zzjVar.getClass();
            clsArr[i] = zzjVar.zzc();
            objArr[i] = zzjVarArr[i].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhej {
    public static com.google.android.gms.internal.ads.zzhej zzb(java.lang.Class cls) {
        return java.lang.System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new com.google.android.gms.internal.ads.zzhee(cls.getSimpleName()) : new com.google.android.gms.internal.ads.zzheg(cls.getSimpleName());
    }

    public abstract void zza(java.lang.String str);
}

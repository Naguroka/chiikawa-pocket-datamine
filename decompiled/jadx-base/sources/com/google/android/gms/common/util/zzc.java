package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc {
    public static android.os.StrictMode.VmPolicy zza() {
        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastS()) {
            android.os.StrictMode.setVmPolicy(com.google.android.gms.common.util.zzb.zza(new android.os.StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfxf {
    static int zza(int i) {
        return (int) (((long) java.lang.Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    static int zzb(@javax.annotation.CheckForNull java.lang.Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}

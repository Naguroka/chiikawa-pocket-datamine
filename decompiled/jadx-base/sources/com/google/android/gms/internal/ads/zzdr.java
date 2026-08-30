package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdr {
    public static void zza(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void zzb(android.media.MediaFormat mediaFormat, java.util.List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, java.nio.ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}

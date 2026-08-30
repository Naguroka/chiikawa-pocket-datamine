package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rd {
    public static void a(android.media.MediaFormat mediaFormat, java.lang.String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, java.nio.ByteBuffer.wrap(bArr));
        }
    }

    public static void a(android.media.MediaFormat mediaFormat, com.applovin.impl.r3 r3Var) {
        if (r3Var != null) {
            a(mediaFormat, "color-transfer", r3Var.c);
            a(mediaFormat, "color-standard", r3Var.f1211a);
            a(mediaFormat, "color-range", r3Var.b);
            a(mediaFormat, "hdr-static-info", r3Var.d);
        }
    }

    public static void a(android.media.MediaFormat mediaFormat, java.lang.String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void a(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void a(android.media.MediaFormat mediaFormat, java.util.List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, java.nio.ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}

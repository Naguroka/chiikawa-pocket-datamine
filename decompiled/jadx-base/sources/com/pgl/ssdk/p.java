package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    public static com.pgl.ssdk.o a(java.io.RandomAccessFile randomAccessFile, long j, long j2) {
        return a(randomAccessFile.getChannel(), j, j2);
    }

    public static com.pgl.ssdk.o a(java.nio.channels.FileChannel fileChannel, long j, long j2) {
        fileChannel.getClass();
        return new com.pgl.ssdk.l(fileChannel, j, j2);
    }
}

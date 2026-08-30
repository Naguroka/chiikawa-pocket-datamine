package androidx.room.util;

/* JADX INFO: loaded from: classes3.dex */
public class FileUtil {
    public static void copy(java.nio.channels.ReadableByteChannel readableByteChannel, java.nio.channels.FileChannel fileChannel) throws java.io.IOException {
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }

    private FileUtil() {
    }
}

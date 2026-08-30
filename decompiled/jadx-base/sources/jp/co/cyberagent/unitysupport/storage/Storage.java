package jp.co.cyberagent.unitysupport.storage;

/* JADX INFO: loaded from: classes6.dex */
public class Storage {
    private Storage() {
    }

    public static long getInternalUsableSpace(android.content.Context context, boolean z, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 26 && z) {
            return getInternalUsableSpaceAboveO(context, j);
        }
        return getInternalUsableSpaceBelowO(context);
    }

    public static long getInternalUsableSpaceBelowO(android.content.Context context) {
        return context.getFilesDir().getUsableSpace();
    }

    public static long getInternalUsableSpaceAboveO(android.content.Context context, long j) {
        try {
            android.os.storage.StorageManager storageManager = (android.os.storage.StorageManager) context.getSystemService(android.os.storage.StorageManager.class);
            java.util.UUID uuidForPath = storageManager.getUuidForPath(context.getFilesDir());
            long allocatableBytes = storageManager.getAllocatableBytes(uuidForPath);
            if (j > 0 && allocatableBytes >= j) {
                storageManager.allocateBytes(uuidForPath, j);
            }
            return allocatableBytes;
        } catch (java.io.IOException unused) {
            return -1L;
        }
    }
}

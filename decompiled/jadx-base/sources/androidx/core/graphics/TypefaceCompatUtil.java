package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatUtil {
    private static final java.lang.String CACHE_FILE_PREFIX = ".font";
    private static final java.lang.String TAG = "TypefaceCompatUtil";

    private TypefaceCompatUtil() {
    }

    public static java.io.File getTempFile(android.content.Context context) {
        java.io.File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        java.lang.String str = CACHE_FILE_PREFIX + android.os.Process.myPid() + "-" + android.os.Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            java.io.File file = new java.io.File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (java.io.IOException unused) {
            }
        }
        return null;
    }

    private static java.nio.ByteBuffer mmap(java.io.File file) {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static java.nio.ByteBuffer mmap(android.content.Context context, android.os.CancellationSignal cancellationSignal, android.net.Uri uri) {
        try {
            android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = androidx.core.graphics.TypefaceCompatUtil.Api19Impl.openFileDescriptor(context.getContentResolver(), uri, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                    java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return map;
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static java.nio.ByteBuffer copyToDirectBuffer(android.content.Context context, android.content.res.Resources resources, int i) {
        java.io.File tempFile = getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (copyToFile(tempFile, resources, i)) {
                return mmap(tempFile);
            }
            return null;
        } finally {
            tempFile.delete();
        }
    }

    public static boolean copyToFile(java.io.File file, java.io.InputStream inputStream) throws java.lang.Throwable {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            closeQuietly(fileOutputStream2);
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (java.io.IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    android.util.Log.e(TAG, "Error copying resource contents to temp file: " + e.getMessage());
                    closeQuietly(fileOutputStream);
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    closeQuietly(fileOutputStream);
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static boolean copyToFile(java.io.File file, android.content.res.Resources resources, int i) throws java.lang.Throwable {
        java.io.InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zCopyToFile = copyToFile(file, inputStreamOpenRawResource);
                closeQuietly(inputStreamOpenRawResource);
                return zCopyToFile;
            } catch (java.lang.Throwable th) {
                th = th;
                closeQuietly(inputStreamOpenRawResource);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> readFontInfoIntoByteBuffer(android.content.Context context, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, android.os.CancellationSignal cancellationSignal) {
        java.util.HashMap map = new java.util.HashMap();
        for (androidx.core.provider.FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            if (fontInfo.getResultCode() == 0) {
                android.net.Uri uri = fontInfo.getUri();
                if (!map.containsKey(uri)) {
                    map.put(uri, mmap(context, cancellationSignal, uri));
                }
            }
        }
        return java.util.Collections.unmodifiableMap(map);
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static android.os.ParcelFileDescriptor openFileDescriptor(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str, android.os.CancellationSignal cancellationSignal) throws java.io.FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }
}

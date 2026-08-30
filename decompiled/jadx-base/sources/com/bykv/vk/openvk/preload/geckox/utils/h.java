package com.bykv.vk.openvk.preload.geckox.utils;

/* JADX INFO: compiled from: UnZipUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f1758a = {80, 75, 3, 4};
    private static byte[] b = {80, 75, 5, 6};

    public static void a(java.io.InputStream inputStream, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.io.Closeable closeable = null;
        try {
            java.lang.String canonicalPath = new java.io.File(str).getCanonicalPath();
            java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(inputStream);
            boolean z = false;
            while (true) {
                try {
                    java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        if (!z) {
                            inputStream.reset();
                            if (!a(inputStream)) {
                                throw new java.lang.RuntimeException("not zip file  channel:".concat(java.lang.String.valueOf(str2)));
                            }
                            throw new java.lang.RuntimeException("unzip file: channel:".concat(java.lang.String.valueOf(str2)));
                        }
                        com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(zipInputStream);
                        return;
                    }
                    java.lang.String name = nextEntry.getName();
                    if (!(name.startsWith("__MACOSX/") || name.equals(".DS_Store") || name.contains("../"))) {
                        if (!name.startsWith(str2 + java.io.File.separator)) {
                            throw new java.lang.RuntimeException("the zip package outermost folder is not named by channel channel:".concat(java.lang.String.valueOf(str2)));
                        }
                        if (nextEntry.isDirectory()) {
                            java.io.File file = new java.io.File(canonicalPath, name);
                            if (!file.getCanonicalPath().startsWith(canonicalPath)) {
                                throw new java.lang.RuntimeException("directory traversal, dir:" + name + ", channel:" + str2);
                            }
                            file.mkdirs();
                        } else {
                            java.lang.String canonicalPath2 = new java.io.File(canonicalPath, name).getCanonicalPath();
                            if (!canonicalPath2.startsWith(canonicalPath)) {
                                throw new java.lang.RuntimeException("directory traversal, file name:".concat(java.lang.String.valueOf(name)));
                            }
                            java.io.File file2 = new java.io.File(canonicalPath2);
                            file2.getParentFile().mkdirs();
                            try {
                                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                                try {
                                    com.bykv.vk.openvk.preload.geckox.utils.b.a(zipInputStream, fileOutputStream);
                                    com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(fileOutputStream);
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    closeable = fileOutputStream;
                                    com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(closeable);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    z = true;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    closeable = zipInputStream;
                    com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(closeable);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    private static boolean a(java.io.InputStream inputStream) throws java.lang.Exception {
        try {
            byte[] bArr = new byte[4];
            if (inputStream.read(bArr, 0, 4) == 4) {
                return java.util.Arrays.equals(f1758a, bArr) || java.util.Arrays.equals(b, bArr);
            }
            return false;
        } finally {
            com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(inputStream);
        }
    }
}

package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class ldr {
    public static java.io.File bg(android.content.Context context, boolean z, java.lang.String str, java.lang.String str2) {
        java.lang.String strIL = IL(context);
        if (z) {
            str = bg(context) + "-" + str;
        }
        if (strIL != null && !strIL.endsWith(java.io.File.separator)) {
            strIL = strIL + java.io.File.separator;
        }
        java.lang.String str3 = strIL + str;
        java.io.File file = new java.io.File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new java.io.File(str3, str2);
    }

    public static java.io.File bg(android.content.Context context, boolean z, java.lang.String str) {
        java.lang.String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z) {
            str = bg(context) + "-" + str;
        }
        if (absolutePath != null && !absolutePath.endsWith(java.io.File.separator)) {
            absolutePath = absolutePath + java.io.File.separator;
        }
        java.io.File file = new java.io.File(absolutePath + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static java.lang.String IL(android.content.Context context) {
        java.io.File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static java.util.List<java.io.File> bg(java.io.File file) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        java.util.List<java.io.File> listAsList = java.util.Arrays.asList(fileArrListFiles);
        java.util.Collections.sort(listAsList, new com.bytedance.sdk.component.utils.ldr.bg(null));
        return listAsList;
    }

    public static void IL(java.io.File file) throws java.io.IOException {
        if (file.exists()) {
            com.bytedance.sdk.component.utils.PX.bg("splashLoadAd", "update file modify time");
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            zx(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                new java.lang.StringBuilder("Last modified date ").append(new java.util.Date(file.lastModified()));
                file.getAbsolutePath();
            }
        }
    }

    public static void bX(java.io.File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            try {
                file.delete();
                return;
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (java.io.File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    bX(file2);
                } else {
                    try {
                        file2.delete();
                    } catch (java.lang.Throwable unused2) {
                    }
                }
            }
        }
        try {
            file.delete();
        } catch (java.lang.Throwable unused3) {
        }
    }

    private static void zx(java.io.File file) throws java.io.IOException {
        java.io.RandomAccessFile randomAccessFile;
        long length = file.length();
        if (length == 0) {
            ldr(file);
            return;
        }
        try {
            randomAccessFile = new java.io.RandomAccessFile(file, "rwd");
            long j = length - 1;
            try {
                randomAccessFile.seek(j);
                byte b = randomAccessFile.readByte();
                randomAccessFile.seek(j);
                randomAccessFile.write(b);
                randomAccessFile.close();
            } catch (java.lang.Throwable unused) {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            }
        } catch (java.lang.Throwable unused2) {
            randomAccessFile = null;
        }
    }

    private static void ldr(java.io.File file) throws java.io.IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new java.io.IOException("Error recreate zero-size file ".concat(java.lang.String.valueOf(file)));
        }
    }

    private static final class bg implements java.util.Comparator<java.io.File> {
        private int bg(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }

        private bg() {
        }

        /* synthetic */ bg(com.bytedance.sdk.component.utils.ldr.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public int compare(java.io.File file, java.io.File file2) {
            return bg(file.lastModified(), file2.lastModified());
        }
    }

    public static byte[] eqN(java.io.File file) {
        java.io.FileInputStream fileInputStream;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                java.lang.Long lValueOf = java.lang.Long.valueOf(file.length());
                fileInputStream = new java.io.FileInputStream(file);
                try {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    if (fileInputStream.read(bArr) == lValueOf.longValue()) {
                        try {
                            fileInputStream.close();
                        } catch (java.lang.Throwable unused) {
                        }
                        return bArr;
                    }
                } catch (java.lang.Throwable unused2) {
                    if (fileInputStream != null) {
                    }
                    return null;
                }
            } catch (java.lang.Throwable unused3) {
                fileInputStream = null;
            }
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable unused4) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ldr$1, reason: invalid class name */
    static class AnonymousClass1 implements java.util.Comparator<java.io.File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.io.File file, java.io.File file2) {
            throw null;
        }
    }

    public static java.lang.String bg(android.content.Context context) {
        java.lang.String strBg = com.bytedance.sdk.component.utils.tuV.bg(context);
        return (android.text.TextUtils.isEmpty(strBg) || !strBg.contains(":")) ? strBg : strBg.replace(":", "-");
    }
}

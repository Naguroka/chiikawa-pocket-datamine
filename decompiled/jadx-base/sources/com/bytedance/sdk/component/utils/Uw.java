package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class Uw {
    public static java.util.List<java.io.File> bg(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        return bg(str, str2, (java.lang.String) null);
    }

    public static java.util.List<java.io.File> bg(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.io.IOException {
        return bg(bg(str), bg(str2), str3);
    }

    public static java.util.List<java.io.File> bg(java.io.File file, java.io.File file2, java.lang.String str) throws java.io.IOException {
        if (file == null || file2 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(file);
        java.util.Enumeration<? extends java.util.zip.ZipEntry> enumerationEntries = zipFile.entries();
        try {
            if (IL(str)) {
                while (enumerationEntries.hasMoreElements()) {
                    java.util.zip.ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    java.lang.String name = zipEntryNextElement.getName();
                    if (name.contains("../")) {
                        new java.lang.StringBuilder("entryName: ").append(name);
                    } else if (!bg(file2, arrayList, zipFile, zipEntryNextElement, name)) {
                        zipFile.close();
                        return arrayList;
                    }
                }
            } else {
                while (enumerationEntries.hasMoreElements()) {
                    java.util.zip.ZipEntry zipEntryNextElement2 = enumerationEntries.nextElement();
                    java.lang.String name2 = zipEntryNextElement2.getName();
                    if (name2.contains("../")) {
                        new java.lang.StringBuilder("entryName: ").append(name2);
                    } else if (name2.contains(str) && !bg(file2, arrayList, zipFile, zipEntryNextElement2, name2)) {
                        zipFile.close();
                        return arrayList;
                    }
                }
            }
            zipFile.close();
            return arrayList;
        } catch (java.lang.Throwable th) {
            zipFile.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    private static boolean bg(java.io.File file, java.util.List<java.io.File> list, java.util.zip.ZipFile zipFile, java.util.zip.ZipEntry zipEntry, java.lang.String str) throws java.lang.Throwable {
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.FileOutputStream fileOutputStream;
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.Throwable th;
        java.io.File file2 = new java.io.File(file, str);
        list.add(file2);
        if (zipEntry.isDirectory()) {
            return bg(file2);
        }
        if (!IL(file2)) {
            return false;
        }
        try {
            fileOutputStream = new java.io.FileOutputStream(file2);
            try {
                bufferedInputStream = new java.io.BufferedInputStream(zipFile.getInputStream(zipEntry));
                try {
                    bufferedOutputStream = new java.io.BufferedOutputStream(fileOutputStream);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i != -1) {
                                bufferedOutputStream.write(bArr, 0, i);
                            } else {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                fileOutputStream.close();
                                return true;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                    th = th;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
                bufferedInputStream = null;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            fileOutputStream = null;
            bufferedInputStream = null;
        }
    }

    private static boolean bg(java.io.File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    private static boolean IL(java.io.File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!bg(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static java.io.File bg(java.lang.String str) {
        if (IL(str)) {
            return null;
        }
        return new java.io.File(str);
    }

    private static boolean IL(java.lang.String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!java.lang.Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

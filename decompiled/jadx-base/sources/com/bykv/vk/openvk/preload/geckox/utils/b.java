package com.bykv.vk.openvk.preload.geckox.utils;

/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static boolean a(java.io.File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "delete file，pid:", java.lang.Integer.valueOf(android.os.Process.myPid()), ", thread:", java.lang.Thread.currentThread().toString(), ", file:" + file.getAbsolutePath());
        return d(file);
    }

    private static boolean d(java.io.File file) {
        boolean z;
        java.io.File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return true;
        }
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            z = true;
        } else {
            z = true;
            for (java.io.File file2 : fileArrListFiles) {
                z = z && d(file2);
            }
        }
        return z && file.delete();
    }

    public static void a(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(outputStream);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i != -1) {
                bufferedOutputStream.write(bArr, 0, i);
            } else {
                bufferedOutputStream.flush();
                return;
            }
        }
    }

    public static java.util.List<java.io.File> b(java.io.File file) {
        java.io.File[] fileArrListFiles;
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return null;
        }
        java.util.List<java.io.File> listAsList = java.util.Arrays.asList(fileArrListFiles);
        final java.util.HashMap map = new java.util.HashMap();
        for (java.io.File file2 : listAsList) {
            map.put(file2, java.lang.Long.valueOf(file2.lastModified()));
        }
        java.util.Collections.sort(listAsList, new java.util.Comparator<java.io.File>() { // from class: com.bykv.vk.openvk.preload.geckox.utils.b.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(java.io.File file3, java.io.File file4) {
                java.io.File file5 = file3;
                java.io.File file6 = file4;
                if (file5 == null && file6 == null) {
                    return 0;
                }
                if (file5 == null) {
                    return 1;
                }
                if (file6 == null) {
                    return -1;
                }
                return java.lang.Long.compare(((java.lang.Long) map.get(file5)).longValue(), ((java.lang.Long) map.get(file6)).longValue());
            }
        });
        return listAsList;
    }

    public static boolean c(java.io.File file) {
        if (file.isDirectory()) {
            for (java.lang.String str : file.list()) {
                if (!c(new java.io.File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static java.lang.String a(java.io.InputStream inputStream) {
        java.io.BufferedReader bufferedReader;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
            while (true) {
                try {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                } catch (java.lang.Throwable unused) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.lang.Throwable unused3) {
                        }
                    }
                    return null;
                }
            }
            java.lang.String string = sb.toString();
            try {
                bufferedReader.close();
            } catch (java.lang.Throwable unused4) {
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Throwable unused5) {
                }
            }
            return string;
        } catch (java.lang.Throwable unused6) {
            bufferedReader = null;
        }
    }
}

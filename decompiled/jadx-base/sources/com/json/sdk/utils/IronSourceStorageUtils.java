package com.json.sdk.utils;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceStorageUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3403a = "supersonicads";
    private static com.json.nt b = null;
    private static boolean c = false;

    private static void a(android.content.Context context) {
        com.json.nt ntVar = b;
        if (ntVar != null && ntVar.b()) {
            deleteCacheDirectories(context);
        }
        com.json.nt ntVar2 = b;
        if (ntVar2 == null || !ntVar2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static void a(java.io.File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static boolean a() {
        com.json.nt ntVar;
        return android.os.Build.VERSION.SDK_INT > 29 && (ntVar = b) != null && ntVar.a();
    }

    private static java.io.File b(android.content.Context context) {
        com.json.Cif cifF = com.json.im.S().f();
        com.json.nt ntVar = b;
        return (ntVar == null || !ntVar.d()) ? cifF.t(context) : cifF.e(context);
    }

    private static java.io.File b(java.io.File file) {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(file.getAbsolutePath());
        java.lang.String str = java.io.File.separator;
        return new java.io.File(sbAppend.append(str).append(f3403a).append(str).toString());
    }

    public static java.lang.String buildAbsolutePathToDirInCache(java.lang.String str, java.lang.String str2) {
        return str2 == null ? str : str + java.io.File.separator + str2;
    }

    public static org.json.JSONObject buildFilesMap(java.lang.String str, java.lang.String str2) {
        java.lang.String name;
        java.io.File file = new java.io.File(str, str2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                try {
                    java.lang.Object objC = c(file2);
                    if (objC instanceof org.json.JSONArray) {
                        name = "files";
                    } else {
                        if (objC instanceof org.json.JSONObject) {
                            name = file2.getName();
                        }
                    }
                    jSONObject.put(name, c(file2));
                } catch (org.json.JSONException e) {
                    com.json.l9.d().a(e);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
            }
        }
        return jSONObject;
    }

    public static org.json.JSONObject buildFilesMapOfDirectory(com.json.ih ihVar, org.json.JSONObject jSONObject) throws java.lang.Exception {
        java.lang.String name;
        org.json.JSONObject jSONObjectBuildFilesMapOfDirectory;
        if (ihVar == null || !ihVar.isDirectory()) {
            return new org.json.JSONObject();
        }
        java.io.File[] fileArrListFiles = ihVar.listFiles();
        if (fileArrListFiles == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.io.File file : fileArrListFiles) {
            com.json.ih ihVar2 = new com.json.ih(file.getPath());
            if (ihVar2.isFile()) {
                name = ihVar2.getName();
                jSONObjectBuildFilesMapOfDirectory = ihVar2.a();
                if (jSONObject.has(name)) {
                    jSONObjectBuildFilesMapOfDirectory = com.json.sdk.utils.SDKUtils.mergeJSONObjects(jSONObjectBuildFilesMapOfDirectory, jSONObject.getJSONObject(name));
                }
            } else {
                if (ihVar2.isDirectory()) {
                    name = ihVar2.getName();
                    jSONObjectBuildFilesMapOfDirectory = buildFilesMapOfDirectory(ihVar2, jSONObject);
                }
            }
            jSONObject2.put(name, jSONObjectBuildFilesMapOfDirectory);
        }
        return jSONObject2;
    }

    private static java.io.File c(android.content.Context context) {
        com.json.Cif cifF = com.json.im.S().f();
        com.json.nt ntVar = b;
        return (ntVar == null || !ntVar.d()) ? cifF.w(context) : cifF.k(context);
    }

    private static java.lang.Object c(java.io.File file) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            if (file.isFile()) {
                jSONArray.put(file.getName());
                return jSONArray;
            }
            for (java.io.File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    jSONObject.put(file2.getName(), c(file2));
                } else {
                    jSONArray.put(file2.getName());
                    jSONObject.put("files", jSONArray);
                }
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public static void deleteCacheDirectories(android.content.Context context) {
        com.json.Cif cifF = com.json.im.S().f();
        a(cifF.e(context));
        a(cifF.k(context));
    }

    public static synchronized boolean deleteFile(com.json.ih ihVar) {
        if (!ihVar.exists()) {
            return false;
        }
        return ihVar.delete();
    }

    public static void deleteFilesDirectories(android.content.Context context) {
        com.json.Cif cifF = com.json.im.S().f();
        a(cifF.t(context));
        a(cifF.w(context));
    }

    public static synchronized boolean deleteFolder(java.lang.String str) {
        java.io.File file;
        file = new java.io.File(str);
        return deleteFolderContentRecursive(file) && file.delete();
    }

    public static boolean deleteFolderContentRecursive(java.io.File file) {
        java.io.File[] fileArrListFiles = file.listFiles();
        boolean zDeleteFolderContentRecursive = true;
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteFolderContentRecursive &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    zDeleteFolderContentRecursive = false;
                }
            }
        }
        return zDeleteFolderContentRecursive;
    }

    public static void ensurePathSafety(java.io.File file, java.lang.String str) throws java.lang.Exception {
        com.json.nt ntVar = b;
        if (ntVar == null || !ntVar.e()) {
            java.lang.String canonicalPath = new java.io.File(str).getCanonicalPath();
            java.lang.String canonicalPath2 = file.getCanonicalPath();
            if (!canonicalPath2.startsWith(canonicalPath)) {
                throw new java.lang.Exception(com.ironsource.y8.c.u + canonicalPath2);
            }
        }
    }

    public static java.lang.String getCachedFilesMap(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObjectBuildFilesMap = buildFilesMap(str, str2);
        try {
            jSONObjectBuildFilesMap.put("path", str2);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObjectBuildFilesMap.toString();
    }

    public static java.lang.String getDiskCacheDirPath(android.content.Context context) {
        java.io.File fileB;
        if (!a() || !com.json.sdk.utils.SDKUtils.isExternalStorageAvailable() || (fileB = b(context)) == null || !fileB.canWrite()) {
            return c(context).getPath();
        }
        c = true;
        return fileB.getPath();
    }

    public static java.util.ArrayList<com.json.ih> getFilesInFolderRecursive(com.json.ih ihVar) {
        if (ihVar == null || !ihVar.isDirectory()) {
            return new java.util.ArrayList<>();
        }
        java.util.ArrayList<com.json.ih> arrayList = new java.util.ArrayList<>();
        java.io.File[] fileArrListFiles = ihVar.listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file : fileArrListFiles) {
                com.json.ih ihVar2 = new com.json.ih(file.getPath());
                if (ihVar2.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(ihVar2));
                }
                if (ihVar2.isFile()) {
                    arrayList.add(ihVar2);
                }
            }
        }
        return arrayList;
    }

    public static java.lang.String getNetworkStorageDir(android.content.Context context) {
        java.io.File fileB = b(new java.io.File(getDiskCacheDirPath(context)));
        if (!fileB.exists()) {
            fileB.mkdir();
        }
        return fileB.getPath();
    }

    public static long getTotalSizeOfDir(com.json.ih ihVar) {
        long totalSizeOfDir;
        long j = 0;
        if (ihVar != null && ihVar.isDirectory()) {
            java.io.File[] fileArrListFiles = ihVar.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (java.io.File file : fileArrListFiles) {
                com.json.ih ihVar2 = new com.json.ih(file.getPath());
                if (ihVar2.isFile()) {
                    totalSizeOfDir = ihVar2.length();
                } else {
                    if (ihVar2.isDirectory()) {
                        totalSizeOfDir = getTotalSizeOfDir(ihVar2);
                    }
                }
                j += totalSizeOfDir;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(android.content.Context context, com.json.nt ntVar) {
        b = ntVar;
        a(context);
    }

    public static boolean isPathExist(java.lang.String str, java.lang.String str2) {
        return new java.io.File(str, str2).exists();
    }

    public static boolean isUxt() {
        return c;
    }

    public static java.lang.String makeDir(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static java.lang.String readFile(com.json.ih ihVar) throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(ihVar));
        while (true) {
            java.lang.String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
            sb.append('\n');
        }
    }

    public static boolean renameFile(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        return new java.io.File(str).renameTo(new java.io.File(str2));
    }

    public static int saveFile(byte[] bArr, java.lang.String str) throws java.lang.Exception {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(str));
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[com.google.android.gms.nearby.messages.Message.MAX_CONTENT_SIZE_BYTES];
            int i = 0;
            while (true) {
                int i2 = byteArrayInputStream.read(bArr2);
                if (i2 == -1) {
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return i;
                }
                fileOutputStream.write(bArr2, 0, i2);
                i += i2;
            }
        } catch (java.lang.Throwable th) {
            fileOutputStream.close();
            byteArrayInputStream.close();
            throw th;
        }
    }
}

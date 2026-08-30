package com.unity3d.services.core.misc;

/* JADX INFO: loaded from: classes6.dex */
public class Utilities {
    public static void runOnUiThread(java.lang.Runnable runnable) {
        runOnUiThread(runnable, 0L);
    }

    public static void runOnUiThread(java.lang.Runnable runnable, long j) {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else {
            handler.post(runnable);
        }
    }

    public static java.lang.String Sha256(java.lang.String str) {
        return Sha256(str.getBytes());
    }

    public static java.lang.String Sha256(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, 0, bArr.length);
            return toHexString(messageDigest.digest());
        } catch (java.security.NoSuchAlgorithmException e) {
            com.unity3d.services.core.log.DeviceLog.exception("SHA-256 algorithm not found", e);
            return null;
        }
    }

    public static java.lang.String Sha256(java.io.InputStream inputStream) throws java.io.IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    return toHexString(messageDigest.digest());
                }
            }
        } catch (java.security.NoSuchAlgorithmException e) {
            com.unity3d.services.core.log.DeviceLog.exception("SHA-256 algorithm not found", e);
            return null;
        }
    }

    public static java.lang.String toHexString(byte[] bArr) {
        java.lang.String str = "";
        for (byte b : bArr) {
            int i = b & 255;
            if (i <= 15) {
                str = str + "0";
            }
            str = str + java.lang.Integer.toHexString(i);
        }
        return str;
    }

    public static boolean writeFile(java.io.File file, java.lang.String str) {
        boolean z = false;
        if (file == null) {
            return false;
        }
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (java.lang.Exception e) {
                        com.unity3d.services.core.log.DeviceLog.exception("Error closing FileOutputStream", e);
                    }
                    z = true;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    com.unity3d.services.core.log.DeviceLog.exception("Could not write file", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.lang.Exception e3) {
                            com.unity3d.services.core.log.DeviceLog.exception("Error closing FileOutputStream", e3);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.lang.Exception e4) {
                            com.unity3d.services.core.log.DeviceLog.exception("Error closing FileOutputStream", e4);
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Exception e5) {
            e = e5;
        }
        if (z) {
            com.unity3d.services.core.log.DeviceLog.debug("Wrote file: " + file.getAbsolutePath());
        }
        return z;
    }

    public static byte[] readFileBytes(java.io.File file) throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream = null;
        if (file == null || !file.exists()) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return java.nio.file.Files.readAllBytes(file.toPath());
        }
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                if (fileInputStream2.read(bArr) != length) {
                    throw new java.io.IOException("Failed to read all bytes from input file path: " + file.getPath());
                }
                fileInputStream2.close();
                return bArr;
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static org.json.JSONObject mergeJsonObjects(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws org.json.JSONException {
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            jSONObject3.put(next, jSONObject2.get(next));
        }
        java.util.Iterator<java.lang.String> itKeys2 = jSONObject.keys();
        while (itKeys2.hasNext()) {
            java.lang.String next2 = itKeys2.next();
            if (jSONObject3.has(next2) && (jSONObject3.get(next2) instanceof org.json.JSONObject) && (jSONObject.get(next2) instanceof org.json.JSONObject)) {
                jSONObject3.put(next2, mergeJsonObjects(jSONObject.getJSONObject(next2), jSONObject3.getJSONObject(next2)));
            } else {
                jSONObject3.put(next2, jSONObject.get(next2));
            }
        }
        return jSONObject3;
    }

    public static java.util.Map<java.lang.String, java.lang.Object> combineJsonIntoMap(java.util.Map<java.lang.String, java.lang.Object> map, org.json.JSONObject jSONObject, java.lang.String str) {
        java.util.HashMap map2 = new java.util.HashMap(map);
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            map2.put(str + next, jSONObject.opt(next));
        }
        return map2;
    }

    public static java.util.Map<java.lang.String, java.lang.Object> combineJsonIntoMap(java.util.Map<java.lang.String, java.lang.Object> map, org.json.JSONObject jSONObject) {
        return combineJsonIntoMap(map, jSONObject, "");
    }

    public static java.util.Map<java.lang.String, java.lang.Object> convertJsonToMap(org.json.JSONObject jSONObject) {
        return combineJsonIntoMap(new java.util.HashMap(), jSONObject);
    }

    public static <T> T getService(java.lang.String str, java.lang.Class cls) {
        return (T) com.unity3d.services.core.di.ServiceProvider.INSTANCE.getRegistry().getService(str, kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls));
    }

    public static <T> T getService(java.lang.Class cls) {
        return (T) getService("", cls);
    }

    public static void wrapCustomerListener(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.error("An uncaught exception has occurred in the client application.  Exception: %s", e.getMessage());
        }
    }
}

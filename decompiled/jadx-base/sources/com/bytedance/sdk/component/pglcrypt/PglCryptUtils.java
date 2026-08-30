package com.bytedance.sdk.component.pglcrypt;

/* JADX INFO: loaded from: classes3.dex */
public class PglCryptUtils {
    public static final int BASE64_FAILED = 504;
    public static final int COMPRESS_FAILED = 503;
    public static final int CRYPT_OK = 0;
    public static final int CYPHER_VERSION = 4;
    public static final int DECRYPT_FAILED = 506;
    public static final int ENCRYPT_FAILED = 505;
    private static volatile boolean IL = true;
    public static final int INPUT_INVALID = 502;
    public static final java.lang.String KEY_CYPHER = "cypher";
    public static final java.lang.String KEY_MESSAGE = "message";
    public static final int LOAD_SO_FAILED = 501;
    private static volatile com.bytedance.sdk.component.pglcrypt.PglCryptUtils bg;

    public static native byte[] bc(int i, byte[] bArr);

    private PglCryptUtils() {
    }

    public static com.bytedance.sdk.component.pglcrypt.PglCryptUtils getInstance() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.component.pglcrypt.PglCryptUtils.class) {
                if (bg == null) {
                    try {
                        java.lang.System.loadLibrary("pglarmor");
                    } catch (java.lang.Throwable unused) {
                        IL = false;
                    }
                    bg = new com.bytedance.sdk.component.pglcrypt.PglCryptUtils();
                }
            }
        }
        return bg;
    }

    public android.util.Pair<java.lang.Integer, org.json.JSONObject> cypher4Encrypt(org.json.JSONObject jSONObject) throws java.lang.Throwable {
        byte[] bArrBc;
        if (!IL) {
            return new android.util.Pair<>(501, null);
        }
        if (jSONObject == null) {
            return new android.util.Pair<>(502, null);
        }
        byte[] bArrBg = bg(jSONObject.toString());
        if (bArrBg == null || bArrBg.length == 0) {
            return new android.util.Pair<>(503, null);
        }
        try {
            bArrBc = bc(1010, bArrBg);
        } catch (java.lang.Throwable th) {
            android.util.Log.e("ARMOR", th.toString());
            bArrBc = null;
        }
        if (bArrBc == null || bArrBc.length == 0) {
            return new android.util.Pair<>(505, null);
        }
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(bArrBc, 0);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (android.text.TextUtils.isEmpty(strEncodeToString)) {
            return new android.util.Pair<>(504, null);
        }
        jSONObject2.put(KEY_MESSAGE, strEncodeToString);
        jSONObject2.put("cypher", 4);
        return new android.util.Pair<>(0, jSONObject2);
    }

    public android.util.Pair<java.lang.Integer, byte[]> cypher4Encrypt(byte[] bArr) {
        byte[] bArrBc;
        if (!IL) {
            return new android.util.Pair<>(501, null);
        }
        if (bArr == null || bArr.length == 0) {
            return new android.util.Pair<>(502, null);
        }
        try {
            bArrBc = bc(1010, bArr);
        } catch (java.lang.Throwable th) {
            android.util.Log.e("ARMOR", th.toString());
            bArrBc = null;
        }
        if (bArrBc == null || bArrBc.length == 0) {
            return new android.util.Pair<>(505, null);
        }
        return new android.util.Pair<>(0, bArrBc);
    }

    public android.util.Pair<java.lang.Integer, java.lang.String> cypher4Decrypt(java.lang.String str) throws java.lang.Throwable {
        byte[] bArrBc;
        if (!IL) {
            return new android.util.Pair<>(501, null);
        }
        if (str == null || str.length() == 0) {
            return new android.util.Pair<>(502, null);
        }
        byte[] bArrDecode = android.util.Base64.decode(str, 0);
        if (bArrDecode == null || bArrDecode.length == 0) {
            return new android.util.Pair<>(504, null);
        }
        try {
            bArrBc = bc(1011, bArrDecode);
        } catch (java.lang.Throwable th) {
            android.util.Log.e("ARMOR", th.toString());
            bArrBc = null;
        }
        if (bArrBc == null || bArrBc.length == 0) {
            return new android.util.Pair<>(506, null);
        }
        java.lang.String strBg = bg(bArrBc);
        if (android.text.TextUtils.isEmpty(strBg)) {
            return new android.util.Pair<>(503, null);
        }
        return new android.util.Pair<>(0, strBg);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0065 A[Catch: Exception -> 0x0061, TRY_LEAVE, TryCatch #7 {Exception -> 0x0061, blocks: (B:35:0x005d, B:39:0x0065), top: B:48:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static byte[] bg(java.lang.String str) throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.util.zip.GZIPOutputStream gZIPOutputStream;
        java.util.zip.GZIPOutputStream gZIPOutputStream2 = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    try {
                        byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        try {
                            gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                            try {
                                try {
                                    gZIPOutputStream.write(str.getBytes(com.json.zb.N));
                                    gZIPOutputStream.close();
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    return byteArray;
                                } catch (java.lang.Exception e) {
                                    e = e;
                                    android.util.Log.e("ARMOR", e.toString());
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (byteArrayOutputStream == null) {
                                        return null;
                                    }
                                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    return byteArray2;
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                gZIPOutputStream2 = gZIPOutputStream;
                                if (gZIPOutputStream2 != null) {
                                    try {
                                        gZIPOutputStream2.close();
                                        if (byteArrayOutputStream != null) {
                                            byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                        }
                                    } catch (java.lang.Exception e2) {
                                        android.util.Log.e("ARMOR", e2.toString());
                                        throw th;
                                    }
                                } else if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (java.lang.Exception e3) {
                            e = e3;
                            gZIPOutputStream = null;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (gZIPOutputStream2 != null) {
                                gZIPOutputStream2.close();
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                }
                            } else if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (java.lang.Exception e4) {
                        e = e4;
                        byteArrayOutputStream = null;
                        gZIPOutputStream = null;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                    }
                }
            } catch (java.lang.Exception e5) {
                android.util.Log.e("ARMOR", e5.toString());
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #5 {Exception -> 0x0064, blocks: (B:31:0x0060, B:35:0x0068), top: B:61:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0082 A[Catch: Exception -> 0x007e, TRY_LEAVE, TryCatch #0 {Exception -> 0x007e, blocks: (B:43:0x007a, B:47:0x0082), top: B:52:0x007a }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r8v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v9 */
    private static java.lang.String bg(byte[] bArr) throws java.lang.Throwable {
        ?? gZIPInputStream;
        java.lang.Throwable th;
        ?? string;
        java.lang.Exception exc;
        java.lang.String str;
        java.lang.String string2 = null;
        string2 = null;
         = 0;
        ?? r1 = 0;
        if (bArr != 0) {
            try {
                if (bArr.length != 0) {
                    try {
                        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                        bArr = new java.io.ByteArrayOutputStream();
                        try {
                            gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream);
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i = gZIPInputStream.read(bArr2);
                                    if (i == -1) {
                                        break;
                                    }
                                    bArr.write(bArr2, 0, i);
                                }
                                string2 = bArr.toString(com.json.zb.N);
                                byteArrayInputStream.close();
                                try {
                                    gZIPInputStream.close();
                                    bArr.close();
                                    bArr = bArr;
                                } catch (java.lang.Exception e) {
                                    java.lang.String string3 = e.toString();
                                    android.util.Log.e("ARMOR", string3);
                                    bArr = string3;
                                }
                            } catch (java.lang.Exception e2) {
                                str = string2;
                                r1 = gZIPInputStream;
                                exc = e2;
                                string = bArr;
                                android.util.Log.e("ARMOR", exc.toString());
                                if (r1 != 0) {
                                    try {
                                        r1.close();
                                        if (string != 0) {
                                            string.close();
                                        }
                                    } catch (java.lang.Exception e3) {
                                        string = e3.toString();
                                        android.util.Log.e("ARMOR", string);
                                        string2 = str;
                                        bArr = string;
                                        return string2;
                                    }
                                } else if (string != 0) {
                                    string.close();
                                }
                                string2 = str;
                                bArr = string;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                if (gZIPInputStream != 0) {
                                    try {
                                        gZIPInputStream.close();
                                        if (bArr != 0) {
                                            bArr.close();
                                        }
                                    } catch (java.lang.Exception e4) {
                                        android.util.Log.e("ARMOR", e4.toString());
                                        throw th;
                                    }
                                } else if (bArr != 0) {
                                    bArr.close();
                                }
                                throw th;
                            }
                        } catch (java.lang.Exception e5) {
                            exc = e5;
                            str = null;
                            string = bArr;
                        }
                    } catch (java.lang.Exception e6) {
                        string = 0;
                        exc = e6;
                        str = null;
                    } catch (java.lang.Throwable th3) {
                        gZIPInputStream = 0;
                        th = th3;
                        bArr = 0;
                    }
                    return string2;
                }
            } catch (java.lang.Throwable th4) {
                gZIPInputStream = string2;
                th = th4;
            }
        }
        return null;
    }
}

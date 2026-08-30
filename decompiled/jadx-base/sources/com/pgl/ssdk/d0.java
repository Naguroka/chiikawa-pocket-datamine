package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class d0 {
    private static void a(byte[] bArr, int i, byte[] bArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % bArr2.length]);
        }
    }

    private static java.lang.String a(java.io.BufferedInputStream bufferedInputStream) {
        int i;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[4096];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        do {
            try {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    sb.append(new java.lang.String(bArr, 0, i));
                }
            } catch (java.lang.Exception unused) {
            }
        } while (i >= 4096);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:48:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[SYNTHETIC] */
    private static java.lang.String a(java.lang.String str) throws java.lang.Throwable {
        java.lang.Process processExec;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.BufferedOutputStream bufferedOutputStream2 = null;
        str = null;
        java.lang.String str2 = null;
        try {
            processExec = java.lang.Runtime.getRuntime().exec("sh");
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(processExec.getOutputStream());
                try {
                    bufferedInputStream = new java.io.BufferedInputStream(processExec.getInputStream());
                    try {
                        bufferedOutputStream.write(str.getBytes());
                        bufferedOutputStream.write(10);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        processExec.waitFor();
                        java.lang.String strA = a(bufferedInputStream);
                        try {
                            bufferedOutputStream.close();
                        } catch (java.io.IOException unused) {
                        }
                        try {
                            bufferedInputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                        str2 = strA;
                    } catch (java.lang.Exception unused3) {
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (java.io.IOException unused4) {
                            }
                        }
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (java.io.IOException unused5) {
                            }
                        }
                        if (processExec != null) {
                        }
                        return str2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bufferedOutputStream2 = bufferedOutputStream;
                        if (bufferedOutputStream2 != null) {
                            try {
                                bufferedOutputStream2.close();
                            } catch (java.io.IOException unused6) {
                            }
                        }
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (java.io.IOException unused7) {
                            }
                        }
                        if (processExec != null) {
                            throw th;
                        }
                        processExec.destroy();
                        throw th;
                    }
                } catch (java.lang.Exception unused8) {
                    bufferedInputStream = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                }
            } catch (java.lang.Exception unused9) {
                bufferedOutputStream = null;
                bufferedInputStream = null;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return str2;
            } catch (java.lang.Throwable th3) {
                th = th3;
                bufferedInputStream = null;
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (processExec != null) {
                    throw th;
                }
                processExec.destroy();
                throw th;
            }
        } catch (java.lang.Exception unused10) {
            processExec = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            processExec = null;
        }
        processExec.destroy();
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00df  */
    public static synchronized java.lang.String a(android.content.Context context) {
        java.lang.String strA;
        try {
            java.lang.String str = context.getFilesDir().getAbsolutePath() + "/dic";
            if (new java.io.File(str).exists()) {
                a("chmod 777 ".concat(java.lang.String.valueOf(str)));
                java.lang.String strA2 = a(str);
                a("chmod 600 ".concat(java.lang.String.valueOf(str)));
                if (strA2 != null && strA2.length() > 0) {
                    return strA2;
                }
            }
            java.io.InputStream inputStreamOpen = context.getResources().getAssets().open("dic");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStreamOpen.read(bArr, 0, 4096);
                if (i == -1) {
                    break;
                }
                a(bArr, i, "dic".getBytes(java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING)));
                byteArrayOutputStream.write(bArr, 0, i);
            }
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.close();
            a("chmod 777 ".concat(java.lang.String.valueOf(str)));
            strA = a(str);
            if (strA == null || strA.length() == 0) {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, "rw");
                randomAccessFile.seek(16L);
                randomAccessFile.write(new byte[]{2});
                randomAccessFile.close();
                strA = a(str);
            }
            a("chmod 600 ".concat(java.lang.String.valueOf(str)));
        } catch (java.lang.Throwable unused) {
            strA = "0[<!>]EXCEPTION[<!>]";
        }
        if (strA == null) {
            strA = "0[<!>]ERROR[<!>]";
        } else if (strA.length() == 0) {
            strA = "0[<!>]ERROR[<!>]";
        }
        return strA;
    }
}

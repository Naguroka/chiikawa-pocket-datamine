package com.bytedance.sdk.component.zx.bX.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bytedance.sdk.component.zx.bX {
    private com.bytedance.sdk.component.zx.bX.bg.bg.bg IL;
    private long bg;

    public IL(java.io.File file, long j, java.util.concurrent.ExecutorService executorService) {
        this.bg = j;
        try {
            this.IL = com.bytedance.sdk.component.zx.bX.bg.bg.bg.bg(file, 20210302, 1, j, executorService);
        } catch (java.io.IOException e) {
            android.util.Log.w("LruCountDiskCache", e.toString());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.zx.bX
    public java.io.InputStream bg(java.lang.String str) {
        com.bytedance.sdk.component.zx.bX.bg.bg.bg bgVar = this.IL;
        if (bgVar == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.zx.bX.bg.bg.bg.bX bXVarBg = bgVar.bg(str);
            if (bXVarBg != null) {
                return bXVarBg.bg(0);
            }
        } catch (java.io.IOException e) {
            android.util.Log.w("LruCountDiskCache", e.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.zx.bg
    public boolean bg(java.lang.String str, byte[] bArr) throws java.lang.Throwable {
        com.bytedance.sdk.component.zx.bX.bg.bg.bg bgVar = this.IL;
        if (bgVar == null || bArr == null || str == null) {
            return false;
        }
        java.io.Closeable closeable = null;
        com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg c0119bg = null;
        try {
            try {
                com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg c0119bgIL = bgVar.IL(str);
                try {
                    if (c0119bgIL == null) {
                        android.util.Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(null);
                        return false;
                    }
                    java.io.OutputStream outputStreamBg = c0119bgIL.bg(0);
                    if (outputStreamBg == com.bytedance.sdk.component.zx.bX.bg.bg.bg.bX) {
                        android.util.Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(outputStreamBg);
                        return false;
                    }
                    outputStreamBg.write(bArr);
                    c0119bgIL.bg();
                    this.IL.bg();
                    com.bytedance.sdk.component.zx.bX.bX.IL.bg(outputStreamBg);
                    return true;
                } catch (java.io.IOException e) {
                    e = e;
                    c0119bg = c0119bgIL;
                    try {
                        android.util.Log.w("LruCountDiskCache", e.toString());
                        if (c0119bg != null) {
                            try {
                                c0119bg.IL();
                            } catch (java.io.IOException unused) {
                            }
                        }
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(0);
                        return false;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        closeable = closeable;
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(closeable);
                        throw th;
                    }
                }
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            com.bytedance.sdk.component.zx.bX.bX.IL.bg(closeable);
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.zx.bg
    /* JADX INFO: renamed from: IL, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] bg(java.lang.String str) throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.InputStream inputStreamBg;
        com.bytedance.sdk.component.zx.bX.bg.bg.bg bgVar = this.IL;
        java.io.InputStream inputStream = null;
        if (bgVar == null || str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.zx.bX.bg.bg.bg.bX bXVarBg = bgVar.bg(str);
            if (bXVarBg == null) {
                com.bytedance.sdk.component.zx.bX.bX.IL.bg(null);
                com.bytedance.sdk.component.zx.bX.bX.IL.bg(null);
                return null;
            }
            inputStreamBg = bXVarBg.bg(0);
            if (inputStreamBg != null) {
                try {
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = inputStreamBg.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                        } catch (java.io.IOException e) {
                            e = e;
                            android.util.Log.w("LruCountDiskCache", e.toString());
                            com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStreamBg);
                            com.bytedance.sdk.component.zx.bX.bX.IL.bg(byteArrayOutputStream);
                            return null;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        inputStream = inputStreamBg;
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream);
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(byteArrayOutputStream);
                        throw th;
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                    android.util.Log.w("LruCountDiskCache", e.toString());
                    com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStreamBg);
                    com.bytedance.sdk.component.zx.bX.bX.IL.bg(byteArrayOutputStream);
                    return null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = null;
                    inputStream = inputStreamBg;
                    com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream);
                    com.bytedance.sdk.component.zx.bX.bX.IL.bg(byteArrayOutputStream);
                    throw th;
                }
            } else {
                byteArrayOutputStream = null;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStreamBg);
            com.bytedance.sdk.component.zx.bX.bX.IL.bg(byteArrayOutputStream);
            return byteArray;
        } catch (java.io.IOException e3) {
            e = e3;
            inputStreamBg = null;
            byteArrayOutputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream);
            com.bytedance.sdk.component.zx.bX.bX.IL.bg(byteArrayOutputStream);
            throw th;
        }
        android.util.Log.w("LruCountDiskCache", e.toString());
        com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStreamBg);
        com.bytedance.sdk.component.zx.bX.bX.IL.bg(byteArrayOutputStream);
        return null;
    }

    @Override // com.bytedance.sdk.component.zx.bg
    /* JADX INFO: renamed from: bX, reason: merged with bridge method [inline-methods] */
    public boolean IL(java.lang.String str) {
        try {
            try {
                com.bytedance.sdk.component.zx.bX.bg.bg.bg.bX bXVarBg = this.IL.bg(str);
                boolean z = bXVarBg != null;
                com.bytedance.sdk.component.zx.bX.bX.IL.bg(bXVarBg);
                return z;
            } catch (java.io.IOException e) {
                android.util.Log.w("LruCountDiskCache", e.getMessage());
                com.bytedance.sdk.component.zx.bX.bX.IL.bg(null);
                return false;
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.zx.bX.bX.IL.bg(null);
            throw th;
        }
    }
}

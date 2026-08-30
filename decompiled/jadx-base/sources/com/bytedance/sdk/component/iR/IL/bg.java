package com.bytedance.sdk.component.iR.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends com.bytedance.sdk.component.iR.IL.bX {
    public java.io.File IL;
    public java.io.File bg;
    private volatile boolean eo;

    public bg(com.bytedance.sdk.component.IL.bg.VB vb) {
        super(vb);
    }

    public void bg(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.bg = new java.io.File(str, str2);
        this.IL = new java.io.File(str, str2 + ".temp");
    }

    public void bg(final com.bytedance.sdk.component.iR.bg.bg bgVar) {
        java.io.File file = this.bg;
        if (file == null || this.IL == null) {
            if (bgVar != null) {
                bgVar.bg(this, new java.io.IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.bg.length() != 0 && bgVar != null) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            com.bytedance.sdk.component.iR.IL il = new com.bytedance.sdk.component.iR.IL(true, 200, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            il.bg(this.bg);
            bgVar.bg(this, il);
            return;
        }
        long length = this.IL.length();
        final long j = length >= 0 ? length : 0L;
        com.bytedance.sdk.component.IL.bg.Ta.bg bgVar2 = new com.bytedance.sdk.component.IL.bg.Ta.bg();
        bgVar2.bg((java.lang.Object) bX());
        IL(com.google.common.net.HttpHeaders.RANGE, "bytes=" + j + "-");
        if (android.text.TextUtils.isEmpty(this.Kg)) {
            bgVar.bg(this, new java.io.IOException("Url is Empty"));
            return;
        }
        try {
            bgVar2.IL(this.Kg);
            if (!android.text.TextUtils.isEmpty(this.zx)) {
                bgVar2.bg(this.zx);
            }
            if (this.ldr > 0) {
                bgVar2.bg(this.ldr);
            }
            bg(bgVar2);
            this.bX.bg(bgVar2.bg().IL()).bg(new com.bytedance.sdk.component.IL.bg.bX() { // from class: com.bytedance.sdk.component.iR.IL.bg.1
                @Override // com.bytedance.sdk.component.IL.bg.bX
                public void bg(com.bytedance.sdk.component.IL.bg.IL il2, java.io.IOException iOException) {
                    com.bytedance.sdk.component.iR.bg.bg bgVar3 = bgVar;
                    if (bgVar3 != null) {
                        bgVar3.bg(com.bytedance.sdk.component.iR.IL.bg.this, iOException);
                    }
                    com.bytedance.sdk.component.iR.IL.bg.this.eqN();
                }

                @Override // com.bytedance.sdk.component.IL.bg.bX
                public void bg(com.bytedance.sdk.component.IL.bg.IL il2, com.bytedance.sdk.component.IL.bg.Lq lq) throws java.io.IOException {
                    java.io.RandomAccessFile randomAccessFile;
                    long j2;
                    byte[] bArr;
                    long j3;
                    int i;
                    boolean z;
                    if (bgVar == null) {
                        return;
                    }
                    java.util.HashMap map = new java.util.HashMap();
                    if (lq == null) {
                        return;
                    }
                    com.bytedance.sdk.component.IL.bg.ldr ldrVarIR = lq.iR();
                    if (ldrVarIR != null) {
                        for (int i2 = 0; i2 < ldrVarIR.bg(); i2++) {
                            map.put(ldrVarIR.bg(i2), ldrVarIR.IL(i2));
                        }
                    }
                    com.bytedance.sdk.component.iR.IL il3 = new com.bytedance.sdk.component.iR.IL(lq.eqN(), lq.bX(), lq.zx(), map, null, lq.IL(), lq.bg());
                    if (lq.eqN()) {
                        long jBg = lq.ldr().bg();
                        if (jBg <= 0) {
                            jBg = com.bytedance.sdk.component.iR.IL.bg.ldr(map);
                        }
                        boolean zZx = com.bytedance.sdk.component.iR.IL.bg.zx(map);
                        int i3 = -1;
                        if (zZx) {
                            jBg += j;
                            java.lang.String str = (java.lang.String) map.get(com.google.common.net.HttpHeaders.CONTENT_RANGE);
                            if (!android.text.TextUtils.isEmpty(str)) {
                                java.lang.String str2 = "bytes " + j + "-" + (jBg - 1);
                                if (android.text.TextUtils.indexOf(str, str2) == -1) {
                                    com.bytedance.sdk.component.iR.IL.bg.this.eqN();
                                    bgVar.bg(com.bytedance.sdk.component.iR.IL.bg.this, new java.io.IOException("The Content-Range Header is invalid Assume[" + str2 + "] vs Real[" + str + "], please remove the temporary file [" + com.bytedance.sdk.component.iR.IL.bg.this.IL + "]."));
                                    return;
                                }
                            }
                        }
                        if (jBg > 0 && com.bytedance.sdk.component.iR.IL.bg.this.IL.exists() && com.bytedance.sdk.component.iR.IL.bg.this.IL.length() == jBg) {
                            if (com.bytedance.sdk.component.iR.IL.bg.this.IL.renameTo(com.bytedance.sdk.component.iR.IL.bg.this.bg)) {
                                il3.bg(com.bytedance.sdk.component.iR.IL.bg.this.bg);
                                bgVar.bg(com.bytedance.sdk.component.iR.IL.bg.this, il3);
                                return;
                            } else {
                                bgVar.bg(com.bytedance.sdk.component.iR.IL.bg.this, new java.io.IOException("Rename fail"));
                                return;
                            }
                        }
                        java.io.InputStream inputStreamBX = null;
                        try {
                            try {
                                try {
                                    randomAccessFile = new java.io.RandomAccessFile(com.bytedance.sdk.component.iR.IL.bg.this.IL, "rw");
                                    try {
                                        if (zZx) {
                                            randomAccessFile.seek(j);
                                            j2 = j;
                                        } else {
                                            randomAccessFile.setLength(0L);
                                            j2 = 0;
                                        }
                                        while (true) {
                                            int i4 = inputStreamBX.read(bArr, i, 16384 - i);
                                            boolean z2 = true;
                                            if (i4 != i3) {
                                                i += i4;
                                                java.io.InputStream inputStream = inputStreamBX;
                                                j3 += (long) i4;
                                                try {
                                                    if (j3 % 16384 != 0 && j3 != jBg - j) {
                                                        z2 = false;
                                                    }
                                                    if (z2) {
                                                        randomAccessFile.seek(j2);
                                                        randomAccessFile.write(bArr, 0, i);
                                                        j2 += (long) i;
                                                        i = 0;
                                                    }
                                                    if (com.bytedance.sdk.component.iR.IL.bg.this.eo) {
                                                        throw new java.io.IOException("net is cancel");
                                                    }
                                                    inputStreamBX = inputStream;
                                                    i3 = -1;
                                                } catch (java.lang.Throwable th) {
                                                    th = th;
                                                    inputStreamBX = inputStream;
                                                    try {
                                                        bgVar.bg(com.bytedance.sdk.component.iR.IL.bg.this, new java.io.IOException(th.getMessage()));
                                                        if (!zZx) {
                                                            com.bytedance.sdk.component.iR.IL.bg.this.eqN();
                                                        }
                                                        try {
                                                            return;
                                                        } catch (java.lang.Throwable unused) {
                                                            return;
                                                        }
                                                    } finally {
                                                        if (inputStreamBX != null) {
                                                            try {
                                                                inputStreamBX.close();
                                                            } catch (java.lang.Throwable unused2) {
                                                            }
                                                        }
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (java.lang.Throwable unused3) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                java.io.InputStream inputStream2 = inputStreamBX;
                                                if (i != 0) {
                                                    randomAccessFile.seek(j2);
                                                    z = false;
                                                    randomAccessFile.write(bArr, 0, i);
                                                } else {
                                                    z = false;
                                                }
                                                if (!zZx) {
                                                    jBg = com.bytedance.sdk.component.iR.IL.bg.this.IL.length();
                                                }
                                                if (jBg > 0 && com.bytedance.sdk.component.iR.IL.bg.this.IL.exists() && com.bytedance.sdk.component.iR.IL.bg.this.IL.length() == jBg) {
                                                    if (com.bytedance.sdk.component.iR.IL.bg.this.IL.renameTo(com.bytedance.sdk.component.iR.IL.bg.this.bg)) {
                                                        il3.bg(com.bytedance.sdk.component.iR.IL.bg.this.bg);
                                                        bgVar.bg(com.bytedance.sdk.component.iR.IL.bg.this, il3);
                                                    } else {
                                                        bgVar.bg(com.bytedance.sdk.component.iR.IL.bg.this, new java.io.IOException("Rename fail"));
                                                    }
                                                } else {
                                                    bgVar.bg(com.bytedance.sdk.component.iR.IL.bg.this, new java.io.IOException(" tempFile.length() == fileSize is" + (com.bytedance.sdk.component.iR.IL.bg.this.IL.length() == jBg ? true : z)));
                                                }
                                                if (inputStream2 != null) {
                                                    try {
                                                        inputStream2.close();
                                                    } catch (java.lang.Throwable unused4) {
                                                    }
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                    return;
                                                } catch (java.lang.Throwable unused5) {
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (java.lang.Throwable unused6) {
                                    }
                                } catch (java.lang.Throwable unused7) {
                                    randomAccessFile = null;
                                }
                                bArr = new byte[16384];
                                j3 = 0;
                                i = 0;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                            }
                            inputStreamBX = lq.ldr().bX();
                            if (com.bytedance.sdk.component.iR.IL.bg.iR(map) && !(inputStreamBX instanceof java.util.zip.GZIPInputStream)) {
                                inputStreamBX = new java.util.zip.GZIPInputStream(inputStreamBX);
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                        }
                    } else {
                        bgVar.bg(com.bytedance.sdk.component.iR.IL.bg.this, il3);
                    }
                }
            });
        } catch (java.lang.IllegalArgumentException unused) {
            bgVar.bg(this, new java.io.IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    public com.bytedance.sdk.component.iR.IL bg() {
        java.io.RandomAccessFile randomAccessFile;
        long j;
        java.io.InputStream inputStream;
        java.io.File file = this.bg;
        if (file != null && this.IL != null) {
            long j2 = 0;
            if (file.exists() && this.bg.length() != 0) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                com.bytedance.sdk.component.iR.IL il = new com.bytedance.sdk.component.iR.IL(true, 200, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
                il.bg(this.bg);
                return il;
            }
            long length = this.IL.length();
            if (length < 0) {
                length = 0;
            }
            com.bytedance.sdk.component.IL.bg.Ta.bg bgVar = new com.bytedance.sdk.component.IL.bg.Ta.bg();
            bgVar.bg((java.lang.Object) bX());
            IL(com.google.common.net.HttpHeaders.RANGE, "bytes=" + length + "-");
            if (android.text.TextUtils.isEmpty(this.Kg)) {
                android.util.Log.e("DownloadExecutor", "execute: Url is Empty");
                return null;
            }
            try {
                bgVar.IL(this.Kg);
                bg(bgVar);
                try {
                    com.bytedance.sdk.component.IL.bg.Lq lqIL = this.bX.bg(bgVar.bg().IL()).IL();
                    if (lqIL == null || !lqIL.eqN()) {
                        return null;
                    }
                    java.util.HashMap map = new java.util.HashMap();
                    com.bytedance.sdk.component.IL.bg.ldr ldrVarIR = lqIL.iR();
                    if (ldrVarIR != null) {
                        for (int i = 0; i < ldrVarIR.bg(); i++) {
                            map.put(ldrVarIR.bg(i), ldrVarIR.IL(i));
                        }
                    }
                    com.bytedance.sdk.component.iR.IL il2 = new com.bytedance.sdk.component.iR.IL(lqIL.eqN(), lqIL.bX(), lqIL.zx(), map, null, lqIL.IL(), lqIL.bg());
                    long jBg = lqIL.ldr().bg();
                    if (jBg <= 0) {
                        jBg = ldr(map);
                    }
                    long length2 = this.IL.length();
                    boolean zZx = zx(map);
                    int i2 = -1;
                    if (zZx) {
                        jBg += length2;
                        java.lang.String str = (java.lang.String) map.get(com.google.common.net.HttpHeaders.CONTENT_RANGE);
                        if (!android.text.TextUtils.isEmpty(str)) {
                            java.lang.String str2 = "bytes " + length2 + "-" + (jBg - 1);
                            if (android.text.TextUtils.indexOf(str, str2) == -1) {
                                new java.lang.StringBuilder("execute: The Content-Range Header is invalid Assume[").append(str2).append("] vs Real[").append(str).append("], please remove the temporary file [").append(this.IL);
                                eqN();
                                return null;
                            }
                        }
                        j2 = 0;
                    }
                    if (jBg > j2 && this.IL.exists() && this.IL.length() == jBg) {
                        if (!this.IL.renameTo(this.bg)) {
                            return null;
                        }
                        il2.bg(this.bg);
                        return il2;
                    }
                    com.bytedance.sdk.component.iR.IL il3 = il2;
                    try {
                        randomAccessFile = new java.io.RandomAccessFile(this.IL, "rw");
                        try {
                            if (zZx) {
                                randomAccessFile.seek(length);
                                j = length;
                            } else {
                                randomAccessFile.setLength(0L);
                                j = 0;
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                    } catch (java.lang.Throwable unused2) {
                        randomAccessFile = null;
                    }
                    try {
                        java.io.InputStream inputStreamBX = lqIL.ldr().bX();
                        try {
                            if (iR(map) && !(inputStreamBX instanceof java.util.zip.GZIPInputStream)) {
                                inputStreamBX = new java.util.zip.GZIPInputStream(inputStreamBX);
                            }
                            byte[] bArr = new byte[16384];
                            int i3 = 0;
                            long j3 = 0;
                            while (true) {
                                int i4 = inputStreamBX.read(bArr, i3, 16384 - i3);
                                if (i4 == i2) {
                                    com.bytedance.sdk.component.iR.IL il4 = il3;
                                    if (i4 != 0) {
                                        randomAccessFile.seek(j);
                                        randomAccessFile.write(bArr, 0, i3);
                                    }
                                    if (!zZx || length == 0) {
                                        jBg = this.IL.length();
                                    }
                                    if (jBg <= 0 || !this.IL.exists() || this.IL.length() != jBg) {
                                        int i5 = (this.IL.length() > jBg ? 1 : (this.IL.length() == jBg ? 0 : -1));
                                        if (inputStreamBX != null) {
                                            try {
                                                inputStreamBX.close();
                                            } catch (java.lang.Throwable unused3) {
                                            }
                                        }
                                        try {
                                            randomAccessFile.close();
                                            return null;
                                        } catch (java.lang.Throwable unused4) {
                                            return null;
                                        }
                                    }
                                    if (this.IL.renameTo(this.bg)) {
                                        il4.bg(this.bg);
                                        if (inputStreamBX != null) {
                                            try {
                                                inputStreamBX.close();
                                            } catch (java.lang.Throwable unused5) {
                                            }
                                        }
                                        try {
                                            randomAccessFile.close();
                                        } catch (java.lang.Throwable unused6) {
                                        }
                                        return il4;
                                    }
                                    if (inputStreamBX != null) {
                                        try {
                                            inputStreamBX.close();
                                        } catch (java.lang.Throwable unused7) {
                                        }
                                    }
                                    try {
                                        randomAccessFile.close();
                                        return null;
                                    } catch (java.lang.Throwable unused8) {
                                        return null;
                                    }
                                }
                                i3 += i4;
                                com.bytedance.sdk.component.iR.IL il5 = il3;
                                j3 += (long) i4;
                                if (j3 % 16384 == 0 || j3 == jBg - length) {
                                    randomAccessFile.seek(j);
                                    randomAccessFile.write(bArr, 0, i3);
                                    j += (long) i3;
                                    i3 = 0;
                                }
                                if (this.eo) {
                                    throw new java.io.IOException("net is cancel");
                                }
                                il3 = il5;
                                i2 = -1;
                            }
                        } catch (java.lang.Throwable unused9) {
                            inputStream = inputStreamBX;
                            if (!zZx) {
                                try {
                                    eqN();
                                } finally {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (java.lang.Throwable unused10) {
                                        }
                                    }
                                    try {
                                        randomAccessFile.close();
                                    } catch (java.lang.Throwable unused11) {
                                    }
                                }
                            }
                            try {
                                return null;
                            } catch (java.lang.Throwable unused12) {
                                return null;
                            }
                        }
                    } catch (java.lang.Throwable unused13) {
                        inputStream = null;
                    }
                } catch (java.io.IOException unused14) {
                    eqN();
                    return null;
                }
            } catch (java.lang.IllegalArgumentException unused15) {
                android.util.Log.e("DownloadExecutor", "execute: Url is not a valid HTTP or HTTPS URL");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zx(java.util.Map<java.lang.String, java.lang.String> map) {
        if (android.text.TextUtils.equals(map.get(com.google.common.net.HttpHeaders.ACCEPT_RANGES), "bytes") || android.text.TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        java.lang.String str = map.get(com.google.common.net.HttpHeaders.CONTENT_RANGE);
        if (android.text.TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long ldr(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey(com.google.common.net.HttpHeaders.CONTENT_LENGTH) ? map.get(com.google.common.net.HttpHeaders.CONTENT_LENGTH) : null;
        }
        if (android.text.TextUtils.isEmpty(str) || str == null) {
            return 0L;
        }
        try {
            return java.lang.Long.valueOf(str).longValue();
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean iR(java.util.Map<java.lang.String, java.lang.String> map) {
        return android.text.TextUtils.equals(map.get(com.google.common.net.HttpHeaders.CONTENT_ENCODING), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN() {
        try {
            this.bg.delete();
        } catch (java.lang.Throwable unused) {
        }
        try {
            this.IL.delete();
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.iR.IL.bX
    public void IL() {
        this.eo = true;
        super.IL();
    }
}

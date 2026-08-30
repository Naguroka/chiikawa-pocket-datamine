package com.bytedance.adsdk.IL.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class iR {
    private final com.bytedance.adsdk.IL.eqN.zx bg;

    public iR(com.bytedance.adsdk.IL.eqN.zx zxVar) {
        this.bg = zxVar;
    }

    android.util.Pair<com.bytedance.adsdk.IL.eqN.bX, java.io.InputStream> bg(java.lang.String str) {
        com.bytedance.adsdk.IL.eqN.bX bXVar;
        try {
            java.io.File fileIL = IL(str);
            if (fileIL == null) {
                return null;
            }
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileIL);
            if (fileIL.getAbsolutePath().endsWith(".zip")) {
                bXVar = com.bytedance.adsdk.IL.eqN.bX.ZIP;
            } else {
                bXVar = com.bytedance.adsdk.IL.eqN.bX.JSON;
            }
            fileIL.getAbsolutePath();
            return new android.util.Pair<>(bXVar, fileInputStream);
        } catch (java.io.FileNotFoundException unused) {
            return null;
        }
    }

    java.io.File bg(java.lang.String str, java.io.InputStream inputStream, com.bytedance.adsdk.IL.eqN.bX bXVar) throws java.io.IOException {
        java.io.File file = new java.io.File(bg(), bg(str, bXVar, true));
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                }
            } catch (java.lang.Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    void bg(java.lang.String str, com.bytedance.adsdk.IL.eqN.bX bXVar) {
        java.io.File file = new java.io.File(bg(), bg(str, bXVar, true));
        java.io.File file2 = new java.io.File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        new java.lang.StringBuilder("Copying temp file to real file (").append(file2);
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private java.io.File IL(java.lang.String str) throws java.io.FileNotFoundException {
        java.io.File file = new java.io.File(bg(), bg(str, com.bytedance.adsdk.IL.eqN.bX.JSON, false));
        if (file.exists()) {
            return file;
        }
        java.io.File file2 = new java.io.File(bg(), bg(str, com.bytedance.adsdk.IL.eqN.bX.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private java.io.File bg() {
        java.io.File fileBg = this.bg.bg();
        if (fileBg.isFile()) {
            fileBg.delete();
        }
        if (!fileBg.exists()) {
            fileBg.mkdirs();
        }
        return fileBg;
    }

    private static java.lang.String bg(java.lang.String str, com.bytedance.adsdk.IL.eqN.bX bXVar, boolean z) {
        return "lottie_cache_" + str.replaceAll("\\W+", "") + (z ? bXVar.bg() : bXVar.bX);
    }
}

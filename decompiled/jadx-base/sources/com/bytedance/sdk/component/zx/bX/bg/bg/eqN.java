package com.bytedance.sdk.component.zx.bX.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
final class eqN {
    static final java.nio.charset.Charset bg = java.nio.charset.Charset.forName("US-ASCII");
    static final java.nio.charset.Charset IL = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);

    static void bg(java.io.File file) throws java.io.IOException {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new java.io.IOException("not a readable directory: ".concat(java.lang.String.valueOf(file)));
        }
        for (java.io.File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                bg(file2);
            }
            if (!file2.delete()) {
                throw new java.io.IOException("failed to delete file: ".concat(java.lang.String.valueOf(file2)));
            }
        }
    }
}

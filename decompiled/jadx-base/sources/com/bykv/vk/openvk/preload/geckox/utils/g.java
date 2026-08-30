package com.bykv.vk.openvk.preload.geckox.utils;

/* JADX INFO: compiled from: ResVersionUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static java.lang.Long a(java.io.File file) {
        java.io.File[] fileArrListFiles = file.listFiles(new java.io.FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.g.1
            @Override // java.io.FileFilter
            public final boolean accept(java.io.File file2) {
                return file2.isDirectory();
            }
        });
        java.lang.Long lValueOf = null;
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (java.io.File file2 : fileArrListFiles) {
                try {
                    long jLongValue = java.lang.Long.valueOf(file2.getName()).longValue();
                    if (lValueOf == null) {
                        lValueOf = java.lang.Long.valueOf(jLongValue);
                    } else if (jLongValue > lValueOf.longValue()) {
                        lValueOf = java.lang.Long.valueOf(jLongValue);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return lValueOf;
    }
}

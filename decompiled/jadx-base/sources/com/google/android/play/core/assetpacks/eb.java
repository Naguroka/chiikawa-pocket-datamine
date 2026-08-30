package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2216a = new com.google.android.play.core.assetpacks.internal.o("PackMetadataManager");
    private final com.google.android.play.core.assetpacks.bh b;
    private final com.google.android.play.core.assetpacks.ed c;

    eb(com.google.android.play.core.assetpacks.bh bhVar, com.google.android.play.core.assetpacks.ed edVar) {
        this.b = bhVar;
        this.c = edVar;
    }

    final java.lang.String a(java.lang.String str) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (!this.b.G(str)) {
            return "";
        }
        int iA = this.c.a();
        com.google.android.play.core.assetpacks.bh bhVar = this.b;
        java.io.File fileK = bhVar.k(str, iA, bhVar.c(str));
        try {
            if (!fileK.exists()) {
                return java.lang.String.valueOf(iA);
            }
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileK);
            try {
                java.util.Properties properties = new java.util.Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                java.lang.String property = properties.getProperty("moduleVersionTag");
                return property == null ? java.lang.String.valueOf(iA) : property;
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (java.io.IOException unused) {
            f2216a.b("Failed to read pack version tag for pack %s", str);
            return "";
        }
    }

    final void b(java.lang.String str, int i, long j, java.lang.String str2) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        if (str2 == null || str2.isEmpty()) {
            str2 = java.lang.String.valueOf(i);
        }
        java.util.Properties properties = new java.util.Properties();
        properties.put("moduleVersionTag", str2);
        java.io.File fileK = this.b.k(str, i, j);
        fileK.getParentFile().mkdirs();
        fileK.createNewFile();
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileK);
        try {
            properties.store(fileOutputStream, (java.lang.String) null);
            fileOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }
}

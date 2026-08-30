package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class eq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f2229a = java.util.regex.Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    static java.util.List a(java.io.File file, java.io.File file2) throws java.io.IOException {
        java.io.File[] fileArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.File[] fileArrListFiles = file2.listFiles(new java.io.FilenameFilter() { // from class: com.google.android.play.core.assetpacks.ep
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file3, java.lang.String str) {
                return com.google.android.play.core.assetpacks.eq.f2229a.matcher(str).matches();
            }
        });
        if (fileArrListFiles != null) {
            java.io.File[] fileArr2 = new java.io.File[fileArrListFiles.length];
            int i = 0;
            while (true) {
                int length = fileArrListFiles.length;
                if (i >= length) {
                    fileArr = fileArr2;
                    break;
                }
                java.io.File file3 = fileArrListFiles[i];
                int i2 = java.lang.Integer.parseInt(file3.getName().split("-")[0]);
                if (i2 > length || fileArr2[i2] != null) {
                    throw new com.google.android.play.core.assetpacks.ck("Metadata folder ordering corrupt.");
                }
                fileArr2[i2] = file3;
                i++;
            }
        } else {
            fileArr = new java.io.File[0];
        }
        for (java.io.File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file4);
                try {
                    com.google.android.play.core.assetpacks.eu euVarB = new com.google.android.play.core.assetpacks.bw(fileInputStream).b();
                    if (euVarB.c() == null) {
                        throw new com.google.android.play.core.assetpacks.ck("Metadata files corrupt. Could not read local file header.");
                    }
                    java.io.File file5 = new java.io.File(file, euVarB.c());
                    if (!file5.exists()) {
                        throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        try {
                            java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}

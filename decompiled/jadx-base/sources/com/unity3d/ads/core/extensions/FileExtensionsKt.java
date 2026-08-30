package com.unity3d.ads.core.extensions;

/* JADX INFO: compiled from: FileExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getDirectorySize", "", "Ljava/io/File;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FileExtensionsKt {
    public static final long getDirectorySize(java.io.File file) {
        java.io.File[] fileArrListFiles;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        long length = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(file);
        while (true) {
            if (!(!linkedList.isEmpty())) {
                return length;
            }
            java.io.File file2 = (java.io.File) linkedList.remove(0);
            if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null) {
                if (!(fileArrListFiles.length == 0)) {
                    for (java.io.File child : fileArrListFiles) {
                        if (child.isDirectory()) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(child, "child");
                            linkedList.add(child);
                        } else {
                            length += child.length();
                        }
                    }
                }
            }
        }
    }
}

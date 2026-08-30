package kotlin.io;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u000b\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0002\b\r\u001a\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"isRooted", "", "Ljava/io/File;", "(Ljava/io/File;)Z", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "rootName", "", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "getRootLength", "", "getRootLength$FilesKt__FilePathComponentsKt", "subPath", "beginIndex", "endIndex", "toComponents", "Lkotlin/io/FilePathComponents;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__FilePathComponentsKt {
    private static final int getRootLength$FilesKt__FilePathComponentsKt(java.lang.String str) {
        int iIndexOf$default;
        java.lang.String str2 = str;
        int iIndexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, java.io.File.separatorChar, 0, false, 4, (java.lang.Object) null);
        if (iIndexOf$default2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != java.io.File.separatorChar || (iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, java.io.File.separatorChar, 2, false, 4, (java.lang.Object) null)) < 0) {
                return 1;
            }
            int iIndexOf$default3 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, java.io.File.separatorChar, iIndexOf$default + 1, false, 4, (java.lang.Object) null);
            return iIndexOf$default3 >= 0 ? iIndexOf$default3 + 1 : str.length();
        }
        if (iIndexOf$default2 > 0 && str.charAt(iIndexOf$default2 - 1) == ':') {
            return iIndexOf$default2 + 1;
        }
        if (iIndexOf$default2 == -1 && kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str2, ':', false, 2, (java.lang.Object) null)) {
            return str.length();
        }
        return 0;
    }

    public static final java.lang.String getRootName(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        java.lang.String path = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        java.lang.String path2 = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        java.lang.String strSubstring = path.substring(0, getRootLength$FilesKt__FilePathComponentsKt(path2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final java.io.File getRoot(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        return new java.io.File(kotlin.io.FilesKt.getRootName(file));
    }

    public static final boolean isRooted(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        java.lang.String path = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return getRootLength$FilesKt__FilePathComponentsKt(path) > 0;
    }

    public static final kotlin.io.FilePathComponents toComponents(java.io.File file) {
        java.util.ArrayList arrayListEmptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        java.lang.String path = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNull(path);
        int rootLength$FilesKt__FilePathComponentsKt = getRootLength$FilesKt__FilePathComponentsKt(path);
        java.lang.String strSubstring = path.substring(0, rootLength$FilesKt__FilePathComponentsKt);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        java.lang.String strSubstring2 = path.substring(rootLength$FilesKt__FilePathComponentsKt);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        java.lang.String str = strSubstring2;
        if (str.length() == 0) {
            arrayListEmptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new char[]{java.io.File.separatorChar}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            java.util.Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(new java.io.File((java.lang.String) it.next()));
            }
            arrayListEmptyList = arrayList;
        }
        return new kotlin.io.FilePathComponents(new java.io.File(strSubstring), arrayListEmptyList);
    }

    public static final java.io.File subPath(java.io.File file, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        return kotlin.io.FilesKt.toComponents(file).subPath(i, i2);
    }
}

package kotlin.io;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE, "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class FilesKt__UtilsKt extends kotlin.io.FilesKt__FileTreeWalkKt {
    public static /* synthetic */ java.io.File createTempDir$default(java.lang.String str, java.lang.String str2, java.io.File file, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return kotlin.io.FilesKt.createTempDir(str, str2, file);
    }

    @kotlin.Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final java.io.File createTempDir(java.lang.String prefix, java.lang.String str, java.io.File file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        java.io.File fileCreateTempFile = java.io.File.createTempFile(prefix, str, file);
        fileCreateTempFile.delete();
        if (fileCreateTempFile.mkdir()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(fileCreateTempFile);
            return fileCreateTempFile;
        }
        throw new java.io.IOException("Unable to create temporary directory " + fileCreateTempFile + '.');
    }

    public static /* synthetic */ java.io.File createTempFile$default(java.lang.String str, java.lang.String str2, java.io.File file, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return kotlin.io.FilesKt.createTempFile(str, str2, file);
    }

    @kotlin.Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final java.io.File createTempFile(java.lang.String prefix, java.lang.String str, java.io.File file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        java.io.File fileCreateTempFile = java.io.File.createTempFile(prefix, str, file);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public static final java.lang.String getExtension(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        java.lang.String name = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return kotlin.text.StringsKt.substringAfterLast(name, '.', "");
    }

    public static final java.lang.String getInvariantSeparatorsPath(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        if (java.io.File.separatorChar != '/') {
            java.lang.String path = file.getPath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            return kotlin.text.StringsKt.replace$default(path, java.io.File.separatorChar, '/', false, 4, (java.lang.Object) null);
        }
        java.lang.String path2 = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        return path2;
    }

    public static final java.lang.String getNameWithoutExtension(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        java.lang.String name = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return kotlin.text.StringsKt.substringBeforeLast$default(name, ".", (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final java.lang.String toRelativeString(java.io.File file, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.lang.String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new java.lang.IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    public static final java.io.File relativeTo(java.io.File file, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        return new java.io.File(kotlin.io.FilesKt.toRelativeString(file, base));
    }

    public static final java.io.File relativeToOrSelf(java.io.File file, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.lang.String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        return relativeStringOrNull$FilesKt__UtilsKt != null ? new java.io.File(relativeStringOrNull$FilesKt__UtilsKt) : file;
    }

    public static final java.io.File relativeToOrNull(java.io.File file, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.lang.String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new java.io.File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return null;
    }

    private static final java.lang.String toRelativeStringOrNull$FilesKt__UtilsKt(java.io.File file, java.io.File file2) {
        kotlin.io.FilePathComponents filePathComponentsNormalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(kotlin.io.FilesKt.toComponents(file));
        kotlin.io.FilePathComponents filePathComponentsNormalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(kotlin.io.FilesKt.toComponents(file2));
        if (!kotlin.jvm.internal.Intrinsics.areEqual(filePathComponentsNormalize$FilesKt__UtilsKt.getRoot(), filePathComponentsNormalize$FilesKt__UtilsKt2.getRoot())) {
            return null;
        }
        int size = filePathComponentsNormalize$FilesKt__UtilsKt2.getSize();
        int size2 = filePathComponentsNormalize$FilesKt__UtilsKt.getSize();
        int iMin = java.lang.Math.min(size2, size);
        int i = 0;
        while (i < iMin && kotlin.jvm.internal.Intrinsics.areEqual(filePathComponentsNormalize$FilesKt__UtilsKt.getSegments().get(i), filePathComponentsNormalize$FilesKt__UtilsKt2.getSegments().get(i))) {
            i++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = size - 1;
        if (i <= i2) {
            while (!kotlin.jvm.internal.Intrinsics.areEqual(filePathComponentsNormalize$FilesKt__UtilsKt2.getSegments().get(i2).getName(), "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(java.io.File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < size2) {
            if (i < size) {
                sb.append(java.io.File.separatorChar);
            }
            java.lang.String separator = java.io.File.separator;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(separator, "separator");
            kotlin.collections.CollectionsKt.joinTo(kotlin.collections.CollectionsKt.drop(filePathComponentsNormalize$FilesKt__UtilsKt.getSegments(), i), sb, (124 & 2) != 0 ? ", " : separator, (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        return sb.toString();
    }

    public static /* synthetic */ java.io.File copyTo$default(java.io.File file, java.io.File file2, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return kotlin.io.FilesKt.copyTo(file, file2, z, i);
    }

    public static final java.io.File copyTo(java.io.File file, java.io.File target, boolean z, int i) throws kotlin.io.FileSystemException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new kotlin.io.NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z) {
                throw new kotlin.io.FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new kotlin.io.FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new kotlin.io.FileSystemException(file, target, "Failed to create target directory.");
            }
        } else {
            java.io.File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                java.io.FileInputStream fileInputStream2 = fileInputStream;
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(target);
                try {
                    kotlin.io.ByteStreamsKt.copyTo(fileInputStream2, fileOutputStream, i);
                    kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        kotlin.io.CloseableKt.closeFinally(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (java.lang.Throwable th3) {
                try {
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, th3);
                    throw th4;
                }
            }
        }
        return target;
    }

    public static /* synthetic */ boolean copyRecursively$default(java.io.File file, java.io.File file2, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: kotlin.io.FilesKt__UtilsKt.copyRecursively.1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Void invoke(java.io.File file3, java.io.IOException exception) throws java.io.IOException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file3, "<anonymous parameter 0>");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        return kotlin.io.FilesKt.copyRecursively(file, file2, z, function2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    public static final boolean copyRecursively(java.io.File file, java.io.File target, boolean z, final kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> onError) {
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new kotlin.io.NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != kotlin.io.OnErrorAction.TERMINATE;
        }
        try {
            for (java.io.File file2 : kotlin.io.FilesKt.walkTopDown(file).onFail(new kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.Unit>() { // from class: kotlin.io.FilesKt__UtilsKt.copyRecursively.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.io.File file3, java.io.IOException iOException) throws kotlin.io.TerminateException {
                    invoke2(file3, iOException);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.io.File f, java.io.IOException e) throws kotlin.io.TerminateException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "f");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
                    if (onError.invoke(f, e) == kotlin.io.OnErrorAction.TERMINATE) {
                        throw new kotlin.io.TerminateException(f);
                    }
                }
            })) {
                if (!file2.exists()) {
                    if (onError.invoke(file2, new kotlin.io.NoSuchFileException(file2, null, "The source file doesn't exist.", 2, null)) == kotlin.io.OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else {
                    java.io.File file3 = new java.io.File(target, kotlin.io.FilesKt.toRelativeString(file2, file));
                    if (file3.exists() && (!file2.isDirectory() || !file3.isDirectory())) {
                        if (!z) {
                            z2 = true;
                        } else if (file3.isDirectory()) {
                            if (kotlin.io.FilesKt.deleteRecursively(file3)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (file3.delete()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            if (onError.invoke(file3, new kotlin.io.FileAlreadyExistsException(file2, file3, "The destination file already exists.")) == kotlin.io.OnErrorAction.TERMINATE) {
                                return false;
                            }
                        }
                    }
                    if (file2.isDirectory()) {
                        file3.mkdirs();
                    } else if (kotlin.io.FilesKt.copyTo$default(file2, file3, z, 0, 4, null).length() != file2.length() && onError.invoke(file2, new java.io.IOException("Source file wasn't copied completely, length of destination file differs.")) == kotlin.io.OnErrorAction.TERMINATE) {
                        return false;
                    }
                }
            }
            return true;
        } catch (kotlin.io.TerminateException unused) {
            return false;
        }
    }

    public static final boolean deleteRecursively(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z = true;
            for (java.io.File file2 : kotlin.io.FilesKt.walkBottomUp(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static final boolean startsWith(java.io.File file, java.io.File other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        kotlin.io.FilePathComponents components2 = kotlin.io.FilesKt.toComponents(other);
        if (kotlin.jvm.internal.Intrinsics.areEqual(components.getRoot(), components2.getRoot()) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    public static final boolean startsWith(java.io.File file, java.lang.String other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return kotlin.io.FilesKt.startsWith(file, new java.io.File(other));
    }

    public static final boolean endsWith(java.io.File file, java.io.File other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        kotlin.io.FilePathComponents components2 = kotlin.io.FilesKt.toComponents(other);
        if (components2.isRooted()) {
            return kotlin.jvm.internal.Intrinsics.areEqual(file, other);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static final boolean endsWith(java.io.File file, java.lang.String other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return kotlin.io.FilesKt.endsWith(file, new java.io.File(other));
    }

    public static final java.io.File normalize(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        java.io.File root = components.getRoot();
        java.util.List<java.io.File> listNormalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(components.getSegments());
        java.lang.String separator = java.io.File.separator;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return kotlin.io.FilesKt.resolve(root, kotlin.collections.CollectionsKt.joinToString$default(listNormalize$FilesKt__UtilsKt, separator, null, null, 0, null, null, 62, null));
    }

    private static final kotlin.io.FilePathComponents normalize$FilesKt__UtilsKt(kotlin.io.FilePathComponents filePathComponents) {
        return new kotlin.io.FilePathComponents(filePathComponents.getRoot(), normalize$FilesKt__UtilsKt(filePathComponents.getSegments()));
    }

    private static final java.util.List<java.io.File> normalize$FilesKt__UtilsKt(java.util.List<? extends java.io.File> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.io.File file : list) {
            java.lang.String name = file.getName();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(name, ".")) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || kotlin.jvm.internal.Intrinsics.areEqual(((java.io.File) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    public static final java.io.File resolve(java.io.File file, java.io.File relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        if (kotlin.io.FilesKt.isRooted(relative)) {
            return relative;
        }
        java.lang.String string = file.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        java.lang.String str = string;
        return ((str.length() == 0) || kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str, java.io.File.separatorChar, false, 2, (java.lang.Object) null)) ? new java.io.File(string + relative) : new java.io.File(string + java.io.File.separatorChar + relative);
    }

    public static final java.io.File resolve(java.io.File file, java.lang.String relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        return kotlin.io.FilesKt.resolve(file, new java.io.File(relative));
    }

    public static final java.io.File resolveSibling(java.io.File file, java.io.File relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        return kotlin.io.FilesKt.resolve(kotlin.io.FilesKt.resolve(components.getRoot(), components.getSize() == 0 ? new java.io.File("..") : components.subPath(0, components.getSize() - 1)), relative);
    }

    public static final java.io.File resolveSibling(java.io.File file, java.lang.String relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        return kotlin.io.FilesKt.resolveSibling(file, new java.io.File(relative));
    }
}

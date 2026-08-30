package okio;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\rH\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0002\b\"J\u0013\u0010#\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J\u0006\u0010&\u001a\u00020\u0000J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c¨\u0006/"}, d2 = {"Lokio/Path;", "", "bytes", "Lokio/ByteString;", "(Lokio/ByteString;)V", "getBytes$okio", "()Lokio/ByteString;", "isAbsolute", "", "()Z", "isRelative", "isRoot", "name", "", "()Ljava/lang/String;", "nameBytes", "parent", "()Lokio/Path;", "root", "getRoot", "segments", "", "getSegments", "()Ljava/util/List;", "segmentsBytes", "getSegmentsBytes", "volumeLetter", "", "()Ljava/lang/Character;", "compareTo", "", "other", androidx.media3.extractor.text.ttml.TtmlNode.TAG_DIV, "child", "resolve", "equals", "", "hashCode", "normalized", "relativeTo", "normalize", "toFile", "Ljava/io/File;", "toNioPath", "Ljava/nio/file/Path;", "toString", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Path implements java.lang.Comparable<okio.Path> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okio.Path.Companion INSTANCE = new okio.Path.Companion(null);
    public static final java.lang.String DIRECTORY_SEPARATOR;
    private final okio.ByteString bytes;

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.io.File file) {
        return INSTANCE.get(file);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.io.File file, boolean z) {
        return INSTANCE.get(file, z);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.lang.String str) {
        return INSTANCE.get(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.lang.String str, boolean z) {
        return INSTANCE.get(str, z);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.nio.file.Path path) {
        return INSTANCE.get(path);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.nio.file.Path path, boolean z) {
        return INSTANCE.get(path, z);
    }

    public Path(okio.ByteString bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
    }

    /* JADX INFO: renamed from: getBytes$okio, reason: from getter */
    public final okio.ByteString getBytes() {
        return this.bytes;
    }

    public final okio.Path resolve(okio.Path child) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, child, false);
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path path, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(str, z);
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path path, okio.ByteString byteString, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(byteString, z);
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path path, okio.Path path2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(path2, z);
    }

    public final okio.Path resolve(okio.Path child, boolean normalize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, child, normalize);
    }

    public final java.io.File toFile() {
        return new java.io.File(toString());
    }

    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = java.nio.file.Paths.get(toString(), new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    /* JADX INFO: compiled from: Path.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokio/Path$Companion;", "", "()V", "DIRECTORY_SEPARATOR", "", "toOkioPath", "Lokio/Path;", "Ljava/io/File;", "normalize", "", "get", "Ljava/nio/file/Path;", "toPath", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
            return get$default(this, file, false, 1, (java.lang.Object) null);
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            return get$default(this, str, false, 1, (java.lang.Object) null);
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.nio.file.Path path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
            return get$default(this, path, false, 1, (java.lang.Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion companion, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(str, z);
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            return okio.internal.Path.commonToPath(str, z);
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion companion, java.io.File file, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(file, z);
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.io.File file, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
            java.lang.String string = file.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return get(string, z);
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion companion, java.nio.file.Path path, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(path, z);
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.nio.file.Path path, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
            return get(path.toString(), z);
        }
    }

    static {
        java.lang.String separator = java.io.File.separator;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(separator, "separator");
        DIRECTORY_SEPARATOR = separator;
    }

    public final okio.Path getRoot() {
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            return null;
        }
        return new okio.Path(getBytes().substring(0, iRootLength));
    }

    public final java.util.List<java.lang.String> getSegments() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes().size() && getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes().size();
        int i = iRootLength;
        while (iRootLength < size) {
            if (getBytes().getByte(iRootLength) == 47 || getBytes().getByte(iRootLength) == 92) {
                arrayList.add(getBytes().substring(i, iRootLength));
                i = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i < getBytes().size()) {
            arrayList.add(getBytes().substring(i, getBytes().size()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((okio.ByteString) it.next()).utf8());
        }
        return arrayList3;
    }

    public final java.util.List<okio.ByteString> getSegmentsBytes() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes().size() && getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes().size();
        int i = iRootLength;
        while (iRootLength < size) {
            if (getBytes().getByte(iRootLength) == 47 || getBytes().getByte(iRootLength) == 92) {
                arrayList.add(getBytes().substring(i, iRootLength));
                i = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i < getBytes().size()) {
            arrayList.add(getBytes().substring(i, getBytes().size()));
        }
        return arrayList;
    }

    public final boolean isAbsolute() {
        return okio.internal.Path.rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return okio.internal.Path.rootLength(this) == -1;
    }

    public final java.lang.Character volumeLetter() {
        boolean z = false;
        if (okio.ByteString.indexOf$default(getBytes(), okio.internal.Path.SLASH, 0, 2, (java.lang.Object) null) != -1 || getBytes().size() < 2 || getBytes().getByte(1) != 58) {
            return null;
        }
        char c = (char) getBytes().getByte(0);
        if (!('a' <= c && c < '{')) {
            if ('A' <= c && c < '[') {
                z = true;
            }
            if (!z) {
                return null;
            }
        }
        return java.lang.Character.valueOf(c);
    }

    public final okio.ByteString nameBytes() {
        int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash != -1) {
            return okio.ByteString.substring$default(getBytes(), indexOfLastSlash + 1, 0, 2, null);
        }
        return (volumeLetter() == null || getBytes().size() != 2) ? getBytes() : okio.ByteString.EMPTY;
    }

    public final java.lang.String name() {
        return nameBytes().utf8();
    }

    public final okio.Path parent() {
        okio.Path path;
        if (kotlin.jvm.internal.Intrinsics.areEqual(getBytes(), okio.internal.Path.DOT) || kotlin.jvm.internal.Intrinsics.areEqual(getBytes(), okio.internal.Path.SLASH) || kotlin.jvm.internal.Intrinsics.areEqual(getBytes(), okio.internal.Path.BACKSLASH) || okio.internal.Path.lastSegmentIsDotDot(this)) {
            return null;
        }
        int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash != 2 || volumeLetter() == null) {
            if (indexOfLastSlash == 1 && getBytes().startsWith(okio.internal.Path.BACKSLASH)) {
                return null;
            }
            if (indexOfLastSlash != -1 || volumeLetter() == null) {
                if (indexOfLastSlash == -1) {
                    return new okio.Path(okio.internal.Path.DOT);
                }
                if (indexOfLastSlash == 0) {
                    path = new okio.Path(okio.ByteString.substring$default(getBytes(), 0, 1, 1, null));
                } else {
                    return new okio.Path(okio.ByteString.substring$default(getBytes(), 0, indexOfLastSlash, 1, null));
                }
            } else {
                if (getBytes().size() == 2) {
                    return null;
                }
                path = new okio.Path(okio.ByteString.substring$default(getBytes(), 0, 2, 1, null));
            }
        } else {
            if (getBytes().size() == 3) {
                return null;
            }
            path = new okio.Path(okio.ByteString.substring$default(getBytes(), 0, 3, 1, null));
        }
        return path;
    }

    public final boolean isRoot() {
        return okio.internal.Path.rootLength(this) == getBytes().size();
    }

    public final okio.Path resolve(java.lang.String child) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new okio.Buffer().writeUtf8(child), false), false);
    }

    public final okio.Path resolve(okio.ByteString child) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new okio.Buffer().write(child), false), false);
    }

    public final okio.Path resolve(java.lang.String child, boolean normalize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new okio.Buffer().writeUtf8(child), false), normalize);
    }

    public final okio.Path resolve(okio.ByteString child, boolean normalize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new okio.Buffer().write(child), false), normalize);
    }

    public final okio.Path relativeTo(okio.Path other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getRoot(), other.getRoot())) {
            throw new java.lang.IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        java.util.List<okio.ByteString> segmentsBytes = getSegmentsBytes();
        java.util.List<okio.ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = java.lang.Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i = 0;
        while (i < iMin && kotlin.jvm.internal.Intrinsics.areEqual(segmentsBytes.get(i), segmentsBytes2.get(i))) {
            i++;
        }
        if (i != iMin || getBytes().size() != other.getBytes().size()) {
            if (!(segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(okio.internal.Path.DOT_DOT) == -1)) {
                throw new java.lang.IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
            }
            okio.Buffer buffer = new okio.Buffer();
            okio.ByteString slash = okio.internal.Path.getSlash(other);
            if (slash == null && (slash = okio.internal.Path.getSlash(this)) == null) {
                slash = okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
            }
            int size = segmentsBytes2.size();
            for (int i2 = i; i2 < size; i2++) {
                buffer.write(okio.internal.Path.DOT_DOT);
                buffer.write(slash);
            }
            int size2 = segmentsBytes.size();
            while (i < size2) {
                buffer.write(segmentsBytes.get(i));
                buffer.write(slash);
                i++;
            }
            return okio.internal.Path.toPath(buffer, false);
        }
        return okio.Path.Companion.get$default(INSTANCE, ".", false, 1, (java.lang.Object) null);
    }

    public final okio.Path normalized() {
        return INSTANCE.get(toString(), true);
    }

    @Override // java.lang.Comparable
    public int compareTo(okio.Path other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return getBytes().compareTo(other.getBytes());
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof okio.Path) && kotlin.jvm.internal.Intrinsics.areEqual(((okio.Path) other).getBytes(), getBytes());
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public java.lang.String toString() {
        return getBytes().utf8();
    }
}

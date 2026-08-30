package okio.internal;

/* JADX INFO: renamed from: okio.internal.-Path, reason: invalid class name */
/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\u001a\u0015\u0010\u0014\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0080\b\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0018H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\r*\u00020\u000eH\u0080\b\u001a\r\u0010\u001a\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001b\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u000eH\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0001*\u00020\u000eH\u0080\b\u001a\r\u0010 \u001a\u00020\u000e*\u00020\u000eH\u0080\b\u001a\u000f\u0010!\u001a\u0004\u0018\u00010\u000e*\u00020\u000eH\u0080\b\u001a\u0015\u0010\"\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001c\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\u000f\u0010'\u001a\u0004\u0018\u00010\u000e*\u00020\u000eH\u0080\b\u001a\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0)*\u00020\u000eH\u0080\b\u001a\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010)*\u00020\u000eH\u0080\b\u001a\u0014\u0010+\u001a\u00020\u000e*\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\r\u0010,\u001a\u00020\u001e*\u00020\u000eH\u0080\b\u001a\u0014\u0010-\u001a\u0004\u0018\u00010.*\u00020\u000eH\u0080\b¢\u0006\u0002\u0010/\u001a\f\u00100\u001a\u00020\u0017*\u00020\u000eH\u0002\u001a\f\u00101\u001a\u00020\r*\u00020\u000eH\u0002\u001a\u0014\u00102\u001a\u00020\u0017*\u00020&2\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0014\u00103\u001a\u00020\u000e*\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\f\u00104\u001a\u00020\u0001*\u000205H\u0002\u001a\f\u00104\u001a\u00020\u0001*\u00020\u001eH\u0002\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00066"}, d2 = {"ANY_SLASH", "Lokio/ByteString;", "getANY_SLASH$annotations", "()V", "BACKSLASH", "getBACKSLASH$annotations", "DOT", "getDOT$annotations", "DOT_DOT", "getDOT_DOT$annotations", "SLASH", "getSLASH$annotations", "indexOfLastSlash", "", "Lokio/Path;", "getIndexOfLastSlash", "(Lokio/Path;)I", "slash", "getSlash", "(Lokio/Path;)Lokio/ByteString;", "commonCompareTo", "other", "commonEquals", "", "", "commonHashCode", "commonIsAbsolute", "commonIsRelative", "commonIsRoot", "commonName", "", "commonNameBytes", "commonNormalized", "commonParent", "commonRelativeTo", "commonResolve", "child", "normalize", "Lokio/Buffer;", "commonRoot", "commonSegments", "", "commonSegmentsBytes", "commonToPath", "commonToString", "commonVolumeLetter", "", "(Lokio/Path;)Ljava/lang/Character;", "lastSegmentIsDotDot", "rootLength", "startsWithVolumeLetterAndColon", "toPath", "toSlash", "", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Path {
    private static final okio.ByteString SLASH = okio.ByteString.INSTANCE.encodeUtf8("/");
    private static final okio.ByteString BACKSLASH = okio.ByteString.INSTANCE.encodeUtf8("\\");
    private static final okio.ByteString ANY_SLASH = okio.ByteString.INSTANCE.encodeUtf8("/\\");
    private static final okio.ByteString DOT = okio.ByteString.INSTANCE.encodeUtf8(".");
    private static final okio.ByteString DOT_DOT = okio.ByteString.INSTANCE.encodeUtf8("..");

    private static /* synthetic */ void getANY_SLASH$annotations() {
    }

    private static /* synthetic */ void getBACKSLASH$annotations() {
    }

    private static /* synthetic */ void getDOT$annotations() {
    }

    private static /* synthetic */ void getDOT_DOT$annotations() {
    }

    private static /* synthetic */ void getSLASH$annotations() {
    }

    public static final okio.Path commonRoot(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            return null;
        }
        return new okio.Path(path.getBytes().substring(0, iRootLength));
    }

    public static final java.util.List<okio.ByteString> commonSegmentsBytes(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes().size() && path.getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes().size();
        int i = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes().getByte(iRootLength) == 47 || path.getBytes().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes().substring(i, iRootLength));
                i = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i < path.getBytes().size()) {
            arrayList.add(path.getBytes().substring(i, path.getBytes().size()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rootLength(okio.Path path) {
        if (path.getBytes().size() == 0) {
            return -1;
        }
        boolean z = false;
        if (path.getBytes().getByte(0) == 47) {
            return 1;
        }
        if (path.getBytes().getByte(0) == 92) {
            if (path.getBytes().size() <= 2 || path.getBytes().getByte(1) != 92) {
                return 1;
            }
            int iIndexOf = path.getBytes().indexOf(BACKSLASH, 2);
            return iIndexOf == -1 ? path.getBytes().size() : iIndexOf;
        }
        if (path.getBytes().size() <= 2 || path.getBytes().getByte(1) != 58 || path.getBytes().getByte(2) != 92) {
            return -1;
        }
        char c = (char) path.getBytes().getByte(0);
        if ('a' <= c && c < '{') {
            return 3;
        }
        if ('A' <= c && c < '[') {
            z = true;
        }
        return !z ? -1 : 3;
    }

    public static final boolean commonIsAbsolute(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return rootLength(path) != -1;
    }

    public static final boolean commonIsRelative(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return rootLength(path) == -1;
    }

    public static final java.lang.Character commonVolumeLetter(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        boolean z = false;
        if (okio.ByteString.indexOf$default(path.getBytes(), SLASH, 0, 2, (java.lang.Object) null) != -1 || path.getBytes().size() < 2 || path.getBytes().getByte(1) != 58) {
            return null;
        }
        char c = (char) path.getBytes().getByte(0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIndexOfLastSlash(okio.Path path) {
        int iLastIndexOf$default = okio.ByteString.lastIndexOf$default(path.getBytes(), SLASH, 0, 2, (java.lang.Object) null);
        return iLastIndexOf$default != -1 ? iLastIndexOf$default : okio.ByteString.lastIndexOf$default(path.getBytes(), BACKSLASH, 0, 2, (java.lang.Object) null);
    }

    public static final okio.ByteString commonNameBytes(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        int indexOfLastSlash = getIndexOfLastSlash(path);
        if (indexOfLastSlash != -1) {
            return okio.ByteString.substring$default(path.getBytes(), indexOfLastSlash + 1, 0, 2, null);
        }
        return (path.volumeLetter() == null || path.getBytes().size() != 2) ? path.getBytes() : okio.ByteString.EMPTY;
    }

    public static final java.lang.String commonName(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return path.nameBytes().utf8();
    }

    public static final okio.Path commonParent(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        if (kotlin.jvm.internal.Intrinsics.areEqual(path.getBytes(), DOT) || kotlin.jvm.internal.Intrinsics.areEqual(path.getBytes(), SLASH) || kotlin.jvm.internal.Intrinsics.areEqual(path.getBytes(), BACKSLASH) || lastSegmentIsDotDot(path)) {
            return null;
        }
        int indexOfLastSlash = getIndexOfLastSlash(path);
        if (indexOfLastSlash != 2 || path.volumeLetter() == null) {
            if (indexOfLastSlash == 1 && path.getBytes().startsWith(BACKSLASH)) {
                return null;
            }
            if (indexOfLastSlash == -1 && path.volumeLetter() != null) {
                if (path.getBytes().size() == 2) {
                    return null;
                }
                return new okio.Path(okio.ByteString.substring$default(path.getBytes(), 0, 2, 1, null));
            }
            if (indexOfLastSlash == -1) {
                return new okio.Path(DOT);
            }
            if (indexOfLastSlash == 0) {
                return new okio.Path(okio.ByteString.substring$default(path.getBytes(), 0, 1, 1, null));
            }
            return new okio.Path(okio.ByteString.substring$default(path.getBytes(), 0, indexOfLastSlash, 1, null));
        }
        if (path.getBytes().size() == 3) {
            return null;
        }
        return new okio.Path(okio.ByteString.substring$default(path.getBytes(), 0, 3, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lastSegmentIsDotDot(okio.Path path) {
        return path.getBytes().endsWith(DOT_DOT) && (path.getBytes().size() == 2 || path.getBytes().rangeEquals(path.getBytes().size() + (-3), SLASH, 0, 1) || path.getBytes().rangeEquals(path.getBytes().size() + (-3), BACKSLASH, 0, 1));
    }

    public static final boolean commonIsRoot(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return rootLength(path) == path.getBytes().size();
    }

    public static final okio.Path commonResolve(okio.Path path, java.lang.String child, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new okio.Buffer().writeUtf8(child), false), z);
    }

    public static final okio.Path commonResolve(okio.Path path, okio.ByteString child, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new okio.Buffer().write(child), false), z);
    }

    public static final okio.Path commonResolve(okio.Path path, okio.Buffer child, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(child, false), z);
    }

    public static final okio.Path commonResolve(okio.Path path, okio.Path child, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.volumeLetter() != null) {
            return child;
        }
        okio.ByteString slash = getSlash(path);
        if (slash == null && (slash = getSlash(child)) == null) {
            slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
        }
        okio.Buffer buffer = new okio.Buffer();
        buffer.write(path.getBytes());
        if (buffer.size() > 0) {
            buffer.write(slash);
        }
        buffer.write(child.getBytes());
        return toPath(buffer, z);
    }

    public static final okio.Path commonRelativeTo(okio.Path path, okio.Path other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(path.getRoot(), other.getRoot())) {
            throw new java.lang.IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + path + " and " + other).toString());
        }
        java.util.List<okio.ByteString> segmentsBytes = path.getSegmentsBytes();
        java.util.List<okio.ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = java.lang.Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i = 0;
        while (i < iMin && kotlin.jvm.internal.Intrinsics.areEqual(segmentsBytes.get(i), segmentsBytes2.get(i))) {
            i++;
        }
        if (i != iMin || path.getBytes().size() != other.getBytes().size()) {
            if (!(segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(DOT_DOT) == -1)) {
                throw new java.lang.IllegalArgumentException(("Impossible relative path to resolve: " + path + " and " + other).toString());
            }
            okio.Buffer buffer = new okio.Buffer();
            okio.ByteString slash = getSlash(other);
            if (slash == null && (slash = getSlash(path)) == null) {
                slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
            }
            int size = segmentsBytes2.size();
            for (int i2 = i; i2 < size; i2++) {
                buffer.write(DOT_DOT);
                buffer.write(slash);
            }
            int size2 = segmentsBytes.size();
            while (i < size2) {
                buffer.write(segmentsBytes.get(i));
                buffer.write(slash);
                i++;
            }
            return toPath(buffer, false);
        }
        return okio.Path.Companion.get$default(okio.Path.INSTANCE, ".", false, 1, (java.lang.Object) null);
    }

    public static final okio.Path commonNormalized(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return okio.Path.INSTANCE.get(path.toString(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okio.ByteString getSlash(okio.Path path) {
        okio.ByteString bytes = path.getBytes();
        okio.ByteString byteString = SLASH;
        if (okio.ByteString.indexOf$default(bytes, byteString, 0, 2, (java.lang.Object) null) != -1) {
            return byteString;
        }
        okio.ByteString bytes2 = path.getBytes();
        okio.ByteString byteString2 = BACKSLASH;
        if (okio.ByteString.indexOf$default(bytes2, byteString2, 0, 2, (java.lang.Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    public static final int commonCompareTo(okio.Path path, okio.Path other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return path.getBytes().compareTo(other.getBytes());
    }

    public static final boolean commonEquals(okio.Path path, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return (obj instanceof okio.Path) && kotlin.jvm.internal.Intrinsics.areEqual(((okio.Path) obj).getBytes(), path.getBytes());
    }

    public static final int commonHashCode(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return path.getBytes().hashCode();
    }

    public static final java.lang.String commonToString(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return path.getBytes().utf8();
    }

    public static final okio.Path commonToPath(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return toPath(new okio.Buffer().writeUtf8(str), z);
    }

    public static final okio.Path toPath(okio.Buffer buffer, boolean z) throws java.io.EOFException {
        okio.ByteString byteString;
        okio.ByteString byteString2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Buffer buffer2 = new okio.Buffer();
        okio.ByteString slash = null;
        int i = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, SLASH)) {
                byteString = BACKSLASH;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte b = buffer.readByte();
            if (slash == null) {
                slash = toSlash(b);
            }
            i++;
        }
        boolean z2 = i >= 2 && kotlin.jvm.internal.Intrinsics.areEqual(slash, byteString);
        if (z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(slash);
            buffer2.write(slash);
            buffer2.write(slash);
        } else if (i > 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(slash);
            buffer2.write(slash);
        } else {
            long jIndexOfElement = buffer.indexOfElement(ANY_SLASH);
            if (slash == null) {
                if (jIndexOfElement == -1) {
                    slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
                } else {
                    slash = toSlash(buffer.getByte(jIndexOfElement));
                }
            }
            if (startsWithVolumeLetterAndColon(buffer, slash)) {
                if (jIndexOfElement == 2) {
                    buffer2.write(buffer, 3L);
                } else {
                    buffer2.write(buffer, 2L);
                }
            }
        }
        boolean z3 = buffer2.size() > 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!buffer.exhausted()) {
            long jIndexOfElement2 = buffer.indexOfElement(ANY_SLASH);
            if (jIndexOfElement2 == -1) {
                byteString2 = buffer.readByteString();
            } else {
                byteString2 = buffer.readByteString(jIndexOfElement2);
                buffer.readByte();
            }
            okio.ByteString byteString3 = DOT_DOT;
            if (kotlin.jvm.internal.Intrinsics.areEqual(byteString2, byteString3)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.last((java.util.List) arrayList), byteString3)))) {
                        arrayList.add(byteString2);
                    } else if (!z2 || arrayList.size() != 1) {
                        kotlin.collections.CollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(byteString2, DOT) && !kotlin.jvm.internal.Intrinsics.areEqual(byteString2, okio.ByteString.EMPTY)) {
                arrayList.add(byteString2);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                buffer2.write(slash);
            }
            buffer2.write((okio.ByteString) arrayList.get(i2));
        }
        if (buffer2.size() == 0) {
            buffer2.write(DOT);
        }
        return new okio.Path(buffer2.readByteString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okio.ByteString toSlash(java.lang.String str) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "/")) {
            return SLASH;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "\\")) {
            return BACKSLASH;
        }
        throw new java.lang.IllegalArgumentException("not a directory separator: " + str);
    }

    private static final okio.ByteString toSlash(byte b) {
        if (b == 47) {
            return SLASH;
        }
        if (b == 92) {
            return BACKSLASH;
        }
        throw new java.lang.IllegalArgumentException("not a directory separator: " + ((int) b));
    }

    private static final boolean startsWithVolumeLetterAndColon(okio.Buffer buffer, okio.ByteString byteString) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(byteString, BACKSLASH) || buffer.size() < 2 || buffer.getByte(1L) != 58) {
            return false;
        }
        char c = (char) buffer.getByte(0L);
        if (!('a' <= c && c < '{')) {
            if (!('A' <= c && c < '[')) {
                return false;
            }
        }
        return true;
    }

    public static final java.util.List<java.lang.String> commonSegments(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes().size() && path.getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes().size();
        int i = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes().getByte(iRootLength) == 47 || path.getBytes().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes().substring(i, iRootLength));
                i = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i < path.getBytes().size()) {
            arrayList.add(path.getBytes().substring(i, path.getBytes().size()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((okio.ByteString) it.next()).utf8());
        }
        return arrayList3;
    }
}

package okio.internal;

/* JADX INFO: compiled from: ZipFiles.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0002\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u001b\u001a.\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#0\"H\u0000\u001a\f\u0010$\u001a\u00020\u0015*\u00020%H\u0000\u001a\f\u0010&\u001a\u00020'*\u00020%H\u0002\u001a.\u0010(\u001a\u00020)*\u00020%2\u0006\u0010*\u001a\u00020\u00012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020)0,H\u0002\u001a\u0014\u0010-\u001a\u00020.*\u00020%2\u0006\u0010/\u001a\u00020.H\u0000\u001a\u0018\u00100\u001a\u0004\u0018\u00010.*\u00020%2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002\u001a\u0014\u00101\u001a\u00020'*\u00020%2\u0006\u00102\u001a\u00020'H\u0002\u001a\f\u00103\u001a\u00020)*\u00020%H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u00064"}, d2 = {"BIT_FLAG_ENCRYPTED", "", "BIT_FLAG_UNSUPPORTED_MASK", "CENTRAL_FILE_HEADER_SIGNATURE", "COMPRESSION_METHOD_DEFLATED", "COMPRESSION_METHOD_STORED", "END_OF_CENTRAL_DIRECTORY_SIGNATURE", "HEADER_ID_EXTENDED_TIMESTAMP", "HEADER_ID_ZIP64_EXTENDED_INFO", "LOCAL_FILE_HEADER_SIGNATURE", "MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE", "", "ZIP64_EOCD_RECORD_SIGNATURE", "ZIP64_LOCATOR_SIGNATURE", "hex", "", "getHex", "(I)Ljava/lang/String;", "buildIndex", "", "Lokio/Path;", "Lokio/internal/ZipEntry;", "entries", "", "dosDateTimeToEpochMillis", "date", "time", "(II)Ljava/lang/Long;", "openZip", "Lokio/ZipFileSystem;", "zipPath", "fileSystem", "Lokio/FileSystem;", "predicate", "Lkotlin/Function1;", "", "readEntry", "Lokio/BufferedSource;", "readEocdRecord", "Lokio/internal/EocdRecord;", "readExtra", "", "extraSize", "block", "Lkotlin/Function2;", "readLocalHeader", "Lokio/FileMetadata;", "basicMetadata", "readOrSkipLocalHeader", "readZip64EocdRecord", "regularRecord", "skipLocalHeader", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    public static /* synthetic */ okio.ZipFileSystem openZip$default(okio.Path path, okio.FileSystem fileSystem, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<okio.internal.ZipEntry, java.lang.Boolean>() { // from class: okio.internal.ZipFilesKt.openZip.1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(okio.internal.ZipEntry it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        return openZip(path, fileSystem, function1);
    }

    public static final okio.ZipFileSystem openZip(okio.Path zipPath, okio.FileSystem fileSystem, kotlin.jvm.functions.Function1<? super okio.internal.ZipEntry, java.lang.Boolean> predicate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        okio.FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(zipPath);
        try {
            okio.FileHandle fileHandle = fileHandleOpenReadOnly;
            long size = fileHandle.size() - ((long) 22);
            if (size < 0) {
                throw new java.io.IOException("not a zip: size=" + fileHandle.size());
            }
            long jMax = java.lang.Math.max(size - 65536, 0L);
            do {
                okio.BufferedSource bufferedSourceBuffer = okio.Okio.buffer(fileHandle.source(size));
                try {
                    if (bufferedSourceBuffer.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                        okio.internal.EocdRecord eocdRecord = readEocdRecord(bufferedSourceBuffer);
                        java.lang.String utf8 = bufferedSourceBuffer.readUtf8(eocdRecord.getCommentByteCount());
                        bufferedSourceBuffer.close();
                        long j = size - ((long) 20);
                        if (j > 0) {
                            okio.BufferedSource bufferedSourceBuffer2 = okio.Okio.buffer(fileHandle.source(j));
                            try {
                                okio.BufferedSource bufferedSource = bufferedSourceBuffer2;
                                if (bufferedSource.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
                                    int intLe = bufferedSource.readIntLe();
                                    long longLe = bufferedSource.readLongLe();
                                    if (bufferedSource.readIntLe() != 1 || intLe != 0) {
                                        throw new java.io.IOException("unsupported zip: spanned");
                                    }
                                    okio.BufferedSource bufferedSourceBuffer3 = okio.Okio.buffer(fileHandle.source(longLe));
                                    try {
                                        okio.BufferedSource bufferedSource2 = bufferedSourceBuffer3;
                                        int intLe2 = bufferedSource2.readIntLe();
                                        if (intLe2 != ZIP64_EOCD_RECORD_SIGNATURE) {
                                            throw new java.io.IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(intLe2));
                                        }
                                        okio.internal.EocdRecord zip64EocdRecord = readZip64EocdRecord(bufferedSource2, eocdRecord);
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        kotlin.io.CloseableKt.closeFinally(bufferedSourceBuffer3, null);
                                        eocdRecord = zip64EocdRecord;
                                    } catch (java.lang.Throwable th) {
                                        try {
                                            throw th;
                                        } catch (java.lang.Throwable th2) {
                                            kotlin.io.CloseableKt.closeFinally(bufferedSourceBuffer3, th);
                                            throw th2;
                                        }
                                    }
                                    try {
                                        throw th;
                                    } catch (java.lang.Throwable th3) {
                                        kotlin.io.CloseableKt.closeFinally(fileHandleOpenReadOnly, th);
                                        throw th3;
                                    }
                                }
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                kotlin.io.CloseableKt.closeFinally(bufferedSourceBuffer2, null);
                            } catch (java.lang.Throwable th4) {
                                try {
                                    throw th4;
                                } catch (java.lang.Throwable th5) {
                                    kotlin.io.CloseableKt.closeFinally(bufferedSourceBuffer2, th4);
                                    throw th5;
                                }
                            }
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        okio.BufferedSource bufferedSourceBuffer4 = okio.Okio.buffer(fileHandle.source(eocdRecord.getCentralDirectoryOffset()));
                        try {
                            okio.BufferedSource bufferedSource3 = bufferedSourceBuffer4;
                            long entryCount = eocdRecord.getEntryCount();
                            for (long j2 = 0; j2 < entryCount; j2++) {
                                okio.internal.ZipEntry entry = readEntry(bufferedSource3);
                                if (entry.getOffset() >= eocdRecord.getCentralDirectoryOffset()) {
                                    throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (predicate.invoke(entry).booleanValue()) {
                                    arrayList.add(entry);
                                }
                            }
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            kotlin.io.CloseableKt.closeFinally(bufferedSourceBuffer4, null);
                            okio.ZipFileSystem zipFileSystem = new okio.ZipFileSystem(zipPath, fileSystem, buildIndex(arrayList), utf8);
                            kotlin.io.CloseableKt.closeFinally(fileHandleOpenReadOnly, null);
                            return zipFileSystem;
                        } catch (java.lang.Throwable th6) {
                            try {
                                throw th6;
                            } catch (java.lang.Throwable th7) {
                                kotlin.io.CloseableKt.closeFinally(bufferedSourceBuffer4, th6);
                                throw th7;
                            }
                        }
                    }
                    bufferedSourceBuffer.close();
                    size--;
                } catch (java.lang.Throwable th8) {
                    bufferedSourceBuffer.close();
                    throw th8;
                }
            } while (size >= jMax);
            throw new java.io.IOException("not a zip: end of central directory signature not found");
        } catch (java.lang.Throwable th9) {
            throw th9;
        }
    }

    private static final java.util.Map<okio.Path, okio.internal.ZipEntry> buildIndex(java.util.List<okio.internal.ZipEntry> list) {
        okio.Path path = okio.Path.Companion.get$default(okio.Path.INSTANCE, "/", false, 1, (java.lang.Object) null);
        java.util.Map<okio.Path, okio.internal.ZipEntry> mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(path, new okio.internal.ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (okio.internal.ZipEntry zipEntry : kotlin.collections.CollectionsKt.sortedWith(list, new java.util.Comparator() { // from class: okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(((okio.internal.ZipEntry) t).getCanonicalPath(), ((okio.internal.ZipEntry) t2).getCanonicalPath());
            }
        })) {
            if (mapMutableMapOf.put(zipEntry.getCanonicalPath(), zipEntry) == null) {
                while (true) {
                    okio.Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent == null) {
                        break;
                    }
                    okio.internal.ZipEntry zipEntry2 = mapMutableMapOf.get(pathParent);
                    if (zipEntry2 != null) {
                        zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                        break;
                    }
                    okio.internal.ZipEntry zipEntry3 = new okio.internal.ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                    mapMutableMapOf.put(pathParent, zipEntry3);
                    zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                    zipEntry = zipEntry3;
                }
            }
        }
        return mapMutableMapOf;
    }

    public static final okio.internal.ZipEntry readEntry(final okio.BufferedSource bufferedSource) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new java.io.IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        int shortLe = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        if ((shortLe & 1) != 0) {
            throw new java.io.IOException("unsupported zip: general purpose bit flag=" + getHex(shortLe));
        }
        int shortLe2 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        java.lang.Long lDosDateTimeToEpochMillis = dosDateTimeToEpochMillis(bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE, bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE);
        long intLe2 = ((long) bufferedSource.readIntLe()) & 4294967295L;
        final kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
        longRef.element = ((long) bufferedSource.readIntLe()) & 4294967295L;
        final kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
        longRef2.element = ((long) bufferedSource.readIntLe()) & 4294967295L;
        int shortLe3 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        int shortLe4 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        int shortLe5 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        bufferedSource.skip(8L);
        final kotlin.jvm.internal.Ref.LongRef longRef3 = new kotlin.jvm.internal.Ref.LongRef();
        longRef3.element = ((long) bufferedSource.readIntLe()) & 4294967295L;
        java.lang.String utf8 = bufferedSource.readUtf8(shortLe3);
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) utf8, (char) 0, false, 2, (java.lang.Object) null)) {
            throw new java.io.IOException("bad zip: filename contains 0x00");
        }
        long j = longRef2.element == 4294967295L ? ((long) 8) + 0 : 0L;
        long j2 = longRef.element == 4294967295L ? j + ((long) 8) : j;
        if (longRef3.element == 4294967295L) {
            j2 += (long) 8;
        }
        final long j3 = j2;
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        readExtra(bufferedSource, shortLe4, new kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Long, kotlin.Unit>() { // from class: okio.internal.ZipFilesKt.readEntry.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.Long l) throws java.io.IOException {
                invoke(num.intValue(), l.longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(int i, long j4) throws java.io.IOException {
                if (i == 1) {
                    if (booleanRef.element) {
                        throw new java.io.IOException("bad zip: zip64 extra repeated");
                    }
                    booleanRef.element = true;
                    if (j4 < j3) {
                        throw new java.io.IOException("bad zip: zip64 extra too short");
                    }
                    kotlin.jvm.internal.Ref.LongRef longRef4 = longRef2;
                    longRef4.element = longRef4.element == 4294967295L ? bufferedSource.readLongLe() : longRef2.element;
                    kotlin.jvm.internal.Ref.LongRef longRef5 = longRef;
                    longRef5.element = longRef5.element == 4294967295L ? bufferedSource.readLongLe() : 0L;
                    kotlin.jvm.internal.Ref.LongRef longRef6 = longRef3;
                    longRef6.element = longRef6.element == 4294967295L ? bufferedSource.readLongLe() : 0L;
                }
            }
        });
        if (j3 > 0 && !booleanRef.element) {
            throw new java.io.IOException("bad zip: zip64 extra required but absent");
        }
        return new okio.internal.ZipEntry(okio.Path.Companion.get$default(okio.Path.INSTANCE, "/", false, 1, (java.lang.Object) null).resolve(utf8), kotlin.text.StringsKt.endsWith$default(utf8, "/", false, 2, (java.lang.Object) null), bufferedSource.readUtf8(shortLe5), intLe2, longRef.element, longRef2.element, shortLe2, lDosDateTimeToEpochMillis, longRef3.element);
    }

    private static final okio.internal.EocdRecord readEocdRecord(okio.BufferedSource bufferedSource) throws java.io.IOException {
        int shortLe = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        int shortLe2 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        long shortLe3 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        if (shortLe3 != (bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE) || shortLe != 0 || shortLe2 != 0) {
            throw new java.io.IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new okio.internal.EocdRecord(shortLe3, 4294967295L & ((long) bufferedSource.readIntLe()), bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE);
    }

    private static final okio.internal.EocdRecord readZip64EocdRecord(okio.BufferedSource bufferedSource, okio.internal.EocdRecord eocdRecord) throws java.io.IOException {
        bufferedSource.skip(12L);
        int intLe = bufferedSource.readIntLe();
        int intLe2 = bufferedSource.readIntLe();
        long longLe = bufferedSource.readLongLe();
        if (longLe != bufferedSource.readLongLe() || intLe != 0 || intLe2 != 0) {
            throw new java.io.IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new okio.internal.EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    private static final void readExtra(okio.BufferedSource bufferedSource, int i, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function2) throws java.io.IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new java.io.IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
            long shortLe2 = ((long) bufferedSource.readShortLe()) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j2 = j - ((long) 4);
            if (j2 < shortLe2) {
                throw new java.io.IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            function2.invoke(java.lang.Integer.valueOf(shortLe), java.lang.Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new java.io.IOException("unsupported zip: too many bytes processed for " + shortLe);
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j = j2 - shortLe2;
        }
    }

    public static final void skipLocalHeader(okio.BufferedSource bufferedSource) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }

    public static final okio.FileMetadata readLocalHeader(okio.BufferedSource bufferedSource, okio.FileMetadata basicMetadata) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
        okio.FileMetadata orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, basicMetadata);
        kotlin.jvm.internal.Intrinsics.checkNotNull(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final okio.FileMetadata readOrSkipLocalHeader(final okio.BufferedSource bufferedSource, okio.FileMetadata fileMetadata) throws java.io.IOException {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = fileMetadata != null ? fileMetadata.getLastModifiedAtMillis() : 0;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new java.io.IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        int shortLe = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        if ((shortLe & 1) != 0) {
            throw new java.io.IOException("unsupported zip: general purpose bit flag=" + getHex(shortLe));
        }
        bufferedSource.skip(18L);
        long shortLe2 = ((long) bufferedSource.readShortLe()) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        bufferedSource.skip(shortLe2);
        if (fileMetadata == null) {
            bufferedSource.skip(shortLe3);
            return null;
        }
        readExtra(bufferedSource, shortLe3, new kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Long, kotlin.Unit>() { // from class: okio.internal.ZipFilesKt.readOrSkipLocalHeader.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.Long l) throws java.io.IOException {
                invoke(num.intValue(), l.longValue());
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r10v12, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Long] */
            public final void invoke(int i, long j) throws java.io.IOException {
                if (i == okio.internal.ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                    if (j < 1) {
                        throw new java.io.IOException("bad zip: extended timestamp extra too short");
                    }
                    int i2 = bufferedSource.readByte() & 255;
                    boolean z = (i2 & 1) == 1;
                    boolean z2 = (i2 & 2) == 2;
                    boolean z3 = (i2 & 4) == 4;
                    okio.BufferedSource bufferedSource2 = bufferedSource;
                    long j2 = z ? 5L : 1L;
                    if (z2) {
                        j2 += 4;
                    }
                    if (z3) {
                        j2 += 4;
                    }
                    if (j < j2) {
                        throw new java.io.IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        objectRef.element = java.lang.Long.valueOf(((long) bufferedSource2.readIntLe()) * 1000);
                    }
                    if (z2) {
                        objectRef2.element = java.lang.Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                    }
                    if (z3) {
                        objectRef3.element = java.lang.Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                    }
                }
            }
        });
        return new okio.FileMetadata(fileMetadata.getIsRegularFile(), fileMetadata.getIsDirectory(), null, fileMetadata.getSize(), (java.lang.Long) objectRef3.element, (java.lang.Long) objectRef.element, (java.lang.Long) objectRef2.element, null, 128, null);
    }

    private static final java.lang.Long dosDateTimeToEpochMillis(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i >> 9) & 127) + 1980, ((i >> 5) & 15) - 1, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1);
        return java.lang.Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final java.lang.String getHex(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("0x");
        java.lang.String string = java.lang.Integer.toString(i, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        return sb.append(string).toString();
    }
}

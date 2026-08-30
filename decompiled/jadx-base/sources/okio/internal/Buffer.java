package okio.internal;

/* JADX INFO: renamed from: okio.internal.-Buffer, reason: invalid class name */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0080\b\u001a\r\u0010\u0016\u001a\u00020\u0014*\u00020\u0017H\u0080\b\u001a\r\u0010\u0018\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0015*\u00020\u0015H\u0080\b\u001a%\u0010\u001a\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0017\u0010\u001e\u001a\u00020\f*\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\"\u001a\u00020\nH\u0080\b\u001a\u0015\u0010#\u001a\u00020$*\u00020\u00152\u0006\u0010%\u001a\u00020\u0007H\u0080\b\u001a\r\u0010&\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a%\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010,\u001a\u00020\u0007*\u00020\u00152\u0006\u0010-\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\r\u0010.\u001a\u00020\n*\u00020\u0017H\u0080\b\u001a-\u0010/\u001a\u00020\f*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a%\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u00100\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00102\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u000203H\u0080\b\u001a\u0014\u00104\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\r\u00106\u001a\u00020$*\u00020\u0015H\u0080\b\u001a\r\u00107\u001a\u00020\u0001*\u00020\u0015H\u0080\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00108\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u00108\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\u0015\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010;\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010<\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\r\u0010=\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010>\u001a\u00020?*\u00020\u0015H\u0080\b\u001a\u0014\u0010@\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\u0015\u0010A\u001a\u00020B*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010C\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\u000f\u0010D\u001a\u0004\u0018\u00010B*\u00020\u0015H\u0080\b\u001a\u0015\u0010E\u001a\u00020B*\u00020\u00152\u0006\u0010F\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010G\u001a\u00020\u0007*\u00020\u00172\u0006\u0010H\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010I\u001a\u00020\n*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020LH\u0080\b\u001a\u0015\u0010M\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010N\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u0010N\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u0010O\u001a\u00020\u000e*\u00020\u00152\u0006\u0010P\u001a\u00020\nH\u0080\b\u001a\u0015\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u0001H\u0080\b\u001a%\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0014*\u00020\u00152\u0006\u0010R\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a)\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010S\u001a\u00020+2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010U\u001a\u00020\u0007*\u00020\u00152\u0006\u0010R\u001a\u00020TH\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0015*\u00020\u00152\u0006\u0010(\u001a\u00020\nH\u0080\b\u001a\u0015\u0010W\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Y\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Z\u001a\u00020\u0015*\u00020\u00152\u0006\u0010[\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\\\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010]\u001a\u00020\u0015*\u00020\u00152\u0006\u0010^\u001a\u00020\nH\u0080\b\u001a%\u0010_\u001a\u00020\u0015*\u00020\u00152\u0006\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\n2\u0006\u0010b\u001a\u00020\nH\u0080\b\u001a\u0015\u0010c\u001a\u00020\u0015*\u00020\u00152\u0006\u0010d\u001a\u00020\nH\u0080\b\u001a\u0014\u0010e\u001a\u00020B*\u00020\u00152\u0006\u0010f\u001a\u00020\u0007H\u0000\u001a?\u0010g\u001a\u0002Hh\"\u0004\b\u0000\u0010h*\u00020\u00152\u0006\u0010)\u001a\u00020\u00072\u001a\u0010i\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002Hh0jH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010k\u001a\u001e\u0010l\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020L2\b\b\u0002\u0010m\u001a\u00020\fH\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006n"}, d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES$annotations", "()V", "getHEX_DIGIT_BYTES", "()[B", "OVERFLOW_DIGIT_START", "", "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", com.json.y3.i, "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "commonClear", "", "Lokio/Buffer;", "commonClose", "Lokio/Buffer$UnsafeCursor;", "commonCompleteSegmentByteCount", "commonCopy", "commonCopyTo", "out", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "commonEquals", "other", "", "commonExpandBuffer", "minByteCount", "commonGet", "", "pos", "commonHashCode", "commonIndexOf", "b", "fromIndex", "toIndex", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonNext", "commonRangeEquals", "commonRead", "sink", "commonReadAll", "Lokio/Sink;", "commonReadAndWriteUnsafe", "unsafeCursor", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadLong", "commonReadShort", "", "commonReadUnsafe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonResizeBuffer", "newSize", "commonSeek", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonSnapshot", "commonWritableSegment", "minimumCapacity", "commonWrite", "source", "byteString", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "commonWriteLong", "commonWriteShort", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "commonWriteUtf8", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "readUtf8Line", "newline", "seek", "T", "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "selectTruncated", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Buffer {
    private static final byte[] HEX_DIGIT_BYTES = okio._JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(okio.Segment segment, int i, byte[] bytes, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i4 = segment.limit;
        byte[] bArr = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i = segment.pos;
                i4 = segment.limit;
            }
            if (bArr[i] != bytes[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final java.lang.String readUtf8Line(okio.Buffer buffer, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.getByte(j2) == 13) {
                java.lang.String utf8 = buffer.readUtf8(j2);
                buffer.skip(2L);
                return utf8;
            }
        }
        java.lang.String utf9 = buffer.readUtf8(j);
        buffer.skip(1L);
        return utf9;
    }

    public static final <T> T seek(okio.Buffer buffer, long j, kotlin.jvm.functions.Function2<? super okio.Segment, ? super java.lang.Long, ? extends T> lambda) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lambda, "lambda");
        okio.Segment segment = buffer.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return lambda.invoke(segment, java.lang.Long.valueOf(size));
        }
        long j2 = 0;
        while (true) {
            long j3 = ((long) (segment.limit - segment.pos)) + j2;
            if (j3 <= j) {
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j2 = j3;
            } else {
                return lambda.invoke(segment, java.lang.Long.valueOf(j2));
            }
        }
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, okio.Options options, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return selectPrefix(buffer, options, z);
    }

    public static final int selectPrefix(okio.Buffer buffer, okio.Options options, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        okio.Segment segment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        okio.Segment segment2 = buffer.head;
        if (segment2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i5 = segment2.pos;
        int i6 = segment2.limit;
        int[] trie$okio = options.getTrie();
        okio.Segment segment3 = segment2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = trie$okio[i8];
            int i11 = i9 + 1;
            int i12 = trie$okio[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (segment3 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & 255;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == trie$okio[i11]) {
                        i2 = trie$okio[i11 + i10];
                        if (i == i6) {
                            segment3 = segment3.next;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                            i = segment3.pos;
                            bArr = segment3.data;
                            i6 = segment3.limit;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i15 = i11 + (i10 * (-1));
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & 255) != trie$okio[i11]) {
                    return i7;
                }
                boolean z2 = i17 == i15;
                if (i16 == i6) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                    okio.Segment segment4 = segment3.next;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment4);
                    i4 = segment4.pos;
                    byte[] bArr2 = segment4.data;
                    i3 = segment4.limit;
                    if (segment4 != segment2) {
                        segment = segment4;
                        bArr = bArr2;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr2;
                        segment = null;
                    }
                } else {
                    okio.Segment segment5 = segment3;
                    i3 = i6;
                    i4 = i16;
                    segment = segment5;
                }
                if (z2) {
                    i2 = trie$okio[i17];
                    i = i4;
                    i6 = i3;
                    segment3 = segment;
                    break;
                }
                i5 = i4;
                i6 = i3;
                i11 = i17;
                segment3 = segment;
            }
            if (i2 >= 0) {
                return i2;
            }
            i8 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    public static final okio.Buffer commonCopyTo(okio.Buffer buffer, okio.Buffer out, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        okio.SegmentedByteString.checkOffsetAndCount(buffer.size(), j, j2);
        if (j2 == 0) {
            return buffer;
        }
        out.setSize$okio(out.size() + j2);
        okio.Segment segment = buffer.head;
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            if (j < segment.limit - segment.pos) {
                break;
            }
            j -= (long) (segment.limit - segment.pos);
            segment = segment.next;
        }
        while (j2 > 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            okio.Segment segmentSharedCopy = segment.sharedCopy();
            segmentSharedCopy.pos += (int) j;
            segmentSharedCopy.limit = java.lang.Math.min(segmentSharedCopy.pos + ((int) j2), segmentSharedCopy.limit);
            if (out.head == null) {
                segmentSharedCopy.prev = segmentSharedCopy;
                segmentSharedCopy.next = segmentSharedCopy.prev;
                out.head = segmentSharedCopy.next;
            } else {
                okio.Segment segment2 = out.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                okio.Segment segment3 = segment2.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                segment3.push(segmentSharedCopy);
            }
            j2 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
            segment = segment.next;
            j = 0;
        }
        return buffer;
    }

    public static final long commonCompleteSegmentByteCount(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment segment2 = segment.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - ((long) (segment2.limit - segment2.pos));
    }

    public static final byte commonReadByte(okio.Buffer buffer) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        buffer.setSize$okio(buffer.size() - 1);
        if (i3 == i2) {
            buffer.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i3;
        }
        return b;
    }

    public static final short commonReadShort(okio.Buffer buffer) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        buffer.setSize$okio(buffer.size() - 2);
        if (i4 == i2) {
            buffer.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return (short) i5;
    }

    public static final int commonReadInt(okio.Buffer buffer) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        buffer.setSize$okio(buffer.size() - 4);
        if (i8 == i2) {
            buffer.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i8;
        }
        return i9;
    }

    public static final long commonReadLong(okio.Buffer buffer) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 8) {
            return ((((long) buffer.readInt()) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) << 32) | (androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE & ((long) buffer.readInt()));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40);
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        long j3 = j2 | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24);
        int i8 = i7 + 1;
        long j4 = j3 | ((((long) bArr[i7]) & 255) << 16);
        int i9 = i8 + 1;
        long j5 = j4 | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i9 + 1;
        long j6 = j5 | (((long) bArr[i9]) & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i10 == i2) {
            buffer.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i10;
        }
        return j6;
    }

    public static final byte commonGet(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(buffer.size(), j, 1L);
        okio.Segment segment = buffer.head;
        if (segment == null) {
            okio.Segment segment2 = null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(null);
            byte[] bArr = segment2.data;
            throw null;
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((((long) segment.pos) + j) - size)];
        }
        long j2 = 0;
        while (true) {
            long j3 = ((long) (segment.limit - segment.pos)) + j2;
            if (j3 > j) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((((long) segment.pos) + j) - j2)];
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j2 = j3;
        }
    }

    public static final void commonClear(okio.Buffer buffer) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonSkip(okio.Buffer buffer, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        while (j > 0) {
            okio.Segment segment = buffer.head;
            if (segment == null) {
                throw new java.io.EOFException();
            }
            int iMin = (int) java.lang.Math.min(j, segment.limit - segment.pos);
            long j2 = iMin;
            buffer.setSize$okio(buffer.size() - j2);
            j -= j2;
            segment.pos += iMin;
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            }
        }
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, okio.ByteString byteString, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.size();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, okio.ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static final okio.Buffer commonWriteDecimalLong(okio.Buffer buffer, long j) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i = 2;
                }
            } else if (j < 1000000) {
                i = j < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < androidx.media3.exoplayer.MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US) {
            if (j < okhttp3.internal.connection.RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i = j < androidx.media3.common.C.NANOS_PER_SECOND ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = getHEX_DIGIT_BYTES()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + ((long) i));
        return buffer;
    }

    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        for (int i3 = (segmentWritableSegment$okio.limit + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        segmentWritableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + ((long) i));
        return buffer;
    }

    public static final okio.Segment commonWritableSegment(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(i >= 1 && i <= 8192)) {
            throw new java.lang.IllegalArgumentException("unexpected capacity".toString());
        }
        if (buffer.head == null) {
            okio.Segment segmentTake = okio.SegmentPool.take();
            buffer.head = segmentTake;
            segmentTake.prev = segmentTake;
            segmentTake.next = segmentTake;
            return segmentTake;
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment segment2 = segment.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(okio.SegmentPool.take()) : segment2;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return buffer.write(source, 0, source.length);
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] source, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        okio.SegmentedByteString.checkOffsetAndCount(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = java.lang.Math.min(i3 - i, 8192 - segmentWritableSegment$okio.limit);
            int i4 = i + iMin;
            kotlin.collections.ArraysKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i, i4);
            segmentWritableSegment$okio.limit += iMin;
            i = i4;
        }
        buffer.setSize$okio(buffer.size() + j);
        return buffer;
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (buffer.size() < j) {
            throw new java.io.EOFException();
        }
        byte[] bArr = new byte[(int) j];
        buffer.readFully(bArr);
        return bArr;
    }

    public static final int commonRead(okio.Buffer buffer, byte[] sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final void commonReadFully(okio.Buffer buffer, byte[] sink) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i2 = buffer.read(sink, i, sink.length - i);
            if (i2 == -1) {
                throw new java.io.EOFException();
            }
            i += i2;
        }
    }

    public static final int commonRead(okio.Buffer buffer, byte[] sink, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        okio.SegmentedByteString.checkOffsetAndCount(sink.length, i, i2);
        okio.Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(i2, segment.limit - segment.pos);
        kotlin.collections.ArraysKt.copyInto(segment.data, sink, i, segment.pos, segment.pos + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final long commonReadDecimalLong(okio.Buffer buffer) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new java.io.EOFException();
        }
        int i = 0;
        boolean z = false;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            okio.Segment segment = buffer.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            int i3 = segment.limit;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < OVERFLOW_ZONE || (j == OVERFLOW_ZONE && i4 < j2)) {
                        okio.Buffer bufferWriteByte = new okio.Buffer().writeDecimalLong(j).writeByte((int) b);
                        if (!z) {
                            bufferWriteByte.readByte();
                        }
                        throw new java.lang.NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                buffer.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            } else {
                segment.pos = i2;
            }
            if (z2) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - ((long) i));
        if (i >= (z ? 2 : 1)) {
            return z ? j : -j;
        }
        if (buffer.size() == 0) {
            throw new java.io.EOFException();
        }
        throw new java.lang.NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + okio.SegmentedByteString.toHexString(buffer.getByte(0L)));
    }

    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer buffer) throws java.io.EOFException {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new java.io.EOFException();
        }
        int i3 = 0;
        boolean z = false;
        long j = 0;
        do {
            okio.Segment segment = buffer.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i4 = segment.pos;
            int i5 = segment.limit;
            while (i4 < i5) {
                byte b = bArr[i4];
                if (b < 48 || b > 57) {
                    if (b >= 97 && b <= 102) {
                        i = b - 97;
                    } else {
                        if (b < 65 || b > 70) {
                            if (i3 == 0) {
                                throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + okio.SegmentedByteString.toHexString(b));
                            }
                            z = true;
                            break;
                        }
                        i = b - 65;
                    }
                    i2 = i + 10;
                } else {
                    i2 = b - 48;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new java.lang.NumberFormatException("Number too large: " + new okio.Buffer().writeHexadecimalUnsignedLong(j).writeByte((int) b).readUtf8());
                }
                j = (j << 4) | ((long) i2);
                i4++;
                i3++;
            }
            if (i4 == i5) {
                buffer.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            } else {
                segment.pos = i4;
            }
            if (z) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - ((long) i3));
        return j;
    }

    public static final okio.ByteString commonReadByteString(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    public static final okio.ByteString commonReadByteString(okio.Buffer buffer, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (buffer.size() < j) {
            throw new java.io.EOFException();
        }
        if (j >= 4096) {
            okio.ByteString byteStringSnapshot = buffer.snapshot((int) j);
            buffer.skip(j);
            return byteStringSnapshot;
        }
        return new okio.ByteString(buffer.readByteArray(j));
    }

    public static final int commonSelect(okio.Buffer buffer, okio.Options options) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonReadFully(okio.Buffer buffer, okio.Buffer sink, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (buffer.size() < j) {
            sink.write(buffer, buffer.size());
            throw new java.io.EOFException();
        }
        sink.write(buffer, j);
    }

    public static final long commonReadAll(okio.Buffer buffer, okio.Sink sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final java.lang.String commonReadUtf8(okio.Buffer buffer, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (buffer.size() < j) {
            throw new java.io.EOFException();
        }
        if (j == 0) {
            return "";
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        if (((long) segment.pos) + j > segment.limit) {
            return okio.internal._Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j), 0, 0, 3, null);
        }
        int i = (int) j;
        java.lang.String strCommonToUtf8String = okio.internal._Utf8Kt.commonToUtf8String(segment.data, segment.pos, segment.pos + i);
        segment.pos += i;
        buffer.setSize$okio(buffer.size() - j);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final java.lang.String commonReadUtf8Line(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    public static final java.lang.String commonReadUtf8LineStrict(okio.Buffer buffer, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(j >= 0)) {
            throw new java.lang.IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j2);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j2 < buffer.size() && buffer.getByte(j2 - 1) == 13 && buffer.getByte(j2) == 10) {
            return readUtf8Line(buffer, j2);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, java.lang.Math.min(32, buffer.size()));
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(buffer.size(), j) + " content=" + buffer2.readByteString().hex() + kotlin.text.Typography.ellipsis);
    }

    public static final int commonReadUtf8CodePoint(okio.Buffer buffer) throws java.io.EOFException {
        int i;
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new java.io.EOFException();
        }
        byte b = buffer.getByte(0L);
        boolean z = false;
        if ((b & 128) == 0) {
            i = b & 127;
            i3 = 0;
            i2 = 1;
        } else if ((b & 224) == 192) {
            i = b & 31;
            i2 = 2;
            i3 = 128;
        } else if ((b & 240) == 224) {
            i = b & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b & 248) != 240) {
                buffer.skip(1L);
                return okio.Utf8.REPLACEMENT_CODE_POINT;
            }
            i = b & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (buffer.size() < j) {
            throw new java.io.EOFException("size < " + i2 + ": " + buffer.size() + " (to read code point prefixed 0x" + okio.SegmentedByteString.toHexString(b) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte b2 = buffer.getByte(j2);
            if ((b2 & 192) != 128) {
                buffer.skip(j2);
                return okio.Utf8.REPLACEMENT_CODE_POINT;
            }
            i = (i << 6) | (b2 & okio.Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j);
        if (i > 1114111) {
            return okio.Utf8.REPLACEMENT_CODE_POINT;
        }
        if (55296 <= i && i < 57344) {
            z = true;
        }
        return (!z && i >= i3) ? i : okio.Utf8.REPLACEMENT_CODE_POINT;
    }

    public static final okio.Buffer commonWriteUtf8(okio.Buffer buffer, java.lang.String string, int i, int i2) {
        char cCharAt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        if (!(i >= 0)) {
            throw new java.lang.IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (!(i2 >= i)) {
            throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= string.length())) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i3 = segmentWritableSegment$okio.limit - i;
                int iMin = java.lang.Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = (i3 + i) - segmentWritableSegment$okio.limit;
                segmentWritableSegment$okio.limit += i5;
                buffer.setSize$okio(buffer.size() + ((long) i5));
            } else {
                if (cCharAt2 < 2048) {
                    okio.Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit] = (byte) ((cCharAt2 >> 6) | 192);
                    segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit += 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    okio.Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit] = (byte) ((cCharAt2 >> '\f') | 224);
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit += 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i6 = i + 1;
                    char cCharAt3 = i6 < i2 ? string.charAt(i6) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i7 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            okio.Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit] = (byte) ((i7 >> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 1] = (byte) (((i7 >> 12) & 63) | 128);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 2] = (byte) (((i7 >> 6) & 63) | 128);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 3] = (byte) ((i7 & 63) | 128);
                            segmentWritableSegment$okio4.limit += 4;
                            buffer.setSize$okio(buffer.size() + 4);
                            i += 2;
                        }
                    }
                    buffer.writeByte(63);
                    i = i6;
                }
                i++;
            }
        }
        return buffer;
    }

    public static final okio.Buffer commonWriteUtf8CodePoint(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i < 128) {
            buffer.writeByte(i);
        } else if (i < 2048) {
            okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            segmentWritableSegment$okio.data[segmentWritableSegment$okio.limit] = (byte) ((i >> 6) | 192);
            segmentWritableSegment$okio.data[segmentWritableSegment$okio.limit + 1] = (byte) ((i & 63) | 128);
            segmentWritableSegment$okio.limit += 2;
            buffer.setSize$okio(buffer.size() + 2);
        } else {
            boolean z = false;
            if (55296 <= i && i < 57344) {
                z = true;
            }
            if (z) {
                buffer.writeByte(63);
            } else if (i < 65536) {
                okio.Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
                segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit] = (byte) ((i >> 12) | 224);
                segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 1] = (byte) (((i >> 6) & 63) | 128);
                segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 2] = (byte) ((i & 63) | 128);
                segmentWritableSegment$okio2.limit += 3;
                buffer.setSize$okio(buffer.size() + 3);
            } else if (i <= 1114111) {
                okio.Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit] = (byte) ((i >> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 1] = (byte) (((i >> 12) & 63) | 128);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 2] = (byte) (((i >> 6) & 63) | 128);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 3] = (byte) ((i & 63) | 128);
                segmentWritableSegment$okio3.limit += 4;
                buffer.setSize$okio(buffer.size() + 4);
            } else {
                throw new java.lang.IllegalArgumentException("Unexpected code point: 0x" + okio.SegmentedByteString.toHexString(i));
            }
        }
        return buffer;
    }

    public static final long commonWriteAll(okio.Buffer buffer, okio.Source source) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j2 = source.read(buffer, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, okio.Source source, long j) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        while (j > 0) {
            long j2 = source.read(buffer, j);
            if (j2 == -1) {
                throw new java.io.EOFException();
            }
            j -= j2;
        }
        return buffer;
    }

    public static final okio.Buffer commonWriteByte(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    public static final okio.Buffer commonWriteShort(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i3 + 1;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    public static final okio.Buffer commonWriteInt(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i5 + 1;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final okio.Buffer commonWriteLong(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        segmentWritableSegment$okio.limit = i8 + 1;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final void commonWrite(okio.Buffer buffer, okio.Buffer source, long j) {
        okio.Segment segment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!(source != buffer)) {
            throw new java.lang.IllegalArgumentException("source == this".toString());
        }
        okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j);
        while (j > 0) {
            okio.Segment segment2 = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            int i = segment2.limit;
            okio.Segment segment3 = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
            if (j < i - segment3.pos) {
                if (buffer.head != null) {
                    okio.Segment segment4 = buffer.head;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment4);
                    segment = segment4.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((((long) segment.limit) + j) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                        okio.Segment segment5 = source.head;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment5);
                        segment5.writeTo(segment, (int) j);
                        source.setSize$okio(source.size() - j);
                        buffer.setSize$okio(buffer.size() + j);
                        return;
                    }
                }
                okio.Segment segment6 = source.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment6);
                source.head = segment6.split((int) j);
            }
            okio.Segment segment7 = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment7);
            long j2 = segment7.limit - segment7.pos;
            source.head = segment7.pop();
            if (buffer.head == null) {
                buffer.head = segment7;
                segment7.prev = segment7;
                segment7.next = segment7.prev;
            } else {
                okio.Segment segment8 = buffer.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment8);
                okio.Segment segment9 = segment8.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment9);
                segment9.push(segment7).compact();
            }
            source.setSize$okio(source.size() - j2);
            buffer.setSize$okio(buffer.size() + j2);
            j -= j2;
        }
    }

    public static final long commonRead(okio.Buffer buffer, okio.Buffer sink, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j > buffer.size()) {
            j = buffer.size();
        }
        sink.write(buffer, j);
        return j;
    }

    public static final long commonIndexOf(okio.Buffer buffer, byte b, long j, long j2) {
        okio.Segment segment;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (!z) {
            throw new java.lang.IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > buffer.size()) {
            j2 = buffer.size();
        }
        if (j == j2 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                return -1L;
            }
            while (size < j2) {
                byte[] bArr = segment.data;
                int iMin = (int) java.lang.Math.min(segment.limit, (((long) segment.pos) + j2) - size);
                i = (int) ((((long) segment.pos) + j) - size);
                while (i < iMin) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j = size;
            }
            return -1L;
        }
        while (true) {
            long j3 = ((long) (segment.limit - segment.pos)) + size;
            if (j3 > j) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            size = j3;
        }
        if (segment == null) {
            return -1L;
        }
        while (size < j2) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) java.lang.Math.min(segment.limit, (((long) segment.pos) + j2) - size);
            i = (int) ((((long) segment.pos) + j) - size);
            while (i < iMin2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j = size;
        }
        return -1L;
        return ((long) (i - segment.pos)) + size;
    }

    public static final long commonIndexOf(okio.Buffer buffer, okio.ByteString bytes, long j) {
        long j2 = j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new java.lang.IllegalArgumentException("bytes is empty".toString());
        }
        long j3 = 0;
        if (!(j2 >= 0)) {
            throw new java.lang.IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        okio.Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j2 < j2) {
            long size = buffer.size();
            while (size > j2) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                return -1L;
            }
            byte[] bArrInternalArray$okio = bytes.internalArray$okio();
            byte b = bArrInternalArray$okio[0];
            int size2 = bytes.size();
            long size3 = (buffer.size() - ((long) size2)) + 1;
            while (size < size3) {
                byte[] bArr = segment.data;
                int iMin = (int) java.lang.Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                for (int i = (int) ((((long) segment.pos) + j2) - size); i < iMin; i++) {
                    if (bArr[i] == b && rangeEquals(segment, i + 1, bArrInternalArray$okio, 1, size2)) {
                        return ((long) (i - segment.pos)) + size;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j2 = size;
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (segment.limit - segment.pos)) + j3;
            if (j4 > j2) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j3 = j4;
        }
        if (segment == null) {
            return -1L;
        }
        byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
        byte b2 = bArrInternalArray$okio2[0];
        int size4 = bytes.size();
        long size5 = (buffer.size() - ((long) size4)) + 1;
        while (j3 < size5) {
            byte[] bArr2 = segment.data;
            long j5 = j3;
            int iMin2 = (int) java.lang.Math.min(segment.limit, (((long) segment.pos) + size5) - j3);
            for (int i2 = (int) ((((long) segment.pos) + j2) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b2 && rangeEquals(segment, i2 + 1, bArrInternalArray$okio2, 1, size4)) {
                    return ((long) (i2 - segment.pos)) + j5;
                }
            }
            j3 = j5 + ((long) (segment.limit - segment.pos));
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j2 = j3;
        }
        return -1L;
    }

    public static final boolean commonRangeEquals(okio.Buffer buffer, long j, okio.ByteString bytes, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || buffer.size() - j < i2 || bytes.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (buffer.getByte(((long) i3) + j) != bytes.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean commonEquals(okio.Buffer buffer, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof okio.Buffer)) {
            return false;
        }
        okio.Buffer buffer2 = (okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment segment2 = buffer2.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        int i = segment.pos;
        int i2 = segment2.pos;
        long j = 0;
        while (j < buffer.size()) {
            long jMin = java.lang.Math.min(segment.limit - i, segment2.limit - i2);
            long j2 = 0;
            while (j2 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (segment.data[i] != segment2.data[i2]) {
                    return false;
                }
                j2++;
                i = i3;
                i2 = i4;
            }
            if (i == segment.limit) {
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                i = segment.pos;
            }
            if (i2 == segment2.limit) {
                segment2 = segment2.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                i2 = segment2.pos;
            }
            j += jMin;
        }
        return true;
    }

    public static final int commonHashCode(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        } while (segment != buffer.head);
        return i;
    }

    public static final okio.Buffer commonCopy(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = buffer2.head;
        segmentSharedCopy.next = segmentSharedCopy.prev;
        for (okio.Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            okio.Segment segment3 = segmentSharedCopy.prev;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    public static final okio.ByteString commonSnapshot(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(buffer.size() <= 2147483647L)) {
            throw new java.lang.IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
        }
        return buffer.snapshot((int) buffer.size());
    }

    public static final okio.ByteString commonSnapshot(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i == 0) {
            return okio.ByteString.EMPTY;
        }
        okio.SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i);
        okio.Segment segment = buffer.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            if (segment.limit == segment.pos) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i3 += segment.limit - segment.pos;
            i4++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        okio.Segment segment2 = buffer.head;
        int i5 = 0;
        while (i2 < i) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            bArr[i5] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i5] = java.lang.Math.min(i2, i);
            iArr[bArr.length + i5] = segment2.pos;
            segment2.shared = true;
            i5++;
            segment2 = segment2.next;
        }
        return new okio.C1871SegmentedByteString(bArr, iArr);
    }

    public static final okio.Buffer.UnsafeCursor commonReadUnsafe(okio.Buffer buffer, okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        okio.Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (!(unsafeCursorResolveDefaultParameter.buffer == null)) {
            throw new java.lang.IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final okio.Buffer.UnsafeCursor commonReadAndWriteUnsafe(okio.Buffer buffer, okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        okio.Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (!(unsafeCursorResolveDefaultParameter.buffer == null)) {
            throw new java.lang.IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final int commonNext(okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        long j = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        kotlin.jvm.internal.Intrinsics.checkNotNull(buffer);
        if (j != buffer.size()) {
            return unsafeCursor.seek(unsafeCursor.offset == -1 ? 0L : unsafeCursor.offset + ((long) (unsafeCursor.end - unsafeCursor.start)));
        }
        throw new java.lang.IllegalStateException("no more bytes".toString());
    }

    public static final int commonSeek(okio.Buffer.UnsafeCursor unsafeCursor, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        if (j < -1 || j > buffer.size()) {
            throw new java.lang.ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + buffer.size());
        }
        if (j == -1 || j == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        okio.Segment segmentPush = buffer.head;
        okio.Segment segment = buffer.head;
        long j2 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j3 = unsafeCursor.offset;
            int i = unsafeCursor.start;
            okio.Segment segment2 = unsafeCursor.getSegment();
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            long j4 = j3 - ((long) (i - segment2.pos));
            if (j4 > j) {
                segment = unsafeCursor.getSegment();
                size = j4;
            } else {
                segmentPush = unsafeCursor.getSegment();
                j2 = j4;
            }
        }
        if (size - j > j - j2) {
            while (true) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segmentPush);
                if (j < ((long) (segmentPush.limit - segmentPush.pos)) + j2) {
                    break;
                }
                j2 += (long) (segmentPush.limit - segmentPush.pos);
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            j2 = size;
            segmentPush = segment;
        }
        if (unsafeCursor.readWrite) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segmentPush);
            if (segmentPush.shared) {
                okio.Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                okio.Segment segment3 = segmentPush.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                segment3.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segmentPush);
        unsafeCursor.data = segmentPush.data;
        unsafeCursor.start = segmentPush.pos + ((int) (j - j2));
        unsafeCursor.end = segmentPush.limit;
        return unsafeCursor.end - unsafeCursor.start;
    }

    public static final long commonResizeBuffer(okio.Buffer.UnsafeCursor unsafeCursor, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new java.lang.IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        int i = 1;
        if (j <= size) {
            if (!(j >= 0)) {
                throw new java.lang.IllegalArgumentException(("newSize < 0: " + j).toString());
            }
            long j2 = size - j;
            while (j2 > 0) {
                okio.Segment segment = buffer.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                okio.Segment segment2 = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                long j3 = segment2.limit - segment2.pos;
                if (j3 <= j2) {
                    buffer.head = segment2.pop();
                    okio.SegmentPool.recycle(segment2);
                    j2 -= j3;
                } else {
                    segment2.limit -= (int) j2;
                    break;
                }
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j > size) {
            long j4 = j - size;
            boolean z = true;
            while (j4 > 0) {
                okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
                int iMin = (int) java.lang.Math.min(j4, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j4 -= (long) iMin;
                if (z) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    unsafeCursor.start = segmentWritableSegment$okio.limit - iMin;
                    unsafeCursor.end = segmentWritableSegment$okio.limit;
                    z = false;
                }
                i = 1;
            }
        }
        buffer.setSize$okio(j);
        return size;
    }

    public static final long commonExpandBuffer(okio.Buffer.UnsafeCursor unsafeCursor, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (!(i > 0)) {
            throw new java.lang.IllegalArgumentException(("minByteCount <= 0: " + i).toString());
        }
        if (!(i <= 8192)) {
            throw new java.lang.IllegalArgumentException(("minByteCount > Segment.SIZE: " + i).toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new java.lang.IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        int i2 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j = i2;
        buffer.setSize$okio(size + j);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i2;
        unsafeCursor.end = 8192;
        return j;
    }

    public static final void commonClose(okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (!(unsafeCursor.buffer != null)) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonIndexOfElement(okio.Buffer buffer, okio.ByteString targetBytes, long j) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (!(j >= 0)) {
            throw new java.lang.IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        okio.Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                return -1L;
            }
            if (targetBytes.size() == 2) {
                byte b = targetBytes.getByte(0);
                byte b2 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i = (int) ((((long) segment.pos) + j) - size);
                    int i3 = segment.limit;
                    while (true) {
                        if (i < i3) {
                            byte b3 = bArr[i];
                            if (b3 == b || b3 == b2) {
                                i2 = segment.pos;
                            } else {
                                i++;
                            }
                        } else {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                            j = size;
                        }
                    }
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((((long) segment.pos) + j) - size);
                    int i4 = segment.limit;
                    while (true) {
                        if (i < i4) {
                            byte b4 = bArr2[i];
                            int length = bArrInternalArray$okio.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= length) {
                                    i++;
                                } else if (b4 == bArrInternalArray$okio[i5]) {
                                    i2 = segment.pos;
                                } else {
                                    i5++;
                                }
                            }
                        } else {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                            j = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j2 = ((long) (segment.limit - segment.pos)) + size;
            if (j2 > j) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            size = j2;
        }
        if (segment == null) {
            return -1L;
        }
        if (targetBytes.size() == 2) {
            byte b5 = targetBytes.getByte(0);
            byte b6 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i = (int) ((((long) segment.pos) + j) - size);
                int i6 = segment.limit;
                while (true) {
                    if (i < i6) {
                        byte b7 = bArr3[i];
                        if (b7 == b5 || b7 == b6) {
                            i2 = segment.pos;
                        } else {
                            i++;
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                        j = size;
                    }
                }
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i = (int) ((((long) segment.pos) + j) - size);
                int i7 = segment.limit;
                while (true) {
                    if (i < i7) {
                        byte b8 = bArr4[i];
                        int length2 = bArrInternalArray$okio2.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length2) {
                                i++;
                            } else if (b8 == bArrInternalArray$okio2[i8]) {
                                i2 = segment.pos;
                            } else {
                                i8++;
                            }
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                        j = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + size;
    }
}

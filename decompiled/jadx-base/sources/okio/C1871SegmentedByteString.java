package okio;

/* JADX INFO: renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\r\u0010 \u001a\u00020\u0015H\u0010¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\u001d\u0010$\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0001H\u0010¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0015H\u0016J\r\u0010)\u001a\u00020\u0004H\u0010¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0015H\u0010¢\u0006\u0002\b.J\u0018\u0010/\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0015H\u0016J(\u00100\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J(\u00100\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u000204H\u0016J\u0018\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0015H\u0016J\b\u00108\u001a\u00020\u0001H\u0016J\b\u00109\u001a\u00020\u0001H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0001H\u0002J\b\u0010<\u001a\u00020\u0010H\u0016J\u0010\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020?H\u0016J%\u0010=\u001a\u00020\u00132\u0006\u0010@\u001a\u00020A2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0010¢\u0006\u0002\bBJ\b\u0010C\u001a\u00020DH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006E"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "segments", "", "", "directory", "", "([[B[I)V", "getDirectory$okio", "()[I", "getSegments$okio", "()[[B", "[[B", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "", "base64Url", "copyInto", "", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "targetOffset", "byteCount", "digest", "algorithm", "digest$okio", "equals", "", "other", "", "getSize", "getSize$okio", "hashCode", "hex", "hmac", com.ironsource.y8.h.W, "hmac$okio", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", "", "pos", "internalGet$okio", "lastIndexOf", "rangeEquals", "otherOffset", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, com.json.zb.M, "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toByteString", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$okio", "writeReplace", "Ljava/lang/Object;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class C1871SegmentedByteString extends okio.ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX INFO: renamed from: getSegments$okio, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }

    /* JADX INFO: renamed from: getDirectory$okio, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1871SegmentedByteString(byte[][] segments, int[] directory) {
        super(okio.ByteString.EMPTY.getData());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segments, "segments");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    @Override // okio.ByteString
    public java.lang.String string(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    public java.lang.String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    public java.lang.String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    public okio.ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    public okio.ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    public okio.ByteString digest$okio(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory()[length + i];
            int i4 = getDirectory()[i];
            messageDigest.update(getSegments()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bArrDigest);
        return new okio.ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public okio.ByteString hmac$okio(java.lang.String algorithm, okio.ByteString key) throws java.security.NoSuchAlgorithmException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(algorithm);
            mac.init(new javax.crypto.spec.SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = getDirectory()[length + i];
                int i4 = getDirectory()[i];
                mac.update(getSegments()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] bArrDoFinal = mac.doFinal();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new okio.ByteString(bArrDoFinal);
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // okio.ByteString
    public java.lang.String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    public java.nio.ByteBuffer asByteBuffer() {
        java.nio.ByteBuffer byteBufferAsReadOnlyBuffer = java.nio.ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // okio.ByteString
    public int indexOf(byte[] other, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return toByteString().indexOf(other, fromIndex);
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] other, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return toByteString().lastIndexOf(other, fromIndex);
    }

    private final okio.ByteString toByteString() {
        return new okio.ByteString(toByteArray());
    }

    @Override // okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public java.lang.String toString() {
        return toByteString().toString();
    }

    private final java.lang.Object writeReplace() {
        okio.ByteString byteString = toByteString();
        kotlin.jvm.internal.Intrinsics.checkNotNull(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // okio.ByteString
    public okio.ByteString substring(int beginIndex, int endIndex) {
        okio.C1871SegmentedByteString c1871SegmentedByteString = this;
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c1871SegmentedByteString, endIndex);
        if (!(beginIndex >= 0)) {
            throw new java.lang.IllegalArgumentException(("beginIndex=" + beginIndex + " < 0").toString());
        }
        if (!(iResolveDefaultParameter <= size())) {
            throw new java.lang.IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + size() + ')').toString());
        }
        int i = iResolveDefaultParameter - beginIndex;
        if (!(i >= 0)) {
            throw new java.lang.IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + beginIndex).toString());
        }
        if (beginIndex == 0 && iResolveDefaultParameter == size()) {
            return c1871SegmentedByteString;
        }
        if (beginIndex == iResolveDefaultParameter) {
            return okio.ByteString.EMPTY;
        }
        int iSegment = okio.internal.SegmentedByteString.segment(this, beginIndex);
        int iSegment2 = okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) kotlin.collections.ArraysKt.copyOfRange(getSegments(), iSegment, iSegment2 + 1);
        byte[][] bArr2 = bArr;
        int[] iArr = new int[bArr2.length * 2];
        if (iSegment <= iSegment2) {
            int i2 = iSegment;
            int i3 = 0;
            while (true) {
                iArr[i3] = java.lang.Math.min(getDirectory()[i2] - beginIndex, i);
                int i4 = i3 + 1;
                iArr[i3 + bArr2.length] = getDirectory()[getSegments().length + i2];
                if (i2 == iSegment2) {
                    break;
                }
                i2++;
                i3 = i4;
            }
        }
        int i5 = iSegment != 0 ? getDirectory()[iSegment - 1] : 0;
        int length = bArr2.length;
        iArr[length] = iArr[length] + (beginIndex - i5);
        return new okio.C1871SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int pos) {
        okio.SegmentedByteString.checkOffsetAndCount(getDirectory()[getSegments().length - 1], pos, 1L);
        int iSegment = okio.internal.SegmentedByteString.segment(this, pos);
        return getSegments()[iSegment][(pos - (iSegment == 0 ? 0 : getDirectory()[iSegment - 1])) + getDirectory()[getSegments().length + iSegment]];
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory()[length + i];
            int i5 = getDirectory()[i];
            int i6 = i5 - i2;
            kotlin.collections.ArraysKt.copyInto(getSegments()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public void write(java.io.OutputStream out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        int length = getSegments().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory()[length + i];
            int i4 = getDirectory()[i];
            out.write(getSegments()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // okio.ByteString
    public void write$okio(okio.Buffer buffer, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i = offset + byteCount;
        int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i) {
            int i2 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i3 = getDirectory()[iSegment] - i2;
            int i4 = getDirectory()[getSegments().length + iSegment];
            int iMin = java.lang.Math.min(i, i3 + i2) - offset;
            int i5 = i4 + (offset - i2);
            okio.Segment segment = new okio.Segment(getSegments()[iSegment], i5, i5 + iMin, true, false);
            if (buffer.head == null) {
                segment.prev = segment;
                segment.next = segment.prev;
                buffer.head = segment.next;
            } else {
                okio.Segment segment2 = buffer.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                okio.Segment segment3 = segment2.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                segment3.push(segment);
            }
            offset += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) byteCount));
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int offset, okio.ByteString other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (offset < 0 || offset > size() - byteCount) {
            return false;
        }
        int i = byteCount + offset;
        int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i) {
            int i2 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i3 = getDirectory()[iSegment] - i2;
            int i4 = getDirectory()[getSegments().length + iSegment];
            int iMin = java.lang.Math.min(i, i3 + i2) - offset;
            if (!other.rangeEquals(otherOffset, getSegments()[iSegment], i4 + (offset - i2), iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int offset, byte[] other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (offset < 0 || offset > size() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i = byteCount + offset;
        int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i) {
            int i2 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i3 = getDirectory()[iSegment] - i2;
            int i4 = getDirectory()[getSegments().length + iSegment];
            int iMin = java.lang.Math.min(i, i3 + i2) - offset;
            if (!okio.SegmentedByteString.arrayRangeEquals(getSegments()[iSegment], i4 + (offset - i2), other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public void copyInto(int offset, byte[] target, int targetOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        long j = byteCount;
        okio.SegmentedByteString.checkOffsetAndCount(size(), offset, j);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, targetOffset, j);
        int i = byteCount + offset;
        int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i) {
            int i2 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i3 = getDirectory()[iSegment] - i2;
            int i4 = getDirectory()[getSegments().length + iSegment];
            int iMin = java.lang.Math.min(i, i3 + i2) - offset;
            int i5 = i4 + (offset - i2);
            kotlin.collections.ArraysKt.copyInto(getSegments()[iSegment], target, targetOffset, i5, i5 + iMin);
            targetOffset += iMin;
            offset += iMin;
            iSegment++;
        }
    }

    @Override // okio.ByteString
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof okio.ByteString) {
            okio.ByteString byteString = (okio.ByteString) other;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory()[length + i];
            int i5 = getDirectory()[i];
            byte[] bArr = getSegments()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        setHashCode$okio(i2);
        return i2;
    }
}

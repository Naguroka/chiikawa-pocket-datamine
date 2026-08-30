package okio.internal;

/* JADX INFO: renamed from: okio.internal.-ByteString, reason: invalid class name */
/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0080\b\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\r\u0010\u0011\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0080\b\u001a-\u0010\u0016\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u000f\u0010\u001c\u001a\u0004\u0018\u00010\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\tH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0080\b\u001a\u0017\u0010\"\u001a\u00020 *\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010#H\u0080\b\u001a\u0015\u0010$\u001a\u00020%*\u00020\f2\u0006\u0010&\u001a\u00020\u0007H\u0080\b\u001a\r\u0010'\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010(\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010)\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u001d\u0010*\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\r\u0010,\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\tH\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\fH\u0080\b\u001a\u001d\u00102\u001a\u00020\f*\u00020\f2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0080\b\u001a\r\u00105\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00106\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00107\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u00108\u001a\u00020\f*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010:\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a$\u0010;\u001a\u00020\u0017*\u00020\f2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006>"}, d2 = {"HEX_DIGIT_CHARS", "", "getHEX_DIGIT_CHARS$annotations", "()V", "getHEX_DIGIT_CHARS", "()[C", "codePointIndexToCharIndex", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "", "codePointCount", "commonOf", "Lokio/ByteString;", "data", "decodeHexDigit", "c", "", "commonBase64", "", "commonBase64Url", "commonCompareTo", "other", "commonCopyInto", "", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "targetOffset", "byteCount", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", "", "suffix", "commonEquals", "", "commonGetByte", "", "pos", "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", "otherOffset", "commonStartsWith", "prefix", "commonSubstring", "beginIndex", "endIndex", "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToByteString", "commonToString", "commonUtf8", "commonWrite", "buffer", "Lokio/Buffer;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }

    public static final java.lang.String commonUtf8(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        java.lang.String utf8 = byteString.getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        java.lang.String utf8String = okio._JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final java.lang.String commonBase64(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        return okio.Base64.encodeBase64$default(byteString.getData(), null, 1, null);
    }

    public static final java.lang.String commonBase64Url(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        return okio.Base64.encodeBase64(byteString.getData(), okio.Base64.getBASE64_URL_SAFE());
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final java.lang.String commonHex(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        char[] cArr = new char[byteString.getData().length * 2];
        int i = 0;
        for (byte b : byteString.getData()) {
            int i2 = i + 1;
            cArr[i] = getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = getHEX_DIGIT_CHARS()[b & 15];
        }
        return kotlin.text.StringsKt.concatToString(cArr);
    }

    public static final okio.ByteString commonToAsciiLowercase(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        for (int i = 0; i < byteString.getData().length; i++) {
            byte b = byteString.getData()[i];
            if (b >= 65 && b <= 90) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = java.util.Arrays.copyOf(data, data.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final okio.ByteString commonToAsciiUppercase(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        for (int i = 0; i < byteString.getData().length; i++) {
            byte b = byteString.getData()[i];
            if (b >= 97 && b <= 122) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = java.util.Arrays.copyOf(data, data.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArrCopyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final okio.ByteString commonSubstring(okio.ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(byteString, i2);
        if (!(i >= 0)) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0".toString());
        }
        if (!(iResolveDefaultParameter <= byteString.getData().length)) {
            throw new java.lang.IllegalArgumentException(("endIndex > length(" + byteString.getData().length + ')').toString());
        }
        if (iResolveDefaultParameter - i >= 0) {
            return (i == 0 && iResolveDefaultParameter == byteString.getData().length) ? byteString : new okio.ByteString(kotlin.collections.ArraysKt.copyOfRange(byteString.getData(), i, iResolveDefaultParameter));
        }
        throw new java.lang.IllegalArgumentException("endIndex < beginIndex".toString());
    }

    public static final byte commonGetByte(okio.ByteString byteString, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData()[i];
    }

    public static final int commonGetSize(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData().length;
    }

    public static final byte[] commonToByteArray(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        byte[] data = byteString.getData();
        byte[] bArrCopyOf = java.util.Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public static final byte[] commonInternalArray(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData();
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i, okio.ByteString other, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return other.rangeEquals(i2, byteString.getData(), i, i3);
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i, byte[] other, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return i >= 0 && i <= byteString.getData().length - i3 && i2 >= 0 && i2 <= other.length - i3 && okio.SegmentedByteString.arrayRangeEquals(byteString.getData(), i, other, i2, i3);
    }

    public static final void commonCopyInto(okio.ByteString byteString, int i, byte[] target, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        kotlin.collections.ArraysKt.copyInto(byteString.getData(), target, i2, i, i3 + i);
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, okio.ByteString prefix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, byte[] prefix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, okio.ByteString suffix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, byte[] suffix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonIndexOf(okio.ByteString byteString, byte[] other, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int length = byteString.getData().length - other.length;
        int iMax = java.lang.Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!okio.SegmentedByteString.arrayRangeEquals(byteString.getData(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, okio.ByteString other, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i);
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, byte[] other, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = java.lang.Math.min(okio.SegmentedByteString.resolveDefaultParameter(byteString, i), byteString.getData().length - other.length); -1 < iMin; iMin--) {
            if (okio.SegmentedByteString.arrayRangeEquals(byteString.getData(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final boolean commonEquals(okio.ByteString byteString, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString2 = (okio.ByteString) obj;
            if (byteString2.size() == byteString.getData().length && byteString2.rangeEquals(0, byteString.getData(), 0, byteString.getData().length)) {
                return true;
            }
        }
        return false;
    }

    public static final int commonHashCode(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        int hashCode = byteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = java.util.Arrays.hashCode(byteString.getData());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public static final int commonCompareTo(okio.ByteString byteString, okio.ByteString other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int iMin = java.lang.Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int i2 = byteString.getByte(i) & 255;
            int i3 = other.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final okio.ByteString commonOf(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrCopyOf = java.util.Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return new okio.ByteString(bArrCopyOf);
    }

    public static final okio.ByteString commonToByteString(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(bArr, i2);
        okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i, iResolveDefaultParameter);
        return new okio.ByteString(kotlin.collections.ArraysKt.copyOfRange(bArr, i, iResolveDefaultParameter + i));
    }

    public static final okio.ByteString commonEncodeUtf8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        okio.ByteString byteString = new okio.ByteString(okio._JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final okio.ByteString commonDecodeBase64(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArrDecodeBase64ToArray = okio.Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    public static final okio.ByteString commonDecodeHex(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(str.length() % 2 == 0)) {
            throw new java.lang.IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((decodeHexDigit(str.charAt(i2)) << 4) + decodeHexDigit(str.charAt(i2 + 1)));
        }
        return new okio.ByteString(bArr);
    }

    public static final void commonWrite(okio.ByteString byteString, okio.Buffer buffer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(byteString.getData(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if (!('A' <= c && c < 'G')) {
                throw new java.lang.IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    public static final java.lang.String commonToString(okio.ByteString byteString) {
        okio.ByteString byteString2 = byteString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "<this>");
        if (byteString.getData().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData(), 64);
        if (iCodePointIndexToCharIndex == -1) {
            if (byteString.getData().length <= 64) {
                return "[hex=" + byteString.hex() + ']';
            }
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("[size=").append(byteString.getData().length).append(" hex=");
            int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(byteString2, 64);
            if (!(iResolveDefaultParameter <= byteString.getData().length)) {
                throw new java.lang.IllegalArgumentException(("endIndex > length(" + byteString.getData().length + ')').toString());
            }
            if (!(iResolveDefaultParameter + 0 >= 0)) {
                throw new java.lang.IllegalArgumentException("endIndex < beginIndex".toString());
            }
            if (iResolveDefaultParameter != byteString.getData().length) {
                byteString2 = new okio.ByteString(kotlin.collections.ArraysKt.copyOfRange(byteString.getData(), 0, iResolveDefaultParameter));
            }
            return sbAppend.append(byteString2.hex()).append("…]").toString();
        }
        java.lang.String strUtf8 = byteString.utf8();
        java.lang.String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        java.lang.String strReplace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(strSubstring, "\\", "\\\\", false, 4, (java.lang.Object) null), "\n", "\\n", false, 4, (java.lang.Object) null), "\r", "\\r", false, 4, (java.lang.Object) null);
        if (iCodePointIndexToCharIndex < strUtf8.length()) {
            return "[size=" + byteString.getData().length + " text=" + strReplace$default + "…]";
        }
        return "[text=" + strReplace$default + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x00db  */
    /* JADX WARN: Code duplicated, block: B:103:0x00df  */
    /* JADX WARN: Code duplicated, block: B:104:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:162:0x0163  */
    /* JADX WARN: Code duplicated, block: B:164:0x0167  */
    /* JADX WARN: Code duplicated, block: B:167:0x016d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0171  */
    /* JADX WARN: Code duplicated, block: B:170:0x0174  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:241:0x020e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0212  */
    /* JADX WARN: Code duplicated, block: B:246:0x0218  */
    /* JADX WARN: Code duplicated, block: B:248:0x021c  */
    /* JADX WARN: Code duplicated, block: B:249:0x021f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007b  */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0084  */
    /* JADX WARN: Code duplicated, block: B:58:0x0087  */
    /* JADX WARN: Code duplicated, block: B:97:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00d8 A[DONT_INVERT] */
    public static final int codePointIndexToCharIndex(byte[] bArr, int i) {
        byte b;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                int i10 = i9 + 1;
                if (i9 == i) {
                    return i8;
                }
                if (b2 != 10 && b2 != 13) {
                    if (b2 >= 0 && b2 < 32) {
                        z2 = true;
                    } else {
                        if (127 <= b2 && b2 < 160) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                    }
                    return -1;
                }
                if (b2 == 65533) {
                    return -1;
                }
                i8 += b2 < 65536 ? 1 : 2;
                i7++;
                while (true) {
                    i9 = i10;
                    if (i7 >= length || (b = bArr[i7]) < 0) {
                        break;
                    }
                    i7++;
                    i10 = i9 + 1;
                    if (i9 == i) {
                        return i8;
                    }
                    if (b != 10 && b != 13) {
                        if (b >= 0 && b < 32) {
                            z = true;
                        } else {
                            if (127 <= b && b < 160) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (!z) {
                            if (b == 65533) {
                                if (b < 65536) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                i8 += i2;
                            }
                        }
                    } else if (b == 65533) {
                        if (b < 65536) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        i8 += i2;
                    }
                    return -1;
                }
            }
            if ((b2 >> 5) == -2) {
                int i11 = i7 + 1;
                if (length <= i11) {
                    if (i9 == i) {
                        return i8;
                    }
                    return -1;
                }
                byte b3 = bArr[i11];
                if (!((b3 & 192) == 128)) {
                    if (i9 == i) {
                        return i8;
                    }
                    return -1;
                }
                int i12 = (b3 ^ 3968) ^ (b2 << 6);
                if (i12 < 128) {
                    if (i9 == i) {
                        return i8;
                    }
                    return -1;
                }
                i3 = i9 + 1;
                if (i9 == i) {
                    return i8;
                }
                if (i12 != 10 && i12 != 13) {
                    if (i12 >= 0 && i12 < 32) {
                        z5 = true;
                    } else {
                        if (127 <= i12 && i12 < 160) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    if (!z5) {
                        if (i12 == 65533) {
                            if (i12 < 65536) {
                                i6 = 1;
                            } else {
                                i6 = 2;
                            }
                            i8 += i6;
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            i7 += 2;
                        }
                    }
                } else if (i12 == 65533) {
                    if (i12 < 65536) {
                        i6 = 1;
                    } else {
                        i6 = 2;
                    }
                    i8 += i6;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    i7 += 2;
                }
                return -1;
            }
            if ((b2 >> 4) == -2) {
                int i13 = i7 + 2;
                if (length <= i13) {
                    if (i9 == i) {
                        return i8;
                    }
                    return -1;
                }
                byte b4 = bArr[i7 + 1];
                if (!((b4 & 192) == 128)) {
                    if (i9 == i) {
                        return i8;
                    }
                    return -1;
                }
                byte b5 = bArr[i13];
                if (!((b5 & 192) == 128)) {
                    if (i9 == i) {
                        return i8;
                    }
                    return -1;
                }
                int i14 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                if (i14 < 2048) {
                    if (i9 == i) {
                        return i8;
                    }
                    return -1;
                }
                if (55296 <= i14 && i14 < 57344) {
                    if (i9 == i) {
                        return i8;
                    }
                    return -1;
                }
                i3 = i9 + 1;
                if (i9 == i) {
                    return i8;
                }
                if (i14 != 10 && i14 != 13) {
                    if (i14 >= 0 && i14 < 32) {
                        z4 = true;
                    } else {
                        if (127 <= i14 && i14 < 160) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    if (!z4) {
                        if (i14 == 65533) {
                            if (i14 < 65536) {
                                i5 = 1;
                            } else {
                                i5 = 2;
                            }
                            i8 += i5;
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            i7 += 3;
                        }
                    }
                } else if (i14 == 65533) {
                    if (i14 < 65536) {
                        i5 = 1;
                    } else {
                        i5 = 2;
                    }
                    i8 += i5;
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                    i7 += 3;
                }
                return -1;
            }
            if ((b2 >> 3) != -2) {
                if (i9 == i) {
                    return i8;
                }
                return -1;
            }
            int i15 = i7 + 3;
            if (length <= i15) {
                if (i9 == i) {
                    return i8;
                }
                return -1;
            }
            byte b6 = bArr[i7 + 1];
            if (!((b6 & 192) == 128)) {
                if (i9 == i) {
                    return i8;
                }
                return -1;
            }
            byte b7 = bArr[i7 + 2];
            if (!((b7 & 192) == 128)) {
                if (i9 == i) {
                    return i8;
                }
                return -1;
            }
            byte b8 = bArr[i15];
            if (!((b8 & 192) == 128)) {
                if (i9 == i) {
                    return i8;
                }
                return -1;
            }
            int i16 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
            if (i16 > 1114111) {
                if (i9 == i) {
                    return i8;
                }
                return -1;
            }
            if (55296 <= i16 && i16 < 57344) {
                if (i9 == i) {
                    return i8;
                }
                return -1;
            }
            if (i16 < 65536) {
                if (i9 == i) {
                    return i8;
                }
                return -1;
            }
            i3 = i9 + 1;
            if (i9 == i) {
                return i8;
            }
            if (i16 != 10 && i16 != 13) {
                if (i16 >= 0 && i16 < 32) {
                    z3 = true;
                } else {
                    if (127 <= i16 && i16 < 160) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (!z3) {
                    if (i16 == 65533) {
                        if (i16 < 65536) {
                            i4 = 1;
                        } else {
                            i4 = 2;
                        }
                        i8 += i4;
                        kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                        i7 += 4;
                    }
                }
            } else if (i16 == 65533) {
                if (i16 < 65536) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                i8 += i4;
                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                i7 += 4;
            }
            return -1;
            i9 = i3;
        }
        return i8;
    }
}

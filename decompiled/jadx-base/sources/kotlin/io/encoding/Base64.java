package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 22\u00020\u0001:\u00012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ%\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0013J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J%\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001bJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J0\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J \u0010 \u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\"\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J5\u0010#\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b$J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J=\u0010&\u001a\u0002H'\"\f\b\u0000\u0010'*\u00060(j\u0002`)2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u0002H'2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010*J\"\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J%\u0010,\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b-J(\u0010.\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002J \u00101\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u00063"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "isUrlSafe", "", "isMimeScheme", "(ZZ)V", "isMimeScheme$kotlin_stdlib", "()Z", "isUrlSafe$kotlin_stdlib", "bytesToStringImpl", "", "source", "", "bytesToStringImpl$kotlin_stdlib", "charsToBytesImpl", "", "startIndex", "", "endIndex", "charsToBytesImpl$kotlin_stdlib", "checkDestinationBounds", "", "destinationSize", "destinationOffset", "capacityNeeded", "checkSourceBounds", "sourceSize", "checkSourceBounds$kotlin_stdlib", "decode", "decodeImpl", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "decodeIntoByteArray", "decodeSize", "encode", "encodeIntoByteArray", "encodeIntoByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeSize", "encodeToAppendable", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "encodeToByteArray", "encodeToByteArrayImpl", "encodeToByteArrayImpl$kotlin_stdlib", "handlePaddingSymbol", "padIndex", "byteStart", "skipIllegalSymbolsIfMime", androidx.webkit.Profile.DEFAULT_PROFILE_NAME, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class Base64 {
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int mimeGroupsPerLine = 19;
    public static final int mimeLineLength = 76;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;

    /* JADX INFO: renamed from: Default, reason: from kotlin metadata */
    public static final kotlin.io.encoding.Base64.Companion INSTANCE = new kotlin.io.encoding.Base64.Companion(null);
    private static final byte[] mimeLineSeparatorSymbols = {13, 10};
    private static final kotlin.io.encoding.Base64 UrlSafe = new kotlin.io.encoding.Base64(true, false);
    private static final kotlin.io.encoding.Base64 Mime = new kotlin.io.encoding.Base64(false, true);

    public /* synthetic */ Base64(boolean z, boolean z2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    private Base64(boolean z, boolean z2) {
        this.isUrlSafe = z;
        this.isMimeScheme = z2;
        if (!((z && z2) ? false : true)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX INFO: renamed from: isUrlSafe$kotlin_stdlib, reason: from getter */
    public final boolean getIsUrlSafe() {
        return this.isUrlSafe;
    }

    /* JADX INFO: renamed from: isMimeScheme$kotlin_stdlib, reason: from getter */
    public final boolean getIsMimeScheme() {
        return this.isMimeScheme;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(kotlin.io.encoding.Base64 base64, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.encodeToByteArray(bArr, i, i2);
    }

    public final byte[] encodeToByteArray(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(kotlin.io.encoding.Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return base64.encodeIntoByteArray(bArr, bArr2, i5, i6, i3);
    }

    public final int encodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
    }

    public static /* synthetic */ java.lang.String encode$default(kotlin.io.encoding.Base64 base64, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.encode(bArr, i, i2);
    }

    public final java.lang.String encode(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return new java.lang.String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), kotlin.text.Charsets.ISO_8859_1);
    }

    public static /* synthetic */ java.lang.Appendable encodeToAppendable$default(kotlin.io.encoding.Base64 base64, byte[] bArr, java.lang.Appendable appendable, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        return base64.encodeToAppendable(bArr, appendable, i, i2);
    }

    public final <A extends java.lang.Appendable> A encodeToAppendable(byte[] source, A destination, int startIndex, int endIndex) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        destination.append(new java.lang.String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), kotlin.text.Charsets.ISO_8859_1));
        return destination;
    }

    public static /* synthetic */ byte[] decode$default(kotlin.io.encoding.Base64 base64, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.decode(bArr, i, i2);
    }

    public final byte[] decode(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int iDecodeSize = decodeSize(source, startIndex, endIndex);
        byte[] bArr = new byte[iDecodeSize];
        if (decodeImpl(source, bArr, 0, startIndex, endIndex) == iDecodeSize) {
            return bArr;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public static /* synthetic */ int decodeIntoByteArray$default(kotlin.io.encoding.Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return base64.decodeIntoByteArray(bArr, bArr2, i5, i6, i3);
    }

    public final int decodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, decodeSize(source, startIndex, endIndex));
        return decodeImpl(source, destination, destinationOffset, startIndex, endIndex);
    }

    public static /* synthetic */ byte[] decode$default(kotlin.io.encoding.Base64 base64, java.lang.CharSequence charSequence, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return base64.decode(charSequence, i, i2);
    }

    public final byte[] decode(java.lang.CharSequence source, int startIndex, int endIndex) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof java.lang.String) {
            checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
            java.lang.String strSubstring = ((java.lang.String) source).substring(startIndex, endIndex);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            java.nio.charset.Charset charset = kotlin.text.Charsets.ISO_8859_1;
            kotlin.jvm.internal.Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decode$default(this, bArrCharsToBytesImpl$kotlin_stdlib, 0, 0, 6, (java.lang.Object) null);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(kotlin.io.encoding.Base64 base64, java.lang.CharSequence charSequence, byte[] bArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = charSequence.length();
        }
        return base64.decodeIntoByteArray(charSequence, bArr, i5, i6, i3);
    }

    public final int decodeIntoByteArray(java.lang.CharSequence source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        if (source instanceof java.lang.String) {
            checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
            java.lang.String strSubstring = ((java.lang.String) source).substring(startIndex, endIndex);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            java.nio.charset.Charset charset = kotlin.text.Charsets.ISO_8859_1;
            kotlin.jvm.internal.Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decodeIntoByteArray$default(this, bArrCharsToBytesImpl$kotlin_stdlib, destination, destinationOffset, 0, 0, 24, (java.lang.Object) null);
    }

    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        byte[] bArr = new byte[encodeSize(endIndex - startIndex)];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, bArr, 0, startIndex, endIndex);
        return bArr;
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, encodeSize(endIndex - startIndex));
        byte[] bArr = this.isUrlSafe ? kotlin.io.encoding.Base64Kt.base64UrlEncodeMap : kotlin.io.encoding.Base64Kt.base64EncodeMap;
        int i = this.isMimeScheme ? 19 : Integer.MAX_VALUE;
        int i2 = destinationOffset;
        while (true) {
            if (startIndex + 2 >= endIndex) {
                break;
            }
            int iMin = java.lang.Math.min((endIndex - startIndex) / 3, i);
            int i3 = 0;
            while (i3 < iMin) {
                int i4 = startIndex + 1;
                int i5 = i4 + 1;
                int i6 = ((source[startIndex] & 255) << 16) | ((source[i4] & 255) << 8) | (source[i5] & 255);
                int i7 = i2 + 1;
                destination[i2] = bArr[i6 >>> 18];
                int i8 = i7 + 1;
                destination[i7] = bArr[(i6 >>> 12) & 63];
                int i9 = i8 + 1;
                destination[i8] = bArr[(i6 >>> 6) & 63];
                i2 = i9 + 1;
                destination[i9] = bArr[i6 & 63];
                i3++;
                startIndex = i5 + 1;
            }
            if (iMin == i && startIndex != endIndex) {
                int i10 = i2 + 1;
                byte[] bArr2 = mimeLineSeparatorSymbols;
                destination[i2] = bArr2[0];
                i2 = i10 + 1;
                destination[i10] = bArr2[1];
            }
        }
        int i11 = endIndex - startIndex;
        if (i11 == 1) {
            int i12 = startIndex + 1;
            int i13 = (source[startIndex] & 255) << 4;
            int i14 = i2 + 1;
            destination[i2] = bArr[i13 >>> 6];
            int i15 = i14 + 1;
            destination[i14] = bArr[i13 & 63];
            int i16 = i15 + 1;
            destination[i15] = padSymbol;
            i2 = i16 + 1;
            destination[i16] = padSymbol;
            startIndex = i12;
        } else if (i11 == 2) {
            int i17 = startIndex + 1;
            int i18 = i17 + 1;
            int i19 = ((source[i17] & 255) << 2) | ((source[startIndex] & 255) << 10);
            int i20 = i2 + 1;
            destination[i2] = bArr[i19 >>> 12];
            int i21 = i20 + 1;
            destination[i20] = bArr[(i19 >>> 6) & 63];
            int i22 = i21 + 1;
            destination[i21] = bArr[i19 & 63];
            i2 = i22 + 1;
            destination[i22] = padSymbol;
            startIndex = i18;
        }
        if (startIndex == endIndex) {
            return i2 - destinationOffset;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    private final int encodeSize(int sourceSize) {
        int i = ((sourceSize + 3) - 1) / 3;
        int i2 = (i * 4) + ((this.isMimeScheme ? (i - 1) / 19 : 0) * 2);
        if (i2 >= 0) {
            return i2;
        }
        throw new java.lang.IllegalArgumentException("Input is too big");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[SYNTHETIC] */
    private final int decodeImpl(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i;
        int i2;
        int[] iArr = this.isUrlSafe ? kotlin.io.encoding.Base64Kt.base64UrlDecodeMap : kotlin.io.encoding.Base64Kt.base64DecodeMap;
        int i3 = -8;
        int i4 = destinationOffset;
        int i5 = -8;
        int i6 = 0;
        int iHandlePaddingSymbol = startIndex;
        while (iHandlePaddingSymbol < endIndex) {
            if (i5 == i3 && iHandlePaddingSymbol + 3 < endIndex) {
                int i7 = iHandlePaddingSymbol + 1;
                int i8 = iArr[source[iHandlePaddingSymbol] & 255];
                int i9 = i7 + 1;
                int i10 = iArr[source[i7] & 255];
                int i11 = i9 + 1;
                int i12 = iArr[source[i9] & 255];
                int i13 = i11 + 1;
                int i14 = (i12 << 6) | (i8 << 18) | (i10 << 12) | iArr[source[i11] & 255];
                if (i14 >= 0) {
                    int i15 = i4 + 1;
                    destination[i4] = (byte) (i14 >> 16);
                    int i16 = i15 + 1;
                    destination[i15] = (byte) (i14 >> 8);
                    destination[i16] = (byte) i14;
                    i4 = i16 + 1;
                    iHandlePaddingSymbol = i13;
                } else {
                    iHandlePaddingSymbol = i13 - 4;
                    i = source[iHandlePaddingSymbol] & 255;
                    i2 = iArr[i];
                    if (i2 < 0) {
                        iHandlePaddingSymbol++;
                        i6 = (i6 << 6) | i2;
                        i5 += 6;
                        if (i5 >= 0) {
                            destination[i4] = (byte) (i6 >>> i5);
                            i6 &= (1 << i5) - 1;
                            i5 -= 8;
                            i4++;
                        }
                    } else {
                        if (i2 == -2) {
                            iHandlePaddingSymbol = handlePaddingSymbol(source, iHandlePaddingSymbol, endIndex, i5);
                            break;
                        }
                        if (this.isMimeScheme) {
                            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Invalid symbol '").append((char) i).append("'(");
                            java.lang.String string = java.lang.Integer.toString(i, kotlin.text.CharsKt.checkRadix(8));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            throw new java.lang.IllegalArgumentException(sbAppend.append(string).append(") at index ").append(iHandlePaddingSymbol).toString());
                        }
                        iHandlePaddingSymbol++;
                    }
                }
            } else {
                i = source[iHandlePaddingSymbol] & 255;
                i2 = iArr[i];
                if (i2 < 0) {
                    iHandlePaddingSymbol++;
                    i6 = (i6 << 6) | i2;
                    i5 += 6;
                    if (i5 >= 0) {
                        destination[i4] = (byte) (i6 >>> i5);
                        i6 &= (1 << i5) - 1;
                        i5 -= 8;
                        i4++;
                    }
                } else {
                    if (i2 == -2) {
                        iHandlePaddingSymbol = handlePaddingSymbol(source, iHandlePaddingSymbol, endIndex, i5);
                        break;
                    }
                    if (this.isMimeScheme) {
                        java.lang.StringBuilder sbAppend2 = new java.lang.StringBuilder("Invalid symbol '").append((char) i).append("'(");
                        java.lang.String string2 = java.lang.Integer.toString(i, kotlin.text.CharsKt.checkRadix(8));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        throw new java.lang.IllegalArgumentException(sbAppend2.append(string2).append(") at index ").append(iHandlePaddingSymbol).toString());
                    }
                    iHandlePaddingSymbol++;
                }
            }
            i3 = -8;
        }
        if (i5 == -2) {
            throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
        }
        int iSkipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(source, iHandlePaddingSymbol, endIndex);
        if (iSkipIllegalSymbolsIfMime >= endIndex) {
            return i4 - destinationOffset;
        }
        int i17 = source[iSkipIllegalSymbolsIfMime] & 255;
        java.lang.StringBuilder sbAppend3 = new java.lang.StringBuilder("Symbol '").append((char) i17).append("'(");
        java.lang.String string3 = java.lang.Integer.toString(i17, kotlin.text.CharsKt.checkRadix(8));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        throw new java.lang.IllegalArgumentException(sbAppend3.append(string3).append(") at index ").append(iSkipIllegalSymbolsIfMime - 1).append(" is prohibited after the pad character").toString());
    }

    private final int decodeSize(byte[] source, int startIndex, int endIndex) {
        int i = endIndex - startIndex;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            throw new java.lang.IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + startIndex + ", endIndex: " + endIndex);
        }
        if (this.isMimeScheme) {
            while (startIndex < endIndex) {
                int i2 = kotlin.io.encoding.Base64Kt.base64DecodeMap[source[startIndex] & 255];
                if (i2 < 0) {
                    if (i2 == -2) {
                        i -= endIndex - startIndex;
                        break;
                    }
                    i--;
                }
                startIndex++;
            }
        } else if (source[endIndex - 1] == 61) {
            i--;
            if (source[endIndex - 2] == 61) {
                i--;
            }
        }
        return (int) ((((long) i) * ((long) 6)) / ((long) 8));
    }

    public final byte[] charsToBytesImpl$kotlin_stdlib(java.lang.CharSequence source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
        byte[] bArr = new byte[endIndex - startIndex];
        int i = 0;
        while (startIndex < endIndex) {
            char cCharAt = source.charAt(startIndex);
            if (cCharAt <= 255) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else {
                bArr[i] = okio.Utf8.REPLACEMENT_BYTE;
                i++;
            }
            startIndex++;
        }
        return bArr;
    }

    public final java.lang.String bytesToStringImpl$kotlin_stdlib(byte[] source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(source.length);
        for (byte b : source) {
            sb.append((char) b);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final int handlePaddingSymbol(byte[] source, int padIndex, int endIndex, int byteStart) {
        if (byteStart == -8) {
            throw new java.lang.IllegalArgumentException("Redundant pad character at index " + padIndex);
        }
        if (byteStart != -6) {
            if (byteStart == -4) {
                padIndex = skipIllegalSymbolsIfMime(source, padIndex + 1, endIndex);
                if (padIndex == endIndex || source[padIndex] != 61) {
                    throw new java.lang.IllegalArgumentException("Missing one pad character at index " + padIndex);
                }
            } else if (byteStart != -2) {
                throw new java.lang.IllegalStateException("Unreachable".toString());
            }
        }
        return padIndex + 1;
    }

    private final int skipIllegalSymbolsIfMime(byte[] source, int startIndex, int endIndex) {
        if (!this.isMimeScheme) {
            return startIndex;
        }
        while (startIndex < endIndex) {
            if (kotlin.io.encoding.Base64Kt.base64DecodeMap[source[startIndex] & 255] != -1) {
                return startIndex;
            }
            startIndex++;
        }
        return startIndex;
    }

    public final void checkSourceBounds$kotlin_stdlib(int sourceSize, int startIndex, int endIndex) {
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize);
    }

    private final void checkDestinationBounds(int destinationSize, int destinationOffset, int capacityNeeded) {
        if (destinationOffset < 0 || destinationOffset > destinationSize) {
            throw new java.lang.IndexOutOfBoundsException("destination offset: " + destinationOffset + ", destination size: " + destinationSize);
        }
        int i = destinationOffset + capacityNeeded;
        if (i < 0 || i > destinationSize) {
            throw new java.lang.IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + destinationOffset + ", destination size: " + destinationSize + ", capacity needed: " + capacityNeeded);
        }
    }

    /* JADX INFO: renamed from: kotlin.io.encoding.Base64$Default, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Base64.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "()V", "Mime", "getMime", "()Lkotlin/io/encoding/Base64;", "UrlSafe", "getUrlSafe", "bitsPerByte", "", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "mimeLineSeparatorSymbols", "", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "padSymbol", "", "symbolsPerGroup", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion extends kotlin.io.encoding.Base64 {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Companion() {
            boolean z = false;
            super(z, z, null);
        }

        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return kotlin.io.encoding.Base64.mimeLineSeparatorSymbols;
        }

        public final kotlin.io.encoding.Base64 getUrlSafe() {
            return kotlin.io.encoding.Base64.UrlSafe;
        }

        public final kotlin.io.encoding.Base64 getMime() {
            return kotlin.io.encoding.Base64.Mime;
        }
    }
}

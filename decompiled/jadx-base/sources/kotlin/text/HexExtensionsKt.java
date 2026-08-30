package kotlin.text;

/* JADX INFO: compiled from: HexExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a@\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000\u001a@\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000\u001a \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u001a,\u0010\u0016\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\u001a,\u0010\u001b\u001a\u00020\u001c*\u00020\u00032\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a\u001c\u0010!\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0002\u001a\u0014\u0010\"\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tH\u0002\u001a*\u0010#\u001a\u00020$*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010#\u001a\u00020$*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010'\u001a\u00020(*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010'\u001a\u00020(*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010)\u001a\u00020\t*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010)\u001a\u00020\t*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010*\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010*\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a0\u0010+\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\tH\u0003\u001a*\u0010,\u001a\u00020-*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010,\u001a\u00020-*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020$2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010.\u001a\u00020\u0003*\u00020(2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020(2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020-2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u001c\u0010/\u001a\u00020\u0003*\u00020\u00062\u0006\u0010%\u001a\u00020&2\u0006\u00100\u001a\u00020\tH\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"HEX_DIGITS_TO_DECIMAL", "", "LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "charsPerSet", "", "charsPerElement", "elementsPerSet", "", "elementSeparatorLength", "formattedStringLength", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "parsedByteArrayMaxSize", "stringLength", "wholeElementsPerSet", "checkContainsAt", "part", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "endIndex", "partName", "checkHexLength", "", "startIndex", "maxDigits", "requireMaxLength", "", "checkNewLineAt", "decimalFromHexDigitAt", "hexToByte", "", "format", "Lkotlin/text/HexFormat;", "hexToByteArray", "", "hexToInt", "hexToLong", "hexToLongImpl", "hexToShort", "", "toHexString", "toHexStringImpl", "bits", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HexExtensionsKt {
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final java.lang.String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final java.lang.String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
        int[] iArr = new int[128];
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            iArr[i2] = -1;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < str.length()) {
            iArr[str.charAt(i3)] = i4;
            i3++;
            i4++;
        }
        int i5 = 0;
        while (i < str.length()) {
            iArr[str.charAt(i)] = i5;
            i++;
            i5++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr;
    }

    public static final java.lang.String toHexString(byte[] bArr, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] bArr, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] bArr, int i, int i2, kotlin.text.HexFormat hexFormat, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, i, i2, hexFormat);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[SYNTHETIC] */
    public static final java.lang.String toHexString(byte[] bArr, int i, int i2, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, bArr.length);
        if (i == i2) {
            return "";
        }
        java.lang.String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        kotlin.text.HexFormat.BytesHexFormat bytes = format.getBytes();
        int bytesPerLine = bytes.getBytesPerLine();
        int bytesPerGroup = bytes.getBytesPerGroup();
        java.lang.String bytePrefix = bytes.getBytePrefix();
        java.lang.String byteSuffix = bytes.getByteSuffix();
        java.lang.String byteSeparator = bytes.getByteSeparator();
        java.lang.String groupSeparator = bytes.getGroupSeparator();
        int i3 = formattedStringLength(i2 - i, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i3);
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < i2; i6++) {
            int i7 = bArr[i6] & 255;
            if (i4 == bytesPerLine) {
                sb.append('\n');
                i4 = 0;
            } else {
                if (i5 == bytesPerGroup) {
                    sb.append(groupSeparator);
                }
                if (i5 != 0) {
                    sb.append(byteSeparator);
                }
                sb.append(bytePrefix);
                sb.append(str.charAt(i7 >> 4));
                sb.append(str.charAt(i7 & 15));
                sb.append(byteSuffix);
                i5++;
                i4++;
            }
            i5 = 0;
            if (i5 != 0) {
                sb.append(byteSeparator);
            }
            sb.append(bytePrefix);
            sb.append(str.charAt(i7 >> 4));
            sb.append(str.charAt(i7 & 15));
            sb.append(byteSuffix);
            i5++;
            i4++;
        }
        if (i3 == sb.length()) {
            java.lang.String string = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public static final int formattedStringLength(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (!(i > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i8 = i - 1;
        int i9 = i8 / i2;
        int i10 = (i2 - 1) / i3;
        int i11 = i % i2;
        if (i11 != 0) {
            i2 = i11;
        }
        int i12 = (i10 * i9) + ((i2 - 1) / i3);
        long j = ((long) i9) + (((long) i12) * ((long) i4)) + (((long) ((i8 - i9) - i12)) * ((long) i5)) + (((long) i) * (((long) i6) + 2 + ((long) i7)));
        if (kotlin.ranges.RangesKt.intRangeContains((kotlin.ranges.ClosedRange<java.lang.Integer>) new kotlin.ranges.IntRange(0, Integer.MAX_VALUE), j)) {
            return (int) j;
        }
        throw new java.lang.IllegalArgumentException("The resulting string length is too big: " + ((java.lang.Object) kotlin.ULong.m1522toStringimpl(kotlin.ULong.m1476constructorimpl(j))));
    }

    public static final byte[] hexToByteArray(java.lang.String str, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    static /* synthetic */ byte[] hexToByteArray$default(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, i, i2, hexFormat);
    }

    private static final byte[] hexToByteArray(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat) {
        int iCheckContainsAt = i;
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(iCheckContainsAt, i2, str.length());
        if (iCheckContainsAt == i2) {
            return new byte[0];
        }
        kotlin.text.HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        int bytesPerLine = bytes.getBytesPerLine();
        int bytesPerGroup = bytes.getBytesPerGroup();
        java.lang.String bytePrefix = bytes.getBytePrefix();
        java.lang.String byteSuffix = bytes.getByteSuffix();
        java.lang.String byteSeparator = bytes.getByteSeparator();
        java.lang.String groupSeparator = bytes.getGroupSeparator();
        java.lang.String str2 = byteSeparator;
        int i3 = parsedByteArrayMaxSize(i2 - iCheckContainsAt, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] bArr = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (iCheckContainsAt < i2) {
            if (i5 == bytesPerLine) {
                iCheckContainsAt = checkNewLineAt(str, iCheckContainsAt, i2);
                i5 = 0;
            } else {
                if (i6 == bytesPerGroup) {
                    iCheckContainsAt = checkContainsAt(str, groupSeparator, iCheckContainsAt, i2, "group separator");
                } else if (i6 != 0) {
                    iCheckContainsAt = checkContainsAt(str, str2, iCheckContainsAt, i2, "byte separator");
                }
                i5++;
                i6++;
                int iCheckContainsAt2 = checkContainsAt(str, bytePrefix, iCheckContainsAt, i2, "byte prefix");
                checkHexLength(str, iCheckContainsAt2, kotlin.ranges.RangesKt.coerceAtMost(iCheckContainsAt2 + 2, i2), 2, true);
                int i7 = iCheckContainsAt2 + 1;
                bArr[i4] = (byte) ((decimalFromHexDigitAt(str, iCheckContainsAt2) << 4) | decimalFromHexDigitAt(str, i7));
                iCheckContainsAt = checkContainsAt(str, byteSuffix, i7 + 1, i2, "byte suffix");
                i4++;
                str2 = str2;
            }
            i6 = 0;
            i5++;
            i6++;
            int iCheckContainsAt3 = checkContainsAt(str, bytePrefix, iCheckContainsAt, i2, "byte prefix");
            checkHexLength(str, iCheckContainsAt3, kotlin.ranges.RangesKt.coerceAtMost(iCheckContainsAt3 + 2, i2), 2, true);
            int i8 = iCheckContainsAt3 + 1;
            bArr[i4] = (byte) ((decimalFromHexDigitAt(str, iCheckContainsAt3) << 4) | decimalFromHexDigitAt(str, i8));
            iCheckContainsAt = checkContainsAt(str, byteSuffix, i8 + 1, i2, "byte suffix");
            i4++;
            str2 = str2;
        }
        if (i4 == i3) {
            return bArr;
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final int parsedByteArrayMaxSize(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jCharsPerSet;
        if (!(i > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        long j = ((long) i6) + 2 + ((long) i7);
        long jCharsPerSet2 = charsPerSet(j, i3, i5);
        if (i2 <= i3) {
            jCharsPerSet = charsPerSet(j, i2, i5);
        } else {
            jCharsPerSet = charsPerSet(jCharsPerSet2, i2 / i3, i4);
            int i8 = i2 % i3;
            if (i8 != 0) {
                jCharsPerSet = jCharsPerSet + ((long) i4) + charsPerSet(j, i8, i5);
            }
        }
        long j2 = i;
        long jWholeElementsPerSet = wholeElementsPerSet(j2, jCharsPerSet, 1);
        long j3 = j2 - ((jCharsPerSet + 1) * jWholeElementsPerSet);
        long jWholeElementsPerSet2 = wholeElementsPerSet(j3, jCharsPerSet2, i4);
        long j4 = j3 - ((jCharsPerSet2 + ((long) i4)) * jWholeElementsPerSet2);
        long jWholeElementsPerSet3 = wholeElementsPerSet(j4, j, i5);
        return (int) (((long) (j4 - ((j + ((long) i5)) * jWholeElementsPerSet3) > 0 ? 1 : 0)) + (jWholeElementsPerSet * ((long) i2)) + (jWholeElementsPerSet2 * ((long) i3)) + jWholeElementsPerSet3);
    }

    private static final long charsPerSet(long j, int i, int i2) {
        if (!(i > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        long j2 = i;
        return (j * j2) + (((long) i2) * (j2 - 1));
    }

    private static final long wholeElementsPerSet(long j, long j2, int i) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }

    private static final int checkNewLineAt(java.lang.String str, int i, int i2) {
        if (str.charAt(i) == '\r') {
            int i3 = i + 1;
            return (i3 >= i2 || str.charAt(i3) != '\n') ? i3 : i + 2;
        }
        if (str.charAt(i) == '\n') {
            return i + 1;
        }
        throw new java.lang.NumberFormatException("Expected a new line at index " + i + ", but was " + str.charAt(i));
    }

    public static final java.lang.String toHexString(byte b, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(b, format, 8);
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte b, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(b, hexFormat);
    }

    public static final byte hexToByte(java.lang.String str, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte hexToByte$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    static /* synthetic */ byte hexToByte$default(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, i, i2, hexFormat);
    }

    private static final byte hexToByte(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat) {
        return (byte) hexToLongImpl(str, i, i2, hexFormat, 2);
    }

    public static final java.lang.String toHexString(short s, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(s, format, 16);
    }

    public static /* synthetic */ java.lang.String toHexString$default(short s, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(s, hexFormat);
    }

    public static final short hexToShort(java.lang.String str, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort(str, 0, str.length(), format);
    }

    public static /* synthetic */ short hexToShort$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    static /* synthetic */ short hexToShort$default(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, i, i2, hexFormat);
    }

    private static final short hexToShort(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat) {
        return (short) hexToLongImpl(str, i, i2, hexFormat, 4);
    }

    public static final java.lang.String toHexString(int i, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(i, format, 32);
    }

    public static /* synthetic */ java.lang.String toHexString$default(int i, kotlin.text.HexFormat hexFormat, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(i, hexFormat);
    }

    public static final int hexToInt(java.lang.String str, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt(str, 0, str.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    static /* synthetic */ int hexToInt$default(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, i, i2, hexFormat);
    }

    private static final int hexToInt(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat) {
        return (int) hexToLongImpl(str, i, i2, hexFormat, 8);
    }

    public static final java.lang.String toHexString(long j, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(j, format, 64);
    }

    public static /* synthetic */ java.lang.String toHexString$default(long j, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(j, hexFormat);
    }

    public static final long hexToLong(java.lang.String str, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong(str, 0, str.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    static /* synthetic */ long hexToLong$default(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, i, i2, hexFormat);
    }

    private static final long hexToLong(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat) {
        return hexToLongImpl(str, i, i2, hexFormat, 16);
    }

    private static final java.lang.String toHexStringImpl(long j, kotlin.text.HexFormat hexFormat, int i) {
        if (!((i & 3) == 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        java.lang.String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        java.lang.String prefix = hexFormat.getNumber().getPrefix();
        java.lang.String suffix = hexFormat.getNumber().getSuffix();
        int length = prefix.length() + (i >> 2) + suffix.length();
        boolean removeLeadingZeros = hexFormat.getNumber().getRemoveLeadingZeros();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        sb.append(prefix);
        while (i > 0) {
            i -= 4;
            int i2 = (int) ((j >> i) & 15);
            removeLeadingZeros = removeLeadingZeros && i2 == 0 && i > 0;
            if (!removeLeadingZeros) {
                sb.append(str.charAt(i2));
            }
        }
        sb.append(suffix);
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    static /* synthetic */ long hexToLongImpl$default(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = str.length();
        }
        return hexToLongImpl(str, i, i2, hexFormat, i3);
    }

    private static final long hexToLongImpl(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat, int i3) {
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        java.lang.String prefix = hexFormat.getNumber().getPrefix();
        java.lang.String suffix = hexFormat.getNumber().getSuffix();
        if (prefix.length() + suffix.length() >= i2 - i) {
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Expected a hexadecimal number with prefix \"").append(prefix).append("\" and suffix \"").append(suffix).append("\", but was ");
            kotlin.jvm.internal.Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
            java.lang.String strSubstring = str.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            throw new java.lang.NumberFormatException(sbAppend.append(strSubstring).toString());
        }
        int iCheckContainsAt = checkContainsAt(str, prefix, i, i2, "prefix");
        int length = i2 - suffix.length();
        checkContainsAt(str, suffix, length, i2, "suffix");
        checkHexLength(str, iCheckContainsAt, length, i3, false);
        long jDecimalFromHexDigitAt = 0;
        while (iCheckContainsAt < length) {
            jDecimalFromHexDigitAt = (jDecimalFromHexDigitAt << 4) | ((long) decimalFromHexDigitAt(str, iCheckContainsAt));
            iCheckContainsAt++;
        }
        return jDecimalFromHexDigitAt;
    }

    private static final int checkContainsAt(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3) {
        int length = str2.length() + i;
        if (length <= i2 && kotlin.text.StringsKt.regionMatches(str, i, str2, 0, str2.length(), true)) {
            return length;
        }
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Expected ").append(str3).append(" \"").append(str2).append("\" at index ").append(i).append(", but was ");
        int iCoerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(length, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring = str.substring(i, iCoerceAtMost);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new java.lang.NumberFormatException(sbAppend.append(strSubstring).toString());
    }

    private static final void checkHexLength(java.lang.String str, int i, int i2, int i3, boolean z) {
        int i4 = i2 - i;
        boolean z2 = true;
        if (!z ? i4 > i3 : i4 != i3) {
            z2 = false;
        }
        if (z2) {
            return;
        }
        java.lang.String str2 = z ? "exactly" : "at most";
        kotlin.jvm.internal.Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new java.lang.NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was " + strSubstring + " of length " + i4);
    }

    private static final int decimalFromHexDigitAt(java.lang.String str, int i) {
        int i2;
        char cCharAt = str.charAt(i);
        if (cCharAt > 127 || (i2 = HEX_DIGITS_TO_DECIMAL[cCharAt]) < 0) {
            throw new java.lang.NumberFormatException("Expected a hexadecimal digit at index " + i + ", but was " + str.charAt(i));
        }
        return i2;
    }
}

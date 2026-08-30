package okio.internal;

/* JADX INFO: compiled from: -Utf8.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class _Utf8Kt {
    public static /* synthetic */ java.lang.String commonToUtf8String$default(byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return commonToUtf8String(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        if (((r16[r5] & 192) == 128) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x011c, code lost:
    
        if (((r16[r5] & 192) == 128) == false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String commonToUtf8String(byte[] bArr, int i, int i2) {
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i8 < 0 || i2 > bArr.length || i8 > i2) {
            throw new java.lang.ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i8 + " endIndex=" + i2);
        }
        char[] cArr = new char[i2 - i8];
        int i9 = 0;
        while (i8 < i2) {
            byte b2 = bArr[i8];
            if (b2 >= 0) {
                int i10 = i9 + 1;
                cArr[i9] = (char) b2;
                i8++;
                while (true) {
                    i9 = i10;
                    if (i8 >= i2 || (b = bArr[i8]) < 0) {
                        break;
                    }
                    i8++;
                    i10 = i9 + 1;
                    cArr[i9] = (char) b;
                }
            } else if ((b2 >> 5) == -2) {
                int i11 = i8 + 1;
                if (i2 <= i11) {
                    i3 = i9 + 1;
                    cArr[i9] = (char) okio.Utf8.REPLACEMENT_CODE_POINT;
                } else {
                    byte b3 = bArr[i11];
                    if ((b3 & 192) == 128) {
                        int i12 = (b2 << 6) ^ (b3 ^ 3968);
                        if (i12 < 128) {
                            i3 = i9 + 1;
                            cArr[i9] = (char) okio.Utf8.REPLACEMENT_CODE_POINT;
                        } else {
                            i3 = i9 + 1;
                            cArr[i9] = (char) i12;
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        i9 = i3;
                        i4 = 2;
                        i8 += i4;
                    } else {
                        i3 = i9 + 1;
                        cArr[i9] = (char) okio.Utf8.REPLACEMENT_CODE_POINT;
                    }
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                i9 = i3;
                i4 = 1;
                i8 += i4;
            } else {
                if ((b2 >> 4) == -2) {
                    int i13 = i8 + 2;
                    if (i2 <= i13) {
                        i3 = i9 + 1;
                        cArr[i9] = (char) okio.Utf8.REPLACEMENT_CODE_POINT;
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        int i14 = i8 + 1;
                        if (i2 > i14) {
                        }
                        i9 = i3;
                        i4 = 1;
                    } else {
                        byte b4 = bArr[i8 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i13];
                            if ((b5 & 192) == 128) {
                                int i15 = (b2 << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i15 < 2048) {
                                    i5 = i9 + 1;
                                    cArr[i9] = (char) okio.Utf8.REPLACEMENT_CODE_POINT;
                                } else {
                                    if (55296 <= i15 && i15 < 57344) {
                                        i5 = i9 + 1;
                                        cArr[i9] = (char) okio.Utf8.REPLACEMENT_CODE_POINT;
                                    } else {
                                        i5 = i9 + 1;
                                        cArr[i9] = (char) i15;
                                    }
                                }
                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                i9 = i5;
                            } else {
                                i3 = i9 + 1;
                                cArr[i9] = (char) okio.Utf8.REPLACEMENT_CODE_POINT;
                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                i9 = i3;
                                i4 = 2;
                            }
                        } else {
                            i3 = i9 + 1;
                            cArr[i9] = (char) okio.Utf8.REPLACEMENT_CODE_POINT;
                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                            i9 = i3;
                            i4 = 1;
                        }
                    }
                    i8 += i4;
                } else if ((b2 >> 3) == -2) {
                    int i16 = i8 + 3;
                    if (i2 <= i16) {
                        i7 = i9 + 1;
                        cArr[i9] = okio.Utf8.REPLACEMENT_CHARACTER;
                        kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                        int i17 = i8 + 1;
                        if (i2 > i17) {
                            if ((bArr[i17] & 192) == 128) {
                                int i18 = i8 + 2;
                                if (i2 > i18) {
                                }
                                i9 = i7;
                                i4 = 2;
                            }
                        }
                        i9 = i7;
                        i4 = 1;
                    } else {
                        byte b6 = bArr[i8 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i8 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i16];
                                if ((b8 & 192) == 128) {
                                    int i19 = (b2 << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i19 > 1114111) {
                                        i6 = i9 + 1;
                                        cArr[i9] = okio.Utf8.REPLACEMENT_CHARACTER;
                                    } else {
                                        if ((55296 <= i19 && i19 < 57344) || i19 < 65536 || i19 == 65533) {
                                            i6 = i9 + 1;
                                            cArr[i9] = okio.Utf8.REPLACEMENT_CHARACTER;
                                        } else {
                                            int i20 = i9 + 1;
                                            cArr[i9] = (char) ((i19 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
                                            char c = (char) ((i19 & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
                                            i6 = i20 + 1;
                                            cArr[i20] = c;
                                        }
                                    }
                                    kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                                    i4 = 4;
                                    i9 = i6;
                                } else {
                                    i7 = i9 + 1;
                                    cArr[i9] = okio.Utf8.REPLACEMENT_CHARACTER;
                                    kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                                    i9 = i7;
                                }
                            } else {
                                i7 = i9 + 1;
                                cArr[i9] = okio.Utf8.REPLACEMENT_CHARACTER;
                                kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                                i9 = i7;
                                i4 = 2;
                            }
                        } else {
                            i7 = i9 + 1;
                            cArr[i9] = okio.Utf8.REPLACEMENT_CHARACTER;
                            kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                            i9 = i7;
                            i4 = 1;
                        }
                    }
                    i8 += i4;
                } else {
                    cArr[i9] = okio.Utf8.REPLACEMENT_CHARACTER;
                    i8++;
                    i9++;
                }
                i4 = 3;
                i8 += i4;
            }
        }
        return kotlin.text.StringsKt.concatToString(cArr, 0, i9);
    }

    public static final byte[] commonAsUtf8ToByteArray(java.lang.String str) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 128) >= 0) {
                int length2 = str.length();
                int i4 = i3;
                while (i3 < length2) {
                    char cCharAt2 = str.charAt(i3);
                    if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt2, 128) < 0) {
                        int i5 = i4 + 1;
                        bArr[i4] = (byte) cCharAt2;
                        i3++;
                        while (true) {
                            i4 = i5;
                            if (i3 >= length2 || kotlin.jvm.internal.Intrinsics.compare((int) str.charAt(i3), 128) >= 0) {
                                break;
                            }
                            i5 = i4 + 1;
                            bArr[i4] = (byte) str.charAt(i3);
                            i3++;
                        }
                    } else {
                        if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt2, 2048) < 0) {
                            int i6 = i4 + 1;
                            bArr[i4] = (byte) ((cCharAt2 >> 6) | 192);
                            byte b = (byte) ((cCharAt2 & '?') | 128);
                            i = i6 + 1;
                            bArr[i6] = b;
                        } else {
                            if (55296 <= cCharAt2 && cCharAt2 < 57344) {
                                if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt2, 56319) <= 0 && length2 > (i2 = i3 + 1)) {
                                    char cCharAt3 = str.charAt(i2);
                                    if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                                        int iCharAt = ((cCharAt2 << '\n') + str.charAt(i2)) - 56613888;
                                        int i7 = i4 + 1;
                                        bArr[i4] = (byte) ((iCharAt >> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                                        int i8 = i7 + 1;
                                        bArr[i7] = (byte) (((iCharAt >> 12) & 63) | 128);
                                        int i9 = i8 + 1;
                                        bArr[i8] = (byte) (((iCharAt >> 6) & 63) | 128);
                                        byte b2 = (byte) ((iCharAt & 63) | 128);
                                        i = i9 + 1;
                                        bArr[i9] = b2;
                                        i3 += 2;
                                    }
                                    i4 = i;
                                }
                                i = i4 + 1;
                                bArr[i4] = okio.Utf8.REPLACEMENT_BYTE;
                            } else {
                                int i10 = i4 + 1;
                                bArr[i4] = (byte) ((cCharAt2 >> '\f') | 224);
                                int i11 = i10 + 1;
                                bArr[i10] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                                byte b3 = (byte) ((cCharAt2 & '?') | 128);
                                i = i11 + 1;
                                bArr[i11] = b3;
                            }
                        }
                        i3++;
                        i4 = i;
                    }
                }
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i4);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                return bArrCopyOf;
            }
            bArr[i3] = (byte) cCharAt;
            i3++;
        }
        byte[] bArrCopyOf2 = java.util.Arrays.copyOf(bArr, str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(this, newSize)");
        return bArrCopyOf2;
    }
}

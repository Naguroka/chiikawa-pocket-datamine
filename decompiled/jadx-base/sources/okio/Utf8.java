package okio;

/* JADX INFO: compiled from: Utf8.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", "endIndex", "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i) {
        if (i >= 0 && i < 32) {
            return true;
        }
        return 127 <= i && i < 160;
    }

    public static final boolean isUtf8Continuation(byte b) {
        return (b & 192) == 128;
    }

    public static final long size(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static final long size(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, i, 0, 2, null);
    }

    public static /* synthetic */ long size$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }

    public static final long size(java.lang.String str, int i, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(i >= 0)) {
            throw new java.lang.IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (!(i2 >= i)) {
            throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= str.length())) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        long j = 0;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i3 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i3 = 3;
                } else {
                    int i4 = i + 1;
                    char cCharAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i = i4;
                    } else {
                        j += (long) 4;
                        i += 2;
                    }
                }
                j += (long) i3;
            }
            i++;
        }
        return j;
    }

    public static final void processUtf8Bytes(java.lang.String str, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Byte, kotlin.Unit> yield) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yield, "yield");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 128) < 0) {
                yield.invoke(java.lang.Byte.valueOf((byte) cCharAt));
                i++;
                while (i < i2 && kotlin.jvm.internal.Intrinsics.compare((int) str.charAt(i), 128) < 0) {
                    yield.invoke(java.lang.Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 2048) < 0) {
                    yield.invoke(java.lang.Byte.valueOf((byte) ((cCharAt >> 6) | 192)));
                    yield.invoke(java.lang.Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                } else {
                    boolean z = false;
                    if (!(55296 <= cCharAt && cCharAt < 57344)) {
                        yield.invoke(java.lang.Byte.valueOf((byte) ((cCharAt >> '\f') | 224)));
                        yield.invoke(java.lang.Byte.valueOf((byte) (((cCharAt >> 6) & 63) | 128)));
                        yield.invoke(java.lang.Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                    } else {
                        if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 56319) <= 0 && i2 > (i3 = i + 1)) {
                            char cCharAt2 = str.charAt(i3);
                            if (56320 <= cCharAt2 && cCharAt2 < 57344) {
                                z = true;
                            }
                            if (z) {
                                int iCharAt = ((cCharAt << '\n') + str.charAt(i3)) - 56613888;
                                yield.invoke(java.lang.Byte.valueOf((byte) ((iCharAt >> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK)));
                                yield.invoke(java.lang.Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                                yield.invoke(java.lang.Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                                yield.invoke(java.lang.Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                                i += 2;
                            }
                        }
                        yield.invoke(java.lang.Byte.valueOf(REPLACEMENT_BYTE));
                    }
                }
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    public static final void processUtf8CodePoints(byte[] bArr, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> yield) {
        int i3;
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i;
        while (i4 < i2) {
            byte b = bArr[i4];
            if (b >= 0) {
                yield.invoke(java.lang.Integer.valueOf(b));
                i4++;
                while (i4 < i2) {
                    byte b2 = bArr[i4];
                    if (b2 < 0) {
                        break;
                    }
                    i4++;
                    yield.invoke(java.lang.Integer.valueOf(b2));
                }
            } else {
                boolean z = false;
                if ((b >> 5) == -2) {
                    int i5 = i4 + 1;
                    if (i2 > i5) {
                        byte b3 = bArr[i5];
                        if ((b3 & 192) == 128) {
                            int i6 = (b << 6) ^ (b3 ^ 3968);
                            yield.invoke(i6 < 128 ? java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT) : java.lang.Integer.valueOf(i6));
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            i3 = 2;
                            i4 += i3;
                        }
                    }
                    yield.invoke(java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT));
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    i3 = 1;
                    i4 += i3;
                } else if ((b >> 4) == -2) {
                    int i7 = i4 + 2;
                    if (i2 <= i7) {
                        yield.invoke(java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT));
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        int i8 = i4 + 1;
                        if (i2 > i8) {
                            if ((bArr[i8] & 192) == 128) {
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b4 = bArr[i4 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i7];
                            if ((b5 & 192) == 128) {
                                int i9 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i9 >= 2048) {
                                    if (55296 <= i9 && i9 < 57344) {
                                        z = true;
                                    }
                                    if (z) {
                                        numValueOf = java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT);
                                    } else {
                                        numValueOf = java.lang.Integer.valueOf(i9);
                                    }
                                } else {
                                    numValueOf = java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT);
                                }
                                yield.invoke(numValueOf);
                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                i3 = 3;
                            } else {
                                yield.invoke(java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT));
                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT));
                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                    i4 += i3;
                } else if ((b >> 3) == -2) {
                    int i10 = i4 + 3;
                    if (i2 <= i10) {
                        yield.invoke(java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT));
                        kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                        int i11 = i4 + 1;
                        if (i2 > i11) {
                            if ((bArr[i11] & 192) == 128) {
                                int i12 = i4 + 2;
                                if (i2 > i12) {
                                    if ((bArr[i12] & 192) == 128) {
                                        i3 = 3;
                                    }
                                }
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b6 = bArr[i4 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i4 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i10];
                                if ((b8 & 192) == 128) {
                                    int i13 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i13 <= 1114111) {
                                        if (55296 <= i13 && i13 < 57344) {
                                            z = true;
                                        }
                                        if (!z && i13 >= 65536) {
                                            numValueOf2 = java.lang.Integer.valueOf(i13);
                                        } else {
                                            numValueOf2 = java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT);
                                        }
                                    } else {
                                        numValueOf2 = java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT);
                                    }
                                    yield.invoke(numValueOf2);
                                    kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                                    i3 = 4;
                                } else {
                                    yield.invoke(java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                                    i3 = 3;
                                }
                            } else {
                                yield.invoke(java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT));
                                kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT));
                            kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                    i4 += i3;
                } else {
                    yield.invoke(java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT));
                    i4++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0171  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    public static final void processUtf16Chars(byte[] bArr, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Character, kotlin.Unit> yield) {
        int i3;
        char c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i;
        while (i4 < i2) {
            byte b = bArr[i4];
            if (b >= 0) {
                yield.invoke(java.lang.Character.valueOf((char) b));
                i4++;
                while (i4 < i2) {
                    byte b2 = bArr[i4];
                    if (b2 < 0) {
                        break;
                    }
                    i4++;
                    yield.invoke(java.lang.Character.valueOf((char) b2));
                }
            } else {
                boolean z = false;
                if ((b >> 5) == -2) {
                    int i5 = i4 + 1;
                    if (i2 > i5) {
                        byte b3 = bArr[i5];
                        if ((b3 & 192) == 128) {
                            int i6 = (b << 6) ^ (b3 ^ 3968);
                            yield.invoke(java.lang.Character.valueOf(i6 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i6));
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            i3 = 2;
                            i4 += i3;
                        }
                    }
                    yield.invoke(java.lang.Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    i3 = 1;
                    i4 += i3;
                } else if ((b >> 4) == -2) {
                    int i7 = i4 + 2;
                    if (i2 <= i7) {
                        yield.invoke(java.lang.Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        int i8 = i4 + 1;
                        if (i2 > i8) {
                            if ((bArr[i8] & 192) == 128) {
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b4 = bArr[i4 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i7];
                            if ((b5 & 192) == 128) {
                                int i9 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i9 >= 2048) {
                                    if (55296 <= i9 && i9 < 57344) {
                                        z = true;
                                    }
                                    if (z) {
                                        c = (char) REPLACEMENT_CODE_POINT;
                                    } else {
                                        c = (char) i9;
                                    }
                                } else {
                                    c = (char) REPLACEMENT_CODE_POINT;
                                }
                                yield.invoke(java.lang.Character.valueOf(c));
                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                i3 = 3;
                            } else {
                                yield.invoke(java.lang.Character.valueOf((char) REPLACEMENT_CODE_POINT));
                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(java.lang.Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                    i4 += i3;
                } else if ((b >> 3) == -2) {
                    int i10 = i4 + 3;
                    if (i2 <= i10) {
                        yield.invoke(java.lang.Character.valueOf(REPLACEMENT_CHARACTER));
                        kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                        int i11 = i4 + 1;
                        if (i2 > i11) {
                            if ((bArr[i11] & 192) == 128) {
                                int i12 = i4 + 2;
                                if (i2 > i12) {
                                    if ((bArr[i12] & 192) == 128) {
                                        i3 = 3;
                                    }
                                }
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b6 = bArr[i4 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i4 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i10];
                                if ((b8 & 192) == 128) {
                                    int i13 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i13 <= 1114111) {
                                        if (55296 <= i13 && i13 < 57344) {
                                            z = true;
                                        }
                                        if (z || i13 < 65536 || i13 == 65533) {
                                            yield.invoke(java.lang.Character.valueOf(REPLACEMENT_CHARACTER));
                                        } else {
                                            yield.invoke(java.lang.Character.valueOf((char) ((i13 >>> 10) + HIGH_SURROGATE_HEADER)));
                                            yield.invoke(java.lang.Character.valueOf((char) ((i13 & 1023) + LOG_SURROGATE_HEADER)));
                                        }
                                    } else {
                                        yield.invoke(java.lang.Character.valueOf(REPLACEMENT_CHARACTER));
                                    }
                                    kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                                    i3 = 4;
                                } else {
                                    yield.invoke(java.lang.Character.valueOf(REPLACEMENT_CHARACTER));
                                    kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                                    i3 = 3;
                                }
                            } else {
                                yield.invoke(java.lang.Character.valueOf(REPLACEMENT_CHARACTER));
                                kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(java.lang.Character.valueOf(REPLACEMENT_CHARACTER));
                            kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                    i4 += i3;
                } else {
                    yield.invoke(java.lang.Character.valueOf(REPLACEMENT_CHARACTER));
                    i4++;
                }
            }
        }
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> yield) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yield, "yield");
        int i3 = i + 1;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i3];
        if (!((b2 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i4 = (b2 ^ 3968) ^ (b << 6);
        if (i4 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(java.lang.Integer.valueOf(i4));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> yield) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yield, "yield");
        int i3 = i + 2;
        boolean z = false;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            yield.invoke(numValueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b3 = bArr[i3];
        if (!((b3 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i5 = ((b3 ^ (-123008)) ^ (b2 << 6)) ^ (b << 12);
        if (i5 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 <= i5 && i5 < 57344) {
            z = true;
        }
        if (z) {
            yield.invoke(numValueOf);
            return 3;
        }
        yield.invoke(java.lang.Integer.valueOf(i5));
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> yield) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yield, "yield");
        int i3 = i + 3;
        boolean z = false;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            yield.invoke(numValueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & 192) == 128) {
                    int i5 = i + 2;
                    if (i2 > i5) {
                        if ((bArr[i5] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b3 = bArr[i + 2];
        if (!((b3 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b4 = bArr[i3];
        if (!((b4 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i6 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
        if (i6 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i6 && i6 < 57344) {
            z = true;
        }
        if (z) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i6 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(java.lang.Integer.valueOf(i6));
        return 4;
    }
}

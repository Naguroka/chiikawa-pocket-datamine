package kotlin.text;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0012\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007\u001a\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0011\u0010\u0014\u001a\u00020\u0007*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0014\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0016\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0011\u0010\u0018\u001a\u00020\n*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u0018\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001a\u001a\u000e\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001d\u001a\u0019\u0010\u001c\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001e\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UStringsKt {
    /* JADX INFO: renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final java.lang.String m2615toStringLxnNnR4(byte b, int i) {
        java.lang.String string = java.lang.Integer.toString(b & 255, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: toString-olVBNx4, reason: not valid java name */
    public static final java.lang.String m2617toStringolVBNx4(short s, int i) {
        java.lang.String string = java.lang.Integer.toString(s & kotlin.UShort.MAX_VALUE, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final java.lang.String m2616toStringV7xB4Y4(int i, int i2) {
        java.lang.String string = java.lang.Long.toString(((long) i) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE, kotlin.text.CharsKt.checkRadix(i2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: toString-JSWoG40, reason: not valid java name */
    public static final java.lang.String m2614toStringJSWoG40(long j, int i) {
        return kotlin.UnsignedKt.ulongToString(j, kotlin.text.CharsKt.checkRadix(i));
    }

    public static final byte toUByte(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final byte toUByte(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UByte uByteOrNull = toUByteOrNull(str, i);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final short toUShort(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final short toUShort(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UShort uShortOrNull = toUShortOrNull(str, i);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final int toUInt(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final int toUInt(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final long toULong(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final long toULong(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.ULong uLongOrNull = toULongOrNull(str, i);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlin.UByte toUByteOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    public static final kotlin.UByte toUByteOrNull(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (java.lang.Integer.compare(data ^ Integer.MIN_VALUE, kotlin.UInt.m1397constructorimpl(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return kotlin.UByte.m1313boximpl(kotlin.UByte.m1319constructorimpl((byte) data));
    }

    public static final kotlin.UShort toUShortOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    public static final kotlin.UShort toUShortOrNull(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (java.lang.Integer.compare(data ^ Integer.MIN_VALUE, kotlin.UInt.m1397constructorimpl(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return kotlin.UShort.m1577boximpl(kotlin.UShort.m1583constructorimpl((short) data));
    }

    public static final kotlin.UInt toUIntOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    public static final kotlin.UInt toUIntOrNull(java.lang.String str, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.text.CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int iM1397constructorimpl = kotlin.UInt.m1397constructorimpl(i);
        int iM$1 = 119304647;
        while (i2 < length) {
            int iDigitOf = kotlin.text.CharsKt.digitOf(str.charAt(i2), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (java.lang.Integer.compare(i3 ^ Integer.MIN_VALUE, iM$1 ^ Integer.MIN_VALUE) > 0) {
                if (iM$1 == 119304647) {
                    iM$1 = kotlin.UByte$$ExternalSyntheticBackport0.m$1(-1, iM1397constructorimpl);
                    if (java.lang.Integer.compare(i3 ^ Integer.MIN_VALUE, iM$1 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iM1397constructorimpl2 = kotlin.UInt.m1397constructorimpl(i3 * iM1397constructorimpl);
            int iM1397constructorimpl3 = kotlin.UInt.m1397constructorimpl(kotlin.UInt.m1397constructorimpl(iDigitOf) + iM1397constructorimpl2);
            if (java.lang.Integer.compare(iM1397constructorimpl3 ^ Integer.MIN_VALUE, iM1397constructorimpl2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            i3 = iM1397constructorimpl3;
        }
        return kotlin.UInt.m1391boximpl(i3);
    }

    public static final kotlin.ULong toULongOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    public static final kotlin.ULong toULongOrNull(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.text.CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jM1476constructorimpl = kotlin.ULong.m1476constructorimpl(i);
        long j = 0;
        long jM$1 = 512409557603043100L;
        while (i2 < length) {
            int iDigitOf = kotlin.text.CharsKt.digitOf(str.charAt(i2), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (java.lang.Long.compare(j ^ Long.MIN_VALUE, jM$1 ^ Long.MIN_VALUE) > 0) {
                if (jM$1 == 512409557603043100L) {
                    jM$1 = kotlin.UByte$$ExternalSyntheticBackport0.m$1(-1L, jM1476constructorimpl);
                    if (java.lang.Long.compare(j ^ Long.MIN_VALUE, jM$1 ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jM1476constructorimpl2 = kotlin.ULong.m1476constructorimpl(j * jM1476constructorimpl);
            long jM1476constructorimpl3 = kotlin.ULong.m1476constructorimpl(kotlin.ULong.m1476constructorimpl(((long) kotlin.UInt.m1397constructorimpl(iDigitOf)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) + jM1476constructorimpl2);
            if (java.lang.Long.compare(jM1476constructorimpl3 ^ Long.MIN_VALUE, jM1476constructorimpl2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = jM1476constructorimpl3;
        }
        return kotlin.ULong.m1470boximpl(j);
    }
}

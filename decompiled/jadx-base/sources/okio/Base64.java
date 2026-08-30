package okio;

/* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\nH\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005¨\u0006\r"}, d2 = {"BASE64", "", "getBASE64$annotations", "()V", "getBASE64", "()[B", "BASE64_URL_SAFE", "getBASE64_URL_SAFE$annotations", "getBASE64_URL_SAFE", "decodeBase64ToArray", "", "encodeBase64", "map", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Base64 {
    private static final byte[] BASE64 = okio.ByteString.Companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
    private static final byte[] BASE64_URL_SAFE = okio.ByteString.Companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();

    public static /* synthetic */ void getBASE64$annotations() {
    }

    public static /* synthetic */ void getBASE64_URL_SAFE$annotations() {
    }

    public static final byte[] getBASE64() {
        return BASE64;
    }

    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }

    public static final byte[] decodeBase64ToArray(java.lang.String str) {
        int i;
        char cCharAt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i = cCharAt2 - 'A';
                } else {
                    if ('a' <= cCharAt2 && cCharAt2 < '{') {
                        i = cCharAt2 - 'G';
                    } else {
                        if ('0' <= cCharAt2 && cCharAt2 < ':') {
                            i = cCharAt2 + 4;
                        } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                            i = 62;
                        } else {
                            if (cCharAt2 == '/' || cCharAt2 == '_') {
                                i = 63;
                            } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                                return null;
                            }
                            i3++;
                        }
                    }
                }
                i5 = (i5 << 6) | i;
                i4++;
                if (i4 % 4 == 0) {
                    int i7 = i6 + 1;
                    bArr[i6] = (byte) (i5 >> 16);
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) (i5 >> 8);
                    bArr[i8] = (byte) i5;
                    i6 = i8 + 1;
                }
                i3++;
            } else {
                int i9 = i4 % 4;
                if (i9 == 1) {
                    return null;
                }
                if (i9 == 2) {
                    bArr[i6] = (byte) ((i5 << 12) >> 16);
                    i6++;
                } else if (i9 == 3) {
                    int i10 = i5 << 6;
                    int i11 = i6 + 1;
                    bArr[i6] = (byte) (i10 >> 16);
                    i6 = i11 + 1;
                    bArr[i11] = (byte) (i10 >> 8);
                }
                if (i6 == i2) {
                    return bArr;
                }
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i6);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                return bArrCopyOf;
            }
        }
    }

    public static /* synthetic */ java.lang.String encodeBase64$default(byte[] bArr, byte[] bArr2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    public static final java.lang.String encodeBase64(byte[] bArr, byte[] map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr2[i2] = map[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr2[i6] = map[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr2[i7] = map[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr2[i8] = map[b3 & okio.Utf8.REPLACEMENT_BYTE];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr2[i2] = map[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr2[i9] = map[(b4 & 3) << 4];
            bArr2[i10] = kotlin.io.encoding.Base64.padSymbol;
            bArr2[i10 + 1] = kotlin.io.encoding.Base64.padSymbol;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i11];
            int i12 = i2 + 1;
            bArr2[i2] = map[(b5 & 255) >> 2];
            int i13 = i12 + 1;
            bArr2[i12] = map[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr2[i13] = map[(b6 & 15) << 2];
            bArr2[i13 + 1] = kotlin.io.encoding.Base64.padSymbol;
        }
        return okio._JvmPlatformKt.toUtf8String(bArr2);
    }
}

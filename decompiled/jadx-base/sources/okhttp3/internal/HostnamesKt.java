package okhttp3.internal;

/* JADX INFO: compiled from: hostnames.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", org.jacoco.core.runtime.AgentOptions.ADDRESS, "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HostnamesKt {
    public static final java.lang.String toCanonicalHost(java.lang.String str) {
        java.net.InetAddress inetAddressDecodeIpv6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) ":", false, 2, (java.lang.Object) null)) {
            if (kotlin.text.StringsKt.startsWith$default(str, com.ironsource.y8.i.d, false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.endsWith$default(str, com.ironsource.y8.i.e, false, 2, (java.lang.Object) null)) {
                inetAddressDecodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
            } else {
                inetAddressDecodeIpv6 = decodeIpv6(str, 0, str.length());
            }
            if (inetAddressDecodeIpv6 == null) {
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length == 16) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address, "address");
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return inetAddressDecodeIpv6.getHostAddress();
            }
            throw new java.lang.AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        try {
            java.lang.String ascii = java.net.IDN.toASCII(str);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
            java.util.Locale US = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
            java.lang.String lowerCase = ascii.toLowerCase(US);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if ((lowerCase.length() == 0) || containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    private static final boolean containsInvalidHostnameAsciiCodes(java.lang.String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 31) <= 0 || kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 127) >= 0 || kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6, (java.lang.Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:1: B:30:0x0069->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007b A[EDGE_INSN: B:54:0x007b->B:34:0x007b BREAK  A[LOOP:1: B:30:0x0069->B:33:0x0075], SYNTHETIC] */
    private static final java.net.InetAddress decodeIpv6(java.lang.String str, int i, int i2) {
        int i3;
        int i4;
        int hexDigit;
        byte[] bArr = new byte[16];
        int i5 = i;
        int i6 = -1;
        int i7 = -1;
        int i8 = 0;
        while (i5 < i2) {
            if (i8 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i2 && kotlin.text.StringsKt.startsWith$default(str, "::", i5, false, 4, (java.lang.Object) null)) {
                if (i6 != -1) {
                    return null;
                }
                i8 += 2;
                if (i9 == i2) {
                    i6 = i8;
                    break;
                }
                i7 = i9;
                i6 = i8;
                i5 = i7;
                i3 = 0;
                while (i5 < i2) {
                    hexDigit = okhttp3.internal.Util.parseHexDigit(str.charAt(i5));
                    if (hexDigit != -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + hexDigit;
                    i5++;
                }
                i4 = i5 - i7;
                if (i4 != 0) {
                }
                return null;
            }
            if (i8 != 0) {
                if (!kotlin.text.StringsKt.startsWith$default(str, ":", i5, false, 4, (java.lang.Object) null)) {
                    if (!kotlin.text.StringsKt.startsWith$default(str, ".", i5, false, 4, (java.lang.Object) null) || !decodeIpv4Suffix(str, i7, i2, bArr, i8 - 2)) {
                        return null;
                    }
                    i8 += 2;
                    break;
                }
                i5++;
            }
            i7 = i5;
            i5 = i7;
            i3 = 0;
            while (i5 < i2) {
                hexDigit = okhttp3.internal.Util.parseHexDigit(str.charAt(i5));
                if (hexDigit != -1) {
                    break;
                }
                i3 = (i3 << 4) + hexDigit;
                i5++;
            }
            i4 = i5 - i7;
            if (i4 != 0 || i4 > 4) {
                return null;
            }
            int i10 = i8 + 1;
            bArr[i8] = (byte) ((i3 >>> 8) & 255);
            i8 = i10 + 1;
            bArr[i10] = (byte) (i3 & 255);
        }
        if (i8 != 16) {
            if (i6 == -1) {
                return null;
            }
            int i11 = i8 - i6;
            java.lang.System.arraycopy(bArr, i6, bArr, 16 - i11, i11);
            java.util.Arrays.fill(bArr, i6, (16 - i8) + i6, (byte) 0);
        }
        return java.net.InetAddress.getByAddress(bArr);
    }

    private static final boolean decodeIpv4Suffix(java.lang.String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 48) < 0 || kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    private static final java.lang.String inet6AddressToAscii(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        okio.Buffer buffer = new okio.Buffer();
        while (i2 < bArr.length) {
            if (i2 == i) {
                buffer.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((okhttp3.internal.Util.and(bArr[i2], 255) << 8) | okhttp3.internal.Util.and(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return buffer.readUtf8();
    }
}

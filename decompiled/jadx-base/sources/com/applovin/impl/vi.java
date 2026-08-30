package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f1430a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};
    private static final byte[] b;

    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1431a;

        public int b() {
            return this.f1431a;
        }

        a(int i) {
            this.f1431a = i;
        }

        public static com.applovin.impl.vi.a a(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i == 1) {
                return V2;
            }
            return DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        b = bArr;
        java.lang.System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    public static java.lang.String b(java.lang.String str, long j, com.applovin.impl.vi.a aVar, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        byte[] bArrA;
        if (str2 != null) {
            if (str2.length() >= 86) {
                if (android.text.TextUtils.isEmpty(str) || com.applovin.impl.vi.a.NONE == aVar) {
                    return str;
                }
                if (com.applovin.impl.vi.a.V2 == aVar) {
                    bArrA = a(str, j, true, str2, jVar);
                } else {
                    bArrA = a(str, j, str2, jVar);
                }
                if (bArrA != null) {
                    return new java.lang.String(bArrA);
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException("SDK key is too short");
        }
        throw new java.lang.IllegalArgumentException("No SDK key specified");
    }

    public static com.applovin.impl.vi.a b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c = (char) bArr[0];
            if (c == '2') {
                return com.applovin.impl.vi.a.V2;
            }
            if (c == '{') {
                return com.applovin.impl.vi.a.NONE;
            }
            return com.applovin.impl.vi.a.DEFAULT;
        }
        return com.applovin.impl.vi.a.NONE;
    }

    private static java.lang.String a(java.lang.String str, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        java.lang.String[] strArrSplit = str.split(":");
        char c = 0;
        try {
            if (!"1".equals(strArrSplit[0]) || strArrSplit.length != 4) {
                return null;
            }
            java.lang.String str3 = strArrSplit[1];
            java.lang.String str4 = strArrSplit[2];
            byte[] bArrB = b(strArrSplit[3]);
            if (!str2.endsWith(str4)) {
                return null;
            }
            byte[] bArr = f1430a;
            if (!a(bArr, jVar).equals(str3)) {
                return null;
            }
            char c2 = ' ';
            byte[] bArrA = a(str2.substring(0, 32), bArr, jVar);
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArrB);
            char c3 = '\b';
            long j = (((long) ((byteArrayInputStream.read() ^ bArrA[1]) & 255)) << 8) | ((long) ((byteArrayInputStream.read() ^ bArrA[0]) & 255)) | (((long) ((byteArrayInputStream.read() ^ bArrA[2]) & 255)) << 16) | (((long) ((byteArrayInputStream.read() ^ bArrA[3]) & 255)) << 24) | (((long) ((byteArrayInputStream.read() ^ bArrA[4]) & 255)) << 32) | (((long) ((byteArrayInputStream.read() ^ bArrA[5]) & 255)) << 40) | (((long) ((byteArrayInputStream.read() ^ bArrA[6]) & 255)) << 48) | (((long) ((byteArrayInputStream.read() ^ bArrA[7]) & 255)) << 56);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr2 = new byte[8];
            int i = byteArrayInputStream.read(bArr2);
            int i2 = 0;
            while (i >= 0) {
                java.io.ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                long j2 = ((long) i2) + j;
                long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                long j5 = j4 ^ (j4 >> c2);
                byteArrayOutputStream.write((byte) (((long) (bArr2[c] ^ bArrA[i2 % bArrA.length])) ^ (j5 & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[(i2 + 1) % bArrA.length] ^ bArr2[1])) ^ ((j5 >> c3) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[(i2 + 2) % bArrA.length] ^ bArr2[2])) ^ ((j5 >> 16) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArr2[3] ^ bArrA[(i2 + 3) % bArrA.length])) ^ ((j5 >> 24) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[(i2 + 4) % bArrA.length] ^ bArr2[4])) ^ ((j5 >> 32) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[(i2 + 5) % bArrA.length] ^ bArr2[5])) ^ ((j5 >> 40) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[(i2 + 6) % bArrA.length] ^ bArr2[6])) ^ ((j5 >> 48) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArr2[7] ^ bArrA[(i2 + 7) % bArrA.length])) ^ ((j5 >> 56) & 255)));
                i2 += 8;
                byteArrayInputStream = byteArrayInputStream2;
                i = byteArrayInputStream2.read(bArr2);
                j = j;
                c3 = '\b';
                c = 0;
                c2 = ' ';
            }
            return new java.lang.String(byteArrayOutputStream.toByteArray(), com.adjust.sdk.Constants.ENCODING).trim();
        } catch (java.io.UnsupportedEncodingException e) {
            jVar.D().a("AppLovinSdk", "decode", e);
            throw new java.lang.RuntimeException("UTF-8 encoding not found", e);
        } catch (java.io.IOException e2) {
            com.applovin.impl.sdk.n.b("AppLovinSdk", "Failed to read bytes", e2);
            jVar.D().a("AppLovinSdk", "decode", e2);
            return null;
        }
    }

    public static java.lang.String b(byte[] bArr, java.lang.String str, com.applovin.impl.sdk.j jVar) {
        if (str != null) {
            if (str.length() < 86) {
                throw new java.lang.IllegalArgumentException("SDK key is too short");
            }
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                return "";
            }
            com.applovin.impl.vi.a aVarB = b(bArr);
            if (com.applovin.impl.vi.a.NONE == aVarB) {
                return new java.lang.String(bArr);
            }
            if (aVarB == com.applovin.impl.vi.a.V2) {
                return a(bArr, str, jVar);
            }
            return a(new java.lang.String(bArr), str, jVar);
        }
        throw new java.lang.IllegalArgumentException("No SDK key specified");
    }

    private static int c(byte[] bArr, java.lang.String str, com.applovin.impl.sdk.j jVar) {
        int iA;
        int i;
        if (bArr == null || bArr.length == 0 || android.text.TextUtils.isEmpty(str) || (iA = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(b, jVar).getBytes();
        int i2 = iA + 1;
        int length = bytes.length + i2;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i = length + 55) || bArr[i] != 58 || !java.util.Arrays.equals(java.util.Arrays.copyOfRange(bArr, i2, bytes.length + i2), bytes)) {
            return 0;
        }
        int i3 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i3;
    }

    private static byte[] b(java.lang.String str) {
        return android.util.Base64.decode(a(str), 0);
    }

    private static java.lang.String a(java.lang.String str) {
        return str.replace(org.objectweb.asm.signature.SignatureVisitor.SUPER, org.objectweb.asm.signature.SignatureVisitor.EXTENDS).replace('_', '/').replace('*', '=');
    }

    private static java.lang.String c(byte[] bArr) {
        return a(android.util.Base64.encode(bArr, 2));
    }

    private static java.lang.String a(byte[] bArr, java.lang.String str, com.applovin.impl.sdk.j jVar) {
        try {
            int iC = c(bArr, str, jVar);
            if (iC == 0) {
                return null;
            }
            byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, iC, bArr.length);
            if (bArrCopyOfRange.length < 16) {
                return null;
            }
            long jA = com.applovin.impl.yp.a(bArrCopyOfRange, 8);
            byte[] bArrA = a(str.substring(0, 32), b, jVar);
            return new java.lang.String(com.applovin.impl.yp.d(a(java.util.Arrays.copyOfRange(bArrCopyOfRange, 16, bArrCopyOfRange.length), jA ^ com.applovin.impl.yp.c(bArrA), bArrA)), com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException e) {
            jVar.D().a("AppLovinSdk", "decode2", e);
            throw new java.lang.RuntimeException("UTF-8 encoding not found", e);
        } catch (java.io.IOException e2) {
            com.applovin.impl.sdk.n.b("AppLovinSdk", "Failed to ungzip decode", e2);
            jVar.D().a("AppLovinSdk", "decode2", e2);
            return null;
        }
    }

    private static byte[] a(java.lang.String str, long j, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        char c = ' ';
        try {
            java.lang.String strSubstring = str2.substring(32);
            java.lang.String strSubstring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes(com.adjust.sdk.Constants.ENCODING);
            byte[] bArrA = a(strSubstring2, f1430a, jVar);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j & 255)) ^ bArrA[0]);
            byteArrayOutputStream.write(((byte) ((j >> 8) & 255)) ^ bArrA[1]);
            byteArrayOutputStream.write(((byte) ((j >> 16) & 255)) ^ bArrA[2]);
            byteArrayOutputStream.write(((byte) ((j >> 24) & 255)) ^ bArrA[3]);
            byteArrayOutputStream.write(((byte) ((j >> 32) & 255)) ^ bArrA[4]);
            byteArrayOutputStream.write(((byte) ((j >> 40) & 255)) ^ bArrA[5]);
            byteArrayOutputStream.write(((byte) ((j >> 48) & 255)) ^ bArrA[6]);
            byteArrayOutputStream.write(((byte) ((j >> 56) & 255)) ^ bArrA[7]);
            int i = 0;
            while (i < bytes.length) {
                long j2 = j + ((long) i);
                long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                long j5 = j4 ^ (j4 >> c);
                java.lang.String str3 = strSubstring;
                byteArrayOutputStream.write((byte) (((long) ((i >= bytes.length ? (byte) 0 : bytes[i]) ^ bArrA[i % bArrA.length])) ^ (j5 & 255)));
                int i2 = i + 1;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i2 % bArrA.length] ^ (i2 >= bytes.length ? (byte) 0 : bytes[i2]))) ^ ((j5 >> 8) & 255)));
                int i3 = i + 2;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i3 % bArrA.length] ^ (i3 >= bytes.length ? (byte) 0 : bytes[i3]))) ^ ((j5 >> 16) & 255)));
                int i4 = i + 3;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i4 % bArrA.length] ^ (i4 >= bytes.length ? (byte) 0 : bytes[i4]))) ^ ((j5 >> 24) & 255)));
                int i5 = i + 4;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i5 % bArrA.length] ^ (i5 >= bytes.length ? (byte) 0 : bytes[i5]))) ^ ((j5 >> 32) & 255)));
                int i6 = i + 5;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i6 % bArrA.length] ^ (i6 >= bytes.length ? (byte) 0 : bytes[i6]))) ^ ((j5 >> 40) & 255)));
                int i7 = i + 6;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i7 % bArrA.length] ^ (i7 >= bytes.length ? (byte) 0 : bytes[i7]))) ^ ((j5 >> 48) & 255)));
                int i8 = i + 7;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i8 % bArrA.length] ^ (i8 >= bytes.length ? (byte) 0 : bytes[i8]))) ^ ((j5 >> 56) & 255)));
                i += 8;
                strSubstring = str3;
                c = ' ';
            }
            return ("1:" + a(f1430a, jVar) + ":" + strSubstring + ":" + c(byteArrayOutputStream.toByteArray())).getBytes(com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException e) {
            jVar.D().a("AppLovinSdk", "encode", e);
            return null;
        }
    }

    public static byte[] a(java.lang.String str, long j, com.applovin.impl.vi.a aVar, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        if (str2 != null) {
            if (str2.length() >= 86) {
                if (android.text.TextUtils.isEmpty(str)) {
                    return new byte[0];
                }
                if (com.applovin.impl.vi.a.NONE == aVar) {
                    return str.getBytes();
                }
                if (com.applovin.impl.vi.a.V2 == aVar) {
                    return a(str, j, false, str2, jVar);
                }
                return a(str, j, str2, jVar);
            }
            throw new java.lang.IllegalArgumentException("SDK key is too short");
        }
        throw new java.lang.IllegalArgumentException("No SDK key specified");
    }

    private static byte[] a(byte[] bArr, long j, byte[] bArr2) {
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        long j2 = j;
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i % 8;
            if (i2 == 0) {
                long j3 = ((long) i) + j;
                long j4 = (j3 ^ (j3 >>> 33)) * (-4417276706812531889L);
                long j5 = (j4 ^ (j4 >>> 29)) * (-8796714831421723037L);
                j2 = j5 ^ (j5 >>> 32);
            }
            bArrCopyOf[i] = (byte) (((long) bArrCopyOf[i]) ^ (((j2 >> (i2 * 8)) & 255) ^ ((long) bArr2[i % bArr2.length])));
        }
        return bArrCopyOf;
    }

    private static byte[] a(java.lang.String str, long j, boolean z, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        java.nio.ByteBuffer byteBufferAllocate;
        try {
            byte[] bytes = str.getBytes(com.adjust.sdk.Constants.ENCODING);
            int length = bytes.length;
            java.lang.String strSubstring = str2.substring(32);
            java.lang.String strSubstring2 = str2.substring(0, 32);
            byte[] bArr = b;
            byte[] bArrA = a(strSubstring2, bArr, jVar);
            long jC = com.applovin.impl.yp.c(bArrA) ^ j;
            byte[] bytes2 = java.lang.String.format("2:%s:%s:", a(bArr, jVar), strSubstring).getBytes();
            java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(16);
            byteBufferAllocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.putLong(length);
            byteBufferAllocate2.putLong(jC);
            byteBufferAllocate2.flip();
            byte[] bArrA2 = a(com.applovin.impl.yp.a(bytes), j, bArrA);
            if (z) {
                byte[] bytes3 = c(byteBufferAllocate2.array()).getBytes();
                byte[] bytes4 = c(bArrA2).getBytes();
                byteBufferAllocate = java.nio.ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(bytes3);
                byteBufferAllocate.put(bytes4);
            } else {
                byteBufferAllocate = java.nio.ByteBuffer.allocate(bytes2.length + byteBufferAllocate2.remaining() + bArrA2.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(byteBufferAllocate2);
                byteBufferAllocate.put(bArrA2);
            }
            byteBufferAllocate.flip();
            return byteBufferAllocate.array();
        } catch (java.io.UnsupportedEncodingException e) {
            jVar.D().a("AppLovinSdk", "encode2", e);
            throw new java.lang.RuntimeException("UTF-8 encoding not found", e);
        } catch (java.io.IOException e2) {
            jVar.D().a("AppLovinSdk", "encode2", e2);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b2) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == b2) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static byte[] a(java.lang.String str, byte[] bArr, com.applovin.impl.sdk.j jVar) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes(com.adjust.sdk.Constants.ENCODING));
            return messageDigest.digest();
        } catch (java.security.NoSuchAlgorithmException e) {
            jVar.D().a("AppLovinSdk", "SHA256", e);
            throw new java.lang.RuntimeException("SHA-256 algorithm not found", e);
        }
    }

    private static java.lang.String a(byte[] bArr, com.applovin.impl.sdk.j jVar) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bArr);
            return com.applovin.impl.sdk.utils.StringUtils.toHexString(messageDigest.digest());
        } catch (java.security.NoSuchAlgorithmException e) {
            jVar.D().a("AppLovinSdk", "SHA1", e);
            throw new java.lang.RuntimeException("SHA-1 algorithm not found", e);
        }
    }

    private static java.lang.String a(byte[] bArr) {
        return new java.lang.String(bArr, com.adjust.sdk.Constants.ENCODING).replace(org.objectweb.asm.signature.SignatureVisitor.EXTENDS, org.objectweb.asm.signature.SignatureVisitor.SUPER).replace('/', '_').replace('=', '*');
    }
}

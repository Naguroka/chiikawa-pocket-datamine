package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaos {
    public static java.security.cert.X509Certificate[][] zza(java.lang.String str) throws com.google.android.gms.internal.ads.zzaoo, java.lang.SecurityException, java.io.IOException {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        try {
            android.util.Pair pairZzc = com.google.android.gms.internal.ads.zzaot.zzc(randomAccessFile);
            if (pairZzc == null) {
                throw new com.google.android.gms.internal.ads.zzaoo("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) pairZzc.first;
            long jLongValue = ((java.lang.Long) pairZzc.second).longValue();
            long j = (-20) + jLongValue;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new com.google.android.gms.internal.ads.zzaoo("ZIP64 APK not supported");
                }
            }
            long jZza = com.google.android.gms.internal.ads.zzaot.zza(byteBuffer);
            if (jZza >= jLongValue) {
                throw new com.google.android.gms.internal.ads.zzaoo("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (com.google.android.gms.internal.ads.zzaot.zzb(byteBuffer) + jZza != jLongValue) {
                throw new com.google.android.gms.internal.ads.zzaoo("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jZza < 32) {
                throw new com.google.android.gms.internal.ads.zzaoo("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
            }
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(24);
            byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(jZza - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new com.google.android.gms.internal.ads.zzaoo("No APK Signing Block before ZIP Central Directory");
            }
            long j2 = jLongValue;
            long j3 = byteBufferAllocate.getLong(0);
            if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
                throw new com.google.android.gms.internal.ads.zzaoo("APK Signing Block size out of range: " + j3);
            }
            int i = (int) (8 + j3);
            long j4 = jZza - ((long) i);
            if (j4 < 0) {
                throw new com.google.android.gms.internal.ads.zzaoo("APK Signing Block offset out of range: " + j4);
            }
            java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(i);
            byteBufferAllocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(j4);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j5 = byteBufferAllocate2.getLong(0);
            if (j5 != j3) {
                throw new com.google.android.gms.internal.ads.zzaoo("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j3);
            }
            android.util.Pair pairCreate = android.util.Pair.create(byteBufferAllocate2, java.lang.Long.valueOf(j4));
            java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) pairCreate.first;
            long jLongValue2 = ((java.lang.Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
                throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new java.lang.IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new java.lang.IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                java.nio.ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i2 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i2++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new com.google.android.gms.internal.ads.zzaoo("Insufficient data to read size of APK Signing Block entry #" + i2);
                    }
                    long j6 = byteBufferSlice.getLong();
                    if (j6 < 4 || j6 > 2147483647L) {
                        throw new com.google.android.gms.internal.ads.zzaoo("APK Signing Block entry #" + i2 + " size out of range: " + j6);
                    }
                    int i3 = (int) j6;
                    int iPosition2 = byteBufferSlice.position() + i3;
                    if (i3 > byteBufferSlice.remaining()) {
                        throw new com.google.android.gms.internal.ads.zzaoo("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        java.security.cert.X509Certificate[][] x509CertificateArrZzl = zzl(randomAccessFile.getChannel(), new com.google.android.gms.internal.ads.zzaon(zze(byteBufferSlice, i3 - 4), jLongValue2, jZza, j2, byteBuffer, null));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (java.io.IOException unused) {
                        }
                        return x509CertificateArrZzl;
                    }
                    long j7 = jZza;
                    long j8 = j2;
                    byteBufferSlice.position(iPosition2);
                    j2 = j8;
                    jZza = j7;
                }
                throw new com.google.android.gms.internal.ads.zzaoo("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (java.lang.Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException unused2) {
            }
            throw th2;
        }
    }

    private static int zzb(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new java.lang.IllegalArgumentException("Unknown content digest algorthm: " + i);
    }

    private static int zzc(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i))));
        }
    }

    private static java.lang.String zzd(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new java.lang.IllegalArgumentException("Unknown content digest algorthm: " + i);
    }

    private static java.nio.ByteBuffer zze(java.nio.ByteBuffer byteBuffer, int i) throws java.nio.BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new java.nio.BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static java.nio.ByteBuffer zzf(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (byteBuffer.remaining() < 4) {
            throw new java.io.IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return zze(byteBuffer, i);
        }
        throw new java.io.IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(java.util.Map map, java.nio.channels.FileChannel fileChannel, long j, long j2, long j3, java.nio.ByteBuffer byteBuffer) throws java.lang.SecurityException {
        if (map.isEmpty()) {
            throw new java.lang.SecurityException("No digests provided");
        }
        com.google.android.gms.internal.ads.zzaom zzaomVar = new com.google.android.gms.internal.ads.zzaom(fileChannel, 0L, j);
        com.google.android.gms.internal.ads.zzaom zzaomVar2 = new com.google.android.gms.internal.ads.zzaom(fileChannel, j2, j3 - j2);
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        com.google.android.gms.internal.ads.zzaot.zzd(byteBufferDuplicate, j);
        com.google.android.gms.internal.ads.zzaok zzaokVar = new com.google.android.gms.internal.ads.zzaok(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        java.util.Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((java.lang.Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrZzk = zzk(iArr, new com.google.android.gms.internal.ads.zzaol[]{zzaomVar, zzaomVar2, zzaokVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!java.security.MessageDigest.isEqual((byte[]) map.get(java.lang.Integer.valueOf(i3)), bArrZzk[i2])) {
                    throw new java.lang.SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (java.security.DigestException e) {
            throw new java.lang.SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[] zzi(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new java.io.IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new java.io.IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
    }

    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer byteBuffer, java.util.Map map, java.security.cert.CertificateFactory certificateFactory) throws java.io.IOException, java.lang.SecurityException {
        java.lang.String str;
        android.util.Pair pairCreate;
        java.nio.ByteBuffer byteBufferZzf = zzf(byteBuffer);
        java.nio.ByteBuffer byteBufferZzf2 = zzf(byteBuffer);
        byte[] bArrZzi = zzi(byteBuffer);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferZzf2.hasRemaining()) {
            i2++;
            try {
                java.nio.ByteBuffer byteBufferZzf3 = zzf(byteBufferZzf2);
                if (byteBufferZzf3.remaining() < 8) {
                    throw new java.lang.SecurityException("Signature record too short");
                }
                int i3 = byteBufferZzf3.getInt();
                arrayList.add(java.lang.Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iZzc = zzc(i3);
                    int iZzc2 = zzc(i);
                    if (iZzc != 1 && iZzc2 == 1) {
                    }
                }
                bArrZzi3 = zzi(byteBufferZzf3);
                i = i3;
            } catch (java.io.IOException | java.nio.BufferUnderflowException e) {
                throw new java.lang.SecurityException("Failed to parse signature record #" + i2, e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new java.lang.SecurityException("No signatures found");
            }
            throw new java.lang.SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = android.util.Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = android.util.Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = android.util.Pair.create("SHA256withRSA/PSS", new java.security.spec.PSSParameterSpec("SHA-256", "MGF1", java.security.spec.MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = android.util.Pair.create("SHA512withRSA/PSS", new java.security.spec.PSSParameterSpec("SHA-512", "MGF1", java.security.spec.MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = android.util.Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = android.util.Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i))));
            }
        } else {
            pairCreate = android.util.Pair.create("SHA256withDSA", null);
        }
        java.lang.String str2 = (java.lang.String) pairCreate.first;
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec = (java.security.spec.AlgorithmParameterSpec) pairCreate.second;
        try {
            java.security.PublicKey publicKeyGeneratePublic = java.security.KeyFactory.getInstance(str).generatePublic(new java.security.spec.X509EncodedKeySpec(bArrZzi));
            java.security.Signature signature = java.security.Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzf);
            if (!signature.verify(bArrZzi3)) {
                throw new java.lang.SecurityException(java.lang.String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferZzf.clear();
            java.nio.ByteBuffer byteBufferZzf4 = zzf(byteBufferZzf);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i4 = 0;
            while (byteBufferZzf4.hasRemaining()) {
                i4++;
                try {
                    java.nio.ByteBuffer byteBufferZzf5 = zzf(byteBufferZzf4);
                    if (byteBufferZzf5.remaining() < 8) {
                        throw new java.io.IOException("Record too short");
                    }
                    int i5 = byteBufferZzf5.getInt();
                    arrayList2.add(java.lang.Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrZzi2 = zzi(byteBufferZzf5);
                    }
                } catch (java.io.IOException | java.nio.BufferUnderflowException e2) {
                    throw new java.io.IOException("Failed to parse digest record #" + i4, e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new java.lang.SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZzc3 = zzc(i);
            byte[] bArr = (byte[]) map.put(java.lang.Integer.valueOf(iZzc3), bArrZzi2);
            if (bArr != null && !java.security.MessageDigest.isEqual(bArr, bArrZzi2)) {
                throw new java.lang.SecurityException(zzd(iZzc3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            java.nio.ByteBuffer byteBufferZzf6 = zzf(byteBufferZzf);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i6 = 0;
            while (byteBufferZzf6.hasRemaining()) {
                i6++;
                byte[] bArrZzi4 = zzi(byteBufferZzf6);
                try {
                    arrayList3.add(new com.google.android.gms.internal.ads.zzaop((java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArrZzi4)), bArrZzi4));
                } catch (java.security.cert.CertificateException e3) {
                    throw new java.lang.SecurityException("Failed to decode certificate #" + i6, e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new java.lang.SecurityException("No certificates listed");
            }
            if (java.util.Arrays.equals(bArrZzi, ((java.security.cert.X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (java.security.cert.X509Certificate[]) arrayList3.toArray(new java.security.cert.X509Certificate[arrayList3.size()]);
            }
            throw new java.lang.SecurityException("Public key mismatch between certificate and signature record");
        } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | java.security.SignatureException | java.security.spec.InvalidKeySpecException e4) {
            throw new java.lang.SecurityException("Failed to verify " + str2 + " signature", e4);
        }
    }

    private static byte[][] zzk(int[] iArr, com.google.android.gms.internal.ads.zzaol[] zzaolVarArr) throws java.security.DigestException {
        long j;
        int i;
        int length;
        int i2 = 0;
        long j2 = 0;
        int i3 = 0;
        long jZza = 0;
        while (true) {
            j = 1048576;
            if (i3 >= 3) {
                break;
            }
            jZza += (zzaolVarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (jZza >= 2097151) {
            throw new java.security.DigestException("Too many chunks: " + jZza);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) jZza;
            byte[] bArr2 = new byte[(zzb(iArr[i4]) * i5) + 5];
            bArr2[0] = 90;
            zzg(i5, bArr2, 1);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        java.security.MessageDigest[] messageDigestArr = new java.security.MessageDigest[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            java.lang.String strZzd = zzd(iArr[i6]);
            try {
                messageDigestArr[i6] = java.security.MessageDigest.getInstance(strZzd);
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.RuntimeException(strZzd.concat(" digest not supported"), e);
            }
        }
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i7 < i; i = 3) {
            com.google.android.gms.internal.ads.zzaol zzaolVar = zzaolVarArr[i7];
            long j3 = j2;
            long jZza2 = zzaolVar.zza();
            while (jZza2 > j2) {
                int iMin = (int) java.lang.Math.min(jZza2, j);
                zzg(iMin, bArr3, 1);
                for (int i9 = 0; i9 < length; i9++) {
                    messageDigestArr[i9].update(bArr3);
                }
                long j4 = j3;
                try {
                    zzaolVar.zzb(messageDigestArr, j4, iMin);
                    byte[] bArr4 = bArr3;
                    int i10 = 0;
                    while (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        com.google.android.gms.internal.ads.zzaol zzaolVar2 = zzaolVar;
                        byte[] bArr5 = bArr[i10];
                        int iZzb = zzb(i11);
                        int i12 = length;
                        java.security.MessageDigest messageDigest = messageDigestArr[i10];
                        java.security.MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i8 * iZzb) + 5, iZzb);
                        if (iDigest != iZzb) {
                            throw new java.lang.RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i10++;
                        zzaolVar = zzaolVar2;
                        length = i12;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j5 = iMin;
                    long j6 = j4 + j5;
                    jZza2 -= j5;
                    i8++;
                    j2 = 0;
                    j = 1048576;
                    bArr3 = bArr4;
                    j3 = j6;
                    messageDigestArr = messageDigestArr;
                } catch (java.io.IOException e2) {
                    throw new java.security.DigestException("Failed to digest chunk #" + i8 + " of section #" + i2, e2);
                }
            }
            i2++;
            i7++;
            j2 = 0;
            j = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr7 = bArr[i13];
            java.lang.String strZzd2 = zzd(i14);
            try {
                bArr6[i13] = java.security.MessageDigest.getInstance(strZzd2).digest(bArr7);
            } catch (java.security.NoSuchAlgorithmException e3) {
                throw new java.lang.RuntimeException(strZzd2.concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    private static java.security.cert.X509Certificate[][] zzl(java.nio.channels.FileChannel fileChannel, com.google.android.gms.internal.ads.zzaon zzaonVar) throws java.lang.SecurityException {
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                java.nio.ByteBuffer byteBufferZzf = zzf(zzaonVar.zza);
                int i = 0;
                while (byteBufferZzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(byteBufferZzf), map, certificateFactory));
                    } catch (java.io.IOException | java.lang.SecurityException | java.nio.BufferUnderflowException e) {
                        throw new java.lang.SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i <= 0) {
                    throw new java.lang.SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new java.lang.SecurityException("No content digests found");
                }
                zzh(map, fileChannel, zzaonVar.zzb, zzaonVar.zzc, zzaonVar.zzd, zzaonVar.zze);
                return (java.security.cert.X509Certificate[][]) arrayList.toArray(new java.security.cert.X509Certificate[arrayList.size()][]);
            } catch (java.io.IOException e2) {
                throw new java.lang.SecurityException("Failed to read list of signers", e2);
            }
        } catch (java.security.cert.CertificateException e3) {
            throw new java.lang.RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}

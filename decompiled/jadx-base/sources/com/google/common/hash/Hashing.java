package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
public final class Hashing {
    static final int GOOD_FAST_HASH_SEED = (int) java.lang.System.currentTimeMillis();

    public static com.google.common.hash.HashFunction goodFastHash(int minimumBits) {
        int iCheckPositiveAndMakeMultipleOf32 = checkPositiveAndMakeMultipleOf32(minimumBits);
        if (iCheckPositiveAndMakeMultipleOf32 == 32) {
            return com.google.common.hash.Murmur3_32HashFunction.GOOD_FAST_HASH_32;
        }
        if (iCheckPositiveAndMakeMultipleOf32 <= 128) {
            return com.google.common.hash.Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        }
        int i = (iCheckPositiveAndMakeMultipleOf32 + 127) / 128;
        com.google.common.hash.HashFunction[] hashFunctionArr = new com.google.common.hash.HashFunction[i];
        hashFunctionArr[0] = com.google.common.hash.Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        int i2 = GOOD_FAST_HASH_SEED;
        for (int i3 = 1; i3 < i; i3++) {
            i2 += 1500450271;
            hashFunctionArr[i3] = murmur3_128(i2);
        }
        return new com.google.common.hash.Hashing.ConcatenatedHashFunction(hashFunctionArr);
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction murmur3_32(int seed) {
        return new com.google.common.hash.Murmur3_32HashFunction(seed, false);
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction murmur3_32() {
        return com.google.common.hash.Murmur3_32HashFunction.MURMUR3_32;
    }

    public static com.google.common.hash.HashFunction murmur3_32_fixed(int seed) {
        return new com.google.common.hash.Murmur3_32HashFunction(seed, true);
    }

    public static com.google.common.hash.HashFunction murmur3_32_fixed() {
        return com.google.common.hash.Murmur3_32HashFunction.MURMUR3_32_FIXED;
    }

    public static com.google.common.hash.HashFunction murmur3_128(int seed) {
        return new com.google.common.hash.Murmur3_128HashFunction(seed);
    }

    public static com.google.common.hash.HashFunction murmur3_128() {
        return com.google.common.hash.Murmur3_128HashFunction.MURMUR3_128;
    }

    public static com.google.common.hash.HashFunction sipHash24() {
        return com.google.common.hash.SipHashFunction.SIP_HASH_24;
    }

    public static com.google.common.hash.HashFunction sipHash24(long k0, long k1) {
        return new com.google.common.hash.SipHashFunction(2, 4, k0, k1);
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction md5() {
        return com.google.common.hash.Hashing.Md5Holder.MD5;
    }

    private static class Md5Holder {
        static final com.google.common.hash.HashFunction MD5 = new com.google.common.hash.MessageDigestHashFunction("MD5", "Hashing.md5()");

        private Md5Holder() {
        }
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction sha1() {
        return com.google.common.hash.Hashing.Sha1Holder.SHA_1;
    }

    private static class Sha1Holder {
        static final com.google.common.hash.HashFunction SHA_1 = new com.google.common.hash.MessageDigestHashFunction(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1, "Hashing.sha1()");

        private Sha1Holder() {
        }
    }

    public static com.google.common.hash.HashFunction sha256() {
        return com.google.common.hash.Hashing.Sha256Holder.SHA_256;
    }

    private static class Sha256Holder {
        static final com.google.common.hash.HashFunction SHA_256 = new com.google.common.hash.MessageDigestHashFunction("SHA-256", "Hashing.sha256()");

        private Sha256Holder() {
        }
    }

    public static com.google.common.hash.HashFunction sha384() {
        return com.google.common.hash.Hashing.Sha384Holder.SHA_384;
    }

    private static class Sha384Holder {
        static final com.google.common.hash.HashFunction SHA_384 = new com.google.common.hash.MessageDigestHashFunction("SHA-384", "Hashing.sha384()");

        private Sha384Holder() {
        }
    }

    public static com.google.common.hash.HashFunction sha512() {
        return com.google.common.hash.Hashing.Sha512Holder.SHA_512;
    }

    private static class Sha512Holder {
        static final com.google.common.hash.HashFunction SHA_512 = new com.google.common.hash.MessageDigestHashFunction("SHA-512", "Hashing.sha512()");

        private Sha512Holder() {
        }
    }

    public static com.google.common.hash.HashFunction hmacMd5(java.security.Key key) {
        return new com.google.common.hash.MacHashFunction("HmacMD5", key, hmacToString("hmacMd5", key));
    }

    public static com.google.common.hash.HashFunction hmacMd5(byte[] key) {
        return hmacMd5(new javax.crypto.spec.SecretKeySpec((byte[]) com.google.common.base.Preconditions.checkNotNull(key), "HmacMD5"));
    }

    public static com.google.common.hash.HashFunction hmacSha1(java.security.Key key) {
        return new com.google.common.hash.MacHashFunction("HmacSHA1", key, hmacToString("hmacSha1", key));
    }

    public static com.google.common.hash.HashFunction hmacSha1(byte[] key) {
        return hmacSha1(new javax.crypto.spec.SecretKeySpec((byte[]) com.google.common.base.Preconditions.checkNotNull(key), "HmacSHA1"));
    }

    public static com.google.common.hash.HashFunction hmacSha256(java.security.Key key) {
        return new com.google.common.hash.MacHashFunction("HmacSHA256", key, hmacToString("hmacSha256", key));
    }

    public static com.google.common.hash.HashFunction hmacSha256(byte[] key) {
        return hmacSha256(new javax.crypto.spec.SecretKeySpec((byte[]) com.google.common.base.Preconditions.checkNotNull(key), "HmacSHA256"));
    }

    public static com.google.common.hash.HashFunction hmacSha512(java.security.Key key) {
        return new com.google.common.hash.MacHashFunction("HmacSHA512", key, hmacToString("hmacSha512", key));
    }

    public static com.google.common.hash.HashFunction hmacSha512(byte[] key) {
        return hmacSha512(new javax.crypto.spec.SecretKeySpec((byte[]) com.google.common.base.Preconditions.checkNotNull(key), "HmacSHA512"));
    }

    private static java.lang.String hmacToString(java.lang.String methodName, java.security.Key key) {
        return "Hashing." + methodName + "(Key[algorithm=" + key.getAlgorithm() + ", format=" + key.getFormat() + "])";
    }

    public static com.google.common.hash.HashFunction crc32c() {
        return com.google.common.hash.Crc32cHashFunction.CRC_32_C;
    }

    public static com.google.common.hash.HashFunction crc32() {
        return com.google.common.hash.Hashing.ChecksumType.CRC_32.hashFunction;
    }

    public static com.google.common.hash.HashFunction adler32() {
        return com.google.common.hash.Hashing.ChecksumType.ADLER_32.hashFunction;
    }

    @com.google.errorprone.annotations.Immutable
    enum ChecksumType implements com.google.common.hash.ImmutableSupplier<java.util.zip.Checksum> {
        CRC_32("Hashing.crc32()") { // from class: com.google.common.hash.Hashing.ChecksumType.1
            @Override // com.google.common.base.Supplier
            public java.util.zip.Checksum get() {
                return new java.util.zip.CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") { // from class: com.google.common.hash.Hashing.ChecksumType.2
            @Override // com.google.common.base.Supplier
            public java.util.zip.Checksum get() {
                return new java.util.zip.Adler32();
            }
        };

        public final com.google.common.hash.HashFunction hashFunction;

        ChecksumType(java.lang.String toString) {
            this.hashFunction = new com.google.common.hash.ChecksumHashFunction(this, 32, toString);
        }
    }

    public static com.google.common.hash.HashFunction farmHashFingerprint64() {
        return com.google.common.hash.FarmHashFingerprint64.FARMHASH_FINGERPRINT_64;
    }

    public static com.google.common.hash.HashFunction fingerprint2011() {
        return com.google.common.hash.Fingerprint2011.FINGERPRINT_2011;
    }

    public static int consistentHash(com.google.common.hash.HashCode hashCode, int buckets) {
        return consistentHash(hashCode.padToLong(), buckets);
    }

    public static int consistentHash(long input, int buckets) {
        int i = 0;
        com.google.common.base.Preconditions.checkArgument(buckets > 0, "buckets must be positive: %s", buckets);
        com.google.common.hash.Hashing.LinearCongruentialGenerator linearCongruentialGenerator = new com.google.common.hash.Hashing.LinearCongruentialGenerator(input);
        while (true) {
            int iNextDouble = (int) (((double) (i + 1)) / linearCongruentialGenerator.nextDouble());
            if (iNextDouble < 0 || iNextDouble >= buckets) {
                break;
            }
            i = iNextDouble;
        }
        return i;
    }

    public static com.google.common.hash.HashCode combineOrdered(java.lang.Iterable<com.google.common.hash.HashCode> hashCodes) {
        java.util.Iterator<com.google.common.hash.HashCode> it = hashCodes.iterator();
        com.google.common.base.Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iBits = it.next().bits() / 8;
        byte[] bArr = new byte[iBits];
        java.util.Iterator<com.google.common.hash.HashCode> it2 = hashCodes.iterator();
        while (it2.hasNext()) {
            byte[] bArrAsBytes = it2.next().asBytes();
            com.google.common.base.Preconditions.checkArgument(bArrAsBytes.length == iBits, "All hashcodes must have the same bit length.");
            for (int i = 0; i < bArrAsBytes.length; i++) {
                bArr[i] = (byte) ((bArr[i] * 37) ^ bArrAsBytes[i]);
            }
        }
        return com.google.common.hash.HashCode.fromBytesNoCopy(bArr);
    }

    public static com.google.common.hash.HashCode combineUnordered(java.lang.Iterable<com.google.common.hash.HashCode> hashCodes) {
        java.util.Iterator<com.google.common.hash.HashCode> it = hashCodes.iterator();
        com.google.common.base.Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iBits = it.next().bits() / 8;
        byte[] bArr = new byte[iBits];
        java.util.Iterator<com.google.common.hash.HashCode> it2 = hashCodes.iterator();
        while (it2.hasNext()) {
            byte[] bArrAsBytes = it2.next().asBytes();
            com.google.common.base.Preconditions.checkArgument(bArrAsBytes.length == iBits, "All hashcodes must have the same bit length.");
            for (int i = 0; i < bArrAsBytes.length; i++) {
                bArr[i] = (byte) (bArr[i] + bArrAsBytes[i]);
            }
        }
        return com.google.common.hash.HashCode.fromBytesNoCopy(bArr);
    }

    static int checkPositiveAndMakeMultipleOf32(int bits) {
        com.google.common.base.Preconditions.checkArgument(bits > 0, "Number of bits must be positive");
        return (bits + 31) & (-32);
    }

    public static com.google.common.hash.HashFunction concatenating(com.google.common.hash.HashFunction first, com.google.common.hash.HashFunction second, com.google.common.hash.HashFunction... rest) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(first);
        arrayList.add(second);
        java.util.Collections.addAll(arrayList, rest);
        return new com.google.common.hash.Hashing.ConcatenatedHashFunction((com.google.common.hash.HashFunction[]) arrayList.toArray(new com.google.common.hash.HashFunction[0]));
    }

    public static com.google.common.hash.HashFunction concatenating(java.lang.Iterable<com.google.common.hash.HashFunction> hashFunctions) {
        com.google.common.base.Preconditions.checkNotNull(hashFunctions);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.common.hash.HashFunction> it = hashFunctions.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        com.google.common.base.Preconditions.checkArgument(!arrayList.isEmpty(), "number of hash functions (%s) must be > 0", arrayList.size());
        return new com.google.common.hash.Hashing.ConcatenatedHashFunction((com.google.common.hash.HashFunction[]) arrayList.toArray(new com.google.common.hash.HashFunction[0]));
    }

    private static final class ConcatenatedHashFunction extends com.google.common.hash.AbstractCompositeHashFunction {
        private ConcatenatedHashFunction(com.google.common.hash.HashFunction... functions) {
            super(functions);
            for (com.google.common.hash.HashFunction hashFunction : functions) {
                com.google.common.base.Preconditions.checkArgument(hashFunction.bits() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", hashFunction.bits(), (java.lang.Object) hashFunction);
            }
        }

        @Override // com.google.common.hash.AbstractCompositeHashFunction
        com.google.common.hash.HashCode makeHash(com.google.common.hash.Hasher[] hashers) {
            byte[] bArr = new byte[bits() / 8];
            int iWriteBytesTo = 0;
            for (com.google.common.hash.Hasher hasher : hashers) {
                com.google.common.hash.HashCode hashCodeHash = hasher.hash();
                iWriteBytesTo += hashCodeHash.writeBytesTo(bArr, iWriteBytesTo, hashCodeHash.bits() / 8);
            }
            return com.google.common.hash.HashCode.fromBytesNoCopy(bArr);
        }

        @Override // com.google.common.hash.HashFunction
        public int bits() {
            int iBits = 0;
            for (com.google.common.hash.HashFunction hashFunction : this.functions) {
                iBits += hashFunction.bits();
            }
            return iBits;
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object instanceof com.google.common.hash.Hashing.ConcatenatedHashFunction) {
                return java.util.Arrays.equals(this.functions, ((com.google.common.hash.Hashing.ConcatenatedHashFunction) object).functions);
            }
            return false;
        }

        public int hashCode() {
            return java.util.Arrays.hashCode(this.functions);
        }
    }

    private static final class LinearCongruentialGenerator {
        private long state;

        public LinearCongruentialGenerator(long seed) {
            this.state = seed;
        }

        public double nextDouble() {
            long j = (this.state * 2862933555777941757L) + 1;
            this.state = j;
            return ((double) (((int) (j >>> 33)) + 1)) / 2.147483648E9d;
        }
    }

    private Hashing() {
    }
}

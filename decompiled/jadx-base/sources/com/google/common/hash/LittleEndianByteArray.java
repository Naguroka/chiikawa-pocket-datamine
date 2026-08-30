package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class LittleEndianByteArray {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final com.google.common.hash.LittleEndianByteArray.LittleEndianBytes byteArray;

    private enum JavaLittleEndianBytes implements com.google.common.hash.LittleEndianByteArray.LittleEndianBytes {
        INSTANCE { // from class: com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.1
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] source, int offset) {
                return com.google.common.primitives.Longs.fromBytes(source[offset + 7], source[offset + 6], source[offset + 5], source[offset + 4], source[offset + 3], source[offset + 2], source[offset + 1], source[offset]);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] sink, int offset, long value) {
                long j = 255;
                for (int i = 0; i < 8; i++) {
                    sink[offset + i] = (byte) ((value & j) >> (i * 8));
                    j <<= 8;
                }
            }
        }
    }

    private interface LittleEndianBytes {
        long getLongLittleEndian(byte[] array, int offset);

        void putLongLittleEndian(byte[] array, int offset, long value);
    }

    static long load64(byte[] input, int offset) {
        return byteArray.getLongLittleEndian(input, offset);
    }

    static long load64Safely(byte[] input, int offset, int length) {
        int iMin = java.lang.Math.min(length, 8);
        long j = 0;
        for (int i = 0; i < iMin; i++) {
            j |= (((long) input[offset + i]) & 255) << (i * 8);
        }
        return j;
    }

    static void store64(byte[] sink, int offset, long value) {
        byteArray.putLongLittleEndian(sink, offset, value);
    }

    static int load32(byte[] source, int offset) {
        return ((source[offset + 3] & 255) << 24) | (source[offset] & 255) | ((source[offset + 1] & 255) << 8) | ((source[offset + 2] & 255) << 16);
    }

    static boolean usingUnsafe() {
        return byteArray instanceof com.google.common.hash.LittleEndianByteArray.UnsafeByteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    enum UnsafeByteArray implements com.google.common.hash.LittleEndianByteArray.LittleEndianBytes {
        UNSAFE_LITTLE_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.1
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] array, int offset) {
                return com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe.getLong(array, ((long) offset) + ((long) com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] array, int offset, long value) {
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe.putLong(array, ((long) offset) + ((long) com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET), value);
            }
        },
        UNSAFE_BIG_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.2
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] array, int offset) {
                return java.lang.Long.reverseBytes(com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe.getLong(array, ((long) offset) + ((long) com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET)));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] array, int offset, long value) {
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe.putLong(array, ((long) offset) + ((long) com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET), java.lang.Long.reverseBytes(value));
            }
        };

        private static final int BYTE_ARRAY_BASE_OFFSET;
        private static final sun.misc.Unsafe theUnsafe;

        static {
            sun.misc.Unsafe unsafe = getUnsafe();
            theUnsafe = unsafe;
            BYTE_ARRAY_BASE_OFFSET = unsafe.arrayBaseOffset(byte[].class);
            if (unsafe.arrayIndexScale(byte[].class) != 1) {
                throw new java.lang.AssertionError();
            }
        }

        private static sun.misc.Unsafe getUnsafe() {
            try {
                try {
                    return sun.misc.Unsafe.getUnsafe();
                } catch (java.security.PrivilegedActionException e) {
                    throw new java.lang.RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (java.lang.SecurityException unused) {
                return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction() { // from class: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$$ExternalSyntheticLambda0
                    @Override // java.security.PrivilegedExceptionAction
                    public final java.lang.Object run() {
                        return com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.lambda$getUnsafe$0();
                    }
                });
            }
        }

        static /* synthetic */ sun.misc.Unsafe lambda$getUnsafe$0() throws java.lang.Exception {
            for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                java.lang.Object obj = field.get(null);
                if (sun.misc.Unsafe.class.isInstance(obj)) {
                    return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                }
            }
            throw new java.lang.NoSuchFieldError("the Unsafe");
        }
    }

    static {
        com.google.common.hash.LittleEndianByteArray.LittleEndianBytes littleEndianBytes = com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.INSTANCE;
        try {
            if ("amd64".equals(java.lang.System.getProperty("os.arch"))) {
                if (java.nio.ByteOrder.nativeOrder().equals(java.nio.ByteOrder.LITTLE_ENDIAN)) {
                    littleEndianBytes = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_LITTLE_ENDIAN;
                } else {
                    littleEndianBytes = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_BIG_ENDIAN;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        byteArray = littleEndianBytes;
    }

    private LittleEndianByteArray() {
    }
}

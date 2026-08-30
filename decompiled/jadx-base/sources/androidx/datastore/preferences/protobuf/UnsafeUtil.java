package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE;
    private static final long BUFFER_ADDRESS_OFFSET;
    private static final int BYTE_ARRAY_ALIGNMENT;
    static final long BYTE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_INDEX_SCALE;
    private static final long FLOAT_ARRAY_BASE_OFFSET;
    private static final long FLOAT_ARRAY_INDEX_SCALE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    static final boolean IS_BIG_ENDIAN;
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final long OBJECT_ARRAY_BASE_OFFSET;
    private static final long OBJECT_ARRAY_INDEX_SCALE;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final sun.misc.Unsafe UNSAFE = getUnsafe();
    private static final java.lang.Class<?> MEMORY_CLASS = androidx.datastore.preferences.protobuf.Android.getMemoryClass();
    private static final boolean IS_ANDROID_64 = determineAndroidSupportByAddressSize(java.lang.Long.TYPE);
    private static final boolean IS_ANDROID_32 = determineAndroidSupportByAddressSize(java.lang.Integer.TYPE);
    private static final androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor MEMORY_ACCESSOR = getMemoryAccessor();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();

    static {
        long jArrayBaseOffset = arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = jArrayBaseOffset;
        BOOLEAN_ARRAY_BASE_OFFSET = arrayBaseOffset(boolean[].class);
        BOOLEAN_ARRAY_INDEX_SCALE = arrayIndexScale(boolean[].class);
        INT_ARRAY_BASE_OFFSET = arrayBaseOffset(int[].class);
        INT_ARRAY_INDEX_SCALE = arrayIndexScale(int[].class);
        LONG_ARRAY_BASE_OFFSET = arrayBaseOffset(long[].class);
        LONG_ARRAY_INDEX_SCALE = arrayIndexScale(long[].class);
        FLOAT_ARRAY_BASE_OFFSET = arrayBaseOffset(float[].class);
        FLOAT_ARRAY_INDEX_SCALE = arrayIndexScale(float[].class);
        DOUBLE_ARRAY_BASE_OFFSET = arrayBaseOffset(double[].class);
        DOUBLE_ARRAY_INDEX_SCALE = arrayIndexScale(double[].class);
        OBJECT_ARRAY_BASE_OFFSET = arrayBaseOffset(java.lang.Object[].class);
        OBJECT_ARRAY_INDEX_SCALE = arrayIndexScale(java.lang.Object[].class);
        BUFFER_ADDRESS_OFFSET = fieldOffset(bufferAddressField());
        BYTE_ARRAY_ALIGNMENT = (int) (jArrayBaseOffset & 7);
        IS_BIG_ENDIAN = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private UnsafeUtil() {
    }

    static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    static <T> T allocateInstance(java.lang.Class<T> cls) {
        try {
            return (T) UNSAFE.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static long objectFieldOffset(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    private static int arrayBaseOffset(java.lang.Class<?> clazz) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayBaseOffset(clazz);
        }
        return -1;
    }

    private static int arrayIndexScale(java.lang.Class<?> clazz) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayIndexScale(clazz);
        }
        return -1;
    }

    static byte getByte(java.lang.Object target, long offset) {
        return MEMORY_ACCESSOR.getByte(target, offset);
    }

    static void putByte(java.lang.Object target, long offset, byte value) {
        MEMORY_ACCESSOR.putByte(target, offset, value);
    }

    static int getInt(java.lang.Object target, long offset) {
        return MEMORY_ACCESSOR.getInt(target, offset);
    }

    static void putInt(java.lang.Object target, long offset, int value) {
        MEMORY_ACCESSOR.putInt(target, offset, value);
    }

    static long getLong(java.lang.Object target, long offset) {
        return MEMORY_ACCESSOR.getLong(target, offset);
    }

    static void putLong(java.lang.Object target, long offset, long value) {
        MEMORY_ACCESSOR.putLong(target, offset, value);
    }

    static boolean getBoolean(java.lang.Object target, long offset) {
        return MEMORY_ACCESSOR.getBoolean(target, offset);
    }

    static void putBoolean(java.lang.Object target, long offset, boolean value) {
        MEMORY_ACCESSOR.putBoolean(target, offset, value);
    }

    static float getFloat(java.lang.Object target, long offset) {
        return MEMORY_ACCESSOR.getFloat(target, offset);
    }

    static void putFloat(java.lang.Object target, long offset, float value) {
        MEMORY_ACCESSOR.putFloat(target, offset, value);
    }

    static double getDouble(java.lang.Object target, long offset) {
        return MEMORY_ACCESSOR.getDouble(target, offset);
    }

    static void putDouble(java.lang.Object target, long offset, double value) {
        MEMORY_ACCESSOR.putDouble(target, offset, value);
    }

    static java.lang.Object getObject(java.lang.Object target, long offset) {
        return MEMORY_ACCESSOR.getObject(target, offset);
    }

    static void putObject(java.lang.Object target, long offset, java.lang.Object value) {
        MEMORY_ACCESSOR.putObject(target, offset, value);
    }

    static byte getByte(byte[] target, long index) {
        return MEMORY_ACCESSOR.getByte(target, BYTE_ARRAY_BASE_OFFSET + index);
    }

    static void putByte(byte[] target, long index, byte value) {
        MEMORY_ACCESSOR.putByte(target, BYTE_ARRAY_BASE_OFFSET + index, value);
    }

    static int getInt(int[] target, long index) {
        return MEMORY_ACCESSOR.getInt(target, INT_ARRAY_BASE_OFFSET + (index * INT_ARRAY_INDEX_SCALE));
    }

    static void putInt(int[] target, long index, int value) {
        MEMORY_ACCESSOR.putInt(target, INT_ARRAY_BASE_OFFSET + (index * INT_ARRAY_INDEX_SCALE), value);
    }

    static long getLong(long[] target, long index) {
        return MEMORY_ACCESSOR.getLong(target, LONG_ARRAY_BASE_OFFSET + (index * LONG_ARRAY_INDEX_SCALE));
    }

    static void putLong(long[] target, long index, long value) {
        MEMORY_ACCESSOR.putLong(target, LONG_ARRAY_BASE_OFFSET + (index * LONG_ARRAY_INDEX_SCALE), value);
    }

    static boolean getBoolean(boolean[] target, long index) {
        return MEMORY_ACCESSOR.getBoolean(target, BOOLEAN_ARRAY_BASE_OFFSET + (index * BOOLEAN_ARRAY_INDEX_SCALE));
    }

    static void putBoolean(boolean[] target, long index, boolean value) {
        MEMORY_ACCESSOR.putBoolean(target, BOOLEAN_ARRAY_BASE_OFFSET + (index * BOOLEAN_ARRAY_INDEX_SCALE), value);
    }

    static float getFloat(float[] target, long index) {
        return MEMORY_ACCESSOR.getFloat(target, FLOAT_ARRAY_BASE_OFFSET + (index * FLOAT_ARRAY_INDEX_SCALE));
    }

    static void putFloat(float[] target, long index, float value) {
        MEMORY_ACCESSOR.putFloat(target, FLOAT_ARRAY_BASE_OFFSET + (index * FLOAT_ARRAY_INDEX_SCALE), value);
    }

    static double getDouble(double[] target, long index) {
        return MEMORY_ACCESSOR.getDouble(target, DOUBLE_ARRAY_BASE_OFFSET + (index * DOUBLE_ARRAY_INDEX_SCALE));
    }

    static void putDouble(double[] target, long index, double value) {
        MEMORY_ACCESSOR.putDouble(target, DOUBLE_ARRAY_BASE_OFFSET + (index * DOUBLE_ARRAY_INDEX_SCALE), value);
    }

    static java.lang.Object getObject(java.lang.Object[] target, long index) {
        return MEMORY_ACCESSOR.getObject(target, OBJECT_ARRAY_BASE_OFFSET + (index * OBJECT_ARRAY_INDEX_SCALE));
    }

    static void putObject(java.lang.Object[] target, long index, java.lang.Object value) {
        MEMORY_ACCESSOR.putObject(target, OBJECT_ARRAY_BASE_OFFSET + (index * OBJECT_ARRAY_INDEX_SCALE), value);
    }

    static void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
        MEMORY_ACCESSOR.copyMemory(src, srcIndex, targetOffset, length);
    }

    static void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
        MEMORY_ACCESSOR.copyMemory(srcOffset, target, targetIndex, length);
    }

    static void copyMemory(byte[] src, long srcIndex, byte[] target, long targetIndex, long length) {
        java.lang.System.arraycopy(src, (int) srcIndex, target, (int) targetIndex, (int) length);
    }

    static byte getByte(long address) {
        return MEMORY_ACCESSOR.getByte(address);
    }

    static void putByte(long address, byte value) {
        MEMORY_ACCESSOR.putByte(address, value);
    }

    static int getInt(long address) {
        return MEMORY_ACCESSOR.getInt(address);
    }

    static void putInt(long address, int value) {
        MEMORY_ACCESSOR.putInt(address, value);
    }

    static long getLong(long address) {
        return MEMORY_ACCESSOR.getLong(address);
    }

    static void putLong(long address, long value) {
        MEMORY_ACCESSOR.putLong(address, value);
    }

    static long addressOffset(java.nio.ByteBuffer buffer) {
        return MEMORY_ACCESSOR.getLong(buffer, BUFFER_ADDRESS_OFFSET);
    }

    static java.lang.Object getStaticObject(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    static sun.misc.Unsafe getUnsafe() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() { // from class: androidx.datastore.preferences.protobuf.UnsafeUtil.1
                @Override // java.security.PrivilegedExceptionAction
                public sun.misc.Unsafe run() throws java.lang.Exception {
                    for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        java.lang.Object obj = field.get(null);
                        if (sun.misc.Unsafe.class.isInstance(obj)) {
                            return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor getMemoryAccessor() {
        sun.misc.Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return null;
        }
        if (androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice()) {
            if (IS_ANDROID_64) {
                return new androidx.datastore.preferences.protobuf.UnsafeUtil.Android64MemoryAccessor(unsafe);
            }
            if (IS_ANDROID_32) {
                return new androidx.datastore.preferences.protobuf.UnsafeUtil.Android32MemoryAccessor(unsafe);
            }
            return null;
        }
        return new androidx.datastore.preferences.protobuf.UnsafeUtil.JvmMemoryAccessor(unsafe);
    }

    private static boolean supportsUnsafeArrayOperations() {
        androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor memoryAccessor = MEMORY_ACCESSOR;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor memoryAccessor = MEMORY_ACCESSOR;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.supportsUnsafeByteBufferOperations();
    }

    static boolean determineAndroidSupportByAddressSize(java.lang.Class<?> addressClass) {
        if (!androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice()) {
            return false;
        }
        try {
            java.lang.Class<?> cls = MEMORY_CLASS;
            cls.getMethod("peekLong", addressClass, java.lang.Boolean.TYPE);
            cls.getMethod("pokeLong", addressClass, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls.getMethod("pokeInt", addressClass, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            cls.getMethod("peekInt", addressClass, java.lang.Boolean.TYPE);
            cls.getMethod("pokeByte", addressClass, java.lang.Byte.TYPE);
            cls.getMethod("peekByte", addressClass);
            cls.getMethod("pokeByteArray", addressClass, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            cls.getMethod("peekByteArray", addressClass, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field bufferAddressField() {
        java.lang.reflect.Field field;
        if (androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice() && (field = field(java.nio.Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        java.lang.reflect.Field field2 = field(java.nio.Buffer.class, org.jacoco.core.runtime.AgentOptions.ADDRESS);
        if (field2 == null || field2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return field2;
    }

    private static int firstDifferingByteIndexNativeEndian(long left, long right) {
        int iNumberOfTrailingZeros;
        if (IS_BIG_ENDIAN) {
            iNumberOfTrailingZeros = java.lang.Long.numberOfLeadingZeros(left ^ right);
        } else {
            iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(left ^ right);
        }
        return iNumberOfTrailingZeros >> 3;
    }

    static int mismatch(byte[] left, int leftOff, byte[] right, int rightOff, int length) {
        if (leftOff < 0 || rightOff < 0 || length < 0 || leftOff + length > left.length || rightOff + length > right.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        int i = 0;
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            for (int i2 = (BYTE_ARRAY_ALIGNMENT + leftOff) & 7; i < length && (i2 & 7) != 0; i2++) {
                if (left[leftOff + i] != right[rightOff + i]) {
                    return i;
                }
                i++;
            }
            int i3 = ((length - i) & (-8)) + i;
            while (i < i3) {
                long j = BYTE_ARRAY_BASE_OFFSET;
                long j2 = i;
                long j3 = getLong((java.lang.Object) left, ((long) leftOff) + j + j2);
                long j4 = getLong((java.lang.Object) right, j + ((long) rightOff) + j2);
                if (j3 != j4) {
                    return i + firstDifferingByteIndexNativeEndian(j3, j4);
                }
                i += 8;
            }
        }
        while (i < length) {
            if (left[leftOff + i] != right[rightOff + i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static long fieldOffset(java.lang.reflect.Field field) {
        androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor memoryAccessor;
        if (field == null || (memoryAccessor = MEMORY_ACCESSOR) == null) {
            return -1L;
        }
        return memoryAccessor.objectFieldOffset(field);
    }

    private static java.lang.reflect.Field field(java.lang.Class<?> clazz, java.lang.String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static abstract class MemoryAccessor {
        sun.misc.Unsafe unsafe;

        public abstract void copyMemory(long srcOffset, byte[] target, long targetIndex, long length);

        public abstract void copyMemory(byte[] src, long srcIndex, long targetOffset, long length);

        public abstract boolean getBoolean(java.lang.Object target, long offset);

        public abstract byte getByte(long address);

        public abstract byte getByte(java.lang.Object target, long offset);

        public abstract double getDouble(java.lang.Object target, long offset);

        public abstract float getFloat(java.lang.Object target, long offset);

        public abstract int getInt(long address);

        public abstract long getLong(long address);

        public abstract java.lang.Object getStaticObject(java.lang.reflect.Field field);

        public abstract void putBoolean(java.lang.Object target, long offset, boolean value);

        public abstract void putByte(long address, byte value);

        public abstract void putByte(java.lang.Object target, long offset, byte value);

        public abstract void putDouble(java.lang.Object target, long offset, double value);

        public abstract void putFloat(java.lang.Object target, long offset, float value);

        public abstract void putInt(long address, int value);

        public abstract void putLong(long address, long value);

        MemoryAccessor(sun.misc.Unsafe unsafe) {
            this.unsafe = unsafe;
        }

        public final long objectFieldOffset(java.lang.reflect.Field field) {
            return this.unsafe.objectFieldOffset(field);
        }

        public final int arrayBaseOffset(java.lang.Class<?> clazz) {
            return this.unsafe.arrayBaseOffset(clazz);
        }

        public final int arrayIndexScale(java.lang.Class<?> clazz) {
            return this.unsafe.arrayIndexScale(clazz);
        }

        public boolean supportsUnsafeArrayOperations() {
            sun.misc.Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", java.lang.Class.class);
                cls.getMethod("arrayIndexScale", java.lang.Class.class);
                cls.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putLong", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
                cls.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
                return true;
            } catch (java.lang.Throwable th) {
                androidx.datastore.preferences.protobuf.UnsafeUtil.logMissingMethod(th);
                return false;
            }
        }

        public final int getInt(java.lang.Object target, long offset) {
            return this.unsafe.getInt(target, offset);
        }

        public final void putInt(java.lang.Object target, long offset, int value) {
            this.unsafe.putInt(target, offset, value);
        }

        public final long getLong(java.lang.Object target, long offset) {
            return this.unsafe.getLong(target, offset);
        }

        public final void putLong(java.lang.Object target, long offset, long value) {
            this.unsafe.putLong(target, offset, value);
        }

        public final java.lang.Object getObject(java.lang.Object target, long offset) {
            return this.unsafe.getObject(target, offset);
        }

        public final void putObject(java.lang.Object target, long offset, java.lang.Object value) {
            this.unsafe.putObject(target, offset, value);
        }

        public boolean supportsUnsafeByteBufferOperations() {
            sun.misc.Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                return androidx.datastore.preferences.protobuf.UnsafeUtil.bufferAddressField() != null;
            } catch (java.lang.Throwable th) {
                androidx.datastore.preferences.protobuf.UnsafeUtil.logMissingMethod(th);
                return false;
            }
        }
    }

    private static final class JvmMemoryAccessor extends androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor {
        JvmMemoryAccessor(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public java.lang.Object getStaticObject(java.lang.reflect.Field field) {
            return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                java.lang.Class<?> cls = this.unsafe.getClass();
                cls.getMethod("getByte", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putByte", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Byte.TYPE);
                cls.getMethod("getBoolean", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putBoolean", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
                cls.getMethod("getFloat", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putFloat", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Float.TYPE);
                cls.getMethod("getDouble", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putDouble", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Double.TYPE);
                return true;
            } catch (java.lang.Throwable th) {
                androidx.datastore.preferences.protobuf.UnsafeUtil.logMissingMethod(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(java.lang.Object target, long offset) {
            return this.unsafe.getByte(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(java.lang.Object target, long offset, byte value) {
            this.unsafe.putByte(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(java.lang.Object target, long offset) {
            return this.unsafe.getBoolean(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(java.lang.Object target, long offset, boolean value) {
            this.unsafe.putBoolean(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(java.lang.Object target, long offset) {
            return this.unsafe.getFloat(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(java.lang.Object target, long offset, float value) {
            this.unsafe.putFloat(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(java.lang.Object target, long offset) {
            return this.unsafe.getDouble(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(java.lang.Object target, long offset, double value) {
            this.unsafe.putDouble(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            if (!super.supportsUnsafeByteBufferOperations()) {
                return false;
            }
            try {
                java.lang.Class<?> cls = this.unsafe.getClass();
                cls.getMethod("getByte", java.lang.Long.TYPE);
                cls.getMethod("putByte", java.lang.Long.TYPE, java.lang.Byte.TYPE);
                cls.getMethod("getInt", java.lang.Long.TYPE);
                cls.getMethod("putInt", java.lang.Long.TYPE, java.lang.Integer.TYPE);
                cls.getMethod("getLong", java.lang.Long.TYPE);
                cls.getMethod("putLong", java.lang.Long.TYPE, java.lang.Long.TYPE);
                cls.getMethod("copyMemory", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                cls.getMethod("copyMemory", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
                return true;
            } catch (java.lang.Throwable th) {
                androidx.datastore.preferences.protobuf.UnsafeUtil.logMissingMethod(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long address) {
            return this.unsafe.getByte(address);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long address, byte value) {
            this.unsafe.putByte(address, value);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long address) {
            return this.unsafe.getInt(address);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long address, int value) {
            this.unsafe.putInt(address, value);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long address) {
            return this.unsafe.getLong(address);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long address, long value) {
            this.unsafe.putLong(address, value);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            this.unsafe.copyMemory((java.lang.Object) null, srcOffset, target, androidx.datastore.preferences.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + targetIndex, length);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            this.unsafe.copyMemory(src, androidx.datastore.preferences.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + srcIndex, (java.lang.Object) null, targetOffset, length);
        }
    }

    private static final class Android64MemoryAccessor extends androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        Android64MemoryAccessor(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public java.lang.Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (java.lang.IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(java.lang.Object target, long offset) {
            return androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN ? androidx.datastore.preferences.protobuf.UnsafeUtil.getByteBigEndian(target, offset) : androidx.datastore.preferences.protobuf.UnsafeUtil.getByteLittleEndian(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(java.lang.Object target, long offset, byte value) {
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN) {
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByteBigEndian(target, offset, value);
            } else {
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByteLittleEndian(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(java.lang.Object target, long offset) {
            return androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN ? androidx.datastore.preferences.protobuf.UnsafeUtil.getBooleanBigEndian(target, offset) : androidx.datastore.preferences.protobuf.UnsafeUtil.getBooleanLittleEndian(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(java.lang.Object target, long offset, boolean value) {
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN) {
                androidx.datastore.preferences.protobuf.UnsafeUtil.putBooleanBigEndian(target, offset, value);
            } else {
                androidx.datastore.preferences.protobuf.UnsafeUtil.putBooleanLittleEndian(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(java.lang.Object target, long offset) {
            return java.lang.Float.intBitsToFloat(getInt(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(java.lang.Object target, long offset, float value) {
            putInt(target, offset, java.lang.Float.floatToIntBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(java.lang.Object target, long offset) {
            return java.lang.Double.longBitsToDouble(getLong(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(java.lang.Object target, long offset, double value) {
            putLong(target, offset, java.lang.Double.doubleToLongBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long address) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long address, byte value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long address) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long address, int value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long address) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long address, long value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static final class Android32MemoryAccessor extends androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor {
        private static final long SMALL_ADDRESS_MASK = -1;

        private static int smallAddress(long address) {
            return (int) (address & (-1));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        Android32MemoryAccessor(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public java.lang.Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (java.lang.IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(java.lang.Object target, long offset) {
            return androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN ? androidx.datastore.preferences.protobuf.UnsafeUtil.getByteBigEndian(target, offset) : androidx.datastore.preferences.protobuf.UnsafeUtil.getByteLittleEndian(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(java.lang.Object target, long offset, byte value) {
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN) {
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByteBigEndian(target, offset, value);
            } else {
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByteLittleEndian(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(java.lang.Object target, long offset) {
            return androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN ? androidx.datastore.preferences.protobuf.UnsafeUtil.getBooleanBigEndian(target, offset) : androidx.datastore.preferences.protobuf.UnsafeUtil.getBooleanLittleEndian(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(java.lang.Object target, long offset, boolean value) {
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN) {
                androidx.datastore.preferences.protobuf.UnsafeUtil.putBooleanBigEndian(target, offset, value);
            } else {
                androidx.datastore.preferences.protobuf.UnsafeUtil.putBooleanLittleEndian(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(java.lang.Object target, long offset) {
            return java.lang.Float.intBitsToFloat(getInt(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(java.lang.Object target, long offset, float value) {
            putInt(target, offset, java.lang.Float.floatToIntBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(java.lang.Object target, long offset) {
            return java.lang.Double.longBitsToDouble(getLong(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(java.lang.Object target, long offset, double value) {
            putLong(target, offset, java.lang.Double.doubleToLongBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long address) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long address, byte value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long address) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long address, int value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long address) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long address, long value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(java.lang.Object target, long offset) {
        return (byte) ((getInt(target, (-4) & offset) >>> ((int) (((~offset) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(java.lang.Object target, long offset) {
        return (byte) ((getInt(target, (-4) & offset) >>> ((int) ((offset & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(java.lang.Object target, long offset, byte value) {
        long j = (-4) & offset;
        int i = getInt(target, j);
        int i2 = ((~((int) offset)) & 3) << 3;
        putInt(target, j, ((255 & value) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(java.lang.Object target, long offset, byte value) {
        long j = (-4) & offset;
        int i = (((int) offset) & 3) << 3;
        putInt(target, j, ((255 & value) << i) | (getInt(target, j) & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(java.lang.Object target, long offset) {
        return getByteBigEndian(target, offset) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(java.lang.Object target, long offset) {
        return getByteLittleEndian(target, offset) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(java.lang.Object obj, long j, boolean z) {
        putByteBigEndian(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(java.lang.Object obj, long j, boolean z) {
        putByteLittleEndian(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(java.lang.Throwable e) {
        java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.UnsafeUtil.class.getName()).log(java.util.logging.Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + e);
    }
}

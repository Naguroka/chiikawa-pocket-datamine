package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final java.nio.ByteBuffer EMPTY_BYTE_BUFFER;
    public static final androidx.datastore.preferences.protobuf.CodedInputStream EMPTY_CODED_INPUT_STREAM;
    static final java.nio.charset.Charset US_ASCII = java.nio.charset.Charset.forName("US-ASCII");
    static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
    static final java.nio.charset.Charset ISO_8859_1 = java.nio.charset.Charset.forName("ISO-8859-1");

    public interface BooleanList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Boolean> {
        void addBoolean(boolean element);

        boolean getBoolean(int index);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Boolean> mutableCopyWithCapacity2(int capacity);

        boolean setBoolean(int index, boolean element);
    }

    public interface DoubleList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Double> {
        void addDouble(double element);

        double getDouble(int index);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Double> mutableCopyWithCapacity2(int capacity);

        double setDouble(int index, double element);
    }

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends androidx.datastore.preferences.protobuf.Internal.EnumLite> {
        T findValueByNumber(int number);
    }

    public interface EnumVerifier {
        boolean isInRange(int number);
    }

    public interface FloatList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Float> {
        void addFloat(float element);

        float getFloat(int index);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Float> mutableCopyWithCapacity2(int capacity);

        float setFloat(int index, float element);
    }

    public interface IntList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Integer> {
        void addInt(int element);

        int getInt(int index);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Integer> mutableCopyWithCapacity2(int capacity);

        int setInt(int index, int element);
    }

    public interface LongList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Long> {
        void addLong(long element);

        long getLong(int index);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Long> mutableCopyWithCapacity2(int capacity);

        long setLong(int index, long element);
    }

    public interface ProtobufList<E> extends java.util.List<E>, java.util.RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> mutableCopyWithCapacity2(int capacity);
    }

    public static int hashBoolean(boolean b) {
        return b ? 1231 : 1237;
    }

    public static int hashLong(long n) {
        return (int) (n ^ (n >>> 32));
    }

    private Internal() {
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = java.nio.ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(bArr);
    }

    static <T> T checkNotNull(T obj) {
        obj.getClass();
        return obj;
    }

    static <T> T checkNotNull(T obj, java.lang.String message) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(message);
    }

    public static java.lang.String stringDefaultValue(java.lang.String bytes) {
        return new java.lang.String(bytes.getBytes(ISO_8859_1), UTF_8);
    }

    public static androidx.datastore.preferences.protobuf.ByteString bytesDefaultValue(java.lang.String bytes) {
        return androidx.datastore.preferences.protobuf.ByteString.copyFrom(bytes.getBytes(ISO_8859_1));
    }

    public static byte[] byteArrayDefaultValue(java.lang.String bytes) {
        return bytes.getBytes(ISO_8859_1);
    }

    public static java.nio.ByteBuffer byteBufferDefaultValue(java.lang.String bytes) {
        return java.nio.ByteBuffer.wrap(byteArrayDefaultValue(bytes));
    }

    public static java.nio.ByteBuffer copyByteBuffer(java.nio.ByteBuffer source) {
        java.nio.ByteBuffer byteBufferDuplicate = source.duplicate();
        byteBufferDuplicate.clear();
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBufferDuplicate.capacity());
        byteBufferAllocate.put(byteBufferDuplicate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static boolean isValidUtf8(androidx.datastore.preferences.protobuf.ByteString byteString) {
        return byteString.isValidUtf8();
    }

    public static boolean isValidUtf8(byte[] byteArray) {
        return androidx.datastore.preferences.protobuf.Utf8.isValidUtf8(byteArray);
    }

    public static byte[] toByteArray(java.lang.String value) {
        return value.getBytes(UTF_8);
    }

    public static java.lang.String toStringUtf8(byte[] bytes) {
        return new java.lang.String(bytes, UTF_8);
    }

    public static int hashEnum(androidx.datastore.preferences.protobuf.Internal.EnumLite e) {
        return e.getNumber();
    }

    public static int hashEnumList(java.util.List<? extends androidx.datastore.preferences.protobuf.Internal.EnumLite> list) {
        java.util.Iterator<? extends androidx.datastore.preferences.protobuf.Internal.EnumLite> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    public static boolean equals(java.util.List<byte[]> a2, java.util.List<byte[]> b) {
        if (a2.size() != b.size()) {
            return false;
        }
        for (int i = 0; i < a2.size(); i++) {
            if (!java.util.Arrays.equals(a2.get(i), b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(java.util.List<byte[]> list) {
        java.util.Iterator<byte[]> it = list.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + hashCode(it.next());
        }
        return iHashCode;
    }

    public static int hashCode(byte[] bytes) {
        return hashCode(bytes, 0, bytes.length);
    }

    static int hashCode(byte[] bytes, int offset, int length) {
        int iPartialHash = partialHash(length, bytes, offset, length);
        if (iPartialHash == 0) {
            return 1;
        }
        return iPartialHash;
    }

    static int partialHash(int h, byte[] bytes, int offset, int length) {
        for (int i = offset; i < offset + length; i++) {
            h = (h * 31) + bytes[i];
        }
        return h;
    }

    public static boolean equalsByteBuffer(java.nio.ByteBuffer a2, java.nio.ByteBuffer b) {
        if (a2.capacity() != b.capacity()) {
            return false;
        }
        java.nio.ByteBuffer byteBufferDuplicate = a2.duplicate();
        androidx.datastore.preferences.protobuf.Java8Compatibility.clear(byteBufferDuplicate);
        java.nio.ByteBuffer byteBufferDuplicate2 = b.duplicate();
        androidx.datastore.preferences.protobuf.Java8Compatibility.clear(byteBufferDuplicate2);
        return byteBufferDuplicate.equals(byteBufferDuplicate2);
    }

    public static boolean equalsByteBuffer(java.util.List<java.nio.ByteBuffer> a2, java.util.List<java.nio.ByteBuffer> b) {
        if (a2.size() != b.size()) {
            return false;
        }
        for (int i = 0; i < a2.size(); i++) {
            if (!equalsByteBuffer(a2.get(i), b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCodeByteBuffer(java.util.List<java.nio.ByteBuffer> list) {
        java.util.Iterator<java.nio.ByteBuffer> it = list.iterator();
        int iHashCodeByteBuffer = 1;
        while (it.hasNext()) {
            iHashCodeByteBuffer = (iHashCodeByteBuffer * 31) + hashCodeByteBuffer(it.next());
        }
        return iHashCodeByteBuffer;
    }

    public static int hashCodeByteBuffer(java.nio.ByteBuffer bytes) {
        if (bytes.hasArray()) {
            int iPartialHash = partialHash(bytes.capacity(), bytes.array(), bytes.arrayOffset(), bytes.capacity());
            if (iPartialHash == 0) {
                return 1;
            }
            return iPartialHash;
        }
        int iCapacity = bytes.capacity() <= 4096 ? bytes.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        java.nio.ByteBuffer byteBufferDuplicate = bytes.duplicate();
        androidx.datastore.preferences.protobuf.Java8Compatibility.clear(byteBufferDuplicate);
        int iCapacity2 = bytes.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = partialHash(iCapacity2, bArr, 0, iRemaining);
        }
        if (iCapacity2 == 0) {
            return 1;
        }
        return iCapacity2;
    }

    public static <T extends androidx.datastore.preferences.protobuf.MessageLite> T getDefaultInstance(java.lang.Class<T> clazz) {
        try {
            java.lang.reflect.Method method = clazz.getMethod("getDefaultInstance", new java.lang.Class[0]);
            return (T) method.invoke(method, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Failed to get default instance for " + clazz, e);
        }
    }

    static java.lang.Object mergeMessage(java.lang.Object destination, java.lang.Object source) {
        return ((androidx.datastore.preferences.protobuf.MessageLite) destination).toBuilder().mergeFrom((androidx.datastore.preferences.protobuf.MessageLite) source).buildPartial();
    }

    public static class IntListAdapter<T> extends java.util.AbstractList<T> {
        private final androidx.datastore.preferences.protobuf.Internal.IntListAdapter.IntConverter<T> converter;
        private final androidx.datastore.preferences.protobuf.Internal.IntList fromList;

        public interface IntConverter<T> {
            T convert(int from);
        }

        public IntListAdapter(androidx.datastore.preferences.protobuf.Internal.IntList fromList, androidx.datastore.preferences.protobuf.Internal.IntListAdapter.IntConverter<T> converter) {
            this.fromList = fromList;
            this.converter = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int index) {
            return this.converter.convert(this.fromList.getInt(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    public static class ListAdapter<F, T> extends java.util.AbstractList<T> {
        private final androidx.datastore.preferences.protobuf.Internal.ListAdapter.Converter<F, T> converter;
        private final java.util.List<F> fromList;

        public interface Converter<F, T> {
            T convert(F from);
        }

        public ListAdapter(java.util.List<F> fromList, androidx.datastore.preferences.protobuf.Internal.ListAdapter.Converter<F, T> converter) {
            this.fromList = fromList;
            this.converter = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return (T) this.converter.convert(this.fromList.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    public static class MapAdapter<K, V, RealValue> extends java.util.AbstractMap<K, V> {
        private final java.util.Map<K, RealValue> realMap;
        private final androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter<RealValue, V> valueConverter;

        public interface Converter<A, B> {
            A doBackward(B object);

            B doForward(A object);
        }

        public static <T extends androidx.datastore.preferences.protobuf.Internal.EnumLite> androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter<java.lang.Integer, T> newEnumConverter(final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<T> enumLiteMap, final T t) {
            return (androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter<java.lang.Integer, T>) new androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter<java.lang.Integer, T>() { // from class: androidx.datastore.preferences.protobuf.Internal.MapAdapter.1
                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
                @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
                public androidx.datastore.preferences.protobuf.Internal.EnumLite doForward(java.lang.Integer value) {
                    androidx.datastore.preferences.protobuf.Internal.EnumLite enumLiteFindValueByNumber = enumLiteMap.findValueByNumber(value.intValue());
                    return enumLiteFindValueByNumber == null ? t : enumLiteFindValueByNumber;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
                @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
                public java.lang.Integer doBackward(androidx.datastore.preferences.protobuf.Internal.EnumLite value) {
                    return java.lang.Integer.valueOf(value.getNumber());
                }
            };
        }

        public MapAdapter(java.util.Map<K, RealValue> realMap, androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter<RealValue, V> valueConverter) {
            this.realMap = realMap;
            this.valueConverter = valueConverter;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(java.lang.Object key) {
            RealValue realvalue = this.realMap.get(key);
            if (realvalue == null) {
                return null;
            }
            return this.valueConverter.doForward(realvalue);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            RealValue realvaluePut = this.realMap.put(k, this.valueConverter.doBackward(v));
            if (realvaluePut == null) {
                return null;
            }
            return this.valueConverter.doForward(realvaluePut);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            return new androidx.datastore.preferences.protobuf.Internal.MapAdapter.SetAdapter(this.realMap.entrySet());
        }

        private class SetAdapter extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
            private final java.util.Set<java.util.Map.Entry<K, RealValue>> realSet;

            public SetAdapter(java.util.Set<java.util.Map.Entry<K, RealValue>> realSet) {
                this.realSet = realSet;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                return new androidx.datastore.preferences.protobuf.Internal.MapAdapter.IteratorAdapter(this.realSet.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.realSet.size();
            }
        }

        private class IteratorAdapter implements java.util.Iterator<java.util.Map.Entry<K, V>> {
            private final java.util.Iterator<java.util.Map.Entry<K, RealValue>> realIterator;

            public IteratorAdapter(java.util.Iterator<java.util.Map.Entry<K, RealValue>> realIterator) {
                this.realIterator = realIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.realIterator.hasNext();
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, V> next() {
                return new androidx.datastore.preferences.protobuf.Internal.MapAdapter.EntryAdapter(this.realIterator.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.realIterator.remove();
            }
        }

        private class EntryAdapter implements java.util.Map.Entry<K, V> {
            private final java.util.Map.Entry<K, RealValue> realEntry;

            public EntryAdapter(java.util.Map.Entry<K, RealValue> realEntry) {
                this.realEntry = realEntry;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.realEntry.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) androidx.datastore.preferences.protobuf.Internal.MapAdapter.this.valueConverter.doForward(this.realEntry.getValue());
            }

            @Override // java.util.Map.Entry
            public V setValue(V v) {
                RealValue value = this.realEntry.setValue((RealValue) androidx.datastore.preferences.protobuf.Internal.MapAdapter.this.valueConverter.doBackward(v));
                if (value == null) {
                    return null;
                }
                return (V) androidx.datastore.preferences.protobuf.Internal.MapAdapter.this.valueConverter.doForward(value);
            }

            @Override // java.util.Map.Entry
            public boolean equals(java.lang.Object o) {
                if (o == this) {
                    return true;
                }
                if (o instanceof java.util.Map.Entry) {
                    return getKey().equals(((java.util.Map.Entry) o).getKey()) && getValue().equals(getValue());
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.realEntry.hashCode();
            }
        }
    }
}

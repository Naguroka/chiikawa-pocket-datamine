package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class FieldSet<T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> {
    private static final androidx.datastore.preferences.protobuf.FieldSet<?> DEFAULT_INSTANCE = new androidx.datastore.preferences.protobuf.FieldSet<>(true);
    private final androidx.datastore.preferences.protobuf.SmallSortedMap<T, java.lang.Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    public interface FieldDescriptorLite<T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> extends java.lang.Comparable<T> {
        androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> getEnumType();

        androidx.datastore.preferences.protobuf.WireFormat.JavaType getLiteJavaType();

        androidx.datastore.preferences.protobuf.WireFormat.FieldType getLiteType();

        int getNumber();

        androidx.datastore.preferences.protobuf.MessageLite.Builder internalMergeFrom(androidx.datastore.preferences.protobuf.MessageLite.Builder to, androidx.datastore.preferences.protobuf.MessageLite from);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ FieldSet(androidx.datastore.preferences.protobuf.SmallSortedMap smallSortedMap, androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1 anonymousClass1) {
        this(smallSortedMap);
    }

    private FieldSet() {
        this.fields = androidx.datastore.preferences.protobuf.SmallSortedMap.newFieldMap();
    }

    private FieldSet(final boolean dummy) {
        this(androidx.datastore.preferences.protobuf.SmallSortedMap.newFieldMap());
        makeImmutable();
    }

    private FieldSet(androidx.datastore.preferences.protobuf.SmallSortedMap<T, java.lang.Object> fields) {
        this.fields = fields;
        makeImmutable();
    }

    public static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> androidx.datastore.preferences.protobuf.FieldSet<T> newFieldSet() {
        return new androidx.datastore.preferences.protobuf.FieldSet<>();
    }

    public static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> androidx.datastore.preferences.protobuf.FieldSet<T> emptySet() {
        return (androidx.datastore.preferences.protobuf.FieldSet<T>) DEFAULT_INSTANCE;
    }

    public static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> androidx.datastore.preferences.protobuf.FieldSet.Builder<T> newBuilder() {
        return new androidx.datastore.preferences.protobuf.FieldSet.Builder<>((androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1) null);
    }

    boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            java.util.Map.Entry<K, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            if (arrayEntryAt.getValue() instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite) {
                ((androidx.datastore.preferences.protobuf.GeneratedMessageLite) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof androidx.datastore.preferences.protobuf.FieldSet) {
            return this.fields.equals(((androidx.datastore.preferences.protobuf.FieldSet) o).fields);
        }
        return false;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public androidx.datastore.preferences.protobuf.FieldSet<T> m46clone() {
        androidx.datastore.preferences.protobuf.FieldSet<T> fieldSetNewFieldSet = newFieldSet();
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            java.util.Map.Entry<K, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            fieldSetNewFieldSet.setField((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            fieldSetNewFieldSet.setField((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSetNewFieldSet.hasLazyField = this.hasLazyField;
        return fieldSetNewFieldSet;
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public java.util.Map<T, java.lang.Object> getAllFields() {
        if (!this.hasLazyField) {
            return this.fields.isImmutable() ? this.fields : java.util.Collections.unmodifiableMap(this.fields);
        }
        androidx.datastore.preferences.protobuf.SmallSortedMap smallSortedMapCloneAllFieldsMap = cloneAllFieldsMap(this.fields, false, true);
        if (this.fields.isImmutable()) {
            smallSortedMapCloneAllFieldsMap.makeImmutable();
        }
        return smallSortedMapCloneAllFieldsMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> androidx.datastore.preferences.protobuf.SmallSortedMap<T, java.lang.Object> cloneAllFieldsMap(androidx.datastore.preferences.protobuf.SmallSortedMap<T, java.lang.Object> fields, boolean copyList, boolean resolveLazyFields) {
        androidx.datastore.preferences.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMapNewFieldMap = androidx.datastore.preferences.protobuf.SmallSortedMap.newFieldMap();
        int numArrayEntries = fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            cloneFieldEntry(smallSortedMapNewFieldMap, fields.getArrayEntryAt(i), copyList, resolveLazyFields);
        }
        java.util.Iterator it = fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(smallSortedMapNewFieldMap, (java.util.Map.Entry) it.next(), copyList, resolveLazyFields);
        }
        return smallSortedMapNewFieldMap;
    }

    private static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> void cloneFieldEntry(java.util.Map<T, java.lang.Object> map, java.util.Map.Entry<T, java.lang.Object> entry, boolean copyList, boolean resolveLazyFields) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (resolveLazyFields && (value instanceof androidx.datastore.preferences.protobuf.LazyField)) {
            map.put(key, ((androidx.datastore.preferences.protobuf.LazyField) value).getValue());
        } else if (copyList && (value instanceof java.util.List)) {
            map.put(key, new java.util.ArrayList((java.util.List) value));
        } else {
            map.put(key, value);
        }
    }

    public java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> iterator() {
        if (isEmpty()) {
            return java.util.Collections.emptyIterator();
        }
        if (this.hasLazyField) {
            return new androidx.datastore.preferences.protobuf.LazyField.LazyIterator(this.fields.entrySet().iterator());
        }
        return this.fields.entrySet().iterator();
    }

    java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> descendingIterator() {
        if (isEmpty()) {
            return java.util.Collections.emptyIterator();
        }
        if (this.hasLazyField) {
            return new androidx.datastore.preferences.protobuf.LazyField.LazyIterator(this.fields.descendingEntrySet().iterator());
        }
        return this.fields.descendingEntrySet().iterator();
    }

    public boolean hasField(final T descriptor) {
        if (descriptor.isRepeated()) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(descriptor) != null;
    }

    public java.lang.Object getField(final T descriptor) {
        java.lang.Object obj = this.fields.get(descriptor);
        return obj instanceof androidx.datastore.preferences.protobuf.LazyField ? ((androidx.datastore.preferences.protobuf.LazyField) obj).getValue() : obj;
    }

    public void setField(T t, java.lang.Object obj) {
        if (t.isRepeated()) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                verifyType(t, it.next());
            }
            obj = arrayList;
        } else {
            verifyType(t, obj);
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put(t, obj);
    }

    public void clearField(final T descriptor) {
        this.fields.remove(descriptor);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public int getRepeatedFieldCount(final T descriptor) {
        if (!descriptor.isRepeated()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object field = getField(descriptor);
        if (field == null) {
            return 0;
        }
        return ((java.util.List) field).size();
    }

    public java.lang.Object getRepeatedField(final T descriptor, final int index) {
        if (!descriptor.isRepeated()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object field = getField(descriptor);
        if (field == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return ((java.util.List) field).get(index);
    }

    public void setRepeatedField(final T descriptor, final int index, final java.lang.Object value) {
        if (!descriptor.isRepeated()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object field = getField(descriptor);
        if (field == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        verifyType(descriptor, value);
        ((java.util.List) field).set(index, value);
    }

    public void addRepeatedField(final T descriptor, final java.lang.Object value) {
        java.util.List arrayList;
        if (!descriptor.isRepeated()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(descriptor, value);
        java.lang.Object field = getField(descriptor);
        if (field == null) {
            arrayList = new java.util.ArrayList();
            this.fields.put(descriptor, arrayList);
        } else {
            arrayList = (java.util.List) field;
        }
        arrayList.add(value);
    }

    private void verifyType(final T descriptor, final java.lang.Object value) {
        if (!isValidType(descriptor.getLiteType(), value)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(descriptor.getNumber()), descriptor.getLiteType().getJavaType(), value.getClass().getName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(final androidx.datastore.preferences.protobuf.WireFormat.FieldType type, final java.lang.Object value) {
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(value);
        switch (androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[type.getJavaType().ordinal()]) {
            case 1:
                return value instanceof java.lang.Integer;
            case 2:
                return value instanceof java.lang.Long;
            case 3:
                return value instanceof java.lang.Float;
            case 4:
                return value instanceof java.lang.Double;
            case 5:
                return value instanceof java.lang.Boolean;
            case 6:
                return value instanceof java.lang.String;
            case 7:
                return (value instanceof androidx.datastore.preferences.protobuf.ByteString) || (value instanceof byte[]);
            case 8:
                return (value instanceof java.lang.Integer) || (value instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite);
            case 9:
                return (value instanceof androidx.datastore.preferences.protobuf.MessageLite) || (value instanceof androidx.datastore.preferences.protobuf.LazyField);
            default:
                return false;
        }
    }

    public boolean isInitialized() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> boolean isInitialized(final java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            java.util.List list = (java.util.List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!isMessageFieldValueInitialized(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private static boolean isMessageFieldValueInitialized(java.lang.Object value) {
        if (value instanceof androidx.datastore.preferences.protobuf.MessageLiteOrBuilder) {
            return ((androidx.datastore.preferences.protobuf.MessageLiteOrBuilder) value).isInitialized();
        }
        if (value instanceof androidx.datastore.preferences.protobuf.LazyField) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    static int getWireFormatForFieldType(final androidx.datastore.preferences.protobuf.WireFormat.FieldType type, boolean isPacked) {
        if (isPacked) {
            return 2;
        }
        return type.getWireType();
    }

    public void mergeFrom(final androidx.datastore.preferences.protobuf.FieldSet<T> other) {
        int numArrayEntries = other.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            mergeFromField(other.fields.getArrayEntryAt(i));
        }
        java.util.Iterator it = other.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField((java.util.Map.Entry) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object cloneIfMutable(java.lang.Object value) {
        if (!(value instanceof byte[])) {
            return value;
        }
        byte[] bArr = (byte[]) value;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void mergeFromField(final java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        boolean z = value instanceof androidx.datastore.preferences.protobuf.LazyField;
        if (key.isRepeated()) {
            if (z) {
                throw new java.lang.IllegalStateException("Lazy fields can not be repeated");
            }
            java.lang.Object field = getField(key);
            if (field == null) {
                field = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put(key, field);
            return;
        }
        if (key.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE) {
            if (z) {
                throw new java.lang.IllegalStateException("Lazy fields must be message-valued");
            }
            this.fields.put(key, cloneIfMutable(value));
            return;
        }
        java.lang.Object field2 = getField(key);
        if (field2 == null) {
            this.fields.put(key, cloneIfMutable(value));
            if (z) {
                this.hasLazyField = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((androidx.datastore.preferences.protobuf.LazyField) value).getValue();
        }
        this.fields.put(key, key.internalMergeFrom(((androidx.datastore.preferences.protobuf.MessageLite) field2).toBuilder(), (androidx.datastore.preferences.protobuf.MessageLite) value).build());
    }

    public static java.lang.Object readPrimitiveField(androidx.datastore.preferences.protobuf.CodedInputStream input, final androidx.datastore.preferences.protobuf.WireFormat.FieldType type, boolean checkUtf8) throws java.io.IOException {
        if (checkUtf8) {
            return androidx.datastore.preferences.protobuf.WireFormat.readPrimitiveField(input, type, androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.STRICT);
        }
        return androidx.datastore.preferences.protobuf.WireFormat.readPrimitiveField(input, type, androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.LOOSE);
    }

    public void writeTo(final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            java.util.Map.Entry<K, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            writeField((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue(), output);
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            writeField((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue(), output);
        }
    }

    public void writeMessageSetTo(final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i), output);
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo((java.util.Map.Entry) it.next(), output);
        }
    }

    private void writeMessageSetTo(final java.util.Map.Entry<T, java.lang.Object> entry, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            java.lang.Object value = entry.getValue();
            if (value instanceof androidx.datastore.preferences.protobuf.LazyField) {
                output.writeRawMessageSetExtension(entry.getKey().getNumber(), ((androidx.datastore.preferences.protobuf.LazyField) value).toByteString());
                return;
            } else {
                output.writeMessageSetExtension(entry.getKey().getNumber(), (androidx.datastore.preferences.protobuf.MessageLite) value);
                return;
            }
        }
        writeField(key, entry.getValue(), output);
    }

    static void writeElement(final androidx.datastore.preferences.protobuf.CodedOutputStream output, final androidx.datastore.preferences.protobuf.WireFormat.FieldType type, final int number, final java.lang.Object value) throws java.io.IOException {
        if (type == androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP) {
            output.writeGroup(number, (androidx.datastore.preferences.protobuf.MessageLite) value);
        } else {
            output.writeTag(number, getWireFormatForFieldType(type, false));
            writeElementNoTag(output, type, value);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[androidx.datastore.preferences.protobuf.WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[androidx.datastore.preferences.protobuf.WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[androidx.datastore.preferences.protobuf.WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[androidx.datastore.preferences.protobuf.WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[androidx.datastore.preferences.protobuf.WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[androidx.datastore.preferences.protobuf.WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
        }
    }

    static void writeElementNoTag(final androidx.datastore.preferences.protobuf.CodedOutputStream output, final androidx.datastore.preferences.protobuf.WireFormat.FieldType type, final java.lang.Object value) throws java.io.IOException {
        switch (androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[type.ordinal()]) {
            case 1:
                output.writeDoubleNoTag(((java.lang.Double) value).doubleValue());
                break;
            case 2:
                output.writeFloatNoTag(((java.lang.Float) value).floatValue());
                break;
            case 3:
                output.writeInt64NoTag(((java.lang.Long) value).longValue());
                break;
            case 4:
                output.writeUInt64NoTag(((java.lang.Long) value).longValue());
                break;
            case 5:
                output.writeInt32NoTag(((java.lang.Integer) value).intValue());
                break;
            case 6:
                output.writeFixed64NoTag(((java.lang.Long) value).longValue());
                break;
            case 7:
                output.writeFixed32NoTag(((java.lang.Integer) value).intValue());
                break;
            case 8:
                output.writeBoolNoTag(((java.lang.Boolean) value).booleanValue());
                break;
            case 9:
                output.writeGroupNoTag((androidx.datastore.preferences.protobuf.MessageLite) value);
                break;
            case 10:
                output.writeMessageNoTag((androidx.datastore.preferences.protobuf.MessageLite) value);
                break;
            case 11:
                if (value instanceof androidx.datastore.preferences.protobuf.ByteString) {
                    output.writeBytesNoTag((androidx.datastore.preferences.protobuf.ByteString) value);
                } else {
                    output.writeStringNoTag((java.lang.String) value);
                }
                break;
            case 12:
                if (value instanceof androidx.datastore.preferences.protobuf.ByteString) {
                    output.writeBytesNoTag((androidx.datastore.preferences.protobuf.ByteString) value);
                } else {
                    output.writeByteArrayNoTag((byte[]) value);
                }
                break;
            case 13:
                output.writeUInt32NoTag(((java.lang.Integer) value).intValue());
                break;
            case 14:
                output.writeSFixed32NoTag(((java.lang.Integer) value).intValue());
                break;
            case 15:
                output.writeSFixed64NoTag(((java.lang.Long) value).longValue());
                break;
            case 16:
                output.writeSInt32NoTag(((java.lang.Integer) value).intValue());
                break;
            case 17:
                output.writeSInt64NoTag(((java.lang.Long) value).longValue());
                break;
            case 18:
                if (value instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite) {
                    output.writeEnumNoTag(((androidx.datastore.preferences.protobuf.Internal.EnumLite) value).getNumber());
                } else {
                    output.writeEnumNoTag(((java.lang.Integer) value).intValue());
                }
                break;
        }
    }

    public static void writeField(final androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<?> descriptor, final java.lang.Object value, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.WireFormat.FieldType liteType = descriptor.getLiteType();
        int number = descriptor.getNumber();
        if (descriptor.isRepeated()) {
            java.util.List list = (java.util.List) value;
            int size = list.size();
            int i = 0;
            if (!descriptor.isPacked()) {
                while (i < size) {
                    writeElement(output, liteType, number, list.get(i));
                    i++;
                }
                return;
            } else {
                if (list.isEmpty()) {
                    return;
                }
                output.writeTag(number, 2);
                int iComputeElementSizeNoTag = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, list.get(i2));
                }
                output.writeUInt32NoTag(iComputeElementSizeNoTag);
                while (i < size) {
                    writeElementNoTag(output, liteType, list.get(i));
                    i++;
                }
                return;
            }
        }
        if (value instanceof androidx.datastore.preferences.protobuf.LazyField) {
            writeElement(output, liteType, number, ((androidx.datastore.preferences.protobuf.LazyField) value).getValue());
        } else {
            writeElement(output, liteType, number, value);
        }
    }

    public int getSerializedSize() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        int iComputeFieldSize = 0;
        for (int i = 0; i < numArrayEntries; i++) {
            java.util.Map.Entry<K, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            iComputeFieldSize += computeFieldSize((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            iComputeFieldSize += computeFieldSize((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public int getMessageSetSerializedSize() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        int messageSetSerializedSize = 0;
        for (int i = 0; i < numArrayEntries; i++) {
            messageSetSerializedSize += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i));
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            messageSetSerializedSize += getMessageSetSerializedSize((java.util.Map.Entry) it.next());
        }
        return messageSetSerializedSize;
    }

    private int getMessageSetSerializedSize(final java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (key.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof androidx.datastore.preferences.protobuf.LazyField) {
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (androidx.datastore.preferences.protobuf.LazyField) value);
            }
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (androidx.datastore.preferences.protobuf.MessageLite) value);
        }
        return computeFieldSize(key, value);
    }

    static int computeElementSize(final androidx.datastore.preferences.protobuf.WireFormat.FieldType type, final int number, final java.lang.Object value) {
        int iComputeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(number);
        if (type == androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + computeElementSizeNoTag(type, value);
    }

    static int computeElementSizeNoTag(final androidx.datastore.preferences.protobuf.WireFormat.FieldType type, final java.lang.Object value) {
        switch (androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[type.ordinal()]) {
            case 1:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeDoubleSizeNoTag(((java.lang.Double) value).doubleValue());
            case 2:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeFloatSizeNoTag(((java.lang.Float) value).floatValue());
            case 3:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(((java.lang.Long) value).longValue());
            case 4:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(((java.lang.Long) value).longValue());
            case 5:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(((java.lang.Integer) value).intValue());
            case 6:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64SizeNoTag(((java.lang.Long) value).longValue());
            case 7:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32SizeNoTag(((java.lang.Integer) value).intValue());
            case 8:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSizeNoTag(((java.lang.Boolean) value).booleanValue());
            case 9:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSizeNoTag((androidx.datastore.preferences.protobuf.MessageLite) value);
            case 10:
                if (value instanceof androidx.datastore.preferences.protobuf.LazyField) {
                    return androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag((androidx.datastore.preferences.protobuf.LazyField) value);
                }
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSizeNoTag((androidx.datastore.preferences.protobuf.MessageLite) value);
            case 11:
                if (value instanceof androidx.datastore.preferences.protobuf.ByteString) {
                    return androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag((androidx.datastore.preferences.protobuf.ByteString) value);
                }
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) value);
            case 12:
                if (value instanceof androidx.datastore.preferences.protobuf.ByteString) {
                    return androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag((androidx.datastore.preferences.protobuf.ByteString) value);
                }
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeByteArraySizeNoTag((byte[]) value);
            case 13:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(((java.lang.Integer) value).intValue());
            case 14:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(((java.lang.Integer) value).intValue());
            case 15:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(((java.lang.Long) value).longValue());
            case 16:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(((java.lang.Integer) value).intValue());
            case 17:
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(((java.lang.Long) value).longValue());
            case 18:
                if (value instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite) {
                    return androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(((androidx.datastore.preferences.protobuf.Internal.EnumLite) value).getNumber());
                }
                return androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(((java.lang.Integer) value).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(final androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<?> descriptor, final java.lang.Object value) {
        androidx.datastore.preferences.protobuf.WireFormat.FieldType liteType = descriptor.getLiteType();
        int number = descriptor.getNumber();
        if (descriptor.isRepeated()) {
            java.util.List list = (java.util.List) value;
            int size = list.size();
            int i = 0;
            if (!descriptor.isPacked()) {
                int iComputeElementSize = 0;
                while (i < size) {
                    iComputeElementSize += computeElementSize(liteType, number, list.get(i));
                    i++;
                }
                return iComputeElementSize;
            }
            if (list.isEmpty()) {
                return 0;
            }
            int iComputeElementSizeNoTag = 0;
            while (i < size) {
                iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, list.get(i));
                i++;
            }
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(number) + iComputeElementSizeNoTag + androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeElementSizeNoTag);
        }
        return computeElementSize(liteType, number, value);
    }

    static final class Builder<T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> {
        private androidx.datastore.preferences.protobuf.SmallSortedMap<T, java.lang.Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            this(androidx.datastore.preferences.protobuf.SmallSortedMap.newFieldMap());
        }

        private Builder(androidx.datastore.preferences.protobuf.SmallSortedMap<T, java.lang.Object> fields) {
            this.fields = fields;
            this.isMutable = true;
        }

        public androidx.datastore.preferences.protobuf.FieldSet<T> build() {
            return buildImpl(false);
        }

        public androidx.datastore.preferences.protobuf.FieldSet<T> buildPartial() {
            return buildImpl(true);
        }

        private androidx.datastore.preferences.protobuf.FieldSet<T> buildImpl(boolean partial) {
            if (this.fields.isEmpty()) {
                return androidx.datastore.preferences.protobuf.FieldSet.emptySet();
            }
            this.isMutable = false;
            androidx.datastore.preferences.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMapCloneAllFieldsMap = this.fields;
            if (this.hasNestedBuilders) {
                smallSortedMapCloneAllFieldsMap = androidx.datastore.preferences.protobuf.FieldSet.cloneAllFieldsMap(smallSortedMapCloneAllFieldsMap, false, false);
                replaceBuilders(smallSortedMapCloneAllFieldsMap, partial);
            }
            androidx.datastore.preferences.protobuf.FieldSet<T> fieldSet = new androidx.datastore.preferences.protobuf.FieldSet<>(smallSortedMapCloneAllFieldsMap, null);
            ((androidx.datastore.preferences.protobuf.FieldSet) fieldSet).hasLazyField = this.hasLazyField;
            return fieldSet;
        }

        private static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(androidx.datastore.preferences.protobuf.SmallSortedMap<T, java.lang.Object> fieldMap, boolean partial) {
            int numArrayEntries = fieldMap.getNumArrayEntries();
            for (int i = 0; i < numArrayEntries; i++) {
                replaceBuilders(fieldMap.getArrayEntryAt(i), partial);
            }
            java.util.Iterator it = fieldMap.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders((java.util.Map.Entry) it.next(), partial);
            }
        }

        private static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(java.util.Map.Entry<T, java.lang.Object> entry, boolean partial) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), partial));
        }

        private static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> java.lang.Object replaceBuilders(T descriptor, java.lang.Object value, boolean partial) {
            if (value == null || descriptor.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE) {
                return value;
            }
            if (descriptor.isRepeated()) {
                if (!(value instanceof java.util.List)) {
                    throw new java.lang.IllegalStateException("Repeated field should contains a List but actually contains type: " + value.getClass());
                }
                java.util.List arrayList = (java.util.List) value;
                for (int i = 0; i < arrayList.size(); i++) {
                    java.lang.Object obj = arrayList.get(i);
                    java.lang.Object objReplaceBuilder = replaceBuilder(obj, partial);
                    if (objReplaceBuilder != obj) {
                        if (arrayList == value) {
                            arrayList = new java.util.ArrayList(arrayList);
                        }
                        arrayList.set(i, objReplaceBuilder);
                    }
                }
                return arrayList;
            }
            return replaceBuilder(value, partial);
        }

        private static java.lang.Object replaceBuilder(java.lang.Object value, boolean partial) {
            if (!(value instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder)) {
                return value;
            }
            androidx.datastore.preferences.protobuf.MessageLite.Builder builder = (androidx.datastore.preferences.protobuf.MessageLite.Builder) value;
            if (partial) {
                return builder.buildPartial();
            }
            return builder.build();
        }

        public static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> androidx.datastore.preferences.protobuf.FieldSet.Builder<T> fromFieldSet(androidx.datastore.preferences.protobuf.FieldSet<T> fieldSet) {
            androidx.datastore.preferences.protobuf.FieldSet.Builder<T> builder = new androidx.datastore.preferences.protobuf.FieldSet.Builder<>(androidx.datastore.preferences.protobuf.FieldSet.cloneAllFieldsMap(((androidx.datastore.preferences.protobuf.FieldSet) fieldSet).fields, true, false));
            ((androidx.datastore.preferences.protobuf.FieldSet.Builder) builder).hasLazyField = ((androidx.datastore.preferences.protobuf.FieldSet) fieldSet).hasLazyField;
            return builder;
        }

        public java.util.Map<T, java.lang.Object> getAllFields() {
            if (!this.hasLazyField) {
                return this.fields.isImmutable() ? this.fields : java.util.Collections.unmodifiableMap(this.fields);
            }
            androidx.datastore.preferences.protobuf.SmallSortedMap smallSortedMapCloneAllFieldsMap = androidx.datastore.preferences.protobuf.FieldSet.cloneAllFieldsMap(this.fields, false, true);
            if (this.fields.isImmutable()) {
                smallSortedMapCloneAllFieldsMap.makeImmutable();
            } else {
                replaceBuilders(smallSortedMapCloneAllFieldsMap, true);
            }
            return smallSortedMapCloneAllFieldsMap;
        }

        public boolean hasField(final T descriptor) {
            if (descriptor.isRepeated()) {
                throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.fields.get(descriptor) != null;
        }

        public java.lang.Object getField(final T descriptor) {
            return replaceBuilders(descriptor, getFieldAllowBuilders(descriptor), true);
        }

        java.lang.Object getFieldAllowBuilders(final T descriptor) {
            java.lang.Object obj = this.fields.get(descriptor);
            return obj instanceof androidx.datastore.preferences.protobuf.LazyField ? ((androidx.datastore.preferences.protobuf.LazyField) obj).getValue() : obj;
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = androidx.datastore.preferences.protobuf.FieldSet.cloneAllFieldsMap(this.fields, true, false);
            this.isMutable = true;
        }

        public void setField(T t, java.lang.Object obj) {
            ensureIsMutable();
            if (t.isRepeated()) {
                if (!(obj instanceof java.util.List)) {
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                java.util.ArrayList arrayList = new java.util.ArrayList((java.util.List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    java.lang.Object obj2 = arrayList.get(i);
                    verifyType(t, obj2);
                    this.hasNestedBuilders = this.hasNestedBuilders || (obj2 instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder);
                }
                obj = arrayList;
            } else {
                verifyType(t, obj);
            }
            if (obj instanceof androidx.datastore.preferences.protobuf.LazyField) {
                this.hasLazyField = true;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder);
            this.fields.put(t, obj);
        }

        public void clearField(final T descriptor) {
            ensureIsMutable();
            this.fields.remove(descriptor);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public int getRepeatedFieldCount(final T descriptor) {
            if (!descriptor.isRepeated()) {
                throw new java.lang.IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(descriptor);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((java.util.List) fieldAllowBuilders).size();
        }

        public java.lang.Object getRepeatedField(final T descriptor, final int index) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(descriptor, index), true);
        }

        java.lang.Object getRepeatedFieldAllowBuilders(final T descriptor, final int index) {
            if (!descriptor.isRepeated()) {
                throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(descriptor);
            if (fieldAllowBuilders == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            return ((java.util.List) fieldAllowBuilders).get(index);
        }

        public void setRepeatedField(final T descriptor, final int index, final java.lang.Object value) {
            ensureIsMutable();
            if (!descriptor.isRepeated()) {
                throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (value instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder);
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(descriptor);
            if (fieldAllowBuilders == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            verifyType(descriptor, value);
            ((java.util.List) fieldAllowBuilders).set(index, value);
        }

        public void addRepeatedField(final T descriptor, final java.lang.Object value) {
            java.util.List arrayList;
            ensureIsMutable();
            if (!descriptor.isRepeated()) {
                throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (value instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder);
            verifyType(descriptor, value);
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(descriptor);
            if (fieldAllowBuilders == null) {
                arrayList = new java.util.ArrayList();
                this.fields.put(descriptor, arrayList);
            } else {
                arrayList = (java.util.List) fieldAllowBuilders;
            }
            arrayList.add(value);
        }

        private void verifyType(final T descriptor, final java.lang.Object value) {
            if (androidx.datastore.preferences.protobuf.FieldSet.isValidType(descriptor.getLiteType(), value)) {
                return;
            }
            if (descriptor.getLiteType().getJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE || !(value instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(descriptor.getNumber()), descriptor.getLiteType().getJavaType(), value.getClass().getName()));
            }
        }

        public boolean isInitialized() {
            int numArrayEntries = this.fields.getNumArrayEntries();
            for (int i = 0; i < numArrayEntries; i++) {
                if (!androidx.datastore.preferences.protobuf.FieldSet.isInitialized(this.fields.getArrayEntryAt(i))) {
                    return false;
                }
            }
            java.util.Iterator it = this.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!androidx.datastore.preferences.protobuf.FieldSet.isInitialized((java.util.Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(final androidx.datastore.preferences.protobuf.FieldSet<T> other) {
            ensureIsMutable();
            int numArrayEntries = ((androidx.datastore.preferences.protobuf.FieldSet) other).fields.getNumArrayEntries();
            for (int i = 0; i < numArrayEntries; i++) {
                mergeFromField(((androidx.datastore.preferences.protobuf.FieldSet) other).fields.getArrayEntryAt(i));
            }
            java.util.Iterator it = ((androidx.datastore.preferences.protobuf.FieldSet) other).fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField((java.util.Map.Entry) it.next());
            }
        }

        private void mergeFromField(final java.util.Map.Entry<T, java.lang.Object> entry) {
            T key = entry.getKey();
            java.lang.Object value = entry.getValue();
            boolean z = value instanceof androidx.datastore.preferences.protobuf.LazyField;
            if (key.isRepeated()) {
                if (z) {
                    throw new java.lang.IllegalStateException("Lazy fields can not be repeated");
                }
                java.util.List arrayList = (java.util.List) getFieldAllowBuilders(key);
                java.util.List list = (java.util.List) value;
                int size = list.size();
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList(size);
                    this.fields.put(key, arrayList);
                }
                for (int i = 0; i < size; i++) {
                    arrayList.add(androidx.datastore.preferences.protobuf.FieldSet.cloneIfMutable(list.get(i)));
                }
                return;
            }
            if (key.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE) {
                if (!z) {
                    this.fields.put(key, androidx.datastore.preferences.protobuf.FieldSet.cloneIfMutable(value));
                    return;
                }
                throw new java.lang.IllegalStateException("Lazy fields must be message-valued");
            }
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(key);
            if (fieldAllowBuilders == null) {
                this.fields.put(key, androidx.datastore.preferences.protobuf.FieldSet.cloneIfMutable(value));
                if (z) {
                    this.hasLazyField = true;
                    return;
                }
                return;
            }
            if (z) {
                value = ((androidx.datastore.preferences.protobuf.LazyField) value).getValue();
            }
            if (fieldAllowBuilders instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder) {
                key.internalMergeFrom((androidx.datastore.preferences.protobuf.MessageLite.Builder) fieldAllowBuilders, (androidx.datastore.preferences.protobuf.MessageLite) value);
            } else {
                this.fields.put(key, key.internalMergeFrom(((androidx.datastore.preferences.protobuf.MessageLite) fieldAllowBuilders).toBuilder(), (androidx.datastore.preferences.protobuf.MessageLite) value).build());
            }
        }
    }
}

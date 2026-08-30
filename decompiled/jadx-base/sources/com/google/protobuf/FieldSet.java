package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
final class FieldSet<T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final com.google.protobuf.FieldSet DEFAULT_INSTANCE = new com.google.protobuf.FieldSet(true);
    private final com.google.protobuf.SmallSortedMap<T, java.lang.Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    public interface FieldDescriptorLite<T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> extends java.lang.Comparable<T> {
        com.google.protobuf.Internal.EnumLiteMap<?> getEnumType();

        com.google.protobuf.WireFormat.JavaType getLiteJavaType();

        com.google.protobuf.WireFormat.FieldType getLiteType();

        int getNumber();

        com.google.protobuf.MessageLite.Builder internalMergeFrom(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ FieldSet(com.google.protobuf.SmallSortedMap smallSortedMap, com.google.protobuf.FieldSet.AnonymousClass1 anonymousClass1) {
        this(smallSortedMap);
    }

    private FieldSet() {
        this.fields = com.google.protobuf.SmallSortedMap.newFieldMap(16);
    }

    private FieldSet(boolean z) {
        this(com.google.protobuf.SmallSortedMap.newFieldMap(0));
        makeImmutable();
    }

    private FieldSet(com.google.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap) {
        this.fields = smallSortedMap;
        makeImmutable();
    }

    public static <T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.protobuf.FieldSet<T> newFieldSet() {
        return new com.google.protobuf.FieldSet<>();
    }

    public static <T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.protobuf.FieldSet<T> emptySet() {
        return DEFAULT_INSTANCE;
    }

    public static <T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.protobuf.FieldSet.Builder<T> newBuilder() {
        return new com.google.protobuf.FieldSet.Builder<>((com.google.protobuf.FieldSet.AnonymousClass1) null);
    }

    boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            java.util.Map.Entry<K, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            if (arrayEntryAt.getValue() instanceof com.google.protobuf.GeneratedMessageLite) {
                ((com.google.protobuf.GeneratedMessageLite) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.protobuf.FieldSet) {
            return this.fields.equals(((com.google.protobuf.FieldSet) obj).fields);
        }
        return false;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.FieldSet<T> m900clone() {
        com.google.protobuf.FieldSet<T> fieldSetNewFieldSet = newFieldSet();
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            java.util.Map.Entry<K, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            fieldSetNewFieldSet.setField((com.google.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            fieldSetNewFieldSet.setField((com.google.protobuf.FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
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
        com.google.protobuf.SmallSortedMap smallSortedMapCloneAllFieldsMap = cloneAllFieldsMap(this.fields, false);
        if (this.fields.isImmutable()) {
            smallSortedMapCloneAllFieldsMap.makeImmutable();
        }
        return smallSortedMapCloneAllFieldsMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.protobuf.SmallSortedMap<T, java.lang.Object> cloneAllFieldsMap(com.google.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap, boolean z) {
        com.google.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMapNewFieldMap = com.google.protobuf.SmallSortedMap.newFieldMap(16);
        for (int i = 0; i < smallSortedMap.getNumArrayEntries(); i++) {
            cloneFieldEntry(smallSortedMapNewFieldMap, smallSortedMap.getArrayEntryAt(i), z);
        }
        java.util.Iterator it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(smallSortedMapNewFieldMap, (java.util.Map.Entry) it.next(), z);
        }
        return smallSortedMapNewFieldMap;
    }

    private static <T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> void cloneFieldEntry(java.util.Map<T, java.lang.Object> map, java.util.Map.Entry<T, java.lang.Object> entry, boolean z) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.protobuf.LazyField) {
            map.put(key, ((com.google.protobuf.LazyField) value).getValue());
        } else if (z && (value instanceof java.util.List)) {
            map.put(key, new java.util.ArrayList((java.util.List) value));
        } else {
            map.put(key, value);
        }
    }

    public java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> iterator() {
        if (this.hasLazyField) {
            return new com.google.protobuf.LazyField.LazyIterator(this.fields.entrySet().iterator());
        }
        return this.fields.entrySet().iterator();
    }

    java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> descendingIterator() {
        if (this.hasLazyField) {
            return new com.google.protobuf.LazyField.LazyIterator(this.fields.descendingEntrySet().iterator());
        }
        return this.fields.descendingEntrySet().iterator();
    }

    public boolean hasField(T t) {
        if (t.isRepeated()) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(t) != null;
    }

    public java.lang.Object getField(T t) {
        java.lang.Object obj = this.fields.get(t);
        return obj instanceof com.google.protobuf.LazyField ? ((com.google.protobuf.LazyField) obj).getValue() : obj;
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
        if (obj instanceof com.google.protobuf.LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put(t, obj);
    }

    public void clearField(T t) {
        this.fields.remove(t);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public int getRepeatedFieldCount(T t) {
        if (!t.isRepeated()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object field = getField(t);
        if (field == null) {
            return 0;
        }
        return ((java.util.List) field).size();
    }

    public java.lang.Object getRepeatedField(T t, int i) {
        if (!t.isRepeated()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object field = getField(t);
        if (field == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return ((java.util.List) field).get(i);
    }

    public void setRepeatedField(T t, int i, java.lang.Object obj) {
        if (!t.isRepeated()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object field = getField(t);
        if (field == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        verifyType(t, obj);
        ((java.util.List) field).set(i, obj);
    }

    public void addRepeatedField(T t, java.lang.Object obj) {
        java.util.List arrayList;
        if (!t.isRepeated()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(t, obj);
        java.lang.Object field = getField(t);
        if (field == null) {
            arrayList = new java.util.ArrayList();
            this.fields.put(t, arrayList);
        } else {
            arrayList = (java.util.List) field;
        }
        arrayList.add(obj);
    }

    private void verifyType(T t, java.lang.Object obj) {
        if (!isValidType(t.getLiteType(), obj)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(t.getNumber()), t.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(com.google.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) {
        com.google.protobuf.Internal.checkNotNull(obj);
        switch (com.google.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof java.lang.Integer;
            case 2:
                return obj instanceof java.lang.Long;
            case 3:
                return obj instanceof java.lang.Float;
            case 4:
                return obj instanceof java.lang.Double;
            case 5:
                return obj instanceof java.lang.Boolean;
            case 6:
                return obj instanceof java.lang.String;
            case 7:
                return (obj instanceof com.google.protobuf.ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof java.lang.Integer) || (obj instanceof com.google.protobuf.Internal.EnumLite);
            case 9:
                return (obj instanceof com.google.protobuf.MessageLite) || (obj instanceof com.google.protobuf.LazyField);
            default:
                return false;
        }
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
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
    public static <T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> boolean isInitialized(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != com.google.protobuf.WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!isMessageFieldValueInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private static boolean isMessageFieldValueInitialized(java.lang.Object obj) {
        if (obj instanceof com.google.protobuf.MessageLiteOrBuilder) {
            return ((com.google.protobuf.MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof com.google.protobuf.LazyField) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    static int getWireFormatForFieldType(com.google.protobuf.WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public void mergeFrom(com.google.protobuf.FieldSet<T> fieldSet) {
        for (int i = 0; i < fieldSet.fields.getNumArrayEntries(); i++) {
            mergeFromField(fieldSet.fields.getArrayEntryAt(i));
        }
        java.util.Iterator it = fieldSet.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField((java.util.Map.Entry) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object cloneIfMutable(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void mergeFromField(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.protobuf.LazyField) {
            value = ((com.google.protobuf.LazyField) value).getValue();
        }
        if (key.isRepeated()) {
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
        if (key.getLiteJavaType() == com.google.protobuf.WireFormat.JavaType.MESSAGE) {
            java.lang.Object field2 = getField(key);
            if (field2 == null) {
                this.fields.put(key, cloneIfMutable(value));
                return;
            } else {
                this.fields.put(key, key.internalMergeFrom(((com.google.protobuf.MessageLite) field2).toBuilder(), (com.google.protobuf.MessageLite) value).build());
                return;
            }
        }
        this.fields.put(key, cloneIfMutable(value));
    }

    public static java.lang.Object readPrimitiveField(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.WireFormat.FieldType fieldType, boolean z) throws java.io.IOException {
        if (z) {
            return com.google.protobuf.WireFormat.readPrimitiveField(codedInputStream, fieldType, com.google.protobuf.WireFormat.Utf8Validation.STRICT);
        }
        return com.google.protobuf.WireFormat.readPrimitiveField(codedInputStream, fieldType, com.google.protobuf.WireFormat.Utf8Validation.LOOSE);
    }

    public void writeTo(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            java.util.Map.Entry<K, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            writeField((com.google.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            writeField((com.google.protobuf.FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    public void writeMessageSetTo(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i), codedOutputStream);
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo((java.util.Map.Entry) it.next(), codedOutputStream);
        }
    }

    private void writeMessageSetTo(java.util.Map.Entry<T, java.lang.Object> entry, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() == com.google.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            java.lang.Object value = entry.getValue();
            if (value instanceof com.google.protobuf.LazyField) {
                value = ((com.google.protobuf.LazyField) value).getValue();
            }
            codedOutputStream.writeMessageSetExtension(entry.getKey().getNumber(), (com.google.protobuf.MessageLite) value);
            return;
        }
        writeField(key, entry.getValue(), codedOutputStream);
    }

    static void writeElement(com.google.protobuf.CodedOutputStream codedOutputStream, com.google.protobuf.WireFormat.FieldType fieldType, int i, java.lang.Object obj) throws java.io.IOException {
        if (fieldType == com.google.protobuf.WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (com.google.protobuf.MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, getWireFormatForFieldType(fieldType, false));
            writeElementNoTag(codedOutputStream, fieldType, obj);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.FieldSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[com.google.protobuf.WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[com.google.protobuf.WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.protobuf.WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.protobuf.WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.protobuf.WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.protobuf.WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.protobuf.WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.protobuf.WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
        }
    }

    static void writeElementNoTag(com.google.protobuf.CodedOutputStream codedOutputStream, com.google.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) throws java.io.IOException {
        switch (com.google.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((java.lang.Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((java.lang.Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((java.lang.Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((com.google.protobuf.MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((com.google.protobuf.MessageLite) obj);
                break;
            case 11:
                if (obj instanceof com.google.protobuf.ByteString) {
                    codedOutputStream.writeBytesNoTag((com.google.protobuf.ByteString) obj);
                } else {
                    codedOutputStream.writeStringNoTag((java.lang.String) obj);
                }
                break;
            case 12:
                if (obj instanceof com.google.protobuf.ByteString) {
                    codedOutputStream.writeBytesNoTag((com.google.protobuf.ByteString) obj);
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                }
                break;
            case 13:
                codedOutputStream.writeUInt32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof com.google.protobuf.Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((com.google.protobuf.Internal.EnumLite) obj).getNumber());
                } else {
                    codedOutputStream.writeEnumNoTag(((java.lang.Integer) obj).intValue());
                }
                break;
        }
    }

    public static void writeField(com.google.protobuf.FieldSet.FieldDescriptorLite<?> fieldDescriptorLite, java.lang.Object obj, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        com.google.protobuf.WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            java.util.List list = (java.util.List) obj;
            if (fieldDescriptorLite.isPacked()) {
                codedOutputStream.writeTag(number, 2);
                java.util.Iterator it = list.iterator();
                int iComputeElementSizeNoTag = 0;
                while (it.hasNext()) {
                    iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, it.next());
                }
                codedOutputStream.writeUInt32NoTag(iComputeElementSizeNoTag);
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    writeElementNoTag(codedOutputStream, liteType, it2.next());
                }
                return;
            }
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                writeElement(codedOutputStream, liteType, number, it3.next());
            }
            return;
        }
        if (obj instanceof com.google.protobuf.LazyField) {
            writeElement(codedOutputStream, liteType, number, ((com.google.protobuf.LazyField) obj).getValue());
        } else {
            writeElement(codedOutputStream, liteType, number, obj);
        }
    }

    public int getSerializedSize() {
        int iComputeFieldSize = 0;
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            java.util.Map.Entry<K, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            iComputeFieldSize += computeFieldSize((com.google.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            iComputeFieldSize += computeFieldSize((com.google.protobuf.FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public int getMessageSetSerializedSize() {
        int messageSetSerializedSize = 0;
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            messageSetSerializedSize += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i));
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            messageSetSerializedSize += getMessageSetSerializedSize((java.util.Map.Entry) it.next());
        }
        return messageSetSerializedSize;
    }

    private int getMessageSetSerializedSize(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (key.getLiteJavaType() == com.google.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof com.google.protobuf.LazyField) {
                return com.google.protobuf.CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (com.google.protobuf.LazyField) value);
            }
            return com.google.protobuf.CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (com.google.protobuf.MessageLite) value);
        }
        return computeFieldSize(key, value);
    }

    static int computeElementSize(com.google.protobuf.WireFormat.FieldType fieldType, int i, java.lang.Object obj) {
        int iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(i);
        if (fieldType == com.google.protobuf.WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + computeElementSizeNoTag(fieldType, obj);
    }

    static int computeElementSizeNoTag(com.google.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) {
        switch (com.google.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return com.google.protobuf.CodedOutputStream.computeDoubleSizeNoTag(((java.lang.Double) obj).doubleValue());
            case 2:
                return com.google.protobuf.CodedOutputStream.computeFloatSizeNoTag(((java.lang.Float) obj).floatValue());
            case 3:
                return com.google.protobuf.CodedOutputStream.computeInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 4:
                return com.google.protobuf.CodedOutputStream.computeUInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 5:
                return com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 6:
                return com.google.protobuf.CodedOutputStream.computeFixed64SizeNoTag(((java.lang.Long) obj).longValue());
            case 7:
                return com.google.protobuf.CodedOutputStream.computeFixed32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 8:
                return com.google.protobuf.CodedOutputStream.computeBoolSizeNoTag(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return com.google.protobuf.CodedOutputStream.computeGroupSizeNoTag((com.google.protobuf.MessageLite) obj);
            case 10:
                if (obj instanceof com.google.protobuf.LazyField) {
                    return com.google.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag((com.google.protobuf.LazyField) obj);
                }
                return com.google.protobuf.CodedOutputStream.computeMessageSizeNoTag((com.google.protobuf.MessageLite) obj);
            case 11:
                if (obj instanceof com.google.protobuf.ByteString) {
                    return com.google.protobuf.CodedOutputStream.computeBytesSizeNoTag((com.google.protobuf.ByteString) obj);
                }
                return com.google.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) obj);
            case 12:
                if (obj instanceof com.google.protobuf.ByteString) {
                    return com.google.protobuf.CodedOutputStream.computeBytesSizeNoTag((com.google.protobuf.ByteString) obj);
                }
                return com.google.protobuf.CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 14:
                return com.google.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 15:
                return com.google.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(((java.lang.Long) obj).longValue());
            case 16:
                return com.google.protobuf.CodedOutputStream.computeSInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 17:
                return com.google.protobuf.CodedOutputStream.computeSInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 18:
                if (obj instanceof com.google.protobuf.Internal.EnumLite) {
                    return com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(((com.google.protobuf.Internal.EnumLite) obj).getNumber());
                }
                return com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(com.google.protobuf.FieldSet.FieldDescriptorLite<?> fieldDescriptorLite, java.lang.Object obj) {
        com.google.protobuf.WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            int iComputeElementSize = 0;
            if (fieldDescriptorLite.isPacked()) {
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    iComputeElementSize += computeElementSizeNoTag(liteType, it.next());
                }
                return com.google.protobuf.CodedOutputStream.computeTagSize(number) + iComputeElementSize + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeElementSize);
            }
            java.util.Iterator it2 = ((java.util.List) obj).iterator();
            while (it2.hasNext()) {
                iComputeElementSize += computeElementSize(liteType, number, it2.next());
            }
            return iComputeElementSize;
        }
        return computeElementSize(liteType, number, obj);
    }

    static final class Builder<T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> {
        private com.google.protobuf.SmallSortedMap<T, java.lang.Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        /* synthetic */ Builder(com.google.protobuf.FieldSet.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            this(com.google.protobuf.SmallSortedMap.newFieldMap(16));
        }

        private Builder(com.google.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap) {
            this.fields = smallSortedMap;
            this.isMutable = true;
        }

        public com.google.protobuf.FieldSet<T> build() {
            return buildImpl(false);
        }

        public com.google.protobuf.FieldSet<T> buildPartial() {
            return buildImpl(true);
        }

        private com.google.protobuf.FieldSet<T> buildImpl(boolean z) {
            if (this.fields.isEmpty()) {
                return com.google.protobuf.FieldSet.emptySet();
            }
            this.isMutable = false;
            com.google.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMapCloneAllFieldsMap = this.fields;
            if (this.hasNestedBuilders) {
                smallSortedMapCloneAllFieldsMap = com.google.protobuf.FieldSet.cloneAllFieldsMap(smallSortedMapCloneAllFieldsMap, false);
                replaceBuilders(smallSortedMapCloneAllFieldsMap, z);
            }
            com.google.protobuf.FieldSet<T> fieldSet = new com.google.protobuf.FieldSet<>(smallSortedMapCloneAllFieldsMap, null);
            ((com.google.protobuf.FieldSet) fieldSet).hasLazyField = this.hasLazyField;
            return fieldSet;
        }

        private static <T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(com.google.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap, boolean z) {
            for (int i = 0; i < smallSortedMap.getNumArrayEntries(); i++) {
                replaceBuilders(smallSortedMap.getArrayEntryAt(i), z);
            }
            java.util.Iterator it = smallSortedMap.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders((java.util.Map.Entry) it.next(), z);
            }
        }

        private static <T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(java.util.Map.Entry<T, java.lang.Object> entry, boolean z) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z));
        }

        private static <T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> java.lang.Object replaceBuilders(T t, java.lang.Object obj, boolean z) {
            if (obj == null || t.getLiteJavaType() != com.google.protobuf.WireFormat.JavaType.MESSAGE) {
                return obj;
            }
            if (t.isRepeated()) {
                if (!(obj instanceof java.util.List)) {
                    throw new java.lang.IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
                }
                java.util.List arrayList = (java.util.List) obj;
                for (int i = 0; i < arrayList.size(); i++) {
                    java.lang.Object obj2 = arrayList.get(i);
                    java.lang.Object objReplaceBuilder = replaceBuilder(obj2, z);
                    if (objReplaceBuilder != obj2) {
                        if (arrayList == obj) {
                            arrayList = new java.util.ArrayList(arrayList);
                        }
                        arrayList.set(i, objReplaceBuilder);
                    }
                }
                return arrayList;
            }
            return replaceBuilder(obj, z);
        }

        private static java.lang.Object replaceBuilder(java.lang.Object obj, boolean z) {
            if (!(obj instanceof com.google.protobuf.MessageLite.Builder)) {
                return obj;
            }
            com.google.protobuf.MessageLite.Builder builder = (com.google.protobuf.MessageLite.Builder) obj;
            if (z) {
                return builder.buildPartial();
            }
            return builder.build();
        }

        public static <T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.protobuf.FieldSet.Builder<T> fromFieldSet(com.google.protobuf.FieldSet<T> fieldSet) {
            com.google.protobuf.FieldSet.Builder<T> builder = new com.google.protobuf.FieldSet.Builder<>(com.google.protobuf.FieldSet.cloneAllFieldsMap(((com.google.protobuf.FieldSet) fieldSet).fields, true));
            ((com.google.protobuf.FieldSet.Builder) builder).hasLazyField = ((com.google.protobuf.FieldSet) fieldSet).hasLazyField;
            return builder;
        }

        public java.util.Map<T, java.lang.Object> getAllFields() {
            if (!this.hasLazyField) {
                return this.fields.isImmutable() ? this.fields : java.util.Collections.unmodifiableMap(this.fields);
            }
            com.google.protobuf.SmallSortedMap smallSortedMapCloneAllFieldsMap = com.google.protobuf.FieldSet.cloneAllFieldsMap(this.fields, false);
            if (this.fields.isImmutable()) {
                smallSortedMapCloneAllFieldsMap.makeImmutable();
            } else {
                replaceBuilders(smallSortedMapCloneAllFieldsMap, true);
            }
            return smallSortedMapCloneAllFieldsMap;
        }

        public boolean hasField(T t) {
            if (t.isRepeated()) {
                throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.fields.get(t) != null;
        }

        public java.lang.Object getField(T t) {
            return replaceBuilders(t, getFieldAllowBuilders(t), true);
        }

        java.lang.Object getFieldAllowBuilders(T t) {
            java.lang.Object obj = this.fields.get(t);
            return obj instanceof com.google.protobuf.LazyField ? ((com.google.protobuf.LazyField) obj).getValue() : obj;
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = com.google.protobuf.FieldSet.cloneAllFieldsMap(this.fields, true);
            this.isMutable = true;
        }

        public void setField(T t, java.lang.Object obj) {
            ensureIsMutable();
            if (t.isRepeated()) {
                if (!(obj instanceof java.util.List)) {
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                java.util.ArrayList arrayList = new java.util.ArrayList((java.util.List) obj);
                for (java.lang.Object obj2 : arrayList) {
                    verifyType(t, obj2);
                    this.hasNestedBuilders = this.hasNestedBuilders || (obj2 instanceof com.google.protobuf.MessageLite.Builder);
                }
                obj = arrayList;
            } else {
                verifyType(t, obj);
            }
            if (obj instanceof com.google.protobuf.LazyField) {
                this.hasLazyField = true;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof com.google.protobuf.MessageLite.Builder);
            this.fields.put(t, obj);
        }

        public void clearField(T t) {
            ensureIsMutable();
            this.fields.remove(t);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public int getRepeatedFieldCount(T t) {
            if (!t.isRepeated()) {
                throw new java.lang.IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(t);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((java.util.List) fieldAllowBuilders).size();
        }

        public java.lang.Object getRepeatedField(T t, int i) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(t, i), true);
        }

        java.lang.Object getRepeatedFieldAllowBuilders(T t, int i) {
            if (!t.isRepeated()) {
                throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(t);
            if (fieldAllowBuilders == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            return ((java.util.List) fieldAllowBuilders).get(i);
        }

        public void setRepeatedField(T t, int i, java.lang.Object obj) {
            ensureIsMutable();
            if (!t.isRepeated()) {
                throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof com.google.protobuf.MessageLite.Builder);
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(t);
            if (fieldAllowBuilders == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            verifyType(t, obj);
            ((java.util.List) fieldAllowBuilders).set(i, obj);
        }

        public void addRepeatedField(T t, java.lang.Object obj) {
            java.util.List arrayList;
            ensureIsMutable();
            if (!t.isRepeated()) {
                throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof com.google.protobuf.MessageLite.Builder);
            verifyType(t, obj);
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(t);
            if (fieldAllowBuilders == null) {
                arrayList = new java.util.ArrayList();
                this.fields.put(t, arrayList);
            } else {
                arrayList = (java.util.List) fieldAllowBuilders;
            }
            arrayList.add(obj);
        }

        private void verifyType(T t, java.lang.Object obj) {
            if (com.google.protobuf.FieldSet.isValidType(t.getLiteType(), obj)) {
                return;
            }
            if (t.getLiteType().getJavaType() != com.google.protobuf.WireFormat.JavaType.MESSAGE || !(obj instanceof com.google.protobuf.MessageLite.Builder)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(t.getNumber()), t.getLiteType().getJavaType(), obj.getClass().getName()));
            }
        }

        public boolean isInitialized() {
            for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
                if (!com.google.protobuf.FieldSet.isInitialized(this.fields.getArrayEntryAt(i))) {
                    return false;
                }
            }
            java.util.Iterator it = this.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!com.google.protobuf.FieldSet.isInitialized((java.util.Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(com.google.protobuf.FieldSet<T> fieldSet) {
            ensureIsMutable();
            for (int i = 0; i < ((com.google.protobuf.FieldSet) fieldSet).fields.getNumArrayEntries(); i++) {
                mergeFromField(((com.google.protobuf.FieldSet) fieldSet).fields.getArrayEntryAt(i));
            }
            java.util.Iterator it = ((com.google.protobuf.FieldSet) fieldSet).fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField((java.util.Map.Entry) it.next());
            }
        }

        private void mergeFromField(java.util.Map.Entry<T, java.lang.Object> entry) {
            T key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value instanceof com.google.protobuf.LazyField) {
                value = ((com.google.protobuf.LazyField) value).getValue();
            }
            if (key.isRepeated()) {
                java.util.List arrayList = (java.util.List) getFieldAllowBuilders(key);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    this.fields.put(key, arrayList);
                }
                java.util.Iterator it = ((java.util.List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(com.google.protobuf.FieldSet.cloneIfMutable(it.next()));
                }
                return;
            }
            if (key.getLiteJavaType() != com.google.protobuf.WireFormat.JavaType.MESSAGE) {
                this.fields.put(key, com.google.protobuf.FieldSet.cloneIfMutable(value));
                return;
            }
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(key);
            if (fieldAllowBuilders == null) {
                this.fields.put(key, com.google.protobuf.FieldSet.cloneIfMutable(value));
            } else if (fieldAllowBuilders instanceof com.google.protobuf.MessageLite.Builder) {
                key.internalMergeFrom((com.google.protobuf.MessageLite.Builder) fieldAllowBuilders, (com.google.protobuf.MessageLite) value);
            } else {
                this.fields.put(key, key.internalMergeFrom(((com.google.protobuf.MessageLite) fieldAllowBuilders).toBuilder(), (com.google.protobuf.MessageLite) value).build());
            }
        }
    }
}

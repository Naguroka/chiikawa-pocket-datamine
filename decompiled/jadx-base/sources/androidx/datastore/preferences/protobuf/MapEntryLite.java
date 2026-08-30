package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata;
    private final V value;

    static class Metadata<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final androidx.datastore.preferences.protobuf.WireFormat.FieldType keyType;
        public final androidx.datastore.preferences.protobuf.WireFormat.FieldType valueType;

        public Metadata(androidx.datastore.preferences.protobuf.WireFormat.FieldType keyType, K defaultKey, androidx.datastore.preferences.protobuf.WireFormat.FieldType valueType, V defaultValue) {
            this.keyType = keyType;
            this.defaultKey = defaultKey;
            this.valueType = valueType;
            this.defaultValue = defaultValue;
        }
    }

    private MapEntryLite(androidx.datastore.preferences.protobuf.WireFormat.FieldType keyType, K defaultKey, androidx.datastore.preferences.protobuf.WireFormat.FieldType valueType, V defaultValue) {
        this.metadata = new androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<>(keyType, defaultKey, valueType, defaultValue);
        this.key = defaultKey;
        this.value = defaultValue;
    }

    private MapEntryLite(androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, K key, V value) {
        this.metadata = metadata;
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public static <K, V> androidx.datastore.preferences.protobuf.MapEntryLite<K, V> newDefaultInstance(androidx.datastore.preferences.protobuf.WireFormat.FieldType keyType, K defaultKey, androidx.datastore.preferences.protobuf.WireFormat.FieldType valueType, V defaultValue) {
        return new androidx.datastore.preferences.protobuf.MapEntryLite<>(keyType, defaultKey, valueType, defaultValue);
    }

    static <K, V> void writeTo(androidx.datastore.preferences.protobuf.CodedOutputStream output, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, K key, V value) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.FieldSet.writeElement(output, metadata.keyType, 1, key);
        androidx.datastore.preferences.protobuf.FieldSet.writeElement(output, metadata.valueType, 2, value);
    }

    static <K, V> int computeSerializedSize(androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, K key, V value) {
        return androidx.datastore.preferences.protobuf.FieldSet.computeElementSize(metadata.keyType, 1, key) + androidx.datastore.preferences.protobuf.FieldSet.computeElementSize(metadata.valueType, 2, value);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static <T> T parseField(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, T t) throws java.io.IOException {
        int i = androidx.datastore.preferences.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()];
        if (i == 1) {
            androidx.datastore.preferences.protobuf.MessageLite.Builder builder = ((androidx.datastore.preferences.protobuf.MessageLite) t).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) java.lang.Integer.valueOf(codedInputStream.readEnum());
        }
        if (i == 3) {
            throw new java.lang.RuntimeException("Groups are not allowed in maps.");
        }
        return (T) androidx.datastore.preferences.protobuf.FieldSet.readPrimitiveField(codedInputStream, fieldType, true);
    }

    public void serializeTo(androidx.datastore.preferences.protobuf.CodedOutputStream output, int fieldNumber, K key, V value) throws java.io.IOException {
        output.writeTag(fieldNumber, 2);
        output.writeUInt32NoTag(computeSerializedSize(this.metadata, key, value));
        writeTo(output, this.metadata, key, value);
    }

    public int computeMessageSize(int fieldNumber, K key, V value) {
        return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, key, value));
    }

    public java.util.Map.Entry<K, V> parseEntry(androidx.datastore.preferences.protobuf.ByteString bytes, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return parseEntry(bytes.newCodedInput(), this.metadata, extensionRegistry);
    }

    static <K, V> java.util.Map.Entry<K, V> parseEntry(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        java.lang.Object field = metadata.defaultKey;
        java.lang.Object field2 = metadata.defaultValue;
        while (true) {
            int tag = input.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == androidx.datastore.preferences.protobuf.WireFormat.makeTag(1, metadata.keyType.getWireType())) {
                field = parseField(input, extensionRegistry, metadata.keyType, field);
            } else if (tag == androidx.datastore.preferences.protobuf.WireFormat.makeTag(2, metadata.valueType.getWireType())) {
                field2 = parseField(input, extensionRegistry, metadata.valueType, field2);
            } else if (!input.skipField(tag)) {
                break;
            }
        }
        return new java.util.AbstractMap.SimpleImmutableEntry(field, field2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(androidx.datastore.preferences.protobuf.MapFieldLite<K, V> map, androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        int iPushLimit = input.pushLimit(input.readRawVarint32());
        java.lang.Object field = this.metadata.defaultKey;
        java.lang.Object field2 = this.metadata.defaultValue;
        while (true) {
            int tag = input.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == androidx.datastore.preferences.protobuf.WireFormat.makeTag(1, this.metadata.keyType.getWireType())) {
                field = parseField(input, extensionRegistry, this.metadata.keyType, field);
            } else if (tag == androidx.datastore.preferences.protobuf.WireFormat.makeTag(2, this.metadata.valueType.getWireType())) {
                field2 = parseField(input, extensionRegistry, this.metadata.valueType, field2);
            } else if (!input.skipField(tag)) {
                break;
            }
        }
        input.checkLastTagWas(0);
        input.popLimit(iPushLimit);
        map.put(field, field2);
    }

    androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> getMetadata() {
        return this.metadata;
    }
}

package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final com.google.protobuf.MapEntryLite.Metadata<K, V> metadata;
    private final V value;

    static class Metadata<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final com.google.protobuf.WireFormat.FieldType keyType;
        public final com.google.protobuf.WireFormat.FieldType valueType;

        public Metadata(com.google.protobuf.WireFormat.FieldType fieldType, K k, com.google.protobuf.WireFormat.FieldType fieldType2, V v) {
            this.keyType = fieldType;
            this.defaultKey = k;
            this.valueType = fieldType2;
            this.defaultValue = v;
        }
    }

    private MapEntryLite(com.google.protobuf.WireFormat.FieldType fieldType, K k, com.google.protobuf.WireFormat.FieldType fieldType2, V v) {
        this.metadata = new com.google.protobuf.MapEntryLite.Metadata<>(fieldType, k, fieldType2, v);
        this.key = k;
        this.value = v;
    }

    private MapEntryLite(com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, K k, V v) {
        this.metadata = metadata;
        this.key = k;
        this.value = v;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public static <K, V> com.google.protobuf.MapEntryLite<K, V> newDefaultInstance(com.google.protobuf.WireFormat.FieldType fieldType, K k, com.google.protobuf.WireFormat.FieldType fieldType2, V v) {
        return new com.google.protobuf.MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    static <K, V> void writeTo(com.google.protobuf.CodedOutputStream codedOutputStream, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, K k, V v) throws java.io.IOException {
        com.google.protobuf.FieldSet.writeElement(codedOutputStream, metadata.keyType, 1, k);
        com.google.protobuf.FieldSet.writeElement(codedOutputStream, metadata.valueType, 2, v);
    }

    static <K, V> int computeSerializedSize(com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, K k, V v) {
        return com.google.protobuf.FieldSet.computeElementSize(metadata.keyType, 1, k) + com.google.protobuf.FieldSet.computeElementSize(metadata.valueType, 2, v);
    }

    /* JADX INFO: renamed from: com.google.protobuf.MapEntryLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static <T> T parseField(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.WireFormat.FieldType fieldType, T t) throws java.io.IOException {
        int i = com.google.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()];
        if (i == 1) {
            com.google.protobuf.MessageLite.Builder builder = ((com.google.protobuf.MessageLite) t).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) java.lang.Integer.valueOf(codedInputStream.readEnum());
        }
        if (i == 3) {
            throw new java.lang.RuntimeException("Groups are not allowed in maps.");
        }
        return (T) com.google.protobuf.FieldSet.readPrimitiveField(codedInputStream, fieldType, true);
    }

    public void serializeTo(com.google.protobuf.CodedOutputStream codedOutputStream, int i, K k, V v) throws java.io.IOException {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k, v));
        writeTo(codedOutputStream, this.metadata, k, v);
    }

    public int computeMessageSize(int i, K k, V v) {
        return com.google.protobuf.CodedOutputStream.computeTagSize(i) + com.google.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k, v));
    }

    public java.util.Map.Entry<K, V> parseEntry(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    static <K, V> java.util.Map.Entry<K, V> parseEntry(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        java.lang.Object field = metadata.defaultKey;
        java.lang.Object field2 = metadata.defaultValue;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == com.google.protobuf.WireFormat.makeTag(1, metadata.keyType.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, metadata.keyType, field);
            } else if (tag == com.google.protobuf.WireFormat.makeTag(2, metadata.valueType.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, metadata.valueType, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        return new java.util.AbstractMap.SimpleImmutableEntry(field, field2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(com.google.protobuf.MapFieldLite<K, V> mapFieldLite, com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        java.lang.Object field = this.metadata.defaultKey;
        java.lang.Object field2 = this.metadata.defaultValue;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == com.google.protobuf.WireFormat.makeTag(1, this.metadata.keyType.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, this.metadata.keyType, field);
            } else if (tag == com.google.protobuf.WireFormat.makeTag(2, this.metadata.valueType.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.valueType, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(iPushLimit);
        mapFieldLite.put(field, field2);
    }

    com.google.protobuf.MapEntryLite.Metadata<K, V> getMetadata() {
        return this.metadata;
    }
}

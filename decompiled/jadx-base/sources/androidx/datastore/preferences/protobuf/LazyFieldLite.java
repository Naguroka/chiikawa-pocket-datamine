package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class LazyFieldLite {
    private androidx.datastore.preferences.protobuf.ByteString delayedBytes;
    private androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry;
    private volatile androidx.datastore.preferences.protobuf.ByteString memoizedBytes;
    protected volatile androidx.datastore.preferences.protobuf.MessageLite value;

    public int hashCode() {
        return 1;
    }

    public LazyFieldLite(androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.ByteString bytes) {
        checkArguments(extensionRegistry, bytes);
        this.extensionRegistry = extensionRegistry;
        this.delayedBytes = bytes;
    }

    public LazyFieldLite() {
    }

    public static androidx.datastore.preferences.protobuf.LazyFieldLite fromValue(androidx.datastore.preferences.protobuf.MessageLite value) {
        androidx.datastore.preferences.protobuf.LazyFieldLite lazyFieldLite = new androidx.datastore.preferences.protobuf.LazyFieldLite();
        lazyFieldLite.setValue(value);
        return lazyFieldLite;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof androidx.datastore.preferences.protobuf.LazyFieldLite)) {
            return false;
        }
        androidx.datastore.preferences.protobuf.LazyFieldLite lazyFieldLite = (androidx.datastore.preferences.protobuf.LazyFieldLite) o;
        androidx.datastore.preferences.protobuf.MessageLite messageLite = this.value;
        androidx.datastore.preferences.protobuf.MessageLite messageLite2 = lazyFieldLite.value;
        if (messageLite == null && messageLite2 == null) {
            return toByteString().equals(lazyFieldLite.toByteString());
        }
        if (messageLite != null && messageLite2 != null) {
            return messageLite.equals(messageLite2);
        }
        if (messageLite != null) {
            return messageLite.equals(lazyFieldLite.getValue(messageLite.getDefaultInstanceForType()));
        }
        return getValue(messageLite2.getDefaultInstanceForType()).equals(messageLite2);
    }

    public boolean containsDefaultInstance() {
        androidx.datastore.preferences.protobuf.ByteString byteString;
        return this.memoizedBytes == androidx.datastore.preferences.protobuf.ByteString.EMPTY || (this.value == null && ((byteString = this.delayedBytes) == null || byteString == androidx.datastore.preferences.protobuf.ByteString.EMPTY));
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public void set(androidx.datastore.preferences.protobuf.LazyFieldLite other) {
        this.delayedBytes = other.delayedBytes;
        this.value = other.value;
        this.memoizedBytes = other.memoizedBytes;
        androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite = other.extensionRegistry;
        if (extensionRegistryLite != null) {
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    public androidx.datastore.preferences.protobuf.MessageLite getValue(androidx.datastore.preferences.protobuf.MessageLite defaultInstance) {
        ensureInitialized(defaultInstance);
        return this.value;
    }

    public androidx.datastore.preferences.protobuf.MessageLite setValue(androidx.datastore.preferences.protobuf.MessageLite value) {
        androidx.datastore.preferences.protobuf.MessageLite messageLite = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = value;
        return messageLite;
    }

    public void merge(androidx.datastore.preferences.protobuf.LazyFieldLite other) {
        androidx.datastore.preferences.protobuf.ByteString byteString;
        if (other.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(other);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = other.extensionRegistry;
        }
        androidx.datastore.preferences.protobuf.ByteString byteString2 = this.delayedBytes;
        if (byteString2 != null && (byteString = other.delayedBytes) != null) {
            this.delayedBytes = byteString2.concat(byteString);
            return;
        }
        if (this.value == null && other.value != null) {
            setValue(mergeValueAndBytes(other.value, this.delayedBytes, this.extensionRegistry));
        } else if (this.value != null && other.value == null) {
            setValue(mergeValueAndBytes(this.value, other.delayedBytes, other.extensionRegistry));
        } else {
            setValue(this.value.toBuilder().mergeFrom(other.value).build());
        }
    }

    public void mergeFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        if (containsDefaultInstance()) {
            setByteString(input.readBytes(), extensionRegistry);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = extensionRegistry;
        }
        androidx.datastore.preferences.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            setByteString(byteString.concat(input.readBytes()), this.extensionRegistry);
        } else {
            try {
                setValue(this.value.toBuilder().mergeFrom(input, extensionRegistry).build());
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException unused) {
            }
        }
    }

    private static androidx.datastore.preferences.protobuf.MessageLite mergeValueAndBytes(androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.ByteString otherBytes, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) {
        try {
            return value.toBuilder().mergeFrom(otherBytes, extensionRegistry).build();
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException unused) {
            return value;
        }
    }

    public void setByteString(androidx.datastore.preferences.protobuf.ByteString bytes, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) {
        checkArguments(extensionRegistry, bytes);
        this.delayedBytes = bytes;
        this.extensionRegistry = extensionRegistry;
        this.value = null;
        this.memoizedBytes = null;
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        androidx.datastore.preferences.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public androidx.datastore.preferences.protobuf.ByteString toByteString() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        androidx.datastore.preferences.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.memoizedBytes != null) {
                return this.memoizedBytes;
            }
            if (this.value == null) {
                this.memoizedBytes = androidx.datastore.preferences.protobuf.ByteString.EMPTY;
            } else {
                this.memoizedBytes = this.value.toByteString();
            }
            return this.memoizedBytes;
        }
    }

    void writeTo(androidx.datastore.preferences.protobuf.Writer writer, int fieldNumber) throws java.io.IOException {
        if (this.memoizedBytes != null) {
            writer.writeBytes(fieldNumber, this.memoizedBytes);
            return;
        }
        androidx.datastore.preferences.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            writer.writeBytes(fieldNumber, byteString);
        } else if (this.value != null) {
            writer.writeMessage(fieldNumber, this.value);
        } else {
            writer.writeBytes(fieldNumber, androidx.datastore.preferences.protobuf.ByteString.EMPTY);
        }
    }

    protected void ensureInitialized(androidx.datastore.preferences.protobuf.MessageLite defaultInstance) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.delayedBytes != null) {
                    this.value = defaultInstance.getParserForType().parseFrom(this.delayedBytes, this.extensionRegistry);
                    this.memoizedBytes = this.delayedBytes;
                } else {
                    this.value = defaultInstance;
                    this.memoizedBytes = androidx.datastore.preferences.protobuf.ByteString.EMPTY;
                }
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException unused) {
                this.value = defaultInstance;
                this.memoizedBytes = androidx.datastore.preferences.protobuf.ByteString.EMPTY;
            }
        }
    }

    private static void checkArguments(androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.ByteString bytes) {
        if (extensionRegistry == null) {
            throw new java.lang.NullPointerException("found null ExtensionRegistry");
        }
        if (bytes == null) {
            throw new java.lang.NullPointerException("found null ByteString");
        }
    }
}

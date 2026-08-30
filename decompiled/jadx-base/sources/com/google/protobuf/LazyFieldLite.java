package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public class LazyFieldLite {
    private static final com.google.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry();
    private com.google.protobuf.ByteString delayedBytes;
    private com.google.protobuf.ExtensionRegistryLite extensionRegistry;
    private volatile com.google.protobuf.ByteString memoizedBytes;
    protected volatile com.google.protobuf.MessageLite value;

    public int hashCode() {
        return 1;
    }

    public LazyFieldLite(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.ByteString byteString) {
        checkArguments(extensionRegistryLite, byteString);
        this.extensionRegistry = extensionRegistryLite;
        this.delayedBytes = byteString;
    }

    public LazyFieldLite() {
    }

    public static com.google.protobuf.LazyFieldLite fromValue(com.google.protobuf.MessageLite messageLite) {
        com.google.protobuf.LazyFieldLite lazyFieldLite = new com.google.protobuf.LazyFieldLite();
        lazyFieldLite.setValue(messageLite);
        return lazyFieldLite;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.LazyFieldLite)) {
            return false;
        }
        com.google.protobuf.LazyFieldLite lazyFieldLite = (com.google.protobuf.LazyFieldLite) obj;
        com.google.protobuf.MessageLite messageLite = this.value;
        com.google.protobuf.MessageLite messageLite2 = lazyFieldLite.value;
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
        com.google.protobuf.ByteString byteString;
        return this.memoizedBytes == com.google.protobuf.ByteString.EMPTY || (this.value == null && ((byteString = this.delayedBytes) == null || byteString == com.google.protobuf.ByteString.EMPTY));
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public void set(com.google.protobuf.LazyFieldLite lazyFieldLite) {
        this.delayedBytes = lazyFieldLite.delayedBytes;
        this.value = lazyFieldLite.value;
        this.memoizedBytes = lazyFieldLite.memoizedBytes;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite = lazyFieldLite.extensionRegistry;
        if (extensionRegistryLite != null) {
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    public com.google.protobuf.MessageLite getValue(com.google.protobuf.MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public com.google.protobuf.MessageLite setValue(com.google.protobuf.MessageLite messageLite) {
        com.google.protobuf.MessageLite messageLite2 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = messageLite;
        return messageLite2;
    }

    public void merge(com.google.protobuf.LazyFieldLite lazyFieldLite) {
        com.google.protobuf.ByteString byteString;
        if (lazyFieldLite.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(lazyFieldLite);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = lazyFieldLite.extensionRegistry;
        }
        com.google.protobuf.ByteString byteString2 = this.delayedBytes;
        if (byteString2 != null && (byteString = lazyFieldLite.delayedBytes) != null) {
            this.delayedBytes = byteString2.concat(byteString);
            return;
        }
        if (this.value == null && lazyFieldLite.value != null) {
            setValue(mergeValueAndBytes(lazyFieldLite.value, this.delayedBytes, this.extensionRegistry));
        } else if (this.value != null && lazyFieldLite.value == null) {
            setValue(mergeValueAndBytes(this.value, lazyFieldLite.delayedBytes, lazyFieldLite.extensionRegistry));
        } else {
            setValue(this.value.toBuilder().mergeFrom(lazyFieldLite.value).build());
        }
    }

    public void mergeFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        if (containsDefaultInstance()) {
            setByteString(codedInputStream.readBytes(), extensionRegistryLite);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = extensionRegistryLite;
        }
        com.google.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            setByteString(byteString.concat(codedInputStream.readBytes()), this.extensionRegistry);
        } else {
            try {
                setValue(this.value.toBuilder().mergeFrom(codedInputStream, extensionRegistryLite).build());
            } catch (com.google.protobuf.InvalidProtocolBufferException unused) {
            }
        }
    }

    private static com.google.protobuf.MessageLite mergeValueAndBytes(com.google.protobuf.MessageLite messageLite, com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        try {
            return messageLite.toBuilder().mergeFrom(byteString, extensionRegistryLite).build();
        } catch (com.google.protobuf.InvalidProtocolBufferException unused) {
            return messageLite;
        }
    }

    public void setByteString(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        checkArguments(extensionRegistryLite, byteString);
        this.delayedBytes = byteString;
        this.extensionRegistry = extensionRegistryLite;
        this.value = null;
        this.memoizedBytes = null;
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        com.google.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public com.google.protobuf.ByteString toByteString() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        com.google.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.memoizedBytes != null) {
                return this.memoizedBytes;
            }
            if (this.value == null) {
                this.memoizedBytes = com.google.protobuf.ByteString.EMPTY;
            } else {
                this.memoizedBytes = this.value.toByteString();
            }
            return this.memoizedBytes;
        }
    }

    void writeTo(com.google.protobuf.Writer writer, int i) throws java.io.IOException {
        if (this.memoizedBytes != null) {
            writer.writeBytes(i, this.memoizedBytes);
            return;
        }
        com.google.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            writer.writeBytes(i, byteString);
        } else if (this.value != null) {
            writer.writeMessage(i, this.value);
        } else {
            writer.writeBytes(i, com.google.protobuf.ByteString.EMPTY);
        }
    }

    protected void ensureInitialized(com.google.protobuf.MessageLite messageLite) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.delayedBytes != null) {
                    this.value = messageLite.getParserForType().parseFrom(this.delayedBytes, this.extensionRegistry);
                    this.memoizedBytes = this.delayedBytes;
                } else {
                    this.value = messageLite;
                    this.memoizedBytes = com.google.protobuf.ByteString.EMPTY;
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException unused) {
                this.value = messageLite;
                this.memoizedBytes = com.google.protobuf.ByteString.EMPTY;
            }
        }
    }

    private static void checkArguments(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.ByteString byteString) {
        if (extensionRegistryLite == null) {
            throw new java.lang.NullPointerException("found null ExtensionRegistry");
        }
        if (byteString == null) {
            throw new java.lang.NullPointerException("found null ByteString");
        }
    }
}

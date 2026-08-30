package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractMessageLite<MessageType extends androidx.datastore.preferences.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements androidx.datastore.preferences.protobuf.MessageLite {
    protected int memoizedHashCode = 0;

    protected interface InternalOneOfEnum {
        int getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public androidx.datastore.preferences.protobuf.ByteString toByteString() {
        try {
            androidx.datastore.preferences.protobuf.ByteString.CodedBuilder codedBuilderNewCodedBuilder = androidx.datastore.preferences.protobuf.ByteString.newCodedBuilder(getSerializedSize());
            writeTo(codedBuilderNewCodedBuilder.getCodedOutput());
            return codedBuilderNewCodedBuilder.build();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            androidx.datastore.preferences.protobuf.CodedOutputStream codedOutputStreamNewInstance = androidx.datastore.preferences.protobuf.CodedOutputStream.newInstance(bArr);
            writeTo(codedOutputStreamNewInstance);
            codedOutputStreamNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(final java.io.OutputStream output) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.CodedOutputStream codedOutputStreamNewInstance = androidx.datastore.preferences.protobuf.CodedOutputStream.newInstance(output, androidx.datastore.preferences.protobuf.CodedOutputStream.computePreferredBufferSize(getSerializedSize()));
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeDelimitedTo(final java.io.OutputStream output) throws java.io.IOException {
        int serializedSize = getSerializedSize();
        androidx.datastore.preferences.protobuf.CodedOutputStream codedOutputStreamNewInstance = androidx.datastore.preferences.protobuf.CodedOutputStream.newInstance(output, androidx.datastore.preferences.protobuf.CodedOutputStream.computePreferredBufferSize(androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        codedOutputStreamNewInstance.writeUInt32NoTag(serializedSize);
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }

    int getMemoizedSerializedSize() {
        throw new java.lang.UnsupportedOperationException();
    }

    void setMemoizedSerializedSize(int size) {
        throw new java.lang.UnsupportedOperationException();
    }

    int getSerializedSize(androidx.datastore.preferences.protobuf.Schema schema) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = schema.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    androidx.datastore.preferences.protobuf.UninitializedMessageException newUninitializedMessageException() {
        return new androidx.datastore.preferences.protobuf.UninitializedMessageException(this);
    }

    private java.lang.String getSerializingExceptionMessage(java.lang.String target) {
        return "Serializing " + getClass().getName() + " to a " + target + " threw an IOException (should never happen).";
    }

    protected static void checkByteStringIsUtf8(androidx.datastore.preferences.protobuf.ByteString byteString) throws java.lang.IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new java.lang.IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    protected static <T> void addAll(final java.lang.Iterable<T> values, final java.util.List<? super T> list) {
        androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.addAll((java.lang.Iterable) values, (java.util.List) list);
    }

    public static abstract class Builder<MessageType extends androidx.datastore.preferences.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements androidx.datastore.preferences.protobuf.MessageLite.Builder {
        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo45clone();

        protected abstract BuilderType internalMergeFrom(MessageType message);

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(final androidx.datastore.preferences.protobuf.CodedInputStream input, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (BuilderType) mergeFrom(codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            try {
                androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewCodedInput = data.newCodedInput();
                mergeFrom(codedInputStreamNewCodedInput);
                codedInputStreamNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final androidx.datastore.preferences.protobuf.ByteString data, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            try {
                androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewCodedInput = data.newCodedInput();
                mergeFrom(codedInputStreamNewCodedInput, extensionRegistry);
                codedInputStreamNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final byte[] data, final int off, final int len) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            try {
                androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewInstance = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(data, off, len);
                mergeFrom(codedInputStreamNewInstance);
                codedInputStreamNewInstance.checkLastTagWas(0);
                return this;
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final byte[] data, final int off, final int len, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            try {
                androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewInstance = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(data, off, len);
                mergeFrom(codedInputStreamNewInstance, extensionRegistry);
                codedInputStreamNewInstance.checkLastTagWas(0);
                return this;
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final java.io.InputStream input) throws java.io.IOException {
            androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewInstance = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(input);
            mergeFrom(codedInputStreamNewInstance);
            codedInputStreamNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final java.io.InputStream input, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewInstance = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(input);
            mergeFrom(codedInputStreamNewInstance, extensionRegistry);
            codedInputStreamNewInstance.checkLastTagWas(0);
            return this;
        }

        static final class LimitedInputStream extends java.io.FilterInputStream {
            private int limit;

            LimitedInputStream(java.io.InputStream in, int limit) {
                super(in);
                this.limit = limit;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws java.io.IOException {
                return java.lang.Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws java.io.IOException {
                if (this.limit <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.limit--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(final byte[] b, final int off, int len) throws java.io.IOException {
                int i = this.limit;
                if (i <= 0) {
                    return -1;
                }
                int i2 = super.read(b, off, java.lang.Math.min(len, i));
                if (i2 >= 0) {
                    this.limit -= i2;
                }
                return i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(final long n) throws java.io.IOException {
                int iSkip = (int) super.skip(java.lang.Math.min(n, this.limit));
                if (iSkip >= 0) {
                    this.limit -= iSkip;
                }
                return iSkip;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(final java.io.InputStream input, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int i = input.read();
            if (i == -1) {
                return false;
            }
            mergeFrom((java.io.InputStream) new androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.LimitedInputStream(input, androidx.datastore.preferences.protobuf.CodedInputStream.readRawVarint32(i, input)), extensionRegistry);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(final java.io.InputStream input) throws java.io.IOException {
            return mergeDelimitedFrom(input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(androidx.datastore.preferences.protobuf.MessageLite messageLite) {
            if (!getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            return (BuilderType) internalMergeFrom((androidx.datastore.preferences.protobuf.AbstractMessageLite) messageLite);
        }

        private java.lang.String getReadingExceptionMessage(java.lang.String target) {
            return "Reading " + getClass().getName() + " from a " + target + " threw an IOException (should never happen).";
        }

        private static <T> void addAllCheckingNulls(java.lang.Iterable<T> values, java.util.List<? super T> list) {
            if ((list instanceof java.util.ArrayList) && (values instanceof java.util.Collection)) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + ((java.util.Collection) values).size());
            }
            int size = list.size();
            for (T t : values) {
                if (t == null) {
                    java.lang.String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new java.lang.NullPointerException(str);
                }
                list.add(t);
            }
        }

        protected static androidx.datastore.preferences.protobuf.UninitializedMessageException newUninitializedMessageException(androidx.datastore.preferences.protobuf.MessageLite message) {
            return new androidx.datastore.preferences.protobuf.UninitializedMessageException(message);
        }

        @java.lang.Deprecated
        protected static <T> void addAll(final java.lang.Iterable<T> values, final java.util.Collection<? super T> list) {
            addAll((java.lang.Iterable) values, (java.util.List) list);
        }

        protected static <T> void addAll(final java.lang.Iterable<T> values, final java.util.List<? super T> list) {
            androidx.datastore.preferences.protobuf.Internal.checkNotNull(values);
            if (values instanceof androidx.datastore.preferences.protobuf.LazyStringList) {
                java.util.List<?> underlyingElements = ((androidx.datastore.preferences.protobuf.LazyStringList) values).getUnderlyingElements();
                androidx.datastore.preferences.protobuf.LazyStringList lazyStringList = (androidx.datastore.preferences.protobuf.LazyStringList) list;
                int size = list.size();
                for (java.lang.Object obj : underlyingElements) {
                    if (obj == null) {
                        java.lang.String str = "Element at index " + (lazyStringList.size() - size) + " is null.";
                        for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                            lazyStringList.remove(size2);
                        }
                        throw new java.lang.NullPointerException(str);
                    }
                    if (obj instanceof androidx.datastore.preferences.protobuf.ByteString) {
                        lazyStringList.add((androidx.datastore.preferences.protobuf.ByteString) obj);
                    } else if (obj instanceof byte[]) {
                        lazyStringList.add(androidx.datastore.preferences.protobuf.ByteString.copyFrom((byte[]) obj));
                    } else {
                        lazyStringList.add((java.lang.String) obj);
                    }
                }
                return;
            }
            if (values instanceof androidx.datastore.preferences.protobuf.PrimitiveNonBoxingCollection) {
                list.addAll((java.util.Collection) values);
            } else {
                addAllCheckingNulls(values, list);
            }
        }
    }
}

package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractParser<MessageType extends androidx.datastore.preferences.protobuf.MessageLite> implements androidx.datastore.preferences.protobuf.Parser<MessageType> {
    private static final androidx.datastore.preferences.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry();

    private androidx.datastore.preferences.protobuf.UninitializedMessageException newUninitializedMessageException(MessageType message) {
        if (message instanceof androidx.datastore.preferences.protobuf.AbstractMessageLite) {
            return ((androidx.datastore.preferences.protobuf.AbstractMessageLite) message).newUninitializedMessageException();
        }
        return new androidx.datastore.preferences.protobuf.UninitializedMessageException(message);
    }

    private MessageType checkMessageInitialized(MessageType message) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        if (message == null || message.isInitialized()) {
            return message;
        }
        throw newUninitializedMessageException(message).asInvalidProtocolBufferException().setUnfinishedMessage(message);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(input, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(codedInputStream, extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(codedInputStream, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        try {
            androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewCodedInput = data.newCodedInput();
            MessageType partialFrom = parsePartialFrom(codedInputStreamNewCodedInput, extensionRegistry);
            try {
                codedInputStreamNewCodedInput.checkLastTagWas(0);
                return partialFrom;
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(partialFrom);
            }
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.ByteString byteString) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.datastore.preferences.protobuf.ByteString byteString, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(byteString, extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.datastore.preferences.protobuf.ByteString byteString) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer byteBuffer, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        try {
            androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewInstance = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(byteBuffer);
            MessageType partialFrom = parsePartialFrom(codedInputStreamNewInstance, extensionRegistryLite);
            try {
                codedInputStreamNewInstance.checkLastTagWas(0);
                return (MessageType) checkMessageInitialized(partialFrom);
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(partialFrom);
            }
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] data, int off, int len, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        try {
            androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewInstance = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(data, off, len);
            MessageType partialFrom = parsePartialFrom(codedInputStreamNewInstance, extensionRegistry);
            try {
                codedInputStreamNewInstance.checkLastTagWas(0);
                return partialFrom;
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(partialFrom);
            }
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, int i, int i2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i, int i2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(bArr, i, i2, extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i, int i2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] bArr) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewInstance = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(input);
        MessageType partialFrom = parsePartialFrom(codedInputStreamNewInstance, extensionRegistry);
        try {
            codedInputStreamNewInstance.checkLastTagWas(0);
            return partialFrom;
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream inputStream) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(inputStream, extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) parsePartialFrom((java.io.InputStream) new androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, androidx.datastore.preferences.protobuf.CodedInputStream.readRawVarint32(i, inputStream)), extensionRegistryLite);
        } catch (java.io.IOException e) {
            throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException(e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialDelimitedFrom(inputStream, extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }
}

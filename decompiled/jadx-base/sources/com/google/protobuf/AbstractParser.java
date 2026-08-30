package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractParser<MessageType extends com.google.protobuf.MessageLite> implements com.google.protobuf.Parser<MessageType> {
    private static final com.google.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry();

    private com.google.protobuf.UninitializedMessageException newUninitializedMessageException(MessageType messagetype) {
        if (messagetype instanceof com.google.protobuf.AbstractMessageLite) {
            return ((com.google.protobuf.AbstractMessageLite) messagetype).newUninitializedMessageException();
        }
        return new com.google.protobuf.UninitializedMessageException(messagetype);
    }

    private MessageType checkMessageInitialized(MessageType messagetype) throws com.google.protobuf.InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw newUninitializedMessageException(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.CodedInputStream codedInputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(codedInputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(codedInputStream, extensionRegistryLite));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(codedInputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        try {
            com.google.protobuf.CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
            MessageType partialFrom = parsePartialFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
            try {
                codedInputStreamNewCodedInput.checkLastTagWas(0);
                return partialFrom;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(partialFrom);
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(byteString, extensionRegistryLite));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        try {
            com.google.protobuf.CodedInputStream codedInputStreamNewInstance = com.google.protobuf.CodedInputStream.newInstance(byteBuffer);
            MessageType partialFrom = parsePartialFrom(codedInputStreamNewInstance, extensionRegistryLite);
            try {
                codedInputStreamNewInstance.checkLastTagWas(0);
                return (MessageType) checkMessageInitialized(partialFrom);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(partialFrom);
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        try {
            com.google.protobuf.CodedInputStream codedInputStreamNewInstance = com.google.protobuf.CodedInputStream.newInstance(bArr, i, i2);
            MessageType partialFrom = parsePartialFrom(codedInputStreamNewInstance, extensionRegistryLite);
            try {
                codedInputStreamNewInstance.checkLastTagWas(0);
                return partialFrom;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(partialFrom);
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(bArr, i, i2, extensionRegistryLite));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protobuf.CodedInputStream codedInputStreamNewInstance = com.google.protobuf.CodedInputStream.newInstance(inputStream);
        MessageType partialFrom = parsePartialFrom(codedInputStreamNewInstance, extensionRegistryLite);
        try {
            codedInputStreamNewInstance.checkLastTagWas(0);
            return partialFrom;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(inputStream, extensionRegistryLite));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) parsePartialFrom((java.io.InputStream) new com.google.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, com.google.protobuf.CodedInputStream.readRawVarint32(i, inputStream)), extensionRegistryLite);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialDelimitedFrom(inputStream, extensionRegistryLite));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }
}

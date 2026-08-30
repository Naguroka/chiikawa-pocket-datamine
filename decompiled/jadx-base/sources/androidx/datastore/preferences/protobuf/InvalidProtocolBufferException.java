package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends java.io.IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private androidx.datastore.preferences.protobuf.MessageLite unfinishedMessage;
    private boolean wasThrownFromInputStream;

    public InvalidProtocolBufferException(java.lang.String description) {
        super(description);
        this.unfinishedMessage = null;
    }

    public InvalidProtocolBufferException(java.lang.Exception e) {
        super(e.getMessage(), e);
        this.unfinishedMessage = null;
    }

    public InvalidProtocolBufferException(java.lang.String description, java.lang.Exception e) {
        super(description, e);
        this.unfinishedMessage = null;
    }

    public InvalidProtocolBufferException(java.io.IOException e) {
        super(e.getMessage(), e);
        this.unfinishedMessage = null;
    }

    public InvalidProtocolBufferException(java.lang.String description, java.io.IOException e) {
        super(description, e);
        this.unfinishedMessage = null;
    }

    public androidx.datastore.preferences.protobuf.InvalidProtocolBufferException setUnfinishedMessage(androidx.datastore.preferences.protobuf.MessageLite unfinishedMessage) {
        this.unfinishedMessage = unfinishedMessage;
        return this;
    }

    public androidx.datastore.preferences.protobuf.MessageLite getUnfinishedMessage() {
        return this.unfinishedMessage;
    }

    void setThrownFromInputStream() {
        this.wasThrownFromInputStream = true;
    }

    boolean getThrownFromInputStream() {
        return this.wasThrownFromInputStream;
    }

    public java.io.IOException unwrapIOException() {
        return getCause() instanceof java.io.IOException ? (java.io.IOException) getCause() : this;
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException truncatedMessage() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException negativeSize() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException malformedVarint() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException invalidTag() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException invalidEndTag() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException invalidWireType() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    public static class InvalidWireTypeException extends androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(java.lang.String description) {
            super(description);
        }
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException recursionLimitExceeded() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException sizeLimitExceeded() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException parseFailure() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Failed to parse the message.");
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException invalidUtf8() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }
}

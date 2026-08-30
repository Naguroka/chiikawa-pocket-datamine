package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public class UninitializedMessageException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final java.util.List<java.lang.String> missingFields;

    public UninitializedMessageException(com.google.protobuf.MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    public UninitializedMessageException(java.util.List<java.lang.String> list) {
        super(buildDescription(list));
        this.missingFields = list;
    }

    public java.util.List<java.lang.String> getMissingFields() {
        return java.util.Collections.unmodifiableList(this.missingFields);
    }

    public com.google.protobuf.InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new com.google.protobuf.InvalidProtocolBufferException(getMessage());
    }

    private static java.lang.String buildDescription(java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (java.lang.String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }
}

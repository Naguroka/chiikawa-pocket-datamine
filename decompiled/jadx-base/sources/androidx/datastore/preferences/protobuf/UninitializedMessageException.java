package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class UninitializedMessageException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final java.util.List<java.lang.String> missingFields;

    public UninitializedMessageException(final androidx.datastore.preferences.protobuf.MessageLite message) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    public UninitializedMessageException(final java.util.List<java.lang.String> missingFields) {
        super(buildDescription(missingFields));
        this.missingFields = missingFields;
    }

    public java.util.List<java.lang.String> getMissingFields() {
        return java.util.Collections.unmodifiableList(this.missingFields);
    }

    public androidx.datastore.preferences.protobuf.InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException(getMessage());
    }

    private static java.lang.String buildDescription(final java.util.List<java.lang.String> missingFields) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (java.lang.String str : missingFields) {
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

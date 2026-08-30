package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class StructuralMessageInfo implements androidx.datastore.preferences.protobuf.MessageInfo {
    private final int[] checkInitialized;
    private final androidx.datastore.preferences.protobuf.MessageLite defaultInstance;
    private final androidx.datastore.preferences.protobuf.FieldInfo[] fields;
    private final boolean messageSetWireFormat;
    private final androidx.datastore.preferences.protobuf.ProtoSyntax syntax;

    StructuralMessageInfo(androidx.datastore.preferences.protobuf.ProtoSyntax syntax, boolean messageSetWireFormat, int[] checkInitialized, androidx.datastore.preferences.protobuf.FieldInfo[] fields, java.lang.Object defaultInstance) {
        this.syntax = syntax;
        this.messageSetWireFormat = messageSetWireFormat;
        this.checkInitialized = checkInitialized;
        this.fields = fields;
        this.defaultInstance = (androidx.datastore.preferences.protobuf.MessageLite) androidx.datastore.preferences.protobuf.Internal.checkNotNull(defaultInstance, "defaultInstance");
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public androidx.datastore.preferences.protobuf.ProtoSyntax getSyntax() {
        return this.syntax;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    public androidx.datastore.preferences.protobuf.FieldInfo[] getFields() {
        return this.fields;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public androidx.datastore.preferences.protobuf.MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public static androidx.datastore.preferences.protobuf.StructuralMessageInfo.Builder newBuilder() {
        return new androidx.datastore.preferences.protobuf.StructuralMessageInfo.Builder();
    }

    public static androidx.datastore.preferences.protobuf.StructuralMessageInfo.Builder newBuilder(int numFields) {
        return new androidx.datastore.preferences.protobuf.StructuralMessageInfo.Builder(numFields);
    }

    public static final class Builder {
        private int[] checkInitialized;
        private java.lang.Object defaultInstance;
        private final java.util.List<androidx.datastore.preferences.protobuf.FieldInfo> fields;
        private boolean messageSetWireFormat;
        private androidx.datastore.preferences.protobuf.ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
            this.checkInitialized = null;
            this.fields = new java.util.ArrayList();
        }

        public Builder(int numFields) {
            this.checkInitialized = null;
            this.fields = new java.util.ArrayList(numFields);
        }

        public void withDefaultInstance(java.lang.Object defaultInstance) {
            this.defaultInstance = defaultInstance;
        }

        public void withSyntax(androidx.datastore.preferences.protobuf.ProtoSyntax syntax) {
            this.syntax = (androidx.datastore.preferences.protobuf.ProtoSyntax) androidx.datastore.preferences.protobuf.Internal.checkNotNull(syntax, "syntax");
        }

        public void withMessageSetWireFormat(boolean messageSetWireFormat) {
            this.messageSetWireFormat = messageSetWireFormat;
        }

        public void withCheckInitialized(int[] checkInitialized) {
            this.checkInitialized = checkInitialized;
        }

        public void withField(androidx.datastore.preferences.protobuf.FieldInfo field) {
            if (this.wasBuilt) {
                throw new java.lang.IllegalStateException("Builder can only build once");
            }
            this.fields.add(field);
        }

        public androidx.datastore.preferences.protobuf.StructuralMessageInfo build() {
            if (this.wasBuilt) {
                throw new java.lang.IllegalStateException("Builder can only build once");
            }
            if (this.syntax == null) {
                throw new java.lang.IllegalStateException("Must specify a proto syntax");
            }
            this.wasBuilt = true;
            java.util.Collections.sort(this.fields);
            return new androidx.datastore.preferences.protobuf.StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, (androidx.datastore.preferences.protobuf.FieldInfo[]) this.fields.toArray(new androidx.datastore.preferences.protobuf.FieldInfo[0]), this.defaultInstance);
        }
    }
}

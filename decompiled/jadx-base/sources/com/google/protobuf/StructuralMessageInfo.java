package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
final class StructuralMessageInfo implements com.google.protobuf.MessageInfo {
    private final int[] checkInitialized;
    private final com.google.protobuf.MessageLite defaultInstance;
    private final com.google.protobuf.FieldInfo[] fields;
    private final boolean messageSetWireFormat;
    private final com.google.protobuf.ProtoSyntax syntax;

    StructuralMessageInfo(com.google.protobuf.ProtoSyntax protoSyntax, boolean z, int[] iArr, com.google.protobuf.FieldInfo[] fieldInfoArr, java.lang.Object obj) {
        this.syntax = protoSyntax;
        this.messageSetWireFormat = z;
        this.checkInitialized = iArr;
        this.fields = fieldInfoArr;
        this.defaultInstance = (com.google.protobuf.MessageLite) com.google.protobuf.Internal.checkNotNull(obj, "defaultInstance");
    }

    @Override // com.google.protobuf.MessageInfo
    public com.google.protobuf.ProtoSyntax getSyntax() {
        return this.syntax;
    }

    @Override // com.google.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    public com.google.protobuf.FieldInfo[] getFields() {
        return this.fields;
    }

    @Override // com.google.protobuf.MessageInfo
    public com.google.protobuf.MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public static com.google.protobuf.StructuralMessageInfo.Builder newBuilder() {
        return new com.google.protobuf.StructuralMessageInfo.Builder();
    }

    public static com.google.protobuf.StructuralMessageInfo.Builder newBuilder(int i) {
        return new com.google.protobuf.StructuralMessageInfo.Builder(i);
    }

    public static final class Builder {
        private int[] checkInitialized;
        private java.lang.Object defaultInstance;
        private final java.util.List<com.google.protobuf.FieldInfo> fields;
        private boolean messageSetWireFormat;
        private com.google.protobuf.ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
            this.checkInitialized = null;
            this.fields = new java.util.ArrayList();
        }

        public Builder(int i) {
            this.checkInitialized = null;
            this.fields = new java.util.ArrayList(i);
        }

        public void withDefaultInstance(java.lang.Object obj) {
            this.defaultInstance = obj;
        }

        public void withSyntax(com.google.protobuf.ProtoSyntax protoSyntax) {
            this.syntax = (com.google.protobuf.ProtoSyntax) com.google.protobuf.Internal.checkNotNull(protoSyntax, "syntax");
        }

        public void withMessageSetWireFormat(boolean z) {
            this.messageSetWireFormat = z;
        }

        public void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public void withField(com.google.protobuf.FieldInfo fieldInfo) {
            if (this.wasBuilt) {
                throw new java.lang.IllegalStateException("Builder can only build once");
            }
            this.fields.add(fieldInfo);
        }

        public com.google.protobuf.StructuralMessageInfo build() {
            if (this.wasBuilt) {
                throw new java.lang.IllegalStateException("Builder can only build once");
            }
            if (this.syntax == null) {
                throw new java.lang.IllegalStateException("Must specify a proto syntax");
            }
            this.wasBuilt = true;
            java.util.Collections.sort(this.fields);
            return new com.google.protobuf.StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, (com.google.protobuf.FieldInfo[]) this.fields.toArray(new com.google.protobuf.FieldInfo[0]), this.defaultInstance);
        }
    }
}

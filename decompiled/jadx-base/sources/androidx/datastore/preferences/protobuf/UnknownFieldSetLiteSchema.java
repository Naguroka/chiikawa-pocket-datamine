package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
class UnknownFieldSetLiteSchema extends androidx.datastore.preferences.protobuf.UnknownFieldSchema<androidx.datastore.preferences.protobuf.UnknownFieldSetLite, androidx.datastore.preferences.protobuf.UnknownFieldSetLite> {
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    boolean shouldDiscardUnknownFields(androidx.datastore.preferences.protobuf.Reader reader) {
        return false;
    }

    UnknownFieldSetLiteSchema() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public androidx.datastore.preferences.protobuf.UnknownFieldSetLite newBuilder() {
        return androidx.datastore.preferences.protobuf.UnknownFieldSetLite.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void addVarint(androidx.datastore.preferences.protobuf.UnknownFieldSetLite fields, int number, long value) {
        fields.storeField(androidx.datastore.preferences.protobuf.WireFormat.makeTag(number, 0), java.lang.Long.valueOf(value));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void addFixed32(androidx.datastore.preferences.protobuf.UnknownFieldSetLite fields, int number, int value) {
        fields.storeField(androidx.datastore.preferences.protobuf.WireFormat.makeTag(number, 5), java.lang.Integer.valueOf(value));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void addFixed64(androidx.datastore.preferences.protobuf.UnknownFieldSetLite fields, int number, long value) {
        fields.storeField(androidx.datastore.preferences.protobuf.WireFormat.makeTag(number, 1), java.lang.Long.valueOf(value));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void addLengthDelimited(androidx.datastore.preferences.protobuf.UnknownFieldSetLite fields, int number, androidx.datastore.preferences.protobuf.ByteString value) {
        fields.storeField(androidx.datastore.preferences.protobuf.WireFormat.makeTag(number, 2), value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void addGroup(androidx.datastore.preferences.protobuf.UnknownFieldSetLite fields, int number, androidx.datastore.preferences.protobuf.UnknownFieldSetLite subFieldSet) {
        fields.storeField(androidx.datastore.preferences.protobuf.WireFormat.makeTag(number, 3), subFieldSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public androidx.datastore.preferences.protobuf.UnknownFieldSetLite toImmutable(androidx.datastore.preferences.protobuf.UnknownFieldSetLite fields) {
        fields.makeImmutable();
        return fields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void setToMessage(java.lang.Object message, androidx.datastore.preferences.protobuf.UnknownFieldSetLite fields) {
        ((androidx.datastore.preferences.protobuf.GeneratedMessageLite) message).unknownFields = fields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public androidx.datastore.preferences.protobuf.UnknownFieldSetLite getFromMessage(java.lang.Object message) {
        return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite) message).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public androidx.datastore.preferences.protobuf.UnknownFieldSetLite getBuilderFromMessage(java.lang.Object message) {
        androidx.datastore.preferences.protobuf.UnknownFieldSetLite fromMessage = getFromMessage(message);
        if (fromMessage != androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            return fromMessage;
        }
        androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLiteNewInstance = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.newInstance();
        setToMessage(message, unknownFieldSetLiteNewInstance);
        return unknownFieldSetLiteNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void setBuilderToMessage(java.lang.Object message, androidx.datastore.preferences.protobuf.UnknownFieldSetLite fields) {
        setToMessage(message, fields);
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void makeImmutable(java.lang.Object message) {
        getFromMessage(message).makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void writeTo(androidx.datastore.preferences.protobuf.UnknownFieldSetLite fields, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        fields.writeTo(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void writeAsMessageSetTo(androidx.datastore.preferences.protobuf.UnknownFieldSetLite fields, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        fields.writeAsMessageSetTo(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public androidx.datastore.preferences.protobuf.UnknownFieldSetLite merge(androidx.datastore.preferences.protobuf.UnknownFieldSetLite target, androidx.datastore.preferences.protobuf.UnknownFieldSetLite source) {
        if (androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance().equals(source)) {
            return target;
        }
        if (androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance().equals(target)) {
            return androidx.datastore.preferences.protobuf.UnknownFieldSetLite.mutableCopyOf(target, source);
        }
        return target.mergeFrom(source);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public int getSerializedSize(androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknowns) {
        return unknowns.getSerializedSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public int getSerializedSizeAsMessageSet(androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknowns) {
        return unknowns.getSerializedSizeAsMessageSet();
    }
}

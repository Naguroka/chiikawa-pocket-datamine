package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class ExtensionLite<ContainingType extends androidx.datastore.preferences.protobuf.MessageLite, Type> {
    public abstract Type getDefaultValue();

    public abstract androidx.datastore.preferences.protobuf.WireFormat.FieldType getLiteType();

    public abstract androidx.datastore.preferences.protobuf.MessageLite getMessageDefaultInstance();

    public abstract int getNumber();

    boolean isLite() {
        return true;
    }

    public abstract boolean isRepeated();
}

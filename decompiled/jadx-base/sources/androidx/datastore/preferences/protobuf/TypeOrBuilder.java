package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface TypeOrBuilder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
    java.lang.String getEdition();

    androidx.datastore.preferences.protobuf.ByteString getEditionBytes();

    androidx.datastore.preferences.protobuf.Field getFields(int index);

    int getFieldsCount();

    java.util.List<androidx.datastore.preferences.protobuf.Field> getFieldsList();

    java.lang.String getName();

    androidx.datastore.preferences.protobuf.ByteString getNameBytes();

    java.lang.String getOneofs(int index);

    androidx.datastore.preferences.protobuf.ByteString getOneofsBytes(int index);

    int getOneofsCount();

    java.util.List<java.lang.String> getOneofsList();

    androidx.datastore.preferences.protobuf.Option getOptions(int index);

    int getOptionsCount();

    java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList();

    androidx.datastore.preferences.protobuf.SourceContext getSourceContext();

    androidx.datastore.preferences.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}

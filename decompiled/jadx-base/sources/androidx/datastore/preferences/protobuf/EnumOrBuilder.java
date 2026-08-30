package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface EnumOrBuilder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
    java.lang.String getEdition();

    androidx.datastore.preferences.protobuf.ByteString getEditionBytes();

    androidx.datastore.preferences.protobuf.EnumValue getEnumvalue(int index);

    int getEnumvalueCount();

    java.util.List<androidx.datastore.preferences.protobuf.EnumValue> getEnumvalueList();

    java.lang.String getName();

    androidx.datastore.preferences.protobuf.ByteString getNameBytes();

    androidx.datastore.preferences.protobuf.Option getOptions(int index);

    int getOptionsCount();

    java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList();

    androidx.datastore.preferences.protobuf.SourceContext getSourceContext();

    androidx.datastore.preferences.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}

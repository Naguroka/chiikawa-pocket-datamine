package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface ApiOrBuilder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
    androidx.datastore.preferences.protobuf.Method getMethods(int index);

    int getMethodsCount();

    java.util.List<androidx.datastore.preferences.protobuf.Method> getMethodsList();

    androidx.datastore.preferences.protobuf.Mixin getMixins(int index);

    int getMixinsCount();

    java.util.List<androidx.datastore.preferences.protobuf.Mixin> getMixinsList();

    java.lang.String getName();

    androidx.datastore.preferences.protobuf.ByteString getNameBytes();

    androidx.datastore.preferences.protobuf.Option getOptions(int index);

    int getOptionsCount();

    java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList();

    androidx.datastore.preferences.protobuf.SourceContext getSourceContext();

    androidx.datastore.preferences.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    java.lang.String getVersion();

    androidx.datastore.preferences.protobuf.ByteString getVersionBytes();

    boolean hasSourceContext();
}

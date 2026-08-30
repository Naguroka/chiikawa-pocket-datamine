package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface MethodOrBuilder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
    java.lang.String getName();

    androidx.datastore.preferences.protobuf.ByteString getNameBytes();

    androidx.datastore.preferences.protobuf.Option getOptions(int index);

    int getOptionsCount();

    java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList();

    boolean getRequestStreaming();

    java.lang.String getRequestTypeUrl();

    androidx.datastore.preferences.protobuf.ByteString getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    java.lang.String getResponseTypeUrl();

    androidx.datastore.preferences.protobuf.ByteString getResponseTypeUrlBytes();

    androidx.datastore.preferences.protobuf.Syntax getSyntax();

    int getSyntaxValue();
}

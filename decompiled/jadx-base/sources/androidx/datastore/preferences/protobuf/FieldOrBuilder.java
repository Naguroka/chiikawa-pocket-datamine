package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface FieldOrBuilder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
    androidx.datastore.preferences.protobuf.Field.Cardinality getCardinality();

    int getCardinalityValue();

    java.lang.String getDefaultValue();

    androidx.datastore.preferences.protobuf.ByteString getDefaultValueBytes();

    java.lang.String getJsonName();

    androidx.datastore.preferences.protobuf.ByteString getJsonNameBytes();

    androidx.datastore.preferences.protobuf.Field.Kind getKind();

    int getKindValue();

    java.lang.String getName();

    androidx.datastore.preferences.protobuf.ByteString getNameBytes();

    int getNumber();

    int getOneofIndex();

    androidx.datastore.preferences.protobuf.Option getOptions(int index);

    int getOptionsCount();

    java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList();

    boolean getPacked();

    java.lang.String getTypeUrl();

    androidx.datastore.preferences.protobuf.ByteString getTypeUrlBytes();
}

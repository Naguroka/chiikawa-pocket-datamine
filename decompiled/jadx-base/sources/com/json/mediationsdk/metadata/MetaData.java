package com.json.mediationsdk.metadata;

/* JADX INFO: loaded from: classes5.dex */
public class MetaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2992a;
    private java.util.List<java.lang.String> b;
    private java.util.List<com.ironsource.mediationsdk.metadata.MetaData.MetaDataValueTypes> c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(java.lang.String str, java.util.List<java.lang.String> list) {
        this.f2992a = str;
        this.b = list;
        this.c = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.c.add(com.ironsource.mediationsdk.metadata.MetaData.MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<com.ironsource.mediationsdk.metadata.MetaData.MetaDataValueTypes> list2) {
        this.f2992a = str;
        this.b = list;
        this.c = list2;
    }

    public java.lang.String getMetaDataKey() {
        return this.f2992a;
    }

    public java.util.List<java.lang.String> getMetaDataValue() {
        return this.b;
    }

    public java.util.List<com.ironsource.mediationsdk.metadata.MetaData.MetaDataValueTypes> getMetaDataValueType() {
        return this.c;
    }
}

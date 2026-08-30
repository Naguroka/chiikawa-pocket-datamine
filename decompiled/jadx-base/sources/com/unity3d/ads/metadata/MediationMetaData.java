package com.unity3d.ads.metadata;

/* JADX INFO: loaded from: classes6.dex */
public class MediationMetaData extends com.unity3d.ads.metadata.MetaData {
    public static final java.lang.String KEY_MISSED_IMPRESSION_ORDINAL = "missedImpressionOrdinal";
    public static final java.lang.String KEY_NAME = "name";
    public static final java.lang.String KEY_ORDINAL = "ordinal";
    public static final java.lang.String KEY_VERSION = "version";

    public MediationMetaData(android.content.Context context) {
        super(context);
        setCategory("mediation");
    }

    public void setOrdinal(int i) {
        set(KEY_ORDINAL, java.lang.Integer.valueOf(i));
    }

    public void setMissedImpressionOrdinal(int i) {
        set(KEY_MISSED_IMPRESSION_ORDINAL, java.lang.Integer.valueOf(i));
    }

    public void setName(java.lang.String str) {
        set("name", str);
    }

    public void setVersion(java.lang.String str) {
        set("version", str);
    }
}

package com.unity3d.ads.metadata;

/* JADX INFO: loaded from: classes6.dex */
public class PlayerMetaData extends com.unity3d.ads.metadata.MetaData {
    public static final java.lang.String KEY_SERVER_ID = "server_id";

    public PlayerMetaData(android.content.Context context) {
        super(context);
        setCategory("player");
    }

    public void setServerId(java.lang.String str) {
        set(KEY_SERVER_ID, str);
    }
}

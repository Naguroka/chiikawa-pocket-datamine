package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AssetPackStates {
    public static com.google.android.play.core.assetpacks.AssetPackStates a(android.os.Bundle bundle, com.google.android.play.core.assetpacks.co coVar, com.google.android.play.core.assetpacks.eb ebVar, com.google.android.play.core.assetpacks.be beVar) {
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("pack_names");
        java.util.HashMap map = new java.util.HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String str = stringArrayList.get(i);
            map.put(str, com.google.android.play.core.assetpacks.AssetPackState.b(bundle, str, coVar, ebVar, beVar));
        }
        return new com.google.android.play.core.assetpacks.bo(bundle.getLong("total_bytes_to_download"), map);
    }

    public abstract java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AssetPackState> packStates();

    public abstract long totalBytes();
}

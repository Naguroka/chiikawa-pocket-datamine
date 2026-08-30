package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class AssetPackException extends com.google.android.gms.common.api.ApiException {
    AssetPackException(int i) {
        super(new com.google.android.gms.common.api.Status(i, java.lang.String.format(java.util.Locale.getDefault(), "Asset Pack Download Error(%d): %s", java.lang.Integer.valueOf(i), com.google.android.play.core.assetpacks.model.a.a(i))));
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}

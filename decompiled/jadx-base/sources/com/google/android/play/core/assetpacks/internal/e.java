package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e extends com.google.android.play.core.assetpacks.internal.b implements com.google.android.play.core.assetpacks.internal.f {
    public static com.google.android.play.core.assetpacks.internal.f b(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.play.core.assetpacks.internal.f ? (com.google.android.play.core.assetpacks.internal.f) iInterfaceQueryLocalInterface : new com.google.android.play.core.assetpacks.internal.d(iBinder);
    }
}

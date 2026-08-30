package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class an extends com.google.android.play.core.assetpacks.al {
    an(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(awVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void e(android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
        super.e(bundle, bundle2);
        this.f2141a.trySetResult((android.os.ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}

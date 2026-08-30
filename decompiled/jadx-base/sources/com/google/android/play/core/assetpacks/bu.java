package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.assetpacks.internal.aq f2162a;

    bu(com.google.android.play.core.assetpacks.internal.aq aqVar) {
        this.f2162a = aqVar;
    }

    final java.io.InputStream a(int i, java.lang.String str, java.lang.String str2, int i2) {
        try {
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) com.google.android.gms.tasks.Tasks.await(((com.google.android.play.core.assetpacks.y) this.f2162a.a()).a(i, str, str2, i2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", java.lang.Integer.valueOf(i), str, str2, java.lang.Integer.valueOf(i2)), i);
            }
            return new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (java.lang.InterruptedException e) {
            throw new com.google.android.play.core.assetpacks.ck("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", java.lang.Integer.valueOf(i), str, str2, java.lang.Integer.valueOf(i2)), e2, i);
        }
    }
}

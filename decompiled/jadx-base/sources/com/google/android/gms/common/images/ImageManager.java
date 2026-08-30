package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageManager {
    private static final java.lang.Object zaa = new java.lang.Object();
    private static final java.util.HashSet zab = new java.util.HashSet();
    private static com.google.android.gms.common.images.ImageManager zac;
    private final android.content.Context zad;
    private final android.os.Handler zae = new com.google.android.gms.internal.base.zaq(android.os.Looper.getMainLooper());
    private final java.util.concurrent.ExecutorService zaf = com.google.android.gms.internal.base.zap.zaa().zab(4, 2);
    private final com.google.android.gms.internal.base.zak zag = new com.google.android.gms.internal.base.zak();
    private final java.util.Map zah = new java.util.HashMap();
    private final java.util.Map zai = new java.util.HashMap();
    private final java.util.Map zaj = new java.util.HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    final class ImageReceiver extends android.os.ResultReceiver {
        private final android.net.Uri zab;
        private final java.util.ArrayList zac;

        ImageReceiver(android.net.Uri uri) {
            super(new com.google.android.gms.internal.base.zaq(android.os.Looper.getMainLooper()));
            this.zab = uri;
            this.zac = new java.util.ArrayList();
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, android.os.Bundle bundle) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            android.content.res.AssetFileDescriptor assetFileDescriptor = parcelFileDescriptor != null ? new android.content.res.AssetFileDescriptor(parcelFileDescriptor, bundle.getLong("assetFdStartOffset", 0L), bundle.getLong("assetFdLength", -1L)) : null;
            com.google.android.gms.common.images.ImageManager imageManager = com.google.android.gms.common.images.ImageManager.this;
            imageManager.zaf.execute(new com.google.android.gms.common.images.zaa(imageManager, this.zab, assetFileDescriptor));
        }

        public final void zab(com.google.android.gms.common.images.zag zagVar) {
            com.google.android.gms.common.internal.Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zac.add(zagVar);
        }

        public final void zac(com.google.android.gms.common.images.zag zagVar) {
            com.google.android.gms.common.internal.Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zac.remove(zagVar);
        }

        public final void zad() {
            android.content.Intent intent = new android.content.Intent(com.google.android.gms.common.internal.Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(com.google.android.gms.common.internal.Constants.EXTRA_URI, this.zab);
            intent.putExtra(com.google.android.gms.common.internal.Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(com.google.android.gms.common.internal.Constants.EXTRA_PRIORITY, 3);
            android.content.Context context = com.google.android.gms.common.images.ImageManager.this.zad;
            if (android.os.Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, android.app.BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public interface OnImageLoadedListener {
        void onImageLoaded(android.net.Uri uri, android.graphics.drawable.Drawable drawable, boolean z);
    }

    private ImageManager(android.content.Context context, boolean z) {
        this.zad = context.getApplicationContext();
    }

    public static com.google.android.gms.common.images.ImageManager create(android.content.Context context) {
        if (zac == null) {
            zac = new com.google.android.gms.common.images.ImageManager(context, false);
        }
        return zac;
    }

    public void loadImage(android.widget.ImageView imageView, int i) {
        zaj(new com.google.android.gms.common.images.zae(imageView, i));
    }

    public final void zaj(com.google.android.gms.common.images.zag zagVar) {
        com.google.android.gms.common.internal.Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new com.google.android.gms.common.images.zab(this, zagVar).run();
    }

    public void loadImage(android.widget.ImageView imageView, android.net.Uri uri) {
        zaj(new com.google.android.gms.common.images.zae(imageView, uri));
    }

    public void loadImage(android.widget.ImageView imageView, android.net.Uri uri, int i) {
        com.google.android.gms.common.images.zae zaeVar = new com.google.android.gms.common.images.zae(imageView, uri);
        zaeVar.zab = i;
        zaj(zaeVar);
    }

    public void loadImage(com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener, android.net.Uri uri) {
        zaj(new com.google.android.gms.common.images.zaf(onImageLoadedListener, uri));
    }

    public void loadImage(com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener, android.net.Uri uri, int i) {
        com.google.android.gms.common.images.zaf zafVar = new com.google.android.gms.common.images.zaf(onImageLoadedListener, uri);
        zafVar.zab = i;
        zaj(zafVar);
    }
}

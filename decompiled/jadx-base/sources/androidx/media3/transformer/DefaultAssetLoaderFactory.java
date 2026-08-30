package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultAssetLoaderFactory implements androidx.media3.transformer.AssetLoader.Factory {
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;
    private final androidx.media3.common.util.Clock clock;
    private final android.content.Context context;
    private final androidx.media3.transformer.Codec.DecoderFactory decoderFactory;
    private androidx.media3.transformer.AssetLoader.Factory exoPlayerAssetLoaderFactory;
    private androidx.media3.transformer.AssetLoader.Factory imageAssetLoaderFactory;
    private final androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory;

    public DefaultAssetLoaderFactory(android.content.Context context, androidx.media3.transformer.Codec.DecoderFactory decoderFactory, androidx.media3.common.util.Clock clock) {
        this.context = context.getApplicationContext();
        this.decoderFactory = decoderFactory;
        this.clock = clock;
        android.graphics.BitmapFactory.Options options = null;
        this.mediaSourceFactory = null;
        if (androidx.media3.common.util.Util.SDK_INT >= 26) {
            options = new android.graphics.BitmapFactory.Options();
            options.inPreferredColorSpace = android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        this.bitmapLoader = new androidx.media3.datasource.DataSourceBitmapLoader(com.google.common.util.concurrent.MoreExecutors.listeningDecorator(java.util.concurrent.Executors.newSingleThreadExecutor()), new androidx.media3.datasource.DefaultDataSource.Factory(context), options);
    }

    public DefaultAssetLoaderFactory(android.content.Context context, androidx.media3.common.util.BitmapLoader bitmapLoader) {
        this.context = context.getApplicationContext();
        this.decoderFactory = new androidx.media3.transformer.DefaultDecoderFactory(context);
        this.clock = androidx.media3.common.util.Clock.DEFAULT;
        this.mediaSourceFactory = null;
        this.bitmapLoader = bitmapLoader;
    }

    public DefaultAssetLoaderFactory(android.content.Context context, androidx.media3.transformer.Codec.DecoderFactory decoderFactory, androidx.media3.common.util.Clock clock, androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.common.util.BitmapLoader bitmapLoader) {
        this.context = context.getApplicationContext();
        this.decoderFactory = decoderFactory;
        this.clock = clock;
        this.mediaSourceFactory = factory;
        this.bitmapLoader = bitmapLoader;
    }

    @Override // androidx.media3.transformer.AssetLoader.Factory
    public androidx.media3.transformer.AssetLoader createAssetLoader(androidx.media3.transformer.EditedMediaItem editedMediaItem, android.os.Looper looper, androidx.media3.transformer.AssetLoader.Listener listener, androidx.media3.transformer.AssetLoader.CompositionSettings compositionSettings) {
        androidx.media3.transformer.ExoPlayerAssetLoader.Factory factory;
        if (isImage(editedMediaItem.mediaItem.localConfiguration)) {
            if (this.imageAssetLoaderFactory == null) {
                this.imageAssetLoaderFactory = new androidx.media3.transformer.ImageAssetLoader.Factory(this.bitmapLoader);
            }
            return this.imageAssetLoaderFactory.createAssetLoader(editedMediaItem, looper, listener, compositionSettings);
        }
        if (this.exoPlayerAssetLoaderFactory == null) {
            if (this.mediaSourceFactory != null) {
                factory = new androidx.media3.transformer.ExoPlayerAssetLoader.Factory(this.context, this.decoderFactory, this.clock, this.mediaSourceFactory);
            } else {
                factory = new androidx.media3.transformer.ExoPlayerAssetLoader.Factory(this.context, this.decoderFactory, this.clock);
            }
            this.exoPlayerAssetLoaderFactory = factory;
        }
        return this.exoPlayerAssetLoaderFactory.createAssetLoader(editedMediaItem, looper, listener, compositionSettings);
    }

    private boolean isImage(androidx.media3.common.MediaItem.LocalConfiguration localConfiguration) {
        if (localConfiguration == null) {
            return false;
        }
        java.lang.String commonImageMimeTypeFromExtension = localConfiguration.mimeType;
        if (commonImageMimeTypeFromExtension == null) {
            if (java.util.Objects.equals(localConfiguration.uri.getScheme(), "content")) {
                commonImageMimeTypeFromExtension = this.context.getContentResolver().getType(localConfiguration.uri);
            } else {
                java.lang.String path = localConfiguration.uri.getPath();
                if (path == null) {
                    return false;
                }
                int iLastIndexOf = path.lastIndexOf(".");
                if (iLastIndexOf >= 0 && iLastIndexOf < path.length() - 1) {
                    commonImageMimeTypeFromExtension = getCommonImageMimeTypeFromExtension(com.google.common.base.Ascii.toLowerCase(path.substring(iLastIndexOf + 1)));
                }
            }
        }
        if (commonImageMimeTypeFromExtension == null || !androidx.media3.common.MimeTypes.isImage(commonImageMimeTypeFromExtension)) {
            return false;
        }
        androidx.media3.common.util.Assertions.checkState(this.bitmapLoader.supportsMimeType(commonImageMimeTypeFromExtension), "Image format not supported by given bitmapLoader");
        return true;
    }

    private static java.lang.String getCommonImageMimeTypeFromExtension(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "arw":
            case "cr2":
            case "k25":
            case "raw":
                return androidx.media3.common.MimeTypes.IMAGE_RAW;
            case "bmp":
            case "dib":
                return androidx.media3.common.MimeTypes.IMAGE_BMP;
            case "gif":
                return "image/gif";
            case "ico":
                return "image/x-icon";
            case "jfi":
            case "jif":
            case "jpe":
            case "jpg":
            case "jfif":
            case "jpeg":
                return androidx.media3.common.MimeTypes.IMAGE_JPEG;
            case "png":
                return androidx.media3.common.MimeTypes.IMAGE_PNG;
            case "svg":
            case "svgz":
                return "image/svg+xml";
            case "tif":
            case "tiff":
                return "image/tiff";
            case "avif":
                return androidx.media3.common.MimeTypes.IMAGE_AVIF;
            case "heic":
                return androidx.media3.common.MimeTypes.IMAGE_HEIC;
            case "heif":
                return androidx.media3.common.MimeTypes.IMAGE_HEIF;
            case "webp":
                return androidx.media3.common.MimeTypes.IMAGE_WEBP;
            default:
                return null;
        }
    }
}

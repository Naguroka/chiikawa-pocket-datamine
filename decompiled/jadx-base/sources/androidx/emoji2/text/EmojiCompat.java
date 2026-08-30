package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompat {
    public static final java.lang.String EDITOR_INFO_METAVERSION_KEY = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final java.lang.String EDITOR_INFO_REPLACE_ALL_KEY = "android.support.text.emoji.emojiCompat_replaceAll";
    static final int EMOJI_COUNT_UNLIMITED = Integer.MAX_VALUE;
    public static final int EMOJI_FALLBACK = 2;
    public static final int EMOJI_SUPPORTED = 1;
    public static final int EMOJI_UNSUPPORTED = 0;
    public static final int LOAD_STATE_DEFAULT = 3;
    public static final int LOAD_STATE_FAILED = 2;
    public static final int LOAD_STATE_LOADING = 0;
    public static final int LOAD_STATE_SUCCEEDED = 1;
    public static final int LOAD_STRATEGY_DEFAULT = 0;
    public static final int LOAD_STRATEGY_MANUAL = 1;
    private static final java.lang.String NOT_INITIALIZED_ERROR_TEXT = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
    public static final int REPLACE_STRATEGY_ALL = 1;
    public static final int REPLACE_STRATEGY_DEFAULT = 0;
    public static final int REPLACE_STRATEGY_NON_EXISTENT = 2;
    private static volatile boolean sHasDoneDefaultConfigLookup;
    private static volatile androidx.emoji2.text.EmojiCompat sInstance;
    final int[] mEmojiAsDefaultStyleExceptions;
    private final int mEmojiSpanIndicatorColor;
    private final boolean mEmojiSpanIndicatorEnabled;
    private final androidx.emoji2.text.EmojiCompat.GlyphChecker mGlyphChecker;
    private final androidx.emoji2.text.EmojiCompat.CompatInternal mHelper;
    private final java.util.Set<androidx.emoji2.text.EmojiCompat.InitCallback> mInitCallbacks;
    private final java.util.concurrent.locks.ReadWriteLock mInitLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private volatile int mLoadState = 3;
    private final android.os.Handler mMainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private final int mMetadataLoadStrategy;
    final androidx.emoji2.text.EmojiCompat.MetadataRepoLoader mMetadataLoader;
    final boolean mReplaceAll;
    final boolean mUseEmojiAsDefaultStyle;
    private static final java.lang.Object INSTANCE_LOCK = new java.lang.Object();
    private static final java.lang.Object CONFIG_LOCK = new java.lang.Object();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CodepointSequenceMatchResult {
    }

    public interface GlyphChecker {
        boolean hasGlyph(java.lang.CharSequence charSequence, int i, int i2, int i3);
    }

    public static abstract class InitCallback {
        public void onFailed(java.lang.Throwable th) {
        }

        public void onInitialized() {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        void load(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    public static abstract class MetadataRepoLoaderCallback {
        public abstract void onFailed(java.lang.Throwable th);

        public abstract void onLoaded(androidx.emoji2.text.MetadataRepo metadataRepo);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ReplaceStrategy {
    }

    private EmojiCompat(androidx.emoji2.text.EmojiCompat.Config config) {
        this.mReplaceAll = config.mReplaceAll;
        this.mUseEmojiAsDefaultStyle = config.mUseEmojiAsDefaultStyle;
        this.mEmojiAsDefaultStyleExceptions = config.mEmojiAsDefaultStyleExceptions;
        this.mEmojiSpanIndicatorEnabled = config.mEmojiSpanIndicatorEnabled;
        this.mEmojiSpanIndicatorColor = config.mEmojiSpanIndicatorColor;
        this.mMetadataLoader = config.mMetadataLoader;
        this.mMetadataLoadStrategy = config.mMetadataLoadStrategy;
        this.mGlyphChecker = config.mGlyphChecker;
        androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet();
        this.mInitCallbacks = arraySet;
        if (config.mInitCallbacks != null && !config.mInitCallbacks.isEmpty()) {
            arraySet.addAll(config.mInitCallbacks);
        }
        this.mHelper = new androidx.emoji2.text.EmojiCompat.CompatInternal19(this);
        loadMetadata();
    }

    public static androidx.emoji2.text.EmojiCompat init(android.content.Context context) {
        return init(context, null);
    }

    public static androidx.emoji2.text.EmojiCompat init(android.content.Context context, androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory defaultEmojiCompatConfigFactory) {
        androidx.emoji2.text.EmojiCompat emojiCompat;
        if (sHasDoneDefaultConfigLookup) {
            return sInstance;
        }
        if (defaultEmojiCompatConfigFactory == null) {
            defaultEmojiCompatConfigFactory = new androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory(null);
        }
        androidx.emoji2.text.EmojiCompat.Config configCreate = defaultEmojiCompatConfigFactory.create(context);
        synchronized (CONFIG_LOCK) {
            if (!sHasDoneDefaultConfigLookup) {
                if (configCreate != null) {
                    init(configCreate);
                }
                sHasDoneDefaultConfigLookup = true;
            }
            emojiCompat = sInstance;
        }
        return emojiCompat;
    }

    public static androidx.emoji2.text.EmojiCompat init(androidx.emoji2.text.EmojiCompat.Config config) {
        androidx.emoji2.text.EmojiCompat emojiCompat = sInstance;
        if (emojiCompat == null) {
            synchronized (INSTANCE_LOCK) {
                emojiCompat = sInstance;
                if (emojiCompat == null) {
                    emojiCompat = new androidx.emoji2.text.EmojiCompat(config);
                    sInstance = emojiCompat;
                }
            }
        }
        return emojiCompat;
    }

    public static boolean isConfigured() {
        return sInstance != null;
    }

    public static androidx.emoji2.text.EmojiCompat reset(androidx.emoji2.text.EmojiCompat.Config config) {
        androidx.emoji2.text.EmojiCompat emojiCompat;
        synchronized (INSTANCE_LOCK) {
            emojiCompat = new androidx.emoji2.text.EmojiCompat(config);
            sInstance = emojiCompat;
        }
        return emojiCompat;
    }

    public static androidx.emoji2.text.EmojiCompat reset(androidx.emoji2.text.EmojiCompat emojiCompat) {
        androidx.emoji2.text.EmojiCompat emojiCompat2;
        synchronized (INSTANCE_LOCK) {
            sInstance = emojiCompat;
            emojiCompat2 = sInstance;
        }
        return emojiCompat2;
    }

    public static void skipDefaultConfigurationLookup(boolean z) {
        synchronized (CONFIG_LOCK) {
            sHasDoneDefaultConfigLookup = z;
        }
    }

    public static androidx.emoji2.text.EmojiCompat get() {
        androidx.emoji2.text.EmojiCompat emojiCompat;
        synchronized (INSTANCE_LOCK) {
            emojiCompat = sInstance;
            androidx.core.util.Preconditions.checkState(emojiCompat != null, NOT_INITIALIZED_ERROR_TEXT);
        }
        return emojiCompat;
    }

    public void load() {
        androidx.core.util.Preconditions.checkState(this.mMetadataLoadStrategy == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (isInitialized()) {
            return;
        }
        this.mInitLock.writeLock().lock();
        try {
            if (this.mLoadState != 0) {
                this.mLoadState = 0;
                this.mInitLock.writeLock().unlock();
                this.mHelper.loadMetadata();
                return;
            }
            this.mInitLock.writeLock().unlock();
        } catch (java.lang.Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    private void loadMetadata() {
        this.mInitLock.writeLock().lock();
        try {
            if (this.mMetadataLoadStrategy == 0) {
                this.mLoadState = 0;
            }
            this.mInitLock.writeLock().unlock();
            if (getLoadState() == 0) {
                this.mHelper.loadMetadata();
            }
        } catch (java.lang.Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    void onMetadataLoadSuccess() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.mInitLock.writeLock().lock();
        try {
            this.mLoadState = 1;
            arrayList.addAll(this.mInitCallbacks);
            this.mInitCallbacks.clear();
            this.mInitLock.writeLock().unlock();
            this.mMainHandler.post(new androidx.emoji2.text.EmojiCompat.ListenerDispatcher(arrayList, this.mLoadState));
        } catch (java.lang.Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    void onMetadataLoadFailed(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.mInitLock.writeLock().lock();
        try {
            this.mLoadState = 2;
            arrayList.addAll(this.mInitCallbacks);
            this.mInitCallbacks.clear();
            this.mInitLock.writeLock().unlock();
            this.mMainHandler.post(new androidx.emoji2.text.EmojiCompat.ListenerDispatcher(arrayList, this.mLoadState, th));
        } catch (java.lang.Throwable th2) {
            this.mInitLock.writeLock().unlock();
            throw th2;
        }
    }

    public void registerInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback initCallback) {
        androidx.core.util.Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.mInitLock.writeLock().lock();
        try {
            if (this.mLoadState == 1 || this.mLoadState == 2) {
                this.mMainHandler.post(new androidx.emoji2.text.EmojiCompat.ListenerDispatcher(initCallback, this.mLoadState));
            } else {
                this.mInitCallbacks.add(initCallback);
            }
        } finally {
            this.mInitLock.writeLock().unlock();
        }
    }

    public void unregisterInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback initCallback) {
        androidx.core.util.Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.mInitLock.writeLock().lock();
        try {
            this.mInitCallbacks.remove(initCallback);
        } finally {
            this.mInitLock.writeLock().unlock();
        }
    }

    public int getLoadState() {
        this.mInitLock.readLock().lock();
        try {
            return this.mLoadState;
        } finally {
            this.mInitLock.readLock().unlock();
        }
    }

    private boolean isInitialized() {
        return getLoadState() == 1;
    }

    public boolean isEmojiSpanIndicatorEnabled() {
        return this.mEmojiSpanIndicatorEnabled;
    }

    public int getEmojiSpanIndicatorColor() {
        return this.mEmojiSpanIndicatorColor;
    }

    public static boolean handleOnKeyDown(android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        return androidx.emoji2.text.EmojiProcessor.handleOnKeyDown(editable, i, keyEvent);
    }

    public static boolean handleDeleteSurroundingText(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i, int i2, boolean z) {
        return androidx.emoji2.text.EmojiProcessor.handleDeleteSurroundingText(inputConnection, editable, i, i2, z);
    }

    @java.lang.Deprecated
    public boolean hasEmojiGlyph(java.lang.CharSequence charSequence) {
        androidx.core.util.Preconditions.checkState(isInitialized(), "Not initialized yet");
        androidx.core.util.Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.hasEmojiGlyph(charSequence);
    }

    @java.lang.Deprecated
    public boolean hasEmojiGlyph(java.lang.CharSequence charSequence, int i) {
        androidx.core.util.Preconditions.checkState(isInitialized(), "Not initialized yet");
        androidx.core.util.Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.hasEmojiGlyph(charSequence, i);
    }

    public int getEmojiMatch(java.lang.CharSequence charSequence, int i) {
        androidx.core.util.Preconditions.checkState(isInitialized(), "Not initialized yet");
        androidx.core.util.Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.getEmojiMatch(charSequence, i);
    }

    public java.lang.CharSequence process(java.lang.CharSequence charSequence) {
        return process(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public java.lang.CharSequence process(java.lang.CharSequence charSequence, int i, int i2) {
        return process(charSequence, i, i2, Integer.MAX_VALUE);
    }

    public java.lang.CharSequence process(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        return process(charSequence, i, i2, i3, 0);
    }

    public java.lang.CharSequence process(java.lang.CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        androidx.core.util.Preconditions.checkState(isInitialized(), "Not initialized yet");
        androidx.core.util.Preconditions.checkArgumentNonnegative(i, "start cannot be negative");
        androidx.core.util.Preconditions.checkArgumentNonnegative(i2, "end cannot be negative");
        androidx.core.util.Preconditions.checkArgumentNonnegative(i3, "maxEmojiCount cannot be negative");
        androidx.core.util.Preconditions.checkArgument(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.Preconditions.checkArgument(i <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.Preconditions.checkArgument(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            z = i4 != 2 ? this.mReplaceAll : false;
        } else {
            z = true;
        }
        return this.mHelper.process(charSequence, i, i2, i3, z);
    }

    public java.lang.String getAssetSignature() {
        androidx.core.util.Preconditions.checkState(isInitialized(), "Not initialized yet");
        return this.mHelper.getAssetSignature();
    }

    public void updateEditorInfo(android.view.inputmethod.EditorInfo editorInfo) {
        if (!isInitialized() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        this.mHelper.updateEditorInfoAttrs(editorInfo);
    }

    static class SpanFactory {
        SpanFactory() {
        }

        androidx.emoji2.text.EmojiSpan createSpan(androidx.emoji2.text.EmojiMetadata emojiMetadata) {
            return new androidx.emoji2.text.TypefaceEmojiSpan(emojiMetadata);
        }
    }

    public static abstract class Config {
        int[] mEmojiAsDefaultStyleExceptions;
        boolean mEmojiSpanIndicatorEnabled;
        java.util.Set<androidx.emoji2.text.EmojiCompat.InitCallback> mInitCallbacks;
        final androidx.emoji2.text.EmojiCompat.MetadataRepoLoader mMetadataLoader;
        boolean mReplaceAll;
        boolean mUseEmojiAsDefaultStyle;
        int mEmojiSpanIndicatorColor = -16711936;
        int mMetadataLoadStrategy = 0;
        androidx.emoji2.text.EmojiCompat.GlyphChecker mGlyphChecker = new androidx.emoji2.text.DefaultGlyphChecker();

        protected Config(androidx.emoji2.text.EmojiCompat.MetadataRepoLoader metadataRepoLoader) {
            androidx.core.util.Preconditions.checkNotNull(metadataRepoLoader, "metadataLoader cannot be null.");
            this.mMetadataLoader = metadataRepoLoader;
        }

        public androidx.emoji2.text.EmojiCompat.Config registerInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback initCallback) {
            androidx.core.util.Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            if (this.mInitCallbacks == null) {
                this.mInitCallbacks = new androidx.collection.ArraySet();
            }
            this.mInitCallbacks.add(initCallback);
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config unregisterInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback initCallback) {
            androidx.core.util.Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            java.util.Set<androidx.emoji2.text.EmojiCompat.InitCallback> set = this.mInitCallbacks;
            if (set != null) {
                set.remove(initCallback);
            }
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setReplaceAll(boolean z) {
            this.mReplaceAll = z;
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setUseEmojiAsDefaultStyle(boolean z) {
            return setUseEmojiAsDefaultStyle(z, null);
        }

        public androidx.emoji2.text.EmojiCompat.Config setUseEmojiAsDefaultStyle(boolean z, java.util.List<java.lang.Integer> list) {
            this.mUseEmojiAsDefaultStyle = z;
            if (z && list != null) {
                this.mEmojiAsDefaultStyleExceptions = new int[list.size()];
                java.util.Iterator<java.lang.Integer> it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    this.mEmojiAsDefaultStyleExceptions[i] = it.next().intValue();
                    i++;
                }
                java.util.Arrays.sort(this.mEmojiAsDefaultStyleExceptions);
            } else {
                this.mEmojiAsDefaultStyleExceptions = null;
            }
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setEmojiSpanIndicatorEnabled(boolean z) {
            this.mEmojiSpanIndicatorEnabled = z;
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setEmojiSpanIndicatorColor(int i) {
            this.mEmojiSpanIndicatorColor = i;
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setMetadataLoadStrategy(int i) {
            this.mMetadataLoadStrategy = i;
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setGlyphChecker(androidx.emoji2.text.EmojiCompat.GlyphChecker glyphChecker) {
            androidx.core.util.Preconditions.checkNotNull(glyphChecker, "GlyphChecker cannot be null");
            this.mGlyphChecker = glyphChecker;
            return this;
        }

        protected final androidx.emoji2.text.EmojiCompat.MetadataRepoLoader getMetadataRepoLoader() {
            return this.mMetadataLoader;
        }
    }

    private static class ListenerDispatcher implements java.lang.Runnable {
        private final java.util.List<androidx.emoji2.text.EmojiCompat.InitCallback> mInitCallbacks;
        private final int mLoadState;
        private final java.lang.Throwable mThrowable;

        ListenerDispatcher(androidx.emoji2.text.EmojiCompat.InitCallback initCallback, int i) {
            this(java.util.Arrays.asList((androidx.emoji2.text.EmojiCompat.InitCallback) androidx.core.util.Preconditions.checkNotNull(initCallback, "initCallback cannot be null")), i, null);
        }

        ListenerDispatcher(java.util.Collection<androidx.emoji2.text.EmojiCompat.InitCallback> collection, int i) {
            this(collection, i, null);
        }

        ListenerDispatcher(java.util.Collection<androidx.emoji2.text.EmojiCompat.InitCallback> collection, int i, java.lang.Throwable th) {
            androidx.core.util.Preconditions.checkNotNull(collection, "initCallbacks cannot be null");
            this.mInitCallbacks = new java.util.ArrayList(collection);
            this.mLoadState = i;
            this.mThrowable = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.mInitCallbacks.size();
            int i = 0;
            if (this.mLoadState != 1) {
                while (i < size) {
                    this.mInitCallbacks.get(i).onFailed(this.mThrowable);
                    i++;
                }
            } else {
                while (i < size) {
                    this.mInitCallbacks.get(i).onInitialized();
                    i++;
                }
            }
        }
    }

    private static class CompatInternal {
        final androidx.emoji2.text.EmojiCompat mEmojiCompat;

        java.lang.String getAssetSignature() {
            return "";
        }

        public int getEmojiMatch(java.lang.CharSequence charSequence, int i) {
            return 0;
        }

        boolean hasEmojiGlyph(java.lang.CharSequence charSequence) {
            return false;
        }

        boolean hasEmojiGlyph(java.lang.CharSequence charSequence, int i) {
            return false;
        }

        java.lang.CharSequence process(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return charSequence;
        }

        void updateEditorInfoAttrs(android.view.inputmethod.EditorInfo editorInfo) {
        }

        CompatInternal(androidx.emoji2.text.EmojiCompat emojiCompat) {
            this.mEmojiCompat = emojiCompat;
        }

        void loadMetadata() {
            this.mEmojiCompat.onMetadataLoadSuccess();
        }
    }

    private static final class CompatInternal19 extends androidx.emoji2.text.EmojiCompat.CompatInternal {
        private volatile androidx.emoji2.text.MetadataRepo mMetadataRepo;
        private volatile androidx.emoji2.text.EmojiProcessor mProcessor;

        CompatInternal19(androidx.emoji2.text.EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void loadMetadata() {
            try {
                this.mEmojiCompat.mMetadataLoader.load(new androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompat.CompatInternal19.1
                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onLoaded(androidx.emoji2.text.MetadataRepo metadataRepo) {
                        androidx.emoji2.text.EmojiCompat.CompatInternal19.this.onMetadataLoadSuccess(metadataRepo);
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onFailed(java.lang.Throwable th) {
                        androidx.emoji2.text.EmojiCompat.CompatInternal19.this.mEmojiCompat.onMetadataLoadFailed(th);
                    }
                });
            } catch (java.lang.Throwable th) {
                this.mEmojiCompat.onMetadataLoadFailed(th);
            }
        }

        void onMetadataLoadSuccess(androidx.emoji2.text.MetadataRepo metadataRepo) {
            if (metadataRepo == null) {
                this.mEmojiCompat.onMetadataLoadFailed(new java.lang.IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.mMetadataRepo = metadataRepo;
            this.mProcessor = new androidx.emoji2.text.EmojiProcessor(this.mMetadataRepo, new androidx.emoji2.text.EmojiCompat.SpanFactory(), this.mEmojiCompat.mGlyphChecker, this.mEmojiCompat.mUseEmojiAsDefaultStyle, this.mEmojiCompat.mEmojiAsDefaultStyleExceptions);
            this.mEmojiCompat.onMetadataLoadSuccess();
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        boolean hasEmojiGlyph(java.lang.CharSequence charSequence) {
            return this.mProcessor.getEmojiMatch(charSequence) == 1;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        boolean hasEmojiGlyph(java.lang.CharSequence charSequence, int i) {
            return this.mProcessor.getEmojiMatch(charSequence, i) == 1;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        public int getEmojiMatch(java.lang.CharSequence charSequence, int i) {
            return this.mProcessor.getEmojiMatch(charSequence, i);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        java.lang.CharSequence process(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.mProcessor.process(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void updateEditorInfoAttrs(android.view.inputmethod.EditorInfo editorInfo) {
            editorInfo.extras.putInt(androidx.emoji2.text.EmojiCompat.EDITOR_INFO_METAVERSION_KEY, this.mMetadataRepo.getMetadataVersion());
            editorInfo.extras.putBoolean(androidx.emoji2.text.EmojiCompat.EDITOR_INFO_REPLACE_ALL_KEY, this.mEmojiCompat.mReplaceAll);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        java.lang.String getAssetSignature() {
            java.lang.String strSourceSha = this.mMetadataRepo.getMetadataList().sourceSha();
            return strSourceSha == null ? "" : strSourceSha;
        }
    }
}

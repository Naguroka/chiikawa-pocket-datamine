package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AndroidCacheRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0002J\u0011\u0010\u001d\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J\u0011\u0010%\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ3\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u0011H\u0002J\u000e\u00102\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0011J\b\u00103\u001a\u00020\u000eH\u0002J\u0010\u00104\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\u0010\u00105\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0011H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00160\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidCacheRepository;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCacheDirectory", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "remoteCacheDataSource", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "context", "Landroid/content/Context;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/GetCacheDirectory;Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Landroid/content/Context;)V", "cacheDir", "Ljava/io/File;", "cachedFiles", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/unity3d/ads/core/data/model/CachedFile;", "getCachedFiles", "()Ljava/util/concurrent/ConcurrentHashMap;", "neededFiles", "", "getNeededFiles", "scope", "Lkotlinx/coroutines/CoroutineScope;", "addFileToCache", "", "cachedFile", "clearCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doesFileExist", "", com.ironsource.rc.c.b, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheDirBase", "getCacheDirPath", "getCacheSize", "", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "url", "objectId", "headers", "Lorg/json/JSONArray;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilePath", "filename", "getFilename", "initCacheDir", "removeFile", "retrieveFile", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidCacheRepository implements com.unity3d.ads.core.data.repository.CacheRepository {
    private final java.io.File cacheDir;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.unity3d.ads.core.data.model.CachedFile> cachedFiles;
    private final android.content.Context context;
    private final com.unity3d.ads.core.domain.CreateFile createFile;
    private final com.unity3d.ads.core.domain.GetCacheDirectory getCacheDirectory;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<java.lang.String>> neededFiles;
    private final com.unity3d.ads.core.data.datasource.CacheDataSource remoteCacheDataSource;
    private final kotlinx.coroutines.CoroutineScope scope;

    private final java.lang.String getCacheDirPath() {
        return com.unity3d.services.UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME;
    }

    public AndroidCacheRepository(kotlinx.coroutines.CoroutineDispatcher ioDispatcher, com.unity3d.ads.core.domain.GetCacheDirectory getCacheDirectory, com.unity3d.ads.core.domain.CreateFile createFile, com.unity3d.ads.core.data.datasource.CacheDataSource remoteCacheDataSource, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCacheDirectory, "getCacheDirectory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createFile, "createFile");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteCacheDataSource, "remoteCacheDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.getCacheDirectory = getCacheDirectory;
        this.createFile = createFile;
        this.remoteCacheDataSource = remoteCacheDataSource;
        this.context = context;
        this.scope = kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(ioDispatcher), new kotlinx.coroutines.CoroutineName("CacheRepository")), kotlinx.coroutines.NonCancellable.INSTANCE);
        this.cachedFiles = new java.util.concurrent.ConcurrentHashMap<>();
        this.neededFiles = new java.util.concurrent.ConcurrentHashMap<>();
        this.cacheDir = initCacheDir();
    }

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.unity3d.ads.core.data.model.CachedFile> getCachedFiles() {
        return this.cachedFiles;
    }

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<java.lang.String>> getNeededFiles() {
        return this.neededFiles;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidCacheRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2", f = "AndroidCacheRepository.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    static final class C16412 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult>, java.lang.Object> {
        final /* synthetic */ java.lang.String $objectId;
        final /* synthetic */ int $priority;
        final /* synthetic */ java.lang.String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16412(java.lang.String str, java.lang.String str2, int i, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidCacheRepository.C16412> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$objectId = str2;
            this.$priority = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.data.repository.AndroidCacheRepository.this.new C16412(this.$url, this.$objectId, this.$priority, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
            return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository.C16412) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String filename = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this.getFilename(this.$url);
                try {
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository.this.createFile.invoke(com.unity3d.ads.core.data.repository.AndroidCacheRepository.this.getFilePath(filename)).createNewFile();
                    java.lang.String str = this.$url;
                    this.label = 1;
                    obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1(str, null, com.unity3d.ads.core.data.repository.AndroidCacheRepository.this, filename, str, this.$priority), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (java.io.IOException unused) {
                    return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.FILE_IO_CREATE, null, 2, null);
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.unity3d.ads.core.data.model.CacheResult cacheResult = (com.unity3d.ads.core.data.model.CacheResult) obj;
            if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Success) {
                com.unity3d.ads.core.data.model.CachedFile cachedFile = ((com.unity3d.ads.core.data.model.CacheResult.Success) cacheResult).getCachedFile();
                com.unity3d.ads.core.data.repository.AndroidCacheRepository.this.addFileToCache(cachedFile.copy((254 & 1) != 0 ? cachedFile.objectId : this.$objectId, (254 & 2) != 0 ? cachedFile.url : null, (254 & 4) != 0 ? cachedFile.name : null, (254 & 8) != 0 ? cachedFile.file : null, (254 & 16) != 0 ? cachedFile.extension : null, (254 & 32) != 0 ? cachedFile.contentLength : 0L, (254 & 64) != 0 ? cachedFile.protocol : null, (254 & 128) != 0 ? cachedFile.priority : 0));
            }
            return cacheResult;
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public java.lang.Object getFile(java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray, int i, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.scope.getCoroutineContext(), new com.unity3d.ads.core.data.repository.AndroidCacheRepository.C16412(str, str2, i, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public com.unity3d.ads.core.data.model.CacheResult retrieveFile(java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        com.unity3d.ads.core.data.model.CachedFile cachedFile = this.cachedFiles.get(fileName);
        if (cachedFile != null) {
            return new com.unity3d.ads.core.data.model.CacheResult.Success(cachedFile, com.unity3d.ads.core.data.model.CacheSource.LOCAL);
        }
        return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.FILE_NOT_FOUND, com.unity3d.ads.core.data.model.CacheSource.LOCAL);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(com.unity3d.ads.core.data.model.CachedFile cachedFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
        this.cachedFiles.remove(cachedFile.getName());
        java.util.Set<java.lang.String> set = this.neededFiles.get(cachedFile.getName());
        if (set != null) {
            set.remove(cachedFile.getObjectId());
        }
        java.io.File file = cachedFile.getFile();
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                return file.delete();
            }
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public java.lang.Object doesFileExist(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.cachedFiles.containsKey(str));
    }

    public final java.lang.String getFilename(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        return com.unity3d.ads.core.extensions.StringExtensionsKt.getSHA256Hash(url);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidCacheRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.data.repository.AndroidCacheRepository.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.io.File[] fileArrListFiles = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this.cacheDir.listFiles();
                if (fileArrListFiles == null) {
                    return null;
                }
                for (java.io.File file : fileArrListFiles) {
                    file.delete();
                }
                return kotlin.Unit.INSTANCE;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public java.lang.Object clearCache(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.scope.getCoroutineContext(), new com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass2(null), continuation);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidCacheRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16402 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long>, java.lang.Object> {
        int label;

        C16402(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidCacheRepository.C16402> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.data.repository.AndroidCacheRepository.this.new C16402(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
            return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository.C16402) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.coroutines.jvm.internal.Boxing.boxLong(com.unity3d.ads.core.extensions.FileExtensionsKt.getDirectorySize(com.unity3d.ads.core.data.repository.AndroidCacheRepository.this.cacheDir));
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public java.lang.Object getCacheSize(kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.scope.getCoroutineContext(), new com.unity3d.ads.core.data.repository.AndroidCacheRepository.C16402(null), continuation);
    }

    private final java.io.File initCacheDir() {
        java.io.File fileInvoke = this.getCacheDirectory.invoke(getCacheDirBase(), getCacheDirPath());
        fileInvoke.mkdirs();
        return fileInvoke;
    }

    private final java.io.File getCacheDirBase() {
        java.io.File cacheDir = this.context.getCacheDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
        return cacheDir;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getFilePath(java.lang.String filename) {
        return this.cacheDir.getAbsolutePath() + java.io.File.separator + filename;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addFileToCache(com.unity3d.ads.core.data.model.CachedFile cachedFile) {
        this.cachedFiles.put(cachedFile.getName(), cachedFile);
        java.util.LinkedHashSet linkedHashSet = this.neededFiles.get(cachedFile.getName());
        if (linkedHashSet == null) {
            linkedHashSet = new java.util.LinkedHashSet();
        }
        linkedHashSet.add(cachedFile.getObjectId());
        this.neededFiles.put(cachedFile.getName(), linkedHashSet);
    }
}

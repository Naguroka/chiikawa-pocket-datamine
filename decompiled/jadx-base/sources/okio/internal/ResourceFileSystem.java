package okio.internal;

/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J \u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001e\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n0\t*\u00020\u0003H\u0002J\u001a\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020+H\u0002J\u001a\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020+H\u0002J\f\u0010-\u001a\u00020.*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lokio/internal/ResourceFileSystem;", "Lokio/FileSystem;", "classLoader", "Ljava/lang/ClassLoader;", "indexEagerly", "", "systemFileSystem", "(Ljava/lang/ClassLoader;ZLokio/FileSystem;)V", "roots", "", "Lkotlin/Pair;", "Lokio/Path;", "getRoots", "()Ljava/util/List;", "roots$delegate", "Lkotlin/Lazy;", "appendingSink", "Lokio/Sink;", com.ironsource.y8.h.b, "mustExist", "atomicMove", "", "source", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "canonicalize", "path", "canonicalizeInternal", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toClasspathRoots", "toFileRoot", "Ljava/net/URL;", "toJarRoot", "toRelativePath", "", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResourceFileSystem extends okio.FileSystem {
    private static final okio.internal.ResourceFileSystem.Companion Companion = new okio.internal.ResourceFileSystem.Companion(null);
    private static final okio.Path ROOT = okio.Path.Companion.get$default(okio.Path.INSTANCE, "/", false, 1, (java.lang.Object) null);
    private final java.lang.ClassLoader classLoader;

    /* JADX INFO: renamed from: roots$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy roots;
    private final okio.FileSystem systemFileSystem;

    public /* synthetic */ ResourceFileSystem(java.lang.ClassLoader classLoader, boolean z, okio.FileSystem fileSystem, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z, (i & 4) != 0 ? okio.FileSystem.SYSTEM : fileSystem);
    }

    public ResourceFileSystem(java.lang.ClassLoader classLoader, boolean z, okio.FileSystem systemFileSystem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.Pair<? extends okio.FileSystem, ? extends okio.Path>>>() { // from class: okio.internal.ResourceFileSystem$roots$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.Pair<? extends okio.FileSystem, ? extends okio.Path>> invoke() {
                okio.internal.ResourceFileSystem resourceFileSystem = this.this$0;
                return resourceFileSystem.toClasspathRoots(resourceFileSystem.classLoader);
            }
        });
        if (z) {
            getRoots().size();
        }
    }

    private final java.util.List<kotlin.Pair<okio.FileSystem, okio.Path>> getRoots() {
        return (java.util.List) this.roots.getValue();
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return canonicalizeInternal(path);
    }

    private final okio.Path canonicalizeInternal(okio.Path path) {
        return ROOT.resolve(path, true);
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path dir) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        java.lang.String relativePath = toRelativePath(dir);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        boolean z = false;
        for (kotlin.Pair<okio.FileSystem, okio.Path> pair : getRoots()) {
            okio.FileSystem fileSystemComponent1 = pair.component1();
            okio.Path pathComponent2 = pair.component2();
            try {
                java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
                java.util.List<okio.Path> list = fileSystemComponent1.list(pathComponent2.resolve(relativePath));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (Companion.keepPath((okio.Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Companion.removeBase((okio.Path) it.next(), pathComponent2));
                }
                kotlin.collections.CollectionsKt.addAll(linkedHashSet2, arrayList3);
                z = true;
            } catch (java.io.IOException unused) {
            }
        }
        if (!z) {
            throw new java.io.FileNotFoundException("file not found: " + dir);
        }
        return kotlin.collections.CollectionsKt.toList(linkedHashSet);
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        java.lang.String relativePath = toRelativePath(dir);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<kotlin.Pair<okio.FileSystem, okio.Path>> it = getRoots().iterator();
        boolean z = false;
        while (true) {
            java.util.ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.Pair<okio.FileSystem, okio.Path> next = it.next();
            okio.FileSystem fileSystemComponent1 = next.component1();
            okio.Path pathComponent2 = next.component2();
            java.util.List<okio.Path> listListOrNull = fileSystemComponent1.listOrNull(pathComponent2.resolve(relativePath));
            if (listListOrNull != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : listListOrNull) {
                    if (Companion.keepPath((okio.Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                java.util.ArrayList arrayList3 = arrayList2;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                java.util.Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Companion.removeBase((okio.Path) it2.next(), pathComponent2));
                }
                arrayList = arrayList4;
            }
            if (arrayList != null) {
                kotlin.collections.CollectionsKt.addAll(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (z) {
            return kotlin.collections.CollectionsKt.toList(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path file) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        if (!Companion.keepPath(file)) {
            throw new java.io.FileNotFoundException("file not found: " + file);
        }
        java.lang.String relativePath = toRelativePath(file);
        for (kotlin.Pair<okio.FileSystem, okio.Path> pair : getRoots()) {
            try {
                return pair.component1().openReadOnly(pair.component2().resolve(relativePath));
            } catch (java.io.FileNotFoundException unused) {
            }
        }
        throw new java.io.FileNotFoundException("file not found: " + file);
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path file, boolean mustCreate, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        throw new java.io.IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        java.lang.String relativePath = toRelativePath(path);
        for (kotlin.Pair<okio.FileSystem, okio.Path> pair : getRoots()) {
            okio.FileMetadata fileMetadataMetadataOrNull = pair.component1().metadataOrNull(pair.component2().resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path file) throws java.io.FileNotFoundException {
        okio.Source source;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        if (!Companion.keepPath(file)) {
            throw new java.io.FileNotFoundException("file not found: " + file);
        }
        okio.Path path = ROOT;
        java.io.InputStream resourceAsStream = this.classLoader.getResourceAsStream(okio.Path.resolve$default(path, file, false, 2, (java.lang.Object) null).relativeTo(path).toString());
        if (resourceAsStream == null || (source = okio.Okio.source(resourceAsStream)) == null) {
            throw new java.io.FileNotFoundException("file not found: " + file);
        }
        return source;
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path file, boolean mustCreate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        throw new java.io.IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path file, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        throw new java.io.IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path dir, boolean mustCreate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        throw new java.io.IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        throw new java.io.IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void delete(okio.Path path, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        throw new java.io.IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        throw new java.io.IOException(this + " is read-only");
    }

    private final java.lang.String toRelativePath(okio.Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<kotlin.Pair<okio.FileSystem, okio.Path>> toClasspathRoots(java.lang.ClassLoader classLoader) throws java.io.IOException {
        java.util.Enumeration<java.net.URL> resources = classLoader.getResources("");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        java.util.ArrayList<java.net.URL> list = java.util.Collections.list(resources);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.net.URL url : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(url);
            kotlin.Pair<okio.FileSystem, okio.Path> fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.Enumeration<java.net.URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        java.util.ArrayList<java.net.URL> list2 = java.util.Collections.list(resources2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list2, "list(this)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.net.URL url2 : list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(url2);
            kotlin.Pair<okio.FileSystem, okio.Path> jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList3.add(jarRoot);
            }
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList2, (java.lang.Iterable) arrayList3);
    }

    private final kotlin.Pair<okio.FileSystem, okio.Path> toFileRoot(java.net.URL url) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(url.getProtocol(), com.ironsource.y8.h.b)) {
            return kotlin.TuplesKt.to(this.systemFileSystem, okio.Path.Companion.get$default(okio.Path.INSTANCE, new java.io.File(url.toURI()), false, 1, (java.lang.Object) null));
        }
        return null;
    }

    private final kotlin.Pair<okio.FileSystem, okio.Path> toJarRoot(java.net.URL url) {
        int iLastIndexOf$default;
        java.lang.String string = url.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!kotlin.text.StringsKt.startsWith$default(string, "jar:file:", false, 2, (java.lang.Object) null) || (iLastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) string, "!", 0, false, 6, (java.lang.Object) null)) == -1) {
            return null;
        }
        okio.Path.Companion companion = okio.Path.INSTANCE;
        java.lang.String strSubstring = string.substring(4, iLastIndexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return kotlin.TuplesKt.to(okio.internal.ZipFilesKt.openZip(okio.Path.Companion.get$default(companion, new java.io.File(java.net.URI.create(strSubstring)), false, 1, (java.lang.Object) null), this.systemFileSystem, new kotlin.jvm.functions.Function1<okio.internal.ZipEntry, java.lang.Boolean>() { // from class: okio.internal.ResourceFileSystem$toJarRoot$zip$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(okio.internal.ZipEntry entry) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "entry");
                return java.lang.Boolean.valueOf(okio.internal.ResourceFileSystem.Companion.keepPath(entry.getCanonicalPath()));
            }
        }), ROOT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: ResourceFileSystem.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lokio/internal/ResourceFileSystem$Companion;", "", "()V", "ROOT", "Lokio/Path;", "getROOT", "()Lokio/Path;", "keepPath", "", "path", "removeBase", androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE, "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okio.Path getROOT() {
            return okio.internal.ResourceFileSystem.ROOT;
        }

        public final okio.Path removeBase(okio.Path path, okio.Path base) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
            return getROOT().resolve(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.removePrefix(path.toString(), (java.lang.CharSequence) base.toString()), '\\', '/', false, 4, (java.lang.Object) null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(okio.Path path) {
            return !kotlin.text.StringsKt.endsWith(path.name(), ".class", true);
        }
    }
}

package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public final class ClassPath {
    private static final java.lang.String CLASS_FILE_NAME_EXTENSION = ".class";
    private final com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> resources;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.reflect.ClassPath.class.getName());
    private static final com.google.common.base.Splitter CLASS_PATH_ATTRIBUTE_SEPARATOR = com.google.common.base.Splitter.on(" ").omitEmptyStrings();

    private ClassPath(com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> resources) {
        this.resources = resources;
    }

    public static com.google.common.reflect.ClassPath from(java.lang.ClassLoader classloader) throws java.io.IOException {
        com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.LocationInfo> immutableSetLocationsFrom = locationsFrom(classloader);
        java.util.HashSet hashSet = new java.util.HashSet();
        com.google.common.collect.UnmodifiableIterator<com.google.common.reflect.ClassPath.LocationInfo> it = immutableSetLocationsFrom.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().file());
        }
        com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        com.google.common.collect.UnmodifiableIterator<com.google.common.reflect.ClassPath.LocationInfo> it2 = immutableSetLocationsFrom.iterator();
        while (it2.hasNext()) {
            builder.addAll((java.lang.Iterable) it2.next().scanResources(hashSet));
        }
        return new com.google.common.reflect.ClassPath(builder.build());
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> getResources() {
        return this.resources;
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getAllClasses() {
        return com.google.common.collect.FluentIterable.from(this.resources).filter(com.google.common.reflect.ClassPath.ClassInfo.class).toSet();
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClasses() {
        return com.google.common.collect.FluentIterable.from(this.resources).filter(com.google.common.reflect.ClassPath.ClassInfo.class).filter(new com.google.common.base.Predicate() { // from class: com.google.common.reflect.ClassPath$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.lang.Object obj) {
                return ((com.google.common.reflect.ClassPath.ClassInfo) obj).isTopLevel();
            }
        }).toSet();
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClasses(java.lang.String packageName) {
        com.google.common.base.Preconditions.checkNotNull(packageName);
        com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        com.google.common.collect.UnmodifiableIterator<com.google.common.reflect.ClassPath.ClassInfo> it = getTopLevelClasses().iterator();
        while (it.hasNext()) {
            com.google.common.reflect.ClassPath.ClassInfo next = it.next();
            if (next.getPackageName().equals(packageName)) {
                builder.add(next);
            }
        }
        return builder.build();
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClassesRecursive(java.lang.String packageName) {
        com.google.common.base.Preconditions.checkNotNull(packageName);
        java.lang.String str = packageName + '.';
        com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        com.google.common.collect.UnmodifiableIterator<com.google.common.reflect.ClassPath.ClassInfo> it = getTopLevelClasses().iterator();
        while (it.hasNext()) {
            com.google.common.reflect.ClassPath.ClassInfo next = it.next();
            if (next.getName().startsWith(str)) {
                builder.add(next);
            }
        }
        return builder.build();
    }

    public static class ResourceInfo {
        private final java.io.File file;
        final java.lang.ClassLoader loader;
        private final java.lang.String resourceName;

        static com.google.common.reflect.ClassPath.ResourceInfo of(java.io.File file, java.lang.String resourceName, java.lang.ClassLoader loader) {
            if (resourceName.endsWith(com.google.common.reflect.ClassPath.CLASS_FILE_NAME_EXTENSION)) {
                return new com.google.common.reflect.ClassPath.ClassInfo(file, resourceName, loader);
            }
            return new com.google.common.reflect.ClassPath.ResourceInfo(file, resourceName, loader);
        }

        ResourceInfo(java.io.File file, java.lang.String resourceName, java.lang.ClassLoader loader) {
            this.file = (java.io.File) com.google.common.base.Preconditions.checkNotNull(file);
            this.resourceName = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(resourceName);
            this.loader = (java.lang.ClassLoader) com.google.common.base.Preconditions.checkNotNull(loader);
        }

        public final java.net.URL url() {
            java.net.URL resource = this.loader.getResource(this.resourceName);
            if (resource != null) {
                return resource;
            }
            throw new java.util.NoSuchElementException(this.resourceName);
        }

        public final com.google.common.io.ByteSource asByteSource() {
            return com.google.common.io.Resources.asByteSource(url());
        }

        public final com.google.common.io.CharSource asCharSource(java.nio.charset.Charset charset) {
            return com.google.common.io.Resources.asCharSource(url(), charset);
        }

        public final java.lang.String getResourceName() {
            return this.resourceName;
        }

        final java.io.File getFile() {
            return this.file;
        }

        public int hashCode() {
            return this.resourceName.hashCode();
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof com.google.common.reflect.ClassPath.ResourceInfo)) {
                return false;
            }
            com.google.common.reflect.ClassPath.ResourceInfo resourceInfo = (com.google.common.reflect.ClassPath.ResourceInfo) obj;
            return this.resourceName.equals(resourceInfo.resourceName) && this.loader == resourceInfo.loader;
        }

        public java.lang.String toString() {
            return this.resourceName;
        }
    }

    public static final class ClassInfo extends com.google.common.reflect.ClassPath.ResourceInfo {
        private final java.lang.String className;

        ClassInfo(java.io.File file, java.lang.String resourceName, java.lang.ClassLoader loader) {
            super(file, resourceName, loader);
            this.className = com.google.common.reflect.ClassPath.getClassName(resourceName);
        }

        public java.lang.String getPackageName() {
            return com.google.common.reflect.Reflection.getPackageName(this.className);
        }

        public java.lang.String getSimpleName() {
            int iLastIndexOf = this.className.lastIndexOf(36);
            if (iLastIndexOf != -1) {
                return com.google.common.base.CharMatcher.inRange('0', '9').trimLeadingFrom(this.className.substring(iLastIndexOf + 1));
            }
            java.lang.String packageName = getPackageName();
            if (packageName.isEmpty()) {
                return this.className;
            }
            return this.className.substring(packageName.length() + 1);
        }

        public java.lang.String getName() {
            return this.className;
        }

        public boolean isTopLevel() {
            return this.className.indexOf(36) == -1;
        }

        public java.lang.Class<?> load() {
            try {
                return this.loader.loadClass(this.className);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.reflect.ClassPath.ResourceInfo
        public java.lang.String toString() {
            return this.className;
        }
    }

    static com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.LocationInfo> locationsFrom(java.lang.ClassLoader classloader) {
        com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<java.io.File, java.lang.ClassLoader>> it = getClassPathEntries(classloader).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.io.File, java.lang.ClassLoader> next = it.next();
            builder.add(new com.google.common.reflect.ClassPath.LocationInfo(next.getKey(), next.getValue()));
        }
        return builder.build();
    }

    static final class LocationInfo {
        private final java.lang.ClassLoader classloader;
        final java.io.File home;

        LocationInfo(java.io.File home, java.lang.ClassLoader classloader) {
            this.home = (java.io.File) com.google.common.base.Preconditions.checkNotNull(home);
            this.classloader = (java.lang.ClassLoader) com.google.common.base.Preconditions.checkNotNull(classloader);
        }

        public final java.io.File file() {
            return this.home;
        }

        public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> scanResources() throws java.io.IOException {
            return scanResources(new java.util.HashSet());
        }

        public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> scanResources(java.util.Set<java.io.File> scannedFiles) throws java.io.IOException {
            com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder = com.google.common.collect.ImmutableSet.builder();
            scannedFiles.add(this.home);
            scan(this.home, scannedFiles, builder);
            return builder.build();
        }

        private void scan(java.io.File file, java.util.Set<java.io.File> scannedUris, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder) throws java.io.IOException {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        scanDirectory(file, builder);
                    } else {
                        scanJar(file, scannedUris, builder);
                    }
                }
            } catch (java.lang.SecurityException e) {
                com.google.common.reflect.ClassPath.logger.warning("Cannot access " + file + ": " + e);
            }
        }

        private void scanJar(java.io.File file, java.util.Set<java.io.File> scannedUris, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder) throws java.io.IOException {
            try {
                java.util.jar.JarFile jarFile = new java.util.jar.JarFile(file);
                try {
                    com.google.common.collect.UnmodifiableIterator<java.io.File> it = com.google.common.reflect.ClassPath.getClassPathFromManifest(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        java.io.File next = it.next();
                        if (scannedUris.add(next.getCanonicalFile())) {
                            scan(next, scannedUris, builder);
                        }
                    }
                    scanJarFile(jarFile, builder);
                } finally {
                    try {
                        jarFile.close();
                    } catch (java.io.IOException unused) {
                    }
                }
            } catch (java.io.IOException unused2) {
            }
        }

        private void scanJarFile(java.util.jar.JarFile file, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder) {
            java.util.Enumeration<java.util.jar.JarEntry> enumerationEntries = file.entries();
            while (enumerationEntries.hasMoreElements()) {
                java.util.jar.JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                if (!jarEntryNextElement.isDirectory() && !jarEntryNextElement.getName().equals("META-INF/MANIFEST.MF")) {
                    builder.add(com.google.common.reflect.ClassPath.ResourceInfo.of(new java.io.File(file.getName()), jarEntryNextElement.getName(), this.classloader));
                }
            }
        }

        private void scanDirectory(java.io.File directory, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder) throws java.io.IOException {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(directory.getCanonicalFile());
            scanDirectory(directory, "", hashSet, builder);
        }

        private void scanDirectory(java.io.File directory, java.lang.String packagePrefix, java.util.Set<java.io.File> currentPath, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder) throws java.io.IOException {
            java.io.File[] fileArrListFiles = directory.listFiles();
            if (fileArrListFiles == null) {
                com.google.common.reflect.ClassPath.logger.warning("Cannot read directory " + directory);
                return;
            }
            for (java.io.File file : fileArrListFiles) {
                java.lang.String name = file.getName();
                if (file.isDirectory()) {
                    java.io.File canonicalFile = file.getCanonicalFile();
                    if (currentPath.add(canonicalFile)) {
                        scanDirectory(canonicalFile, packagePrefix + name + "/", currentPath, builder);
                        currentPath.remove(canonicalFile);
                    }
                } else {
                    java.lang.String str = packagePrefix + name;
                    if (!str.equals("META-INF/MANIFEST.MF")) {
                        builder.add(com.google.common.reflect.ClassPath.ResourceInfo.of(file, str, this.classloader));
                    }
                }
            }
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof com.google.common.reflect.ClassPath.LocationInfo)) {
                return false;
            }
            com.google.common.reflect.ClassPath.LocationInfo locationInfo = (com.google.common.reflect.ClassPath.LocationInfo) obj;
            return this.home.equals(locationInfo.home) && this.classloader.equals(locationInfo.classloader);
        }

        public int hashCode() {
            return this.home.hashCode();
        }

        public java.lang.String toString() {
            return this.home.toString();
        }
    }

    static com.google.common.collect.ImmutableSet<java.io.File> getClassPathFromManifest(java.io.File jarFile, @javax.annotation.CheckForNull java.util.jar.Manifest manifest) {
        if (manifest == null) {
            return com.google.common.collect.ImmutableSet.of();
        }
        com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        java.lang.String value = manifest.getMainAttributes().getValue(java.util.jar.Attributes.Name.CLASS_PATH.toString());
        if (value != null) {
            for (java.lang.String str : CLASS_PATH_ATTRIBUTE_SEPARATOR.split(value)) {
                try {
                    java.net.URL classPathEntry = getClassPathEntry(jarFile, str);
                    if (classPathEntry.getProtocol().equals(com.ironsource.y8.h.b)) {
                        builder.add(toFile(classPathEntry));
                    }
                } catch (java.net.MalformedURLException unused) {
                    logger.warning("Invalid Class-Path entry: " + str);
                }
            }
        }
        return builder.build();
    }

    static com.google.common.collect.ImmutableMap<java.io.File, java.lang.ClassLoader> getClassPathEntries(java.lang.ClassLoader classloader) {
        java.util.LinkedHashMap linkedHashMapNewLinkedHashMap = com.google.common.collect.Maps.newLinkedHashMap();
        java.lang.ClassLoader parent = classloader.getParent();
        if (parent != null) {
            linkedHashMapNewLinkedHashMap.putAll(getClassPathEntries(parent));
        }
        com.google.common.collect.UnmodifiableIterator<java.net.URL> it = getClassLoaderUrls(classloader).iterator();
        while (it.hasNext()) {
            java.net.URL next = it.next();
            if (next.getProtocol().equals(com.ironsource.y8.h.b)) {
                java.io.File file = toFile(next);
                if (!linkedHashMapNewLinkedHashMap.containsKey(file)) {
                    linkedHashMapNewLinkedHashMap.put(file, classloader);
                }
            }
        }
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) linkedHashMapNewLinkedHashMap);
    }

    private static com.google.common.collect.ImmutableList<java.net.URL> getClassLoaderUrls(java.lang.ClassLoader classloader) {
        if (classloader instanceof java.net.URLClassLoader) {
            return com.google.common.collect.ImmutableList.copyOf(((java.net.URLClassLoader) classloader).getURLs());
        }
        if (classloader.equals(java.lang.ClassLoader.getSystemClassLoader())) {
            return parseJavaClassPath();
        }
        return com.google.common.collect.ImmutableList.of();
    }

    static com.google.common.collect.ImmutableList<java.net.URL> parseJavaClassPath() {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (java.lang.String str : com.google.common.base.Splitter.on(com.google.common.base.StandardSystemProperty.PATH_SEPARATOR.value()).split(com.google.common.base.StandardSystemProperty.JAVA_CLASS_PATH.value())) {
            try {
                try {
                    builder.add(new java.io.File(str).toURI().toURL());
                } catch (java.lang.SecurityException unused) {
                    builder.add(new java.net.URL(com.ironsource.y8.h.b, (java.lang.String) null, new java.io.File(str).getAbsolutePath()));
                }
            } catch (java.net.MalformedURLException e) {
                logger.log(java.util.logging.Level.WARNING, "malformed classpath entry: " + str, (java.lang.Throwable) e);
            }
        }
        return builder.build();
    }

    static java.net.URL getClassPathEntry(java.io.File jarFile, java.lang.String path) throws java.net.MalformedURLException {
        return new java.net.URL(jarFile.toURI().toURL(), path);
    }

    static java.lang.String getClassName(java.lang.String filename) {
        return filename.substring(0, filename.length() - 6).replace('/', '.');
    }

    static java.io.File toFile(java.net.URL url) {
        com.google.common.base.Preconditions.checkArgument(url.getProtocol().equals(com.ironsource.y8.h.b));
        try {
            return new java.io.File(url.toURI());
        } catch (java.net.URISyntaxException unused) {
            return new java.io.File(url.getPath());
        }
    }
}

package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class Files {
    private static final com.google.common.graph.SuccessorsFunction<java.io.File> FILE_TREE = new com.google.common.graph.SuccessorsFunction<java.io.File>() { // from class: com.google.common.io.Files.2
        @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public java.lang.Iterable<java.io.File> successors(java.io.File file) {
            java.io.File[] fileArrListFiles;
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                return java.util.Collections.unmodifiableList(java.util.Arrays.asList(fileArrListFiles));
            }
            return com.google.common.collect.ImmutableList.of();
        }
    };

    private enum FilePredicate implements com.google.common.base.Predicate<java.io.File> {
        IS_DIRECTORY { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "Files.isDirectory()";
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(java.io.File file) {
                return file.isDirectory();
            }
        },
        IS_FILE { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "Files.isFile()";
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(java.io.File file) {
                return file.isFile();
            }
        }
    }

    private Files() {
    }

    public static java.io.BufferedReader newReader(java.io.File file, java.nio.charset.Charset charset) throws java.io.FileNotFoundException {
        com.google.common.base.Preconditions.checkNotNull(file);
        com.google.common.base.Preconditions.checkNotNull(charset);
        return new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), charset));
    }

    public static java.io.BufferedWriter newWriter(java.io.File file, java.nio.charset.Charset charset) throws java.io.FileNotFoundException {
        com.google.common.base.Preconditions.checkNotNull(file);
        com.google.common.base.Preconditions.checkNotNull(charset);
        return new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset));
    }

    public static com.google.common.io.ByteSource asByteSource(java.io.File file) {
        return new com.google.common.io.Files.FileByteSource(file);
    }

    private static final class FileByteSource extends com.google.common.io.ByteSource {
        private final java.io.File file;

        private FileByteSource(java.io.File file) {
            this.file = (java.io.File) com.google.common.base.Preconditions.checkNotNull(file);
        }

        @Override // com.google.common.io.ByteSource
        public java.io.FileInputStream openStream() throws java.io.IOException {
            return new java.io.FileInputStream(this.file);
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
            if (this.file.isFile()) {
                return com.google.common.base.Optional.of(java.lang.Long.valueOf(this.file.length()));
            }
            return com.google.common.base.Optional.absent();
        }

        @Override // com.google.common.io.ByteSource
        public long size() throws java.io.IOException {
            if (!this.file.isFile()) {
                throw new java.io.FileNotFoundException(this.file.toString());
            }
            return this.file.length();
        }

        @Override // com.google.common.io.ByteSource
        public byte[] read() throws java.lang.Throwable {
            com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
            try {
                java.io.FileInputStream fileInputStream = (java.io.FileInputStream) closerCreate.register(openStream());
                byte[] byteArray = com.google.common.io.ByteStreams.toByteArray(fileInputStream, fileInputStream.getChannel().size());
                closerCreate.close();
                return byteArray;
            } catch (java.lang.Throwable th) {
                try {
                    throw closerCreate.rethrow(th);
                } catch (java.lang.Throwable th2) {
                    closerCreate.close();
                    throw th2;
                }
            }
        }

        public java.lang.String toString() {
            return "Files.asByteSource(" + this.file + ")";
        }
    }

    public static com.google.common.io.ByteSink asByteSink(java.io.File file, com.google.common.io.FileWriteMode... modes) {
        return new com.google.common.io.Files.FileByteSink(file, modes);
    }

    private static final class FileByteSink extends com.google.common.io.ByteSink {
        private final java.io.File file;
        private final com.google.common.collect.ImmutableSet<com.google.common.io.FileWriteMode> modes;

        private FileByteSink(java.io.File file, com.google.common.io.FileWriteMode... modes) {
            this.file = (java.io.File) com.google.common.base.Preconditions.checkNotNull(file);
            this.modes = com.google.common.collect.ImmutableSet.copyOf(modes);
        }

        @Override // com.google.common.io.ByteSink
        public java.io.FileOutputStream openStream() throws java.io.IOException {
            return new java.io.FileOutputStream(this.file, this.modes.contains(com.google.common.io.FileWriteMode.APPEND));
        }

        public java.lang.String toString() {
            return "Files.asByteSink(" + this.file + ", " + this.modes + ")";
        }
    }

    public static com.google.common.io.CharSource asCharSource(java.io.File file, java.nio.charset.Charset charset) {
        return asByteSource(file).asCharSource(charset);
    }

    public static com.google.common.io.CharSink asCharSink(java.io.File file, java.nio.charset.Charset charset, com.google.common.io.FileWriteMode... modes) {
        return asByteSink(file, modes).asCharSink(charset);
    }

    public static byte[] toByteArray(java.io.File file) throws java.io.IOException {
        return asByteSource(file).read();
    }

    @java.lang.Deprecated
    public static java.lang.String toString(java.io.File file, java.nio.charset.Charset charset) throws java.io.IOException {
        return asCharSource(file, charset).read();
    }

    public static void write(byte[] from, java.io.File to) throws java.lang.Throwable {
        asByteSink(to, new com.google.common.io.FileWriteMode[0]).write(from);
    }

    @java.lang.Deprecated
    public static void write(java.lang.CharSequence from, java.io.File to, java.nio.charset.Charset charset) throws java.lang.Throwable {
        asCharSink(to, charset, new com.google.common.io.FileWriteMode[0]).write(from);
    }

    public static void copy(java.io.File from, java.io.OutputStream to) throws java.lang.Throwable {
        asByteSource(from).copyTo(to);
    }

    public static void copy(java.io.File from, java.io.File to) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkArgument(!from.equals(to), "Source %s and destination %s must be different", from, to);
        asByteSource(from).copyTo(asByteSink(to, new com.google.common.io.FileWriteMode[0]));
    }

    @java.lang.Deprecated
    public static void copy(java.io.File from, java.nio.charset.Charset charset, java.lang.Appendable to) throws java.lang.Throwable {
        asCharSource(from, charset).copyTo(to);
    }

    @java.lang.Deprecated
    public static void append(java.lang.CharSequence from, java.io.File to, java.nio.charset.Charset charset) throws java.lang.Throwable {
        asCharSink(to, charset, com.google.common.io.FileWriteMode.APPEND).write(from);
    }

    public static boolean equal(java.io.File file1, java.io.File file2) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(file1);
        com.google.common.base.Preconditions.checkNotNull(file2);
        if (file1 == file2 || file1.equals(file2)) {
            return true;
        }
        long length = file1.length();
        long length2 = file2.length();
        if (length == 0 || length2 == 0 || length == length2) {
            return asByteSource(file1).contentEquals(asByteSource(file2));
        }
        return false;
    }

    @java.lang.Deprecated
    public static java.io.File createTempDir() {
        return com.google.common.io.TempFileCreator.INSTANCE.createTempDir();
    }

    public static void touch(java.io.File file) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(file);
        if (!file.createNewFile() && !file.setLastModified(java.lang.System.currentTimeMillis())) {
            throw new java.io.IOException("Unable to update modification time of " + file);
        }
    }

    public static void createParentDirs(java.io.File file) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(file);
        java.io.File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new java.io.IOException("Unable to create parent directories of " + file);
        }
    }

    public static void move(java.io.File from, java.io.File to) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(from);
        com.google.common.base.Preconditions.checkNotNull(to);
        com.google.common.base.Preconditions.checkArgument(!from.equals(to), "Source %s and destination %s must be different", from, to);
        if (from.renameTo(to)) {
            return;
        }
        copy(from, to);
        if (from.delete()) {
            return;
        }
        if (!to.delete()) {
            throw new java.io.IOException("Unable to delete " + to);
        }
        throw new java.io.IOException("Unable to delete " + from);
    }

    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public static java.lang.String readFirstLine(java.io.File file, java.nio.charset.Charset charset) throws java.io.IOException {
        return asCharSource(file, charset).readFirstLine();
    }

    public static java.util.List<java.lang.String> readLines(java.io.File file, java.nio.charset.Charset charset) throws java.io.IOException {
        return (java.util.List) asCharSource(file, charset).readLines(new com.google.common.io.LineProcessor<java.util.List<java.lang.String>>() { // from class: com.google.common.io.Files.1
            final java.util.List<java.lang.String> result = com.google.common.collect.Lists.newArrayList();

            @Override // com.google.common.io.LineProcessor
            public boolean processLine(java.lang.String line) {
                this.result.add(line);
                return true;
            }

            @Override // com.google.common.io.LineProcessor
            public java.util.List<java.lang.String> getResult() {
                return this.result;
            }
        });
    }

    @java.lang.Deprecated
    @com.google.common.io.ParametricNullness
    public static <T> T readLines(java.io.File file, java.nio.charset.Charset charset, com.google.common.io.LineProcessor<T> lineProcessor) throws java.io.IOException {
        return (T) asCharSource(file, charset).readLines(lineProcessor);
    }

    @java.lang.Deprecated
    @com.google.common.io.ParametricNullness
    public static <T> T readBytes(java.io.File file, com.google.common.io.ByteProcessor<T> byteProcessor) throws java.io.IOException {
        return (T) asByteSource(file).read(byteProcessor);
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashCode hash(java.io.File file, com.google.common.hash.HashFunction hashFunction) throws java.io.IOException {
        return asByteSource(file).hash(hashFunction);
    }

    public static java.nio.MappedByteBuffer map(java.io.File file) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(file);
        return map(file, java.nio.channels.FileChannel.MapMode.READ_ONLY);
    }

    public static java.nio.MappedByteBuffer map(java.io.File file, java.nio.channels.FileChannel.MapMode mode) throws java.io.IOException {
        return mapInternal(file, mode, -1L);
    }

    public static java.nio.MappedByteBuffer map(java.io.File file, java.nio.channels.FileChannel.MapMode mode, long size) throws java.io.IOException {
        com.google.common.base.Preconditions.checkArgument(size >= 0, "size (%s) may not be negative", size);
        return mapInternal(file, mode, size);
    }

    private static java.nio.MappedByteBuffer mapInternal(java.io.File file, java.nio.channels.FileChannel.MapMode mode, long size) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(file);
        com.google.common.base.Preconditions.checkNotNull(mode);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            java.nio.channels.FileChannel fileChannel = (java.nio.channels.FileChannel) closerCreate.register(((java.io.RandomAccessFile) closerCreate.register(new java.io.RandomAccessFile(file, mode == java.nio.channels.FileChannel.MapMode.READ_ONLY ? com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ : "rw"))).getChannel());
            if (size == -1) {
                size = fileChannel.size();
            }
            java.nio.MappedByteBuffer map = fileChannel.map(mode, 0L, size);
            closerCreate.close();
            return map;
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    public static java.lang.String simplifyPath(java.lang.String pathname) {
        com.google.common.base.Preconditions.checkNotNull(pathname);
        if (pathname.length() == 0) {
            return ".";
        }
        java.lang.Iterable<java.lang.String> iterableSplit = com.google.common.base.Splitter.on('/').omitEmptyStrings().split(pathname);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : iterableSplit) {
            str.hashCode();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    if (arrayList.size() > 0 && !((java.lang.String) arrayList.get(arrayList.size() - 1)).equals("..")) {
                        arrayList.remove(arrayList.size() - 1);
                    } else {
                        arrayList.add("..");
                    }
                } else {
                    arrayList.add(str);
                }
            }
        }
        java.lang.String strJoin = com.google.common.base.Joiner.on('/').join(arrayList);
        if (pathname.charAt(0) == '/') {
            strJoin = "/" + strJoin;
        }
        while (strJoin.startsWith("/../")) {
            strJoin = strJoin.substring(3);
        }
        if (strJoin.equals("/..")) {
            return "/";
        }
        return "".equals(strJoin) ? "." : strJoin;
    }

    public static java.lang.String getFileExtension(java.lang.String fullName) {
        com.google.common.base.Preconditions.checkNotNull(fullName);
        java.lang.String name = new java.io.File(fullName).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
    }

    public static java.lang.String getNameWithoutExtension(java.lang.String file) {
        com.google.common.base.Preconditions.checkNotNull(file);
        java.lang.String name = new java.io.File(file).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    public static com.google.common.graph.Traverser<java.io.File> fileTraverser() {
        return com.google.common.graph.Traverser.forTree(FILE_TREE);
    }

    public static com.google.common.base.Predicate<java.io.File> isDirectory() {
        return com.google.common.io.Files.FilePredicate.IS_DIRECTORY;
    }

    public static com.google.common.base.Predicate<java.io.File> isFile() {
        return com.google.common.io.Files.FilePredicate.IS_FILE;
    }
}

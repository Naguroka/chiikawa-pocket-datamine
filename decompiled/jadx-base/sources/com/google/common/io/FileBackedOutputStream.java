package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class FileBackedOutputStream extends java.io.OutputStream {

    @javax.annotation.CheckForNull
    private java.io.File file;
    private final int fileThreshold;

    @javax.annotation.CheckForNull
    private com.google.common.io.FileBackedOutputStream.MemoryOutput memory;
    private java.io.OutputStream out;
    private final boolean resetOnFinalize;
    private final com.google.common.io.ByteSource source;

    private static class MemoryOutput extends java.io.ByteArrayOutputStream {
        private MemoryOutput() {
        }

        byte[] getBuffer() {
            return this.buf;
        }

        int getCount() {
            return this.count;
        }
    }

    @javax.annotation.CheckForNull
    synchronized java.io.File getFile() {
        return this.file;
    }

    public FileBackedOutputStream(int fileThreshold) {
        this(fileThreshold, false);
    }

    public FileBackedOutputStream(int fileThreshold, boolean resetOnFinalize) {
        com.google.common.base.Preconditions.checkArgument(fileThreshold >= 0, "fileThreshold must be non-negative, but was %s", fileThreshold);
        this.fileThreshold = fileThreshold;
        this.resetOnFinalize = resetOnFinalize;
        com.google.common.io.FileBackedOutputStream.MemoryOutput memoryOutput = new com.google.common.io.FileBackedOutputStream.MemoryOutput();
        this.memory = memoryOutput;
        this.out = memoryOutput;
        if (resetOnFinalize) {
            this.source = new com.google.common.io.ByteSource() { // from class: com.google.common.io.FileBackedOutputStream.1
                @Override // com.google.common.io.ByteSource
                public java.io.InputStream openStream() throws java.io.IOException {
                    return com.google.common.io.FileBackedOutputStream.this.openInputStream();
                }

                protected void finalize() {
                    try {
                        com.google.common.io.FileBackedOutputStream.this.reset();
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace(java.lang.System.err);
                    }
                }
            };
        } else {
            this.source = new com.google.common.io.ByteSource() { // from class: com.google.common.io.FileBackedOutputStream.2
                @Override // com.google.common.io.ByteSource
                public java.io.InputStream openStream() throws java.io.IOException {
                    return com.google.common.io.FileBackedOutputStream.this.openInputStream();
                }
            };
        }
    }

    public com.google.common.io.ByteSource asByteSource() {
        return this.source;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized java.io.InputStream openInputStream() throws java.io.IOException {
        if (this.file != null) {
            return new java.io.FileInputStream(this.file);
        }
        java.util.Objects.requireNonNull(this.memory);
        return new java.io.ByteArrayInputStream(this.memory.getBuffer(), 0, this.memory.getCount());
    }

    public synchronized void reset() throws java.io.IOException {
        try {
            close();
            com.google.common.io.FileBackedOutputStream.MemoryOutput memoryOutput = this.memory;
            if (memoryOutput == null) {
                this.memory = new com.google.common.io.FileBackedOutputStream.MemoryOutput();
            } else {
                memoryOutput.reset();
            }
            this.out = this.memory;
            java.io.File file = this.file;
            if (file != null) {
                this.file = null;
                if (!file.delete()) {
                    throw new java.io.IOException("Could not delete: " + file);
                }
            }
        } catch (java.lang.Throwable th) {
            if (this.memory == null) {
                this.memory = new com.google.common.io.FileBackedOutputStream.MemoryOutput();
            } else {
                this.memory.reset();
            }
            this.out = this.memory;
            java.io.File file2 = this.file;
            if (file2 != null) {
                this.file = null;
                if (!file2.delete()) {
                    throw new java.io.IOException("Could not delete: " + file2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int b) throws java.io.IOException {
        update(1);
        this.out.write(b);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] b) throws java.io.IOException {
        write(b, 0, b.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] b, int off, int len) throws java.io.IOException {
        update(len);
        this.out.write(b, off, len);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
        this.out.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws java.io.IOException {
        this.out.flush();
    }

    private void update(int len) throws java.io.IOException {
        com.google.common.io.FileBackedOutputStream.MemoryOutput memoryOutput = this.memory;
        if (memoryOutput == null || memoryOutput.getCount() + len <= this.fileThreshold) {
            return;
        }
        java.io.File fileCreateTempFile = com.google.common.io.TempFileCreator.INSTANCE.createTempFile("FileBackedOutputStream");
        if (this.resetOnFinalize) {
            fileCreateTempFile.deleteOnExit();
        }
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(this.memory.getBuffer(), 0, this.memory.getCount());
            fileOutputStream.flush();
            this.out = fileOutputStream;
            this.file = fileCreateTempFile;
            this.memory = null;
        } catch (java.io.IOException e) {
            fileCreateTempFile.delete();
            throw e;
        }
    }
}

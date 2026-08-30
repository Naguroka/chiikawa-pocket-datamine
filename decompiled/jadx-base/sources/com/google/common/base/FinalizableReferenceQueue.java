package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public class FinalizableReferenceQueue implements java.io.Closeable {
    private static final java.lang.String FINALIZER_CLASS_NAME = "com.google.common.base.internal.Finalizer";
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.base.FinalizableReferenceQueue.class.getName());
    private static final java.lang.reflect.Method startFinalizer = getStartFinalizer(loadFinalizer(new com.google.common.base.FinalizableReferenceQueue.SystemLoader(), new com.google.common.base.FinalizableReferenceQueue.DecoupledLoader(), new com.google.common.base.FinalizableReferenceQueue.DirectLoader()));
    final java.lang.ref.PhantomReference<java.lang.Object> frqRef;
    final java.lang.ref.ReferenceQueue<java.lang.Object> queue;
    final boolean threadStarted;

    interface FinalizerLoader {
        @javax.annotation.CheckForNull
        java.lang.Class<?> loadFinalizer();
    }

    public FinalizableReferenceQueue() {
        java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue = new java.lang.ref.ReferenceQueue<>();
        this.queue = referenceQueue;
        java.lang.ref.PhantomReference<java.lang.Object> phantomReference = new java.lang.ref.PhantomReference<>(this, referenceQueue);
        this.frqRef = phantomReference;
        boolean z = false;
        try {
            startFinalizer.invoke(null, com.google.common.base.FinalizableReference.class, referenceQueue, phantomReference);
            z = true;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError(e);
        } catch (java.lang.Throwable th) {
            logger.log(java.util.logging.Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
        }
        this.threadStarted = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.frqRef.enqueue();
        cleanUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void cleanUp() {
        if (this.threadStarted) {
            return;
        }
        while (true) {
            java.lang.ref.Reference<? extends java.lang.Object> referencePoll = this.queue.poll();
            if (referencePoll == 0) {
                return;
            }
            referencePoll.clear();
            try {
                ((com.google.common.base.FinalizableReference) referencePoll).finalizeReferent();
            } catch (java.lang.Throwable th) {
                logger.log(java.util.logging.Level.SEVERE, "Error cleaning up after reference.", th);
            }
        }
    }

    private static java.lang.Class<?> loadFinalizer(com.google.common.base.FinalizableReferenceQueue.FinalizerLoader... loaders) {
        for (com.google.common.base.FinalizableReferenceQueue.FinalizerLoader finalizerLoader : loaders) {
            java.lang.Class<?> clsLoadFinalizer = finalizerLoader.loadFinalizer();
            if (clsLoadFinalizer != null) {
                return clsLoadFinalizer;
            }
        }
        throw new java.lang.AssertionError();
    }

    static class SystemLoader implements com.google.common.base.FinalizableReferenceQueue.FinalizerLoader {
        static boolean disabled;

        SystemLoader() {
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        @javax.annotation.CheckForNull
        public java.lang.Class<?> loadFinalizer() {
            if (disabled) {
                return null;
            }
            try {
                java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass(com.google.common.base.FinalizableReferenceQueue.FINALIZER_CLASS_NAME);
                    } catch (java.lang.ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (java.lang.SecurityException unused2) {
                com.google.common.base.FinalizableReferenceQueue.logger.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    static class DecoupledLoader implements com.google.common.base.FinalizableReferenceQueue.FinalizerLoader {
        private static final java.lang.String LOADING_ERROR = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        DecoupledLoader() {
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        @javax.annotation.CheckForNull
        public java.lang.Class<?> loadFinalizer() {
            try {
                return newLoader(getBaseUrl()).loadClass(com.google.common.base.FinalizableReferenceQueue.FINALIZER_CLASS_NAME);
            } catch (java.lang.Exception e) {
                com.google.common.base.FinalizableReferenceQueue.logger.log(java.util.logging.Level.WARNING, LOADING_ERROR, (java.lang.Throwable) e);
                return null;
            }
        }

        java.net.URL getBaseUrl() throws java.io.IOException {
            java.lang.String str = com.google.common.base.FinalizableReferenceQueue.FINALIZER_CLASS_NAME.replace('.', '/') + ".class";
            java.net.URL resource = getClass().getClassLoader().getResource(str);
            if (resource == null) {
                throw new java.io.FileNotFoundException(str);
            }
            java.lang.String string = resource.toString();
            if (!string.endsWith(str)) {
                throw new java.io.IOException("Unsupported path style: " + string);
            }
            return new java.net.URL(resource, string.substring(0, string.length() - str.length()));
        }

        java.net.URLClassLoader newLoader(java.net.URL base) {
            return new java.net.URLClassLoader(new java.net.URL[]{base}, null);
        }
    }

    static class DirectLoader implements com.google.common.base.FinalizableReferenceQueue.FinalizerLoader {
        DirectLoader() {
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public java.lang.Class<?> loadFinalizer() {
            try {
                return java.lang.Class.forName(com.google.common.base.FinalizableReferenceQueue.FINALIZER_CLASS_NAME);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.AssertionError(e);
            }
        }
    }

    static java.lang.reflect.Method getStartFinalizer(java.lang.Class<?> finalizer) {
        try {
            return finalizer.getMethod("startFinalizer", java.lang.Class.class, java.lang.ref.ReferenceQueue.class, java.lang.ref.PhantomReference.class);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}

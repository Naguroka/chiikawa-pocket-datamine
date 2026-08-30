package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class Resources {
    private Resources() {
    }

    public static com.google.common.io.ByteSource asByteSource(java.net.URL url) {
        return new com.google.common.io.Resources.UrlByteSource(url);
    }

    private static final class UrlByteSource extends com.google.common.io.ByteSource {
        private final java.net.URL url;

        private UrlByteSource(java.net.URL url) {
            this.url = (java.net.URL) com.google.common.base.Preconditions.checkNotNull(url);
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() throws java.io.IOException {
            return this.url.openStream();
        }

        public java.lang.String toString() {
            return "Resources.asByteSource(" + this.url + ")";
        }
    }

    public static com.google.common.io.CharSource asCharSource(java.net.URL url, java.nio.charset.Charset charset) {
        return asByteSource(url).asCharSource(charset);
    }

    public static byte[] toByteArray(java.net.URL url) throws java.io.IOException {
        return asByteSource(url).read();
    }

    public static java.lang.String toString(java.net.URL url, java.nio.charset.Charset charset) throws java.io.IOException {
        return asCharSource(url, charset).read();
    }

    @com.google.common.io.ParametricNullness
    public static <T> T readLines(java.net.URL url, java.nio.charset.Charset charset, com.google.common.io.LineProcessor<T> lineProcessor) throws java.io.IOException {
        return (T) asCharSource(url, charset).readLines(lineProcessor);
    }

    public static java.util.List<java.lang.String> readLines(java.net.URL url, java.nio.charset.Charset charset) throws java.io.IOException {
        return (java.util.List) readLines(url, charset, new com.google.common.io.LineProcessor<java.util.List<java.lang.String>>() { // from class: com.google.common.io.Resources.1
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

    public static void copy(java.net.URL from, java.io.OutputStream to) throws java.lang.Throwable {
        asByteSource(from).copyTo(to);
    }

    public static java.net.URL getResource(java.lang.String resourceName) {
        java.net.URL resource = ((java.lang.ClassLoader) com.google.common.base.MoreObjects.firstNonNull(java.lang.Thread.currentThread().getContextClassLoader(), com.google.common.io.Resources.class.getClassLoader())).getResource(resourceName);
        com.google.common.base.Preconditions.checkArgument(resource != null, "resource %s not found.", resourceName);
        return resource;
    }

    public static java.net.URL getResource(java.lang.Class<?> contextClass, java.lang.String resourceName) {
        java.net.URL resource = contextClass.getResource(resourceName);
        com.google.common.base.Preconditions.checkArgument(resource != null, "resource %s relative to %s not found.", resourceName, contextClass.getName());
        return resource;
    }
}

package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
public class SignatureRemover {
    private static final java.lang.String DIGEST_SUFFIX = "-Digest";
    private static final java.lang.String MANIFEST_MF = "META-INF/MANIFEST.MF";
    private static final java.util.regex.Pattern SIGNATURE_FILES = java.util.regex.Pattern.compile("META-INF/[^/]*\\.SF|META-INF/[^/]*\\.DSA|META-INF/[^/]*\\.RSA|META-INF/SIG-[^/]*");
    private boolean active = true;

    public void setActive(boolean z) {
        this.active = z;
    }

    public boolean removeEntry(java.lang.String str) {
        return this.active && SIGNATURE_FILES.matcher(str).matches();
    }

    public boolean filterEntry(java.lang.String str, java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        if (!this.active || !MANIFEST_MF.equals(str)) {
            return false;
        }
        java.util.jar.Manifest manifest = new java.util.jar.Manifest(inputStream);
        filterManifestEntry(manifest.getEntries().values());
        manifest.write(outputStream);
        return true;
    }

    private void filterManifestEntry(java.util.Collection<java.util.jar.Attributes> collection) {
        java.util.Iterator<java.util.jar.Attributes> it = collection.iterator();
        while (it.hasNext()) {
            java.util.jar.Attributes next = it.next();
            filterManifestEntryAttributes(next);
            if (next.isEmpty()) {
                it.remove();
            }
        }
    }

    private void filterManifestEntryAttributes(java.util.jar.Attributes attributes) {
        java.util.Iterator<java.lang.Object> it = attributes.keySet().iterator();
        while (it.hasNext()) {
            if (java.lang.String.valueOf(it.next()).endsWith(DIGEST_SUFFIX)) {
                it.remove();
            }
        }
    }
}

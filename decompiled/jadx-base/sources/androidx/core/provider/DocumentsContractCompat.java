package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
public final class DocumentsContractCompat {
    private static final java.lang.String PATH_TREE = "tree";

    public static final class DocumentCompat {
        public static final int FLAG_VIRTUAL_DOCUMENT = 512;

        private DocumentCompat() {
        }
    }

    public static boolean isDocumentUri(android.content.Context context, android.net.Uri uri) {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi19Impl.isDocumentUri(context, uri);
    }

    public static boolean isTreeUri(android.net.Uri uri) {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi24Impl.isTreeUri(uri);
    }

    public static java.lang.String getDocumentId(android.net.Uri uri) {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi19Impl.getDocumentId(uri);
    }

    public static java.lang.String getTreeDocumentId(android.net.Uri uri) {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.getTreeDocumentId(uri);
    }

    public static android.net.Uri buildDocumentUri(java.lang.String str, java.lang.String str2) {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi19Impl.buildDocumentUri(str, str2);
    }

    public static android.net.Uri buildDocumentUriUsingTree(android.net.Uri uri, java.lang.String str) {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildDocumentUriUsingTree(uri, str);
    }

    public static android.net.Uri buildTreeDocumentUri(java.lang.String str, java.lang.String str2) {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildTreeDocumentUri(str, str2);
    }

    public static android.net.Uri buildChildDocumentsUri(java.lang.String str, java.lang.String str2) {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildChildDocumentsUri(str, str2);
    }

    public static android.net.Uri buildChildDocumentsUriUsingTree(android.net.Uri uri, java.lang.String str) {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildChildDocumentsUriUsingTree(uri, str);
    }

    public static android.net.Uri createDocument(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str, java.lang.String str2) throws java.io.FileNotFoundException {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.createDocument(contentResolver, uri, str, str2);
    }

    public static android.net.Uri renameDocument(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.renameDocument(contentResolver, uri, str);
    }

    public static boolean removeDocument(android.content.ContentResolver contentResolver, android.net.Uri uri, android.net.Uri uri2) throws java.io.FileNotFoundException {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi24Impl.removeDocument(contentResolver, uri, uri2);
    }

    private static class DocumentsContractApi19Impl {
        public static android.net.Uri buildDocumentUri(java.lang.String str, java.lang.String str2) {
            return android.provider.DocumentsContract.buildDocumentUri(str, str2);
        }

        static boolean isDocumentUri(android.content.Context context, android.net.Uri uri) {
            return android.provider.DocumentsContract.isDocumentUri(context, uri);
        }

        static java.lang.String getDocumentId(android.net.Uri uri) {
            return android.provider.DocumentsContract.getDocumentId(uri);
        }

        static boolean deleteDocument(android.content.ContentResolver contentResolver, android.net.Uri uri) throws java.io.FileNotFoundException {
            return android.provider.DocumentsContract.deleteDocument(contentResolver, uri);
        }

        private DocumentsContractApi19Impl() {
        }
    }

    private static class DocumentsContractApi21Impl {
        static java.lang.String getTreeDocumentId(android.net.Uri uri) {
            return android.provider.DocumentsContract.getTreeDocumentId(uri);
        }

        public static android.net.Uri buildTreeDocumentUri(java.lang.String str, java.lang.String str2) {
            return android.provider.DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        static android.net.Uri buildDocumentUriUsingTree(android.net.Uri uri, java.lang.String str) {
            return android.provider.DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        static android.net.Uri buildChildDocumentsUri(java.lang.String str, java.lang.String str2) {
            return android.provider.DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        static android.net.Uri buildChildDocumentsUriUsingTree(android.net.Uri uri, java.lang.String str) {
            return android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        static android.net.Uri createDocument(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str, java.lang.String str2) throws java.io.FileNotFoundException {
            return android.provider.DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        static android.net.Uri renameDocument(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
            return android.provider.DocumentsContract.renameDocument(contentResolver, uri, str);
        }

        private DocumentsContractApi21Impl() {
        }
    }

    private static class DocumentsContractApi24Impl {
        static boolean isTreeUri(android.net.Uri uri) {
            return android.provider.DocumentsContract.isTreeUri(uri);
        }

        static boolean removeDocument(android.content.ContentResolver contentResolver, android.net.Uri uri, android.net.Uri uri2) throws java.io.FileNotFoundException {
            return android.provider.DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }

        private DocumentsContractApi24Impl() {
        }
    }

    private DocumentsContractCompat() {
    }
}

package androidx.browser.trusted.sharing;

/* JADX INFO: loaded from: classes.dex */
public final class ShareTarget {
    public static final java.lang.String ENCODING_TYPE_MULTIPART = "multipart/form-data";
    public static final java.lang.String ENCODING_TYPE_URL_ENCODED = "application/x-www-form-urlencoded";
    public static final java.lang.String KEY_ACTION = "androidx.browser.trusted.sharing.KEY_ACTION";
    public static final java.lang.String KEY_ENCTYPE = "androidx.browser.trusted.sharing.KEY_ENCTYPE";
    public static final java.lang.String KEY_METHOD = "androidx.browser.trusted.sharing.KEY_METHOD";
    public static final java.lang.String KEY_PARAMS = "androidx.browser.trusted.sharing.KEY_PARAMS";
    public static final java.lang.String METHOD_GET = "GET";
    public static final java.lang.String METHOD_POST = "POST";
    public final java.lang.String action;
    public final java.lang.String encodingType;
    public final java.lang.String method;
    public final androidx.browser.trusted.sharing.ShareTarget.Params params;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EncodingType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RequestMethod {
    }

    public ShareTarget(java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.browser.trusted.sharing.ShareTarget.Params params) {
        this.action = str;
        this.method = str2;
        this.encodingType = str3;
        this.params = params;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(KEY_ACTION, this.action);
        bundle.putString(KEY_METHOD, this.method);
        bundle.putString(KEY_ENCTYPE, this.encodingType);
        bundle.putBundle(KEY_PARAMS, this.params.toBundle());
        return bundle;
    }

    public static androidx.browser.trusted.sharing.ShareTarget fromBundle(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(KEY_ACTION);
        java.lang.String string2 = bundle.getString(KEY_METHOD);
        java.lang.String string3 = bundle.getString(KEY_ENCTYPE);
        androidx.browser.trusted.sharing.ShareTarget.Params paramsFromBundle = androidx.browser.trusted.sharing.ShareTarget.Params.fromBundle(bundle.getBundle(KEY_PARAMS));
        if (string == null || paramsFromBundle == null) {
            return null;
        }
        return new androidx.browser.trusted.sharing.ShareTarget(string, string2, string3, paramsFromBundle);
    }

    public static class Params {
        public static final java.lang.String KEY_FILES = "androidx.browser.trusted.sharing.KEY_FILES";
        public static final java.lang.String KEY_TEXT = "androidx.browser.trusted.sharing.KEY_TEXT";
        public static final java.lang.String KEY_TITLE = "androidx.browser.trusted.sharing.KEY_TITLE";
        public final java.util.List<androidx.browser.trusted.sharing.ShareTarget.FileFormField> files;
        public final java.lang.String text;
        public final java.lang.String title;

        public Params(java.lang.String str, java.lang.String str2, java.util.List<androidx.browser.trusted.sharing.ShareTarget.FileFormField> list) {
            this.title = str;
            this.text = str2;
            this.files = list;
        }

        android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.title);
            bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.text);
            if (this.files != null) {
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
                java.util.Iterator<androidx.browser.trusted.sharing.ShareTarget.FileFormField> it = this.files.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toBundle());
                }
                bundle.putParcelableArrayList(KEY_FILES, arrayList);
            }
            return bundle;
        }

        static androidx.browser.trusted.sharing.ShareTarget.Params fromBundle(android.os.Bundle bundle) {
            java.util.ArrayList arrayList = null;
            if (bundle == null) {
                return null;
            }
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(KEY_FILES);
            if (parcelableArrayList != null) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(androidx.browser.trusted.sharing.ShareTarget.FileFormField.fromBundle((android.os.Bundle) it.next()));
                }
            }
            return new androidx.browser.trusted.sharing.ShareTarget.Params(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }
    }

    public static final class FileFormField {
        public static final java.lang.String KEY_ACCEPTED_TYPES = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";
        public static final java.lang.String KEY_NAME = "androidx.browser.trusted.sharing.KEY_FILE_NAME";
        public final java.util.List<java.lang.String> acceptedTypes;
        public final java.lang.String name;

        public FileFormField(java.lang.String str, java.util.List<java.lang.String> list) {
            this.name = str;
            this.acceptedTypes = java.util.Collections.unmodifiableList(list);
        }

        android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(KEY_NAME, this.name);
            bundle.putStringArrayList(KEY_ACCEPTED_TYPES, new java.util.ArrayList<>(this.acceptedTypes));
            return bundle;
        }

        static androidx.browser.trusted.sharing.ShareTarget.FileFormField fromBundle(android.os.Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            java.lang.String string = bundle.getString(KEY_NAME);
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(KEY_ACCEPTED_TYPES);
            if (string == null || stringArrayList == null) {
                return null;
            }
            return new androidx.browser.trusted.sharing.ShareTarget.FileFormField(string, stringArrayList);
        }
    }
}

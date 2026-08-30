package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public class Label {
    private static final java.lang.String FIELD_LANGUAGE_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_VALUE_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    public final java.lang.String language;
    public final java.lang.String value;

    public Label(java.lang.String str, java.lang.String str2) {
        this.language = androidx.media3.common.util.Util.normalizeLanguageCode(str);
        this.value = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.Label label = (androidx.media3.common.Label) obj;
        return androidx.media3.common.util.Util.areEqual(this.language, label.language) && androidx.media3.common.util.Util.areEqual(this.value, label.value);
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        java.lang.String str = this.language;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = this.language;
        if (str != null) {
            bundle.putString(FIELD_LANGUAGE_INDEX, str);
        }
        bundle.putString(FIELD_VALUE_INDEX, this.value);
        return bundle;
    }

    public static androidx.media3.common.Label fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.Label(bundle.getString(FIELD_LANGUAGE_INDEX), (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(bundle.getString(FIELD_VALUE_INDEX)));
    }
}

package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
interface LocaleListInterface {
    java.util.Locale get(int i);

    java.util.Locale getFirstMatch(java.lang.String[] strArr);

    java.lang.Object getLocaleList();

    int indexOf(java.util.Locale locale);

    boolean isEmpty();

    int size();

    java.lang.String toLanguageTags();
}

package com.google.android.gms.drive.query;

/* JADX INFO: loaded from: classes4.dex */
public class Filters {
    public static <T> com.google.android.gms.drive.query.Filter eq(com.google.android.gms.drive.metadata.SearchableMetadataField<T> searchableMetadataField, T t) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(searchableMetadataField, "Field may not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t, "Value may not be null.");
        return new com.google.android.gms.drive.query.internal.zzb(com.google.android.gms.drive.query.internal.zzx.zzmq, searchableMetadataField, t);
    }

    public static <T extends java.lang.Comparable<T>> com.google.android.gms.drive.query.Filter lessThan(com.google.android.gms.drive.metadata.SearchableOrderedMetadataField<T> searchableOrderedMetadataField, T t) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(searchableOrderedMetadataField, "Field may not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t, "Value may not be null.");
        return new com.google.android.gms.drive.query.internal.zzb(com.google.android.gms.drive.query.internal.zzx.zzmr, searchableOrderedMetadataField, t);
    }

    public static <T extends java.lang.Comparable<T>> com.google.android.gms.drive.query.Filter greaterThan(com.google.android.gms.drive.metadata.SearchableOrderedMetadataField<T> searchableOrderedMetadataField, T t) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(searchableOrderedMetadataField, "Field may not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t, "Value may not be null.");
        return new com.google.android.gms.drive.query.internal.zzb(com.google.android.gms.drive.query.internal.zzx.zzmt, searchableOrderedMetadataField, t);
    }

    public static <T extends java.lang.Comparable<T>> com.google.android.gms.drive.query.Filter lessThanEquals(com.google.android.gms.drive.metadata.SearchableOrderedMetadataField<T> searchableOrderedMetadataField, T t) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(searchableOrderedMetadataField, "Field may not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t, "Value may not be null.");
        return new com.google.android.gms.drive.query.internal.zzb(com.google.android.gms.drive.query.internal.zzx.zzms, searchableOrderedMetadataField, t);
    }

    public static <T extends java.lang.Comparable<T>> com.google.android.gms.drive.query.Filter greaterThanEquals(com.google.android.gms.drive.metadata.SearchableOrderedMetadataField<T> searchableOrderedMetadataField, T t) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(searchableOrderedMetadataField, "Field may not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t, "Value may not be null.");
        return new com.google.android.gms.drive.query.internal.zzb(com.google.android.gms.drive.query.internal.zzx.zzmu, searchableOrderedMetadataField, t);
    }

    public static <T> com.google.android.gms.drive.query.Filter in(com.google.android.gms.drive.metadata.SearchableCollectionMetadataField<T> searchableCollectionMetadataField, T t) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(searchableCollectionMetadataField, "Field may not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t, "Value may not be null.");
        return new com.google.android.gms.drive.query.internal.zzp(searchableCollectionMetadataField, t);
    }

    public static com.google.android.gms.drive.query.Filter eq(com.google.android.gms.drive.metadata.CustomPropertyKey customPropertyKey, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(customPropertyKey, "Custom property key may not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Custom property value may not be null.");
        return new com.google.android.gms.drive.query.internal.zzn(com.google.android.gms.drive.query.SearchableField.zzlv, new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza().zza(customPropertyKey, str).zzbb());
    }

    public static com.google.android.gms.drive.query.Filter contains(com.google.android.gms.drive.metadata.SearchableMetadataField<java.lang.String> searchableMetadataField, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(searchableMetadataField, "Field may not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Value may not be null.");
        return new com.google.android.gms.drive.query.internal.zzb(com.google.android.gms.drive.query.internal.zzx.zzmy, searchableMetadataField, str);
    }

    public static com.google.android.gms.drive.query.Filter and(com.google.android.gms.drive.query.Filter filter, com.google.android.gms.drive.query.Filter... filterArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(filter, "Filter may not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(filterArr, "Additional filters may not be null.");
        return new com.google.android.gms.drive.query.internal.zzr(com.google.android.gms.drive.query.internal.zzx.zzmv, filter, filterArr);
    }

    public static com.google.android.gms.drive.query.Filter and(java.lang.Iterable<com.google.android.gms.drive.query.Filter> iterable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(iterable, "Filters may not be null");
        return new com.google.android.gms.drive.query.internal.zzr(com.google.android.gms.drive.query.internal.zzx.zzmv, iterable);
    }

    public static com.google.android.gms.drive.query.Filter or(com.google.android.gms.drive.query.Filter filter, com.google.android.gms.drive.query.Filter... filterArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(filter, "Filter may not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(filterArr, "Additional filters may not be null.");
        return new com.google.android.gms.drive.query.internal.zzr(com.google.android.gms.drive.query.internal.zzx.zzmw, filter, filterArr);
    }

    public static com.google.android.gms.drive.query.Filter or(java.lang.Iterable<com.google.android.gms.drive.query.Filter> iterable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(iterable, "Filters may not be null");
        return new com.google.android.gms.drive.query.internal.zzr(com.google.android.gms.drive.query.internal.zzx.zzmw, iterable);
    }

    public static com.google.android.gms.drive.query.Filter not(com.google.android.gms.drive.query.Filter filter) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(filter, "Filter may not be null");
        return new com.google.android.gms.drive.query.internal.zzv(filter);
    }

    public static com.google.android.gms.drive.query.Filter sharedWithMe() {
        return new com.google.android.gms.drive.query.internal.zzd(com.google.android.gms.drive.query.SearchableField.zzlu);
    }

    public static com.google.android.gms.drive.query.Filter openedByMe() {
        return new com.google.android.gms.drive.query.internal.zzd(com.google.android.gms.drive.query.SearchableField.LAST_VIEWED_BY_ME);
    }

    public static com.google.android.gms.drive.query.Filter ownedByMe() {
        return new com.google.android.gms.drive.query.internal.zzz();
    }
}

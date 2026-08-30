package androidx.media3.common.text;

/* JADX INFO: loaded from: classes.dex */
public final class CueGroup {
    public static final androidx.media3.common.text.CueGroup EMPTY_TIME_ZERO = new androidx.media3.common.text.CueGroup(com.google.common.collect.ImmutableList.of(), 0);
    private static final java.lang.String FIELD_CUES = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_PRESENTATION_TIME_US = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    public final com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> cues;
    public final long presentationTimeUs;

    public CueGroup(java.util.List<androidx.media3.common.text.Cue> list, long j) {
        this.cues = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.presentationTimeUs = j;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(filterOutBitmapCues(this.cues), new com.google.common.base.Function() { // from class: androidx.media3.common.text.CueGroup$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.common.text.Cue) obj).toBinderBasedBundle();
            }
        }));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }

    public static androidx.media3.common.text.CueGroup fromBundle(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList immutableListFromBundleList;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        if (parcelableArrayList == null) {
            immutableListFromBundleList = com.google.common.collect.ImmutableList.of();
        } else {
            immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.common.text.CueGroup$$ExternalSyntheticLambda1(), parcelableArrayList);
        }
        return new androidx.media3.common.text.CueGroup(immutableListFromBundleList, bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    private static com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> filterOutBitmapCues(java.util.List<androidx.media3.common.text.Cue> list) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bitmap == null) {
                builder.add(list.get(i));
            }
        }
        return builder.build();
    }
}

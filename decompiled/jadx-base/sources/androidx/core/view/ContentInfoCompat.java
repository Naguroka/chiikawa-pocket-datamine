package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;
    private final androidx.core.view.ContentInfoCompat.Compat mCompat;

    private interface BuilderCompat {
        androidx.core.view.ContentInfoCompat build();

        void setClip(android.content.ClipData clipData);

        void setExtras(android.os.Bundle bundle);

        void setFlags(int i);

        void setLinkUri(android.net.Uri uri);

        void setSource(int i);
    }

    private interface Compat {
        android.content.ClipData getClip();

        android.os.Bundle getExtras();

        int getFlags();

        android.net.Uri getLinkUri();

        int getSource();

        android.view.ContentInfo getWrapped();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Source {
    }

    static java.lang.String sourceToString(int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i != 4) {
            return i != 5 ? java.lang.String.valueOf(i) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    static java.lang.String flagsToString(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : java.lang.String.valueOf(i);
    }

    ContentInfoCompat(androidx.core.view.ContentInfoCompat.Compat compat) {
        this.mCompat = compat;
    }

    public static androidx.core.view.ContentInfoCompat toContentInfoCompat(android.view.ContentInfo contentInfo) {
        return new androidx.core.view.ContentInfoCompat(new androidx.core.view.ContentInfoCompat.Compat31Impl(contentInfo));
    }

    public android.view.ContentInfo toContentInfo() {
        return (android.view.ContentInfo) java.util.Objects.requireNonNull(this.mCompat.getWrapped());
    }

    public java.lang.String toString() {
        return this.mCompat.toString();
    }

    public android.content.ClipData getClip() {
        return this.mCompat.getClip();
    }

    public int getSource() {
        return this.mCompat.getSource();
    }

    public int getFlags() {
        return this.mCompat.getFlags();
    }

    public android.net.Uri getLinkUri() {
        return this.mCompat.getLinkUri();
    }

    public android.os.Bundle getExtras() {
        return this.mCompat.getExtras();
    }

    public android.util.Pair<androidx.core.view.ContentInfoCompat, androidx.core.view.ContentInfoCompat> partition(androidx.core.util.Predicate<android.content.ClipData.Item> predicate) {
        android.content.ClipData clip = this.mCompat.getClip();
        if (clip.getItemCount() == 1) {
            boolean zTest = predicate.test(clip.getItemAt(0));
            return android.util.Pair.create(zTest ? this : null, zTest ? null : this);
        }
        android.util.Pair<android.content.ClipData, android.content.ClipData> pairPartition = partition(clip, predicate);
        if (pairPartition.first == null) {
            return android.util.Pair.create(null, this);
        }
        if (pairPartition.second == null) {
            return android.util.Pair.create(this, null);
        }
        return android.util.Pair.create(new androidx.core.view.ContentInfoCompat.Builder(this).setClip((android.content.ClipData) pairPartition.first).build(), new androidx.core.view.ContentInfoCompat.Builder(this).setClip((android.content.ClipData) pairPartition.second).build());
    }

    static android.util.Pair<android.content.ClipData, android.content.ClipData> partition(android.content.ClipData clipData, androidx.core.util.Predicate<android.content.ClipData.Item> predicate) {
        java.util.ArrayList arrayList = null;
        java.util.ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            android.content.ClipData.Item itemAt = clipData.getItemAt(i);
            if (predicate.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return android.util.Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return android.util.Pair.create(clipData, null);
        }
        return android.util.Pair.create(buildClipData(clipData.getDescription(), arrayList), buildClipData(clipData.getDescription(), arrayList2));
    }

    static android.content.ClipData buildClipData(android.content.ClipDescription clipDescription, java.util.List<android.content.ClipData.Item> list) {
        android.content.ClipData clipData = new android.content.ClipData(new android.content.ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    public static android.util.Pair<android.view.ContentInfo, android.view.ContentInfo> partition(android.view.ContentInfo contentInfo, java.util.function.Predicate<android.content.ClipData.Item> predicate) {
        return androidx.core.view.ContentInfoCompat.Api31Impl.partition(contentInfo, predicate);
    }

    private static final class Api31Impl {
        private Api31Impl() {
        }

        public static android.util.Pair<android.view.ContentInfo, android.view.ContentInfo> partition(android.view.ContentInfo contentInfo, final java.util.function.Predicate<android.content.ClipData.Item> predicate) {
            android.content.ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean zTest = predicate.test(clip.getItemAt(0));
                android.view.ContentInfo contentInfo2 = zTest ? contentInfo : null;
                if (zTest) {
                    contentInfo = null;
                }
                return android.util.Pair.create(contentInfo2, contentInfo);
            }
            java.util.Objects.requireNonNull(predicate);
            android.util.Pair<android.content.ClipData, android.content.ClipData> pairPartition = androidx.core.view.ContentInfoCompat.partition(clip, (androidx.core.util.Predicate<android.content.ClipData.Item>) new androidx.core.util.Predicate() { // from class: androidx.core.view.ContentInfoCompat$Api31Impl$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return predicate.test((android.content.ClipData.Item) obj);
                }
            });
            if (pairPartition.first == null) {
                return android.util.Pair.create(null, contentInfo);
            }
            if (pairPartition.second == null) {
                return android.util.Pair.create(contentInfo, null);
            }
            return android.util.Pair.create(new android.view.ContentInfo.Builder(contentInfo).setClip((android.content.ClipData) pairPartition.first).build(), new android.view.ContentInfo.Builder(contentInfo).setClip((android.content.ClipData) pairPartition.second).build());
        }
    }

    private static final class CompatImpl implements androidx.core.view.ContentInfoCompat.Compat {
        private final android.content.ClipData mClip;
        private final android.os.Bundle mExtras;
        private final int mFlags;
        private final android.net.Uri mLinkUri;
        private final int mSource;

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.view.ContentInfo getWrapped() {
            return null;
        }

        CompatImpl(androidx.core.view.ContentInfoCompat.BuilderCompatImpl builderCompatImpl) {
            this.mClip = (android.content.ClipData) androidx.core.util.Preconditions.checkNotNull(builderCompatImpl.mClip);
            this.mSource = androidx.core.util.Preconditions.checkArgumentInRange(builderCompatImpl.mSource, 0, 5, "source");
            this.mFlags = androidx.core.util.Preconditions.checkFlagsArgument(builderCompatImpl.mFlags, 1);
            this.mLinkUri = builderCompatImpl.mLinkUri;
            this.mExtras = builderCompatImpl.mExtras;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.content.ClipData getClip() {
            return this.mClip;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return this.mSource;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            return this.mFlags;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.net.Uri getLinkUri() {
            return this.mLinkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.os.Bundle getExtras() {
            return this.mExtras;
        }

        public java.lang.String toString() {
            return "ContentInfoCompat{clip=" + this.mClip.getDescription() + ", source=" + androidx.core.view.ContentInfoCompat.sourceToString(this.mSource) + ", flags=" + androidx.core.view.ContentInfoCompat.flagsToString(this.mFlags) + (this.mLinkUri == null ? "" : ", hasLinkUri(" + this.mLinkUri.toString().length() + ")") + (this.mExtras != null ? ", hasExtras" : "") + "}";
        }
    }

    private static final class Compat31Impl implements androidx.core.view.ContentInfoCompat.Compat {
        private final android.view.ContentInfo mWrapped;

        Compat31Impl(android.view.ContentInfo contentInfo) {
            this.mWrapped = (android.view.ContentInfo) androidx.core.util.Preconditions.checkNotNull(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.view.ContentInfo getWrapped() {
            return this.mWrapped;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.content.ClipData getClip() {
            return this.mWrapped.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return this.mWrapped.getSource();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            return this.mWrapped.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.net.Uri getLinkUri() {
            return this.mWrapped.getLinkUri();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.os.Bundle getExtras() {
            return this.mWrapped.getExtras();
        }

        public java.lang.String toString() {
            return "ContentInfoCompat{" + this.mWrapped + "}";
        }
    }

    public static final class Builder {
        private final androidx.core.view.ContentInfoCompat.BuilderCompat mBuilderCompat;

        public Builder(androidx.core.view.ContentInfoCompat contentInfoCompat) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new androidx.core.view.ContentInfoCompat.BuilderCompat31Impl(contentInfoCompat);
            } else {
                this.mBuilderCompat = new androidx.core.view.ContentInfoCompat.BuilderCompatImpl(contentInfoCompat);
            }
        }

        public Builder(android.content.ClipData clipData, int i) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new androidx.core.view.ContentInfoCompat.BuilderCompat31Impl(clipData, i);
            } else {
                this.mBuilderCompat = new androidx.core.view.ContentInfoCompat.BuilderCompatImpl(clipData, i);
            }
        }

        public androidx.core.view.ContentInfoCompat.Builder setClip(android.content.ClipData clipData) {
            this.mBuilderCompat.setClip(clipData);
            return this;
        }

        public androidx.core.view.ContentInfoCompat.Builder setSource(int i) {
            this.mBuilderCompat.setSource(i);
            return this;
        }

        public androidx.core.view.ContentInfoCompat.Builder setFlags(int i) {
            this.mBuilderCompat.setFlags(i);
            return this;
        }

        public androidx.core.view.ContentInfoCompat.Builder setLinkUri(android.net.Uri uri) {
            this.mBuilderCompat.setLinkUri(uri);
            return this;
        }

        public androidx.core.view.ContentInfoCompat.Builder setExtras(android.os.Bundle bundle) {
            this.mBuilderCompat.setExtras(bundle);
            return this;
        }

        public androidx.core.view.ContentInfoCompat build() {
            return this.mBuilderCompat.build();
        }
    }

    private static final class BuilderCompatImpl implements androidx.core.view.ContentInfoCompat.BuilderCompat {
        android.content.ClipData mClip;
        android.os.Bundle mExtras;
        int mFlags;
        android.net.Uri mLinkUri;
        int mSource;

        BuilderCompatImpl(android.content.ClipData clipData, int i) {
            this.mClip = clipData;
            this.mSource = i;
        }

        BuilderCompatImpl(androidx.core.view.ContentInfoCompat contentInfoCompat) {
            this.mClip = contentInfoCompat.getClip();
            this.mSource = contentInfoCompat.getSource();
            this.mFlags = contentInfoCompat.getFlags();
            this.mLinkUri = contentInfoCompat.getLinkUri();
            this.mExtras = contentInfoCompat.getExtras();
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(android.content.ClipData clipData) {
            this.mClip = clipData;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int i) {
            this.mSource = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i) {
            this.mFlags = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(android.net.Uri uri) {
            this.mLinkUri = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(android.os.Bundle bundle) {
            this.mExtras = bundle;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public androidx.core.view.ContentInfoCompat build() {
            return new androidx.core.view.ContentInfoCompat(new androidx.core.view.ContentInfoCompat.CompatImpl(this));
        }
    }

    private static final class BuilderCompat31Impl implements androidx.core.view.ContentInfoCompat.BuilderCompat {
        private final android.view.ContentInfo.Builder mPlatformBuilder;

        BuilderCompat31Impl(android.content.ClipData clipData, int i) {
            this.mPlatformBuilder = new android.view.ContentInfo.Builder(clipData, i);
        }

        BuilderCompat31Impl(androidx.core.view.ContentInfoCompat contentInfoCompat) {
            this.mPlatformBuilder = new android.view.ContentInfo.Builder(contentInfoCompat.toContentInfo());
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(android.content.ClipData clipData) {
            this.mPlatformBuilder.setClip(clipData);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int i) {
            this.mPlatformBuilder.setSource(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i) {
            this.mPlatformBuilder.setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(android.net.Uri uri) {
            this.mPlatformBuilder.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(android.os.Bundle bundle) {
            this.mPlatformBuilder.setExtras(bundle);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public androidx.core.view.ContentInfoCompat build() {
            return new androidx.core.view.ContentInfoCompat(new androidx.core.view.ContentInfoCompat.Compat31Impl(this.mPlatformBuilder.build()));
        }
    }
}

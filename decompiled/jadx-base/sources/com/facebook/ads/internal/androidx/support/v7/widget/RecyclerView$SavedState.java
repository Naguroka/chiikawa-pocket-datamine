package com.facebook.ads.internal.androidx.support.v7.widget;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RecyclerView$SavedState extends com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState {
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState>() { // from class: com.facebook.ads.redexgen.X.4y
        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState createFromParcel(android.os.Parcel parcel) {
            return new com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState(parcel, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
        public final com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            return new com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState(parcel, classLoader);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState[] newArray(int i) {
            return new com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState[i];
        }
    };
    public android.os.Parcelable A00;

    public RecyclerView$SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readParcelable(classLoader == null ? com.facebook.ads.redexgen.core.AbstractC04344o.class.getClassLoader() : classLoader);
    }

    public RecyclerView$SavedState(android.os.Parcelable parcelable) {
        super(parcelable);
    }

    public final void A03(com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState recyclerView$SavedState) {
        this.A00 = recyclerView$SavedState.A00;
    }

    @Override // com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, 0);
    }
}
